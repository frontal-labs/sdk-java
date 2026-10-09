# Blob API

Service accessor: `frontal.blob()` (`BlobClient`).

Operations are grouped by resource path. Collection methods use `list` and `create`; item methods use `get`, `update`, and `delete`. Calls can omit `QueryParams` when no query values are needed. Use contract-defined `JsonNode` bodies and caller-selected response types where schemas are not available.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `blob().object().delete(...)` | `DELETE` | `/blob/object/{param}/{param}` | `String objectId, String objectId2, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `blob().object().delete(...)` | `DELETE` | `/blob/object/{param}/{param}` | `String objectId, String objectId2, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `blob().object().delete(...)` | `DELETE` | `/blob/object/{param}/{param}` | `String objectId, String objectId2, Class<T> responseType` | `@Nullable T` |
| `blob().object().delete(...)` | `DELETE` | `/blob/object/{param}/{param}` | `String objectId, String objectId2, TypeReference<T> responseType` | `@Nullable T` |
| `blob().object().get(...)` | `GET` | `/blob/object/{param}/{param}` | `String objectId, String objectId2, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `blob().object().get(...)` | `GET` | `/blob/object/{param}/{param}` | `String objectId, String objectId2, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `blob().object().get(...)` | `GET` | `/blob/object/{param}/{param}` | `String objectId, String objectId2, Class<T> responseType` | `@Nullable T` |
| `blob().object().get(...)` | `GET` | `/blob/object/{param}/{param}` | `String objectId, String objectId2, TypeReference<T> responseType` | `@Nullable T` |
| `blob().object().copy(...)` | `POST` | `/blob/object/copy` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `blob().object().copy(...)` | `POST` | `/blob/object/copy` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `blob().object().copy(...)` | `POST` | `/blob/object/copy` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `blob().object().copy(...)` | `POST` | `/blob/object/copy` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `blob().object().move(...)` | `POST` | `/blob/object/move` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `blob().object().move(...)` | `POST` | `/blob/object/move` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `blob().object().move(...)` | `POST` | `/blob/object/move` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `blob().object().move(...)` | `POST` | `/blob/object/move` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `blob().object().get2(...)` | `POSTFORMDATA` | `/blob/object/{param}/{param}` | `String objectId, String objectId2, QueryParams query, Map<String, String> fields, Map<String, Path> files, Class<T> responseType` | `@Nullable T` |
| `blob().object().get2(...)` | `POSTFORMDATA` | `/blob/object/{param}/{param}` | `String objectId, String objectId2, QueryParams query, Map<String, String> fields, Map<String, Path> files, TypeReference<T> responseType` | `@Nullable T` |
| `blob().object().get2(...)` | `POSTFORMDATA` | `/blob/object/{param}/{param}` | `String objectId, String objectId2, Map<String, String> fields, Map<String, Path> files, Class<T> responseType` | `@Nullable T` |
| `blob().object().get2(...)` | `POSTFORMDATA` | `/blob/object/{param}/{param}` | `String objectId, String objectId2, Map<String, String> fields, Map<String, Path> files, TypeReference<T> responseType` | `@Nullable T` |
| `blob().object().info().get(...)` | `GET` | `/blob/object/info/{param}/{param}` | `String infoId, String infoId2, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `blob().object().info().get(...)` | `GET` | `/blob/object/info/{param}/{param}` | `String infoId, String infoId2, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `blob().object().info().get(...)` | `GET` | `/blob/object/info/{param}/{param}` | `String infoId, String infoId2, Class<T> responseType` | `@Nullable T` |
| `blob().object().info().get(...)` | `GET` | `/blob/object/info/{param}/{param}` | `String infoId, String infoId2, TypeReference<T> responseType` | `@Nullable T` |
| `blob().object().list().get(...)` | `POST` | `/blob/object/list/{param}` | `String listId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `blob().object().list().get(...)` | `POST` | `/blob/object/list/{param}` | `String listId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `blob().object().list().get(...)` | `POST` | `/blob/object/list/{param}` | `String listId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `blob().object().list().get(...)` | `POST` | `/blob/object/list/{param}` | `String listId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `blob().object().sign().get(...)` | `POST` | `/blob/object/sign/{param}/{param}` | `String signId, String signId2, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `blob().object().sign().get(...)` | `POST` | `/blob/object/sign/{param}/{param}` | `String signId, String signId2, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `blob().object().sign().get(...)` | `POST` | `/blob/object/sign/{param}/{param}` | `String signId, String signId2, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `blob().object().sign().get(...)` | `POST` | `/blob/object/sign/{param}/{param}` | `String signId, String signId2, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |

The generic `request(...)` methods and `Endpoints` constants remain available.
