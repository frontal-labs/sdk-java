# Audit API

Service accessor: `frontal.audit()` (`AuditClient`).

Operations are grouped by resource path. Collection methods use `list` and `create`; item methods use `get`, `update`, and `delete`. Calls can omit `QueryParams` when no query values are needed. Use contract-defined `JsonNode` bodies and caller-selected response types where schemas are not available.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `audit().events().list(...)` | `GET` | `/audit/events` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `audit().events().list(...)` | `GET` | `/audit/events` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `audit().events().list(...)` | `GET` | `/audit/events` | `Class<T> responseType` | `@Nullable T` |
| `audit().events().list(...)` | `GET` | `/audit/events` | `TypeReference<T> responseType` | `@Nullable T` |
| `audit().events().get(...)` | `GET` | `/audit/events/{param}` | `String eventId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `audit().events().get(...)` | `GET` | `/audit/events/{param}` | `String eventId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `audit().events().get(...)` | `GET` | `/audit/events/{param}` | `String eventId, Class<T> responseType` | `@Nullable T` |
| `audit().events().get(...)` | `GET` | `/audit/events/{param}` | `String eventId, TypeReference<T> responseType` | `@Nullable T` |
| `audit().events().create(...)` | `POST` | `/audit/events` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `audit().events().create(...)` | `POST` | `/audit/events` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `audit().events().create(...)` | `POST` | `/audit/events` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `audit().events().create(...)` | `POST` | `/audit/events` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `audit().events().batch(...)` | `POST` | `/audit/events/batch` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `audit().events().batch(...)` | `POST` | `/audit/events/batch` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `audit().events().batch(...)` | `POST` | `/audit/events/batch` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `audit().events().batch(...)` | `POST` | `/audit/events/batch` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |

The generic `request(...)` methods and `Endpoints` constants remain available.
