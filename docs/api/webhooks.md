# Webhooks API

Service accessor: `frontal.webhooks()` (`WebhooksClient`).

Operations are grouped by resource path. Collection methods use `list` and `create`; item methods use `get`, `update`, and `delete`. Calls can omit `QueryParams` when no query values are needed. Use contract-defined `JsonNode` bodies and caller-selected response types where schemas are not available.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `webhooks().delete(...)` | `DELETE` | `/webhooks/{param}` | `String webhookId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `webhooks().delete(...)` | `DELETE` | `/webhooks/{param}` | `String webhookId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `webhooks().delete(...)` | `DELETE` | `/webhooks/{param}` | `String webhookId, Class<T> responseType` | `@Nullable T` |
| `webhooks().delete(...)` | `DELETE` | `/webhooks/{param}` | `String webhookId, TypeReference<T> responseType` | `@Nullable T` |
| `webhooks().list(...)` | `GET` | `/webhooks` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `webhooks().list(...)` | `GET` | `/webhooks` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `webhooks().list(...)` | `GET` | `/webhooks` | `Class<T> responseType` | `@Nullable T` |
| `webhooks().list(...)` | `GET` | `/webhooks` | `TypeReference<T> responseType` | `@Nullable T` |
| `webhooks().get(...)` | `GET` | `/webhooks/{param}` | `String webhookId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `webhooks().get(...)` | `GET` | `/webhooks/{param}` | `String webhookId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `webhooks().get(...)` | `GET` | `/webhooks/{param}` | `String webhookId, Class<T> responseType` | `@Nullable T` |
| `webhooks().get(...)` | `GET` | `/webhooks/{param}` | `String webhookId, TypeReference<T> responseType` | `@Nullable T` |
| `webhooks().create(...)` | `POST` | `/webhooks` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `webhooks().create(...)` | `POST` | `/webhooks` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `webhooks().create(...)` | `POST` | `/webhooks` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `webhooks().create(...)` | `POST` | `/webhooks` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `webhooks().rotateSecret(...)` | `POST` | `/webhooks/{param}/rotate-secret` | `String webhookId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `webhooks().rotateSecret(...)` | `POST` | `/webhooks/{param}/rotate-secret` | `String webhookId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `webhooks().rotateSecret(...)` | `POST` | `/webhooks/{param}/rotate-secret` | `String webhookId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `webhooks().rotateSecret(...)` | `POST` | `/webhooks/{param}/rotate-secret` | `String webhookId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `webhooks().update(...)` | `PUT` | `/webhooks/{param}` | `String webhookId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `webhooks().update(...)` | `PUT` | `/webhooks/{param}` | `String webhookId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `webhooks().update(...)` | `PUT` | `/webhooks/{param}` | `String webhookId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `webhooks().update(...)` | `PUT` | `/webhooks/{param}` | `String webhookId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `webhooks().deliveries().list(...)` | `GET` | `/webhooks/deliveries` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `webhooks().deliveries().list(...)` | `GET` | `/webhooks/deliveries` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `webhooks().deliveries().list(...)` | `GET` | `/webhooks/deliveries` | `Class<T> responseType` | `@Nullable T` |
| `webhooks().deliveries().list(...)` | `GET` | `/webhooks/deliveries` | `TypeReference<T> responseType` | `@Nullable T` |
| `webhooks().deliveries().get(...)` | `GET` | `/webhooks/deliveries/{param}` | `String deliveryId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `webhooks().deliveries().get(...)` | `GET` | `/webhooks/deliveries/{param}` | `String deliveryId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `webhooks().deliveries().get(...)` | `GET` | `/webhooks/deliveries/{param}` | `String deliveryId, Class<T> responseType` | `@Nullable T` |
| `webhooks().deliveries().get(...)` | `GET` | `/webhooks/deliveries/{param}` | `String deliveryId, TypeReference<T> responseType` | `@Nullable T` |
| `webhooks().deliveries().retry(...)` | `POST` | `/webhooks/deliveries/{param}/retry` | `String deliveryId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `webhooks().deliveries().retry(...)` | `POST` | `/webhooks/deliveries/{param}/retry` | `String deliveryId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `webhooks().deliveries().retry(...)` | `POST` | `/webhooks/deliveries/{param}/retry` | `String deliveryId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `webhooks().deliveries().retry(...)` | `POST` | `/webhooks/deliveries/{param}/retry` | `String deliveryId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `webhooks().stats().list(...)` | `GET` | `/webhooks/stats` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `webhooks().stats().list(...)` | `GET` | `/webhooks/stats` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `webhooks().stats().list(...)` | `GET` | `/webhooks/stats` | `Class<T> responseType` | `@Nullable T` |
| `webhooks().stats().list(...)` | `GET` | `/webhooks/stats` | `TypeReference<T> responseType` | `@Nullable T` |

The generic `request(...)` methods and `Endpoints` constants remain available.
