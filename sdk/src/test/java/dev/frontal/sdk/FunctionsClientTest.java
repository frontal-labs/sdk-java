package dev.frontal.sdk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FunctionsClientTest {
    private static final ObjectMapper JSON = new ObjectMapper();
    private static final String FUNCTION = "{\"id\":\"fn_1\",\"name\":\"calculate\",\"runtime\":\"nodejs22\","
            + "\"entrypoint\":\"index.handler\",\"status\":\"active\",\"version\":1,"
            + "\"createdAt\":\"2026-10-09T10:00:00Z\",\"updatedAt\":\"2026-10-09T10:00:00Z\"}";

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
    void exposesAllFunctionsRoutesWithExpectedMethodsAndBearerAuthentication() throws Exception {
        enqueue(FUNCTION);
        enqueue("{\"functions\":[],\"pagination\":{\"hasMore\":false}}");
        enqueue(FUNCTION);
        enqueue(FUNCTION);
        enqueue("");
        enqueue("{\"versions\":[],\"pagination\":{\"cursor\":\"v1\",\"hasMore\":true}}");
        enqueue("{\"version\":1,\"source\":\"blob://fn/1\",\"createdAt\":\"2026-10-09T10:00:00Z\"}");
        enqueue("{\"version\":1,\"source\":\"blob://fn/1\",\"createdAt\":\"2026-10-09T10:00:00Z\"}");
        enqueue("");
        enqueue("{\"status\":\"ready\",\"details\":{\"region\":\"eu\"}}");
        enqueue("{\"executionId\":\"exec_1\",\"result\":{\"ok\":true}}");
        enqueue("{\"executionId\":\"exec_2\"}");
        enqueue("{\"id\":\"exec_1\",\"functionId\":\"fn_1\",\"version\":1,\"status\":\"active\"}");
        enqueue("{\"executionId\":\"exec_1\",\"result\":{\"ok\":true}}");
        enqueue("{\"executions\":[],\"pagination\":{\"hasMore\":false}}");
        enqueue("");

        try (Frontal frontal = client()) {
            FunctionDefinition definition = definition(JSON.createObjectNode().put("type", "object"));
            frontal.functions().create(definition);
            frontal.functions()
                    .list(QueryParams.builder()
                            .add("cursor", "c 1")
                            .add("limit", 10)
                            .build());
            frontal.functions().get("fn_1");
            frontal.functions().update("fn_1", definition);
            frontal.functions().delete("fn_1");
            frontal.functions().versions().list("fn_1", QueryParams.of("limit", "5"));
            frontal.functions().versions().get("fn_1", 1);
            frontal.functions().versions().publish("fn_1", 1);
            frontal.functions().deployments().deploy("fn_1", 1);
            assertEquals(
                    "ready", frontal.functions().deployments().status("fn_1", 1).status());
            frontal.functions().executions().invoke(new FunctionInvocationInput("fn_1"));
            frontal.functions().executions().invokeAsync(new FunctionInvocationInput("fn_1"));
            frontal.functions().executions().getExecution("exec_1");
            frontal.functions().executions().getResult("exec_1");
            frontal.functions()
                    .executions()
                    .listExecutions(QueryParams.builder()
                            .add("cursor", "c1")
                            .add("limit", 20)
                            .add("functionId", "fn_1")
                            .add("status", "active")
                            .build());
            frontal.functions().executions().cancelExecution("exec_1");
        }

        List<String> expected = List.of(
                "POST /v1/functions",
                "GET /v1/functions?cursor=c%201&limit=10",
                "GET /v1/functions/fn_1",
                "PATCH /v1/functions/fn_1",
                "DELETE /v1/functions/fn_1",
                "GET /v1/functions/fn_1/versions?limit=5",
                "GET /v1/functions/fn_1/versions/1",
                "POST /v1/functions/fn_1/versions/1/publish",
                "POST /v1/functions/fn_1/versions/1/deploy",
                "GET /v1/functions/fn_1/versions/1/deployment/status",
                "POST /v1/functions/invoke",
                "POST /v1/functions/invoke-async",
                "GET /v1/functions/executions/exec_1",
                "GET /v1/functions/executions/exec_1/result",
                "GET /v1/functions/executions?cursor=c1&limit=20&functionId=fn_1&status=active",
                "POST /v1/functions/executions/exec_1/cancel");
        for (String route : expected) {
            RecordedRequest request = server.takeRequest(1, TimeUnit.SECONDS);
            assertNotNull(request);
            assertEquals(route.split(" ", 2)[0], request.getMethod());
            assertEquals(route.split(" ", 2)[1], request.getPath());
            assertEquals("Bearer frt_test_key", request.getHeader("Authorization"));
        }
    }

    @Test
    void serializesCamelCaseDefinitionFieldsAndPreservesNestedJsonKeys() throws Exception {
        enqueue(FUNCTION);
        JsonNode schema = JSON.readTree("{\"type\":\"object\",\"properties\":{\"camelCase\":{\"type\":\"string\"}}}");
        FunctionDefinition definition = FunctionDefinition.builder("calculate")
                .description("Calculates a value")
                .runtime(FunctionRuntime.NODEJS22)
                .entrypoint("index.handler")
                .inputSchema(schema)
                .envVars(Map.of("MODE_NAME", "test"))
                .permissions(new FunctionPermission(List.of("entities"), List.of("read:data")))
                .build();

        try (Frontal frontal = client()) {
            FunctionResource result = frontal.functions().create(definition);
            assertEquals(FunctionRuntime.NODEJS22, result.runtime());
            RecordedRequest request = server.takeRequest(1, TimeUnit.SECONDS);
            JsonNode body = JSON.readTree(request.getBody().readUtf8());
            assertEquals("nodejs22", body.path("runtime").asText());
            assertTrue(body.has("inputSchema"));
            assertEquals(
                    "string",
                    body.path("inputSchema")
                            .path("properties")
                            .path("camelCase")
                            .path("type")
                            .asText());
            assertEquals("test", body.path("envVars").path("MODE_NAME").asText());
            assertEquals(
                    "read:data", body.path("permissions").path("actions").get(0).asText());
            assertTrue(!body.has("input_schema"));
            assertTrue(!body.has("env_vars"));
            assertTrue(!body.has("source"));
        }
    }

    @Test
    void serializesArbitraryInvocationJsonAndDecodesNestedResultWithoutRenamingKeys() throws Exception {
        enqueue("{\"executionId\":\"exec_1\",\"result\":{\"camelCase\":{\"user-key\":[1,{\"keepMe\":true}]}}}");
        JsonNode input = JSON.readTree("{\"camelCase\":{\"user-key\":[1,{\"keepMe\":true}]}}");
        try (Frontal frontal = client()) {
            FunctionInvocationResult response =
                    frontal.functions().executions().invoke(new FunctionInvocationInput("fn_1", 2, input));
            assertEquals("exec_1", response.executionId());
            assertEquals(input, response.result());
            RecordedRequest request = server.takeRequest(1, TimeUnit.SECONDS);
            JsonNode body = JSON.readTree(request.getBody().readUtf8());
            assertEquals("fn_1", body.path("functionId").asText());
            assertEquals(2, body.path("version").asInt());
            assertEquals(input, body.path("input"));
            assertTrue(body.has("functionId"));
            assertTrue(!body.has("function_id"));
        }
    }

    @Test
    void ignoresAdditionalPropertiesInResourceListAndNestedPermissionResponses() throws Exception {
        enqueue("{\"id\":\"fn_1\",\"name\":\"calculate\",\"runtime\":\"nodejs22\","
                + "\"entrypoint\":\"index.handler\",\"status\":\"active\",\"version\":1,"
                + "\"permissions\":{\"actions\":[\"read\"],\"futurePermissionField\":true},"
                + "\"futureResourceField\":{\"enabled\":true},"
                + "\"createdAt\":\"2026-10-09T10:00:00Z\",\"updatedAt\":\"2026-10-09T10:00:00Z\"}");
        enqueue("{\"functions\":[" + FUNCTION.substring(0, FUNCTION.length() - 1)
                + ",\"futureResourceField\":true}],\"pagination\":{\"hasMore\":false,"
                + "\"futurePaginationField\":\"ignored\"},\"futureEnvelopeField\":1}");

        try (Frontal frontal = client()) {
            FunctionResource function = frontal.functions().get("fn_1");
            FunctionListResponse response = frontal.functions().list();
            assertEquals("fn_1", function.id());
            FunctionPermission permissions = Objects.requireNonNull(function.permissions());
            assertEquals(List.of("read"), permissions.actions());
            assertEquals("fn_1", response.functions().get(0).id());
            assertEquals(false, response.pagination().hasMore());
        }
    }

    @Test
    void encodesReservedPathIdsAsOnePathSegment() throws Exception {
        enqueue(FUNCTION);
        try (Frontal frontal = client()) {
            frontal.functions().get("fn/a b");
            RecordedRequest request = server.takeRequest(1, TimeUnit.SECONDS);
            assertEquals("/v1/functions/fn%2Fa%20b", request.getRequestUrl().encodedPath());
        }
    }

    @Test
    void mapsValidationErrorsThroughTheSharedExceptionHierarchy() {
        enqueue(new MockResponse()
                .setResponseCode(422)
                .addHeader("x-request-id", "req_fn_1")
                .setBody("{\"error\":{\"code\":\"INVALID_FUNCTION\",\"message\":\"runtime is required\"}}"));
        try (Frontal frontal = client()) {
            ValidationException exception = assertThrows(
                    ValidationException.class,
                    () -> frontal.functions()
                            .create(FunctionDefinition.builder("calculate")
                                    .runtime(FunctionRuntime.PYTHON311)
                                    .entrypoint("main.handler")
                                    .build()));
            assertEquals("INVALID_FUNCTION", exception.code());
            assertEquals("req_fn_1", exception.requestId());
        }
    }

    @Test
    void retriesFunctionGetAccordingToExplicitSharedConfiguration() throws Exception {
        enqueue(new MockResponse().setResponseCode(503).setBody("temporary"));
        enqueue(FUNCTION);
        try (Frontal frontal = Frontal.builder()
                .apiKey("frt_test_key")
                .apiBaseUrl(server.url("/v1").toString())
                .requestTimeout(Duration.ofSeconds(3))
                .maxRetries(1)
                .build()) {
            assertEquals("fn_1", frontal.functions().get("fn_1").id());
            assertEquals(2, server.getRequestCount());
        }
    }

    @Test
    void usesThreeRetriesForFunctionsByDefault() throws Exception {
        enqueue(new MockResponse()
                .setResponseCode(503)
                .addHeader("Retry-After", "0")
                .setBody("temporary"));
        enqueue(new MockResponse()
                .setResponseCode(503)
                .addHeader("Retry-After", "0")
                .setBody("temporary"));
        enqueue(new MockResponse()
                .setResponseCode(503)
                .addHeader("Retry-After", "0")
                .setBody("temporary"));
        enqueue(FUNCTION);
        try (Frontal frontal = Frontal.builder()
                .apiKey("frt_test_key")
                .apiBaseUrl(server.url("/v1").toString())
                .build()) {
            assertEquals("fn_1", frontal.functions().get("fn_1").id());
            assertEquals(4, server.getRequestCount());
        }
    }

    private Frontal client() {
        return Frontal.builder()
                .apiKey("frt_test_key")
                .apiBaseUrl(server.url("/v1").toString())
                .requestTimeout(Duration.ofSeconds(3))
                .maxRetries(0)
                .build();
    }

    private FunctionDefinition definition(JsonNode schema) {
        return FunctionDefinition.builder("calculate")
                .runtime(FunctionRuntime.NODEJS22)
                .entrypoint("index.handler")
                .inputSchema(schema)
                .build();
    }

    private void enqueue(String body) {
        enqueue(new MockResponse().setBody(body));
    }

    private void enqueue(MockResponse response) {
        server.enqueue(response);
    }
}
