package dev.frontal.sdk;

import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import org.jspecify.annotations.Nullable;

/** Workflow definitions, executions, tasks, templates, and approvals. */
public final class WorkflowsClient extends WorkflowsServiceClient {
    WorkflowsClient(ApiClient client) {
        super(client);
    }

    public <T> PageResult<T> list(QueryParams query, Class<T> itemType) throws IOException, InterruptedException {
        return fetchPage(query, itemType);
    }

    public <T> @Nullable T get(String workflowId, Class<T> responseType) throws IOException, InterruptedException {
        return request(Endpoints.Workflows.GET_WORKFLOWS_PARAM, List.of(workflowId), responseType);
    }

    public <T> @Nullable T create(JsonNode definition, Class<T> responseType) throws IOException, InterruptedException {
        return request(Endpoints.Workflows.POST_WORKFLOWS, List.of(), QueryParams.empty(), definition, responseType);
    }

    public <T> @Nullable T update(String workflowId, JsonNode update, Class<T> responseType)
            throws IOException, InterruptedException {
        return request(
                Endpoints.Workflows.PATCH_WORKFLOWS_PARAM,
                List.of(workflowId),
                QueryParams.empty(),
                update,
                responseType);
    }

    public void delete(String workflowId) throws IOException, InterruptedException {
        requestBytes(Endpoints.Workflows.DELETE_WORKFLOWS_PARAM, List.of(workflowId), QueryParams.empty(), null);
    }

    public <T> @Nullable T createExecution(JsonNode input, Class<T> responseType)
            throws IOException, InterruptedException {
        return request(
                Endpoints.Workflows.POST_WORKFLOWS_EXECUTIONS, List.of(), QueryParams.empty(), input, responseType);
    }

    public <T> @Nullable T execution(String executionId, Class<T> responseType)
            throws IOException, InterruptedException {
        return request(Endpoints.Workflows.GET_WORKFLOWS_EXECUTIONS_PARAM, List.of(executionId), responseType);
    }

    public JsonNode waitForCompletion(String executionId, Duration interval, Duration timeout)
            throws IOException, InterruptedException, TimeoutException {
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

    public <T> @Nullable T approve(String approvalId, JsonNode decision, Class<T> responseType)
            throws IOException, InterruptedException {
        return request(
                Endpoints.Workflows.POST_WORKFLOWS_APPROVALS_PARAM_APPROVE,
                List.of(approvalId),
                QueryParams.empty(),
                decision,
                responseType);
    }

    public <T> @Nullable T reject(String approvalId, JsonNode decision, Class<T> responseType)
            throws IOException, InterruptedException {
        return request(
                Endpoints.Workflows.POST_WORKFLOWS_APPROVALS_PARAM_REJECT,
                List.of(approvalId),
                QueryParams.empty(),
                decision,
                responseType);
    }

    private <T> PageResult<T> fetchPage(QueryParams options, Class<T> itemType)
            throws IOException, InterruptedException {
        QueryParams query = Objects.requireNonNull(options, "query");
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
            QueryParams.Builder nextQuery = QueryParams.builder();
            query.values().forEach((name, values) -> values.forEach(value -> nextQuery.add(name, value)));
            return fetchPage(nextQuery.add("cursor", next).build(), itemType);
        });
    }
}
