# Pipelines API

Service accessor: `frontal.pipelines()` (`PipelinesClient`).

Operations are grouped by resource path. Collection methods use `list` and `create`; item methods use `get`, `update`, and `delete`. Calls can omit `QueryParams` when no query values are needed. Use contract-defined `JsonNode` bodies and caller-selected response types where schemas are not available.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `pipelines().data().pipelines().health(...)` | `GET` | `/data/pipelines/health` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().health(...)` | `GET` | `/data/pipelines/health` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().health(...)` | `GET` | `/data/pipelines/health` | `Class<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().health(...)` | `GET` | `/data/pipelines/health` | `TypeReference<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().getInfo(...)` | `GET` | `/data/pipelines/info` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().getInfo(...)` | `GET` | `/data/pipelines/info` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().getInfo(...)` | `GET` | `/data/pipelines/info` | `Class<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().getInfo(...)` | `GET` | `/data/pipelines/info` | `TypeReference<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().capabilities().list(...)` | `GET` | `/data/pipelines/capabilities` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().capabilities().list(...)` | `GET` | `/data/pipelines/capabilities` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().capabilities().list(...)` | `GET` | `/data/pipelines/capabilities` | `Class<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().capabilities().list(...)` | `GET` | `/data/pipelines/capabilities` | `TypeReference<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().pipelineRuns().list(...)` | `GET` | `/data/pipelines/pipeline-runs` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().pipelineRuns().list(...)` | `GET` | `/data/pipelines/pipeline-runs` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().pipelineRuns().list(...)` | `GET` | `/data/pipelines/pipeline-runs` | `Class<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().pipelineRuns().list(...)` | `GET` | `/data/pipelines/pipeline-runs` | `TypeReference<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().pipelineRuns().get(...)` | `GET` | `/data/pipelines/pipeline-runs/{param}` | `String pipelineRunId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().pipelineRuns().get(...)` | `GET` | `/data/pipelines/pipeline-runs/{param}` | `String pipelineRunId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().pipelineRuns().get(...)` | `GET` | `/data/pipelines/pipeline-runs/{param}` | `String pipelineRunId, Class<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().pipelineRuns().get(...)` | `GET` | `/data/pipelines/pipeline-runs/{param}` | `String pipelineRunId, TypeReference<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().pipelineRuns().get2(...)` | `STREAM` | `/data/pipelines/pipeline-runs/{param}` | `String pipelineRunId, QueryParams query` | `Flow.Publisher<String>` |
| `pipelines().data().pipelines().pipelineRuns().get2(...)` | `STREAM` | `/data/pipelines/pipeline-runs/{param}` | `String pipelineRunId` | `Flow.Publisher<String>` |
| `pipelines().data().pipelines().pipelineRuns().get2Blocking(...)` | `STREAM` | `/data/pipelines/pipeline-runs/{param}` | `String pipelineRunId, QueryParams query` | `SseEventIterator` |
| `pipelines().data().pipelines().pipelineRuns().get2Blocking(...)` | `STREAM` | `/data/pipelines/pipeline-runs/{param}` | `String pipelineRunId` | `SseEventIterator` |
| `pipelines().data().pipelines().pipelines().list(...)` | `GET` | `/data/pipelines/pipelines` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().pipelines().list(...)` | `GET` | `/data/pipelines/pipelines` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().pipelines().list(...)` | `GET` | `/data/pipelines/pipelines` | `Class<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().pipelines().list(...)` | `GET` | `/data/pipelines/pipelines` | `TypeReference<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().pipelines().get(...)` | `GET` | `/data/pipelines/pipelines/{param}` | `String pipelineId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().pipelines().get(...)` | `GET` | `/data/pipelines/pipelines/{param}` | `String pipelineId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().pipelines().get(...)` | `GET` | `/data/pipelines/pipelines/{param}` | `String pipelineId, Class<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().pipelines().get(...)` | `GET` | `/data/pipelines/pipelines/{param}` | `String pipelineId, TypeReference<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().pipelines().create(...)` | `POST` | `/data/pipelines/pipelines` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().pipelines().create(...)` | `POST` | `/data/pipelines/pipelines` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().pipelines().create(...)` | `POST` | `/data/pipelines/pipelines` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().pipelines().create(...)` | `POST` | `/data/pipelines/pipelines` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().runs().list(...)` | `GET` | `/data/pipelines/runs` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().runs().list(...)` | `GET` | `/data/pipelines/runs` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().runs().list(...)` | `GET` | `/data/pipelines/runs` | `Class<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().runs().list(...)` | `GET` | `/data/pipelines/runs` | `TypeReference<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().runs().create(...)` | `POST` | `/data/pipelines/runs` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().runs().create(...)` | `POST` | `/data/pipelines/runs` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().runs().create(...)` | `POST` | `/data/pipelines/runs` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `pipelines().data().pipelines().runs().create(...)` | `POST` | `/data/pipelines/runs` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |

The generic `request(...)` methods and `Endpoints` constants remain available.
