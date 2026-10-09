# Workflows API

Service accessor: `frontal.workflows()` (`WorkflowsServiceClient`).

Operations are grouped by resource path. Collection methods use `list` and `create`; item methods use `get`, `update`, and `delete`. Calls can omit `QueryParams` when no query values are needed. Use contract-defined `JsonNode` bodies and caller-selected response types where schemas are not available.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `workflows().delete(...)` | `DELETE` | `/workflows/{param}` | `String workflowId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `workflows().delete(...)` | `DELETE` | `/workflows/{param}` | `String workflowId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().delete(...)` | `DELETE` | `/workflows/{param}` | `String workflowId, Class<T> responseType` | `@Nullable T` |
| `workflows().delete(...)` | `DELETE` | `/workflows/{param}` | `String workflowId, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().list(...)` | `GET` | `/workflows` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `workflows().list(...)` | `GET` | `/workflows` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().list(...)` | `GET` | `/workflows` | `Class<T> responseType` | `@Nullable T` |
| `workflows().list(...)` | `GET` | `/workflows` | `TypeReference<T> responseType` | `@Nullable T` |
| `workflows().get(...)` | `GET` | `/workflows/{param}` | `String workflowId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `workflows().get(...)` | `GET` | `/workflows/{param}` | `String workflowId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().get(...)` | `GET` | `/workflows/{param}` | `String workflowId, Class<T> responseType` | `@Nullable T` |
| `workflows().get(...)` | `GET` | `/workflows/{param}` | `String workflowId, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().get2(...)` | `GET` | `/workflows/{param}/{param}` | `String workflowId, String runId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `workflows().get2(...)` | `GET` | `/workflows/{param}/{param}` | `String workflowId, String runId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().get2(...)` | `GET` | `/workflows/{param}/{param}` | `String workflowId, String runId, Class<T> responseType` | `@Nullable T` |
| `workflows().get2(...)` | `GET` | `/workflows/{param}/{param}` | `String workflowId, String runId, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().summary(...)` | `GET` | `/workflows/{param}/{param}/summary` | `String workflowId, String runId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `workflows().summary(...)` | `GET` | `/workflows/{param}/{param}/summary` | `String workflowId, String runId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().summary(...)` | `GET` | `/workflows/{param}/{param}/summary` | `String workflowId, String runId, Class<T> responseType` | `@Nullable T` |
| `workflows().summary(...)` | `GET` | `/workflows/{param}/{param}/summary` | `String workflowId, String runId, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().timeline(...)` | `GET` | `/workflows/{param}/{param}/timeline` | `String workflowId, String runId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `workflows().timeline(...)` | `GET` | `/workflows/{param}/{param}/timeline` | `String workflowId, String runId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().timeline(...)` | `GET` | `/workflows/{param}/{param}/timeline` | `String workflowId, String runId, Class<T> responseType` | `@Nullable T` |
| `workflows().timeline(...)` | `GET` | `/workflows/{param}/{param}/timeline` | `String workflowId, String runId, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().update(...)` | `PATCH` | `/workflows/{param}` | `String workflowId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `workflows().update(...)` | `PATCH` | `/workflows/{param}` | `String workflowId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().update(...)` | `PATCH` | `/workflows/{param}` | `String workflowId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `workflows().update(...)` | `PATCH` | `/workflows/{param}` | `String workflowId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().create(...)` | `POST` | `/workflows` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `workflows().create(...)` | `POST` | `/workflows` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().create(...)` | `POST` | `/workflows` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `workflows().create(...)` | `POST` | `/workflows` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().batch(...)` | `POST` | `/workflows/batch` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `workflows().batch(...)` | `POST` | `/workflows/batch` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().batch(...)` | `POST` | `/workflows/batch` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `workflows().batch(...)` | `POST` | `/workflows/batch` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().search(...)` | `POST` | `/workflows/search` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `workflows().search(...)` | `POST` | `/workflows/search` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().search(...)` | `POST` | `/workflows/search` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `workflows().search(...)` | `POST` | `/workflows/search` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().archive(...)` | `POST` | `/workflows/{param}/archive` | `String workflowId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `workflows().archive(...)` | `POST` | `/workflows/{param}/archive` | `String workflowId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().archive(...)` | `POST` | `/workflows/{param}/archive` | `String workflowId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `workflows().archive(...)` | `POST` | `/workflows/{param}/archive` | `String workflowId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().publish(...)` | `POST` | `/workflows/{param}/publish` | `String workflowId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `workflows().publish(...)` | `POST` | `/workflows/{param}/publish` | `String workflowId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().publish(...)` | `POST` | `/workflows/{param}/publish` | `String workflowId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `workflows().publish(...)` | `POST` | `/workflows/{param}/publish` | `String workflowId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().restore(...)` | `POST` | `/workflows/{param}/restore` | `String workflowId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `workflows().restore(...)` | `POST` | `/workflows/{param}/restore` | `String workflowId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().restore(...)` | `POST` | `/workflows/{param}/restore` | `String workflowId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `workflows().restore(...)` | `POST` | `/workflows/{param}/restore` | `String workflowId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().approvals().list(...)` | `GET` | `/workflows/approvals` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `workflows().approvals().list(...)` | `GET` | `/workflows/approvals` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().approvals().list(...)` | `GET` | `/workflows/approvals` | `Class<T> responseType` | `@Nullable T` |
| `workflows().approvals().list(...)` | `GET` | `/workflows/approvals` | `TypeReference<T> responseType` | `@Nullable T` |
| `workflows().approvals().get(...)` | `GET` | `/workflows/approvals/{param}` | `String approvalId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `workflows().approvals().get(...)` | `GET` | `/workflows/approvals/{param}` | `String approvalId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().approvals().get(...)` | `GET` | `/workflows/approvals/{param}` | `String approvalId, Class<T> responseType` | `@Nullable T` |
| `workflows().approvals().get(...)` | `GET` | `/workflows/approvals/{param}` | `String approvalId, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().approvals().approve(...)` | `POST` | `/workflows/approvals/{param}/approve` | `String approvalId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `workflows().approvals().approve(...)` | `POST` | `/workflows/approvals/{param}/approve` | `String approvalId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().approvals().approve(...)` | `POST` | `/workflows/approvals/{param}/approve` | `String approvalId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `workflows().approvals().approve(...)` | `POST` | `/workflows/approvals/{param}/approve` | `String approvalId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().approvals().reject(...)` | `POST` | `/workflows/approvals/{param}/reject` | `String approvalId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `workflows().approvals().reject(...)` | `POST` | `/workflows/approvals/{param}/reject` | `String approvalId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().approvals().reject(...)` | `POST` | `/workflows/approvals/{param}/reject` | `String approvalId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `workflows().approvals().reject(...)` | `POST` | `/workflows/approvals/{param}/reject` | `String approvalId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().executions().list(...)` | `GET` | `/workflows/executions` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `workflows().executions().list(...)` | `GET` | `/workflows/executions` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().executions().list(...)` | `GET` | `/workflows/executions` | `Class<T> responseType` | `@Nullable T` |
| `workflows().executions().list(...)` | `GET` | `/workflows/executions` | `TypeReference<T> responseType` | `@Nullable T` |
| `workflows().executions().get(...)` | `GET` | `/workflows/executions/{param}` | `String executionId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `workflows().executions().get(...)` | `GET` | `/workflows/executions/{param}` | `String executionId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().executions().get(...)` | `GET` | `/workflows/executions/{param}` | `String executionId, Class<T> responseType` | `@Nullable T` |
| `workflows().executions().get(...)` | `GET` | `/workflows/executions/{param}` | `String executionId, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().executions().create(...)` | `POST` | `/workflows/executions` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `workflows().executions().create(...)` | `POST` | `/workflows/executions` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().executions().create(...)` | `POST` | `/workflows/executions` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `workflows().executions().create(...)` | `POST` | `/workflows/executions` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().tasks().get(...)` | `GET` | `/workflows/tasks/{param}` | `String taskId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `workflows().tasks().get(...)` | `GET` | `/workflows/tasks/{param}` | `String taskId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().tasks().get(...)` | `GET` | `/workflows/tasks/{param}` | `String taskId, Class<T> responseType` | `@Nullable T` |
| `workflows().tasks().get(...)` | `GET` | `/workflows/tasks/{param}` | `String taskId, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().tasks().cancel(...)` | `POST` | `/workflows/tasks/{param}/cancel` | `String taskId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `workflows().tasks().cancel(...)` | `POST` | `/workflows/tasks/{param}/cancel` | `String taskId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().tasks().cancel(...)` | `POST` | `/workflows/tasks/{param}/cancel` | `String taskId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `workflows().tasks().cancel(...)` | `POST` | `/workflows/tasks/{param}/cancel` | `String taskId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().tasks().retry(...)` | `POST` | `/workflows/tasks/{param}/retry` | `String taskId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `workflows().tasks().retry(...)` | `POST` | `/workflows/tasks/{param}/retry` | `String taskId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().tasks().retry(...)` | `POST` | `/workflows/tasks/{param}/retry` | `String taskId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `workflows().tasks().retry(...)` | `POST` | `/workflows/tasks/{param}/retry` | `String taskId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().templates().list(...)` | `GET` | `/workflows/templates` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `workflows().templates().list(...)` | `GET` | `/workflows/templates` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().templates().list(...)` | `GET` | `/workflows/templates` | `Class<T> responseType` | `@Nullable T` |
| `workflows().templates().list(...)` | `GET` | `/workflows/templates` | `TypeReference<T> responseType` | `@Nullable T` |
| `workflows().templates().get(...)` | `GET` | `/workflows/templates/{param}` | `String templateId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `workflows().templates().get(...)` | `GET` | `/workflows/templates/{param}` | `String templateId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().templates().get(...)` | `GET` | `/workflows/templates/{param}` | `String templateId, Class<T> responseType` | `@Nullable T` |
| `workflows().templates().get(...)` | `GET` | `/workflows/templates/{param}` | `String templateId, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().templates().create(...)` | `POST` | `/workflows/templates` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `workflows().templates().create(...)` | `POST` | `/workflows/templates` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().templates().create(...)` | `POST` | `/workflows/templates` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `workflows().templates().create(...)` | `POST` | `/workflows/templates` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().templates().instantiate(...)` | `POST` | `/workflows/templates/{param}/instantiate` | `String templateId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `workflows().templates().instantiate(...)` | `POST` | `/workflows/templates/{param}/instantiate` | `String templateId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().templates().instantiate(...)` | `POST` | `/workflows/templates/{param}/instantiate` | `String templateId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `workflows().templates().instantiate(...)` | `POST` | `/workflows/templates/{param}/instantiate` | `String templateId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().versions().create(...)` | `POST` | `/workflows/{param}/versions` | `String workflowId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `workflows().versions().create(...)` | `POST` | `/workflows/{param}/versions` | `String workflowId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().versions().create(...)` | `POST` | `/workflows/{param}/versions` | `String workflowId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `workflows().versions().create(...)` | `POST` | `/workflows/{param}/versions` | `String workflowId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().executions().tasks().list(...)` | `GET` | `/workflows/executions/{param}/tasks` | `String executionId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `workflows().executions().tasks().list(...)` | `GET` | `/workflows/executions/{param}/tasks` | `String executionId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().executions().tasks().list(...)` | `GET` | `/workflows/executions/{param}/tasks` | `String executionId, Class<T> responseType` | `@Nullable T` |
| `workflows().executions().tasks().list(...)` | `GET` | `/workflows/executions/{param}/tasks` | `String executionId, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().runs().steps().list(...)` | `GET` | `/workflows/runs/{param}/steps` | `String runId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `workflows().runs().steps().list(...)` | `GET` | `/workflows/runs/{param}/steps` | `String runId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `workflows().runs().steps().list(...)` | `GET` | `/workflows/runs/{param}/steps` | `String runId, Class<T> responseType` | `@Nullable T` |
| `workflows().runs().steps().list(...)` | `GET` | `/workflows/runs/{param}/steps` | `String runId, TypeReference<T> responseType` | `@Nullable T` |

The generic `request(...)` methods and `Endpoints` constants remain available.
