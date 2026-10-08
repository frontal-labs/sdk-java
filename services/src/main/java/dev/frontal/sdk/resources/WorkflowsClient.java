package dev.frontal.sdk;

import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

/** Workflow definitions, executions, tasks, templates, and approvals. */
public final class WorkflowsClient extends ServiceClient {
    WorkflowsClient(ApiClient client) {
        super(ApiService.WORKFLOWS, client);
    }

    public <T> PageResult<T> list(Map<String, ?> query, Class<T> itemType) throws IOException, InterruptedException {
        return fetchPage(query, itemType);
    }

    public <T> @Nullable T get(String workflowId, Class<T> responseType) throws IOException, InterruptedException {
        return request(Endpoints.Workflows.GET_WORKFLOWS_PARAM, List.of(workflowId), responseType);
    }

    public <T> @Nullable T create(Object definition, Class<T> responseType) throws IOException, InterruptedException {
        return request(Endpoints.Workflows.POST_WORKFLOWS, List.of(), Map.of(), definition, responseType);
    }

    public <T> @Nullable T update(String workflowId, Object update, Class<T> responseType)
            throws IOException, InterruptedException {
        return request(Endpoints.Workflows.PATCH_WORKFLOWS_PARAM, List.of(workflowId), Map.of(), update, responseType);
    }

    public void delete(String workflowId) throws IOException, InterruptedException {
        requestBytes(Endpoints.Workflows.DELETE_WORKFLOWS_PARAM, List.of(workflowId), Map.of(), null);
    }

    public <T> @Nullable T createExecution(Object input, Class<T> responseType)
            throws IOException, InterruptedException {
        return request(Endpoints.Workflows.POST_WORKFLOWS_EXECUTIONS, List.of(), Map.of(), input, responseType);
    }

    public <T> @Nullable T execution(String executionId, Class<T> responseType)
            throws IOException, InterruptedException {
        return request(Endpoints.Workflows.GET_WORKFLOWS_EXECUTIONS_PARAM, List.of(executionId), responseType);
    }

    public JsonNode waitForCompletion(String executionId, Duration interval, Duration timeout) throws Exception {
        return Poller.pollUntil(
                () -> Objects.requireNonNull(execution(executionId, JsonNode.class), "Workflow response was empty"),
                result -> {
                    String status = result.path("status").asText("").toLowerCase(java.util.Locale.ROOT);
                    return List.of("completed", "succeeded", "failed", "cancelled", "rejected")
                            .contains(status);
                },
                interval,
                timeout);
    }

    public <T> @Nullable T approve(String approvalId, Object decision, Class<T> responseType)
            throws IOException, InterruptedException {
        return request(
                Endpoints.Workflows.POST_WORKFLOWS_APPROVALS_PARAM_APPROVE,
                List.of(approvalId),
                Map.of(),
                decision,
                responseType);
    }

    public <T> @Nullable T reject(String approvalId, Object decision, Class<T> responseType)
            throws IOException, InterruptedException {
        return request(
                Endpoints.Workflows.POST_WORKFLOWS_APPROVALS_PARAM_REJECT,
                List.of(approvalId),
                Map.of(),
                decision,
                responseType);
    }

    private <T> PageResult<T> fetchPage(Map<String, ?> options, Class<T> itemType)
            throws IOException, InterruptedException {
        Map<String, ?> query = options == null ? Map.of() : Map.copyOf(options);
        JsonNode response = Objects.requireNonNull(
                request(Endpoints.Workflows.GET_WORKFLOWS, List.of(), query, null, JsonNode.class),
                "Workflow list response was empty");
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
            Map<String, Object> nextQuery = new LinkedHashMap<>();
            query.forEach(nextQuery::put);
            nextQuery.put("cursor", next);
            return fetchPage(nextQuery, itemType);
        });
    }
}
