# Observability API

Service accessor: `frontal.observability()` (`ObservabilityClient`).

Operations are grouped by resource path. Collection methods use `list` and `create`; item methods use `get`, `update`, and `delete`. Calls can omit `QueryParams` when no query values are needed. Use contract-defined `JsonNode` bodies and caller-selected response types where schemas are not available.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `observability().alerts().delete(...)` | `DELETE` | `/observability/alerts/{param}` | `String alertId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `observability().alerts().delete(...)` | `DELETE` | `/observability/alerts/{param}` | `String alertId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `observability().alerts().delete(...)` | `DELETE` | `/observability/alerts/{param}` | `String alertId, Class<T> responseType` | `@Nullable T` |
| `observability().alerts().delete(...)` | `DELETE` | `/observability/alerts/{param}` | `String alertId, TypeReference<T> responseType` | `@Nullable T` |
| `observability().alerts().list(...)` | `GET` | `/observability/alerts` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `observability().alerts().list(...)` | `GET` | `/observability/alerts` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `observability().alerts().list(...)` | `GET` | `/observability/alerts` | `Class<T> responseType` | `@Nullable T` |
| `observability().alerts().list(...)` | `GET` | `/observability/alerts` | `TypeReference<T> responseType` | `@Nullable T` |
| `observability().alerts().create(...)` | `POST` | `/observability/alerts` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `observability().alerts().create(...)` | `POST` | `/observability/alerts` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `observability().alerts().create(...)` | `POST` | `/observability/alerts` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `observability().alerts().create(...)` | `POST` | `/observability/alerts` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `observability().alerts().disable(...)` | `POST` | `/observability/alerts/{param}/disable` | `String alertId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `observability().alerts().disable(...)` | `POST` | `/observability/alerts/{param}/disable` | `String alertId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `observability().alerts().disable(...)` | `POST` | `/observability/alerts/{param}/disable` | `String alertId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `observability().alerts().disable(...)` | `POST` | `/observability/alerts/{param}/disable` | `String alertId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `observability().alerts().enable(...)` | `POST` | `/observability/alerts/{param}/enable` | `String alertId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `observability().alerts().enable(...)` | `POST` | `/observability/alerts/{param}/enable` | `String alertId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `observability().alerts().enable(...)` | `POST` | `/observability/alerts/{param}/enable` | `String alertId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `observability().alerts().enable(...)` | `POST` | `/observability/alerts/{param}/enable` | `String alertId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `observability().alerts().update(...)` | `PUT` | `/observability/alerts/{param}` | `String alertId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `observability().alerts().update(...)` | `PUT` | `/observability/alerts/{param}` | `String alertId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `observability().alerts().update(...)` | `PUT` | `/observability/alerts/{param}` | `String alertId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `observability().alerts().update(...)` | `PUT` | `/observability/alerts/{param}` | `String alertId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `observability().dashboards().delete(...)` | `DELETE` | `/observability/dashboards/{param}` | `String dashboardId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `observability().dashboards().delete(...)` | `DELETE` | `/observability/dashboards/{param}` | `String dashboardId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `observability().dashboards().delete(...)` | `DELETE` | `/observability/dashboards/{param}` | `String dashboardId, Class<T> responseType` | `@Nullable T` |
| `observability().dashboards().delete(...)` | `DELETE` | `/observability/dashboards/{param}` | `String dashboardId, TypeReference<T> responseType` | `@Nullable T` |
| `observability().dashboards().list(...)` | `GET` | `/observability/dashboards` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `observability().dashboards().list(...)` | `GET` | `/observability/dashboards` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `observability().dashboards().list(...)` | `GET` | `/observability/dashboards` | `Class<T> responseType` | `@Nullable T` |
| `observability().dashboards().list(...)` | `GET` | `/observability/dashboards` | `TypeReference<T> responseType` | `@Nullable T` |
| `observability().dashboards().get(...)` | `GET` | `/observability/dashboards/{param}` | `String dashboardId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `observability().dashboards().get(...)` | `GET` | `/observability/dashboards/{param}` | `String dashboardId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `observability().dashboards().get(...)` | `GET` | `/observability/dashboards/{param}` | `String dashboardId, Class<T> responseType` | `@Nullable T` |
| `observability().dashboards().get(...)` | `GET` | `/observability/dashboards/{param}` | `String dashboardId, TypeReference<T> responseType` | `@Nullable T` |
| `observability().dashboards().create(...)` | `POST` | `/observability/dashboards` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `observability().dashboards().create(...)` | `POST` | `/observability/dashboards` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `observability().dashboards().create(...)` | `POST` | `/observability/dashboards` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `observability().dashboards().create(...)` | `POST` | `/observability/dashboards` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `observability().dashboards().share(...)` | `POST` | `/observability/dashboards/{param}/share` | `String dashboardId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `observability().dashboards().share(...)` | `POST` | `/observability/dashboards/{param}/share` | `String dashboardId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `observability().dashboards().share(...)` | `POST` | `/observability/dashboards/{param}/share` | `String dashboardId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `observability().dashboards().share(...)` | `POST` | `/observability/dashboards/{param}/share` | `String dashboardId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `observability().dashboards().update(...)` | `PUT` | `/observability/dashboards/{param}` | `String dashboardId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `observability().dashboards().update(...)` | `PUT` | `/observability/dashboards/{param}` | `String dashboardId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `observability().dashboards().update(...)` | `PUT` | `/observability/dashboards/{param}` | `String dashboardId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `observability().dashboards().update(...)` | `PUT` | `/observability/dashboards/{param}` | `String dashboardId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `observability().events().create(...)` | `POST` | `/observability/events` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `observability().events().create(...)` | `POST` | `/observability/events` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `observability().events().create(...)` | `POST` | `/observability/events` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `observability().events().create(...)` | `POST` | `/observability/events` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `observability().events().batch(...)` | `POST` | `/observability/events/batch` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `observability().events().batch(...)` | `POST` | `/observability/events/batch` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `observability().events().batch(...)` | `POST` | `/observability/events/batch` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `observability().events().batch(...)` | `POST` | `/observability/events/batch` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `observability().logs().ingest(...)` | `POST` | `/observability/logs/ingest` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `observability().logs().ingest(...)` | `POST` | `/observability/logs/ingest` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `observability().logs().ingest(...)` | `POST` | `/observability/logs/ingest` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `observability().logs().ingest(...)` | `POST` | `/observability/logs/ingest` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `observability().logs().query(...)` | `POST` | `/observability/logs/query` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `observability().logs().query(...)` | `POST` | `/observability/logs/query` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `observability().logs().query(...)` | `POST` | `/observability/logs/query` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `observability().logs().query(...)` | `POST` | `/observability/logs/query` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `observability().logs().stream(...)` | `STREAM` | `/observability/logs/stream` | `QueryParams query` | `Flow.Publisher<String>` |
| `observability().logs().stream(...)` | `STREAM` | `/observability/logs/stream` | `` | `Flow.Publisher<String>` |
| `observability().logs().streamBlocking(...)` | `STREAM` | `/observability/logs/stream` | `QueryParams query` | `SseEventIterator` |
| `observability().logs().streamBlocking(...)` | `STREAM` | `/observability/logs/stream` | `` | `SseEventIterator` |
| `observability().metrics().list(...)` | `GET` | `/observability/metrics` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `observability().metrics().list(...)` | `GET` | `/observability/metrics` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `observability().metrics().list(...)` | `GET` | `/observability/metrics` | `Class<T> responseType` | `@Nullable T` |
| `observability().metrics().list(...)` | `GET` | `/observability/metrics` | `TypeReference<T> responseType` | `@Nullable T` |
| `observability().metrics().getList(...)` | `GET` | `/observability/metrics/list` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `observability().metrics().getList(...)` | `GET` | `/observability/metrics/list` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `observability().metrics().getList(...)` | `GET` | `/observability/metrics/list` | `Class<T> responseType` | `@Nullable T` |
| `observability().metrics().getList(...)` | `GET` | `/observability/metrics/list` | `TypeReference<T> responseType` | `@Nullable T` |
| `observability().metrics().ingest(...)` | `POST` | `/observability/metrics/ingest` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `observability().metrics().ingest(...)` | `POST` | `/observability/metrics/ingest` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `observability().metrics().ingest(...)` | `POST` | `/observability/metrics/ingest` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `observability().metrics().ingest(...)` | `POST` | `/observability/metrics/ingest` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `observability().traces().list(...)` | `GET` | `/observability/traces` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `observability().traces().list(...)` | `GET` | `/observability/traces` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `observability().traces().list(...)` | `GET` | `/observability/traces` | `Class<T> responseType` | `@Nullable T` |
| `observability().traces().list(...)` | `GET` | `/observability/traces` | `TypeReference<T> responseType` | `@Nullable T` |
| `observability().traces().get(...)` | `GET` | `/observability/traces/{param}` | `String traceId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `observability().traces().get(...)` | `GET` | `/observability/traces/{param}` | `String traceId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `observability().traces().get(...)` | `GET` | `/observability/traces/{param}` | `String traceId, Class<T> responseType` | `@Nullable T` |
| `observability().traces().get(...)` | `GET` | `/observability/traces/{param}` | `String traceId, TypeReference<T> responseType` | `@Nullable T` |
| `observability().traces().query(...)` | `POST` | `/observability/traces/query` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `observability().traces().query(...)` | `POST` | `/observability/traces/query` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `observability().traces().query(...)` | `POST` | `/observability/traces/query` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `observability().traces().query(...)` | `POST` | `/observability/traces/query` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `observability().alerts().incidents().list(...)` | `GET` | `/observability/alerts/incidents` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `observability().alerts().incidents().list(...)` | `GET` | `/observability/alerts/incidents` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `observability().alerts().incidents().list(...)` | `GET` | `/observability/alerts/incidents` | `Class<T> responseType` | `@Nullable T` |
| `observability().alerts().incidents().list(...)` | `GET` | `/observability/alerts/incidents` | `TypeReference<T> responseType` | `@Nullable T` |
| `observability().alerts().rules().delete(...)` | `DELETE` | `/observability/alerts/rules/{param}` | `String ruleId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `observability().alerts().rules().delete(...)` | `DELETE` | `/observability/alerts/rules/{param}` | `String ruleId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `observability().alerts().rules().delete(...)` | `DELETE` | `/observability/alerts/rules/{param}` | `String ruleId, Class<T> responseType` | `@Nullable T` |
| `observability().alerts().rules().delete(...)` | `DELETE` | `/observability/alerts/rules/{param}` | `String ruleId, TypeReference<T> responseType` | `@Nullable T` |
| `observability().alerts().rules().list(...)` | `GET` | `/observability/alerts/rules` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `observability().alerts().rules().list(...)` | `GET` | `/observability/alerts/rules` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `observability().alerts().rules().list(...)` | `GET` | `/observability/alerts/rules` | `Class<T> responseType` | `@Nullable T` |
| `observability().alerts().rules().list(...)` | `GET` | `/observability/alerts/rules` | `TypeReference<T> responseType` | `@Nullable T` |
| `observability().alerts().rules().get(...)` | `GET` | `/observability/alerts/rules/{param}` | `String ruleId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `observability().alerts().rules().get(...)` | `GET` | `/observability/alerts/rules/{param}` | `String ruleId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `observability().alerts().rules().get(...)` | `GET` | `/observability/alerts/rules/{param}` | `String ruleId, Class<T> responseType` | `@Nullable T` |
| `observability().alerts().rules().get(...)` | `GET` | `/observability/alerts/rules/{param}` | `String ruleId, TypeReference<T> responseType` | `@Nullable T` |
| `observability().alerts().rules().create(...)` | `POST` | `/observability/alerts/rules` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `observability().alerts().rules().create(...)` | `POST` | `/observability/alerts/rules` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `observability().alerts().rules().create(...)` | `POST` | `/observability/alerts/rules` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `observability().alerts().rules().create(...)` | `POST` | `/observability/alerts/rules` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `observability().alerts().rules().toggle(...)` | `POST` | `/observability/alerts/rules/{param}/toggle` | `String ruleId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `observability().alerts().rules().toggle(...)` | `POST` | `/observability/alerts/rules/{param}/toggle` | `String ruleId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `observability().alerts().rules().toggle(...)` | `POST` | `/observability/alerts/rules/{param}/toggle` | `String ruleId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `observability().alerts().rules().toggle(...)` | `POST` | `/observability/alerts/rules/{param}/toggle` | `String ruleId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `observability().alerts().rules().update(...)` | `PUT` | `/observability/alerts/rules/{param}` | `String ruleId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `observability().alerts().rules().update(...)` | `PUT` | `/observability/alerts/rules/{param}` | `String ruleId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `observability().alerts().rules().update(...)` | `PUT` | `/observability/alerts/rules/{param}` | `String ruleId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `observability().alerts().rules().update(...)` | `PUT` | `/observability/alerts/rules/{param}` | `String ruleId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `observability().events().stats().list(...)` | `GET` | `/observability/events/stats` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `observability().events().stats().list(...)` | `GET` | `/observability/events/stats` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `observability().events().stats().list(...)` | `GET` | `/observability/events/stats` | `Class<T> responseType` | `@Nullable T` |
| `observability().events().stats().list(...)` | `GET` | `/observability/events/stats` | `TypeReference<T> responseType` | `@Nullable T` |

The generic `request(...)` methods and `Endpoints` constants remain available.
