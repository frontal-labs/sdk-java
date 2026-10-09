# WebhookEndpoints API

Service accessor: `frontal.webhookEndpoints()` (`WebhookEndpointsClient`).

Operations are grouped by resource path. Collection methods use `list` and `create`; item methods use `get`, `update`, and `delete`. Calls can omit `QueryParams` when no query values are needed. Use contract-defined `JsonNode` bodies and caller-selected response types where schemas are not available.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `webhookEndpoints().delete(...)` | `DELETE` | `/webhook-endpoints/{param}` | `String id, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `webhookEndpoints().delete(...)` | `DELETE` | `/webhook-endpoints/{param}` | `String id, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `webhookEndpoints().delete(...)` | `DELETE` | `/webhook-endpoints/{param}` | `String id, Class<T> responseType` | `@Nullable T` |
| `webhookEndpoints().delete(...)` | `DELETE` | `/webhook-endpoints/{param}` | `String id, TypeReference<T> responseType` | `@Nullable T` |
| `webhookEndpoints().list(...)` | `GET` | `/webhook-endpoints` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `webhookEndpoints().list(...)` | `GET` | `/webhook-endpoints` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `webhookEndpoints().list(...)` | `GET` | `/webhook-endpoints` | `Class<T> responseType` | `@Nullable T` |
| `webhookEndpoints().list(...)` | `GET` | `/webhook-endpoints` | `TypeReference<T> responseType` | `@Nullable T` |
| `webhookEndpoints().get(...)` | `GET` | `/webhook-endpoints/{param}` | `String id, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `webhookEndpoints().get(...)` | `GET` | `/webhook-endpoints/{param}` | `String id, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `webhookEndpoints().get(...)` | `GET` | `/webhook-endpoints/{param}` | `String id, Class<T> responseType` | `@Nullable T` |
| `webhookEndpoints().get(...)` | `GET` | `/webhook-endpoints/{param}` | `String id, TypeReference<T> responseType` | `@Nullable T` |
| `webhookEndpoints().update(...)` | `PATCH` | `/webhook-endpoints/{param}` | `String id, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `webhookEndpoints().update(...)` | `PATCH` | `/webhook-endpoints/{param}` | `String id, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `webhookEndpoints().update(...)` | `PATCH` | `/webhook-endpoints/{param}` | `String id, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `webhookEndpoints().update(...)` | `PATCH` | `/webhook-endpoints/{param}` | `String id, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `webhookEndpoints().create(...)` | `POST` | `/webhook-endpoints` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `webhookEndpoints().create(...)` | `POST` | `/webhook-endpoints` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `webhookEndpoints().create(...)` | `POST` | `/webhook-endpoints` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `webhookEndpoints().create(...)` | `POST` | `/webhook-endpoints` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `webhookEndpoints().rotateSecret(...)` | `POST` | `/webhook-endpoints/{param}/rotate-secret` | `String id, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `webhookEndpoints().rotateSecret(...)` | `POST` | `/webhook-endpoints/{param}/rotate-secret` | `String id, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `webhookEndpoints().rotateSecret(...)` | `POST` | `/webhook-endpoints/{param}/rotate-secret` | `String id, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `webhookEndpoints().rotateSecret(...)` | `POST` | `/webhook-endpoints/{param}/rotate-secret` | `String id, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `webhookEndpoints().deliveries().list(...)` | `GET` | `/webhook-endpoints/{param}/deliveries` | `String id, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `webhookEndpoints().deliveries().list(...)` | `GET` | `/webhook-endpoints/{param}/deliveries` | `String id, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `webhookEndpoints().deliveries().list(...)` | `GET` | `/webhook-endpoints/{param}/deliveries` | `String id, Class<T> responseType` | `@Nullable T` |
| `webhookEndpoints().deliveries().list(...)` | `GET` | `/webhook-endpoints/{param}/deliveries` | `String id, TypeReference<T> responseType` | `@Nullable T` |

The generic `request(...)` methods and `Endpoints` constants remain available.
