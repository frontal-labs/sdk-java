# Audit API

Service accessor: `frontal.audit()` (`AuditClient`).

Named methods are generated from the committed route catalog. Build query values with `QueryParams` using exact API wire names. Routes without request schemas accept `JsonNode`; select `JsonNode` or a caller-provided model for unmodeled responses.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `getAuditEvents(...)` | `GET` | `/audit/events` | `query, Class<T> responseType` | `@Nullable T` |
| `getAuditEvents(...)` | `GET` | `/audit/events` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getAuditEventsParam(...)` | `GET` | `/audit/events/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getAuditEventsParam(...)` | `GET` | `/audit/events/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `postAuditEvents(...)` | `POST` | `/audit/events` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postAuditEvents(...)` | `POST` | `/audit/events` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuditEventsBatch(...)` | `POST` | `/audit/events/batch` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postAuditEventsBatch(...)` | `POST` | `/audit/events/batch` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| No catalogued operations | — | — | — | — |

The generic `request(...)` methods and `Endpoints` constants remain available.
