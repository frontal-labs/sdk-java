# Blob API

Service accessor: `frontal.blob()` (`BlobClient`).

Named methods are generated from the committed route catalog. Build query values with `QueryParams` using exact API wire names. Routes without request schemas accept `JsonNode`; select `JsonNode` or a caller-provided model for unmodeled responses.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `deleteBlobObjectParamParam(...)` | `DELETE` | `/blob/object/{param}/{param}` | `pathParam1, pathParam2, query, Class<T> responseType` | `@Nullable T` |
| `deleteBlobObjectParamParam(...)` | `DELETE` | `/blob/object/{param}/{param}` | `pathParam1, pathParam2, query, TypeReference<T> responseType` | `@Nullable T` |
| `getBlobObjectInfoParamParam(...)` | `GET` | `/blob/object/info/{param}/{param}` | `pathParam1, pathParam2, query, Class<T> responseType` | `@Nullable T` |
| `getBlobObjectInfoParamParam(...)` | `GET` | `/blob/object/info/{param}/{param}` | `pathParam1, pathParam2, query, TypeReference<T> responseType` | `@Nullable T` |
| `getBlobObjectParamParam(...)` | `GET` | `/blob/object/{param}/{param}` | `pathParam1, pathParam2, query, Class<T> responseType` | `@Nullable T` |
| `getBlobObjectParamParam(...)` | `GET` | `/blob/object/{param}/{param}` | `pathParam1, pathParam2, query, TypeReference<T> responseType` | `@Nullable T` |
| `postBlobObjectCopy(...)` | `POST` | `/blob/object/copy` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postBlobObjectCopy(...)` | `POST` | `/blob/object/copy` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postBlobObjectListParam(...)` | `POST` | `/blob/object/list/{param}` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postBlobObjectListParam(...)` | `POST` | `/blob/object/list/{param}` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postBlobObjectMove(...)` | `POST` | `/blob/object/move` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postBlobObjectMove(...)` | `POST` | `/blob/object/move` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postBlobObjectSignParamParam(...)` | `POST` | `/blob/object/sign/{param}/{param}` | `pathParam1, pathParam2, query, body, Class<T> responseType` | `@Nullable T` |
| `postBlobObjectSignParamParam(...)` | `POST` | `/blob/object/sign/{param}/{param}` | `pathParam1, pathParam2, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postformdataBlobObjectParamParam(...)` | `POSTFORMDATA` | `/blob/object/{param}/{param}` | `pathParam1, pathParam2, query, fields, files, Class<T> responseType` | `@Nullable T` |
| `postformdataBlobObjectParamParam(...)` | `POSTFORMDATA` | `/blob/object/{param}/{param}` | `pathParam1, pathParam2, query, fields, files, TypeReference<T> responseType` | `@Nullable T` |
| No catalogued operations | — | — | — | — |

The generic `request(...)` methods and `Endpoints` constants remain available.
