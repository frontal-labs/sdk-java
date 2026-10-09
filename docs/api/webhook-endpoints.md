# WebhookEndpoints API

Service accessor: `frontal.webhookEndpoints()` (`WebhookEndpointsClient`).

Named methods are generated from the committed route catalog. Build query values with `QueryParams` using exact API wire names. Routes without request schemas accept `JsonNode`; select `JsonNode` or a caller-provided model for unmodeled responses.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `deleteWebhookEndpointsId(...)` | `DELETE` | `/webhook-endpoints/{param}` | `id, query, Class<T> responseType` | `@Nullable T` |
| `deleteWebhookEndpointsId(...)` | `DELETE` | `/webhook-endpoints/{param}` | `id, query, TypeReference<T> responseType` | `@Nullable T` |
| `getWebhookEndpoints(...)` | `GET` | `/webhook-endpoints` | `query, Class<T> responseType` | `@Nullable T` |
| `getWebhookEndpoints(...)` | `GET` | `/webhook-endpoints` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getWebhookEndpointsId(...)` | `GET` | `/webhook-endpoints/{param}` | `id, query, Class<T> responseType` | `@Nullable T` |
| `getWebhookEndpointsId(...)` | `GET` | `/webhook-endpoints/{param}` | `id, query, TypeReference<T> responseType` | `@Nullable T` |
| `getWebhookEndpointsIdDeliveries(...)` | `GET` | `/webhook-endpoints/{param}/deliveries` | `id, query, Class<T> responseType` | `@Nullable T` |
| `getWebhookEndpointsIdDeliveries(...)` | `GET` | `/webhook-endpoints/{param}/deliveries` | `id, query, TypeReference<T> responseType` | `@Nullable T` |
| `patchWebhookEndpointsId(...)` | `PATCH` | `/webhook-endpoints/{param}` | `id, query, body, Class<T> responseType` | `@Nullable T` |
| `patchWebhookEndpointsId(...)` | `PATCH` | `/webhook-endpoints/{param}` | `id, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postWebhookEndpoints(...)` | `POST` | `/webhook-endpoints` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postWebhookEndpoints(...)` | `POST` | `/webhook-endpoints` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postWebhookEndpointsIdRotateSecret(...)` | `POST` | `/webhook-endpoints/{param}/rotate-secret` | `id, query, body, Class<T> responseType` | `@Nullable T` |
| `postWebhookEndpointsIdRotateSecret(...)` | `POST` | `/webhook-endpoints/{param}/rotate-secret` | `id, query, body, TypeReference<T> responseType` | `@Nullable T` |
| No catalogued operations | — | — | — | — |

The generic `request(...)` methods and `Endpoints` constants remain available.
