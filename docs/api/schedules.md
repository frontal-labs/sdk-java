# Schedules API

Service accessor: `frontal.schedules()` (`SchedulesClient`).

Operations are grouped by resource path. Collection methods use `list` and `create`; item methods use `get`, `update`, and `delete`. Calls can omit `QueryParams` when no query values are needed. Use contract-defined `JsonNode` bodies and caller-selected response types where schemas are not available.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `schedules().workflows().cron().parse(...)` | `POST` | `/workflows/cron/parse` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `schedules().workflows().cron().parse(...)` | `POST` | `/workflows/cron/parse` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `schedules().workflows().cron().parse(...)` | `POST` | `/workflows/cron/parse` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `schedules().workflows().cron().parse(...)` | `POST` | `/workflows/cron/parse` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `schedules().workflows().cron().validate(...)` | `POST` | `/workflows/cron/validate` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `schedules().workflows().cron().validate(...)` | `POST` | `/workflows/cron/validate` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `schedules().workflows().cron().validate(...)` | `POST` | `/workflows/cron/validate` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `schedules().workflows().cron().validate(...)` | `POST` | `/workflows/cron/validate` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `schedules().workflows().schedules().delete(...)` | `DELETE` | `/workflows/schedules/{param}` | `String scheduleId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `schedules().workflows().schedules().delete(...)` | `DELETE` | `/workflows/schedules/{param}` | `String scheduleId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `schedules().workflows().schedules().delete(...)` | `DELETE` | `/workflows/schedules/{param}` | `String scheduleId, Class<T> responseType` | `@Nullable T` |
| `schedules().workflows().schedules().delete(...)` | `DELETE` | `/workflows/schedules/{param}` | `String scheduleId, TypeReference<T> responseType` | `@Nullable T` |
| `schedules().workflows().schedules().list(...)` | `GET` | `/workflows/schedules` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `schedules().workflows().schedules().list(...)` | `GET` | `/workflows/schedules` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `schedules().workflows().schedules().list(...)` | `GET` | `/workflows/schedules` | `Class<T> responseType` | `@Nullable T` |
| `schedules().workflows().schedules().list(...)` | `GET` | `/workflows/schedules` | `TypeReference<T> responseType` | `@Nullable T` |
| `schedules().workflows().schedules().get(...)` | `GET` | `/workflows/schedules/{param}` | `String scheduleId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `schedules().workflows().schedules().get(...)` | `GET` | `/workflows/schedules/{param}` | `String scheduleId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `schedules().workflows().schedules().get(...)` | `GET` | `/workflows/schedules/{param}` | `String scheduleId, Class<T> responseType` | `@Nullable T` |
| `schedules().workflows().schedules().get(...)` | `GET` | `/workflows/schedules/{param}` | `String scheduleId, TypeReference<T> responseType` | `@Nullable T` |
| `schedules().workflows().schedules().update(...)` | `PATCH` | `/workflows/schedules/{param}` | `String scheduleId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `schedules().workflows().schedules().update(...)` | `PATCH` | `/workflows/schedules/{param}` | `String scheduleId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `schedules().workflows().schedules().update(...)` | `PATCH` | `/workflows/schedules/{param}` | `String scheduleId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `schedules().workflows().schedules().update(...)` | `PATCH` | `/workflows/schedules/{param}` | `String scheduleId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `schedules().workflows().schedules().create(...)` | `POST` | `/workflows/schedules` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `schedules().workflows().schedules().create(...)` | `POST` | `/workflows/schedules` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `schedules().workflows().schedules().create(...)` | `POST` | `/workflows/schedules` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `schedules().workflows().schedules().create(...)` | `POST` | `/workflows/schedules` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `schedules().workflows().schedules().pause(...)` | `POST` | `/workflows/schedules/{param}/pause` | `String scheduleId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `schedules().workflows().schedules().pause(...)` | `POST` | `/workflows/schedules/{param}/pause` | `String scheduleId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `schedules().workflows().schedules().pause(...)` | `POST` | `/workflows/schedules/{param}/pause` | `String scheduleId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `schedules().workflows().schedules().pause(...)` | `POST` | `/workflows/schedules/{param}/pause` | `String scheduleId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `schedules().workflows().schedules().resume(...)` | `POST` | `/workflows/schedules/{param}/resume` | `String scheduleId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `schedules().workflows().schedules().resume(...)` | `POST` | `/workflows/schedules/{param}/resume` | `String scheduleId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `schedules().workflows().schedules().resume(...)` | `POST` | `/workflows/schedules/{param}/resume` | `String scheduleId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `schedules().workflows().schedules().resume(...)` | `POST` | `/workflows/schedules/{param}/resume` | `String scheduleId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `schedules().workflows().schedules().trigger(...)` | `POST` | `/workflows/schedules/{param}/trigger` | `String scheduleId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `schedules().workflows().schedules().trigger(...)` | `POST` | `/workflows/schedules/{param}/trigger` | `String scheduleId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `schedules().workflows().schedules().trigger(...)` | `POST` | `/workflows/schedules/{param}/trigger` | `String scheduleId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `schedules().workflows().schedules().trigger(...)` | `POST` | `/workflows/schedules/{param}/trigger` | `String scheduleId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |

The generic `request(...)` methods and `Endpoints` constants remain available.
