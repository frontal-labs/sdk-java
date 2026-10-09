# Lineage API

Service accessor: `frontal.lineage()` (`LineageClient`).

Operations are grouped by resource path. Collection methods use `list` and `create`; item methods use `get`, `update`, and `delete`. Calls can omit `QueryParams` when no query values are needed. Use contract-defined `JsonNode` bodies and caller-selected response types where schemas are not available.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `lineage().getGraph(...)` | `GET` | `/lineage/graph` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `lineage().getGraph(...)` | `GET` | `/lineage/graph` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `lineage().getGraph(...)` | `GET` | `/lineage/graph` | `Class<T> responseType` | `@Nullable T` |
| `lineage().getGraph(...)` | `GET` | `/lineage/graph` | `TypeReference<T> responseType` | `@Nullable T` |
| `lineage().createImpact(...)` | `POST` | `/lineage/impact` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `lineage().createImpact(...)` | `POST` | `/lineage/impact` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `lineage().createImpact(...)` | `POST` | `/lineage/impact` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `lineage().createImpact(...)` | `POST` | `/lineage/impact` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `lineage().edges().list(...)` | `GET` | `/lineage/edges` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `lineage().edges().list(...)` | `GET` | `/lineage/edges` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `lineage().edges().list(...)` | `GET` | `/lineage/edges` | `Class<T> responseType` | `@Nullable T` |
| `lineage().edges().list(...)` | `GET` | `/lineage/edges` | `TypeReference<T> responseType` | `@Nullable T` |
| `lineage().edges().get(...)` | `GET` | `/lineage/edges/{param}` | `String edgeId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `lineage().edges().get(...)` | `GET` | `/lineage/edges/{param}` | `String edgeId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `lineage().edges().get(...)` | `GET` | `/lineage/edges/{param}` | `String edgeId, Class<T> responseType` | `@Nullable T` |
| `lineage().edges().get(...)` | `GET` | `/lineage/edges/{param}` | `String edgeId, TypeReference<T> responseType` | `@Nullable T` |
| `lineage().nodes().list(...)` | `GET` | `/lineage/nodes` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `lineage().nodes().list(...)` | `GET` | `/lineage/nodes` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `lineage().nodes().list(...)` | `GET` | `/lineage/nodes` | `Class<T> responseType` | `@Nullable T` |
| `lineage().nodes().list(...)` | `GET` | `/lineage/nodes` | `TypeReference<T> responseType` | `@Nullable T` |
| `lineage().nodes().get(...)` | `GET` | `/lineage/nodes/{param}` | `String nodeId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `lineage().nodes().get(...)` | `GET` | `/lineage/nodes/{param}` | `String nodeId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `lineage().nodes().get(...)` | `GET` | `/lineage/nodes/{param}` | `String nodeId, Class<T> responseType` | `@Nullable T` |
| `lineage().nodes().get(...)` | `GET` | `/lineage/nodes/{param}` | `String nodeId, TypeReference<T> responseType` | `@Nullable T` |
| `lineage().nodes().getTrace(...)` | `GET` | `/lineage/nodes/{param}/trace` | `String nodeId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `lineage().nodes().getTrace(...)` | `GET` | `/lineage/nodes/{param}/trace` | `String nodeId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `lineage().nodes().getTrace(...)` | `GET` | `/lineage/nodes/{param}/trace` | `String nodeId, Class<T> responseType` | `@Nullable T` |
| `lineage().nodes().getTrace(...)` | `GET` | `/lineage/nodes/{param}/trace` | `String nodeId, TypeReference<T> responseType` | `@Nullable T` |

The generic `request(...)` methods and `Endpoints` constants remain available.
