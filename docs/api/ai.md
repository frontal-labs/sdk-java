# Ai API

Service accessor: `frontal.ai()` (`AiServiceClient`).

Operations are grouped by resource path. Collection methods use `list` and `create`; item methods use `get`, `update`, and `delete`. Calls can omit `QueryParams` when no query values are needed. Use contract-defined `JsonNode` bodies and caller-selected response types where schemas are not available.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `ai().health(...)` | `GET` | `/health` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ai().health(...)` | `GET` | `/health` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ai().health(...)` | `GET` | `/health` | `Class<T> responseType` | `@Nullable T` |
| `ai().health(...)` | `GET` | `/health` | `TypeReference<T> responseType` | `@Nullable T` |
| `ai().internal().embed(...)` | `POST` | `/internal/embeddings` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ai().internal().embed(...)` | `POST` | `/internal/embeddings` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ai().internal().embed(...)` | `POST` | `/internal/embeddings` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ai().internal().embed(...)` | `POST` | `/internal/embeddings` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ai().internal().predict(...)` | `POST` | `/internal/predictions` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ai().internal().predict(...)` | `POST` | `/internal/predictions` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ai().internal().predict(...)` | `POST` | `/internal/predictions` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ai().internal().predict(...)` | `POST` | `/internal/predictions` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ai().internal().rerank(...)` | `POST` | `/internal/rerank` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ai().internal().rerank(...)` | `POST` | `/internal/rerank` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ai().internal().rerank(...)` | `POST` | `/internal/rerank` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ai().internal().rerank(...)` | `POST` | `/internal/rerank` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ai().internal().predictForm(...)` | `POSTFORMDATA` | `/internal/predictions` | `QueryParams query, Map<String, String> fields, Map<String, Path> files, Class<T> responseType` | `@Nullable T` |
| `ai().internal().predictForm(...)` | `POSTFORMDATA` | `/internal/predictions` | `QueryParams query, Map<String, String> fields, Map<String, Path> files, TypeReference<T> responseType` | `@Nullable T` |
| `ai().internal().predictForm(...)` | `POSTFORMDATA` | `/internal/predictions` | `Map<String, String> fields, Map<String, Path> files, Class<T> responseType` | `@Nullable T` |
| `ai().internal().predictForm(...)` | `POSTFORMDATA` | `/internal/predictions` | `Map<String, String> fields, Map<String, Path> files, TypeReference<T> responseType` | `@Nullable T` |
| `ai().internal().predictRaw(...)` | `POSTRAW` | `/internal/predictions` | `QueryParams query, byte[] body, Class<T> responseType` | `@Nullable T` |
| `ai().internal().predictRaw(...)` | `POSTRAW` | `/internal/predictions` | `QueryParams query, byte[] body, TypeReference<T> responseType` | `@Nullable T` |
| `ai().internal().predictRaw(...)` | `POSTRAW` | `/internal/predictions` | `byte[] body, Class<T> responseType` | `@Nullable T` |
| `ai().internal().predictRaw(...)` | `POSTRAW` | `/internal/predictions` | `byte[] body, TypeReference<T> responseType` | `@Nullable T` |
| `ai().chat().completions().create(...)` | `POST` | `/ai/chat/completions` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ai().chat().completions().create(...)` | `POST` | `/ai/chat/completions` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ai().chat().completions().create(...)` | `POST` | `/ai/chat/completions` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ai().chat().completions().create(...)` | `POST` | `/ai/chat/completions` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ai().internal().models().list(...)` | `GET` | `/internal/models` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ai().internal().models().list(...)` | `GET` | `/internal/models` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ai().internal().models().list(...)` | `GET` | `/internal/models` | `Class<T> responseType` | `@Nullable T` |
| `ai().internal().models().list(...)` | `GET` | `/internal/models` | `TypeReference<T> responseType` | `@Nullable T` |
| `ai().internal().models().defaults(...)` | `GET` | `/internal/models/defaults` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ai().internal().models().defaults(...)` | `GET` | `/internal/models/defaults` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ai().internal().models().defaults(...)` | `GET` | `/internal/models/defaults` | `Class<T> responseType` | `@Nullable T` |
| `ai().internal().models().defaults(...)` | `GET` | `/internal/models/defaults` | `TypeReference<T> responseType` | `@Nullable T` |

The generic `request(...)` methods and `Endpoints` constants remain available.
