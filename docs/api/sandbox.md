# Sandbox API

Service accessor: `frontal.sandbox()` (`SandboxClient`).

Operations are grouped by resource path. Collection methods use `list` and `create`; item methods use `get`, `update`, and `delete`. Calls can omit `QueryParams` when no query values are needed. Use contract-defined `JsonNode` bodies and caller-selected response types where schemas are not available.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `sandbox().createSelfTest(...)` | `POST` | `/sandbox/self-test` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `sandbox().createSelfTest(...)` | `POST` | `/sandbox/self-test` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `sandbox().createSelfTest(...)` | `POST` | `/sandbox/self-test` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `sandbox().createSelfTest(...)` | `POST` | `/sandbox/self-test` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `sandbox().submit(...)` | `POST` | `/sandbox/submit` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `sandbox().submit(...)` | `POST` | `/sandbox/submit` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `sandbox().submit(...)` | `POST` | `/sandbox/submit` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `sandbox().submit(...)` | `POST` | `/sandbox/submit` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `sandbox().languages().list(...)` | `GET` | `/sandbox/languages` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `sandbox().languages().list(...)` | `GET` | `/sandbox/languages` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `sandbox().languages().list(...)` | `GET` | `/sandbox/languages` | `Class<T> responseType` | `@Nullable T` |
| `sandbox().languages().list(...)` | `GET` | `/sandbox/languages` | `TypeReference<T> responseType` | `@Nullable T` |

The generic `request(...)` methods and `Endpoints` constants remain available.
