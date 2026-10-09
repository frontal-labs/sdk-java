# Webhooks API

Service accessor: `frontal.webhooks()` (`WebhooksClient`).

Named methods are generated from the committed route catalog. Build query values with `QueryParams` using exact API wire names. Routes without request schemas accept `JsonNode`; select `JsonNode` or a caller-provided model for unmodeled responses.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `deleteWebhooksParam(...)` | `DELETE` | `/webhooks/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `deleteWebhooksParam(...)` | `DELETE` | `/webhooks/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getWebhooks(...)` | `GET` | `/webhooks` | `query, Class<T> responseType` | `@Nullable T` |
| `getWebhooks(...)` | `GET` | `/webhooks` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getWebhooksDeliveries(...)` | `GET` | `/webhooks/deliveries` | `query, Class<T> responseType` | `@Nullable T` |
| `getWebhooksDeliveries(...)` | `GET` | `/webhooks/deliveries` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getWebhooksDeliveriesParam(...)` | `GET` | `/webhooks/deliveries/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getWebhooksDeliveriesParam(...)` | `GET` | `/webhooks/deliveries/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getWebhooksStats(...)` | `GET` | `/webhooks/stats` | `query, Class<T> responseType` | `@Nullable T` |
| `getWebhooksStats(...)` | `GET` | `/webhooks/stats` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getWebhooksParam(...)` | `GET` | `/webhooks/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getWebhooksParam(...)` | `GET` | `/webhooks/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `postWebhooks(...)` | `POST` | `/webhooks` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postWebhooks(...)` | `POST` | `/webhooks` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postWebhooksDeliveriesParamRetry(...)` | `POST` | `/webhooks/deliveries/{param}/retry` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postWebhooksDeliveriesParamRetry(...)` | `POST` | `/webhooks/deliveries/{param}/retry` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postWebhooksParamRotateSecret(...)` | `POST` | `/webhooks/{param}/rotate-secret` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postWebhooksParamRotateSecret(...)` | `POST` | `/webhooks/{param}/rotate-secret` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `putWebhooksParam(...)` | `PUT` | `/webhooks/{param}` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `putWebhooksParam(...)` | `PUT` | `/webhooks/{param}` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| No catalogued operations | — | — | — | — |

The generic `request(...)` methods and `Endpoints` constants remain available.
