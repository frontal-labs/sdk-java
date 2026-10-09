# Events API

Service accessor: `frontal.events()` (`EventsClient`).

Named methods are generated from the committed route catalog. Build query values with `QueryParams` using exact API wire names. Routes without request schemas accept `JsonNode`; select `JsonNode` or a caller-provided model for unmodeled responses.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `getEvents(...)` | `GET` | `/events` | `query, Class<T> responseType` | `@Nullable T` |
| `getEvents(...)` | `GET` | `/events` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getEventsMonitoring(...)` | `GET` | `/events/monitoring` | `query, Class<T> responseType` | `@Nullable T` |
| `getEventsMonitoring(...)` | `GET` | `/events/monitoring` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getEventsId(...)` | `GET` | `/events/{param}` | `id, query, Class<T> responseType` | `@Nullable T` |
| `getEventsId(...)` | `GET` | `/events/{param}` | `id, query, TypeReference<T> responseType` | `@Nullable T` |
| `postEvents(...)` | `POST` | `/events` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postEvents(...)` | `POST` | `/events` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postEventsAnalytics(...)` | `POST` | `/events/analytics` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postEventsAnalytics(...)` | `POST` | `/events/analytics` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postEventsAnalyticsV2(...)` | `POST` | `/events/analytics-v2` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postEventsAnalyticsV2(...)` | `POST` | `/events/analytics-v2` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postEventsBenchmarkV1(...)` | `POST` | `/events/benchmark/v1` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postEventsBenchmarkV1(...)` | `POST` | `/events/benchmark/v1` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postEventsBenchmarkV2(...)` | `POST` | `/events/benchmark/v2` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postEventsBenchmarkV2(...)` | `POST` | `/events/benchmark/v2` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postEventsBulk(...)` | `POST` | `/events/bulk` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postEventsBulk(...)` | `POST` | `/events/bulk` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postEventsHuggingfaceBilling(...)` | `POST` | `/events/huggingface-billing` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postEventsHuggingfaceBilling(...)` | `POST` | `/events/huggingface-billing` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postEventsQuery(...)` | `POST` | `/events/query` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postEventsQuery(...)` | `POST` | `/events/query` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postEventsRawReprocessAll(...)` | `POST` | `/events/raw/reprocess/all` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postEventsRawReprocessAll(...)` | `POST` | `/events/raw/reprocess/all` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postEventsRawReprocessPending(...)` | `POST` | `/events/raw/reprocess/pending` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postEventsRawReprocessPending(...)` | `POST` | `/events/raw/reprocess/pending` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postEventsReprocess(...)` | `POST` | `/events/reprocess` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postEventsReprocess(...)` | `POST` | `/events/reprocess` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postEventsReprocessInternal(...)` | `POST` | `/events/reprocess/internal` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postEventsReprocessInternal(...)` | `POST` | `/events/reprocess/internal` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postEventsUsage(...)` | `POST` | `/events/usage` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postEventsUsage(...)` | `POST` | `/events/usage` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postEventsUsageMeter(...)` | `POST` | `/events/usage/meter` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postEventsUsageMeter(...)` | `POST` | `/events/usage/meter` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| No catalogued operations | — | — | — | — |

The generic `request(...)` methods and `Endpoints` constants remain available.
