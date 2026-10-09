# Connectors API

Service accessor: `frontal.connectors()` (`ConnectorsClient`).

Operations are grouped by resource path. Collection methods use `list` and `create`; item methods use `get`, `update`, and `delete`. Calls can omit `QueryParams` when no query values are needed. Use contract-defined `JsonNode` bodies and caller-selected response types where schemas are not available.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `connectors().getCatalog(...)` | `GET` | `/connectors/catalog` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `connectors().getCatalog(...)` | `GET` | `/connectors/catalog` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `connectors().getCatalog(...)` | `GET` | `/connectors/catalog` | `Class<T> responseType` | `@Nullable T` |
| `connectors().getCatalog(...)` | `GET` | `/connectors/catalog` | `TypeReference<T> responseType` | `@Nullable T` |
| `connectors().catalog().get(...)` | `GET` | `/connectors/catalog/{param}` | `String catalogId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `connectors().catalog().get(...)` | `GET` | `/connectors/catalog/{param}` | `String catalogId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `connectors().catalog().get(...)` | `GET` | `/connectors/catalog/{param}` | `String catalogId, Class<T> responseType` | `@Nullable T` |
| `connectors().catalog().get(...)` | `GET` | `/connectors/catalog/{param}` | `String catalogId, TypeReference<T> responseType` | `@Nullable T` |
| `connectors().connectionTests().get(...)` | `GET` | `/connectors/connection-tests/{param}` | `String connectionTestId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `connectors().connectionTests().get(...)` | `GET` | `/connectors/connection-tests/{param}` | `String connectionTestId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `connectors().connectionTests().get(...)` | `GET` | `/connectors/connection-tests/{param}` | `String connectionTestId, Class<T> responseType` | `@Nullable T` |
| `connectors().connectionTests().get(...)` | `GET` | `/connectors/connection-tests/{param}` | `String connectionTestId, TypeReference<T> responseType` | `@Nullable T` |
| `connectors().diagnostics().list(...)` | `GET` | `/diagnostics` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `connectors().diagnostics().list(...)` | `GET` | `/diagnostics` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `connectors().diagnostics().list(...)` | `GET` | `/diagnostics` | `Class<T> responseType` | `@Nullable T` |
| `connectors().diagnostics().list(...)` | `GET` | `/diagnostics` | `TypeReference<T> responseType` | `@Nullable T` |
| `connectors().installations().delete(...)` | `DELETE` | `/connectors/installations/{param}` | `String installationId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `connectors().installations().delete(...)` | `DELETE` | `/connectors/installations/{param}` | `String installationId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `connectors().installations().delete(...)` | `DELETE` | `/connectors/installations/{param}` | `String installationId, Class<T> responseType` | `@Nullable T` |
| `connectors().installations().delete(...)` | `DELETE` | `/connectors/installations/{param}` | `String installationId, TypeReference<T> responseType` | `@Nullable T` |
| `connectors().installations().list(...)` | `GET` | `/connectors/installations` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `connectors().installations().list(...)` | `GET` | `/connectors/installations` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `connectors().installations().list(...)` | `GET` | `/connectors/installations` | `Class<T> responseType` | `@Nullable T` |
| `connectors().installations().list(...)` | `GET` | `/connectors/installations` | `TypeReference<T> responseType` | `@Nullable T` |
| `connectors().installations().get(...)` | `GET` | `/connectors/installations/{param}` | `String installationId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `connectors().installations().get(...)` | `GET` | `/connectors/installations/{param}` | `String installationId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `connectors().installations().get(...)` | `GET` | `/connectors/installations/{param}` | `String installationId, Class<T> responseType` | `@Nullable T` |
| `connectors().installations().get(...)` | `GET` | `/connectors/installations/{param}` | `String installationId, TypeReference<T> responseType` | `@Nullable T` |
| `connectors().installations().update(...)` | `PATCH` | `/connectors/installations/{param}` | `String installationId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `connectors().installations().update(...)` | `PATCH` | `/connectors/installations/{param}` | `String installationId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `connectors().installations().update(...)` | `PATCH` | `/connectors/installations/{param}` | `String installationId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `connectors().installations().update(...)` | `PATCH` | `/connectors/installations/{param}` | `String installationId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `connectors().installations().create(...)` | `POST` | `/connectors/installations` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `connectors().installations().create(...)` | `POST` | `/connectors/installations` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `connectors().installations().create(...)` | `POST` | `/connectors/installations` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `connectors().installations().create(...)` | `POST` | `/connectors/installations` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `connectors().installations().pause(...)` | `POST` | `/connectors/installations/{param}/pause` | `String installationId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `connectors().installations().pause(...)` | `POST` | `/connectors/installations/{param}/pause` | `String installationId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `connectors().installations().pause(...)` | `POST` | `/connectors/installations/{param}/pause` | `String installationId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `connectors().installations().pause(...)` | `POST` | `/connectors/installations/{param}/pause` | `String installationId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `connectors().installations().resume(...)` | `POST` | `/connectors/installations/{param}/resume` | `String installationId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `connectors().installations().resume(...)` | `POST` | `/connectors/installations/{param}/resume` | `String installationId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `connectors().installations().resume(...)` | `POST` | `/connectors/installations/{param}/resume` | `String installationId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `connectors().installations().resume(...)` | `POST` | `/connectors/installations/{param}/resume` | `String installationId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `connectors().syncRuns().replay(...)` | `POST` | `/connectors/sync-runs/{param}/replay` | `String syncRunId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `connectors().syncRuns().replay(...)` | `POST` | `/connectors/sync-runs/{param}/replay` | `String syncRunId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `connectors().syncRuns().replay(...)` | `POST` | `/connectors/sync-runs/{param}/replay` | `String syncRunId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `connectors().syncRuns().replay(...)` | `POST` | `/connectors/sync-runs/{param}/replay` | `String syncRunId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |

The generic `request(...)` methods and `Endpoints` constants remain available.
