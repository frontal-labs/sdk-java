# Schedules API

Service accessor: `frontal.schedules()` (`SchedulesClient`).

Named methods are generated from the committed route catalog. Build query values with `QueryParams` using exact API wire names. Routes without request schemas accept `JsonNode`; select `JsonNode` or a caller-provided model for unmodeled responses.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `deleteWorkflowsSchedulesParam(...)` | `DELETE` | `/workflows/schedules/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `deleteWorkflowsSchedulesParam(...)` | `DELETE` | `/workflows/schedules/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getWorkflowsSchedules(...)` | `GET` | `/workflows/schedules` | `query, Class<T> responseType` | `@Nullable T` |
| `getWorkflowsSchedules(...)` | `GET` | `/workflows/schedules` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getWorkflowsSchedulesParam(...)` | `GET` | `/workflows/schedules/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getWorkflowsSchedulesParam(...)` | `GET` | `/workflows/schedules/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `patchWorkflowsSchedulesParam(...)` | `PATCH` | `/workflows/schedules/{param}` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `patchWorkflowsSchedulesParam(...)` | `PATCH` | `/workflows/schedules/{param}` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postWorkflowsCronParse(...)` | `POST` | `/workflows/cron/parse` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postWorkflowsCronParse(...)` | `POST` | `/workflows/cron/parse` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postWorkflowsCronValidate(...)` | `POST` | `/workflows/cron/validate` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postWorkflowsCronValidate(...)` | `POST` | `/workflows/cron/validate` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postWorkflowsSchedules(...)` | `POST` | `/workflows/schedules` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postWorkflowsSchedules(...)` | `POST` | `/workflows/schedules` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postWorkflowsSchedulesParamPause(...)` | `POST` | `/workflows/schedules/{param}/pause` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postWorkflowsSchedulesParamPause(...)` | `POST` | `/workflows/schedules/{param}/pause` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postWorkflowsSchedulesParamResume(...)` | `POST` | `/workflows/schedules/{param}/resume` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postWorkflowsSchedulesParamResume(...)` | `POST` | `/workflows/schedules/{param}/resume` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postWorkflowsSchedulesParamTrigger(...)` | `POST` | `/workflows/schedules/{param}/trigger` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postWorkflowsSchedulesParamTrigger(...)` | `POST` | `/workflows/schedules/{param}/trigger` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| No catalogued operations | — | — | — | — |

The generic `request(...)` methods and `Endpoints` constants remain available.
