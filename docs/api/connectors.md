# Connectors API

Service accessor: `frontal.connectors()` (`ConnectorsClient`).

Named methods are generated from the committed route catalog. Build query values with `QueryParams` using exact API wire names. Routes without request schemas accept `JsonNode`; select `JsonNode` or a caller-provided model for unmodeled responses.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `deleteConnectorsInstallationsParam(...)` | `DELETE` | `/connectors/installations/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `deleteConnectorsInstallationsParam(...)` | `DELETE` | `/connectors/installations/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getConnectorsCatalog(...)` | `GET` | `/connectors/catalog` | `query, Class<T> responseType` | `@Nullable T` |
| `getConnectorsCatalog(...)` | `GET` | `/connectors/catalog` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getConnectorsCatalogParam(...)` | `GET` | `/connectors/catalog/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getConnectorsCatalogParam(...)` | `GET` | `/connectors/catalog/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getConnectorsConnectionTestsParam(...)` | `GET` | `/connectors/connection-tests/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getConnectorsConnectionTestsParam(...)` | `GET` | `/connectors/connection-tests/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getConnectorsInstallations(...)` | `GET` | `/connectors/installations` | `query, Class<T> responseType` | `@Nullable T` |
| `getConnectorsInstallations(...)` | `GET` | `/connectors/installations` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getConnectorsInstallationsParam(...)` | `GET` | `/connectors/installations/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getConnectorsInstallationsParam(...)` | `GET` | `/connectors/installations/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDiagnostics(...)` | `GET` | `/diagnostics` | `query, Class<T> responseType` | `@Nullable T` |
| `getDiagnostics(...)` | `GET` | `/diagnostics` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `patchConnectorsInstallationsParam(...)` | `PATCH` | `/connectors/installations/{param}` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `patchConnectorsInstallationsParam(...)` | `PATCH` | `/connectors/installations/{param}` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postConnectorsInstallations(...)` | `POST` | `/connectors/installations` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postConnectorsInstallations(...)` | `POST` | `/connectors/installations` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postConnectorsInstallationsParamPause(...)` | `POST` | `/connectors/installations/{param}/pause` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postConnectorsInstallationsParamPause(...)` | `POST` | `/connectors/installations/{param}/pause` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postConnectorsInstallationsParamResume(...)` | `POST` | `/connectors/installations/{param}/resume` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postConnectorsInstallationsParamResume(...)` | `POST` | `/connectors/installations/{param}/resume` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postConnectorsSyncRunsParamReplay(...)` | `POST` | `/connectors/sync-runs/{param}/replay` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postConnectorsSyncRunsParamReplay(...)` | `POST` | `/connectors/sync-runs/{param}/replay` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| No catalogued operations | — | — | — | — |

The generic `request(...)` methods and `Endpoints` constants remain available.
