# Observability API

Service accessor: `frontal.observability()` (`ObservabilityClient`).

Named methods are generated from the committed route catalog. Build query values with `QueryParams` using exact API wire names. Routes without request schemas accept `JsonNode`; select `JsonNode` or a caller-provided model for unmodeled responses.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `deleteObservabilityAlertsRulesRuleId(...)` | `DELETE` | `/observability/alerts/rules/{param}` | `ruleId, query, Class<T> responseType` | `@Nullable T` |
| `deleteObservabilityAlertsRulesRuleId(...)` | `DELETE` | `/observability/alerts/rules/{param}` | `ruleId, query, TypeReference<T> responseType` | `@Nullable T` |
| `deleteObservabilityAlertsParam(...)` | `DELETE` | `/observability/alerts/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `deleteObservabilityAlertsParam(...)` | `DELETE` | `/observability/alerts/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `deleteObservabilityDashboardsParam(...)` | `DELETE` | `/observability/dashboards/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `deleteObservabilityDashboardsParam(...)` | `DELETE` | `/observability/dashboards/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getObservabilityAlerts(...)` | `GET` | `/observability/alerts` | `query, Class<T> responseType` | `@Nullable T` |
| `getObservabilityAlerts(...)` | `GET` | `/observability/alerts` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getObservabilityAlertsIncidents(...)` | `GET` | `/observability/alerts/incidents` | `query, Class<T> responseType` | `@Nullable T` |
| `getObservabilityAlertsIncidents(...)` | `GET` | `/observability/alerts/incidents` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getObservabilityAlertsRules(...)` | `GET` | `/observability/alerts/rules` | `query, Class<T> responseType` | `@Nullable T` |
| `getObservabilityAlertsRules(...)` | `GET` | `/observability/alerts/rules` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getObservabilityAlertsRulesRuleId(...)` | `GET` | `/observability/alerts/rules/{param}` | `ruleId, query, Class<T> responseType` | `@Nullable T` |
| `getObservabilityAlertsRulesRuleId(...)` | `GET` | `/observability/alerts/rules/{param}` | `ruleId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getObservabilityDashboards(...)` | `GET` | `/observability/dashboards` | `query, Class<T> responseType` | `@Nullable T` |
| `getObservabilityDashboards(...)` | `GET` | `/observability/dashboards` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getObservabilityDashboardsParam(...)` | `GET` | `/observability/dashboards/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getObservabilityDashboardsParam(...)` | `GET` | `/observability/dashboards/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getObservabilityEventsStats(...)` | `GET` | `/observability/events/stats` | `query, Class<T> responseType` | `@Nullable T` |
| `getObservabilityEventsStats(...)` | `GET` | `/observability/events/stats` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getObservabilityMetrics(...)` | `GET` | `/observability/metrics` | `query, Class<T> responseType` | `@Nullable T` |
| `getObservabilityMetrics(...)` | `GET` | `/observability/metrics` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getObservabilityMetricsList(...)` | `GET` | `/observability/metrics/list` | `query, Class<T> responseType` | `@Nullable T` |
| `getObservabilityMetricsList(...)` | `GET` | `/observability/metrics/list` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getObservabilityTraces(...)` | `GET` | `/observability/traces` | `query, Class<T> responseType` | `@Nullable T` |
| `getObservabilityTraces(...)` | `GET` | `/observability/traces` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getObservabilityTracesParam(...)` | `GET` | `/observability/traces/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getObservabilityTracesParam(...)` | `GET` | `/observability/traces/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `postObservabilityAlerts(...)` | `POST` | `/observability/alerts` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postObservabilityAlerts(...)` | `POST` | `/observability/alerts` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postObservabilityAlertsRules(...)` | `POST` | `/observability/alerts/rules` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postObservabilityAlertsRules(...)` | `POST` | `/observability/alerts/rules` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postObservabilityAlertsRulesRuleIdToggle(...)` | `POST` | `/observability/alerts/rules/{param}/toggle` | `ruleId, query, body, Class<T> responseType` | `@Nullable T` |
| `postObservabilityAlertsRulesRuleIdToggle(...)` | `POST` | `/observability/alerts/rules/{param}/toggle` | `ruleId, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postObservabilityAlertsParamDisable(...)` | `POST` | `/observability/alerts/{param}/disable` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postObservabilityAlertsParamDisable(...)` | `POST` | `/observability/alerts/{param}/disable` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postObservabilityAlertsParamEnable(...)` | `POST` | `/observability/alerts/{param}/enable` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postObservabilityAlertsParamEnable(...)` | `POST` | `/observability/alerts/{param}/enable` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postObservabilityDashboards(...)` | `POST` | `/observability/dashboards` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postObservabilityDashboards(...)` | `POST` | `/observability/dashboards` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postObservabilityDashboardsParamShare(...)` | `POST` | `/observability/dashboards/{param}/share` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postObservabilityDashboardsParamShare(...)` | `POST` | `/observability/dashboards/{param}/share` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postObservabilityEvents(...)` | `POST` | `/observability/events` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postObservabilityEvents(...)` | `POST` | `/observability/events` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postObservabilityEventsBatch(...)` | `POST` | `/observability/events/batch` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postObservabilityEventsBatch(...)` | `POST` | `/observability/events/batch` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postObservabilityLogsIngest(...)` | `POST` | `/observability/logs/ingest` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postObservabilityLogsIngest(...)` | `POST` | `/observability/logs/ingest` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postObservabilityLogsQuery(...)` | `POST` | `/observability/logs/query` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postObservabilityLogsQuery(...)` | `POST` | `/observability/logs/query` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postObservabilityMetricsIngest(...)` | `POST` | `/observability/metrics/ingest` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postObservabilityMetricsIngest(...)` | `POST` | `/observability/metrics/ingest` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postObservabilityTracesQuery(...)` | `POST` | `/observability/traces/query` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postObservabilityTracesQuery(...)` | `POST` | `/observability/traces/query` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `putObservabilityAlertsRulesRuleId(...)` | `PUT` | `/observability/alerts/rules/{param}` | `ruleId, query, body, Class<T> responseType` | `@Nullable T` |
| `putObservabilityAlertsRulesRuleId(...)` | `PUT` | `/observability/alerts/rules/{param}` | `ruleId, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `putObservabilityAlertsParam(...)` | `PUT` | `/observability/alerts/{param}` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `putObservabilityAlertsParam(...)` | `PUT` | `/observability/alerts/{param}` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `putObservabilityDashboardsParam(...)` | `PUT` | `/observability/dashboards/{param}` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `putObservabilityDashboardsParam(...)` | `PUT` | `/observability/dashboards/{param}` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `streamObservabilityLogsStream(...)` | `STREAM` | `/observability/logs/stream` | `query` | `Flow.Publisher<String>` |
| `streamObservabilityLogsStreamBlocking(...)` | `STREAM` | `/observability/logs/stream` | `query` | `SseEventIterator` |
| No catalogued operations | — | — | — | — |

The generic `request(...)` methods and `Endpoints` constants remain available.
