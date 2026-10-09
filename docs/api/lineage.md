# Lineage API

Service accessor: `frontal.lineage()` (`LineageClient`).

Named methods are generated from the committed route catalog. Build query values with `QueryParams` using exact API wire names. Routes without request schemas accept `JsonNode`; select `JsonNode` or a caller-provided model for unmodeled responses.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `getLineageEdges(...)` | `GET` | `/lineage/edges` | `query, Class<T> responseType` | `@Nullable T` |
| `getLineageEdges(...)` | `GET` | `/lineage/edges` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getLineageEdgesParam(...)` | `GET` | `/lineage/edges/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getLineageEdgesParam(...)` | `GET` | `/lineage/edges/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getLineageGraph(...)` | `GET` | `/lineage/graph` | `query, Class<T> responseType` | `@Nullable T` |
| `getLineageGraph(...)` | `GET` | `/lineage/graph` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getLineageNodes(...)` | `GET` | `/lineage/nodes` | `query, Class<T> responseType` | `@Nullable T` |
| `getLineageNodes(...)` | `GET` | `/lineage/nodes` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getLineageNodesParam(...)` | `GET` | `/lineage/nodes/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getLineageNodesParam(...)` | `GET` | `/lineage/nodes/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getLineageNodesParamTrace(...)` | `GET` | `/lineage/nodes/{param}/trace` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getLineageNodesParamTrace(...)` | `GET` | `/lineage/nodes/{param}/trace` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `postLineageImpact(...)` | `POST` | `/lineage/impact` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postLineageImpact(...)` | `POST` | `/lineage/impact` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| No catalogued operations | — | — | — | — |

The generic `request(...)` methods and `Endpoints` constants remain available.
