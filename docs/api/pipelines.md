# Pipelines API

Service accessor: `frontal.pipelines()` (`PipelinesClient`).

Named methods are generated from the committed route catalog. Build query values with `QueryParams` using exact API wire names. Routes without request schemas accept `JsonNode`; select `JsonNode` or a caller-provided model for unmodeled responses.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `getDataPipelinesCapabilities(...)` | `GET` | `/data/pipelines/capabilities` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataPipelinesCapabilities(...)` | `GET` | `/data/pipelines/capabilities` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataPipelinesHealth(...)` | `GET` | `/data/pipelines/health` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataPipelinesHealth(...)` | `GET` | `/data/pipelines/health` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataPipelinesInfo(...)` | `GET` | `/data/pipelines/info` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataPipelinesInfo(...)` | `GET` | `/data/pipelines/info` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataPipelinesPipelineRuns(...)` | `GET` | `/data/pipelines/pipeline-runs` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataPipelinesPipelineRuns(...)` | `GET` | `/data/pipelines/pipeline-runs` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataPipelinesPipelineRunsParam(...)` | `GET` | `/data/pipelines/pipeline-runs/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getDataPipelinesPipelineRunsParam(...)` | `GET` | `/data/pipelines/pipeline-runs/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataPipelinesPipelines(...)` | `GET` | `/data/pipelines/pipelines` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataPipelinesPipelines(...)` | `GET` | `/data/pipelines/pipelines` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataPipelinesPipelinesParam(...)` | `GET` | `/data/pipelines/pipelines/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getDataPipelinesPipelinesParam(...)` | `GET` | `/data/pipelines/pipelines/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataPipelinesRuns(...)` | `GET` | `/data/pipelines/runs` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataPipelinesRuns(...)` | `GET` | `/data/pipelines/runs` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `postDataPipelinesPipelines(...)` | `POST` | `/data/pipelines/pipelines` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postDataPipelinesPipelines(...)` | `POST` | `/data/pipelines/pipelines` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataPipelinesRuns(...)` | `POST` | `/data/pipelines/runs` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postDataPipelinesRuns(...)` | `POST` | `/data/pipelines/runs` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `streamDataPipelinesPipelineRunsParam(...)` | `STREAM` | `/data/pipelines/pipeline-runs/{param}` | `pathParam1, query` | `Flow.Publisher<String>` |
| `streamDataPipelinesPipelineRunsParamBlocking(...)` | `STREAM` | `/data/pipelines/pipeline-runs/{param}` | `pathParam1, query` | `SseEventIterator` |
| No catalogued operations | — | — | — | — |

The generic `request(...)` methods and `Endpoints` constants remain available.
