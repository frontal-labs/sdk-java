package dev.frontal.sdk;

import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/** Workflow definitions, executions, tasks, templates, and approvals. */
public final class WorkflowsClient extends WorkflowsServiceClient {
    WorkflowsClient(ApiClient client) {
        super(client);
    }

    /** Fetches the first page of workflows and exposes lazy page traversal. */
    public <T> PageResult<T> listPages(QueryParams query, Class<T> itemType) throws IOException, InterruptedException {
        return fetchPage(Objects.requireNonNull(query, "query"), Objects.requireNonNull(itemType, "itemType"));
    }

    /** Waits until an execution reaches a terminal status or the timeout expires. */
    public JsonNode waitForCompletion(String executionId, Duration interval, Duration timeout)
            throws IOException, InterruptedException, TimeoutException {
        return Poller.pollUntil(
                () -> Objects.requireNonNull(
                        executions().get(executionId, JsonNode.class), "Workflow response was empty"),
                result -> {
                    String status = result.path("status").asText("").toLowerCase(java.util.Locale.ROOT);
                    return List.of("completed", "succeeded", "failed", "cancelled", "rejected")
                            .contains(status);
                },
                interval,
                timeout);
    }

    private <T> PageResult<T> fetchPage(QueryParams query, Class<T> itemType) throws IOException, InterruptedException {
        JsonNode response = Objects.requireNonNull(list(query, JsonNode.class), "Workflow list response was empty");
        JsonNode items = response.path("data");
        if (!items.isArray()) {
            items = response.path("workflows");
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
