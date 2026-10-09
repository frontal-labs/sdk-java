package dev.frontal.sdk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Flow;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ApiClientTest {
    private static final ObjectMapper JSON = new ObjectMapper();

    private MockWebServer server;

    @BeforeEach
    void startServer() throws Exception {
        server = new MockWebServer();
        server.start();
    }

    @AfterEach
    void stopServer() throws Exception {
        server.shutdown();
    }

    @Test
    void sendsBearerKeyAndRequestIdAndDecodesResponse() throws Exception {
        server.enqueue(new MockResponse().setBody("{\"id\":\"agt_1\",\"name\":\"triage\"}"));
        try (Frontal client = client(0)) {
            JsonNode response = Objects.requireNonNull(client.agents().get("agt_1", JsonNode.class));
            RecordedRequest request = server.takeRequest(1, TimeUnit.SECONDS);
            assertEquals("triage", response.path("name").asText());
            assertEquals("Bearer frt_test_key", request.getHeader("Authorization"));
            assertNotNull(request.getHeader("X-Request-Id"));
            assertEquals("GET", request.getMethod());
            assertEquals("/v1/agents/agt_1", request.getPath());
        }
    }

    @Test
    void retriesSafeGetOnServerFailure() throws Exception {
        server.enqueue(new MockResponse().setResponseCode(503).setBody("temporarily unavailable"));
        server.enqueue(new MockResponse().setBody("{\"status\":\"ok\"}"));
        try (Frontal client = client(1)) {
            JsonNode response = Objects.requireNonNull(client.agents().health(JsonNode.class));
            assertEquals("ok", response.path("status").asText());
            assertEquals(2, server.getRequestCount());
        }
    }

    @Test
    void streamBodyRetriesSafeGetBeforeReturningTheBody() throws Exception {
        server.enqueue(new MockResponse().setResponseCode(503).setBody("temporary"));
        server.enqueue(new MockResponse().setBody("large response"));
        try (Frontal client = client(1);
                ApiStream response = client.agents()
                        .streamBody(
                                Endpoints.Agents.GET_AGENTS_HEALTH, java.util.List.of(), QueryParams.empty(), null)) {
            assertEquals("large response", new String(response.body().readAllBytes(), StandardCharsets.UTF_8));
            assertEquals(2, server.getRequestCount());
        }
    }

    @Test
    void errorDiagnosticBodyIsBoundedAndMarksTruncation() {
        server.enqueue(new MockResponse().setResponseCode(418).setBody("0123456789abcdef"));
        try (Frontal client = Frontal.builder()
                .apiKey("frt_test_key")
                .apiBaseUrl(server.url("/v1").toString())
                .maxRetries(0)
                .maxErrorBodyBytes(8)
                .build()) {
            ApiException error = org.junit.jupiter.api.Assertions.assertThrows(
                    ApiException.class, () -> client.agents().health(JsonNode.class));
            assertEquals("01234567", error.responseBody());
            assertTrue(error.responseBodyTruncated());
        }
    }

    @Test
    void generatedNamedServiceMethodUsesExactQueryWireNames() throws Exception {
        server.enqueue(new MockResponse().setBody("{\"data\":[]}"));
        try (Frontal client = client(0)) {
            client.agents().getAgents(QueryParams.of("agentId", "agt_1"), JsonNode.class);
            RecordedRequest request = server.takeRequest(1, TimeUnit.SECONDS);
            assertEquals("agt_1", request.getRequestUrl().queryParameter("agentId"));
            assertNull(request.getRequestUrl().queryParameter("agent_id"));
        }
    }

    @Test
    void requestMapKeysRemainVerbatimOnTheJsonWire() throws Exception {
        server.enqueue(new MockResponse().setBody("{}"));
        try (Frontal client = client(0)) {
            client.agents().create(JSON.valueToTree(Map.of("agentId", "agt_1")), JsonNode.class);
            RecordedRequest request = server.takeRequest(1, TimeUnit.SECONDS);
            assertEquals("{\"agentId\":\"agt_1\"}", request.getBody().readUtf8());
        }
    }

    @Test
    void customObjectMapperIsCopiedAndHonorsItsNamingStrategy() throws Exception {
        server.enqueue(new MockResponse().setBody("{\"agent-id\":\"agt_1\"}"));
        ObjectMapper mapper = new ObjectMapper().setPropertyNamingStrategy(PropertyNamingStrategies.KEBAB_CASE);
        try (Frontal client = Frontal.builder()
                .apiKey("frt_test_key")
                .apiBaseUrl(server.url("/v1").toString())
                .objectMapper(mapper)
                .maxRetries(0)
                .build()) {
            mapper.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
            CamelRequest response = Objects.requireNonNull(client.agents().health(CamelRequest.class));
            assertEquals("agt_1", response.agentId());
        }
    }

    @Test
    void veryLargeRetryAfterIsExposedWithoutMillisecondOverflow() {
        server.enqueue(new MockResponse().setResponseCode(429).addHeader("Retry-After", Long.MAX_VALUE + ""));
        try (Frontal client = client(0)) {
            RateLimitException error = org.junit.jupiter.api.Assertions.assertThrows(
                    RateLimitException.class, () -> client.agents().health(JsonNode.class));
            assertEquals(Long.MAX_VALUE, error.retryAfter().toSeconds());
        }
    }

    @Test
    void doesNotRetryNonretryableServerStatus() {
        server.enqueue(new MockResponse().setResponseCode(501).setBody("not implemented"));
        try (Frontal client = client(3)) {
            ServerException error = org.junit.jupiter.api.Assertions.assertThrows(
                    ServerException.class, () -> client.agents().health(JsonNode.class));
            assertFalse(error.retryable());
            assertEquals(1, server.getRequestCount());
        }
    }

    @Test
    void mapsAuthenticationErrorsWithServerRequestId() {
        server.enqueue(new MockResponse()
                .setResponseCode(401)
                .addHeader("x-request-id", "req_123")
                .setBody("{\"error\":{\"code\":\"INVALID_API_KEY\",\"message\":\"bad key\"}}"));
        try (Frontal client = client(0)) {
            AuthException error = org.junit.jupiter.api.Assertions.assertThrows(
                    AuthException.class, () -> client.agents().health(JsonNode.class));
            assertEquals(401, error.statusCode());
            assertEquals("INVALID_API_KEY", error.code());
            assertEquals("req_123", error.requestId());
            assertFalse(error.retryable());
        }
    }

    @Test
    void mapsValidationAndRateLimitErrors() {
        server.enqueue(new MockResponse()
                .setResponseCode(422)
                .setBody("{\"error\":{\"code\":\"INVALID_AGENT\",\"message\":\"name is required\"}}"));
        server.enqueue(new MockResponse()
                .setResponseCode(429)
                .addHeader("Retry-After", "2")
                .setBody("{\"error\":{\"code\":\"RATE_LIMITED\",\"message\":\"slow down\"}}"));
        try (Frontal client = client(0)) {
            ValidationException validation = org.junit.jupiter.api.Assertions.assertThrows(
                    ValidationException.class,
                    () -> client.agents().create(JSON.valueToTree(Map.of("name", "triage")), JsonNode.class));
            assertEquals("INVALID_AGENT", validation.code());
            assertEquals(422, validation.statusCode());

            RateLimitException rateLimit = org.junit.jupiter.api.Assertions.assertThrows(
                    RateLimitException.class,
                    () -> client.agents().create(JSON.valueToTree(Map.of("name", "triage")), JsonNode.class));
            assertEquals("RATE_LIMITED", rateLimit.code());
            assertEquals(Duration.ofSeconds(2), rateLimit.retryAfter());
            assertTrue(rateLimit.retryable());
        }
    }

    @Test
    void listPagesLoadLazilyAndKeepQueryOptions() throws Exception {
        server.enqueue(new MockResponse()
                .setBody("{\"data\":[{\"id\":\"agt_1\"}],\"pagination\":{\"cursor\":\"c1\",\"hasMore\":true}}"));
        server.enqueue(new MockResponse()
                .setBody("{\"data\":[{\"id\":\"agt_2\"}],\"pagination\":{\"cursor\":\"\",\"hasMore\":false}}"));
        try (Frontal client = client(0)) {
            PageResult<JsonNode> first =
                    client.agents().list(QueryParams.builder().add("limit", 1).build(), JsonNode.class);
            PageResult<JsonNode> second = Objects.requireNonNull(first.nextPage());
            assertEquals("agt_1", first.data().get(0).path("id").asText());
            assertEquals("agt_2", second.data().get(0).path("id").asText());
            RecordedRequest firstRequest = server.takeRequest();
            RecordedRequest secondRequest = server.takeRequest();
            assertEquals("1", firstRequest.getRequestUrl().queryParameter("limit"));
            assertEquals("1", secondRequest.getRequestUrl().queryParameter("limit"));
            assertEquals("c1", secondRequest.getRequestUrl().queryParameter("cursor"));
        }
    }

    @Test
    void blockingStreamIteratorParsesMultilineSseDataAndCloses() throws Exception {
        server.enqueue(new MockResponse()
                .addHeader("Content-Type", "text/event-stream")
                .setBody("event: state\ndata: {\"step\":\ndata: 2}\n\ndata: done\n\n"));
        try (Frontal client = client(0);
                SseEventIterator events = client.agents().watchBlocking("run_1")) {
            assertEquals("{\"step\":\n2}", events.next());
            assertEquals("done", events.next());
            assertFalse(events.hasNext());
        }
    }

    @Test
    void publisherHonorsDemandAndCompletes() throws Exception {
        server.enqueue(new MockResponse()
                .addHeader("Content-Type", "text/event-stream")
                .setBody("data: one\n\ndata: two\n\n"));
        try (Frontal client = client(0)) {
            CountDownLatch complete = new CountDownLatch(1);
            AtomicReference<String> received = new AtomicReference<>();
            client.agents().watch("run_2").subscribe(new Flow.Subscriber<>() {
                @Override
                public void onSubscribe(Flow.Subscription value) {
                    value.request(2);
                }

                @Override
                public void onNext(String item) {
                    received.updateAndGet(current -> current == null ? item : current + "," + item);
                }

                @Override
                public void onError(Throwable throwable) {
                    complete.countDown();
                }

                @Override
                public void onComplete() {
                    complete.countDown();
                }
            });
            assertTrue(complete.await(2, TimeUnit.SECONDS));
            assertEquals("one,two", received.get());
        }
    }

    @Test
    void publisherCompletesWhenFinalEventEndsAtEofWithoutDelimiter() throws Exception {
        server.enqueue(new MockResponse()
                .addHeader("Content-Type", "text/event-stream")
                .setBody("data: done"));
        try (Frontal client = client(0)) {
            CountDownLatch complete = new CountDownLatch(1);
            AtomicReference<String> received = new AtomicReference<>();
            client.agents().watch("run_eof").subscribe(new Flow.Subscriber<>() {
                @Override
                public void onSubscribe(Flow.Subscription value) {
                    value.request(1);
                }

                @Override
                public void onNext(String item) {
                    received.set(item);
                }

                @Override
                public void onError(Throwable throwable) {
                    complete.countDown();
                }

                @Override
                public void onComplete() {
                    complete.countDown();
                }
            });
            assertTrue(complete.await(2, TimeUnit.SECONDS));
            assertEquals("done", received.get());
        }
    }

    @Test
    void publisherCancellationReachesAnOpeningStream() throws Exception {
        CountDownLatch opening = new CountDownLatch(1);
        CountDownLatch cancelled = new CountDownLatch(1);
        CountDownLatch opened = new CountDownLatch(1);
        AtomicReference<Flow.Subscription> subscription = new AtomicReference<>();
        SseEventPublisher publisher = SseEventPublisher.cancellable(() -> new SseEventPublisher.StreamSource() {
            @Override
            public SseEventIterator open() throws Exception {
                opening.countDown();
                try {
                    cancelled.await();
                    return new SseEventIterator(new ApiStream(200, Map.of(), InputStream.nullInputStream()));
                } finally {
                    opened.countDown();
                }
            }

            @Override
            public void cancel() {
                cancelled.countDown();
            }
        });
        publisher.subscribe(new Flow.Subscriber<>() {
            @Override
            public void onSubscribe(Flow.Subscription value) {
                subscription.set(value);
                value.request(1);
            }

            @Override
            public void onNext(String item) {}

            @Override
            public void onError(Throwable throwable) {}

            @Override
            public void onComplete() {}
        });

        assertTrue(opening.await(1, TimeUnit.SECONDS));
        Objects.requireNonNull(subscription.get()).cancel();
        assertTrue(cancelled.await(1, TimeUnit.SECONDS));
        assertTrue(opened.await(1, TimeUnit.SECONDS));
    }

    private Frontal client(int retries) {
        return Frontal.builder()
                .apiKey("frt_test_key")
                .apiBaseUrl(server.url("/v1").toString())
                .requestTimeout(Duration.ofSeconds(2))
                .maxRetries(retries)
                .build();
    }

    private record CamelRequest(String agentId) {}
}
