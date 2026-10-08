package dev.frontal.sdk;

import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Flow;
import org.jspecify.annotations.Nullable;

/** Agent definitions, executions, conversation history, and event streaming. */
public final class AgentsClient extends ServiceClient {
    AgentsClient(ApiClient client) {
        super(ApiService.AGENTS, client);
    }

    public <T> PageResult<T> list(Map<String, ?> query, Class<T> itemType) throws IOException, InterruptedException {
        return fetchPage(query, itemType);
    }

    public <T> @Nullable T get(String agentId, Class<T> responseType) throws IOException, InterruptedException {
        return request(Endpoints.Agents.GET_AGENTS_PARAM, List.of(agentId), responseType);
    }

    public <T> @Nullable T create(Object definition, Class<T> responseType) throws IOException, InterruptedException {
        return request(Endpoints.Agents.POST_AGENTS, List.of(), Map.of(), definition, responseType);
    }

    public <T> @Nullable T update(String agentId, Object update, Class<T> responseType)
            throws IOException, InterruptedException {
        return request(Endpoints.Agents.PUT_AGENTS_PARAM, List.of(agentId), Map.of(), update, responseType);
    }

    public void delete(String agentId) throws IOException, InterruptedException {
        requestBytes(Endpoints.Agents.DELETE_AGENTS_PARAM, List.of(agentId), Map.of(), null);
    }

    public <T> @Nullable T createRun(String agentId, Object input, Class<T> responseType)
            throws IOException, InterruptedException {
        return request(Endpoints.Agents.POST_AGENTS_PARAM_RUNS, List.of(agentId), Map.of(), input, responseType);
    }

    public <T> @Nullable T run(String runId, Class<T> responseType) throws IOException, InterruptedException {
        return request(Endpoints.Agents.GET_AGENTS_RUNS_PARAM, List.of(runId), responseType);
    }

    public <T> @Nullable T conversation(String runId, Class<T> responseType) throws IOException, InterruptedException {
        return request(Endpoints.Agents.GET_AGENTS_RUNS_PARAM_CONVERSATION, List.of(runId), responseType);
    }

    public <T> @Nullable T health(Class<T> responseType) throws IOException, InterruptedException {
        return request(Endpoints.Agents.GET_AGENTS_HEALTH, List.of(), responseType);
    }

    public Flow.Publisher<String> watch(String runId) {
        return streamPublisher(Endpoints.Agents.STREAM_AGENTS_RUNS_PARAM_STREAM, List.of(runId), Map.of());
    }

    public SseEventIterator watchBlocking(String runId) throws IOException, InterruptedException {
        return streamEvents(Endpoints.Agents.STREAM_AGENTS_RUNS_PARAM_STREAM, List.of(runId), Map.of());
    }

    public JsonNode waitForCompletion(String runId, Duration interval, Duration timeout) throws Exception {
        return Poller.pollUntil(
                () -> Objects.requireNonNull(run(runId, JsonNode.class), "Agent run response was empty"),
                result -> {
                    String status = result.path("status").asText("").toLowerCase(java.util.Locale.ROOT);
                    return List.of("completed", "succeeded", "failed", "cancelled", "rejected")
                            .contains(status);
                },
                interval,
                timeout);
    }

    private <T> PageResult<T> fetchPage(Map<String, ?> options, Class<T> itemType)
            throws IOException, InterruptedException {
        Map<String, ?> query = options == null ? Map.of() : Map.copyOf(options);
        JsonNode response = Objects.requireNonNull(
                request(Endpoints.Agents.GET_AGENTS, List.of(), query, null, JsonNode.class),
                "Agent list response was empty");
        JsonNode items = response.isArray() ? response : response.path("data");
        if (!items.isArray()) {
            items = response.path("agents");
        }
        List<T> data = new ArrayList<>();
        if (items.isArray()) {
            for (JsonNode item : items) {
                data.add(client().objectMapper().treeToValue(item, itemType));
            }
        }
        JsonNode metadata = response.path("pagination");
        String cursor =
                metadata.path("cursor").asText(response.path("nextPageToken").asText(""));
        boolean more =
                metadata.path("hasMore").asBoolean(metadata.path("has_more").asBoolean(!cursor.isBlank()));
        Long total = metadata.has("total") ? metadata.path("total").asLong() : null;
        return new PageResult<>(data, new Pagination(cursor, more, total), next -> {
            Map<String, Object> nextQuery = new LinkedHashMap<>();
            query.forEach(nextQuery::put);
            nextQuery.put("cursor", next);
            return fetchPage(nextQuery, itemType);
        });
    }
}
