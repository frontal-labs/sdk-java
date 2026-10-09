package dev.frontal.sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Flow;
import java.util.concurrent.TimeoutException;
import org.jspecify.annotations.Nullable;

/** Agent definitions, executions, conversation history, and event streaming. */
public final class AgentsClient extends AgentsServiceClient {
    AgentsClient(ApiClient client) {
        super(client);
    }

    public <T> PageResult<T> list(QueryParams query, Class<T> itemType) throws IOException, InterruptedException {
        return fetchPage(query, itemType);
    }

    public <T> @Nullable T get(String agentId, Class<T> responseType) throws IOException, InterruptedException {
        return request(Endpoints.Agents.GET_AGENTS_PARAM, List.of(agentId), responseType);
    }

    /**
     * Retrieves an agent run by its identifier.
     * @param <T> decoded response type
     * @param actionRunId identifier of the agent run
     * @param query query parameters supported by the operation
     * @param responseType class used to decode the response
     * @return the decoded response, or null when the response body is empty
     * @throws IOException if the operation fails
     * @throws InterruptedException if the operation is interrupted
     */
    @SdkOperation("agents|GET|/action-runs/{param}")
    public <T> @Nullable T getActionRun(String actionRunId, QueryParams query, Class<T> responseType)
            throws IOException, InterruptedException {
        return request(Endpoints.Agents.GET_ACTION_RUNS_PARAM, List.of(actionRunId), query, null, responseType);
    }

    /**
     * Retrieves an agent run using a generic response type.
     * @param <T> decoded response type
     * @param actionRunId identifier of the agent run
     * @param query query parameters supported by the operation
     * @param responseType type reference used to decode the response
     * @return the decoded response, or null when the response body is empty
     * @throws IOException if the operation fails
     * @throws InterruptedException if the operation is interrupted
     */
    public <T> @Nullable T getActionRun(String actionRunId, QueryParams query, TypeReference<T> responseType)
            throws IOException, InterruptedException {
        return request(Endpoints.Agents.GET_ACTION_RUNS_PARAM, List.of(actionRunId), query, null, responseType);
    }

    public <T> @Nullable T create(JsonNode definition, Class<T> responseType) throws IOException, InterruptedException {
        return request(Endpoints.Agents.POST_AGENTS, List.of(), QueryParams.empty(), definition, responseType);
    }

    public <T> @Nullable T update(String agentId, JsonNode update, Class<T> responseType)
            throws IOException, InterruptedException {
        return request(Endpoints.Agents.PUT_AGENTS_PARAM, List.of(agentId), QueryParams.empty(), update, responseType);
    }

    public void delete(String agentId) throws IOException, InterruptedException {
        requestBytes(Endpoints.Agents.DELETE_AGENTS_PARAM, List.of(agentId), QueryParams.empty(), null);
    }

    public <T> @Nullable T createRun(String agentId, JsonNode input, Class<T> responseType)
            throws IOException, InterruptedException {
        return request(
                Endpoints.Agents.POST_AGENTS_PARAM_RUNS, List.of(agentId), QueryParams.empty(), input, responseType);
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
        return streamPublisher(Endpoints.Agents.STREAM_AGENTS_RUNS_PARAM_STREAM, List.of(runId), QueryParams.empty());
    }

    public SseEventIterator watchBlocking(String runId) throws IOException, InterruptedException {
        return streamEvents(Endpoints.Agents.STREAM_AGENTS_RUNS_PARAM_STREAM, List.of(runId), QueryParams.empty());
    }

    public JsonNode waitForCompletion(String runId, Duration interval, Duration timeout)
            throws IOException, InterruptedException, TimeoutException {
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

    private <T> PageResult<T> fetchPage(QueryParams options, Class<T> itemType)
            throws IOException, InterruptedException {
        QueryParams query = Objects.requireNonNull(options, "query");
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
            QueryParams.Builder nextQuery = QueryParams.builder();
            query.values().forEach((name, values) -> values.forEach(value -> nextQuery.add(name, value)));
            return fetchPage(nextQuery.add("cursor", next).build(), itemType);
        });
    }
}
