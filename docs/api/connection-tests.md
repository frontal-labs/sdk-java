# ConnectionTests API

Service accessor: `frontal.connectionTests()` (`ConnectionTestsClient`).

Operations are grouped by resource path. Collection methods use `list` and `create`; item methods use `get`, `update`, and `delete`. Calls can omit `QueryParams` when no query values are needed. Use contract-defined `JsonNode` bodies and caller-selected response types where schemas are not available.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `connectionTests().get(...)` | `GET` | `/connection-tests/{param}` | `String connectionTestId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `connectionTests().get(...)` | `GET` | `/connection-tests/{param}` | `String connectionTestId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `connectionTests().get(...)` | `GET` | `/connection-tests/{param}` | `String connectionTestId, Class<T> responseType` | `@Nullable T` |
| `connectionTests().get(...)` | `GET` | `/connection-tests/{param}` | `String connectionTestId, TypeReference<T> responseType` | `@Nullable T` |

The generic `request(...)` methods and `Endpoints` constants remain available.
