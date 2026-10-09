# Data API

Service accessor: `frontal.data()` (`DataClient`).

Operations are grouped by resource path. Collection methods use `list` and `create`; item methods use `get`, `update`, and `delete`. Calls can omit `QueryParams` when no query values are needed. Use contract-defined `JsonNode` bodies and caller-selected response types where schemas are not available.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `data().aggregations().health(...)` | `GET` | `/data/aggregations/health` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().aggregations().health(...)` | `GET` | `/data/aggregations/health` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().aggregations().health(...)` | `GET` | `/data/aggregations/health` | `Class<T> responseType` | `@Nullable T` |
| `data().aggregations().health(...)` | `GET` | `/data/aggregations/health` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().aggregations().getInfo(...)` | `GET` | `/data/aggregations/info` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().aggregations().getInfo(...)` | `GET` | `/data/aggregations/info` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().aggregations().getInfo(...)` | `GET` | `/data/aggregations/info` | `Class<T> responseType` | `@Nullable T` |
| `data().aggregations().getInfo(...)` | `GET` | `/data/aggregations/info` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().archival().health(...)` | `GET` | `/data/archival/health` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().archival().health(...)` | `GET` | `/data/archival/health` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().archival().health(...)` | `GET` | `/data/archival/health` | `Class<T> responseType` | `@Nullable T` |
| `data().archival().health(...)` | `GET` | `/data/archival/health` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().archival().getInfo(...)` | `GET` | `/data/archival/info` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().archival().getInfo(...)` | `GET` | `/data/archival/info` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().archival().getInfo(...)` | `GET` | `/data/archival/info` | `Class<T> responseType` | `@Nullable T` |
| `data().archival().getInfo(...)` | `GET` | `/data/archival/info` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().catalog().health(...)` | `GET` | `/data/catalog/health` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().catalog().health(...)` | `GET` | `/data/catalog/health` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().catalog().health(...)` | `GET` | `/data/catalog/health` | `Class<T> responseType` | `@Nullable T` |
| `data().catalog().health(...)` | `GET` | `/data/catalog/health` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().catalog().getInfo(...)` | `GET` | `/data/catalog/info` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().catalog().getInfo(...)` | `GET` | `/data/catalog/info` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().catalog().getInfo(...)` | `GET` | `/data/catalog/info` | `Class<T> responseType` | `@Nullable T` |
| `data().catalog().getInfo(...)` | `GET` | `/data/catalog/info` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().enrichment().health(...)` | `GET` | `/data/enrichment/health` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().enrichment().health(...)` | `GET` | `/data/enrichment/health` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().enrichment().health(...)` | `GET` | `/data/enrichment/health` | `Class<T> responseType` | `@Nullable T` |
| `data().enrichment().health(...)` | `GET` | `/data/enrichment/health` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().enrichment().getInfo(...)` | `GET` | `/data/enrichment/info` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().enrichment().getInfo(...)` | `GET` | `/data/enrichment/info` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().enrichment().getInfo(...)` | `GET` | `/data/enrichment/info` | `Class<T> responseType` | `@Nullable T` |
| `data().enrichment().getInfo(...)` | `GET` | `/data/enrichment/info` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().exports().health(...)` | `GET` | `/data/exports/health` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().exports().health(...)` | `GET` | `/data/exports/health` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().exports().health(...)` | `GET` | `/data/exports/health` | `Class<T> responseType` | `@Nullable T` |
| `data().exports().health(...)` | `GET` | `/data/exports/health` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().exports().getInfo(...)` | `GET` | `/data/exports/info` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().exports().getInfo(...)` | `GET` | `/data/exports/info` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().exports().getInfo(...)` | `GET` | `/data/exports/info` | `Class<T> responseType` | `@Nullable T` |
| `data().exports().getInfo(...)` | `GET` | `/data/exports/info` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().ingest().health(...)` | `GET` | `/data/ingest/health` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().ingest().health(...)` | `GET` | `/data/ingest/health` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().ingest().health(...)` | `GET` | `/data/ingest/health` | `Class<T> responseType` | `@Nullable T` |
| `data().ingest().health(...)` | `GET` | `/data/ingest/health` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().ingest().getInfo(...)` | `GET` | `/data/ingest/info` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().ingest().getInfo(...)` | `GET` | `/data/ingest/info` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().ingest().getInfo(...)` | `GET` | `/data/ingest/info` | `Class<T> responseType` | `@Nullable T` |
| `data().ingest().getInfo(...)` | `GET` | `/data/ingest/info` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().normalization().health(...)` | `GET` | `/data/normalization/health` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().normalization().health(...)` | `GET` | `/data/normalization/health` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().normalization().health(...)` | `GET` | `/data/normalization/health` | `Class<T> responseType` | `@Nullable T` |
| `data().normalization().health(...)` | `GET` | `/data/normalization/health` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().normalization().getInfo(...)` | `GET` | `/data/normalization/info` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().normalization().getInfo(...)` | `GET` | `/data/normalization/info` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().normalization().getInfo(...)` | `GET` | `/data/normalization/info` | `Class<T> responseType` | `@Nullable T` |
| `data().normalization().getInfo(...)` | `GET` | `/data/normalization/info` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().pipelines().health(...)` | `GET` | `/data/pipelines/health` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().pipelines().health(...)` | `GET` | `/data/pipelines/health` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().pipelines().health(...)` | `GET` | `/data/pipelines/health` | `Class<T> responseType` | `@Nullable T` |
| `data().pipelines().health(...)` | `GET` | `/data/pipelines/health` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().pipelines().getInfo(...)` | `GET` | `/data/pipelines/info` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().pipelines().getInfo(...)` | `GET` | `/data/pipelines/info` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().pipelines().getInfo(...)` | `GET` | `/data/pipelines/info` | `Class<T> responseType` | `@Nullable T` |
| `data().pipelines().getInfo(...)` | `GET` | `/data/pipelines/info` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().quality().health(...)` | `GET` | `/data/quality/health` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().quality().health(...)` | `GET` | `/data/quality/health` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().quality().health(...)` | `GET` | `/data/quality/health` | `Class<T> responseType` | `@Nullable T` |
| `data().quality().health(...)` | `GET` | `/data/quality/health` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().quality().getInfo(...)` | `GET` | `/data/quality/info` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().quality().getInfo(...)` | `GET` | `/data/quality/info` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().quality().getInfo(...)` | `GET` | `/data/quality/info` | `Class<T> responseType` | `@Nullable T` |
| `data().quality().getInfo(...)` | `GET` | `/data/quality/info` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().query().health(...)` | `GET` | `/data/query/health` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().query().health(...)` | `GET` | `/data/query/health` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().query().health(...)` | `GET` | `/data/query/health` | `Class<T> responseType` | `@Nullable T` |
| `data().query().health(...)` | `GET` | `/data/query/health` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().query().getInfo(...)` | `GET` | `/data/query/info` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().query().getInfo(...)` | `GET` | `/data/query/info` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().query().getInfo(...)` | `GET` | `/data/query/info` | `Class<T> responseType` | `@Nullable T` |
| `data().query().getInfo(...)` | `GET` | `/data/query/info` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().schemas().health(...)` | `GET` | `/data/schemas/health` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().schemas().health(...)` | `GET` | `/data/schemas/health` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().schemas().health(...)` | `GET` | `/data/schemas/health` | `Class<T> responseType` | `@Nullable T` |
| `data().schemas().health(...)` | `GET` | `/data/schemas/health` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().schemas().getInfo(...)` | `GET` | `/data/schemas/info` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().schemas().getInfo(...)` | `GET` | `/data/schemas/info` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().schemas().getInfo(...)` | `GET` | `/data/schemas/info` | `Class<T> responseType` | `@Nullable T` |
| `data().schemas().getInfo(...)` | `GET` | `/data/schemas/info` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().serving().health(...)` | `GET` | `/data/serving/health` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().serving().health(...)` | `GET` | `/data/serving/health` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().serving().health(...)` | `GET` | `/data/serving/health` | `Class<T> responseType` | `@Nullable T` |
| `data().serving().health(...)` | `GET` | `/data/serving/health` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().serving().getInfo(...)` | `GET` | `/data/serving/info` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().serving().getInfo(...)` | `GET` | `/data/serving/info` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().serving().getInfo(...)` | `GET` | `/data/serving/info` | `Class<T> responseType` | `@Nullable T` |
| `data().serving().getInfo(...)` | `GET` | `/data/serving/info` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().streams().health(...)` | `GET` | `/data/streams/health` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().streams().health(...)` | `GET` | `/data/streams/health` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().streams().health(...)` | `GET` | `/data/streams/health` | `Class<T> responseType` | `@Nullable T` |
| `data().streams().health(...)` | `GET` | `/data/streams/health` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().streams().getInfo(...)` | `GET` | `/data/streams/info` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().streams().getInfo(...)` | `GET` | `/data/streams/info` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().streams().getInfo(...)` | `GET` | `/data/streams/info` | `Class<T> responseType` | `@Nullable T` |
| `data().streams().getInfo(...)` | `GET` | `/data/streams/info` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().sync().health(...)` | `GET` | `/data/sync/health` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().sync().health(...)` | `GET` | `/data/sync/health` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().sync().health(...)` | `GET` | `/data/sync/health` | `Class<T> responseType` | `@Nullable T` |
| `data().sync().health(...)` | `GET` | `/data/sync/health` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().sync().getInfo(...)` | `GET` | `/data/sync/info` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().sync().getInfo(...)` | `GET` | `/data/sync/info` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().sync().getInfo(...)` | `GET` | `/data/sync/info` | `Class<T> responseType` | `@Nullable T` |
| `data().sync().getInfo(...)` | `GET` | `/data/sync/info` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().transformations().health(...)` | `GET` | `/data/transformations/health` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().transformations().health(...)` | `GET` | `/data/transformations/health` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().transformations().health(...)` | `GET` | `/data/transformations/health` | `Class<T> responseType` | `@Nullable T` |
| `data().transformations().health(...)` | `GET` | `/data/transformations/health` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().transformations().getInfo(...)` | `GET` | `/data/transformations/info` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().transformations().getInfo(...)` | `GET` | `/data/transformations/info` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().transformations().getInfo(...)` | `GET` | `/data/transformations/info` | `Class<T> responseType` | `@Nullable T` |
| `data().transformations().getInfo(...)` | `GET` | `/data/transformations/info` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().aggregations().aggregations().list(...)` | `GET` | `/data/aggregations/aggregations` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().aggregations().aggregations().list(...)` | `GET` | `/data/aggregations/aggregations` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().aggregations().aggregations().list(...)` | `GET` | `/data/aggregations/aggregations` | `Class<T> responseType` | `@Nullable T` |
| `data().aggregations().aggregations().list(...)` | `GET` | `/data/aggregations/aggregations` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().aggregations().aggregations().get(...)` | `GET` | `/data/aggregations/aggregations/{param}` | `String aggregationId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().aggregations().aggregations().get(...)` | `GET` | `/data/aggregations/aggregations/{param}` | `String aggregationId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().aggregations().aggregations().get(...)` | `GET` | `/data/aggregations/aggregations/{param}` | `String aggregationId, Class<T> responseType` | `@Nullable T` |
| `data().aggregations().aggregations().get(...)` | `GET` | `/data/aggregations/aggregations/{param}` | `String aggregationId, TypeReference<T> responseType` | `@Nullable T` |
| `data().aggregations().aggregations().create(...)` | `POST` | `/data/aggregations/aggregations` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().aggregations().aggregations().create(...)` | `POST` | `/data/aggregations/aggregations` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().aggregations().aggregations().create(...)` | `POST` | `/data/aggregations/aggregations` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().aggregations().aggregations().create(...)` | `POST` | `/data/aggregations/aggregations` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().aggregations().capabilities().list(...)` | `GET` | `/data/aggregations/capabilities` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().aggregations().capabilities().list(...)` | `GET` | `/data/aggregations/capabilities` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().aggregations().capabilities().list(...)` | `GET` | `/data/aggregations/capabilities` | `Class<T> responseType` | `@Nullable T` |
| `data().aggregations().capabilities().list(...)` | `GET` | `/data/aggregations/capabilities` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().aggregations().runs().list(...)` | `GET` | `/data/aggregations/runs` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().aggregations().runs().list(...)` | `GET` | `/data/aggregations/runs` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().aggregations().runs().list(...)` | `GET` | `/data/aggregations/runs` | `Class<T> responseType` | `@Nullable T` |
| `data().aggregations().runs().list(...)` | `GET` | `/data/aggregations/runs` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().aggregations().runs().get(...)` | `GET` | `/data/aggregations/runs/{param}` | `String runId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().aggregations().runs().get(...)` | `GET` | `/data/aggregations/runs/{param}` | `String runId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().aggregations().runs().get(...)` | `GET` | `/data/aggregations/runs/{param}` | `String runId, Class<T> responseType` | `@Nullable T` |
| `data().aggregations().runs().get(...)` | `GET` | `/data/aggregations/runs/{param}` | `String runId, TypeReference<T> responseType` | `@Nullable T` |
| `data().aggregations().runs().create(...)` | `POST` | `/data/aggregations/runs` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().aggregations().runs().create(...)` | `POST` | `/data/aggregations/runs` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().aggregations().runs().create(...)` | `POST` | `/data/aggregations/runs` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().aggregations().runs().create(...)` | `POST` | `/data/aggregations/runs` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().archival().capabilities().list(...)` | `GET` | `/data/archival/capabilities` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().archival().capabilities().list(...)` | `GET` | `/data/archival/capabilities` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().archival().capabilities().list(...)` | `GET` | `/data/archival/capabilities` | `Class<T> responseType` | `@Nullable T` |
| `data().archival().capabilities().list(...)` | `GET` | `/data/archival/capabilities` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().archival().runs().list(...)` | `GET` | `/data/archival/runs` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().archival().runs().list(...)` | `GET` | `/data/archival/runs` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().archival().runs().list(...)` | `GET` | `/data/archival/runs` | `Class<T> responseType` | `@Nullable T` |
| `data().archival().runs().list(...)` | `GET` | `/data/archival/runs` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().archival().runs().get(...)` | `GET` | `/data/archival/runs/{param}` | `String runId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().archival().runs().get(...)` | `GET` | `/data/archival/runs/{param}` | `String runId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().archival().runs().get(...)` | `GET` | `/data/archival/runs/{param}` | `String runId, Class<T> responseType` | `@Nullable T` |
| `data().archival().runs().get(...)` | `GET` | `/data/archival/runs/{param}` | `String runId, TypeReference<T> responseType` | `@Nullable T` |
| `data().archival().runs().create(...)` | `POST` | `/data/archival/runs` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().archival().runs().create(...)` | `POST` | `/data/archival/runs` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().archival().runs().create(...)` | `POST` | `/data/archival/runs` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().archival().runs().create(...)` | `POST` | `/data/archival/runs` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().catalog().capabilities().list(...)` | `GET` | `/data/catalog/capabilities` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().catalog().capabilities().list(...)` | `GET` | `/data/catalog/capabilities` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().catalog().capabilities().list(...)` | `GET` | `/data/catalog/capabilities` | `Class<T> responseType` | `@Nullable T` |
| `data().catalog().capabilities().list(...)` | `GET` | `/data/catalog/capabilities` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().catalog().runs().list(...)` | `GET` | `/data/catalog/runs` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().catalog().runs().list(...)` | `GET` | `/data/catalog/runs` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().catalog().runs().list(...)` | `GET` | `/data/catalog/runs` | `Class<T> responseType` | `@Nullable T` |
| `data().catalog().runs().list(...)` | `GET` | `/data/catalog/runs` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().catalog().runs().get(...)` | `GET` | `/data/catalog/runs/{param}` | `String runId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().catalog().runs().get(...)` | `GET` | `/data/catalog/runs/{param}` | `String runId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().catalog().runs().get(...)` | `GET` | `/data/catalog/runs/{param}` | `String runId, Class<T> responseType` | `@Nullable T` |
| `data().catalog().runs().get(...)` | `GET` | `/data/catalog/runs/{param}` | `String runId, TypeReference<T> responseType` | `@Nullable T` |
| `data().catalog().runs().create(...)` | `POST` | `/data/catalog/runs` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().catalog().runs().create(...)` | `POST` | `/data/catalog/runs` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().catalog().runs().create(...)` | `POST` | `/data/catalog/runs` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().catalog().runs().create(...)` | `POST` | `/data/catalog/runs` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().enrichment().capabilities().list(...)` | `GET` | `/data/enrichment/capabilities` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().enrichment().capabilities().list(...)` | `GET` | `/data/enrichment/capabilities` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().enrichment().capabilities().list(...)` | `GET` | `/data/enrichment/capabilities` | `Class<T> responseType` | `@Nullable T` |
| `data().enrichment().capabilities().list(...)` | `GET` | `/data/enrichment/capabilities` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().enrichment().runs().list(...)` | `GET` | `/data/enrichment/runs` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().enrichment().runs().list(...)` | `GET` | `/data/enrichment/runs` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().enrichment().runs().list(...)` | `GET` | `/data/enrichment/runs` | `Class<T> responseType` | `@Nullable T` |
| `data().enrichment().runs().list(...)` | `GET` | `/data/enrichment/runs` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().enrichment().runs().get(...)` | `GET` | `/data/enrichment/runs/{param}` | `String runId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().enrichment().runs().get(...)` | `GET` | `/data/enrichment/runs/{param}` | `String runId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().enrichment().runs().get(...)` | `GET` | `/data/enrichment/runs/{param}` | `String runId, Class<T> responseType` | `@Nullable T` |
| `data().enrichment().runs().get(...)` | `GET` | `/data/enrichment/runs/{param}` | `String runId, TypeReference<T> responseType` | `@Nullable T` |
| `data().enrichment().runs().create(...)` | `POST` | `/data/enrichment/runs` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().enrichment().runs().create(...)` | `POST` | `/data/enrichment/runs` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().enrichment().runs().create(...)` | `POST` | `/data/enrichment/runs` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().enrichment().runs().create(...)` | `POST` | `/data/enrichment/runs` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().exports().capabilities().list(...)` | `GET` | `/data/exports/capabilities` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().exports().capabilities().list(...)` | `GET` | `/data/exports/capabilities` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().exports().capabilities().list(...)` | `GET` | `/data/exports/capabilities` | `Class<T> responseType` | `@Nullable T` |
| `data().exports().capabilities().list(...)` | `GET` | `/data/exports/capabilities` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().exports().exports().list(...)` | `GET` | `/data/exports/exports` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().exports().exports().list(...)` | `GET` | `/data/exports/exports` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().exports().exports().list(...)` | `GET` | `/data/exports/exports` | `Class<T> responseType` | `@Nullable T` |
| `data().exports().exports().list(...)` | `GET` | `/data/exports/exports` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().exports().exports().get(...)` | `GET` | `/data/exports/exports/{param}` | `String exportId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().exports().exports().get(...)` | `GET` | `/data/exports/exports/{param}` | `String exportId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().exports().exports().get(...)` | `GET` | `/data/exports/exports/{param}` | `String exportId, Class<T> responseType` | `@Nullable T` |
| `data().exports().exports().get(...)` | `GET` | `/data/exports/exports/{param}` | `String exportId, TypeReference<T> responseType` | `@Nullable T` |
| `data().exports().exports().create(...)` | `POST` | `/data/exports/exports` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().exports().exports().create(...)` | `POST` | `/data/exports/exports` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().exports().exports().create(...)` | `POST` | `/data/exports/exports` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().exports().exports().create(...)` | `POST` | `/data/exports/exports` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().exports().runs().list(...)` | `GET` | `/data/exports/runs` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().exports().runs().list(...)` | `GET` | `/data/exports/runs` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().exports().runs().list(...)` | `GET` | `/data/exports/runs` | `Class<T> responseType` | `@Nullable T` |
| `data().exports().runs().list(...)` | `GET` | `/data/exports/runs` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().exports().runs().get(...)` | `GET` | `/data/exports/runs/{param}` | `String runId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().exports().runs().get(...)` | `GET` | `/data/exports/runs/{param}` | `String runId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().exports().runs().get(...)` | `GET` | `/data/exports/runs/{param}` | `String runId, Class<T> responseType` | `@Nullable T` |
| `data().exports().runs().get(...)` | `GET` | `/data/exports/runs/{param}` | `String runId, TypeReference<T> responseType` | `@Nullable T` |
| `data().exports().runs().create(...)` | `POST` | `/data/exports/runs` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().exports().runs().create(...)` | `POST` | `/data/exports/runs` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().exports().runs().create(...)` | `POST` | `/data/exports/runs` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().exports().runs().create(...)` | `POST` | `/data/exports/runs` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().ingest().capabilities().list(...)` | `GET` | `/data/ingest/capabilities` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().ingest().capabilities().list(...)` | `GET` | `/data/ingest/capabilities` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().ingest().capabilities().list(...)` | `GET` | `/data/ingest/capabilities` | `Class<T> responseType` | `@Nullable T` |
| `data().ingest().capabilities().list(...)` | `GET` | `/data/ingest/capabilities` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().ingest().datasets().list(...)` | `GET` | `/data/ingest/datasets` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().ingest().datasets().list(...)` | `GET` | `/data/ingest/datasets` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().ingest().datasets().list(...)` | `GET` | `/data/ingest/datasets` | `Class<T> responseType` | `@Nullable T` |
| `data().ingest().datasets().list(...)` | `GET` | `/data/ingest/datasets` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().ingest().datasets().get(...)` | `GET` | `/data/ingest/datasets/{param}` | `String datasetId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().ingest().datasets().get(...)` | `GET` | `/data/ingest/datasets/{param}` | `String datasetId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().ingest().datasets().get(...)` | `GET` | `/data/ingest/datasets/{param}` | `String datasetId, Class<T> responseType` | `@Nullable T` |
| `data().ingest().datasets().get(...)` | `GET` | `/data/ingest/datasets/{param}` | `String datasetId, TypeReference<T> responseType` | `@Nullable T` |
| `data().ingest().datasets().ingest(...)` | `POST` | `/data/ingest/datasets/ingest` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().ingest().datasets().ingest(...)` | `POST` | `/data/ingest/datasets/ingest` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().ingest().datasets().ingest(...)` | `POST` | `/data/ingest/datasets/ingest` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().ingest().datasets().ingest(...)` | `POST` | `/data/ingest/datasets/ingest` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().ingest().runs().list(...)` | `GET` | `/data/ingest/runs` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().ingest().runs().list(...)` | `GET` | `/data/ingest/runs` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().ingest().runs().list(...)` | `GET` | `/data/ingest/runs` | `Class<T> responseType` | `@Nullable T` |
| `data().ingest().runs().list(...)` | `GET` | `/data/ingest/runs` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().ingest().runs().get(...)` | `GET` | `/data/ingest/runs/{param}` | `String runId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().ingest().runs().get(...)` | `GET` | `/data/ingest/runs/{param}` | `String runId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().ingest().runs().get(...)` | `GET` | `/data/ingest/runs/{param}` | `String runId, Class<T> responseType` | `@Nullable T` |
| `data().ingest().runs().get(...)` | `GET` | `/data/ingest/runs/{param}` | `String runId, TypeReference<T> responseType` | `@Nullable T` |
| `data().ingest().runs().create(...)` | `POST` | `/data/ingest/runs` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().ingest().runs().create(...)` | `POST` | `/data/ingest/runs` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().ingest().runs().create(...)` | `POST` | `/data/ingest/runs` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().ingest().runs().create(...)` | `POST` | `/data/ingest/runs` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().ingest().schemas().list(...)` | `GET` | `/data/ingest/schemas` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().ingest().schemas().list(...)` | `GET` | `/data/ingest/schemas` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().ingest().schemas().list(...)` | `GET` | `/data/ingest/schemas` | `Class<T> responseType` | `@Nullable T` |
| `data().ingest().schemas().list(...)` | `GET` | `/data/ingest/schemas` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().ingest().schemas().get(...)` | `GET` | `/data/ingest/schemas/{param}` | `String schemaRef, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().ingest().schemas().get(...)` | `GET` | `/data/ingest/schemas/{param}` | `String schemaRef, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().ingest().schemas().get(...)` | `GET` | `/data/ingest/schemas/{param}` | `String schemaRef, Class<T> responseType` | `@Nullable T` |
| `data().ingest().schemas().get(...)` | `GET` | `/data/ingest/schemas/{param}` | `String schemaRef, TypeReference<T> responseType` | `@Nullable T` |
| `data().normalization().capabilities().list(...)` | `GET` | `/data/normalization/capabilities` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().normalization().capabilities().list(...)` | `GET` | `/data/normalization/capabilities` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().normalization().capabilities().list(...)` | `GET` | `/data/normalization/capabilities` | `Class<T> responseType` | `@Nullable T` |
| `data().normalization().capabilities().list(...)` | `GET` | `/data/normalization/capabilities` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().normalization().runs().list(...)` | `GET` | `/data/normalization/runs` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().normalization().runs().list(...)` | `GET` | `/data/normalization/runs` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().normalization().runs().list(...)` | `GET` | `/data/normalization/runs` | `Class<T> responseType` | `@Nullable T` |
| `data().normalization().runs().list(...)` | `GET` | `/data/normalization/runs` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().normalization().runs().get(...)` | `GET` | `/data/normalization/runs/{param}` | `String runId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().normalization().runs().get(...)` | `GET` | `/data/normalization/runs/{param}` | `String runId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().normalization().runs().get(...)` | `GET` | `/data/normalization/runs/{param}` | `String runId, Class<T> responseType` | `@Nullable T` |
| `data().normalization().runs().get(...)` | `GET` | `/data/normalization/runs/{param}` | `String runId, TypeReference<T> responseType` | `@Nullable T` |
| `data().normalization().runs().create(...)` | `POST` | `/data/normalization/runs` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().normalization().runs().create(...)` | `POST` | `/data/normalization/runs` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().normalization().runs().create(...)` | `POST` | `/data/normalization/runs` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().normalization().runs().create(...)` | `POST` | `/data/normalization/runs` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().pipelines().capabilities().list(...)` | `GET` | `/data/pipelines/capabilities` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().pipelines().capabilities().list(...)` | `GET` | `/data/pipelines/capabilities` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().pipelines().capabilities().list(...)` | `GET` | `/data/pipelines/capabilities` | `Class<T> responseType` | `@Nullable T` |
| `data().pipelines().capabilities().list(...)` | `GET` | `/data/pipelines/capabilities` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().pipelines().pipelineRuns().list(...)` | `GET` | `/data/pipelines/pipeline-runs` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().pipelines().pipelineRuns().list(...)` | `GET` | `/data/pipelines/pipeline-runs` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().pipelines().pipelineRuns().list(...)` | `GET` | `/data/pipelines/pipeline-runs` | `Class<T> responseType` | `@Nullable T` |
| `data().pipelines().pipelineRuns().list(...)` | `GET` | `/data/pipelines/pipeline-runs` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().pipelines().pipelineRuns().get(...)` | `GET` | `/data/pipelines/pipeline-runs/{param}` | `String runId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().pipelines().pipelineRuns().get(...)` | `GET` | `/data/pipelines/pipeline-runs/{param}` | `String runId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().pipelines().pipelineRuns().get(...)` | `GET` | `/data/pipelines/pipeline-runs/{param}` | `String runId, Class<T> responseType` | `@Nullable T` |
| `data().pipelines().pipelineRuns().get(...)` | `GET` | `/data/pipelines/pipeline-runs/{param}` | `String runId, TypeReference<T> responseType` | `@Nullable T` |
| `data().pipelines().pipelines().list(...)` | `GET` | `/data/pipelines/pipelines` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().pipelines().pipelines().list(...)` | `GET` | `/data/pipelines/pipelines` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().pipelines().pipelines().list(...)` | `GET` | `/data/pipelines/pipelines` | `Class<T> responseType` | `@Nullable T` |
| `data().pipelines().pipelines().list(...)` | `GET` | `/data/pipelines/pipelines` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().pipelines().pipelines().get(...)` | `GET` | `/data/pipelines/pipelines/{param}` | `String definitionId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().pipelines().pipelines().get(...)` | `GET` | `/data/pipelines/pipelines/{param}` | `String definitionId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().pipelines().pipelines().get(...)` | `GET` | `/data/pipelines/pipelines/{param}` | `String definitionId, Class<T> responseType` | `@Nullable T` |
| `data().pipelines().pipelines().get(...)` | `GET` | `/data/pipelines/pipelines/{param}` | `String definitionId, TypeReference<T> responseType` | `@Nullable T` |
| `data().pipelines().pipelines().create(...)` | `POST` | `/data/pipelines/pipelines` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().pipelines().pipelines().create(...)` | `POST` | `/data/pipelines/pipelines` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().pipelines().pipelines().create(...)` | `POST` | `/data/pipelines/pipelines` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().pipelines().pipelines().create(...)` | `POST` | `/data/pipelines/pipelines` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().pipelines().runs().list(...)` | `GET` | `/data/pipelines/runs` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().pipelines().runs().list(...)` | `GET` | `/data/pipelines/runs` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().pipelines().runs().list(...)` | `GET` | `/data/pipelines/runs` | `Class<T> responseType` | `@Nullable T` |
| `data().pipelines().runs().list(...)` | `GET` | `/data/pipelines/runs` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().pipelines().runs().get(...)` | `GET` | `/data/pipelines/runs/{param}` | `String runId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().pipelines().runs().get(...)` | `GET` | `/data/pipelines/runs/{param}` | `String runId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().pipelines().runs().get(...)` | `GET` | `/data/pipelines/runs/{param}` | `String runId, Class<T> responseType` | `@Nullable T` |
| `data().pipelines().runs().get(...)` | `GET` | `/data/pipelines/runs/{param}` | `String runId, TypeReference<T> responseType` | `@Nullable T` |
| `data().pipelines().runs().create(...)` | `POST` | `/data/pipelines/runs` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().pipelines().runs().create(...)` | `POST` | `/data/pipelines/runs` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().pipelines().runs().create(...)` | `POST` | `/data/pipelines/runs` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().pipelines().runs().create(...)` | `POST` | `/data/pipelines/runs` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().quality().capabilities().list(...)` | `GET` | `/data/quality/capabilities` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().quality().capabilities().list(...)` | `GET` | `/data/quality/capabilities` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().quality().capabilities().list(...)` | `GET` | `/data/quality/capabilities` | `Class<T> responseType` | `@Nullable T` |
| `data().quality().capabilities().list(...)` | `GET` | `/data/quality/capabilities` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().quality().runs().list(...)` | `GET` | `/data/quality/runs` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().quality().runs().list(...)` | `GET` | `/data/quality/runs` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().quality().runs().list(...)` | `GET` | `/data/quality/runs` | `Class<T> responseType` | `@Nullable T` |
| `data().quality().runs().list(...)` | `GET` | `/data/quality/runs` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().quality().runs().get(...)` | `GET` | `/data/quality/runs/{param}` | `String runId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().quality().runs().get(...)` | `GET` | `/data/quality/runs/{param}` | `String runId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().quality().runs().get(...)` | `GET` | `/data/quality/runs/{param}` | `String runId, Class<T> responseType` | `@Nullable T` |
| `data().quality().runs().get(...)` | `GET` | `/data/quality/runs/{param}` | `String runId, TypeReference<T> responseType` | `@Nullable T` |
| `data().quality().runs().create(...)` | `POST` | `/data/quality/runs` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().quality().runs().create(...)` | `POST` | `/data/quality/runs` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().quality().runs().create(...)` | `POST` | `/data/quality/runs` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().quality().runs().create(...)` | `POST` | `/data/quality/runs` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().query().capabilities().list(...)` | `GET` | `/data/query/capabilities` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().query().capabilities().list(...)` | `GET` | `/data/query/capabilities` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().query().capabilities().list(...)` | `GET` | `/data/query/capabilities` | `Class<T> responseType` | `@Nullable T` |
| `data().query().capabilities().list(...)` | `GET` | `/data/query/capabilities` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().query().query().federated(...)` | `POST` | `/data/query/query/federated` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().query().query().federated(...)` | `POST` | `/data/query/query/federated` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().query().query().federated(...)` | `POST` | `/data/query/query/federated` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().query().query().federated(...)` | `POST` | `/data/query/query/federated` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().query().runs().list(...)` | `GET` | `/data/query/runs` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().query().runs().list(...)` | `GET` | `/data/query/runs` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().query().runs().list(...)` | `GET` | `/data/query/runs` | `Class<T> responseType` | `@Nullable T` |
| `data().query().runs().list(...)` | `GET` | `/data/query/runs` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().query().runs().get(...)` | `GET` | `/data/query/runs/{param}` | `String runId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().query().runs().get(...)` | `GET` | `/data/query/runs/{param}` | `String runId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().query().runs().get(...)` | `GET` | `/data/query/runs/{param}` | `String runId, Class<T> responseType` | `@Nullable T` |
| `data().query().runs().get(...)` | `GET` | `/data/query/runs/{param}` | `String runId, TypeReference<T> responseType` | `@Nullable T` |
| `data().query().runs().create(...)` | `POST` | `/data/query/runs` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().query().runs().create(...)` | `POST` | `/data/query/runs` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().query().runs().create(...)` | `POST` | `/data/query/runs` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().query().runs().create(...)` | `POST` | `/data/query/runs` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().schemas().capabilities().list(...)` | `GET` | `/data/schemas/capabilities` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().schemas().capabilities().list(...)` | `GET` | `/data/schemas/capabilities` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().schemas().capabilities().list(...)` | `GET` | `/data/schemas/capabilities` | `Class<T> responseType` | `@Nullable T` |
| `data().schemas().capabilities().list(...)` | `GET` | `/data/schemas/capabilities` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().schemas().runs().list(...)` | `GET` | `/data/schemas/runs` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().schemas().runs().list(...)` | `GET` | `/data/schemas/runs` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().schemas().runs().list(...)` | `GET` | `/data/schemas/runs` | `Class<T> responseType` | `@Nullable T` |
| `data().schemas().runs().list(...)` | `GET` | `/data/schemas/runs` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().schemas().runs().get(...)` | `GET` | `/data/schemas/runs/{param}` | `String runId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().schemas().runs().get(...)` | `GET` | `/data/schemas/runs/{param}` | `String runId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().schemas().runs().get(...)` | `GET` | `/data/schemas/runs/{param}` | `String runId, Class<T> responseType` | `@Nullable T` |
| `data().schemas().runs().get(...)` | `GET` | `/data/schemas/runs/{param}` | `String runId, TypeReference<T> responseType` | `@Nullable T` |
| `data().schemas().runs().create(...)` | `POST` | `/data/schemas/runs` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().schemas().runs().create(...)` | `POST` | `/data/schemas/runs` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().schemas().runs().create(...)` | `POST` | `/data/schemas/runs` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().schemas().runs().create(...)` | `POST` | `/data/schemas/runs` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().schemas().schemas().list(...)` | `GET` | `/data/schemas/schemas` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().schemas().schemas().list(...)` | `GET` | `/data/schemas/schemas` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().schemas().schemas().list(...)` | `GET` | `/data/schemas/schemas` | `Class<T> responseType` | `@Nullable T` |
| `data().schemas().schemas().list(...)` | `GET` | `/data/schemas/schemas` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().schemas().schemas().get(...)` | `GET` | `/data/schemas/schemas/{param}` | `String schemaRef, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().schemas().schemas().get(...)` | `GET` | `/data/schemas/schemas/{param}` | `String schemaRef, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().schemas().schemas().get(...)` | `GET` | `/data/schemas/schemas/{param}` | `String schemaRef, Class<T> responseType` | `@Nullable T` |
| `data().schemas().schemas().get(...)` | `GET` | `/data/schemas/schemas/{param}` | `String schemaRef, TypeReference<T> responseType` | `@Nullable T` |
| `data().schemas().schemas().create(...)` | `POST` | `/data/schemas/schemas` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().schemas().schemas().create(...)` | `POST` | `/data/schemas/schemas` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().schemas().schemas().create(...)` | `POST` | `/data/schemas/schemas` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().schemas().schemas().create(...)` | `POST` | `/data/schemas/schemas` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().schemas().schemas().resolve(...)` | `POST` | `/data/schemas/schemas/resolve` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().schemas().schemas().resolve(...)` | `POST` | `/data/schemas/schemas/resolve` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().schemas().schemas().resolve(...)` | `POST` | `/data/schemas/schemas/resolve` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().schemas().schemas().resolve(...)` | `POST` | `/data/schemas/schemas/resolve` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().serving().capabilities().list(...)` | `GET` | `/data/serving/capabilities` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().serving().capabilities().list(...)` | `GET` | `/data/serving/capabilities` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().serving().capabilities().list(...)` | `GET` | `/data/serving/capabilities` | `Class<T> responseType` | `@Nullable T` |
| `data().serving().capabilities().list(...)` | `GET` | `/data/serving/capabilities` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().serving().runs().list(...)` | `GET` | `/data/serving/runs` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().serving().runs().list(...)` | `GET` | `/data/serving/runs` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().serving().runs().list(...)` | `GET` | `/data/serving/runs` | `Class<T> responseType` | `@Nullable T` |
| `data().serving().runs().list(...)` | `GET` | `/data/serving/runs` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().serving().runs().get(...)` | `GET` | `/data/serving/runs/{param}` | `String runId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().serving().runs().get(...)` | `GET` | `/data/serving/runs/{param}` | `String runId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().serving().runs().get(...)` | `GET` | `/data/serving/runs/{param}` | `String runId, Class<T> responseType` | `@Nullable T` |
| `data().serving().runs().get(...)` | `GET` | `/data/serving/runs/{param}` | `String runId, TypeReference<T> responseType` | `@Nullable T` |
| `data().serving().runs().create(...)` | `POST` | `/data/serving/runs` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().serving().runs().create(...)` | `POST` | `/data/serving/runs` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().serving().runs().create(...)` | `POST` | `/data/serving/runs` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().serving().runs().create(...)` | `POST` | `/data/serving/runs` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().streams().capabilities().list(...)` | `GET` | `/data/streams/capabilities` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().streams().capabilities().list(...)` | `GET` | `/data/streams/capabilities` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().streams().capabilities().list(...)` | `GET` | `/data/streams/capabilities` | `Class<T> responseType` | `@Nullable T` |
| `data().streams().capabilities().list(...)` | `GET` | `/data/streams/capabilities` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().streams().runs().list(...)` | `GET` | `/data/streams/runs` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().streams().runs().list(...)` | `GET` | `/data/streams/runs` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().streams().runs().list(...)` | `GET` | `/data/streams/runs` | `Class<T> responseType` | `@Nullable T` |
| `data().streams().runs().list(...)` | `GET` | `/data/streams/runs` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().streams().runs().get(...)` | `GET` | `/data/streams/runs/{param}` | `String runId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().streams().runs().get(...)` | `GET` | `/data/streams/runs/{param}` | `String runId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().streams().runs().get(...)` | `GET` | `/data/streams/runs/{param}` | `String runId, Class<T> responseType` | `@Nullable T` |
| `data().streams().runs().get(...)` | `GET` | `/data/streams/runs/{param}` | `String runId, TypeReference<T> responseType` | `@Nullable T` |
| `data().streams().runs().create(...)` | `POST` | `/data/streams/runs` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().streams().runs().create(...)` | `POST` | `/data/streams/runs` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().streams().runs().create(...)` | `POST` | `/data/streams/runs` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().streams().runs().create(...)` | `POST` | `/data/streams/runs` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().streams().streams().list(...)` | `GET` | `/data/streams/streams` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().streams().streams().list(...)` | `GET` | `/data/streams/streams` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().streams().streams().list(...)` | `GET` | `/data/streams/streams` | `Class<T> responseType` | `@Nullable T` |
| `data().streams().streams().list(...)` | `GET` | `/data/streams/streams` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().streams().streams().get(...)` | `GET` | `/data/streams/streams/{param}` | `String streamId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().streams().streams().get(...)` | `GET` | `/data/streams/streams/{param}` | `String streamId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().streams().streams().get(...)` | `GET` | `/data/streams/streams/{param}` | `String streamId, Class<T> responseType` | `@Nullable T` |
| `data().streams().streams().get(...)` | `GET` | `/data/streams/streams/{param}` | `String streamId, TypeReference<T> responseType` | `@Nullable T` |
| `data().streams().streams().create(...)` | `POST` | `/data/streams/streams` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().streams().streams().create(...)` | `POST` | `/data/streams/streams` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().streams().streams().create(...)` | `POST` | `/data/streams/streams` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().streams().streams().create(...)` | `POST` | `/data/streams/streams` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().sync().capabilities().list(...)` | `GET` | `/data/sync/capabilities` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().sync().capabilities().list(...)` | `GET` | `/data/sync/capabilities` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().sync().capabilities().list(...)` | `GET` | `/data/sync/capabilities` | `Class<T> responseType` | `@Nullable T` |
| `data().sync().capabilities().list(...)` | `GET` | `/data/sync/capabilities` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().sync().runs().list(...)` | `GET` | `/data/sync/runs` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().sync().runs().list(...)` | `GET` | `/data/sync/runs` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().sync().runs().list(...)` | `GET` | `/data/sync/runs` | `Class<T> responseType` | `@Nullable T` |
| `data().sync().runs().list(...)` | `GET` | `/data/sync/runs` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().sync().runs().get(...)` | `GET` | `/data/sync/runs/{param}` | `String runId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().sync().runs().get(...)` | `GET` | `/data/sync/runs/{param}` | `String runId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().sync().runs().get(...)` | `GET` | `/data/sync/runs/{param}` | `String runId, Class<T> responseType` | `@Nullable T` |
| `data().sync().runs().get(...)` | `GET` | `/data/sync/runs/{param}` | `String runId, TypeReference<T> responseType` | `@Nullable T` |
| `data().sync().runs().create(...)` | `POST` | `/data/sync/runs` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().sync().runs().create(...)` | `POST` | `/data/sync/runs` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().sync().runs().create(...)` | `POST` | `/data/sync/runs` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().sync().runs().create(...)` | `POST` | `/data/sync/runs` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().transformations().capabilities().list(...)` | `GET` | `/data/transformations/capabilities` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().transformations().capabilities().list(...)` | `GET` | `/data/transformations/capabilities` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().transformations().capabilities().list(...)` | `GET` | `/data/transformations/capabilities` | `Class<T> responseType` | `@Nullable T` |
| `data().transformations().capabilities().list(...)` | `GET` | `/data/transformations/capabilities` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().transformations().runs().list(...)` | `GET` | `/data/transformations/runs` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().transformations().runs().list(...)` | `GET` | `/data/transformations/runs` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().transformations().runs().list(...)` | `GET` | `/data/transformations/runs` | `Class<T> responseType` | `@Nullable T` |
| `data().transformations().runs().list(...)` | `GET` | `/data/transformations/runs` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().transformations().runs().get(...)` | `GET` | `/data/transformations/runs/{param}` | `String runId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().transformations().runs().get(...)` | `GET` | `/data/transformations/runs/{param}` | `String runId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().transformations().runs().get(...)` | `GET` | `/data/transformations/runs/{param}` | `String runId, Class<T> responseType` | `@Nullable T` |
| `data().transformations().runs().get(...)` | `GET` | `/data/transformations/runs/{param}` | `String runId, TypeReference<T> responseType` | `@Nullable T` |
| `data().transformations().runs().create(...)` | `POST` | `/data/transformations/runs` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().transformations().runs().create(...)` | `POST` | `/data/transformations/runs` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().transformations().runs().create(...)` | `POST` | `/data/transformations/runs` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().transformations().runs().create(...)` | `POST` | `/data/transformations/runs` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().transformations().transformations().list(...)` | `GET` | `/data/transformations/transformations` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().transformations().transformations().list(...)` | `GET` | `/data/transformations/transformations` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().transformations().transformations().list(...)` | `GET` | `/data/transformations/transformations` | `Class<T> responseType` | `@Nullable T` |
| `data().transformations().transformations().list(...)` | `GET` | `/data/transformations/transformations` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().transformations().transformations().get(...)` | `GET` | `/data/transformations/transformations/{param}` | `String transformationId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().transformations().transformations().get(...)` | `GET` | `/data/transformations/transformations/{param}` | `String transformationId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().transformations().transformations().get(...)` | `GET` | `/data/transformations/transformations/{param}` | `String transformationId, Class<T> responseType` | `@Nullable T` |
| `data().transformations().transformations().get(...)` | `GET` | `/data/transformations/transformations/{param}` | `String transformationId, TypeReference<T> responseType` | `@Nullable T` |
| `data().transformations().transformations().create(...)` | `POST` | `/data/transformations/transformations` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().transformations().transformations().create(...)` | `POST` | `/data/transformations/transformations` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().transformations().transformations().create(...)` | `POST` | `/data/transformations/transformations` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().transformations().transformations().create(...)` | `POST` | `/data/transformations/transformations` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().aggregations().aggregations().executions().create(...)` | `POST` | `/data/aggregations/aggregations/{param}/executions` | `String aggregationId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().aggregations().aggregations().executions().create(...)` | `POST` | `/data/aggregations/aggregations/{param}/executions` | `String aggregationId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().aggregations().aggregations().executions().create(...)` | `POST` | `/data/aggregations/aggregations/{param}/executions` | `String aggregationId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().aggregations().aggregations().executions().create(...)` | `POST` | `/data/aggregations/aggregations/{param}/executions` | `String aggregationId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().archival().archival().policies().list(...)` | `GET` | `/data/archival/archival/policies` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().archival().archival().policies().list(...)` | `GET` | `/data/archival/archival/policies` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().archival().archival().policies().list(...)` | `GET` | `/data/archival/archival/policies` | `Class<T> responseType` | `@Nullable T` |
| `data().archival().archival().policies().list(...)` | `GET` | `/data/archival/archival/policies` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().archival().archival().policies().get(...)` | `GET` | `/data/archival/archival/policies/{param}` | `String policyId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().archival().archival().policies().get(...)` | `GET` | `/data/archival/archival/policies/{param}` | `String policyId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().archival().archival().policies().get(...)` | `GET` | `/data/archival/archival/policies/{param}` | `String policyId, Class<T> responseType` | `@Nullable T` |
| `data().archival().archival().policies().get(...)` | `GET` | `/data/archival/archival/policies/{param}` | `String policyId, TypeReference<T> responseType` | `@Nullable T` |
| `data().archival().archival().policies().create(...)` | `POST` | `/data/archival/archival/policies` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().archival().archival().policies().create(...)` | `POST` | `/data/archival/archival/policies` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().archival().archival().policies().create(...)` | `POST` | `/data/archival/archival/policies` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().archival().archival().policies().create(...)` | `POST` | `/data/archival/archival/policies` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().catalog().catalog().datasets().list(...)` | `GET` | `/data/catalog/catalog/datasets` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().catalog().catalog().datasets().list(...)` | `GET` | `/data/catalog/catalog/datasets` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().catalog().catalog().datasets().list(...)` | `GET` | `/data/catalog/catalog/datasets` | `Class<T> responseType` | `@Nullable T` |
| `data().catalog().catalog().datasets().list(...)` | `GET` | `/data/catalog/catalog/datasets` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().catalog().catalog().datasets().get(...)` | `GET` | `/data/catalog/catalog/datasets/{param}` | `String datasetId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().catalog().catalog().datasets().get(...)` | `GET` | `/data/catalog/catalog/datasets/{param}` | `String datasetId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().catalog().catalog().datasets().get(...)` | `GET` | `/data/catalog/catalog/datasets/{param}` | `String datasetId, Class<T> responseType` | `@Nullable T` |
| `data().catalog().catalog().datasets().get(...)` | `GET` | `/data/catalog/catalog/datasets/{param}` | `String datasetId, TypeReference<T> responseType` | `@Nullable T` |
| `data().catalog().catalog().sources().list(...)` | `GET` | `/data/catalog/catalog/sources` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().catalog().catalog().sources().list(...)` | `GET` | `/data/catalog/catalog/sources` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().catalog().catalog().sources().list(...)` | `GET` | `/data/catalog/catalog/sources` | `Class<T> responseType` | `@Nullable T` |
| `data().catalog().catalog().sources().list(...)` | `GET` | `/data/catalog/catalog/sources` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().catalog().catalog().sources().get(...)` | `GET` | `/data/catalog/catalog/sources/{param}` | `String sourceId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().catalog().catalog().sources().get(...)` | `GET` | `/data/catalog/catalog/sources/{param}` | `String sourceId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().catalog().catalog().sources().get(...)` | `GET` | `/data/catalog/catalog/sources/{param}` | `String sourceId, Class<T> responseType` | `@Nullable T` |
| `data().catalog().catalog().sources().get(...)` | `GET` | `/data/catalog/catalog/sources/{param}` | `String sourceId, TypeReference<T> responseType` | `@Nullable T` |
| `data().enrichment().enrichment().profiles().list(...)` | `GET` | `/data/enrichment/enrichment/profiles` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().enrichment().enrichment().profiles().list(...)` | `GET` | `/data/enrichment/enrichment/profiles` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().enrichment().enrichment().profiles().list(...)` | `GET` | `/data/enrichment/enrichment/profiles` | `Class<T> responseType` | `@Nullable T` |
| `data().enrichment().enrichment().profiles().list(...)` | `GET` | `/data/enrichment/enrichment/profiles` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().enrichment().enrichment().profiles().get(...)` | `GET` | `/data/enrichment/enrichment/profiles/{param}` | `String profileId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().enrichment().enrichment().profiles().get(...)` | `GET` | `/data/enrichment/enrichment/profiles/{param}` | `String profileId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().enrichment().enrichment().profiles().get(...)` | `GET` | `/data/enrichment/enrichment/profiles/{param}` | `String profileId, Class<T> responseType` | `@Nullable T` |
| `data().enrichment().enrichment().profiles().get(...)` | `GET` | `/data/enrichment/enrichment/profiles/{param}` | `String profileId, TypeReference<T> responseType` | `@Nullable T` |
| `data().enrichment().enrichment().profiles().create(...)` | `POST` | `/data/enrichment/enrichment/profiles` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().enrichment().enrichment().profiles().create(...)` | `POST` | `/data/enrichment/enrichment/profiles` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().enrichment().enrichment().profiles().create(...)` | `POST` | `/data/enrichment/enrichment/profiles` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().enrichment().enrichment().profiles().create(...)` | `POST` | `/data/enrichment/enrichment/profiles` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().exports().exports().executions().create(...)` | `POST` | `/data/exports/exports/{param}/executions` | `String exportId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().exports().exports().executions().create(...)` | `POST` | `/data/exports/exports/{param}/executions` | `String exportId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().exports().exports().executions().create(...)` | `POST` | `/data/exports/exports/{param}/executions` | `String exportId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().exports().exports().executions().create(...)` | `POST` | `/data/exports/exports/{param}/executions` | `String exportId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().ingest().datasets().artifacts().getContent(...)` | `GET` | `/data/ingest/datasets/{param}/artifacts/{param}/content` | `String datasetId, String manifestId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().ingest().datasets().artifacts().getContent(...)` | `GET` | `/data/ingest/datasets/{param}/artifacts/{param}/content` | `String datasetId, String manifestId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().ingest().datasets().artifacts().getContent(...)` | `GET` | `/data/ingest/datasets/{param}/artifacts/{param}/content` | `String datasetId, String manifestId, Class<T> responseType` | `@Nullable T` |
| `data().ingest().datasets().artifacts().getContent(...)` | `GET` | `/data/ingest/datasets/{param}/artifacts/{param}/content` | `String datasetId, String manifestId, TypeReference<T> responseType` | `@Nullable T` |
| `data().normalization().normalization().profiles().list(...)` | `GET` | `/data/normalization/normalization/profiles` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().normalization().normalization().profiles().list(...)` | `GET` | `/data/normalization/normalization/profiles` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().normalization().normalization().profiles().list(...)` | `GET` | `/data/normalization/normalization/profiles` | `Class<T> responseType` | `@Nullable T` |
| `data().normalization().normalization().profiles().list(...)` | `GET` | `/data/normalization/normalization/profiles` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().normalization().normalization().profiles().get(...)` | `GET` | `/data/normalization/normalization/profiles/{param}` | `String profileId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().normalization().normalization().profiles().get(...)` | `GET` | `/data/normalization/normalization/profiles/{param}` | `String profileId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().normalization().normalization().profiles().get(...)` | `GET` | `/data/normalization/normalization/profiles/{param}` | `String profileId, Class<T> responseType` | `@Nullable T` |
| `data().normalization().normalization().profiles().get(...)` | `GET` | `/data/normalization/normalization/profiles/{param}` | `String profileId, TypeReference<T> responseType` | `@Nullable T` |
| `data().normalization().normalization().profiles().create(...)` | `POST` | `/data/normalization/normalization/profiles` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().normalization().normalization().profiles().create(...)` | `POST` | `/data/normalization/normalization/profiles` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().normalization().normalization().profiles().create(...)` | `POST` | `/data/normalization/normalization/profiles` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().normalization().normalization().profiles().create(...)` | `POST` | `/data/normalization/normalization/profiles` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().quality().quality().rulesets().list(...)` | `GET` | `/data/quality/quality/rulesets` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().quality().quality().rulesets().list(...)` | `GET` | `/data/quality/quality/rulesets` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().quality().quality().rulesets().list(...)` | `GET` | `/data/quality/quality/rulesets` | `Class<T> responseType` | `@Nullable T` |
| `data().quality().quality().rulesets().list(...)` | `GET` | `/data/quality/quality/rulesets` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().quality().quality().rulesets().get(...)` | `GET` | `/data/quality/quality/rulesets/{param}` | `String rulesetId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().quality().quality().rulesets().get(...)` | `GET` | `/data/quality/quality/rulesets/{param}` | `String rulesetId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().quality().quality().rulesets().get(...)` | `GET` | `/data/quality/quality/rulesets/{param}` | `String rulesetId, Class<T> responseType` | `@Nullable T` |
| `data().quality().quality().rulesets().get(...)` | `GET` | `/data/quality/quality/rulesets/{param}` | `String rulesetId, TypeReference<T> responseType` | `@Nullable T` |
| `data().quality().quality().rulesets().create(...)` | `POST` | `/data/quality/quality/rulesets` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().quality().quality().rulesets().create(...)` | `POST` | `/data/quality/quality/rulesets` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().quality().quality().rulesets().create(...)` | `POST` | `/data/quality/quality/rulesets` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().quality().quality().rulesets().create(...)` | `POST` | `/data/quality/quality/rulesets` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().serving().serving().products().list(...)` | `GET` | `/data/serving/serving/products` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().serving().serving().products().list(...)` | `GET` | `/data/serving/serving/products` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().serving().serving().products().list(...)` | `GET` | `/data/serving/serving/products` | `Class<T> responseType` | `@Nullable T` |
| `data().serving().serving().products().list(...)` | `GET` | `/data/serving/serving/products` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().serving().serving().products().get(...)` | `GET` | `/data/serving/serving/products/{param}` | `String productId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().serving().serving().products().get(...)` | `GET` | `/data/serving/serving/products/{param}` | `String productId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().serving().serving().products().get(...)` | `GET` | `/data/serving/serving/products/{param}` | `String productId, Class<T> responseType` | `@Nullable T` |
| `data().serving().serving().products().get(...)` | `GET` | `/data/serving/serving/products/{param}` | `String productId, TypeReference<T> responseType` | `@Nullable T` |
| `data().serving().serving().products().create(...)` | `POST` | `/data/serving/serving/products` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().serving().serving().products().create(...)` | `POST` | `/data/serving/serving/products` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().serving().serving().products().create(...)` | `POST` | `/data/serving/serving/products` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().serving().serving().products().create(...)` | `POST` | `/data/serving/serving/products` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().streams().streams().deliveries().create(...)` | `POST` | `/data/streams/streams/{param}/deliveries` | `String streamId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().streams().streams().deliveries().create(...)` | `POST` | `/data/streams/streams/{param}/deliveries` | `String streamId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().streams().streams().deliveries().create(...)` | `POST` | `/data/streams/streams/{param}/deliveries` | `String streamId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().streams().streams().deliveries().create(...)` | `POST` | `/data/streams/streams/{param}/deliveries` | `String streamId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().sync().sync().jobs().list(...)` | `GET` | `/data/sync/sync/jobs` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().sync().sync().jobs().list(...)` | `GET` | `/data/sync/sync/jobs` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().sync().sync().jobs().list(...)` | `GET` | `/data/sync/sync/jobs` | `Class<T> responseType` | `@Nullable T` |
| `data().sync().sync().jobs().list(...)` | `GET` | `/data/sync/sync/jobs` | `TypeReference<T> responseType` | `@Nullable T` |
| `data().sync().sync().jobs().get(...)` | `GET` | `/data/sync/sync/jobs/{param}` | `String jobId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().sync().sync().jobs().get(...)` | `GET` | `/data/sync/sync/jobs/{param}` | `String jobId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().sync().sync().jobs().get(...)` | `GET` | `/data/sync/sync/jobs/{param}` | `String jobId, Class<T> responseType` | `@Nullable T` |
| `data().sync().sync().jobs().get(...)` | `GET` | `/data/sync/sync/jobs/{param}` | `String jobId, TypeReference<T> responseType` | `@Nullable T` |
| `data().sync().sync().jobs().create(...)` | `POST` | `/data/sync/sync/jobs` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().sync().sync().jobs().create(...)` | `POST` | `/data/sync/sync/jobs` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().sync().sync().jobs().create(...)` | `POST` | `/data/sync/sync/jobs` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().sync().sync().jobs().create(...)` | `POST` | `/data/sync/sync/jobs` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().transformations().transformations().executions().create(...)` | `POST` | `/data/transformations/transformations/{param}/executions` | `String transformationId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().transformations().transformations().executions().create(...)` | `POST` | `/data/transformations/transformations/{param}/executions` | `String transformationId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().transformations().transformations().executions().create(...)` | `POST` | `/data/transformations/transformations/{param}/executions` | `String transformationId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().transformations().transformations().executions().create(...)` | `POST` | `/data/transformations/transformations/{param}/executions` | `String transformationId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().archival().archival().policies().executions().create(...)` | `POST` | `/data/archival/archival/policies/{param}/executions` | `String policyId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().archival().archival().policies().executions().create(...)` | `POST` | `/data/archival/archival/policies/{param}/executions` | `String policyId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().archival().archival().policies().executions().create(...)` | `POST` | `/data/archival/archival/policies/{param}/executions` | `String policyId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().archival().archival().policies().executions().create(...)` | `POST` | `/data/archival/archival/policies/{param}/executions` | `String policyId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().catalog().catalog().datasets().artifacts().getContent(...)` | `GET` | `/data/catalog/catalog/datasets/{param}/artifacts/{param}/content` | `String datasetId, String manifestId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `data().catalog().catalog().datasets().artifacts().getContent(...)` | `GET` | `/data/catalog/catalog/datasets/{param}/artifacts/{param}/content` | `String datasetId, String manifestId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `data().catalog().catalog().datasets().artifacts().getContent(...)` | `GET` | `/data/catalog/catalog/datasets/{param}/artifacts/{param}/content` | `String datasetId, String manifestId, Class<T> responseType` | `@Nullable T` |
| `data().catalog().catalog().datasets().artifacts().getContent(...)` | `GET` | `/data/catalog/catalog/datasets/{param}/artifacts/{param}/content` | `String datasetId, String manifestId, TypeReference<T> responseType` | `@Nullable T` |
| `data().enrichment().enrichment().profiles().executions().create(...)` | `POST` | `/data/enrichment/enrichment/profiles/{param}/executions` | `String profileId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().enrichment().enrichment().profiles().executions().create(...)` | `POST` | `/data/enrichment/enrichment/profiles/{param}/executions` | `String profileId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().enrichment().enrichment().profiles().executions().create(...)` | `POST` | `/data/enrichment/enrichment/profiles/{param}/executions` | `String profileId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().enrichment().enrichment().profiles().executions().create(...)` | `POST` | `/data/enrichment/enrichment/profiles/{param}/executions` | `String profileId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().normalization().normalization().profiles().executions().create(...)` | `POST` | `/data/normalization/normalization/profiles/{param}/executions` | `String profileId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().normalization().normalization().profiles().executions().create(...)` | `POST` | `/data/normalization/normalization/profiles/{param}/executions` | `String profileId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().normalization().normalization().profiles().executions().create(...)` | `POST` | `/data/normalization/normalization/profiles/{param}/executions` | `String profileId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().normalization().normalization().profiles().executions().create(...)` | `POST` | `/data/normalization/normalization/profiles/{param}/executions` | `String profileId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().quality().quality().rulesets().evaluations().create(...)` | `POST` | `/data/quality/quality/rulesets/{param}/evaluations` | `String rulesetId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().quality().quality().rulesets().evaluations().create(...)` | `POST` | `/data/quality/quality/rulesets/{param}/evaluations` | `String rulesetId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().quality().quality().rulesets().evaluations().create(...)` | `POST` | `/data/quality/quality/rulesets/{param}/evaluations` | `String rulesetId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().quality().quality().rulesets().evaluations().create(...)` | `POST` | `/data/quality/quality/rulesets/{param}/evaluations` | `String rulesetId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().serving().serving().products().refreshes().create(...)` | `POST` | `/data/serving/serving/products/{param}/refreshes` | `String productId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().serving().serving().products().refreshes().create(...)` | `POST` | `/data/serving/serving/products/{param}/refreshes` | `String productId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().serving().serving().products().refreshes().create(...)` | `POST` | `/data/serving/serving/products/{param}/refreshes` | `String productId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().serving().serving().products().refreshes().create(...)` | `POST` | `/data/serving/serving/products/{param}/refreshes` | `String productId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().sync().sync().jobs().executions().create(...)` | `POST` | `/data/sync/sync/jobs/{param}/executions` | `String jobId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().sync().sync().jobs().executions().create(...)` | `POST` | `/data/sync/sync/jobs/{param}/executions` | `String jobId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `data().sync().sync().jobs().executions().create(...)` | `POST` | `/data/sync/sync/jobs/{param}/executions` | `String jobId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `data().sync().sync().jobs().executions().create(...)` | `POST` | `/data/sync/sync/jobs/{param}/executions` | `String jobId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |

The generic `request(...)` methods and `Endpoints` constants remain available.
