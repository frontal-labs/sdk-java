package dev.frontal.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fasterxml.jackson.databind.JsonNode;
import dev.frontal.sdk.Frontal;
import dev.frontal.sdk.FunctionDefinition;
import dev.frontal.sdk.FunctionInvocationInput;
import dev.frontal.sdk.FunctionPermission;
import dev.frontal.sdk.FunctionRuntime;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.jupiter.api.Test;

class FunctionsQuickstartTest {
    @Test
    void definesAndInvokesAFunctionWithThePublicClient() throws Exception {
        try (MockWebServer mock = new MockWebServer()) {
            mock.start();
            mock.enqueue(new MockResponse()
                    .setBody("{\"id\":\"fn_123\",\"name\":\"hello\","
                            + "\"runtime\":\"nodejs22\",\"entrypoint\":\"index.handler\","
                            + "\"status\":\"active\",\"version\":1,\"createdAt\":\"2026-10-09T10:00:00Z\","
                            + "\"updatedAt\":\"2026-10-09T10:00:00Z\"}"));
            mock.enqueue(new MockResponse()
                    .setBody("{\"executionId\":\"exec_123\",\"result\":{\"message\":\"hello, Ada\"}}"));

            try (Frontal frontal = Frontal.builder()
                    .apiKey(System.getenv().getOrDefault("FRONTAL_API_KEY", "frt_example_key"))
                    .apiBaseUrl(mock.url("/v1").toString())
                    .requestTimeout(Duration.ofSeconds(5))
                    .maxRetries(0)
                    .build()) {
                FunctionDefinition definition = FunctionDefinition.builder("hello")
                        .description("Greets a person")
                        .runtime(FunctionRuntime.NODEJS22)
                        .entrypoint("index.handler")
                        .source("blob://functions/hello")
                        .dependencies(List.of("zod"))
                        .envVars(Map.of("GREETING", "hello"))
                        .permissions(new FunctionPermission(List.of(), List.of("read:name")))
                        .build();
                var created = frontal.functions().create(definition);
                JsonNode input =
                        frontal.apiClient().objectMapper().createObjectNode().put("name", "Ada");
                var invocation =
                        frontal.functions().executions().invoke(new FunctionInvocationInput(created.id(), input));

                assertEquals("fn_123", created.id());
                assertEquals("hello, Ada", invocation.result().path("message").asText());
            }
        }
    }
}
