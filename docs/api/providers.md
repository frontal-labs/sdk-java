# Providers API

Service accessor: `frontal.providers()` (`ProvidersClient`).

Operations are grouped by resource path. Collection methods use `list` and `create`; item methods use `get`, `update`, and `delete`. Calls can omit `QueryParams` when no query values are needed. Use contract-defined `JsonNode` bodies and caller-selected response types where schemas are not available.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `providers().get(...)` | `GET` | `/providers/{param}` | `String providerSlug, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `providers().get(...)` | `GET` | `/providers/{param}` | `String providerSlug, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `providers().get(...)` | `GET` | `/providers/{param}` | `String providerSlug, Class<T> responseType` | `@Nullable T` |
| `providers().get(...)` | `GET` | `/providers/{param}` | `String providerSlug, TypeReference<T> responseType` | `@Nullable T` |

The generic `request(...)` methods and `Endpoints` constants remain available.
