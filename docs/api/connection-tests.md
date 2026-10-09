# ConnectionTests API

Service accessor: `frontal.connectionTests()` (`ConnectionTestsClient`).

Named methods are generated from the committed route catalog. Build query values with `QueryParams` using exact API wire names. Routes without request schemas accept `JsonNode`; select `JsonNode` or a caller-provided model for unmodeled responses.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `getConnectionTestsConnectionTestId(...)` | `GET` | `/connection-tests/{param}` | `connectionTestId, query, Class<T> responseType` | `@Nullable T` |
| `getConnectionTestsConnectionTestId(...)` | `GET` | `/connection-tests/{param}` | `connectionTestId, query, TypeReference<T> responseType` | `@Nullable T` |
| No catalogued operations | — | — | — | — |

The generic `request(...)` methods and `Endpoints` constants remain available.
