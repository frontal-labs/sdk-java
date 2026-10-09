# Data API

Service accessor: `frontal.data()` (`DataClient`).

Named methods are generated from the committed route catalog. Build query values with `QueryParams` using exact API wire names. Routes without request schemas accept `JsonNode`; select `JsonNode` or a caller-provided model for unmodeled responses.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `getDataAggregationsAggregations(...)` | `GET` | `/data/aggregations/aggregations` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataAggregationsAggregations(...)` | `GET` | `/data/aggregations/aggregations` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataAggregationsAggregationsAggregationId(...)` | `GET` | `/data/aggregations/aggregations/{param}` | `aggregationId, query, Class<T> responseType` | `@Nullable T` |
| `getDataAggregationsAggregationsAggregationId(...)` | `GET` | `/data/aggregations/aggregations/{param}` | `aggregationId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataAggregationsCapabilities(...)` | `GET` | `/data/aggregations/capabilities` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataAggregationsCapabilities(...)` | `GET` | `/data/aggregations/capabilities` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataAggregationsHealth(...)` | `GET` | `/data/aggregations/health` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataAggregationsHealth(...)` | `GET` | `/data/aggregations/health` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataAggregationsInfo(...)` | `GET` | `/data/aggregations/info` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataAggregationsInfo(...)` | `GET` | `/data/aggregations/info` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataAggregationsRuns(...)` | `GET` | `/data/aggregations/runs` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataAggregationsRuns(...)` | `GET` | `/data/aggregations/runs` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataAggregationsRunsRunId(...)` | `GET` | `/data/aggregations/runs/{param}` | `runId, query, Class<T> responseType` | `@Nullable T` |
| `getDataAggregationsRunsRunId(...)` | `GET` | `/data/aggregations/runs/{param}` | `runId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataArchivalArchivalPolicies(...)` | `GET` | `/data/archival/archival/policies` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataArchivalArchivalPolicies(...)` | `GET` | `/data/archival/archival/policies` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataArchivalArchivalPoliciesPolicyId(...)` | `GET` | `/data/archival/archival/policies/{param}` | `policyId, query, Class<T> responseType` | `@Nullable T` |
| `getDataArchivalArchivalPoliciesPolicyId(...)` | `GET` | `/data/archival/archival/policies/{param}` | `policyId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataArchivalCapabilities(...)` | `GET` | `/data/archival/capabilities` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataArchivalCapabilities(...)` | `GET` | `/data/archival/capabilities` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataArchivalHealth(...)` | `GET` | `/data/archival/health` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataArchivalHealth(...)` | `GET` | `/data/archival/health` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataArchivalInfo(...)` | `GET` | `/data/archival/info` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataArchivalInfo(...)` | `GET` | `/data/archival/info` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataArchivalRuns(...)` | `GET` | `/data/archival/runs` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataArchivalRuns(...)` | `GET` | `/data/archival/runs` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataArchivalRunsRunId(...)` | `GET` | `/data/archival/runs/{param}` | `runId, query, Class<T> responseType` | `@Nullable T` |
| `getDataArchivalRunsRunId(...)` | `GET` | `/data/archival/runs/{param}` | `runId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataCatalogCapabilities(...)` | `GET` | `/data/catalog/capabilities` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataCatalogCapabilities(...)` | `GET` | `/data/catalog/capabilities` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataCatalogCatalogDatasets(...)` | `GET` | `/data/catalog/catalog/datasets` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataCatalogCatalogDatasets(...)` | `GET` | `/data/catalog/catalog/datasets` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataCatalogCatalogDatasetsDatasetId(...)` | `GET` | `/data/catalog/catalog/datasets/{param}` | `datasetId, query, Class<T> responseType` | `@Nullable T` |
| `getDataCatalogCatalogDatasetsDatasetId(...)` | `GET` | `/data/catalog/catalog/datasets/{param}` | `datasetId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataCatalogCatalogDatasetsDatasetIdArtifactsManifestIdContent(...)` | `GET` | `/data/catalog/catalog/datasets/{param}/artifacts/{param}/content` | `datasetId, manifestId, query, Class<T> responseType` | `@Nullable T` |
| `getDataCatalogCatalogDatasetsDatasetIdArtifactsManifestIdContent(...)` | `GET` | `/data/catalog/catalog/datasets/{param}/artifacts/{param}/content` | `datasetId, manifestId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataCatalogCatalogSources(...)` | `GET` | `/data/catalog/catalog/sources` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataCatalogCatalogSources(...)` | `GET` | `/data/catalog/catalog/sources` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataCatalogCatalogSourcesSourceId(...)` | `GET` | `/data/catalog/catalog/sources/{param}` | `sourceId, query, Class<T> responseType` | `@Nullable T` |
| `getDataCatalogCatalogSourcesSourceId(...)` | `GET` | `/data/catalog/catalog/sources/{param}` | `sourceId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataCatalogHealth(...)` | `GET` | `/data/catalog/health` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataCatalogHealth(...)` | `GET` | `/data/catalog/health` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataCatalogInfo(...)` | `GET` | `/data/catalog/info` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataCatalogInfo(...)` | `GET` | `/data/catalog/info` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataCatalogRuns(...)` | `GET` | `/data/catalog/runs` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataCatalogRuns(...)` | `GET` | `/data/catalog/runs` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataCatalogRunsRunId(...)` | `GET` | `/data/catalog/runs/{param}` | `runId, query, Class<T> responseType` | `@Nullable T` |
| `getDataCatalogRunsRunId(...)` | `GET` | `/data/catalog/runs/{param}` | `runId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataEnrichmentCapabilities(...)` | `GET` | `/data/enrichment/capabilities` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataEnrichmentCapabilities(...)` | `GET` | `/data/enrichment/capabilities` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataEnrichmentEnrichmentProfiles(...)` | `GET` | `/data/enrichment/enrichment/profiles` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataEnrichmentEnrichmentProfiles(...)` | `GET` | `/data/enrichment/enrichment/profiles` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataEnrichmentEnrichmentProfilesProfileId(...)` | `GET` | `/data/enrichment/enrichment/profiles/{param}` | `profileId, query, Class<T> responseType` | `@Nullable T` |
| `getDataEnrichmentEnrichmentProfilesProfileId(...)` | `GET` | `/data/enrichment/enrichment/profiles/{param}` | `profileId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataEnrichmentHealth(...)` | `GET` | `/data/enrichment/health` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataEnrichmentHealth(...)` | `GET` | `/data/enrichment/health` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataEnrichmentInfo(...)` | `GET` | `/data/enrichment/info` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataEnrichmentInfo(...)` | `GET` | `/data/enrichment/info` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataEnrichmentRuns(...)` | `GET` | `/data/enrichment/runs` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataEnrichmentRuns(...)` | `GET` | `/data/enrichment/runs` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataEnrichmentRunsRunId(...)` | `GET` | `/data/enrichment/runs/{param}` | `runId, query, Class<T> responseType` | `@Nullable T` |
| `getDataEnrichmentRunsRunId(...)` | `GET` | `/data/enrichment/runs/{param}` | `runId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataExportsCapabilities(...)` | `GET` | `/data/exports/capabilities` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataExportsCapabilities(...)` | `GET` | `/data/exports/capabilities` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataExportsExports(...)` | `GET` | `/data/exports/exports` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataExportsExports(...)` | `GET` | `/data/exports/exports` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataExportsExportsExportId(...)` | `GET` | `/data/exports/exports/{param}` | `exportId, query, Class<T> responseType` | `@Nullable T` |
| `getDataExportsExportsExportId(...)` | `GET` | `/data/exports/exports/{param}` | `exportId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataExportsHealth(...)` | `GET` | `/data/exports/health` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataExportsHealth(...)` | `GET` | `/data/exports/health` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataExportsInfo(...)` | `GET` | `/data/exports/info` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataExportsInfo(...)` | `GET` | `/data/exports/info` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataExportsRuns(...)` | `GET` | `/data/exports/runs` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataExportsRuns(...)` | `GET` | `/data/exports/runs` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataExportsRunsRunId(...)` | `GET` | `/data/exports/runs/{param}` | `runId, query, Class<T> responseType` | `@Nullable T` |
| `getDataExportsRunsRunId(...)` | `GET` | `/data/exports/runs/{param}` | `runId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataIngestCapabilities(...)` | `GET` | `/data/ingest/capabilities` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataIngestCapabilities(...)` | `GET` | `/data/ingest/capabilities` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataIngestDatasets(...)` | `GET` | `/data/ingest/datasets` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataIngestDatasets(...)` | `GET` | `/data/ingest/datasets` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataIngestDatasetsDatasetId(...)` | `GET` | `/data/ingest/datasets/{param}` | `datasetId, query, Class<T> responseType` | `@Nullable T` |
| `getDataIngestDatasetsDatasetId(...)` | `GET` | `/data/ingest/datasets/{param}` | `datasetId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataIngestDatasetsDatasetIdArtifactsManifestIdContent(...)` | `GET` | `/data/ingest/datasets/{param}/artifacts/{param}/content` | `datasetId, manifestId, query, Class<T> responseType` | `@Nullable T` |
| `getDataIngestDatasetsDatasetIdArtifactsManifestIdContent(...)` | `GET` | `/data/ingest/datasets/{param}/artifacts/{param}/content` | `datasetId, manifestId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataIngestHealth(...)` | `GET` | `/data/ingest/health` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataIngestHealth(...)` | `GET` | `/data/ingest/health` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataIngestInfo(...)` | `GET` | `/data/ingest/info` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataIngestInfo(...)` | `GET` | `/data/ingest/info` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataIngestRuns(...)` | `GET` | `/data/ingest/runs` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataIngestRuns(...)` | `GET` | `/data/ingest/runs` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataIngestRunsRunId(...)` | `GET` | `/data/ingest/runs/{param}` | `runId, query, Class<T> responseType` | `@Nullable T` |
| `getDataIngestRunsRunId(...)` | `GET` | `/data/ingest/runs/{param}` | `runId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataIngestSchemas(...)` | `GET` | `/data/ingest/schemas` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataIngestSchemas(...)` | `GET` | `/data/ingest/schemas` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataIngestSchemasSchemaRef(...)` | `GET` | `/data/ingest/schemas/{param}` | `schemaRef, query, Class<T> responseType` | `@Nullable T` |
| `getDataIngestSchemasSchemaRef(...)` | `GET` | `/data/ingest/schemas/{param}` | `schemaRef, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataNormalizationCapabilities(...)` | `GET` | `/data/normalization/capabilities` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataNormalizationCapabilities(...)` | `GET` | `/data/normalization/capabilities` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataNormalizationHealth(...)` | `GET` | `/data/normalization/health` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataNormalizationHealth(...)` | `GET` | `/data/normalization/health` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataNormalizationInfo(...)` | `GET` | `/data/normalization/info` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataNormalizationInfo(...)` | `GET` | `/data/normalization/info` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataNormalizationNormalizationProfiles(...)` | `GET` | `/data/normalization/normalization/profiles` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataNormalizationNormalizationProfiles(...)` | `GET` | `/data/normalization/normalization/profiles` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataNormalizationNormalizationProfilesProfileId(...)` | `GET` | `/data/normalization/normalization/profiles/{param}` | `profileId, query, Class<T> responseType` | `@Nullable T` |
| `getDataNormalizationNormalizationProfilesProfileId(...)` | `GET` | `/data/normalization/normalization/profiles/{param}` | `profileId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataNormalizationRuns(...)` | `GET` | `/data/normalization/runs` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataNormalizationRuns(...)` | `GET` | `/data/normalization/runs` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataNormalizationRunsRunId(...)` | `GET` | `/data/normalization/runs/{param}` | `runId, query, Class<T> responseType` | `@Nullable T` |
| `getDataNormalizationRunsRunId(...)` | `GET` | `/data/normalization/runs/{param}` | `runId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataPipelinesCapabilities(...)` | `GET` | `/data/pipelines/capabilities` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataPipelinesCapabilities(...)` | `GET` | `/data/pipelines/capabilities` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataPipelinesHealth(...)` | `GET` | `/data/pipelines/health` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataPipelinesHealth(...)` | `GET` | `/data/pipelines/health` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataPipelinesInfo(...)` | `GET` | `/data/pipelines/info` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataPipelinesInfo(...)` | `GET` | `/data/pipelines/info` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataPipelinesPipelineRuns(...)` | `GET` | `/data/pipelines/pipeline-runs` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataPipelinesPipelineRuns(...)` | `GET` | `/data/pipelines/pipeline-runs` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataPipelinesPipelineRunsRunId(...)` | `GET` | `/data/pipelines/pipeline-runs/{param}` | `runId, query, Class<T> responseType` | `@Nullable T` |
| `getDataPipelinesPipelineRunsRunId(...)` | `GET` | `/data/pipelines/pipeline-runs/{param}` | `runId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataPipelinesPipelines(...)` | `GET` | `/data/pipelines/pipelines` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataPipelinesPipelines(...)` | `GET` | `/data/pipelines/pipelines` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataPipelinesPipelinesDefinitionId(...)` | `GET` | `/data/pipelines/pipelines/{param}` | `definitionId, query, Class<T> responseType` | `@Nullable T` |
| `getDataPipelinesPipelinesDefinitionId(...)` | `GET` | `/data/pipelines/pipelines/{param}` | `definitionId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataPipelinesRuns(...)` | `GET` | `/data/pipelines/runs` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataPipelinesRuns(...)` | `GET` | `/data/pipelines/runs` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataPipelinesRunsRunId(...)` | `GET` | `/data/pipelines/runs/{param}` | `runId, query, Class<T> responseType` | `@Nullable T` |
| `getDataPipelinesRunsRunId(...)` | `GET` | `/data/pipelines/runs/{param}` | `runId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataQualityCapabilities(...)` | `GET` | `/data/quality/capabilities` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataQualityCapabilities(...)` | `GET` | `/data/quality/capabilities` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataQualityHealth(...)` | `GET` | `/data/quality/health` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataQualityHealth(...)` | `GET` | `/data/quality/health` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataQualityInfo(...)` | `GET` | `/data/quality/info` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataQualityInfo(...)` | `GET` | `/data/quality/info` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataQualityQualityRulesets(...)` | `GET` | `/data/quality/quality/rulesets` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataQualityQualityRulesets(...)` | `GET` | `/data/quality/quality/rulesets` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataQualityQualityRulesetsRulesetId(...)` | `GET` | `/data/quality/quality/rulesets/{param}` | `rulesetId, query, Class<T> responseType` | `@Nullable T` |
| `getDataQualityQualityRulesetsRulesetId(...)` | `GET` | `/data/quality/quality/rulesets/{param}` | `rulesetId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataQualityRuns(...)` | `GET` | `/data/quality/runs` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataQualityRuns(...)` | `GET` | `/data/quality/runs` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataQualityRunsRunId(...)` | `GET` | `/data/quality/runs/{param}` | `runId, query, Class<T> responseType` | `@Nullable T` |
| `getDataQualityRunsRunId(...)` | `GET` | `/data/quality/runs/{param}` | `runId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataQueryCapabilities(...)` | `GET` | `/data/query/capabilities` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataQueryCapabilities(...)` | `GET` | `/data/query/capabilities` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataQueryHealth(...)` | `GET` | `/data/query/health` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataQueryHealth(...)` | `GET` | `/data/query/health` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataQueryInfo(...)` | `GET` | `/data/query/info` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataQueryInfo(...)` | `GET` | `/data/query/info` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataQueryRuns(...)` | `GET` | `/data/query/runs` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataQueryRuns(...)` | `GET` | `/data/query/runs` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataQueryRunsRunId(...)` | `GET` | `/data/query/runs/{param}` | `runId, query, Class<T> responseType` | `@Nullable T` |
| `getDataQueryRunsRunId(...)` | `GET` | `/data/query/runs/{param}` | `runId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataSchemasCapabilities(...)` | `GET` | `/data/schemas/capabilities` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataSchemasCapabilities(...)` | `GET` | `/data/schemas/capabilities` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataSchemasHealth(...)` | `GET` | `/data/schemas/health` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataSchemasHealth(...)` | `GET` | `/data/schemas/health` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataSchemasInfo(...)` | `GET` | `/data/schemas/info` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataSchemasInfo(...)` | `GET` | `/data/schemas/info` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataSchemasRuns(...)` | `GET` | `/data/schemas/runs` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataSchemasRuns(...)` | `GET` | `/data/schemas/runs` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataSchemasRunsRunId(...)` | `GET` | `/data/schemas/runs/{param}` | `runId, query, Class<T> responseType` | `@Nullable T` |
| `getDataSchemasRunsRunId(...)` | `GET` | `/data/schemas/runs/{param}` | `runId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataSchemasSchemas(...)` | `GET` | `/data/schemas/schemas` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataSchemasSchemas(...)` | `GET` | `/data/schemas/schemas` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataSchemasSchemasSchemaRef(...)` | `GET` | `/data/schemas/schemas/{param}` | `schemaRef, query, Class<T> responseType` | `@Nullable T` |
| `getDataSchemasSchemasSchemaRef(...)` | `GET` | `/data/schemas/schemas/{param}` | `schemaRef, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataServingCapabilities(...)` | `GET` | `/data/serving/capabilities` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataServingCapabilities(...)` | `GET` | `/data/serving/capabilities` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataServingHealth(...)` | `GET` | `/data/serving/health` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataServingHealth(...)` | `GET` | `/data/serving/health` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataServingInfo(...)` | `GET` | `/data/serving/info` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataServingInfo(...)` | `GET` | `/data/serving/info` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataServingRuns(...)` | `GET` | `/data/serving/runs` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataServingRuns(...)` | `GET` | `/data/serving/runs` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataServingRunsRunId(...)` | `GET` | `/data/serving/runs/{param}` | `runId, query, Class<T> responseType` | `@Nullable T` |
| `getDataServingRunsRunId(...)` | `GET` | `/data/serving/runs/{param}` | `runId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataServingServingProducts(...)` | `GET` | `/data/serving/serving/products` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataServingServingProducts(...)` | `GET` | `/data/serving/serving/products` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataServingServingProductsProductId(...)` | `GET` | `/data/serving/serving/products/{param}` | `productId, query, Class<T> responseType` | `@Nullable T` |
| `getDataServingServingProductsProductId(...)` | `GET` | `/data/serving/serving/products/{param}` | `productId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataStreamsCapabilities(...)` | `GET` | `/data/streams/capabilities` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataStreamsCapabilities(...)` | `GET` | `/data/streams/capabilities` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataStreamsHealth(...)` | `GET` | `/data/streams/health` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataStreamsHealth(...)` | `GET` | `/data/streams/health` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataStreamsInfo(...)` | `GET` | `/data/streams/info` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataStreamsInfo(...)` | `GET` | `/data/streams/info` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataStreamsRuns(...)` | `GET` | `/data/streams/runs` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataStreamsRuns(...)` | `GET` | `/data/streams/runs` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataStreamsRunsRunId(...)` | `GET` | `/data/streams/runs/{param}` | `runId, query, Class<T> responseType` | `@Nullable T` |
| `getDataStreamsRunsRunId(...)` | `GET` | `/data/streams/runs/{param}` | `runId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataStreamsStreams(...)` | `GET` | `/data/streams/streams` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataStreamsStreams(...)` | `GET` | `/data/streams/streams` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataStreamsStreamsStreamId(...)` | `GET` | `/data/streams/streams/{param}` | `streamId, query, Class<T> responseType` | `@Nullable T` |
| `getDataStreamsStreamsStreamId(...)` | `GET` | `/data/streams/streams/{param}` | `streamId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataSyncCapabilities(...)` | `GET` | `/data/sync/capabilities` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataSyncCapabilities(...)` | `GET` | `/data/sync/capabilities` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataSyncHealth(...)` | `GET` | `/data/sync/health` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataSyncHealth(...)` | `GET` | `/data/sync/health` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataSyncInfo(...)` | `GET` | `/data/sync/info` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataSyncInfo(...)` | `GET` | `/data/sync/info` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataSyncRuns(...)` | `GET` | `/data/sync/runs` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataSyncRuns(...)` | `GET` | `/data/sync/runs` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataSyncRunsRunId(...)` | `GET` | `/data/sync/runs/{param}` | `runId, query, Class<T> responseType` | `@Nullable T` |
| `getDataSyncRunsRunId(...)` | `GET` | `/data/sync/runs/{param}` | `runId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataSyncSyncJobs(...)` | `GET` | `/data/sync/sync/jobs` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataSyncSyncJobs(...)` | `GET` | `/data/sync/sync/jobs` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataSyncSyncJobsJobId(...)` | `GET` | `/data/sync/sync/jobs/{param}` | `jobId, query, Class<T> responseType` | `@Nullable T` |
| `getDataSyncSyncJobsJobId(...)` | `GET` | `/data/sync/sync/jobs/{param}` | `jobId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataTransformationsCapabilities(...)` | `GET` | `/data/transformations/capabilities` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataTransformationsCapabilities(...)` | `GET` | `/data/transformations/capabilities` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataTransformationsHealth(...)` | `GET` | `/data/transformations/health` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataTransformationsHealth(...)` | `GET` | `/data/transformations/health` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataTransformationsInfo(...)` | `GET` | `/data/transformations/info` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataTransformationsInfo(...)` | `GET` | `/data/transformations/info` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataTransformationsRuns(...)` | `GET` | `/data/transformations/runs` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataTransformationsRuns(...)` | `GET` | `/data/transformations/runs` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataTransformationsRunsRunId(...)` | `GET` | `/data/transformations/runs/{param}` | `runId, query, Class<T> responseType` | `@Nullable T` |
| `getDataTransformationsRunsRunId(...)` | `GET` | `/data/transformations/runs/{param}` | `runId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataTransformationsTransformations(...)` | `GET` | `/data/transformations/transformations` | `query, Class<T> responseType` | `@Nullable T` |
| `getDataTransformationsTransformations(...)` | `GET` | `/data/transformations/transformations` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getDataTransformationsTransformationsTransformationId(...)` | `GET` | `/data/transformations/transformations/{param}` | `transformationId, query, Class<T> responseType` | `@Nullable T` |
| `getDataTransformationsTransformationsTransformationId(...)` | `GET` | `/data/transformations/transformations/{param}` | `transformationId, query, TypeReference<T> responseType` | `@Nullable T` |
| `postDataAggregationsAggregations(...)` | `POST` | `/data/aggregations/aggregations` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postDataAggregationsAggregations(...)` | `POST` | `/data/aggregations/aggregations` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataAggregationsAggregationsAggregationIdExecutions(...)` | `POST` | `/data/aggregations/aggregations/{param}/executions` | `aggregationId, query, body, Class<T> responseType` | `@Nullable T` |
| `postDataAggregationsAggregationsAggregationIdExecutions(...)` | `POST` | `/data/aggregations/aggregations/{param}/executions` | `aggregationId, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataAggregationsRuns(...)` | `POST` | `/data/aggregations/runs` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postDataAggregationsRuns(...)` | `POST` | `/data/aggregations/runs` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataArchivalArchivalPolicies(...)` | `POST` | `/data/archival/archival/policies` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postDataArchivalArchivalPolicies(...)` | `POST` | `/data/archival/archival/policies` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataArchivalArchivalPoliciesPolicyIdExecutions(...)` | `POST` | `/data/archival/archival/policies/{param}/executions` | `policyId, query, body, Class<T> responseType` | `@Nullable T` |
| `postDataArchivalArchivalPoliciesPolicyIdExecutions(...)` | `POST` | `/data/archival/archival/policies/{param}/executions` | `policyId, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataArchivalRuns(...)` | `POST` | `/data/archival/runs` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postDataArchivalRuns(...)` | `POST` | `/data/archival/runs` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataCatalogRuns(...)` | `POST` | `/data/catalog/runs` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postDataCatalogRuns(...)` | `POST` | `/data/catalog/runs` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataEnrichmentEnrichmentProfiles(...)` | `POST` | `/data/enrichment/enrichment/profiles` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postDataEnrichmentEnrichmentProfiles(...)` | `POST` | `/data/enrichment/enrichment/profiles` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataEnrichmentEnrichmentProfilesProfileIdExecutions(...)` | `POST` | `/data/enrichment/enrichment/profiles/{param}/executions` | `profileId, query, body, Class<T> responseType` | `@Nullable T` |
| `postDataEnrichmentEnrichmentProfilesProfileIdExecutions(...)` | `POST` | `/data/enrichment/enrichment/profiles/{param}/executions` | `profileId, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataEnrichmentRuns(...)` | `POST` | `/data/enrichment/runs` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postDataEnrichmentRuns(...)` | `POST` | `/data/enrichment/runs` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataExportsExports(...)` | `POST` | `/data/exports/exports` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postDataExportsExports(...)` | `POST` | `/data/exports/exports` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataExportsExportsExportIdExecutions(...)` | `POST` | `/data/exports/exports/{param}/executions` | `exportId, query, body, Class<T> responseType` | `@Nullable T` |
| `postDataExportsExportsExportIdExecutions(...)` | `POST` | `/data/exports/exports/{param}/executions` | `exportId, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataExportsRuns(...)` | `POST` | `/data/exports/runs` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postDataExportsRuns(...)` | `POST` | `/data/exports/runs` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataIngestDatasetsIngest(...)` | `POST` | `/data/ingest/datasets/ingest` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postDataIngestDatasetsIngest(...)` | `POST` | `/data/ingest/datasets/ingest` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataIngestRuns(...)` | `POST` | `/data/ingest/runs` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postDataIngestRuns(...)` | `POST` | `/data/ingest/runs` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataNormalizationNormalizationProfiles(...)` | `POST` | `/data/normalization/normalization/profiles` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postDataNormalizationNormalizationProfiles(...)` | `POST` | `/data/normalization/normalization/profiles` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataNormalizationNormalizationProfilesProfileIdExecutions(...)` | `POST` | `/data/normalization/normalization/profiles/{param}/executions` | `profileId, query, body, Class<T> responseType` | `@Nullable T` |
| `postDataNormalizationNormalizationProfilesProfileIdExecutions(...)` | `POST` | `/data/normalization/normalization/profiles/{param}/executions` | `profileId, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataNormalizationRuns(...)` | `POST` | `/data/normalization/runs` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postDataNormalizationRuns(...)` | `POST` | `/data/normalization/runs` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataPipelinesPipelines(...)` | `POST` | `/data/pipelines/pipelines` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postDataPipelinesPipelines(...)` | `POST` | `/data/pipelines/pipelines` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataPipelinesRuns(...)` | `POST` | `/data/pipelines/runs` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postDataPipelinesRuns(...)` | `POST` | `/data/pipelines/runs` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataQualityQualityRulesets(...)` | `POST` | `/data/quality/quality/rulesets` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postDataQualityQualityRulesets(...)` | `POST` | `/data/quality/quality/rulesets` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataQualityQualityRulesetsRulesetIdEvaluations(...)` | `POST` | `/data/quality/quality/rulesets/{param}/evaluations` | `rulesetId, query, body, Class<T> responseType` | `@Nullable T` |
| `postDataQualityQualityRulesetsRulesetIdEvaluations(...)` | `POST` | `/data/quality/quality/rulesets/{param}/evaluations` | `rulesetId, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataQualityRuns(...)` | `POST` | `/data/quality/runs` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postDataQualityRuns(...)` | `POST` | `/data/quality/runs` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataQueryQueryFederated(...)` | `POST` | `/data/query/query/federated` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postDataQueryQueryFederated(...)` | `POST` | `/data/query/query/federated` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataQueryRuns(...)` | `POST` | `/data/query/runs` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postDataQueryRuns(...)` | `POST` | `/data/query/runs` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataSchemasRuns(...)` | `POST` | `/data/schemas/runs` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postDataSchemasRuns(...)` | `POST` | `/data/schemas/runs` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataSchemasSchemas(...)` | `POST` | `/data/schemas/schemas` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postDataSchemasSchemas(...)` | `POST` | `/data/schemas/schemas` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataSchemasSchemasResolve(...)` | `POST` | `/data/schemas/schemas/resolve` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postDataSchemasSchemasResolve(...)` | `POST` | `/data/schemas/schemas/resolve` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataServingRuns(...)` | `POST` | `/data/serving/runs` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postDataServingRuns(...)` | `POST` | `/data/serving/runs` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataServingServingProducts(...)` | `POST` | `/data/serving/serving/products` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postDataServingServingProducts(...)` | `POST` | `/data/serving/serving/products` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataServingServingProductsProductIdRefreshes(...)` | `POST` | `/data/serving/serving/products/{param}/refreshes` | `productId, query, body, Class<T> responseType` | `@Nullable T` |
| `postDataServingServingProductsProductIdRefreshes(...)` | `POST` | `/data/serving/serving/products/{param}/refreshes` | `productId, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataStreamsRuns(...)` | `POST` | `/data/streams/runs` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postDataStreamsRuns(...)` | `POST` | `/data/streams/runs` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataStreamsStreams(...)` | `POST` | `/data/streams/streams` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postDataStreamsStreams(...)` | `POST` | `/data/streams/streams` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataStreamsStreamsStreamIdDeliveries(...)` | `POST` | `/data/streams/streams/{param}/deliveries` | `streamId, query, body, Class<T> responseType` | `@Nullable T` |
| `postDataStreamsStreamsStreamIdDeliveries(...)` | `POST` | `/data/streams/streams/{param}/deliveries` | `streamId, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataSyncRuns(...)` | `POST` | `/data/sync/runs` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postDataSyncRuns(...)` | `POST` | `/data/sync/runs` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataSyncSyncJobs(...)` | `POST` | `/data/sync/sync/jobs` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postDataSyncSyncJobs(...)` | `POST` | `/data/sync/sync/jobs` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataSyncSyncJobsJobIdExecutions(...)` | `POST` | `/data/sync/sync/jobs/{param}/executions` | `jobId, query, body, Class<T> responseType` | `@Nullable T` |
| `postDataSyncSyncJobsJobIdExecutions(...)` | `POST` | `/data/sync/sync/jobs/{param}/executions` | `jobId, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataTransformationsRuns(...)` | `POST` | `/data/transformations/runs` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postDataTransformationsRuns(...)` | `POST` | `/data/transformations/runs` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataTransformationsTransformations(...)` | `POST` | `/data/transformations/transformations` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postDataTransformationsTransformations(...)` | `POST` | `/data/transformations/transformations` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postDataTransformationsTransformationsTransformationIdExecutions(...)` | `POST` | `/data/transformations/transformations/{param}/executions` | `transformationId, query, body, Class<T> responseType` | `@Nullable T` |
| `postDataTransformationsTransformationsTransformationIdExecutions(...)` | `POST` | `/data/transformations/transformations/{param}/executions` | `transformationId, query, body, TypeReference<T> responseType` | `@Nullable T` |
| No catalogued operations | — | — | — | — |

The generic `request(...)` methods and `Endpoints` constants remain available.
