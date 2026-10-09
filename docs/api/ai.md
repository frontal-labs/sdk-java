# Ai API

Service accessor: `frontal.ai()` (`AiServiceClient`).

Named methods are generated from the committed route catalog. Build query values with `QueryParams` using exact API wire names. Routes without request schemas accept `JsonNode`; select `JsonNode` or a caller-provided model for unmodeled responses.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `getHealth(...)` | `GET` | `/health` | `query, Class<T> responseType` | `@Nullable T` |
| `getHealth(...)` | `GET` | `/health` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getInternalModels(...)` | `GET` | `/internal/models` | `query, Class<T> responseType` | `@Nullable T` |
| `getInternalModels(...)` | `GET` | `/internal/models` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getInternalModelsDefaults(...)` | `GET` | `/internal/models/defaults` | `query, Class<T> responseType` | `@Nullable T` |
| `getInternalModelsDefaults(...)` | `GET` | `/internal/models/defaults` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `postAiChatCompletions(...)` | `POST` | `/ai/chat/completions` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postAiChatCompletions(...)` | `POST` | `/ai/chat/completions` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postInternalEmbeddings(...)` | `POST` | `/internal/embeddings` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postInternalEmbeddings(...)` | `POST` | `/internal/embeddings` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postInternalPredictions(...)` | `POST` | `/internal/predictions` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postInternalPredictions(...)` | `POST` | `/internal/predictions` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postInternalRerank(...)` | `POST` | `/internal/rerank` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postInternalRerank(...)` | `POST` | `/internal/rerank` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postformdataInternalPredictions(...)` | `POSTFORMDATA` | `/internal/predictions` | `query, fields, files, Class<T> responseType` | `@Nullable T` |
| `postformdataInternalPredictions(...)` | `POSTFORMDATA` | `/internal/predictions` | `query, fields, files, TypeReference<T> responseType` | `@Nullable T` |
| `postrawInternalPredictions(...)` | `POSTRAW` | `/internal/predictions` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postrawInternalPredictions(...)` | `POSTRAW` | `/internal/predictions` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| No catalogued operations | — | — | — | — |

The generic `request(...)` methods and `Endpoints` constants remain available.
