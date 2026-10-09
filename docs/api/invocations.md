# Invocations API

Service accessor: `frontal.invocations()` (`InvocationsClient`).

Operations are grouped by resource path. Collection methods use `list` and `create`; item methods use `get`, `update`, and `delete`. Calls can omit `QueryParams` when no query values are needed. Use contract-defined `JsonNode` bodies and caller-selected response types where schemas are not available.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `invocations().create(...)` | `POST` | `/invocations` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `invocations().create(...)` | `POST` | `/invocations` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `invocations().create(...)` | `POST` | `/invocations` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `invocations().create(...)` | `POST` | `/invocations` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |

The generic `request(...)` methods and `Endpoints` constants remain available.
