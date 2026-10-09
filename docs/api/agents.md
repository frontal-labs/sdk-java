# Agents API

Service accessor: `frontal.agents()` (`AgentsServiceClient`).

Operations are grouped by resource path. Collection methods use `list` and `create`; item methods use `get`, `update`, and `delete`. Calls can omit `QueryParams` when no query values are needed. Use contract-defined `JsonNode` bodies and caller-selected response types where schemas are not available.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `agents().delete(...)` | `DELETE` | `/agents/{param}` | `String agentId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `agents().delete(...)` | `DELETE` | `/agents/{param}` | `String agentId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `agents().delete(...)` | `DELETE` | `/agents/{param}` | `String agentId, Class<T> responseType` | `@Nullable T` |
| `agents().delete(...)` | `DELETE` | `/agents/{param}` | `String agentId, TypeReference<T> responseType` | `@Nullable T` |
| `agents().list(...)` | `GET` | `/agents` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `agents().list(...)` | `GET` | `/agents` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `agents().list(...)` | `GET` | `/agents` | `Class<T> responseType` | `@Nullable T` |
| `agents().list(...)` | `GET` | `/agents` | `TypeReference<T> responseType` | `@Nullable T` |
| `agents().health(...)` | `GET` | `/agents/health` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `agents().health(...)` | `GET` | `/agents/health` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `agents().health(...)` | `GET` | `/agents/health` | `Class<T> responseType` | `@Nullable T` |
| `agents().health(...)` | `GET` | `/agents/health` | `TypeReference<T> responseType` | `@Nullable T` |
| `agents().get(...)` | `GET` | `/agents/{param}` | `String agentId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `agents().get(...)` | `GET` | `/agents/{param}` | `String agentId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `agents().get(...)` | `GET` | `/agents/{param}` | `String agentId, Class<T> responseType` | `@Nullable T` |
| `agents().get(...)` | `GET` | `/agents/{param}` | `String agentId, TypeReference<T> responseType` | `@Nullable T` |
| `agents().create(...)` | `POST` | `/agents` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `agents().create(...)` | `POST` | `/agents` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `agents().create(...)` | `POST` | `/agents` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `agents().create(...)` | `POST` | `/agents` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `agents().rollback(...)` | `POST` | `/agents/{param}/rollback` | `String agentId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `agents().rollback(...)` | `POST` | `/agents/{param}/rollback` | `String agentId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `agents().rollback(...)` | `POST` | `/agents/{param}/rollback` | `String agentId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `agents().rollback(...)` | `POST` | `/agents/{param}/rollback` | `String agentId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `agents().update(...)` | `PUT` | `/agents/{param}` | `String agentId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `agents().update(...)` | `PUT` | `/agents/{param}` | `String agentId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `agents().update(...)` | `PUT` | `/agents/{param}` | `String agentId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `agents().update(...)` | `PUT` | `/agents/{param}` | `String agentId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `agents().runs().getByActionRunId(...)` | `GET` | `/action-runs/{param}` | `String actionRunId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `agents().runs().getByActionRunId(...)` | `GET` | `/action-runs/{param}` | `String actionRunId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `agents().runs().getByActionRunId(...)` | `GET` | `/action-runs/{param}` | `String actionRunId, Class<T> responseType` | `@Nullable T` |
| `agents().runs().getByActionRunId(...)` | `GET` | `/action-runs/{param}` | `String actionRunId, TypeReference<T> responseType` | `@Nullable T` |
| `agents().runs().get(...)` | `GET` | `/agents/runs/{param}` | `String runId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `agents().runs().get(...)` | `GET` | `/agents/runs/{param}` | `String runId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `agents().runs().get(...)` | `GET` | `/agents/runs/{param}` | `String runId, Class<T> responseType` | `@Nullable T` |
| `agents().runs().get(...)` | `GET` | `/agents/runs/{param}` | `String runId, TypeReference<T> responseType` | `@Nullable T` |
| `agents().runs().conversation(...)` | `GET` | `/agents/runs/{param}/conversation` | `String runId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `agents().runs().conversation(...)` | `GET` | `/agents/runs/{param}/conversation` | `String runId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `agents().runs().conversation(...)` | `GET` | `/agents/runs/{param}/conversation` | `String runId, Class<T> responseType` | `@Nullable T` |
| `agents().runs().conversation(...)` | `GET` | `/agents/runs/{param}/conversation` | `String runId, TypeReference<T> responseType` | `@Nullable T` |
| `agents().runs().list(...)` | `GET` | `/agents/{param}/runs` | `String agentId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `agents().runs().list(...)` | `GET` | `/agents/{param}/runs` | `String agentId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `agents().runs().list(...)` | `GET` | `/agents/{param}/runs` | `String agentId, Class<T> responseType` | `@Nullable T` |
| `agents().runs().list(...)` | `GET` | `/agents/{param}/runs` | `String agentId, TypeReference<T> responseType` | `@Nullable T` |
| `agents().runs().create(...)` | `POST` | `/agents/{param}/runs` | `String agentId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `agents().runs().create(...)` | `POST` | `/agents/{param}/runs` | `String agentId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `agents().runs().create(...)` | `POST` | `/agents/{param}/runs` | `String agentId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `agents().runs().create(...)` | `POST` | `/agents/{param}/runs` | `String agentId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `agents().runs().stream(...)` | `STREAM` | `/agents/runs/{param}/stream` | `String runId, QueryParams query` | `Flow.Publisher<String>` |
| `agents().runs().stream(...)` | `STREAM` | `/agents/runs/{param}/stream` | `String runId` | `Flow.Publisher<String>` |
| `agents().runs().streamBlocking(...)` | `STREAM` | `/agents/runs/{param}/stream` | `String runId, QueryParams query` | `SseEventIterator` |
| `agents().runs().streamBlocking(...)` | `STREAM` | `/agents/runs/{param}/stream` | `String runId` | `SseEventIterator` |
| `agents().versions().list(...)` | `GET` | `/agents/{param}/versions` | `String agentId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `agents().versions().list(...)` | `GET` | `/agents/{param}/versions` | `String agentId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `agents().versions().list(...)` | `GET` | `/agents/{param}/versions` | `String agentId, Class<T> responseType` | `@Nullable T` |
| `agents().versions().list(...)` | `GET` | `/agents/{param}/versions` | `String agentId, TypeReference<T> responseType` | `@Nullable T` |

The generic `request(...)` methods and `Endpoints` constants remain available.
