# Events API

Service accessor: `frontal.events()` (`EventsClient`).

Operations are grouped by resource path. Collection methods use `list` and `create`; item methods use `get`, `update`, and `delete`. Calls can omit `QueryParams` when no query values are needed. Use contract-defined `JsonNode` bodies and caller-selected response types where schemas are not available.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `events().list(...)` | `GET` | `/events` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `events().list(...)` | `GET` | `/events` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `events().list(...)` | `GET` | `/events` | `Class<T> responseType` | `@Nullable T` |
| `events().list(...)` | `GET` | `/events` | `TypeReference<T> responseType` | `@Nullable T` |
| `events().getMonitoring(...)` | `GET` | `/events/monitoring` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `events().getMonitoring(...)` | `GET` | `/events/monitoring` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `events().getMonitoring(...)` | `GET` | `/events/monitoring` | `Class<T> responseType` | `@Nullable T` |
| `events().getMonitoring(...)` | `GET` | `/events/monitoring` | `TypeReference<T> responseType` | `@Nullable T` |
| `events().get(...)` | `GET` | `/events/{param}` | `String id, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `events().get(...)` | `GET` | `/events/{param}` | `String id, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `events().get(...)` | `GET` | `/events/{param}` | `String id, Class<T> responseType` | `@Nullable T` |
| `events().get(...)` | `GET` | `/events/{param}` | `String id, TypeReference<T> responseType` | `@Nullable T` |
| `events().create(...)` | `POST` | `/events` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `events().create(...)` | `POST` | `/events` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `events().create(...)` | `POST` | `/events` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `events().create(...)` | `POST` | `/events` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `events().analytics(...)` | `POST` | `/events/analytics` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `events().analytics(...)` | `POST` | `/events/analytics` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `events().analytics(...)` | `POST` | `/events/analytics` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `events().analytics(...)` | `POST` | `/events/analytics` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `events().createAnalyticsV2(...)` | `POST` | `/events/analytics-v2` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `events().createAnalyticsV2(...)` | `POST` | `/events/analytics-v2` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `events().createAnalyticsV2(...)` | `POST` | `/events/analytics-v2` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `events().createAnalyticsV2(...)` | `POST` | `/events/analytics-v2` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `events().bulk(...)` | `POST` | `/events/bulk` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `events().bulk(...)` | `POST` | `/events/bulk` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `events().bulk(...)` | `POST` | `/events/bulk` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `events().bulk(...)` | `POST` | `/events/bulk` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `events().createHuggingfaceBilling(...)` | `POST` | `/events/huggingface-billing` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `events().createHuggingfaceBilling(...)` | `POST` | `/events/huggingface-billing` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `events().createHuggingfaceBilling(...)` | `POST` | `/events/huggingface-billing` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `events().createHuggingfaceBilling(...)` | `POST` | `/events/huggingface-billing` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `events().query(...)` | `POST` | `/events/query` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `events().query(...)` | `POST` | `/events/query` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `events().query(...)` | `POST` | `/events/query` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `events().query(...)` | `POST` | `/events/query` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `events().reprocess(...)` | `POST` | `/events/reprocess` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `events().reprocess(...)` | `POST` | `/events/reprocess` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `events().reprocess(...)` | `POST` | `/events/reprocess` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `events().reprocess(...)` | `POST` | `/events/reprocess` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `events().usage(...)` | `POST` | `/events/usage` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `events().usage(...)` | `POST` | `/events/usage` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `events().usage(...)` | `POST` | `/events/usage` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `events().usage(...)` | `POST` | `/events/usage` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `events().benchmark().createV1(...)` | `POST` | `/events/benchmark/v1` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `events().benchmark().createV1(...)` | `POST` | `/events/benchmark/v1` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `events().benchmark().createV1(...)` | `POST` | `/events/benchmark/v1` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `events().benchmark().createV1(...)` | `POST` | `/events/benchmark/v1` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `events().benchmark().createV2(...)` | `POST` | `/events/benchmark/v2` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `events().benchmark().createV2(...)` | `POST` | `/events/benchmark/v2` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `events().benchmark().createV2(...)` | `POST` | `/events/benchmark/v2` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `events().benchmark().createV2(...)` | `POST` | `/events/benchmark/v2` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `events().reprocess().createInternal(...)` | `POST` | `/events/reprocess/internal` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `events().reprocess().createInternal(...)` | `POST` | `/events/reprocess/internal` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `events().reprocess().createInternal(...)` | `POST` | `/events/reprocess/internal` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `events().reprocess().createInternal(...)` | `POST` | `/events/reprocess/internal` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `events().usage().createMeter(...)` | `POST` | `/events/usage/meter` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `events().usage().createMeter(...)` | `POST` | `/events/usage/meter` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `events().usage().createMeter(...)` | `POST` | `/events/usage/meter` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `events().usage().createMeter(...)` | `POST` | `/events/usage/meter` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `events().raw().reprocess().createAll(...)` | `POST` | `/events/raw/reprocess/all` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `events().raw().reprocess().createAll(...)` | `POST` | `/events/raw/reprocess/all` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `events().raw().reprocess().createAll(...)` | `POST` | `/events/raw/reprocess/all` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `events().raw().reprocess().createAll(...)` | `POST` | `/events/raw/reprocess/all` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `events().raw().reprocess().createPending(...)` | `POST` | `/events/raw/reprocess/pending` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `events().raw().reprocess().createPending(...)` | `POST` | `/events/raw/reprocess/pending` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `events().raw().reprocess().createPending(...)` | `POST` | `/events/raw/reprocess/pending` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `events().raw().reprocess().createPending(...)` | `POST` | `/events/raw/reprocess/pending` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |

The generic `request(...)` methods and `Endpoints` constants remain available.
