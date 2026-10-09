# Workflows API

Service accessor: `frontal.workflows()` (`WorkflowsServiceClient`).

Named methods are generated from the committed route catalog. Build query values with `QueryParams` using exact API wire names. Routes without request schemas accept `JsonNode`; select `JsonNode` or a caller-provided model for unmodeled responses.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `deleteWorkflowsParam(...)` | `DELETE` | `/workflows/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `deleteWorkflowsParam(...)` | `DELETE` | `/workflows/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getWorkflows(...)` | `GET` | `/workflows` | `query, Class<T> responseType` | `@Nullable T` |
| `getWorkflows(...)` | `GET` | `/workflows` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getWorkflowsApprovals(...)` | `GET` | `/workflows/approvals` | `query, Class<T> responseType` | `@Nullable T` |
| `getWorkflowsApprovals(...)` | `GET` | `/workflows/approvals` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getWorkflowsApprovalsParam(...)` | `GET` | `/workflows/approvals/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getWorkflowsApprovalsParam(...)` | `GET` | `/workflows/approvals/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getWorkflowsExecutions(...)` | `GET` | `/workflows/executions` | `query, Class<T> responseType` | `@Nullable T` |
| `getWorkflowsExecutions(...)` | `GET` | `/workflows/executions` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getWorkflowsExecutionsParam(...)` | `GET` | `/workflows/executions/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getWorkflowsExecutionsParam(...)` | `GET` | `/workflows/executions/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getWorkflowsExecutionsParamTasks(...)` | `GET` | `/workflows/executions/{param}/tasks` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getWorkflowsExecutionsParamTasks(...)` | `GET` | `/workflows/executions/{param}/tasks` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getWorkflowsRunsParamSteps(...)` | `GET` | `/workflows/runs/{param}/steps` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getWorkflowsRunsParamSteps(...)` | `GET` | `/workflows/runs/{param}/steps` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getWorkflowsTasksParam(...)` | `GET` | `/workflows/tasks/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getWorkflowsTasksParam(...)` | `GET` | `/workflows/tasks/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getWorkflowsTemplates(...)` | `GET` | `/workflows/templates` | `query, Class<T> responseType` | `@Nullable T` |
| `getWorkflowsTemplates(...)` | `GET` | `/workflows/templates` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getWorkflowsTemplatesParam(...)` | `GET` | `/workflows/templates/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getWorkflowsTemplatesParam(...)` | `GET` | `/workflows/templates/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getWorkflowsParam(...)` | `GET` | `/workflows/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getWorkflowsParam(...)` | `GET` | `/workflows/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getWorkflowsWorkflowIdRunId(...)` | `GET` | `/workflows/{param}/{param}` | `workflowId, runId, query, Class<T> responseType` | `@Nullable T` |
| `getWorkflowsWorkflowIdRunId(...)` | `GET` | `/workflows/{param}/{param}` | `workflowId, runId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getWorkflowsWorkflowIdRunIdSummary(...)` | `GET` | `/workflows/{param}/{param}/summary` | `workflowId, runId, query, Class<T> responseType` | `@Nullable T` |
| `getWorkflowsWorkflowIdRunIdSummary(...)` | `GET` | `/workflows/{param}/{param}/summary` | `workflowId, runId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getWorkflowsWorkflowIdRunIdTimeline(...)` | `GET` | `/workflows/{param}/{param}/timeline` | `workflowId, runId, query, Class<T> responseType` | `@Nullable T` |
| `getWorkflowsWorkflowIdRunIdTimeline(...)` | `GET` | `/workflows/{param}/{param}/timeline` | `workflowId, runId, query, TypeReference<T> responseType` | `@Nullable T` |
| `patchWorkflowsParam(...)` | `PATCH` | `/workflows/{param}` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `patchWorkflowsParam(...)` | `PATCH` | `/workflows/{param}` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postWorkflows(...)` | `POST` | `/workflows` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postWorkflows(...)` | `POST` | `/workflows` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postWorkflowsApprovalsParamApprove(...)` | `POST` | `/workflows/approvals/{param}/approve` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postWorkflowsApprovalsParamApprove(...)` | `POST` | `/workflows/approvals/{param}/approve` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postWorkflowsApprovalsParamReject(...)` | `POST` | `/workflows/approvals/{param}/reject` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postWorkflowsApprovalsParamReject(...)` | `POST` | `/workflows/approvals/{param}/reject` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postWorkflowsBatch(...)` | `POST` | `/workflows/batch` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postWorkflowsBatch(...)` | `POST` | `/workflows/batch` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postWorkflowsExecutions(...)` | `POST` | `/workflows/executions` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postWorkflowsExecutions(...)` | `POST` | `/workflows/executions` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postWorkflowsSearch(...)` | `POST` | `/workflows/search` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postWorkflowsSearch(...)` | `POST` | `/workflows/search` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postWorkflowsTasksParamCancel(...)` | `POST` | `/workflows/tasks/{param}/cancel` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postWorkflowsTasksParamCancel(...)` | `POST` | `/workflows/tasks/{param}/cancel` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postWorkflowsTasksParamRetry(...)` | `POST` | `/workflows/tasks/{param}/retry` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postWorkflowsTasksParamRetry(...)` | `POST` | `/workflows/tasks/{param}/retry` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postWorkflowsTemplates(...)` | `POST` | `/workflows/templates` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postWorkflowsTemplates(...)` | `POST` | `/workflows/templates` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postWorkflowsTemplatesParamInstantiate(...)` | `POST` | `/workflows/templates/{param}/instantiate` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postWorkflowsTemplatesParamInstantiate(...)` | `POST` | `/workflows/templates/{param}/instantiate` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postWorkflowsParamArchive(...)` | `POST` | `/workflows/{param}/archive` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postWorkflowsParamArchive(...)` | `POST` | `/workflows/{param}/archive` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postWorkflowsParamPublish(...)` | `POST` | `/workflows/{param}/publish` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postWorkflowsParamPublish(...)` | `POST` | `/workflows/{param}/publish` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postWorkflowsParamRestore(...)` | `POST` | `/workflows/{param}/restore` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postWorkflowsParamRestore(...)` | `POST` | `/workflows/{param}/restore` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postWorkflowsParamVersions(...)` | `POST` | `/workflows/{param}/versions` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postWorkflowsParamVersions(...)` | `POST` | `/workflows/{param}/versions` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| No catalogued operations | — | — | — | — |

The generic `request(...)` methods and `Endpoints` constants remain available.
