# Agents API

Service accessor: `frontal.agents()` (`AgentsServiceClient`).

Named methods are generated from the committed route catalog. Build query values with `QueryParams` using exact API wire names. Routes without request schemas accept `JsonNode`; select `JsonNode` or a caller-provided model for unmodeled responses.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `deleteAgentsParam(...)` | `DELETE` | `/agents/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `deleteAgentsParam(...)` | `DELETE` | `/agents/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getAgents(...)` | `GET` | `/agents` | `query, Class<T> responseType` | `@Nullable T` |
| `getAgents(...)` | `GET` | `/agents` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getAgentsHealth(...)` | `GET` | `/agents/health` | `query, Class<T> responseType` | `@Nullable T` |
| `getAgentsHealth(...)` | `GET` | `/agents/health` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getAgentsRunsParam(...)` | `GET` | `/agents/runs/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getAgentsRunsParam(...)` | `GET` | `/agents/runs/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getAgentsRunsParamConversation(...)` | `GET` | `/agents/runs/{param}/conversation` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getAgentsRunsParamConversation(...)` | `GET` | `/agents/runs/{param}/conversation` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getAgentsParam(...)` | `GET` | `/agents/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getAgentsParam(...)` | `GET` | `/agents/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getAgentsParamRuns(...)` | `GET` | `/agents/{param}/runs` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getAgentsParamRuns(...)` | `GET` | `/agents/{param}/runs` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getAgentsParamVersions(...)` | `GET` | `/agents/{param}/versions` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getAgentsParamVersions(...)` | `GET` | `/agents/{param}/versions` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `postAgents(...)` | `POST` | `/agents` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postAgents(...)` | `POST` | `/agents` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAgentsParamRollback(...)` | `POST` | `/agents/{param}/rollback` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postAgentsParamRollback(...)` | `POST` | `/agents/{param}/rollback` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAgentsParamRuns(...)` | `POST` | `/agents/{param}/runs` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postAgentsParamRuns(...)` | `POST` | `/agents/{param}/runs` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `putAgentsParam(...)` | `PUT` | `/agents/{param}` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `putAgentsParam(...)` | `PUT` | `/agents/{param}` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `streamAgentsRunsParamStream(...)` | `STREAM` | `/agents/runs/{param}/stream` | `pathParam1, query` | `Flow.Publisher<String>` |
| `streamAgentsRunsParamStreamBlocking(...)` | `STREAM` | `/agents/runs/{param}/stream` | `pathParam1, query` | `SseEventIterator` |
| `getActionRun(...)` | `GET` | `/action-runs/{param}` | `actionRunId, query, Class<T> or TypeReference<T> responseType` | `@Nullable T` |

The generic `request(...)` methods and `Endpoints` constants remain available.
