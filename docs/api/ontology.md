# Ontology API

Service accessor: `frontal.ontology()` (`OntologyClient`).

Named methods are generated from the committed route catalog. Build query values with `QueryParams` using exact API wire names. Routes without request schemas accept `JsonNode`; select `JsonNode` or a caller-provided model for unmodeled responses.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `deleteOntologyObjectsObjectTypesObjectTypeId(...)` | `DELETE` | `/ontology/objects/object-types/{param}` | `objectTypeId, query, Class<T> responseType` | `@Nullable T` |
| `deleteOntologyObjectsObjectTypesObjectTypeId(...)` | `DELETE` | `/ontology/objects/object-types/{param}` | `objectTypeId, query, TypeReference<T> responseType` | `@Nullable T` |
| `deleteOntologyObjectsObjectsObjectId(...)` | `DELETE` | `/ontology/objects/objects/{param}` | `objectId, query, Class<T> responseType` | `@Nullable T` |
| `deleteOntologyObjectsObjectsObjectId(...)` | `DELETE` | `/ontology/objects/objects/{param}` | `objectId, query, TypeReference<T> responseType` | `@Nullable T` |
| `deleteOntologyReasoningRulesRuleId(...)` | `DELETE` | `/ontology/reasoning/rules/{param}` | `ruleId, query, Class<T> responseType` | `@Nullable T` |
| `deleteOntologyReasoningRulesRuleId(...)` | `DELETE` | `/ontology/reasoning/rules/{param}` | `ruleId, query, TypeReference<T> responseType` | `@Nullable T` |
| `deleteOntologyRelationshipsRelationshipTypesRelationshipTypeId(...)` | `DELETE` | `/ontology/relationships/relationship-types/{param}` | `relationshipTypeId, query, Class<T> responseType` | `@Nullable T` |
| `deleteOntologyRelationshipsRelationshipTypesRelationshipTypeId(...)` | `DELETE` | `/ontology/relationships/relationship-types/{param}` | `relationshipTypeId, query, TypeReference<T> responseType` | `@Nullable T` |
| `deleteOntologyRelationshipsRelationshipsRelationshipId(...)` | `DELETE` | `/ontology/relationships/relationships/{param}` | `relationshipId, query, Class<T> responseType` | `@Nullable T` |
| `deleteOntologyRelationshipsRelationshipsRelationshipId(...)` | `DELETE` | `/ontology/relationships/relationships/{param}` | `relationshipId, query, TypeReference<T> responseType` | `@Nullable T` |
| `deleteOntologyRolloutsRolloutsRolloutId(...)` | `DELETE` | `/ontology/rollouts/rollouts/{param}` | `rolloutId, query, Class<T> responseType` | `@Nullable T` |
| `deleteOntologyRolloutsRolloutsRolloutId(...)` | `DELETE` | `/ontology/rollouts/rollouts/{param}` | `rolloutId, query, TypeReference<T> responseType` | `@Nullable T` |
| `deleteOntologyRollupsRollupsRollupId(...)` | `DELETE` | `/ontology/rollups/rollups/{param}` | `rollupId, query, Class<T> responseType` | `@Nullable T` |
| `deleteOntologyRollupsRollupsRollupId(...)` | `DELETE` | `/ontology/rollups/rollups/{param}` | `rollupId, query, TypeReference<T> responseType` | `@Nullable T` |
| `deleteOntologySchemasSchemasSchemaId(...)` | `DELETE` | `/ontology/schemas/schemas/{param}` | `schemaId, query, Class<T> responseType` | `@Nullable T` |
| `deleteOntologySchemasSchemasSchemaId(...)` | `DELETE` | `/ontology/schemas/schemas/{param}` | `schemaId, query, TypeReference<T> responseType` | `@Nullable T` |
| `deleteOntologyValidationRulesRuleId(...)` | `DELETE` | `/ontology/validation/rules/{param}` | `ruleId, query, Class<T> responseType` | `@Nullable T` |
| `deleteOntologyValidationRulesRuleId(...)` | `DELETE` | `/ontology/validation/rules/{param}` | `ruleId, query, TypeReference<T> responseType` | `@Nullable T` |
| `deleteOntologyVersionsVersionsVersionId(...)` | `DELETE` | `/ontology/versions/versions/{param}` | `versionId, query, Class<T> responseType` | `@Nullable T` |
| `deleteOntologyVersionsVersionsVersionId(...)` | `DELETE` | `/ontology/versions/versions/{param}` | `versionId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyEngineCapabilities(...)` | `GET` | `/ontology/engine/capabilities` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyEngineCapabilities(...)` | `GET` | `/ontology/engine/capabilities` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyEngineHealth(...)` | `GET` | `/ontology/engine/health` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyEngineHealth(...)` | `GET` | `/ontology/engine/health` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyEngineInfo(...)` | `GET` | `/ontology/engine/info` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyEngineInfo(...)` | `GET` | `/ontology/engine/info` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyEngineRuns(...)` | `GET` | `/ontology/engine/runs` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyEngineRuns(...)` | `GET` | `/ontology/engine/runs` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyEngineRunsRunId(...)` | `GET` | `/ontology/engine/runs/{param}` | `runId, query, Class<T> responseType` | `@Nullable T` |
| `getOntologyEngineRunsRunId(...)` | `GET` | `/ontology/engine/runs/{param}` | `runId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyEventsCapabilities(...)` | `GET` | `/ontology/events/capabilities` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyEventsCapabilities(...)` | `GET` | `/ontology/events/capabilities` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyEventsEvents(...)` | `GET` | `/ontology/events/events` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyEventsEvents(...)` | `GET` | `/ontology/events/events` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyEventsEventsCheckpointsConsumer(...)` | `GET` | `/ontology/events/events/checkpoints/{param}` | `consumer, query, Class<T> responseType` | `@Nullable T` |
| `getOntologyEventsEventsCheckpointsConsumer(...)` | `GET` | `/ontology/events/events/checkpoints/{param}` | `consumer, query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyEventsEventsEventId(...)` | `GET` | `/ontology/events/events/{param}` | `eventId, query, Class<T> responseType` | `@Nullable T` |
| `getOntologyEventsEventsEventId(...)` | `GET` | `/ontology/events/events/{param}` | `eventId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyEventsHealth(...)` | `GET` | `/ontology/events/health` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyEventsHealth(...)` | `GET` | `/ontology/events/health` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyEventsInfo(...)` | `GET` | `/ontology/events/info` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyEventsInfo(...)` | `GET` | `/ontology/events/info` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyEventsRuns(...)` | `GET` | `/ontology/events/runs` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyEventsRuns(...)` | `GET` | `/ontology/events/runs` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyEventsRunsRunId(...)` | `GET` | `/ontology/events/runs/{param}` | `runId, query, Class<T> responseType` | `@Nullable T` |
| `getOntologyEventsRunsRunId(...)` | `GET` | `/ontology/events/runs/{param}` | `runId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyExtractCapabilities(...)` | `GET` | `/ontology/extract/capabilities` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyExtractCapabilities(...)` | `GET` | `/ontology/extract/capabilities` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyExtractHealth(...)` | `GET` | `/ontology/extract/health` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyExtractHealth(...)` | `GET` | `/ontology/extract/health` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyExtractInfo(...)` | `GET` | `/ontology/extract/info` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyExtractInfo(...)` | `GET` | `/ontology/extract/info` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyExtractRuns(...)` | `GET` | `/ontology/extract/runs` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyExtractRuns(...)` | `GET` | `/ontology/extract/runs` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyExtractRunsRunId(...)` | `GET` | `/ontology/extract/runs/{param}` | `runId, query, Class<T> responseType` | `@Nullable T` |
| `getOntologyExtractRunsRunId(...)` | `GET` | `/ontology/extract/runs/{param}` | `runId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyGraphCapabilities(...)` | `GET` | `/ontology/graph/capabilities` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyGraphCapabilities(...)` | `GET` | `/ontology/graph/capabilities` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyGraphEntitiesEntityId(...)` | `GET` | `/ontology/graph/entities/{param}` | `entityId, query, Class<T> responseType` | `@Nullable T` |
| `getOntologyGraphEntitiesEntityId(...)` | `GET` | `/ontology/graph/entities/{param}` | `entityId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyGraphEntitiesEntityIdProvenance(...)` | `GET` | `/ontology/graph/entities/{param}/provenance` | `entityId, query, Class<T> responseType` | `@Nullable T` |
| `getOntologyGraphEntitiesEntityIdProvenance(...)` | `GET` | `/ontology/graph/entities/{param}/provenance` | `entityId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyGraphHealth(...)` | `GET` | `/ontology/graph/health` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyGraphHealth(...)` | `GET` | `/ontology/graph/health` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyGraphInfo(...)` | `GET` | `/ontology/graph/info` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyGraphInfo(...)` | `GET` | `/ontology/graph/info` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyGraphRelationshipsRelationshipId(...)` | `GET` | `/ontology/graph/relationships/{param}` | `relationshipId, query, Class<T> responseType` | `@Nullable T` |
| `getOntologyGraphRelationshipsRelationshipId(...)` | `GET` | `/ontology/graph/relationships/{param}` | `relationshipId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyGraphRuns(...)` | `GET` | `/ontology/graph/runs` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyGraphRuns(...)` | `GET` | `/ontology/graph/runs` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyGraphRunsRunId(...)` | `GET` | `/ontology/graph/runs/{param}` | `runId, query, Class<T> responseType` | `@Nullable T` |
| `getOntologyGraphRunsRunId(...)` | `GET` | `/ontology/graph/runs/{param}` | `runId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyObjectsCapabilities(...)` | `GET` | `/ontology/objects/capabilities` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyObjectsCapabilities(...)` | `GET` | `/ontology/objects/capabilities` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyObjectsHealth(...)` | `GET` | `/ontology/objects/health` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyObjectsHealth(...)` | `GET` | `/ontology/objects/health` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyObjectsInfo(...)` | `GET` | `/ontology/objects/info` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyObjectsInfo(...)` | `GET` | `/ontology/objects/info` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyObjectsObjectTypes(...)` | `GET` | `/ontology/objects/object-types` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyObjectsObjectTypes(...)` | `GET` | `/ontology/objects/object-types` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyObjectsObjectTypesObjectTypeId(...)` | `GET` | `/ontology/objects/object-types/{param}` | `objectTypeId, query, Class<T> responseType` | `@Nullable T` |
| `getOntologyObjectsObjectTypesObjectTypeId(...)` | `GET` | `/ontology/objects/object-types/{param}` | `objectTypeId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyObjectsObjects(...)` | `GET` | `/ontology/objects/objects` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyObjectsObjects(...)` | `GET` | `/ontology/objects/objects` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyObjectsObjectsObjectId(...)` | `GET` | `/ontology/objects/objects/{param}` | `objectId, query, Class<T> responseType` | `@Nullable T` |
| `getOntologyObjectsObjectsObjectId(...)` | `GET` | `/ontology/objects/objects/{param}` | `objectId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyObjectsRuns(...)` | `GET` | `/ontology/objects/runs` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyObjectsRuns(...)` | `GET` | `/ontology/objects/runs` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyObjectsRunsRunId(...)` | `GET` | `/ontology/objects/runs/{param}` | `runId, query, Class<T> responseType` | `@Nullable T` |
| `getOntologyObjectsRunsRunId(...)` | `GET` | `/ontology/objects/runs/{param}` | `runId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyReasoningCapabilities(...)` | `GET` | `/ontology/reasoning/capabilities` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyReasoningCapabilities(...)` | `GET` | `/ontology/reasoning/capabilities` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyReasoningHealth(...)` | `GET` | `/ontology/reasoning/health` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyReasoningHealth(...)` | `GET` | `/ontology/reasoning/health` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyReasoningInfo(...)` | `GET` | `/ontology/reasoning/info` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyReasoningInfo(...)` | `GET` | `/ontology/reasoning/info` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyReasoningRules(...)` | `GET` | `/ontology/reasoning/rules` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyReasoningRules(...)` | `GET` | `/ontology/reasoning/rules` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyReasoningRuns(...)` | `GET` | `/ontology/reasoning/runs` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyReasoningRuns(...)` | `GET` | `/ontology/reasoning/runs` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyReasoningRunsRunId(...)` | `GET` | `/ontology/reasoning/runs/{param}` | `runId, query, Class<T> responseType` | `@Nullable T` |
| `getOntologyReasoningRunsRunId(...)` | `GET` | `/ontology/reasoning/runs/{param}` | `runId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyRelationshipsCapabilities(...)` | `GET` | `/ontology/relationships/capabilities` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyRelationshipsCapabilities(...)` | `GET` | `/ontology/relationships/capabilities` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyRelationshipsHealth(...)` | `GET` | `/ontology/relationships/health` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyRelationshipsHealth(...)` | `GET` | `/ontology/relationships/health` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyRelationshipsInfo(...)` | `GET` | `/ontology/relationships/info` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyRelationshipsInfo(...)` | `GET` | `/ontology/relationships/info` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyRelationshipsRelationshipTypes(...)` | `GET` | `/ontology/relationships/relationship-types` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyRelationshipsRelationshipTypes(...)` | `GET` | `/ontology/relationships/relationship-types` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyRelationshipsRelationships(...)` | `GET` | `/ontology/relationships/relationships` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyRelationshipsRelationships(...)` | `GET` | `/ontology/relationships/relationships` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyRelationshipsRelationshipsRelationshipId(...)` | `GET` | `/ontology/relationships/relationships/{param}` | `relationshipId, query, Class<T> responseType` | `@Nullable T` |
| `getOntologyRelationshipsRelationshipsRelationshipId(...)` | `GET` | `/ontology/relationships/relationships/{param}` | `relationshipId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyRelationshipsRuns(...)` | `GET` | `/ontology/relationships/runs` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyRelationshipsRuns(...)` | `GET` | `/ontology/relationships/runs` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyRelationshipsRunsRunId(...)` | `GET` | `/ontology/relationships/runs/{param}` | `runId, query, Class<T> responseType` | `@Nullable T` |
| `getOntologyRelationshipsRunsRunId(...)` | `GET` | `/ontology/relationships/runs/{param}` | `runId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyRolloutsCapabilities(...)` | `GET` | `/ontology/rollouts/capabilities` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyRolloutsCapabilities(...)` | `GET` | `/ontology/rollouts/capabilities` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyRolloutsHealth(...)` | `GET` | `/ontology/rollouts/health` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyRolloutsHealth(...)` | `GET` | `/ontology/rollouts/health` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyRolloutsInfo(...)` | `GET` | `/ontology/rollouts/info` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyRolloutsInfo(...)` | `GET` | `/ontology/rollouts/info` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyRolloutsRollouts(...)` | `GET` | `/ontology/rollouts/rollouts` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyRolloutsRollouts(...)` | `GET` | `/ontology/rollouts/rollouts` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyRolloutsRolloutsRolloutId(...)` | `GET` | `/ontology/rollouts/rollouts/{param}` | `rolloutId, query, Class<T> responseType` | `@Nullable T` |
| `getOntologyRolloutsRolloutsRolloutId(...)` | `GET` | `/ontology/rollouts/rollouts/{param}` | `rolloutId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyRolloutsRolloutsRolloutIdStatus(...)` | `GET` | `/ontology/rollouts/rollouts/{param}/status` | `rolloutId, query, Class<T> responseType` | `@Nullable T` |
| `getOntologyRolloutsRolloutsRolloutIdStatus(...)` | `GET` | `/ontology/rollouts/rollouts/{param}/status` | `rolloutId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyRolloutsRuns(...)` | `GET` | `/ontology/rollouts/runs` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyRolloutsRuns(...)` | `GET` | `/ontology/rollouts/runs` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyRolloutsRunsRunId(...)` | `GET` | `/ontology/rollouts/runs/{param}` | `runId, query, Class<T> responseType` | `@Nullable T` |
| `getOntologyRolloutsRunsRunId(...)` | `GET` | `/ontology/rollouts/runs/{param}` | `runId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyRollupsCapabilities(...)` | `GET` | `/ontology/rollups/capabilities` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyRollupsCapabilities(...)` | `GET` | `/ontology/rollups/capabilities` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyRollupsHealth(...)` | `GET` | `/ontology/rollups/health` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyRollupsHealth(...)` | `GET` | `/ontology/rollups/health` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyRollupsInfo(...)` | `GET` | `/ontology/rollups/info` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyRollupsInfo(...)` | `GET` | `/ontology/rollups/info` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyRollupsRollupResultsExecutionId(...)` | `GET` | `/ontology/rollups/rollup-results/{param}` | `executionId, query, Class<T> responseType` | `@Nullable T` |
| `getOntologyRollupsRollupResultsExecutionId(...)` | `GET` | `/ontology/rollups/rollup-results/{param}` | `executionId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyRollupsRollups(...)` | `GET` | `/ontology/rollups/rollups` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyRollupsRollups(...)` | `GET` | `/ontology/rollups/rollups` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyRollupsRollupsRollupId(...)` | `GET` | `/ontology/rollups/rollups/{param}` | `rollupId, query, Class<T> responseType` | `@Nullable T` |
| `getOntologyRollupsRollupsRollupId(...)` | `GET` | `/ontology/rollups/rollups/{param}` | `rollupId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyRollupsRollupsRollupIdResult(...)` | `GET` | `/ontology/rollups/rollups/{param}/result` | `rollupId, query, Class<T> responseType` | `@Nullable T` |
| `getOntologyRollupsRollupsRollupIdResult(...)` | `GET` | `/ontology/rollups/rollups/{param}/result` | `rollupId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyRollupsRuns(...)` | `GET` | `/ontology/rollups/runs` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyRollupsRuns(...)` | `GET` | `/ontology/rollups/runs` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyRollupsRunsRunId(...)` | `GET` | `/ontology/rollups/runs/{param}` | `runId, query, Class<T> responseType` | `@Nullable T` |
| `getOntologyRollupsRunsRunId(...)` | `GET` | `/ontology/rollups/runs/{param}` | `runId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologySchemasCapabilities(...)` | `GET` | `/ontology/schemas/capabilities` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologySchemasCapabilities(...)` | `GET` | `/ontology/schemas/capabilities` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologySchemasHealth(...)` | `GET` | `/ontology/schemas/health` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologySchemasHealth(...)` | `GET` | `/ontology/schemas/health` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologySchemasInfo(...)` | `GET` | `/ontology/schemas/info` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologySchemasInfo(...)` | `GET` | `/ontology/schemas/info` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologySchemasRuns(...)` | `GET` | `/ontology/schemas/runs` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologySchemasRuns(...)` | `GET` | `/ontology/schemas/runs` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologySchemasRunsRunId(...)` | `GET` | `/ontology/schemas/runs/{param}` | `runId, query, Class<T> responseType` | `@Nullable T` |
| `getOntologySchemasRunsRunId(...)` | `GET` | `/ontology/schemas/runs/{param}` | `runId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologySchemasSchemas(...)` | `GET` | `/ontology/schemas/schemas` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologySchemasSchemas(...)` | `GET` | `/ontology/schemas/schemas` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologySchemasSchemasSchemaId(...)` | `GET` | `/ontology/schemas/schemas/{param}` | `schemaId, query, Class<T> responseType` | `@Nullable T` |
| `getOntologySchemasSchemasSchemaId(...)` | `GET` | `/ontology/schemas/schemas/{param}` | `schemaId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyTransformationsCapabilities(...)` | `GET` | `/ontology/transformations/capabilities` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyTransformationsCapabilities(...)` | `GET` | `/ontology/transformations/capabilities` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyTransformationsHealth(...)` | `GET` | `/ontology/transformations/health` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyTransformationsHealth(...)` | `GET` | `/ontology/transformations/health` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyTransformationsInfo(...)` | `GET` | `/ontology/transformations/info` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyTransformationsInfo(...)` | `GET` | `/ontology/transformations/info` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyTransformationsRuns(...)` | `GET` | `/ontology/transformations/runs` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyTransformationsRuns(...)` | `GET` | `/ontology/transformations/runs` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyTransformationsRunsRunId(...)` | `GET` | `/ontology/transformations/runs/{param}` | `runId, query, Class<T> responseType` | `@Nullable T` |
| `getOntologyTransformationsRunsRunId(...)` | `GET` | `/ontology/transformations/runs/{param}` | `runId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyValidationCapabilities(...)` | `GET` | `/ontology/validation/capabilities` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyValidationCapabilities(...)` | `GET` | `/ontology/validation/capabilities` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyValidationHealth(...)` | `GET` | `/ontology/validation/health` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyValidationHealth(...)` | `GET` | `/ontology/validation/health` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyValidationInfo(...)` | `GET` | `/ontology/validation/info` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyValidationInfo(...)` | `GET` | `/ontology/validation/info` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyValidationRules(...)` | `GET` | `/ontology/validation/rules` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyValidationRules(...)` | `GET` | `/ontology/validation/rules` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyValidationRulesRuleId(...)` | `GET` | `/ontology/validation/rules/{param}` | `ruleId, query, Class<T> responseType` | `@Nullable T` |
| `getOntologyValidationRulesRuleId(...)` | `GET` | `/ontology/validation/rules/{param}` | `ruleId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyValidationRuns(...)` | `GET` | `/ontology/validation/runs` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyValidationRuns(...)` | `GET` | `/ontology/validation/runs` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyValidationRunsRunId(...)` | `GET` | `/ontology/validation/runs/{param}` | `runId, query, Class<T> responseType` | `@Nullable T` |
| `getOntologyValidationRunsRunId(...)` | `GET` | `/ontology/validation/runs/{param}` | `runId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyVersionsCapabilities(...)` | `GET` | `/ontology/versions/capabilities` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyVersionsCapabilities(...)` | `GET` | `/ontology/versions/capabilities` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyVersionsHealth(...)` | `GET` | `/ontology/versions/health` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyVersionsHealth(...)` | `GET` | `/ontology/versions/health` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyVersionsInfo(...)` | `GET` | `/ontology/versions/info` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyVersionsInfo(...)` | `GET` | `/ontology/versions/info` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyVersionsReleaseBundles(...)` | `GET` | `/ontology/versions/release-bundles` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyVersionsReleaseBundles(...)` | `GET` | `/ontology/versions/release-bundles` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyVersionsReleaseBundlesBundleId(...)` | `GET` | `/ontology/versions/release-bundles/{param}` | `bundleId, query, Class<T> responseType` | `@Nullable T` |
| `getOntologyVersionsReleaseBundlesBundleId(...)` | `GET` | `/ontology/versions/release-bundles/{param}` | `bundleId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyVersionsRuns(...)` | `GET` | `/ontology/versions/runs` | `query, Class<T> responseType` | `@Nullable T` |
| `getOntologyVersionsRuns(...)` | `GET` | `/ontology/versions/runs` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyVersionsRunsRunId(...)` | `GET` | `/ontology/versions/runs/{param}` | `runId, query, Class<T> responseType` | `@Nullable T` |
| `getOntologyVersionsRunsRunId(...)` | `GET` | `/ontology/versions/runs/{param}` | `runId, query, TypeReference<T> responseType` | `@Nullable T` |
| `getOntologyVersionsVersionsVersionId(...)` | `GET` | `/ontology/versions/versions/{param}` | `versionId, query, Class<T> responseType` | `@Nullable T` |
| `getOntologyVersionsVersionsVersionId(...)` | `GET` | `/ontology/versions/versions/{param}` | `versionId, query, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyEngineOntologiesCompareVersions(...)` | `POST` | `/ontology/engine/ontologies/compare-versions` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyEngineOntologiesCompareVersions(...)` | `POST` | `/ontology/engine/ontologies/compare-versions` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyEngineOntologiesExport(...)` | `POST` | `/ontology/engine/ontologies/export` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyEngineOntologiesExport(...)` | `POST` | `/ontology/engine/ontologies/export` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyEngineOntologiesExportShacl(...)` | `POST` | `/ontology/engine/ontologies/export-shacl` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyEngineOntologiesExportShacl(...)` | `POST` | `/ontology/engine/ontologies/export-shacl` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyEngineOntologiesGenerate(...)` | `POST` | `/ontology/engine/ontologies/generate` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyEngineOntologiesGenerate(...)` | `POST` | `/ontology/engine/ontologies/generate` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyEngineOntologiesInferClasses(...)` | `POST` | `/ontology/engine/ontologies/infer-classes` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyEngineOntologiesInferClasses(...)` | `POST` | `/ontology/engine/ontologies/infer-classes` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyEngineOntologiesInferProperties(...)` | `POST` | `/ontology/engine/ontologies/infer-properties` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyEngineOntologiesInferProperties(...)` | `POST` | `/ontology/engine/ontologies/infer-properties` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyEngineOntologiesValidate(...)` | `POST` | `/ontology/engine/ontologies/validate` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyEngineOntologiesValidate(...)` | `POST` | `/ontology/engine/ontologies/validate` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyEngineRuns(...)` | `POST` | `/ontology/engine/runs` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyEngineRuns(...)` | `POST` | `/ontology/engine/runs` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyEventsEvents(...)` | `POST` | `/ontology/events/events` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyEventsEvents(...)` | `POST` | `/ontology/events/events` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyEventsEventsCheckpoints(...)` | `POST` | `/ontology/events/events/checkpoints` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyEventsEventsCheckpoints(...)` | `POST` | `/ontology/events/events/checkpoints` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyEventsEventsLeasesAcknowledge(...)` | `POST` | `/ontology/events/events/leases/acknowledge` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyEventsEventsLeasesAcknowledge(...)` | `POST` | `/ontology/events/events/leases/acknowledge` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyEventsEventsLeasesAcquire(...)` | `POST` | `/ontology/events/events/leases/acquire` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyEventsEventsLeasesAcquire(...)` | `POST` | `/ontology/events/events/leases/acquire` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyEventsRuns(...)` | `POST` | `/ontology/events/runs` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyEventsRuns(...)` | `POST` | `/ontology/events/runs` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyExtractExtractAnalyze(...)` | `POST` | `/ontology/extract/extract/analyze` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyExtractExtractAnalyze(...)` | `POST` | `/ontology/extract/extract/analyze` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyExtractExtractArchitecture(...)` | `POST` | `/ontology/extract/extract/architecture` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyExtractExtractArchitecture(...)` | `POST` | `/ontology/extract/extract/architecture` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyExtractExtractCoreferences(...)` | `POST` | `/ontology/extract/extract/coreferences` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyExtractExtractCoreferences(...)` | `POST` | `/ontology/extract/extract/coreferences` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyExtractExtractEntities(...)` | `POST` | `/ontology/extract/extract/entities` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyExtractExtractEntities(...)` | `POST` | `/ontology/extract/extract/entities` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyExtractExtractEvents(...)` | `POST` | `/ontology/extract/extract/events` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyExtractExtractEvents(...)` | `POST` | `/ontology/extract/extract/events` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyExtractExtractRelations(...)` | `POST` | `/ontology/extract/extract/relations` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyExtractExtractRelations(...)` | `POST` | `/ontology/extract/extract/relations` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyExtractExtractTriplets(...)` | `POST` | `/ontology/extract/extract/triplets` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyExtractExtractTriplets(...)` | `POST` | `/ontology/extract/extract/triplets` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyExtractRuns(...)` | `POST` | `/ontology/extract/runs` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyExtractRuns(...)` | `POST` | `/ontology/extract/runs` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyGraphGraphAnalyze(...)` | `POST` | `/ontology/graph/graph/analyze` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyGraphGraphAnalyze(...)` | `POST` | `/ontology/graph/graph/analyze` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyGraphGraphBuild(...)` | `POST` | `/ontology/graph/graph/build` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyGraphGraphBuild(...)` | `POST` | `/ontology/graph/graph/build` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyGraphGraphBulkRead(...)` | `POST` | `/ontology/graph/graph/bulk-read` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyGraphGraphBulkRead(...)` | `POST` | `/ontology/graph/graph/bulk-read` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyGraphGraphNeighborhood(...)` | `POST` | `/ontology/graph/graph/neighborhood` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyGraphGraphNeighborhood(...)` | `POST` | `/ontology/graph/graph/neighborhood` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyGraphGraphPath(...)` | `POST` | `/ontology/graph/graph/path` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyGraphGraphPath(...)` | `POST` | `/ontology/graph/graph/path` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyGraphGraphQuery(...)` | `POST` | `/ontology/graph/graph/query` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyGraphGraphQuery(...)` | `POST` | `/ontology/graph/graph/query` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyGraphRuns(...)` | `POST` | `/ontology/graph/runs` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyGraphRuns(...)` | `POST` | `/ontology/graph/runs` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyObjectsRuns(...)` | `POST` | `/ontology/objects/runs` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyObjectsRuns(...)` | `POST` | `/ontology/objects/runs` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyReasoningExplain(...)` | `POST` | `/ontology/reasoning/explain` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyReasoningExplain(...)` | `POST` | `/ontology/reasoning/explain` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyReasoningFacts(...)` | `POST` | `/ontology/reasoning/facts` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyReasoningFacts(...)` | `POST` | `/ontology/reasoning/facts` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyReasoningFactsLoadGraph(...)` | `POST` | `/ontology/reasoning/facts/load-graph` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyReasoningFactsLoadGraph(...)` | `POST` | `/ontology/reasoning/facts/load-graph` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyReasoningReasonBackward(...)` | `POST` | `/ontology/reasoning/reason/backward` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyReasoningReasonBackward(...)` | `POST` | `/ontology/reasoning/reason/backward` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyReasoningReasonForward(...)` | `POST` | `/ontology/reasoning/reason/forward` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyReasoningReasonForward(...)` | `POST` | `/ontology/reasoning/reason/forward` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyReasoningRules(...)` | `POST` | `/ontology/reasoning/rules` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyReasoningRules(...)` | `POST` | `/ontology/reasoning/rules` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyReasoningRuns(...)` | `POST` | `/ontology/reasoning/runs` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyReasoningRuns(...)` | `POST` | `/ontology/reasoning/runs` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyRelationshipsRuns(...)` | `POST` | `/ontology/relationships/runs` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyRelationshipsRuns(...)` | `POST` | `/ontology/relationships/runs` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyRolloutsRollouts(...)` | `POST` | `/ontology/rollouts/rollouts` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyRolloutsRollouts(...)` | `POST` | `/ontology/rollouts/rollouts` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyRolloutsRolloutsRolloutIdPause(...)` | `POST` | `/ontology/rollouts/rollouts/{param}/pause` | `rolloutId, query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyRolloutsRolloutsRolloutIdPause(...)` | `POST` | `/ontology/rollouts/rollouts/{param}/pause` | `rolloutId, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyRolloutsRolloutsRolloutIdResume(...)` | `POST` | `/ontology/rollouts/rollouts/{param}/resume` | `rolloutId, query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyRolloutsRolloutsRolloutIdResume(...)` | `POST` | `/ontology/rollouts/rollouts/{param}/resume` | `rolloutId, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyRolloutsRolloutsRolloutIdRollback(...)` | `POST` | `/ontology/rollouts/rollouts/{param}/rollback` | `rolloutId, query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyRolloutsRolloutsRolloutIdRollback(...)` | `POST` | `/ontology/rollouts/rollouts/{param}/rollback` | `rolloutId, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyRolloutsRolloutsRolloutIdStart(...)` | `POST` | `/ontology/rollouts/rollouts/{param}/start` | `rolloutId, query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyRolloutsRolloutsRolloutIdStart(...)` | `POST` | `/ontology/rollouts/rollouts/{param}/start` | `rolloutId, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyRolloutsRuns(...)` | `POST` | `/ontology/rollouts/runs` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyRolloutsRuns(...)` | `POST` | `/ontology/rollouts/runs` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyRollupsRollups(...)` | `POST` | `/ontology/rollups/rollups` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyRollupsRollups(...)` | `POST` | `/ontology/rollups/rollups` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyRollupsRollupsRollupIdExecute(...)` | `POST` | `/ontology/rollups/rollups/{param}/execute` | `rollupId, query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyRollupsRollupsRollupIdExecute(...)` | `POST` | `/ontology/rollups/rollups/{param}/execute` | `rollupId, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyRollupsRollupsRollupIdPreview(...)` | `POST` | `/ontology/rollups/rollups/{param}/preview` | `rollupId, query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyRollupsRollupsRollupIdPreview(...)` | `POST` | `/ontology/rollups/rollups/{param}/preview` | `rollupId, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyRollupsRuns(...)` | `POST` | `/ontology/rollups/runs` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyRollupsRuns(...)` | `POST` | `/ontology/rollups/runs` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologySchemasRuns(...)` | `POST` | `/ontology/schemas/runs` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologySchemasRuns(...)` | `POST` | `/ontology/schemas/runs` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologySchemasSchemas(...)` | `POST` | `/ontology/schemas/schemas` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologySchemasSchemas(...)` | `POST` | `/ontology/schemas/schemas` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologySchemasSchemasValidate(...)` | `POST` | `/ontology/schemas/schemas/validate` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologySchemasSchemasValidate(...)` | `POST` | `/ontology/schemas/schemas/validate` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyTransformationsRuns(...)` | `POST` | `/ontology/transformations/runs` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyTransformationsRuns(...)` | `POST` | `/ontology/transformations/runs` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyTransformationsTransformations(...)` | `POST` | `/ontology/transformations/transformations` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyTransformationsTransformations(...)` | `POST` | `/ontology/transformations/transformations` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyValidationPayloadsValidate(...)` | `POST` | `/ontology/validation/payloads/validate` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyValidationPayloadsValidate(...)` | `POST` | `/ontology/validation/payloads/validate` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyValidationRules(...)` | `POST` | `/ontology/validation/rules` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyValidationRules(...)` | `POST` | `/ontology/validation/rules` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyValidationRuns(...)` | `POST` | `/ontology/validation/runs` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyValidationRuns(...)` | `POST` | `/ontology/validation/runs` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyVersionsAuditVerify(...)` | `POST` | `/ontology/versions/audit/verify` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyVersionsAuditVerify(...)` | `POST` | `/ontology/versions/audit/verify` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyVersionsReleaseBundles(...)` | `POST` | `/ontology/versions/release-bundles` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyVersionsReleaseBundles(...)` | `POST` | `/ontology/versions/release-bundles` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyVersionsRuns(...)` | `POST` | `/ontology/versions/runs` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyVersionsRuns(...)` | `POST` | `/ontology/versions/runs` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyVersionsVersions(...)` | `POST` | `/ontology/versions/versions` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyVersionsVersions(...)` | `POST` | `/ontology/versions/versions` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postOntologyVersionsVersionsCompare(...)` | `POST` | `/ontology/versions/versions/compare` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postOntologyVersionsVersionsCompare(...)` | `POST` | `/ontology/versions/versions/compare` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `putOntologyGraphEntitiesEntityId(...)` | `PUT` | `/ontology/graph/entities/{param}` | `entityId, query, body, Class<T> responseType` | `@Nullable T` |
| `putOntologyGraphEntitiesEntityId(...)` | `PUT` | `/ontology/graph/entities/{param}` | `entityId, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `putOntologyGraphRelationshipsRelationshipId(...)` | `PUT` | `/ontology/graph/relationships/{param}` | `relationshipId, query, body, Class<T> responseType` | `@Nullable T` |
| `putOntologyGraphRelationshipsRelationshipId(...)` | `PUT` | `/ontology/graph/relationships/{param}` | `relationshipId, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `putOntologyObjectsObjectTypesObjectTypeId(...)` | `PUT` | `/ontology/objects/object-types/{param}` | `objectTypeId, query, body, Class<T> responseType` | `@Nullable T` |
| `putOntologyObjectsObjectTypesObjectTypeId(...)` | `PUT` | `/ontology/objects/object-types/{param}` | `objectTypeId, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `putOntologyObjectsObjectsObjectId(...)` | `PUT` | `/ontology/objects/objects/{param}` | `objectId, query, body, Class<T> responseType` | `@Nullable T` |
| `putOntologyObjectsObjectsObjectId(...)` | `PUT` | `/ontology/objects/objects/{param}` | `objectId, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `putOntologyReasoningRulesRuleId(...)` | `PUT` | `/ontology/reasoning/rules/{param}` | `ruleId, query, body, Class<T> responseType` | `@Nullable T` |
| `putOntologyReasoningRulesRuleId(...)` | `PUT` | `/ontology/reasoning/rules/{param}` | `ruleId, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `putOntologyRelationshipsRelationshipsRelationshipId(...)` | `PUT` | `/ontology/relationships/relationships/{param}` | `relationshipId, query, body, Class<T> responseType` | `@Nullable T` |
| `putOntologyRelationshipsRelationshipsRelationshipId(...)` | `PUT` | `/ontology/relationships/relationships/{param}` | `relationshipId, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `putOntologyRolloutsRolloutsRolloutId(...)` | `PUT` | `/ontology/rollouts/rollouts/{param}` | `rolloutId, query, body, Class<T> responseType` | `@Nullable T` |
| `putOntologyRolloutsRolloutsRolloutId(...)` | `PUT` | `/ontology/rollouts/rollouts/{param}` | `rolloutId, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `putOntologyRollupsRollupsRollupId(...)` | `PUT` | `/ontology/rollups/rollups/{param}` | `rollupId, query, body, Class<T> responseType` | `@Nullable T` |
| `putOntologyRollupsRollupsRollupId(...)` | `PUT` | `/ontology/rollups/rollups/{param}` | `rollupId, query, body, TypeReference<T> responseType` | `@Nullable T` |
| No catalogued operations | — | — | — | — |

The generic `request(...)` methods and `Endpoints` constants remain available.
