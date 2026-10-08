package dev.frontal.sdk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.Test;

class ContractCoverageTest {
    private static final ObjectMapper JSON = new ObjectMapper();
    private static final Path CONTRACTS = Path.of("../contracts");

    @Test
    void everyInventoryRouteHasExactlyOnePublicEndpointConstant() throws Exception {
        JsonNode inventory = read(CONTRACTS.resolve("sdk-endpoints.json"));
        Map<String, Integer> expected = new HashMap<>();
        inventory.fields().forEachRemaining(service -> {
            for (JsonNode route : service.getValue()) {
                expected.merge(
                        key(
                                service.getKey(),
                                route.path("method").asText(),
                                route.path("path").asText()),
                        1,
                        Integer::sum);
            }
        });

        Map<String, Integer> actual = new HashMap<>();
        for (Class<?> group : Endpoints.class.getDeclaredClasses()) {
            for (Field field : group.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && field.getType() == Endpoint.class) {
                    Endpoint endpoint = (Endpoint) field.get(null);
                    actual.merge(
                            key(endpoint.service().value(), endpoint.method().name(), endpoint.path()),
                            1,
                            Integer::sum);
                }
            }
        }
        assertEquals(expected, actual, "Route inventory and Java endpoint constants drifted");
    }

    @Test
    void everyAiOpenApiOperationMapsToAnAiEndpoint() throws Exception {
        JsonNode spec = read(CONTRACTS.resolve("openapi/ai.openapi.generated.json"));
        Set<String> endpoints = new HashSet<>();
        JsonNode inventory = read(CONTRACTS.resolve("sdk-endpoints.json")).path("ai");
        for (JsonNode route : inventory) {
            endpoints.add(
                    route.path("method").asText() + " " + route.path("path").asText());
        }
        int operationCount = 0;
        for (var paths = spec.path("paths").fields(); paths.hasNext(); ) {
            var path = paths.next();
            for (var methods = path.getValue().fields(); methods.hasNext(); ) {
                var operation = methods.next();
                String method = operation.getKey().toUpperCase(java.util.Locale.ROOT);
                if (!Set.of("GET", "POST", "PUT", "PATCH", "DELETE", "HEAD", "OPTIONS")
                        .contains(method)) {
                    continue;
                }
                operationCount++;
                assertTrue(
                        endpoints.contains(method + " " + path.getKey()),
                        () -> "No AI endpoint for OpenAPI operation " + method + " " + path.getKey());
            }
        }
        assertEquals(7, operationCount);
    }

    @Test
    void publicApiSnapshotOperationsRemainIdentifiedAndReadable() throws Exception {
        JsonNode spec = read(CONTRACTS.resolve("openapi/api.openapi.json"));
        Set<String> operationIds = new HashSet<>();
        Set<String> endpointRoutes = new HashSet<>();
        for (Class<?> group : Endpoints.class.getDeclaredClasses()) {
            for (Field field : group.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && field.getType() == Endpoint.class) {
                    Endpoint endpoint = (Endpoint) field.get(null);
                    endpointRoutes.add(
                            key(endpoint.service().value(), endpoint.method().name(), endpoint.path()));
                }
            }
        }
        for (var paths = spec.path("paths").fields(); paths.hasNext(); ) {
            var path = paths.next();
            for (var methods = path.getValue().fields(); methods.hasNext(); ) {
                var operation = methods.next();
                String method = operation.getKey().toUpperCase(java.util.Locale.ROOT);
                if (!Set.of("GET", "POST", "PUT", "PATCH", "DELETE", "HEAD", "OPTIONS")
                        .contains(method)) {
                    continue;
                }
                String operationId = operation.getValue().path("operationId").asText();
                assertFalse(operationId.isBlank(), "OpenAPI operation is missing its operationId");
                assertTrue(operationIds.add(operationId), "Duplicate OpenAPI operationId: " + operationId);
                String service = operation.getValue().path("tags").path(0).asText();
                assertTrue(
                        endpointRoutes.contains(key(service, method, normalizePublicPath(path.getKey()))),
                        () -> "No Java endpoint for OpenAPI operation " + method + " " + path.getKey());
            }
        }
    }

    private static JsonNode read(Path path) throws IOException {
        assertTrue(Files.isRegularFile(path), "Missing contract file: " + path);
        return JSON.readTree(Files.readAllBytes(path));
    }

    private static String key(String service, String method, String path) {
        return service + "|" + method + "|" + path;
    }

    private static String normalizePublicPath(String path) {
        String normalized = path.startsWith("/v1/") ? path.substring(3) : path;
        return normalized.replaceAll("\\{[^{}]+}", "{param}");
    }
}
