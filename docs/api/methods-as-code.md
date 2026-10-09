# SDK methods as Java call lines

One call-shaped line for every method listed in the service API reference. `/* args */` is a placeholder; use the linked service page for the exact signature, argument order, and response type. Streaming methods are listed with both their publisher and blocking forms.

## agents

```java
client.agents().deleteAgentsParam(/* args */);
client.agents().getAgents(/* args */);
client.agents().getAgentsHealth(/* args */);
client.agents().getAgentsRunsParam(/* args */);
client.agents().getAgentsRunsParamConversation(/* args */);
client.agents().getAgentsParam(/* args */);
client.agents().getAgentsParamRuns(/* args */);
client.agents().getAgentsParamVersions(/* args */);
client.agents().postAgents(/* args */);
client.agents().postAgentsParamRollback(/* args */);
client.agents().postAgentsParamRuns(/* args */);
client.agents().putAgentsParam(/* args */);
client.agents().streamAgentsRunsParamStream(/* args */);
client.agents().streamAgentsRunsParamStreamBlocking(/* args */);
client.agents().getActionRun(/* args */);
```

Full signatures: [agents](./agents.md).

## ai

```java
client.ai().getHealth(/* args */);
client.ai().getInternalModels(/* args */);
client.ai().getInternalModelsDefaults(/* args */);
client.ai().postAiChatCompletions(/* args */);
client.ai().postInternalEmbeddings(/* args */);
client.ai().postInternalPredictions(/* args */);
client.ai().postInternalRerank(/* args */);
client.ai().postformdataInternalPredictions(/* args */);
client.ai().postrawInternalPredictions(/* args */);
```

Full signatures: [ai](./ai.md).

## audit

```java
client.audit().getAuditEvents(/* args */);
client.audit().getAuditEventsParam(/* args */);
client.audit().postAuditEvents(/* args */);
client.audit().postAuditEventsBatch(/* args */);
```

Full signatures: [audit](./audit.md).

## auth

```java
client.auth().deleteAuthAccountMfaParam(/* args */);
client.auth().deleteAuthAccountProfile(/* args */);
client.auth().deleteAuthAccountSecurityApiKeysParam(/* args */);
client.auth().deleteAuthAccountSecurityDevicesParam(/* args */);
client.auth().deleteAuthAccountSessionsParam(/* args */);
client.auth().deleteAuthAdminUsersParam(/* args */);
client.auth().deleteAuthAdminUsersParamFactorsParam(/* args */);
client.auth().deleteAuthFactorsParam(/* args */);
client.auth().deleteAuthUserIdentitiesParam(/* args */);
client.auth().getAuthAccountAuditLog(/* args */);
client.auth().getAuthAccountMfa(/* args */);
client.auth().getAuthAccountMfaParam(/* args */);
client.auth().getAuthAccountProfile(/* args */);
client.auth().getAuthAccountSecurityApiKeys(/* args */);
client.auth().getAuthAccountSecurityApiKeysParam(/* args */);
client.auth().getAuthAccountSecurityDevices(/* args */);
client.auth().getAuthAccountSecurityDevicesParam(/* args */);
client.auth().getAuthAccountSessions(/* args */);
client.auth().getAuthAdminUsers(/* args */);
client.auth().getAuthAdminUsersParam(/* args */);
client.auth().getAuthAdminUsersParamFactors(/* args */);
client.auth().getAuthAuthSession(/* args */);
client.auth().getAuthFactors(/* args */);
client.auth().getAuthMfaStatus(/* args */);
client.auth().getAuthUser(/* args */);
client.auth().getAuthUserIdentities(/* args */);
client.auth().postAuthAccountMfa(/* args */);
client.auth().postAuthAccountMfaParamChallenge(/* args */);
client.auth().postAuthAccountMfaParamVerify(/* args */);
client.auth().postAuthAccountPassword(/* args */);
client.auth().postAuthAccountSecurityApiKeys(/* args */);
client.auth().postAuthAccountSecurityDevices(/* args */);
client.auth().postAuthAccountSecurityDevicesParamTrust(/* args */);
client.auth().postAuthAccountSessionsParamExtend(/* args */);
client.auth().postAuthAdminGenerateLink(/* args */);
client.auth().postAuthAdminLogout(/* args */);
client.auth().postAuthAdminUsers(/* args */);
client.auth().postAuthAuthSession(/* args */);
client.auth().postAuthAuthorize(/* args */);
client.auth().postAuthFactors(/* args */);
client.auth().postAuthFactorsParamChallenge(/* args */);
client.auth().postAuthFactorsParamVerify(/* args */);
client.auth().postAuthInvite(/* args */);
client.auth().postAuthLogin(/* args */);
client.auth().postAuthLogout(/* args */);
client.auth().postAuthMfaBackupCodesRegenerate(/* args */);
client.auth().postAuthMfaDisable(/* args */);
client.auth().postAuthMfaEnable(/* args */);
client.auth().postAuthMfaSetup(/* args */);
client.auth().postAuthMfaVerify(/* args */);
client.auth().postAuthOtp(/* args */);
client.auth().postAuthReauthenticate(/* args */);
client.auth().postAuthRecover(/* args */);
client.auth().postAuthResend(/* args */);
client.auth().postAuthSignup(/* args */);
client.auth().postAuthSso(/* args */);
client.auth().postAuthTokenGrantTypeIdToken(/* args */);
client.auth().postAuthTokenGrantTypePassword(/* args */);
client.auth().postAuthTokenGrantTypePkce(/* args */);
client.auth().postAuthTokenGrantTypeRefreshToken(/* args */);
client.auth().postAuthUserIdentities(/* args */);
client.auth().postAuthVerify(/* args */);
client.auth().putAuthAccountProfile(/* args */);
client.auth().putAuthAccountSecurityApiKeysParam(/* args */);
client.auth().putAuthAdminUsersParam(/* args */);
client.auth().putAuthUser(/* args */);
```

Full signatures: [auth](./auth.md).

## billing

```java
client.billing().getBillingAddonsParamEntitlements(/* args */);
client.billing().getBillingCustomersPortalParam(/* args */);
client.billing().getBillingCustomersParamEntitlements(/* args */);
client.billing().getBillingCustomersParamInvoicesSummary(/* args */);
client.billing().getBillingCustomersParamUsage(/* args */);
client.billing().getBillingCustomersParamWallets(/* args */);
client.billing().getBillingPlansParamEntitlements(/* args */);
client.billing().getBillingPricesLookupParam(/* args */);
client.billing().getBillingSubscriptionsParamEntitlements(/* args */);
client.billing().getBillingWalletsParamBalanceRealTime(/* args */);
client.billing().getBillingWalletsParamTransactions(/* args */);
client.billing().getrawBillingInvoicesParamPdf(/* args */);
client.billing().postBillingInvoicesPreview(/* args */);
client.billing().postBillingInvoicesParamFinalize(/* args */);
client.billing().postBillingInvoicesParamVoid(/* args */);
client.billing().postBillingMetersParamDisable(/* args */);
client.billing().postBillingPlansParamClone(/* args */);
client.billing().postBillingSubscriptionsParamActivate(/* args */);
client.billing().postBillingSubscriptionsParamCancel(/* args */);
client.billing().postBillingSubscriptionsParamPause(/* args */);
client.billing().postBillingSubscriptionsParamResume(/* args */);
client.billing().postBillingWalletsParamTerminate(/* args */);
client.billing().postBillingWalletsParamTopUp(/* args */);
```

Full signatures: [billing](./billing.md).

## blob

```java
client.blob().deleteBlobObjectParamParam(/* args */);
client.blob().getBlobObjectInfoParamParam(/* args */);
client.blob().getBlobObjectParamParam(/* args */);
client.blob().postBlobObjectCopy(/* args */);
client.blob().postBlobObjectListParam(/* args */);
client.blob().postBlobObjectMove(/* args */);
client.blob().postBlobObjectSignParamParam(/* args */);
client.blob().postformdataBlobObjectParamParam(/* args */);
```

Full signatures: [blob](./blob.md).

## connection-tests

```java
client.connectionTests().getConnectionTestsConnectionTestId(/* args */);
```

Full signatures: [connection-tests](./connection-tests.md).

## connectors

```java
client.connectors().deleteConnectorsInstallationsParam(/* args */);
client.connectors().getConnectorsCatalog(/* args */);
client.connectors().getConnectorsCatalogParam(/* args */);
client.connectors().getConnectorsConnectionTestsParam(/* args */);
client.connectors().getConnectorsInstallations(/* args */);
client.connectors().getConnectorsInstallationsParam(/* args */);
client.connectors().getDiagnostics(/* args */);
client.connectors().patchConnectorsInstallationsParam(/* args */);
client.connectors().postConnectorsInstallations(/* args */);
client.connectors().postConnectorsInstallationsParamPause(/* args */);
client.connectors().postConnectorsInstallationsParamResume(/* args */);
client.connectors().postConnectorsSyncRunsParamReplay(/* args */);
```

Full signatures: [connectors](./connectors.md).

## data

```java
client.data().getDataAggregationsAggregations(/* args */);
client.data().getDataAggregationsAggregationsAggregationId(/* args */);
client.data().getDataAggregationsCapabilities(/* args */);
client.data().getDataAggregationsHealth(/* args */);
client.data().getDataAggregationsInfo(/* args */);
client.data().getDataAggregationsRuns(/* args */);
client.data().getDataAggregationsRunsRunId(/* args */);
client.data().getDataArchivalArchivalPolicies(/* args */);
client.data().getDataArchivalArchivalPoliciesPolicyId(/* args */);
client.data().getDataArchivalCapabilities(/* args */);
client.data().getDataArchivalHealth(/* args */);
client.data().getDataArchivalInfo(/* args */);
client.data().getDataArchivalRuns(/* args */);
client.data().getDataArchivalRunsRunId(/* args */);
client.data().getDataCatalogCapabilities(/* args */);
client.data().getDataCatalogCatalogDatasets(/* args */);
client.data().getDataCatalogCatalogDatasetsDatasetId(/* args */);
client.data().getDataCatalogCatalogDatasetsDatasetIdArtifactsManifestIdContent(/* args */);
client.data().getDataCatalogCatalogSources(/* args */);
client.data().getDataCatalogCatalogSourcesSourceId(/* args */);
client.data().getDataCatalogHealth(/* args */);
client.data().getDataCatalogInfo(/* args */);
client.data().getDataCatalogRuns(/* args */);
client.data().getDataCatalogRunsRunId(/* args */);
client.data().getDataEnrichmentCapabilities(/* args */);
client.data().getDataEnrichmentEnrichmentProfiles(/* args */);
client.data().getDataEnrichmentEnrichmentProfilesProfileId(/* args */);
client.data().getDataEnrichmentHealth(/* args */);
client.data().getDataEnrichmentInfo(/* args */);
client.data().getDataEnrichmentRuns(/* args */);
client.data().getDataEnrichmentRunsRunId(/* args */);
client.data().getDataExportsCapabilities(/* args */);
client.data().getDataExportsExports(/* args */);
client.data().getDataExportsExportsExportId(/* args */);
client.data().getDataExportsHealth(/* args */);
client.data().getDataExportsInfo(/* args */);
client.data().getDataExportsRuns(/* args */);
client.data().getDataExportsRunsRunId(/* args */);
client.data().getDataIngestCapabilities(/* args */);
client.data().getDataIngestDatasets(/* args */);
client.data().getDataIngestDatasetsDatasetId(/* args */);
client.data().getDataIngestDatasetsDatasetIdArtifactsManifestIdContent(/* args */);
client.data().getDataIngestHealth(/* args */);
client.data().getDataIngestInfo(/* args */);
client.data().getDataIngestRuns(/* args */);
client.data().getDataIngestRunsRunId(/* args */);
client.data().getDataIngestSchemas(/* args */);
client.data().getDataIngestSchemasSchemaRef(/* args */);
client.data().getDataNormalizationCapabilities(/* args */);
client.data().getDataNormalizationHealth(/* args */);
client.data().getDataNormalizationInfo(/* args */);
client.data().getDataNormalizationNormalizationProfiles(/* args */);
client.data().getDataNormalizationNormalizationProfilesProfileId(/* args */);
client.data().getDataNormalizationRuns(/* args */);
client.data().getDataNormalizationRunsRunId(/* args */);
client.data().getDataPipelinesCapabilities(/* args */);
client.data().getDataPipelinesHealth(/* args */);
client.data().getDataPipelinesInfo(/* args */);
client.data().getDataPipelinesPipelineRuns(/* args */);
client.data().getDataPipelinesPipelineRunsRunId(/* args */);
client.data().getDataPipelinesPipelines(/* args */);
client.data().getDataPipelinesPipelinesDefinitionId(/* args */);
client.data().getDataPipelinesRuns(/* args */);
client.data().getDataPipelinesRunsRunId(/* args */);
client.data().getDataQualityCapabilities(/* args */);
client.data().getDataQualityHealth(/* args */);
client.data().getDataQualityInfo(/* args */);
client.data().getDataQualityQualityRulesets(/* args */);
client.data().getDataQualityQualityRulesetsRulesetId(/* args */);
client.data().getDataQualityRuns(/* args */);
client.data().getDataQualityRunsRunId(/* args */);
client.data().getDataQueryCapabilities(/* args */);
client.data().getDataQueryHealth(/* args */);
client.data().getDataQueryInfo(/* args */);
client.data().getDataQueryRuns(/* args */);
client.data().getDataQueryRunsRunId(/* args */);
client.data().getDataSchemasCapabilities(/* args */);
client.data().getDataSchemasHealth(/* args */);
client.data().getDataSchemasInfo(/* args */);
client.data().getDataSchemasRuns(/* args */);
client.data().getDataSchemasRunsRunId(/* args */);
client.data().getDataSchemasSchemas(/* args */);
client.data().getDataSchemasSchemasSchemaRef(/* args */);
client.data().getDataServingCapabilities(/* args */);
client.data().getDataServingHealth(/* args */);
client.data().getDataServingInfo(/* args */);
client.data().getDataServingRuns(/* args */);
client.data().getDataServingRunsRunId(/* args */);
client.data().getDataServingServingProducts(/* args */);
client.data().getDataServingServingProductsProductId(/* args */);
client.data().getDataStreamsCapabilities(/* args */);
client.data().getDataStreamsHealth(/* args */);
client.data().getDataStreamsInfo(/* args */);
client.data().getDataStreamsRuns(/* args */);
client.data().getDataStreamsRunsRunId(/* args */);
client.data().getDataStreamsStreams(/* args */);
client.data().getDataStreamsStreamsStreamId(/* args */);
client.data().getDataSyncCapabilities(/* args */);
client.data().getDataSyncHealth(/* args */);
client.data().getDataSyncInfo(/* args */);
client.data().getDataSyncRuns(/* args */);
client.data().getDataSyncRunsRunId(/* args */);
client.data().getDataSyncSyncJobs(/* args */);
client.data().getDataSyncSyncJobsJobId(/* args */);
client.data().getDataTransformationsCapabilities(/* args */);
client.data().getDataTransformationsHealth(/* args */);
client.data().getDataTransformationsInfo(/* args */);
client.data().getDataTransformationsRuns(/* args */);
client.data().getDataTransformationsRunsRunId(/* args */);
client.data().getDataTransformationsTransformations(/* args */);
client.data().getDataTransformationsTransformationsTransformationId(/* args */);
client.data().postDataAggregationsAggregations(/* args */);
client.data().postDataAggregationsAggregationsAggregationIdExecutions(/* args */);
client.data().postDataAggregationsRuns(/* args */);
client.data().postDataArchivalArchivalPolicies(/* args */);
client.data().postDataArchivalArchivalPoliciesPolicyIdExecutions(/* args */);
client.data().postDataArchivalRuns(/* args */);
client.data().postDataCatalogRuns(/* args */);
client.data().postDataEnrichmentEnrichmentProfiles(/* args */);
client.data().postDataEnrichmentEnrichmentProfilesProfileIdExecutions(/* args */);
client.data().postDataEnrichmentRuns(/* args */);
client.data().postDataExportsExports(/* args */);
client.data().postDataExportsExportsExportIdExecutions(/* args */);
client.data().postDataExportsRuns(/* args */);
client.data().postDataIngestDatasetsIngest(/* args */);
client.data().postDataIngestRuns(/* args */);
client.data().postDataNormalizationNormalizationProfiles(/* args */);
client.data().postDataNormalizationNormalizationProfilesProfileIdExecutions(/* args */);
client.data().postDataNormalizationRuns(/* args */);
client.data().postDataPipelinesPipelines(/* args */);
client.data().postDataPipelinesRuns(/* args */);
client.data().postDataQualityQualityRulesets(/* args */);
client.data().postDataQualityQualityRulesetsRulesetIdEvaluations(/* args */);
client.data().postDataQualityRuns(/* args */);
client.data().postDataQueryQueryFederated(/* args */);
client.data().postDataQueryRuns(/* args */);
client.data().postDataSchemasRuns(/* args */);
client.data().postDataSchemasSchemas(/* args */);
client.data().postDataSchemasSchemasResolve(/* args */);
client.data().postDataServingRuns(/* args */);
client.data().postDataServingServingProducts(/* args */);
client.data().postDataServingServingProductsProductIdRefreshes(/* args */);
client.data().postDataStreamsRuns(/* args */);
client.data().postDataStreamsStreams(/* args */);
client.data().postDataStreamsStreamsStreamIdDeliveries(/* args */);
client.data().postDataSyncRuns(/* args */);
client.data().postDataSyncSyncJobs(/* args */);
client.data().postDataSyncSyncJobsJobIdExecutions(/* args */);
client.data().postDataTransformationsRuns(/* args */);
client.data().postDataTransformationsTransformations(/* args */);
client.data().postDataTransformationsTransformationsTransformationIdExecutions(/* args */);
```

Full signatures: [data](./data.md).

## events

```java
client.events().getEvents(/* args */);
client.events().getEventsMonitoring(/* args */);
client.events().getEventsId(/* args */);
client.events().postEvents(/* args */);
client.events().postEventsAnalytics(/* args */);
client.events().postEventsAnalyticsV2(/* args */);
client.events().postEventsBenchmarkV1(/* args */);
client.events().postEventsBenchmarkV2(/* args */);
client.events().postEventsBulk(/* args */);
client.events().postEventsHuggingfaceBilling(/* args */);
client.events().postEventsQuery(/* args */);
client.events().postEventsRawReprocessAll(/* args */);
client.events().postEventsRawReprocessPending(/* args */);
client.events().postEventsReprocess(/* args */);
client.events().postEventsReprocessInternal(/* args */);
client.events().postEventsUsage(/* args */);
client.events().postEventsUsageMeter(/* args */);
```

Full signatures: [events](./events.md).

## governance

```java
client.governance().deletePoliciesParam(/* args */);
client.governance().deleteRolesParam(/* args */);
client.governance().getComplianceAssessments(/* args */);
client.governance().getComplianceAssessmentsParam(/* args */);
client.governance().getComplianceFrameworks(/* args */);
client.governance().getComplianceScore(/* args */);
client.governance().getComplianceViolations(/* args */);
client.governance().getPermissions(/* args */);
client.governance().getPermissionsParam(/* args */);
client.governance().getPolicies(/* args */);
client.governance().getPoliciesTemplates(/* args */);
client.governance().getPoliciesParam(/* args */);
client.governance().getPoliciesParamVersions(/* args */);
client.governance().getRoles(/* args */);
client.governance().getRolesParam(/* args */);
client.governance().postAccessCheck(/* args */);
client.governance().postComplianceAssessments(/* args */);
client.governance().postComplianceViolationsParamResolve(/* args */);
client.governance().postPermissions(/* args */);
client.governance().postPolicies(/* args */);
client.governance().postPoliciesFromTemplate(/* args */);
client.governance().postPoliciesValidate(/* args */);
client.governance().postRoles(/* args */);
client.governance().putPoliciesParam(/* args */);
```

Full signatures: [governance](./governance.md).

## invocations

```java
client.invocations().postInvocations(/* args */);
```

Full signatures: [invocations](./invocations.md).

## lineage

```java
client.lineage().getLineageEdges(/* args */);
client.lineage().getLineageEdgesParam(/* args */);
client.lineage().getLineageGraph(/* args */);
client.lineage().getLineageNodes(/* args */);
client.lineage().getLineageNodesParam(/* args */);
client.lineage().getLineageNodesParamTrace(/* args */);
client.lineage().postLineageImpact(/* args */);
```

Full signatures: [lineage](./lineage.md).

## observability

```java
client.observability().deleteObservabilityAlertsRulesRuleId(/* args */);
client.observability().deleteObservabilityAlertsParam(/* args */);
client.observability().deleteObservabilityDashboardsParam(/* args */);
client.observability().getObservabilityAlerts(/* args */);
client.observability().getObservabilityAlertsIncidents(/* args */);
client.observability().getObservabilityAlertsRules(/* args */);
client.observability().getObservabilityAlertsRulesRuleId(/* args */);
client.observability().getObservabilityDashboards(/* args */);
client.observability().getObservabilityDashboardsParam(/* args */);
client.observability().getObservabilityEventsStats(/* args */);
client.observability().getObservabilityMetrics(/* args */);
client.observability().getObservabilityMetricsList(/* args */);
client.observability().getObservabilityTraces(/* args */);
client.observability().getObservabilityTracesParam(/* args */);
client.observability().postObservabilityAlerts(/* args */);
client.observability().postObservabilityAlertsRules(/* args */);
client.observability().postObservabilityAlertsRulesRuleIdToggle(/* args */);
client.observability().postObservabilityAlertsParamDisable(/* args */);
client.observability().postObservabilityAlertsParamEnable(/* args */);
client.observability().postObservabilityDashboards(/* args */);
client.observability().postObservabilityDashboardsParamShare(/* args */);
client.observability().postObservabilityEvents(/* args */);
client.observability().postObservabilityEventsBatch(/* args */);
client.observability().postObservabilityLogsIngest(/* args */);
client.observability().postObservabilityLogsQuery(/* args */);
client.observability().postObservabilityMetricsIngest(/* args */);
client.observability().postObservabilityTracesQuery(/* args */);
client.observability().putObservabilityAlertsRulesRuleId(/* args */);
client.observability().putObservabilityAlertsParam(/* args */);
client.observability().putObservabilityDashboardsParam(/* args */);
client.observability().streamObservabilityLogsStream(/* args */);
client.observability().streamObservabilityLogsStreamBlocking(/* args */);
```

Full signatures: [observability](./observability.md).

## ontology

```java
client.ontology().deleteOntologyObjectsObjectTypesObjectTypeId(/* args */);
client.ontology().deleteOntologyObjectsObjectsObjectId(/* args */);
client.ontology().deleteOntologyReasoningRulesRuleId(/* args */);
client.ontology().deleteOntologyRelationshipsRelationshipTypesRelationshipTypeId(/* args */);
client.ontology().deleteOntologyRelationshipsRelationshipsRelationshipId(/* args */);
client.ontology().deleteOntologyRolloutsRolloutsRolloutId(/* args */);
client.ontology().deleteOntologyRollupsRollupsRollupId(/* args */);
client.ontology().deleteOntologySchemasSchemasSchemaId(/* args */);
client.ontology().deleteOntologyValidationRulesRuleId(/* args */);
client.ontology().deleteOntologyVersionsVersionsVersionId(/* args */);
client.ontology().getOntologyEngineCapabilities(/* args */);
client.ontology().getOntologyEngineHealth(/* args */);
client.ontology().getOntologyEngineInfo(/* args */);
client.ontology().getOntologyEngineRuns(/* args */);
client.ontology().getOntologyEngineRunsRunId(/* args */);
client.ontology().getOntologyEventsCapabilities(/* args */);
client.ontology().getOntologyEventsEvents(/* args */);
client.ontology().getOntologyEventsEventsCheckpointsConsumer(/* args */);
client.ontology().getOntologyEventsEventsEventId(/* args */);
client.ontology().getOntologyEventsHealth(/* args */);
client.ontology().getOntologyEventsInfo(/* args */);
client.ontology().getOntologyEventsRuns(/* args */);
client.ontology().getOntologyEventsRunsRunId(/* args */);
client.ontology().getOntologyExtractCapabilities(/* args */);
client.ontology().getOntologyExtractHealth(/* args */);
client.ontology().getOntologyExtractInfo(/* args */);
client.ontology().getOntologyExtractRuns(/* args */);
client.ontology().getOntologyExtractRunsRunId(/* args */);
client.ontology().getOntologyGraphCapabilities(/* args */);
client.ontology().getOntologyGraphEntitiesEntityId(/* args */);
client.ontology().getOntologyGraphEntitiesEntityIdProvenance(/* args */);
client.ontology().getOntologyGraphHealth(/* args */);
client.ontology().getOntologyGraphInfo(/* args */);
client.ontology().getOntologyGraphRelationshipsRelationshipId(/* args */);
client.ontology().getOntologyGraphRuns(/* args */);
client.ontology().getOntologyGraphRunsRunId(/* args */);
client.ontology().getOntologyObjectsCapabilities(/* args */);
client.ontology().getOntologyObjectsHealth(/* args */);
client.ontology().getOntologyObjectsInfo(/* args */);
client.ontology().getOntologyObjectsObjectTypes(/* args */);
client.ontology().getOntologyObjectsObjectTypesObjectTypeId(/* args */);
client.ontology().getOntologyObjectsObjects(/* args */);
client.ontology().getOntologyObjectsObjectsObjectId(/* args */);
client.ontology().getOntologyObjectsRuns(/* args */);
client.ontology().getOntologyObjectsRunsRunId(/* args */);
client.ontology().getOntologyReasoningCapabilities(/* args */);
client.ontology().getOntologyReasoningHealth(/* args */);
client.ontology().getOntologyReasoningInfo(/* args */);
client.ontology().getOntologyReasoningRules(/* args */);
client.ontology().getOntologyReasoningRuns(/* args */);
client.ontology().getOntologyReasoningRunsRunId(/* args */);
client.ontology().getOntologyRelationshipsCapabilities(/* args */);
client.ontology().getOntologyRelationshipsHealth(/* args */);
client.ontology().getOntologyRelationshipsInfo(/* args */);
client.ontology().getOntologyRelationshipsRelationshipTypes(/* args */);
client.ontology().getOntologyRelationshipsRelationships(/* args */);
client.ontology().getOntologyRelationshipsRelationshipsRelationshipId(/* args */);
client.ontology().getOntologyRelationshipsRuns(/* args */);
client.ontology().getOntologyRelationshipsRunsRunId(/* args */);
client.ontology().getOntologyRolloutsCapabilities(/* args */);
client.ontology().getOntologyRolloutsHealth(/* args */);
client.ontology().getOntologyRolloutsInfo(/* args */);
client.ontology().getOntologyRolloutsRollouts(/* args */);
client.ontology().getOntologyRolloutsRolloutsRolloutId(/* args */);
client.ontology().getOntologyRolloutsRolloutsRolloutIdStatus(/* args */);
client.ontology().getOntologyRolloutsRuns(/* args */);
client.ontology().getOntologyRolloutsRunsRunId(/* args */);
client.ontology().getOntologyRollupsCapabilities(/* args */);
client.ontology().getOntologyRollupsHealth(/* args */);
client.ontology().getOntologyRollupsInfo(/* args */);
client.ontology().getOntologyRollupsRollupResultsExecutionId(/* args */);
client.ontology().getOntologyRollupsRollups(/* args */);
client.ontology().getOntologyRollupsRollupsRollupId(/* args */);
client.ontology().getOntologyRollupsRollupsRollupIdResult(/* args */);
client.ontology().getOntologyRollupsRuns(/* args */);
client.ontology().getOntologyRollupsRunsRunId(/* args */);
client.ontology().getOntologySchemasCapabilities(/* args */);
client.ontology().getOntologySchemasHealth(/* args */);
client.ontology().getOntologySchemasInfo(/* args */);
client.ontology().getOntologySchemasRuns(/* args */);
client.ontology().getOntologySchemasRunsRunId(/* args */);
client.ontology().getOntologySchemasSchemas(/* args */);
client.ontology().getOntologySchemasSchemasSchemaId(/* args */);
client.ontology().getOntologyTransformationsCapabilities(/* args */);
client.ontology().getOntologyTransformationsHealth(/* args */);
client.ontology().getOntologyTransformationsInfo(/* args */);
client.ontology().getOntologyTransformationsRuns(/* args */);
client.ontology().getOntologyTransformationsRunsRunId(/* args */);
client.ontology().getOntologyValidationCapabilities(/* args */);
client.ontology().getOntologyValidationHealth(/* args */);
client.ontology().getOntologyValidationInfo(/* args */);
client.ontology().getOntologyValidationRules(/* args */);
client.ontology().getOntologyValidationRulesRuleId(/* args */);
client.ontology().getOntologyValidationRuns(/* args */);
client.ontology().getOntologyValidationRunsRunId(/* args */);
client.ontology().getOntologyVersionsCapabilities(/* args */);
client.ontology().getOntologyVersionsHealth(/* args */);
client.ontology().getOntologyVersionsInfo(/* args */);
client.ontology().getOntologyVersionsReleaseBundles(/* args */);
client.ontology().getOntologyVersionsReleaseBundlesBundleId(/* args */);
client.ontology().getOntologyVersionsRuns(/* args */);
client.ontology().getOntologyVersionsRunsRunId(/* args */);
client.ontology().getOntologyVersionsVersionsVersionId(/* args */);
client.ontology().postOntologyEngineOntologiesCompareVersions(/* args */);
client.ontology().postOntologyEngineOntologiesExport(/* args */);
client.ontology().postOntologyEngineOntologiesExportShacl(/* args */);
client.ontology().postOntologyEngineOntologiesGenerate(/* args */);
client.ontology().postOntologyEngineOntologiesInferClasses(/* args */);
client.ontology().postOntologyEngineOntologiesInferProperties(/* args */);
client.ontology().postOntologyEngineOntologiesValidate(/* args */);
client.ontology().postOntologyEngineRuns(/* args */);
client.ontology().postOntologyEventsEvents(/* args */);
client.ontology().postOntologyEventsEventsCheckpoints(/* args */);
client.ontology().postOntologyEventsEventsLeasesAcknowledge(/* args */);
client.ontology().postOntologyEventsEventsLeasesAcquire(/* args */);
client.ontology().postOntologyEventsRuns(/* args */);
client.ontology().postOntologyExtractExtractAnalyze(/* args */);
client.ontology().postOntologyExtractExtractArchitecture(/* args */);
client.ontology().postOntologyExtractExtractCoreferences(/* args */);
client.ontology().postOntologyExtractExtractEntities(/* args */);
client.ontology().postOntologyExtractExtractEvents(/* args */);
client.ontology().postOntologyExtractExtractRelations(/* args */);
client.ontology().postOntologyExtractExtractTriplets(/* args */);
client.ontology().postOntologyExtractRuns(/* args */);
client.ontology().postOntologyGraphGraphAnalyze(/* args */);
client.ontology().postOntologyGraphGraphBuild(/* args */);
client.ontology().postOntologyGraphGraphBulkRead(/* args */);
client.ontology().postOntologyGraphGraphNeighborhood(/* args */);
client.ontology().postOntologyGraphGraphPath(/* args */);
client.ontology().postOntologyGraphGraphQuery(/* args */);
client.ontology().postOntologyGraphRuns(/* args */);
client.ontology().postOntologyObjectsRuns(/* args */);
client.ontology().postOntologyReasoningExplain(/* args */);
client.ontology().postOntologyReasoningFacts(/* args */);
client.ontology().postOntologyReasoningFactsLoadGraph(/* args */);
client.ontology().postOntologyReasoningReasonBackward(/* args */);
client.ontology().postOntologyReasoningReasonForward(/* args */);
client.ontology().postOntologyReasoningRules(/* args */);
client.ontology().postOntologyReasoningRuns(/* args */);
client.ontology().postOntologyRelationshipsRuns(/* args */);
client.ontology().postOntologyRolloutsRollouts(/* args */);
client.ontology().postOntologyRolloutsRolloutsRolloutIdPause(/* args */);
client.ontology().postOntologyRolloutsRolloutsRolloutIdResume(/* args */);
client.ontology().postOntologyRolloutsRolloutsRolloutIdRollback(/* args */);
client.ontology().postOntologyRolloutsRolloutsRolloutIdStart(/* args */);
client.ontology().postOntologyRolloutsRuns(/* args */);
client.ontology().postOntologyRollupsRollups(/* args */);
client.ontology().postOntologyRollupsRollupsRollupIdExecute(/* args */);
client.ontology().postOntologyRollupsRollupsRollupIdPreview(/* args */);
client.ontology().postOntologyRollupsRuns(/* args */);
client.ontology().postOntologySchemasRuns(/* args */);
client.ontology().postOntologySchemasSchemas(/* args */);
client.ontology().postOntologySchemasSchemasValidate(/* args */);
client.ontology().postOntologyTransformationsRuns(/* args */);
client.ontology().postOntologyTransformationsTransformations(/* args */);
client.ontology().postOntologyValidationPayloadsValidate(/* args */);
client.ontology().postOntologyValidationRules(/* args */);
client.ontology().postOntologyValidationRuns(/* args */);
client.ontology().postOntologyVersionsAuditVerify(/* args */);
client.ontology().postOntologyVersionsReleaseBundles(/* args */);
client.ontology().postOntologyVersionsRuns(/* args */);
client.ontology().postOntologyVersionsVersions(/* args */);
client.ontology().postOntologyVersionsVersionsCompare(/* args */);
client.ontology().putOntologyGraphEntitiesEntityId(/* args */);
client.ontology().putOntologyGraphRelationshipsRelationshipId(/* args */);
client.ontology().putOntologyObjectsObjectTypesObjectTypeId(/* args */);
client.ontology().putOntologyObjectsObjectsObjectId(/* args */);
client.ontology().putOntologyReasoningRulesRuleId(/* args */);
client.ontology().putOntologyRelationshipsRelationshipsRelationshipId(/* args */);
client.ontology().putOntologyRolloutsRolloutsRolloutId(/* args */);
client.ontology().putOntologyRollupsRollupsRollupId(/* args */);
```

Full signatures: [ontology](./ontology.md).

## pipelines

```java
client.pipelines().getDataPipelinesCapabilities(/* args */);
client.pipelines().getDataPipelinesHealth(/* args */);
client.pipelines().getDataPipelinesInfo(/* args */);
client.pipelines().getDataPipelinesPipelineRuns(/* args */);
client.pipelines().getDataPipelinesPipelineRunsParam(/* args */);
client.pipelines().getDataPipelinesPipelines(/* args */);
client.pipelines().getDataPipelinesPipelinesParam(/* args */);
client.pipelines().getDataPipelinesRuns(/* args */);
client.pipelines().postDataPipelinesPipelines(/* args */);
client.pipelines().postDataPipelinesRuns(/* args */);
client.pipelines().streamDataPipelinesPipelineRunsParam(/* args */);
client.pipelines().streamDataPipelinesPipelineRunsParamBlocking(/* args */);
```

Full signatures: [pipelines](./pipelines.md).

## providers

```java
client.providers().getProvidersProviderSlug(/* args */);
```

Full signatures: [providers](./providers.md).

## sandbox

```java
client.sandbox().getSandboxLanguages(/* args */);
client.sandbox().postSandboxSelfTest(/* args */);
client.sandbox().postSandboxSubmit(/* args */);
```

Full signatures: [sandbox](./sandbox.md).

## schedules

```java
client.schedules().deleteWorkflowsSchedulesParam(/* args */);
client.schedules().getWorkflowsSchedules(/* args */);
client.schedules().getWorkflowsSchedulesParam(/* args */);
client.schedules().patchWorkflowsSchedulesParam(/* args */);
client.schedules().postWorkflowsCronParse(/* args */);
client.schedules().postWorkflowsCronValidate(/* args */);
client.schedules().postWorkflowsSchedules(/* args */);
client.schedules().postWorkflowsSchedulesParamPause(/* args */);
client.schedules().postWorkflowsSchedulesParamResume(/* args */);
client.schedules().postWorkflowsSchedulesParamTrigger(/* args */);
```

Full signatures: [schedules](./schedules.md).

## webhook-endpoints

```java
client.webhookEndpoints().deleteWebhookEndpointsId(/* args */);
client.webhookEndpoints().getWebhookEndpoints(/* args */);
client.webhookEndpoints().getWebhookEndpointsId(/* args */);
client.webhookEndpoints().getWebhookEndpointsIdDeliveries(/* args */);
client.webhookEndpoints().patchWebhookEndpointsId(/* args */);
client.webhookEndpoints().postWebhookEndpoints(/* args */);
client.webhookEndpoints().postWebhookEndpointsIdRotateSecret(/* args */);
```

Full signatures: [webhook-endpoints](./webhook-endpoints.md).

## webhooks

```java
client.webhooks().deleteWebhooksParam(/* args */);
client.webhooks().getWebhooks(/* args */);
client.webhooks().getWebhooksDeliveries(/* args */);
client.webhooks().getWebhooksDeliveriesParam(/* args */);
client.webhooks().getWebhooksStats(/* args */);
client.webhooks().getWebhooksParam(/* args */);
client.webhooks().postWebhooks(/* args */);
client.webhooks().postWebhooksDeliveriesParamRetry(/* args */);
client.webhooks().postWebhooksParamRotateSecret(/* args */);
client.webhooks().putWebhooksParam(/* args */);
```

Full signatures: [webhooks](./webhooks.md).

## workflows

```java
client.workflows().deleteWorkflowsParam(/* args */);
client.workflows().getWorkflows(/* args */);
client.workflows().getWorkflowsApprovals(/* args */);
client.workflows().getWorkflowsApprovalsParam(/* args */);
client.workflows().getWorkflowsExecutions(/* args */);
client.workflows().getWorkflowsExecutionsParam(/* args */);
client.workflows().getWorkflowsExecutionsParamTasks(/* args */);
client.workflows().getWorkflowsRunsParamSteps(/* args */);
client.workflows().getWorkflowsTasksParam(/* args */);
client.workflows().getWorkflowsTemplates(/* args */);
client.workflows().getWorkflowsTemplatesParam(/* args */);
client.workflows().getWorkflowsParam(/* args */);
client.workflows().getWorkflowsWorkflowIdRunId(/* args */);
client.workflows().getWorkflowsWorkflowIdRunIdSummary(/* args */);
client.workflows().getWorkflowsWorkflowIdRunIdTimeline(/* args */);
client.workflows().patchWorkflowsParam(/* args */);
client.workflows().postWorkflows(/* args */);
client.workflows().postWorkflowsApprovalsParamApprove(/* args */);
client.workflows().postWorkflowsApprovalsParamReject(/* args */);
client.workflows().postWorkflowsBatch(/* args */);
client.workflows().postWorkflowsExecutions(/* args */);
client.workflows().postWorkflowsSearch(/* args */);
client.workflows().postWorkflowsTasksParamCancel(/* args */);
client.workflows().postWorkflowsTasksParamRetry(/* args */);
client.workflows().postWorkflowsTemplates(/* args */);
client.workflows().postWorkflowsTemplatesParamInstantiate(/* args */);
client.workflows().postWorkflowsParamArchive(/* args */);
client.workflows().postWorkflowsParamPublish(/* args */);
client.workflows().postWorkflowsParamRestore(/* args */);
client.workflows().postWorkflowsParamVersions(/* args */);
```

Full signatures: [workflows](./workflows.md).
