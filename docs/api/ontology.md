# Ontology API

Service accessor: `frontal.ontology()` (`OntologyClient`).

Operations are grouped by resource path. Collection methods use `list` and `create`; item methods use `get`, `update`, and `delete`. Calls can omit `QueryParams` when no query values are needed. Use contract-defined `JsonNode` bodies and caller-selected response types where schemas are not available.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `ontology().engine().health(...)` | `GET` | `/ontology/engine/health` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().engine().health(...)` | `GET` | `/ontology/engine/health` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().engine().health(...)` | `GET` | `/ontology/engine/health` | `Class<T> responseType` | `@Nullable T` |
| `ontology().engine().health(...)` | `GET` | `/ontology/engine/health` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().engine().getInfo(...)` | `GET` | `/ontology/engine/info` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().engine().getInfo(...)` | `GET` | `/ontology/engine/info` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().engine().getInfo(...)` | `GET` | `/ontology/engine/info` | `Class<T> responseType` | `@Nullable T` |
| `ontology().engine().getInfo(...)` | `GET` | `/ontology/engine/info` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().events().health(...)` | `GET` | `/ontology/events/health` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().events().health(...)` | `GET` | `/ontology/events/health` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().events().health(...)` | `GET` | `/ontology/events/health` | `Class<T> responseType` | `@Nullable T` |
| `ontology().events().health(...)` | `GET` | `/ontology/events/health` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().events().getInfo(...)` | `GET` | `/ontology/events/info` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().events().getInfo(...)` | `GET` | `/ontology/events/info` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().events().getInfo(...)` | `GET` | `/ontology/events/info` | `Class<T> responseType` | `@Nullable T` |
| `ontology().events().getInfo(...)` | `GET` | `/ontology/events/info` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().extract().health(...)` | `GET` | `/ontology/extract/health` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().extract().health(...)` | `GET` | `/ontology/extract/health` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().extract().health(...)` | `GET` | `/ontology/extract/health` | `Class<T> responseType` | `@Nullable T` |
| `ontology().extract().health(...)` | `GET` | `/ontology/extract/health` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().extract().getInfo(...)` | `GET` | `/ontology/extract/info` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().extract().getInfo(...)` | `GET` | `/ontology/extract/info` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().extract().getInfo(...)` | `GET` | `/ontology/extract/info` | `Class<T> responseType` | `@Nullable T` |
| `ontology().extract().getInfo(...)` | `GET` | `/ontology/extract/info` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().graph().health(...)` | `GET` | `/ontology/graph/health` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().graph().health(...)` | `GET` | `/ontology/graph/health` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().graph().health(...)` | `GET` | `/ontology/graph/health` | `Class<T> responseType` | `@Nullable T` |
| `ontology().graph().health(...)` | `GET` | `/ontology/graph/health` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().graph().getInfo(...)` | `GET` | `/ontology/graph/info` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().graph().getInfo(...)` | `GET` | `/ontology/graph/info` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().graph().getInfo(...)` | `GET` | `/ontology/graph/info` | `Class<T> responseType` | `@Nullable T` |
| `ontology().graph().getInfo(...)` | `GET` | `/ontology/graph/info` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().objects().health(...)` | `GET` | `/ontology/objects/health` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().objects().health(...)` | `GET` | `/ontology/objects/health` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().objects().health(...)` | `GET` | `/ontology/objects/health` | `Class<T> responseType` | `@Nullable T` |
| `ontology().objects().health(...)` | `GET` | `/ontology/objects/health` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().objects().getInfo(...)` | `GET` | `/ontology/objects/info` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().objects().getInfo(...)` | `GET` | `/ontology/objects/info` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().objects().getInfo(...)` | `GET` | `/ontology/objects/info` | `Class<T> responseType` | `@Nullable T` |
| `ontology().objects().getInfo(...)` | `GET` | `/ontology/objects/info` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().reasoning().health(...)` | `GET` | `/ontology/reasoning/health` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().reasoning().health(...)` | `GET` | `/ontology/reasoning/health` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().reasoning().health(...)` | `GET` | `/ontology/reasoning/health` | `Class<T> responseType` | `@Nullable T` |
| `ontology().reasoning().health(...)` | `GET` | `/ontology/reasoning/health` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().reasoning().getInfo(...)` | `GET` | `/ontology/reasoning/info` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().reasoning().getInfo(...)` | `GET` | `/ontology/reasoning/info` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().reasoning().getInfo(...)` | `GET` | `/ontology/reasoning/info` | `Class<T> responseType` | `@Nullable T` |
| `ontology().reasoning().getInfo(...)` | `GET` | `/ontology/reasoning/info` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().reasoning().createExplain(...)` | `POST` | `/ontology/reasoning/explain` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().reasoning().createExplain(...)` | `POST` | `/ontology/reasoning/explain` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().reasoning().createExplain(...)` | `POST` | `/ontology/reasoning/explain` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().reasoning().createExplain(...)` | `POST` | `/ontology/reasoning/explain` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().relationships().health(...)` | `GET` | `/ontology/relationships/health` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().relationships().health(...)` | `GET` | `/ontology/relationships/health` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().relationships().health(...)` | `GET` | `/ontology/relationships/health` | `Class<T> responseType` | `@Nullable T` |
| `ontology().relationships().health(...)` | `GET` | `/ontology/relationships/health` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().relationships().getInfo(...)` | `GET` | `/ontology/relationships/info` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().relationships().getInfo(...)` | `GET` | `/ontology/relationships/info` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().relationships().getInfo(...)` | `GET` | `/ontology/relationships/info` | `Class<T> responseType` | `@Nullable T` |
| `ontology().relationships().getInfo(...)` | `GET` | `/ontology/relationships/info` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollouts().health(...)` | `GET` | `/ontology/rollouts/health` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().rollouts().health(...)` | `GET` | `/ontology/rollouts/health` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollouts().health(...)` | `GET` | `/ontology/rollouts/health` | `Class<T> responseType` | `@Nullable T` |
| `ontology().rollouts().health(...)` | `GET` | `/ontology/rollouts/health` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollouts().getInfo(...)` | `GET` | `/ontology/rollouts/info` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().rollouts().getInfo(...)` | `GET` | `/ontology/rollouts/info` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollouts().getInfo(...)` | `GET` | `/ontology/rollouts/info` | `Class<T> responseType` | `@Nullable T` |
| `ontology().rollouts().getInfo(...)` | `GET` | `/ontology/rollouts/info` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollups().health(...)` | `GET` | `/ontology/rollups/health` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().rollups().health(...)` | `GET` | `/ontology/rollups/health` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollups().health(...)` | `GET` | `/ontology/rollups/health` | `Class<T> responseType` | `@Nullable T` |
| `ontology().rollups().health(...)` | `GET` | `/ontology/rollups/health` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollups().getInfo(...)` | `GET` | `/ontology/rollups/info` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().rollups().getInfo(...)` | `GET` | `/ontology/rollups/info` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollups().getInfo(...)` | `GET` | `/ontology/rollups/info` | `Class<T> responseType` | `@Nullable T` |
| `ontology().rollups().getInfo(...)` | `GET` | `/ontology/rollups/info` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().schemas().health(...)` | `GET` | `/ontology/schemas/health` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().schemas().health(...)` | `GET` | `/ontology/schemas/health` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().schemas().health(...)` | `GET` | `/ontology/schemas/health` | `Class<T> responseType` | `@Nullable T` |
| `ontology().schemas().health(...)` | `GET` | `/ontology/schemas/health` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().schemas().getInfo(...)` | `GET` | `/ontology/schemas/info` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().schemas().getInfo(...)` | `GET` | `/ontology/schemas/info` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().schemas().getInfo(...)` | `GET` | `/ontology/schemas/info` | `Class<T> responseType` | `@Nullable T` |
| `ontology().schemas().getInfo(...)` | `GET` | `/ontology/schemas/info` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().transformations().health(...)` | `GET` | `/ontology/transformations/health` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().transformations().health(...)` | `GET` | `/ontology/transformations/health` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().transformations().health(...)` | `GET` | `/ontology/transformations/health` | `Class<T> responseType` | `@Nullable T` |
| `ontology().transformations().health(...)` | `GET` | `/ontology/transformations/health` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().transformations().getInfo(...)` | `GET` | `/ontology/transformations/info` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().transformations().getInfo(...)` | `GET` | `/ontology/transformations/info` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().transformations().getInfo(...)` | `GET` | `/ontology/transformations/info` | `Class<T> responseType` | `@Nullable T` |
| `ontology().transformations().getInfo(...)` | `GET` | `/ontology/transformations/info` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().validation().health(...)` | `GET` | `/ontology/validation/health` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().validation().health(...)` | `GET` | `/ontology/validation/health` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().validation().health(...)` | `GET` | `/ontology/validation/health` | `Class<T> responseType` | `@Nullable T` |
| `ontology().validation().health(...)` | `GET` | `/ontology/validation/health` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().validation().getInfo(...)` | `GET` | `/ontology/validation/info` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().validation().getInfo(...)` | `GET` | `/ontology/validation/info` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().validation().getInfo(...)` | `GET` | `/ontology/validation/info` | `Class<T> responseType` | `@Nullable T` |
| `ontology().validation().getInfo(...)` | `GET` | `/ontology/validation/info` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().versions().health(...)` | `GET` | `/ontology/versions/health` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().versions().health(...)` | `GET` | `/ontology/versions/health` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().versions().health(...)` | `GET` | `/ontology/versions/health` | `Class<T> responseType` | `@Nullable T` |
| `ontology().versions().health(...)` | `GET` | `/ontology/versions/health` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().versions().getInfo(...)` | `GET` | `/ontology/versions/info` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().versions().getInfo(...)` | `GET` | `/ontology/versions/info` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().versions().getInfo(...)` | `GET` | `/ontology/versions/info` | `Class<T> responseType` | `@Nullable T` |
| `ontology().versions().getInfo(...)` | `GET` | `/ontology/versions/info` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().engine().capabilities().list(...)` | `GET` | `/ontology/engine/capabilities` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().engine().capabilities().list(...)` | `GET` | `/ontology/engine/capabilities` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().engine().capabilities().list(...)` | `GET` | `/ontology/engine/capabilities` | `Class<T> responseType` | `@Nullable T` |
| `ontology().engine().capabilities().list(...)` | `GET` | `/ontology/engine/capabilities` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().engine().ontologies().export(...)` | `POST` | `/ontology/engine/ontologies/export` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().engine().ontologies().export(...)` | `POST` | `/ontology/engine/ontologies/export` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().engine().ontologies().export(...)` | `POST` | `/ontology/engine/ontologies/export` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().engine().ontologies().export(...)` | `POST` | `/ontology/engine/ontologies/export` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().engine().ontologies().createExportShacl(...)` | `POST` | `/ontology/engine/ontologies/export-shacl` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().engine().ontologies().createExportShacl(...)` | `POST` | `/ontology/engine/ontologies/export-shacl` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().engine().ontologies().createExportShacl(...)` | `POST` | `/ontology/engine/ontologies/export-shacl` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().engine().ontologies().createExportShacl(...)` | `POST` | `/ontology/engine/ontologies/export-shacl` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().engine().ontologies().generate(...)` | `POST` | `/ontology/engine/ontologies/generate` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().engine().ontologies().generate(...)` | `POST` | `/ontology/engine/ontologies/generate` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().engine().ontologies().generate(...)` | `POST` | `/ontology/engine/ontologies/generate` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().engine().ontologies().generate(...)` | `POST` | `/ontology/engine/ontologies/generate` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().engine().ontologies().validate(...)` | `POST` | `/ontology/engine/ontologies/validate` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().engine().ontologies().validate(...)` | `POST` | `/ontology/engine/ontologies/validate` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().engine().ontologies().validate(...)` | `POST` | `/ontology/engine/ontologies/validate` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().engine().ontologies().validate(...)` | `POST` | `/ontology/engine/ontologies/validate` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().engine().runs().list(...)` | `GET` | `/ontology/engine/runs` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().engine().runs().list(...)` | `GET` | `/ontology/engine/runs` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().engine().runs().list(...)` | `GET` | `/ontology/engine/runs` | `Class<T> responseType` | `@Nullable T` |
| `ontology().engine().runs().list(...)` | `GET` | `/ontology/engine/runs` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().engine().runs().get(...)` | `GET` | `/ontology/engine/runs/{param}` | `String runId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().engine().runs().get(...)` | `GET` | `/ontology/engine/runs/{param}` | `String runId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().engine().runs().get(...)` | `GET` | `/ontology/engine/runs/{param}` | `String runId, Class<T> responseType` | `@Nullable T` |
| `ontology().engine().runs().get(...)` | `GET` | `/ontology/engine/runs/{param}` | `String runId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().engine().runs().create(...)` | `POST` | `/ontology/engine/runs` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().engine().runs().create(...)` | `POST` | `/ontology/engine/runs` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().engine().runs().create(...)` | `POST` | `/ontology/engine/runs` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().engine().runs().create(...)` | `POST` | `/ontology/engine/runs` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().events().capabilities().list(...)` | `GET` | `/ontology/events/capabilities` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().events().capabilities().list(...)` | `GET` | `/ontology/events/capabilities` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().events().capabilities().list(...)` | `GET` | `/ontology/events/capabilities` | `Class<T> responseType` | `@Nullable T` |
| `ontology().events().capabilities().list(...)` | `GET` | `/ontology/events/capabilities` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().events().events().list(...)` | `GET` | `/ontology/events/events` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().events().events().list(...)` | `GET` | `/ontology/events/events` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().events().events().list(...)` | `GET` | `/ontology/events/events` | `Class<T> responseType` | `@Nullable T` |
| `ontology().events().events().list(...)` | `GET` | `/ontology/events/events` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().events().events().get(...)` | `GET` | `/ontology/events/events/{param}` | `String eventId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().events().events().get(...)` | `GET` | `/ontology/events/events/{param}` | `String eventId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().events().events().get(...)` | `GET` | `/ontology/events/events/{param}` | `String eventId, Class<T> responseType` | `@Nullable T` |
| `ontology().events().events().get(...)` | `GET` | `/ontology/events/events/{param}` | `String eventId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().events().events().create(...)` | `POST` | `/ontology/events/events` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().events().events().create(...)` | `POST` | `/ontology/events/events` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().events().events().create(...)` | `POST` | `/ontology/events/events` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().events().events().create(...)` | `POST` | `/ontology/events/events` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().events().runs().list(...)` | `GET` | `/ontology/events/runs` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().events().runs().list(...)` | `GET` | `/ontology/events/runs` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().events().runs().list(...)` | `GET` | `/ontology/events/runs` | `Class<T> responseType` | `@Nullable T` |
| `ontology().events().runs().list(...)` | `GET` | `/ontology/events/runs` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().events().runs().get(...)` | `GET` | `/ontology/events/runs/{param}` | `String runId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().events().runs().get(...)` | `GET` | `/ontology/events/runs/{param}` | `String runId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().events().runs().get(...)` | `GET` | `/ontology/events/runs/{param}` | `String runId, Class<T> responseType` | `@Nullable T` |
| `ontology().events().runs().get(...)` | `GET` | `/ontology/events/runs/{param}` | `String runId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().events().runs().create(...)` | `POST` | `/ontology/events/runs` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().events().runs().create(...)` | `POST` | `/ontology/events/runs` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().events().runs().create(...)` | `POST` | `/ontology/events/runs` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().events().runs().create(...)` | `POST` | `/ontology/events/runs` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().extract().capabilities().list(...)` | `GET` | `/ontology/extract/capabilities` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().extract().capabilities().list(...)` | `GET` | `/ontology/extract/capabilities` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().extract().capabilities().list(...)` | `GET` | `/ontology/extract/capabilities` | `Class<T> responseType` | `@Nullable T` |
| `ontology().extract().capabilities().list(...)` | `GET` | `/ontology/extract/capabilities` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().extract().extract().analyze(...)` | `POST` | `/ontology/extract/extract/analyze` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().extract().extract().analyze(...)` | `POST` | `/ontology/extract/extract/analyze` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().extract().extract().analyze(...)` | `POST` | `/ontology/extract/extract/analyze` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().extract().extract().analyze(...)` | `POST` | `/ontology/extract/extract/analyze` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().extract().extract().createArchitecture(...)` | `POST` | `/ontology/extract/extract/architecture` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().extract().extract().createArchitecture(...)` | `POST` | `/ontology/extract/extract/architecture` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().extract().extract().createArchitecture(...)` | `POST` | `/ontology/extract/extract/architecture` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().extract().extract().createArchitecture(...)` | `POST` | `/ontology/extract/extract/architecture` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().extract().runs().list(...)` | `GET` | `/ontology/extract/runs` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().extract().runs().list(...)` | `GET` | `/ontology/extract/runs` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().extract().runs().list(...)` | `GET` | `/ontology/extract/runs` | `Class<T> responseType` | `@Nullable T` |
| `ontology().extract().runs().list(...)` | `GET` | `/ontology/extract/runs` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().extract().runs().get(...)` | `GET` | `/ontology/extract/runs/{param}` | `String runId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().extract().runs().get(...)` | `GET` | `/ontology/extract/runs/{param}` | `String runId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().extract().runs().get(...)` | `GET` | `/ontology/extract/runs/{param}` | `String runId, Class<T> responseType` | `@Nullable T` |
| `ontology().extract().runs().get(...)` | `GET` | `/ontology/extract/runs/{param}` | `String runId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().extract().runs().create(...)` | `POST` | `/ontology/extract/runs` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().extract().runs().create(...)` | `POST` | `/ontology/extract/runs` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().extract().runs().create(...)` | `POST` | `/ontology/extract/runs` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().extract().runs().create(...)` | `POST` | `/ontology/extract/runs` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().graph().capabilities().list(...)` | `GET` | `/ontology/graph/capabilities` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().graph().capabilities().list(...)` | `GET` | `/ontology/graph/capabilities` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().graph().capabilities().list(...)` | `GET` | `/ontology/graph/capabilities` | `Class<T> responseType` | `@Nullable T` |
| `ontology().graph().capabilities().list(...)` | `GET` | `/ontology/graph/capabilities` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().graph().entities().get(...)` | `GET` | `/ontology/graph/entities/{param}` | `String entityId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().graph().entities().get(...)` | `GET` | `/ontology/graph/entities/{param}` | `String entityId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().graph().entities().get(...)` | `GET` | `/ontology/graph/entities/{param}` | `String entityId, Class<T> responseType` | `@Nullable T` |
| `ontology().graph().entities().get(...)` | `GET` | `/ontology/graph/entities/{param}` | `String entityId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().graph().entities().getProvenance(...)` | `GET` | `/ontology/graph/entities/{param}/provenance` | `String entityId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().graph().entities().getProvenance(...)` | `GET` | `/ontology/graph/entities/{param}/provenance` | `String entityId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().graph().entities().getProvenance(...)` | `GET` | `/ontology/graph/entities/{param}/provenance` | `String entityId, Class<T> responseType` | `@Nullable T` |
| `ontology().graph().entities().getProvenance(...)` | `GET` | `/ontology/graph/entities/{param}/provenance` | `String entityId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().graph().entities().update(...)` | `PUT` | `/ontology/graph/entities/{param}` | `String entityId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().graph().entities().update(...)` | `PUT` | `/ontology/graph/entities/{param}` | `String entityId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().graph().entities().update(...)` | `PUT` | `/ontology/graph/entities/{param}` | `String entityId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().graph().entities().update(...)` | `PUT` | `/ontology/graph/entities/{param}` | `String entityId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().graph().graph().analyze(...)` | `POST` | `/ontology/graph/graph/analyze` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().graph().graph().analyze(...)` | `POST` | `/ontology/graph/graph/analyze` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().graph().graph().analyze(...)` | `POST` | `/ontology/graph/graph/analyze` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().graph().graph().analyze(...)` | `POST` | `/ontology/graph/graph/analyze` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().graph().graph().createBuild(...)` | `POST` | `/ontology/graph/graph/build` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().graph().graph().createBuild(...)` | `POST` | `/ontology/graph/graph/build` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().graph().graph().createBuild(...)` | `POST` | `/ontology/graph/graph/build` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().graph().graph().createBuild(...)` | `POST` | `/ontology/graph/graph/build` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().graph().graph().createBulkRead(...)` | `POST` | `/ontology/graph/graph/bulk-read` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().graph().graph().createBulkRead(...)` | `POST` | `/ontology/graph/graph/bulk-read` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().graph().graph().createBulkRead(...)` | `POST` | `/ontology/graph/graph/bulk-read` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().graph().graph().createBulkRead(...)` | `POST` | `/ontology/graph/graph/bulk-read` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().graph().graph().createNeighborhood(...)` | `POST` | `/ontology/graph/graph/neighborhood` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().graph().graph().createNeighborhood(...)` | `POST` | `/ontology/graph/graph/neighborhood` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().graph().graph().createNeighborhood(...)` | `POST` | `/ontology/graph/graph/neighborhood` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().graph().graph().createNeighborhood(...)` | `POST` | `/ontology/graph/graph/neighborhood` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().graph().graph().createPath(...)` | `POST` | `/ontology/graph/graph/path` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().graph().graph().createPath(...)` | `POST` | `/ontology/graph/graph/path` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().graph().graph().createPath(...)` | `POST` | `/ontology/graph/graph/path` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().graph().graph().createPath(...)` | `POST` | `/ontology/graph/graph/path` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().graph().graph().query(...)` | `POST` | `/ontology/graph/graph/query` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().graph().graph().query(...)` | `POST` | `/ontology/graph/graph/query` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().graph().graph().query(...)` | `POST` | `/ontology/graph/graph/query` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().graph().graph().query(...)` | `POST` | `/ontology/graph/graph/query` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().graph().relationships().get(...)` | `GET` | `/ontology/graph/relationships/{param}` | `String relationshipId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().graph().relationships().get(...)` | `GET` | `/ontology/graph/relationships/{param}` | `String relationshipId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().graph().relationships().get(...)` | `GET` | `/ontology/graph/relationships/{param}` | `String relationshipId, Class<T> responseType` | `@Nullable T` |
| `ontology().graph().relationships().get(...)` | `GET` | `/ontology/graph/relationships/{param}` | `String relationshipId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().graph().relationships().update(...)` | `PUT` | `/ontology/graph/relationships/{param}` | `String relationshipId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().graph().relationships().update(...)` | `PUT` | `/ontology/graph/relationships/{param}` | `String relationshipId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().graph().relationships().update(...)` | `PUT` | `/ontology/graph/relationships/{param}` | `String relationshipId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().graph().relationships().update(...)` | `PUT` | `/ontology/graph/relationships/{param}` | `String relationshipId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().graph().runs().list(...)` | `GET` | `/ontology/graph/runs` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().graph().runs().list(...)` | `GET` | `/ontology/graph/runs` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().graph().runs().list(...)` | `GET` | `/ontology/graph/runs` | `Class<T> responseType` | `@Nullable T` |
| `ontology().graph().runs().list(...)` | `GET` | `/ontology/graph/runs` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().graph().runs().get(...)` | `GET` | `/ontology/graph/runs/{param}` | `String runId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().graph().runs().get(...)` | `GET` | `/ontology/graph/runs/{param}` | `String runId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().graph().runs().get(...)` | `GET` | `/ontology/graph/runs/{param}` | `String runId, Class<T> responseType` | `@Nullable T` |
| `ontology().graph().runs().get(...)` | `GET` | `/ontology/graph/runs/{param}` | `String runId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().graph().runs().create(...)` | `POST` | `/ontology/graph/runs` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().graph().runs().create(...)` | `POST` | `/ontology/graph/runs` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().graph().runs().create(...)` | `POST` | `/ontology/graph/runs` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().graph().runs().create(...)` | `POST` | `/ontology/graph/runs` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().objects().capabilities().list(...)` | `GET` | `/ontology/objects/capabilities` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().objects().capabilities().list(...)` | `GET` | `/ontology/objects/capabilities` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().objects().capabilities().list(...)` | `GET` | `/ontology/objects/capabilities` | `Class<T> responseType` | `@Nullable T` |
| `ontology().objects().capabilities().list(...)` | `GET` | `/ontology/objects/capabilities` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().objects().objectTypes().delete(...)` | `DELETE` | `/ontology/objects/object-types/{param}` | `String objectTypeId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().objects().objectTypes().delete(...)` | `DELETE` | `/ontology/objects/object-types/{param}` | `String objectTypeId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().objects().objectTypes().delete(...)` | `DELETE` | `/ontology/objects/object-types/{param}` | `String objectTypeId, Class<T> responseType` | `@Nullable T` |
| `ontology().objects().objectTypes().delete(...)` | `DELETE` | `/ontology/objects/object-types/{param}` | `String objectTypeId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().objects().objectTypes().list(...)` | `GET` | `/ontology/objects/object-types` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().objects().objectTypes().list(...)` | `GET` | `/ontology/objects/object-types` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().objects().objectTypes().list(...)` | `GET` | `/ontology/objects/object-types` | `Class<T> responseType` | `@Nullable T` |
| `ontology().objects().objectTypes().list(...)` | `GET` | `/ontology/objects/object-types` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().objects().objectTypes().get(...)` | `GET` | `/ontology/objects/object-types/{param}` | `String objectTypeId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().objects().objectTypes().get(...)` | `GET` | `/ontology/objects/object-types/{param}` | `String objectTypeId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().objects().objectTypes().get(...)` | `GET` | `/ontology/objects/object-types/{param}` | `String objectTypeId, Class<T> responseType` | `@Nullable T` |
| `ontology().objects().objectTypes().get(...)` | `GET` | `/ontology/objects/object-types/{param}` | `String objectTypeId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().objects().objectTypes().update(...)` | `PUT` | `/ontology/objects/object-types/{param}` | `String objectTypeId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().objects().objectTypes().update(...)` | `PUT` | `/ontology/objects/object-types/{param}` | `String objectTypeId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().objects().objectTypes().update(...)` | `PUT` | `/ontology/objects/object-types/{param}` | `String objectTypeId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().objects().objectTypes().update(...)` | `PUT` | `/ontology/objects/object-types/{param}` | `String objectTypeId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().objects().objects().delete(...)` | `DELETE` | `/ontology/objects/objects/{param}` | `String objectId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().objects().objects().delete(...)` | `DELETE` | `/ontology/objects/objects/{param}` | `String objectId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().objects().objects().delete(...)` | `DELETE` | `/ontology/objects/objects/{param}` | `String objectId, Class<T> responseType` | `@Nullable T` |
| `ontology().objects().objects().delete(...)` | `DELETE` | `/ontology/objects/objects/{param}` | `String objectId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().objects().objects().list(...)` | `GET` | `/ontology/objects/objects` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().objects().objects().list(...)` | `GET` | `/ontology/objects/objects` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().objects().objects().list(...)` | `GET` | `/ontology/objects/objects` | `Class<T> responseType` | `@Nullable T` |
| `ontology().objects().objects().list(...)` | `GET` | `/ontology/objects/objects` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().objects().objects().get(...)` | `GET` | `/ontology/objects/objects/{param}` | `String objectId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().objects().objects().get(...)` | `GET` | `/ontology/objects/objects/{param}` | `String objectId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().objects().objects().get(...)` | `GET` | `/ontology/objects/objects/{param}` | `String objectId, Class<T> responseType` | `@Nullable T` |
| `ontology().objects().objects().get(...)` | `GET` | `/ontology/objects/objects/{param}` | `String objectId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().objects().objects().update(...)` | `PUT` | `/ontology/objects/objects/{param}` | `String objectId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().objects().objects().update(...)` | `PUT` | `/ontology/objects/objects/{param}` | `String objectId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().objects().objects().update(...)` | `PUT` | `/ontology/objects/objects/{param}` | `String objectId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().objects().objects().update(...)` | `PUT` | `/ontology/objects/objects/{param}` | `String objectId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().objects().runs().list(...)` | `GET` | `/ontology/objects/runs` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().objects().runs().list(...)` | `GET` | `/ontology/objects/runs` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().objects().runs().list(...)` | `GET` | `/ontology/objects/runs` | `Class<T> responseType` | `@Nullable T` |
| `ontology().objects().runs().list(...)` | `GET` | `/ontology/objects/runs` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().objects().runs().get(...)` | `GET` | `/ontology/objects/runs/{param}` | `String runId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().objects().runs().get(...)` | `GET` | `/ontology/objects/runs/{param}` | `String runId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().objects().runs().get(...)` | `GET` | `/ontology/objects/runs/{param}` | `String runId, Class<T> responseType` | `@Nullable T` |
| `ontology().objects().runs().get(...)` | `GET` | `/ontology/objects/runs/{param}` | `String runId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().objects().runs().create(...)` | `POST` | `/ontology/objects/runs` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().objects().runs().create(...)` | `POST` | `/ontology/objects/runs` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().objects().runs().create(...)` | `POST` | `/ontology/objects/runs` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().objects().runs().create(...)` | `POST` | `/ontology/objects/runs` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().reasoning().capabilities().list(...)` | `GET` | `/ontology/reasoning/capabilities` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().reasoning().capabilities().list(...)` | `GET` | `/ontology/reasoning/capabilities` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().reasoning().capabilities().list(...)` | `GET` | `/ontology/reasoning/capabilities` | `Class<T> responseType` | `@Nullable T` |
| `ontology().reasoning().capabilities().list(...)` | `GET` | `/ontology/reasoning/capabilities` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().reasoning().facts().create(...)` | `POST` | `/ontology/reasoning/facts` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().reasoning().facts().create(...)` | `POST` | `/ontology/reasoning/facts` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().reasoning().facts().create(...)` | `POST` | `/ontology/reasoning/facts` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().reasoning().facts().create(...)` | `POST` | `/ontology/reasoning/facts` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().reasoning().facts().createLoadGraph(...)` | `POST` | `/ontology/reasoning/facts/load-graph` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().reasoning().facts().createLoadGraph(...)` | `POST` | `/ontology/reasoning/facts/load-graph` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().reasoning().facts().createLoadGraph(...)` | `POST` | `/ontology/reasoning/facts/load-graph` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().reasoning().facts().createLoadGraph(...)` | `POST` | `/ontology/reasoning/facts/load-graph` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().reasoning().reason().createBackward(...)` | `POST` | `/ontology/reasoning/reason/backward` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().reasoning().reason().createBackward(...)` | `POST` | `/ontology/reasoning/reason/backward` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().reasoning().reason().createBackward(...)` | `POST` | `/ontology/reasoning/reason/backward` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().reasoning().reason().createBackward(...)` | `POST` | `/ontology/reasoning/reason/backward` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().reasoning().reason().createForward(...)` | `POST` | `/ontology/reasoning/reason/forward` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().reasoning().reason().createForward(...)` | `POST` | `/ontology/reasoning/reason/forward` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().reasoning().reason().createForward(...)` | `POST` | `/ontology/reasoning/reason/forward` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().reasoning().reason().createForward(...)` | `POST` | `/ontology/reasoning/reason/forward` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().reasoning().rules().delete(...)` | `DELETE` | `/ontology/reasoning/rules/{param}` | `String ruleId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().reasoning().rules().delete(...)` | `DELETE` | `/ontology/reasoning/rules/{param}` | `String ruleId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().reasoning().rules().delete(...)` | `DELETE` | `/ontology/reasoning/rules/{param}` | `String ruleId, Class<T> responseType` | `@Nullable T` |
| `ontology().reasoning().rules().delete(...)` | `DELETE` | `/ontology/reasoning/rules/{param}` | `String ruleId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().reasoning().rules().list(...)` | `GET` | `/ontology/reasoning/rules` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().reasoning().rules().list(...)` | `GET` | `/ontology/reasoning/rules` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().reasoning().rules().list(...)` | `GET` | `/ontology/reasoning/rules` | `Class<T> responseType` | `@Nullable T` |
| `ontology().reasoning().rules().list(...)` | `GET` | `/ontology/reasoning/rules` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().reasoning().rules().create(...)` | `POST` | `/ontology/reasoning/rules` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().reasoning().rules().create(...)` | `POST` | `/ontology/reasoning/rules` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().reasoning().rules().create(...)` | `POST` | `/ontology/reasoning/rules` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().reasoning().rules().create(...)` | `POST` | `/ontology/reasoning/rules` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().reasoning().rules().update(...)` | `PUT` | `/ontology/reasoning/rules/{param}` | `String ruleId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().reasoning().rules().update(...)` | `PUT` | `/ontology/reasoning/rules/{param}` | `String ruleId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().reasoning().rules().update(...)` | `PUT` | `/ontology/reasoning/rules/{param}` | `String ruleId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().reasoning().rules().update(...)` | `PUT` | `/ontology/reasoning/rules/{param}` | `String ruleId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().reasoning().runs().list(...)` | `GET` | `/ontology/reasoning/runs` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().reasoning().runs().list(...)` | `GET` | `/ontology/reasoning/runs` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().reasoning().runs().list(...)` | `GET` | `/ontology/reasoning/runs` | `Class<T> responseType` | `@Nullable T` |
| `ontology().reasoning().runs().list(...)` | `GET` | `/ontology/reasoning/runs` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().reasoning().runs().get(...)` | `GET` | `/ontology/reasoning/runs/{param}` | `String runId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().reasoning().runs().get(...)` | `GET` | `/ontology/reasoning/runs/{param}` | `String runId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().reasoning().runs().get(...)` | `GET` | `/ontology/reasoning/runs/{param}` | `String runId, Class<T> responseType` | `@Nullable T` |
| `ontology().reasoning().runs().get(...)` | `GET` | `/ontology/reasoning/runs/{param}` | `String runId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().reasoning().runs().create(...)` | `POST` | `/ontology/reasoning/runs` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().reasoning().runs().create(...)` | `POST` | `/ontology/reasoning/runs` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().reasoning().runs().create(...)` | `POST` | `/ontology/reasoning/runs` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().reasoning().runs().create(...)` | `POST` | `/ontology/reasoning/runs` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().relationships().capabilities().list(...)` | `GET` | `/ontology/relationships/capabilities` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().relationships().capabilities().list(...)` | `GET` | `/ontology/relationships/capabilities` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().relationships().capabilities().list(...)` | `GET` | `/ontology/relationships/capabilities` | `Class<T> responseType` | `@Nullable T` |
| `ontology().relationships().capabilities().list(...)` | `GET` | `/ontology/relationships/capabilities` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().relationships().relationshipTypes().delete(...)` | `DELETE` | `/ontology/relationships/relationship-types/{param}` | `String relationshipTypeId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().relationships().relationshipTypes().delete(...)` | `DELETE` | `/ontology/relationships/relationship-types/{param}` | `String relationshipTypeId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().relationships().relationshipTypes().delete(...)` | `DELETE` | `/ontology/relationships/relationship-types/{param}` | `String relationshipTypeId, Class<T> responseType` | `@Nullable T` |
| `ontology().relationships().relationshipTypes().delete(...)` | `DELETE` | `/ontology/relationships/relationship-types/{param}` | `String relationshipTypeId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().relationships().relationshipTypes().list(...)` | `GET` | `/ontology/relationships/relationship-types` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().relationships().relationshipTypes().list(...)` | `GET` | `/ontology/relationships/relationship-types` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().relationships().relationshipTypes().list(...)` | `GET` | `/ontology/relationships/relationship-types` | `Class<T> responseType` | `@Nullable T` |
| `ontology().relationships().relationshipTypes().list(...)` | `GET` | `/ontology/relationships/relationship-types` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().relationships().relationships().delete(...)` | `DELETE` | `/ontology/relationships/relationships/{param}` | `String relationshipId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().relationships().relationships().delete(...)` | `DELETE` | `/ontology/relationships/relationships/{param}` | `String relationshipId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().relationships().relationships().delete(...)` | `DELETE` | `/ontology/relationships/relationships/{param}` | `String relationshipId, Class<T> responseType` | `@Nullable T` |
| `ontology().relationships().relationships().delete(...)` | `DELETE` | `/ontology/relationships/relationships/{param}` | `String relationshipId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().relationships().relationships().list(...)` | `GET` | `/ontology/relationships/relationships` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().relationships().relationships().list(...)` | `GET` | `/ontology/relationships/relationships` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().relationships().relationships().list(...)` | `GET` | `/ontology/relationships/relationships` | `Class<T> responseType` | `@Nullable T` |
| `ontology().relationships().relationships().list(...)` | `GET` | `/ontology/relationships/relationships` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().relationships().relationships().get(...)` | `GET` | `/ontology/relationships/relationships/{param}` | `String relationshipId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().relationships().relationships().get(...)` | `GET` | `/ontology/relationships/relationships/{param}` | `String relationshipId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().relationships().relationships().get(...)` | `GET` | `/ontology/relationships/relationships/{param}` | `String relationshipId, Class<T> responseType` | `@Nullable T` |
| `ontology().relationships().relationships().get(...)` | `GET` | `/ontology/relationships/relationships/{param}` | `String relationshipId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().relationships().relationships().update(...)` | `PUT` | `/ontology/relationships/relationships/{param}` | `String relationshipId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().relationships().relationships().update(...)` | `PUT` | `/ontology/relationships/relationships/{param}` | `String relationshipId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().relationships().relationships().update(...)` | `PUT` | `/ontology/relationships/relationships/{param}` | `String relationshipId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().relationships().relationships().update(...)` | `PUT` | `/ontology/relationships/relationships/{param}` | `String relationshipId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().relationships().runs().list(...)` | `GET` | `/ontology/relationships/runs` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().relationships().runs().list(...)` | `GET` | `/ontology/relationships/runs` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().relationships().runs().list(...)` | `GET` | `/ontology/relationships/runs` | `Class<T> responseType` | `@Nullable T` |
| `ontology().relationships().runs().list(...)` | `GET` | `/ontology/relationships/runs` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().relationships().runs().get(...)` | `GET` | `/ontology/relationships/runs/{param}` | `String runId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().relationships().runs().get(...)` | `GET` | `/ontology/relationships/runs/{param}` | `String runId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().relationships().runs().get(...)` | `GET` | `/ontology/relationships/runs/{param}` | `String runId, Class<T> responseType` | `@Nullable T` |
| `ontology().relationships().runs().get(...)` | `GET` | `/ontology/relationships/runs/{param}` | `String runId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().relationships().runs().create(...)` | `POST` | `/ontology/relationships/runs` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().relationships().runs().create(...)` | `POST` | `/ontology/relationships/runs` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().relationships().runs().create(...)` | `POST` | `/ontology/relationships/runs` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().relationships().runs().create(...)` | `POST` | `/ontology/relationships/runs` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollouts().capabilities().list(...)` | `GET` | `/ontology/rollouts/capabilities` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().rollouts().capabilities().list(...)` | `GET` | `/ontology/rollouts/capabilities` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollouts().capabilities().list(...)` | `GET` | `/ontology/rollouts/capabilities` | `Class<T> responseType` | `@Nullable T` |
| `ontology().rollouts().capabilities().list(...)` | `GET` | `/ontology/rollouts/capabilities` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().delete(...)` | `DELETE` | `/ontology/rollouts/rollouts/{param}` | `String rolloutId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().delete(...)` | `DELETE` | `/ontology/rollouts/rollouts/{param}` | `String rolloutId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().delete(...)` | `DELETE` | `/ontology/rollouts/rollouts/{param}` | `String rolloutId, Class<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().delete(...)` | `DELETE` | `/ontology/rollouts/rollouts/{param}` | `String rolloutId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().list(...)` | `GET` | `/ontology/rollouts/rollouts` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().list(...)` | `GET` | `/ontology/rollouts/rollouts` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().list(...)` | `GET` | `/ontology/rollouts/rollouts` | `Class<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().list(...)` | `GET` | `/ontology/rollouts/rollouts` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().get(...)` | `GET` | `/ontology/rollouts/rollouts/{param}` | `String rolloutId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().get(...)` | `GET` | `/ontology/rollouts/rollouts/{param}` | `String rolloutId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().get(...)` | `GET` | `/ontology/rollouts/rollouts/{param}` | `String rolloutId, Class<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().get(...)` | `GET` | `/ontology/rollouts/rollouts/{param}` | `String rolloutId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().status(...)` | `GET` | `/ontology/rollouts/rollouts/{param}/status` | `String rolloutId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().status(...)` | `GET` | `/ontology/rollouts/rollouts/{param}/status` | `String rolloutId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().status(...)` | `GET` | `/ontology/rollouts/rollouts/{param}/status` | `String rolloutId, Class<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().status(...)` | `GET` | `/ontology/rollouts/rollouts/{param}/status` | `String rolloutId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().create(...)` | `POST` | `/ontology/rollouts/rollouts` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().create(...)` | `POST` | `/ontology/rollouts/rollouts` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().create(...)` | `POST` | `/ontology/rollouts/rollouts` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().create(...)` | `POST` | `/ontology/rollouts/rollouts` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().pause(...)` | `POST` | `/ontology/rollouts/rollouts/{param}/pause` | `String rolloutId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().pause(...)` | `POST` | `/ontology/rollouts/rollouts/{param}/pause` | `String rolloutId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().pause(...)` | `POST` | `/ontology/rollouts/rollouts/{param}/pause` | `String rolloutId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().pause(...)` | `POST` | `/ontology/rollouts/rollouts/{param}/pause` | `String rolloutId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().resume(...)` | `POST` | `/ontology/rollouts/rollouts/{param}/resume` | `String rolloutId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().resume(...)` | `POST` | `/ontology/rollouts/rollouts/{param}/resume` | `String rolloutId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().resume(...)` | `POST` | `/ontology/rollouts/rollouts/{param}/resume` | `String rolloutId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().resume(...)` | `POST` | `/ontology/rollouts/rollouts/{param}/resume` | `String rolloutId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().rollback(...)` | `POST` | `/ontology/rollouts/rollouts/{param}/rollback` | `String rolloutId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().rollback(...)` | `POST` | `/ontology/rollouts/rollouts/{param}/rollback` | `String rolloutId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().rollback(...)` | `POST` | `/ontology/rollouts/rollouts/{param}/rollback` | `String rolloutId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().rollback(...)` | `POST` | `/ontology/rollouts/rollouts/{param}/rollback` | `String rolloutId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().createStart(...)` | `POST` | `/ontology/rollouts/rollouts/{param}/start` | `String rolloutId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().createStart(...)` | `POST` | `/ontology/rollouts/rollouts/{param}/start` | `String rolloutId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().createStart(...)` | `POST` | `/ontology/rollouts/rollouts/{param}/start` | `String rolloutId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().createStart(...)` | `POST` | `/ontology/rollouts/rollouts/{param}/start` | `String rolloutId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().update(...)` | `PUT` | `/ontology/rollouts/rollouts/{param}` | `String rolloutId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().update(...)` | `PUT` | `/ontology/rollouts/rollouts/{param}` | `String rolloutId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().update(...)` | `PUT` | `/ontology/rollouts/rollouts/{param}` | `String rolloutId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().rollouts().rollouts().update(...)` | `PUT` | `/ontology/rollouts/rollouts/{param}` | `String rolloutId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollouts().runs().list(...)` | `GET` | `/ontology/rollouts/runs` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().rollouts().runs().list(...)` | `GET` | `/ontology/rollouts/runs` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollouts().runs().list(...)` | `GET` | `/ontology/rollouts/runs` | `Class<T> responseType` | `@Nullable T` |
| `ontology().rollouts().runs().list(...)` | `GET` | `/ontology/rollouts/runs` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollouts().runs().get(...)` | `GET` | `/ontology/rollouts/runs/{param}` | `String runId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().rollouts().runs().get(...)` | `GET` | `/ontology/rollouts/runs/{param}` | `String runId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollouts().runs().get(...)` | `GET` | `/ontology/rollouts/runs/{param}` | `String runId, Class<T> responseType` | `@Nullable T` |
| `ontology().rollouts().runs().get(...)` | `GET` | `/ontology/rollouts/runs/{param}` | `String runId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollouts().runs().create(...)` | `POST` | `/ontology/rollouts/runs` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().rollouts().runs().create(...)` | `POST` | `/ontology/rollouts/runs` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollouts().runs().create(...)` | `POST` | `/ontology/rollouts/runs` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().rollouts().runs().create(...)` | `POST` | `/ontology/rollouts/runs` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollups().capabilities().list(...)` | `GET` | `/ontology/rollups/capabilities` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().rollups().capabilities().list(...)` | `GET` | `/ontology/rollups/capabilities` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollups().capabilities().list(...)` | `GET` | `/ontology/rollups/capabilities` | `Class<T> responseType` | `@Nullable T` |
| `ontology().rollups().capabilities().list(...)` | `GET` | `/ontology/rollups/capabilities` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollupResults().get(...)` | `GET` | `/ontology/rollups/rollup-results/{param}` | `String executionId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollupResults().get(...)` | `GET` | `/ontology/rollups/rollup-results/{param}` | `String executionId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollupResults().get(...)` | `GET` | `/ontology/rollups/rollup-results/{param}` | `String executionId, Class<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollupResults().get(...)` | `GET` | `/ontology/rollups/rollup-results/{param}` | `String executionId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollups().delete(...)` | `DELETE` | `/ontology/rollups/rollups/{param}` | `String rollupId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollups().delete(...)` | `DELETE` | `/ontology/rollups/rollups/{param}` | `String rollupId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollups().delete(...)` | `DELETE` | `/ontology/rollups/rollups/{param}` | `String rollupId, Class<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollups().delete(...)` | `DELETE` | `/ontology/rollups/rollups/{param}` | `String rollupId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollups().list(...)` | `GET` | `/ontology/rollups/rollups` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollups().list(...)` | `GET` | `/ontology/rollups/rollups` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollups().list(...)` | `GET` | `/ontology/rollups/rollups` | `Class<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollups().list(...)` | `GET` | `/ontology/rollups/rollups` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollups().get(...)` | `GET` | `/ontology/rollups/rollups/{param}` | `String rollupId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollups().get(...)` | `GET` | `/ontology/rollups/rollups/{param}` | `String rollupId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollups().get(...)` | `GET` | `/ontology/rollups/rollups/{param}` | `String rollupId, Class<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollups().get(...)` | `GET` | `/ontology/rollups/rollups/{param}` | `String rollupId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollups().getResult(...)` | `GET` | `/ontology/rollups/rollups/{param}/result` | `String rollupId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollups().getResult(...)` | `GET` | `/ontology/rollups/rollups/{param}/result` | `String rollupId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollups().getResult(...)` | `GET` | `/ontology/rollups/rollups/{param}/result` | `String rollupId, Class<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollups().getResult(...)` | `GET` | `/ontology/rollups/rollups/{param}/result` | `String rollupId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollups().create(...)` | `POST` | `/ontology/rollups/rollups` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollups().create(...)` | `POST` | `/ontology/rollups/rollups` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollups().create(...)` | `POST` | `/ontology/rollups/rollups` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollups().create(...)` | `POST` | `/ontology/rollups/rollups` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollups().execute(...)` | `POST` | `/ontology/rollups/rollups/{param}/execute` | `String rollupId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollups().execute(...)` | `POST` | `/ontology/rollups/rollups/{param}/execute` | `String rollupId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollups().execute(...)` | `POST` | `/ontology/rollups/rollups/{param}/execute` | `String rollupId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollups().execute(...)` | `POST` | `/ontology/rollups/rollups/{param}/execute` | `String rollupId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollups().preview(...)` | `POST` | `/ontology/rollups/rollups/{param}/preview` | `String rollupId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollups().preview(...)` | `POST` | `/ontology/rollups/rollups/{param}/preview` | `String rollupId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollups().preview(...)` | `POST` | `/ontology/rollups/rollups/{param}/preview` | `String rollupId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollups().preview(...)` | `POST` | `/ontology/rollups/rollups/{param}/preview` | `String rollupId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollups().update(...)` | `PUT` | `/ontology/rollups/rollups/{param}` | `String rollupId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollups().update(...)` | `PUT` | `/ontology/rollups/rollups/{param}` | `String rollupId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollups().update(...)` | `PUT` | `/ontology/rollups/rollups/{param}` | `String rollupId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().rollups().rollups().update(...)` | `PUT` | `/ontology/rollups/rollups/{param}` | `String rollupId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollups().runs().list(...)` | `GET` | `/ontology/rollups/runs` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().rollups().runs().list(...)` | `GET` | `/ontology/rollups/runs` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollups().runs().list(...)` | `GET` | `/ontology/rollups/runs` | `Class<T> responseType` | `@Nullable T` |
| `ontology().rollups().runs().list(...)` | `GET` | `/ontology/rollups/runs` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollups().runs().get(...)` | `GET` | `/ontology/rollups/runs/{param}` | `String runId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().rollups().runs().get(...)` | `GET` | `/ontology/rollups/runs/{param}` | `String runId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollups().runs().get(...)` | `GET` | `/ontology/rollups/runs/{param}` | `String runId, Class<T> responseType` | `@Nullable T` |
| `ontology().rollups().runs().get(...)` | `GET` | `/ontology/rollups/runs/{param}` | `String runId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollups().runs().create(...)` | `POST` | `/ontology/rollups/runs` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().rollups().runs().create(...)` | `POST` | `/ontology/rollups/runs` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().rollups().runs().create(...)` | `POST` | `/ontology/rollups/runs` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().rollups().runs().create(...)` | `POST` | `/ontology/rollups/runs` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().schemas().capabilities().list(...)` | `GET` | `/ontology/schemas/capabilities` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().schemas().capabilities().list(...)` | `GET` | `/ontology/schemas/capabilities` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().schemas().capabilities().list(...)` | `GET` | `/ontology/schemas/capabilities` | `Class<T> responseType` | `@Nullable T` |
| `ontology().schemas().capabilities().list(...)` | `GET` | `/ontology/schemas/capabilities` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().schemas().runs().list(...)` | `GET` | `/ontology/schemas/runs` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().schemas().runs().list(...)` | `GET` | `/ontology/schemas/runs` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().schemas().runs().list(...)` | `GET` | `/ontology/schemas/runs` | `Class<T> responseType` | `@Nullable T` |
| `ontology().schemas().runs().list(...)` | `GET` | `/ontology/schemas/runs` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().schemas().runs().get(...)` | `GET` | `/ontology/schemas/runs/{param}` | `String runId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().schemas().runs().get(...)` | `GET` | `/ontology/schemas/runs/{param}` | `String runId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().schemas().runs().get(...)` | `GET` | `/ontology/schemas/runs/{param}` | `String runId, Class<T> responseType` | `@Nullable T` |
| `ontology().schemas().runs().get(...)` | `GET` | `/ontology/schemas/runs/{param}` | `String runId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().schemas().runs().create(...)` | `POST` | `/ontology/schemas/runs` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().schemas().runs().create(...)` | `POST` | `/ontology/schemas/runs` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().schemas().runs().create(...)` | `POST` | `/ontology/schemas/runs` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().schemas().runs().create(...)` | `POST` | `/ontology/schemas/runs` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().schemas().schemas().delete(...)` | `DELETE` | `/ontology/schemas/schemas/{param}` | `String schemaId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().schemas().schemas().delete(...)` | `DELETE` | `/ontology/schemas/schemas/{param}` | `String schemaId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().schemas().schemas().delete(...)` | `DELETE` | `/ontology/schemas/schemas/{param}` | `String schemaId, Class<T> responseType` | `@Nullable T` |
| `ontology().schemas().schemas().delete(...)` | `DELETE` | `/ontology/schemas/schemas/{param}` | `String schemaId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().schemas().schemas().list(...)` | `GET` | `/ontology/schemas/schemas` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().schemas().schemas().list(...)` | `GET` | `/ontology/schemas/schemas` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().schemas().schemas().list(...)` | `GET` | `/ontology/schemas/schemas` | `Class<T> responseType` | `@Nullable T` |
| `ontology().schemas().schemas().list(...)` | `GET` | `/ontology/schemas/schemas` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().schemas().schemas().get(...)` | `GET` | `/ontology/schemas/schemas/{param}` | `String schemaId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().schemas().schemas().get(...)` | `GET` | `/ontology/schemas/schemas/{param}` | `String schemaId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().schemas().schemas().get(...)` | `GET` | `/ontology/schemas/schemas/{param}` | `String schemaId, Class<T> responseType` | `@Nullable T` |
| `ontology().schemas().schemas().get(...)` | `GET` | `/ontology/schemas/schemas/{param}` | `String schemaId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().schemas().schemas().create(...)` | `POST` | `/ontology/schemas/schemas` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().schemas().schemas().create(...)` | `POST` | `/ontology/schemas/schemas` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().schemas().schemas().create(...)` | `POST` | `/ontology/schemas/schemas` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().schemas().schemas().create(...)` | `POST` | `/ontology/schemas/schemas` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().schemas().schemas().validate(...)` | `POST` | `/ontology/schemas/schemas/validate` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().schemas().schemas().validate(...)` | `POST` | `/ontology/schemas/schemas/validate` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().schemas().schemas().validate(...)` | `POST` | `/ontology/schemas/schemas/validate` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().schemas().schemas().validate(...)` | `POST` | `/ontology/schemas/schemas/validate` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().transformations().capabilities().list(...)` | `GET` | `/ontology/transformations/capabilities` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().transformations().capabilities().list(...)` | `GET` | `/ontology/transformations/capabilities` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().transformations().capabilities().list(...)` | `GET` | `/ontology/transformations/capabilities` | `Class<T> responseType` | `@Nullable T` |
| `ontology().transformations().capabilities().list(...)` | `GET` | `/ontology/transformations/capabilities` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().transformations().runs().list(...)` | `GET` | `/ontology/transformations/runs` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().transformations().runs().list(...)` | `GET` | `/ontology/transformations/runs` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().transformations().runs().list(...)` | `GET` | `/ontology/transformations/runs` | `Class<T> responseType` | `@Nullable T` |
| `ontology().transformations().runs().list(...)` | `GET` | `/ontology/transformations/runs` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().transformations().runs().get(...)` | `GET` | `/ontology/transformations/runs/{param}` | `String runId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().transformations().runs().get(...)` | `GET` | `/ontology/transformations/runs/{param}` | `String runId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().transformations().runs().get(...)` | `GET` | `/ontology/transformations/runs/{param}` | `String runId, Class<T> responseType` | `@Nullable T` |
| `ontology().transformations().runs().get(...)` | `GET` | `/ontology/transformations/runs/{param}` | `String runId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().transformations().runs().create(...)` | `POST` | `/ontology/transformations/runs` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().transformations().runs().create(...)` | `POST` | `/ontology/transformations/runs` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().transformations().runs().create(...)` | `POST` | `/ontology/transformations/runs` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().transformations().runs().create(...)` | `POST` | `/ontology/transformations/runs` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().transformations().transformations().create(...)` | `POST` | `/ontology/transformations/transformations` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().transformations().transformations().create(...)` | `POST` | `/ontology/transformations/transformations` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().transformations().transformations().create(...)` | `POST` | `/ontology/transformations/transformations` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().transformations().transformations().create(...)` | `POST` | `/ontology/transformations/transformations` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().validation().capabilities().list(...)` | `GET` | `/ontology/validation/capabilities` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().validation().capabilities().list(...)` | `GET` | `/ontology/validation/capabilities` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().validation().capabilities().list(...)` | `GET` | `/ontology/validation/capabilities` | `Class<T> responseType` | `@Nullable T` |
| `ontology().validation().capabilities().list(...)` | `GET` | `/ontology/validation/capabilities` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().validation().payloads().validate(...)` | `POST` | `/ontology/validation/payloads/validate` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().validation().payloads().validate(...)` | `POST` | `/ontology/validation/payloads/validate` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().validation().payloads().validate(...)` | `POST` | `/ontology/validation/payloads/validate` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().validation().payloads().validate(...)` | `POST` | `/ontology/validation/payloads/validate` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().validation().rules().delete(...)` | `DELETE` | `/ontology/validation/rules/{param}` | `String ruleId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().validation().rules().delete(...)` | `DELETE` | `/ontology/validation/rules/{param}` | `String ruleId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().validation().rules().delete(...)` | `DELETE` | `/ontology/validation/rules/{param}` | `String ruleId, Class<T> responseType` | `@Nullable T` |
| `ontology().validation().rules().delete(...)` | `DELETE` | `/ontology/validation/rules/{param}` | `String ruleId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().validation().rules().list(...)` | `GET` | `/ontology/validation/rules` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().validation().rules().list(...)` | `GET` | `/ontology/validation/rules` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().validation().rules().list(...)` | `GET` | `/ontology/validation/rules` | `Class<T> responseType` | `@Nullable T` |
| `ontology().validation().rules().list(...)` | `GET` | `/ontology/validation/rules` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().validation().rules().get(...)` | `GET` | `/ontology/validation/rules/{param}` | `String ruleId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().validation().rules().get(...)` | `GET` | `/ontology/validation/rules/{param}` | `String ruleId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().validation().rules().get(...)` | `GET` | `/ontology/validation/rules/{param}` | `String ruleId, Class<T> responseType` | `@Nullable T` |
| `ontology().validation().rules().get(...)` | `GET` | `/ontology/validation/rules/{param}` | `String ruleId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().validation().rules().create(...)` | `POST` | `/ontology/validation/rules` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().validation().rules().create(...)` | `POST` | `/ontology/validation/rules` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().validation().rules().create(...)` | `POST` | `/ontology/validation/rules` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().validation().rules().create(...)` | `POST` | `/ontology/validation/rules` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().validation().runs().list(...)` | `GET` | `/ontology/validation/runs` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().validation().runs().list(...)` | `GET` | `/ontology/validation/runs` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().validation().runs().list(...)` | `GET` | `/ontology/validation/runs` | `Class<T> responseType` | `@Nullable T` |
| `ontology().validation().runs().list(...)` | `GET` | `/ontology/validation/runs` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().validation().runs().get(...)` | `GET` | `/ontology/validation/runs/{param}` | `String runId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().validation().runs().get(...)` | `GET` | `/ontology/validation/runs/{param}` | `String runId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().validation().runs().get(...)` | `GET` | `/ontology/validation/runs/{param}` | `String runId, Class<T> responseType` | `@Nullable T` |
| `ontology().validation().runs().get(...)` | `GET` | `/ontology/validation/runs/{param}` | `String runId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().validation().runs().create(...)` | `POST` | `/ontology/validation/runs` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().validation().runs().create(...)` | `POST` | `/ontology/validation/runs` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().validation().runs().create(...)` | `POST` | `/ontology/validation/runs` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().validation().runs().create(...)` | `POST` | `/ontology/validation/runs` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().versions().audit().verify(...)` | `POST` | `/ontology/versions/audit/verify` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().versions().audit().verify(...)` | `POST` | `/ontology/versions/audit/verify` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().versions().audit().verify(...)` | `POST` | `/ontology/versions/audit/verify` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().versions().audit().verify(...)` | `POST` | `/ontology/versions/audit/verify` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().versions().capabilities().list(...)` | `GET` | `/ontology/versions/capabilities` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().versions().capabilities().list(...)` | `GET` | `/ontology/versions/capabilities` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().versions().capabilities().list(...)` | `GET` | `/ontology/versions/capabilities` | `Class<T> responseType` | `@Nullable T` |
| `ontology().versions().capabilities().list(...)` | `GET` | `/ontology/versions/capabilities` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().versions().releaseBundles().list(...)` | `GET` | `/ontology/versions/release-bundles` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().versions().releaseBundles().list(...)` | `GET` | `/ontology/versions/release-bundles` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().versions().releaseBundles().list(...)` | `GET` | `/ontology/versions/release-bundles` | `Class<T> responseType` | `@Nullable T` |
| `ontology().versions().releaseBundles().list(...)` | `GET` | `/ontology/versions/release-bundles` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().versions().releaseBundles().get(...)` | `GET` | `/ontology/versions/release-bundles/{param}` | `String bundleId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().versions().releaseBundles().get(...)` | `GET` | `/ontology/versions/release-bundles/{param}` | `String bundleId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().versions().releaseBundles().get(...)` | `GET` | `/ontology/versions/release-bundles/{param}` | `String bundleId, Class<T> responseType` | `@Nullable T` |
| `ontology().versions().releaseBundles().get(...)` | `GET` | `/ontology/versions/release-bundles/{param}` | `String bundleId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().versions().releaseBundles().create(...)` | `POST` | `/ontology/versions/release-bundles` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().versions().releaseBundles().create(...)` | `POST` | `/ontology/versions/release-bundles` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().versions().releaseBundles().create(...)` | `POST` | `/ontology/versions/release-bundles` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().versions().releaseBundles().create(...)` | `POST` | `/ontology/versions/release-bundles` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().versions().runs().list(...)` | `GET` | `/ontology/versions/runs` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().versions().runs().list(...)` | `GET` | `/ontology/versions/runs` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().versions().runs().list(...)` | `GET` | `/ontology/versions/runs` | `Class<T> responseType` | `@Nullable T` |
| `ontology().versions().runs().list(...)` | `GET` | `/ontology/versions/runs` | `TypeReference<T> responseType` | `@Nullable T` |
| `ontology().versions().runs().get(...)` | `GET` | `/ontology/versions/runs/{param}` | `String runId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().versions().runs().get(...)` | `GET` | `/ontology/versions/runs/{param}` | `String runId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().versions().runs().get(...)` | `GET` | `/ontology/versions/runs/{param}` | `String runId, Class<T> responseType` | `@Nullable T` |
| `ontology().versions().runs().get(...)` | `GET` | `/ontology/versions/runs/{param}` | `String runId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().versions().runs().create(...)` | `POST` | `/ontology/versions/runs` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().versions().runs().create(...)` | `POST` | `/ontology/versions/runs` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().versions().runs().create(...)` | `POST` | `/ontology/versions/runs` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().versions().runs().create(...)` | `POST` | `/ontology/versions/runs` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().versions().versions().delete(...)` | `DELETE` | `/ontology/versions/versions/{param}` | `String versionId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().versions().versions().delete(...)` | `DELETE` | `/ontology/versions/versions/{param}` | `String versionId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().versions().versions().delete(...)` | `DELETE` | `/ontology/versions/versions/{param}` | `String versionId, Class<T> responseType` | `@Nullable T` |
| `ontology().versions().versions().delete(...)` | `DELETE` | `/ontology/versions/versions/{param}` | `String versionId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().versions().versions().get(...)` | `GET` | `/ontology/versions/versions/{param}` | `String versionId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().versions().versions().get(...)` | `GET` | `/ontology/versions/versions/{param}` | `String versionId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().versions().versions().get(...)` | `GET` | `/ontology/versions/versions/{param}` | `String versionId, Class<T> responseType` | `@Nullable T` |
| `ontology().versions().versions().get(...)` | `GET` | `/ontology/versions/versions/{param}` | `String versionId, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().versions().versions().create(...)` | `POST` | `/ontology/versions/versions` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().versions().versions().create(...)` | `POST` | `/ontology/versions/versions` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().versions().versions().create(...)` | `POST` | `/ontology/versions/versions` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().versions().versions().create(...)` | `POST` | `/ontology/versions/versions` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().versions().versions().compare(...)` | `POST` | `/ontology/versions/versions/compare` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().versions().versions().compare(...)` | `POST` | `/ontology/versions/versions/compare` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().versions().versions().compare(...)` | `POST` | `/ontology/versions/versions/compare` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().versions().versions().compare(...)` | `POST` | `/ontology/versions/versions/compare` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().engine().ontologies().compareVersions().create(...)` | `POST` | `/ontology/engine/ontologies/compare-versions` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().engine().ontologies().compareVersions().create(...)` | `POST` | `/ontology/engine/ontologies/compare-versions` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().engine().ontologies().compareVersions().create(...)` | `POST` | `/ontology/engine/ontologies/compare-versions` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().engine().ontologies().compareVersions().create(...)` | `POST` | `/ontology/engine/ontologies/compare-versions` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().engine().ontologies().inferClasses().create(...)` | `POST` | `/ontology/engine/ontologies/infer-classes` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().engine().ontologies().inferClasses().create(...)` | `POST` | `/ontology/engine/ontologies/infer-classes` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().engine().ontologies().inferClasses().create(...)` | `POST` | `/ontology/engine/ontologies/infer-classes` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().engine().ontologies().inferClasses().create(...)` | `POST` | `/ontology/engine/ontologies/infer-classes` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().engine().ontologies().inferProperties().create(...)` | `POST` | `/ontology/engine/ontologies/infer-properties` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().engine().ontologies().inferProperties().create(...)` | `POST` | `/ontology/engine/ontologies/infer-properties` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().engine().ontologies().inferProperties().create(...)` | `POST` | `/ontology/engine/ontologies/infer-properties` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().engine().ontologies().inferProperties().create(...)` | `POST` | `/ontology/engine/ontologies/infer-properties` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().events().events().checkpoints().get(...)` | `GET` | `/ontology/events/events/checkpoints/{param}` | `String consumer, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `ontology().events().events().checkpoints().get(...)` | `GET` | `/ontology/events/events/checkpoints/{param}` | `String consumer, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().events().events().checkpoints().get(...)` | `GET` | `/ontology/events/events/checkpoints/{param}` | `String consumer, Class<T> responseType` | `@Nullable T` |
| `ontology().events().events().checkpoints().get(...)` | `GET` | `/ontology/events/events/checkpoints/{param}` | `String consumer, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().events().events().checkpoints().create(...)` | `POST` | `/ontology/events/events/checkpoints` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().events().events().checkpoints().create(...)` | `POST` | `/ontology/events/events/checkpoints` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().events().events().checkpoints().create(...)` | `POST` | `/ontology/events/events/checkpoints` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().events().events().checkpoints().create(...)` | `POST` | `/ontology/events/events/checkpoints` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().events().events().leases().acknowledge(...)` | `POST` | `/ontology/events/events/leases/acknowledge` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().events().events().leases().acknowledge(...)` | `POST` | `/ontology/events/events/leases/acknowledge` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().events().events().leases().acknowledge(...)` | `POST` | `/ontology/events/events/leases/acknowledge` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().events().events().leases().acknowledge(...)` | `POST` | `/ontology/events/events/leases/acknowledge` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().events().events().leases().acquire(...)` | `POST` | `/ontology/events/events/leases/acquire` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().events().events().leases().acquire(...)` | `POST` | `/ontology/events/events/leases/acquire` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().events().events().leases().acquire(...)` | `POST` | `/ontology/events/events/leases/acquire` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().events().events().leases().acquire(...)` | `POST` | `/ontology/events/events/leases/acquire` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().extract().extract().coreferences().create(...)` | `POST` | `/ontology/extract/extract/coreferences` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().extract().extract().coreferences().create(...)` | `POST` | `/ontology/extract/extract/coreferences` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().extract().extract().coreferences().create(...)` | `POST` | `/ontology/extract/extract/coreferences` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().extract().extract().coreferences().create(...)` | `POST` | `/ontology/extract/extract/coreferences` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().extract().extract().entities().create(...)` | `POST` | `/ontology/extract/extract/entities` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().extract().extract().entities().create(...)` | `POST` | `/ontology/extract/extract/entities` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().extract().extract().entities().create(...)` | `POST` | `/ontology/extract/extract/entities` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().extract().extract().entities().create(...)` | `POST` | `/ontology/extract/extract/entities` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().extract().extract().events().create(...)` | `POST` | `/ontology/extract/extract/events` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().extract().extract().events().create(...)` | `POST` | `/ontology/extract/extract/events` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().extract().extract().events().create(...)` | `POST` | `/ontology/extract/extract/events` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().extract().extract().events().create(...)` | `POST` | `/ontology/extract/extract/events` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().extract().extract().relations().create(...)` | `POST` | `/ontology/extract/extract/relations` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().extract().extract().relations().create(...)` | `POST` | `/ontology/extract/extract/relations` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().extract().extract().relations().create(...)` | `POST` | `/ontology/extract/extract/relations` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().extract().extract().relations().create(...)` | `POST` | `/ontology/extract/extract/relations` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().extract().extract().triplets().create(...)` | `POST` | `/ontology/extract/extract/triplets` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().extract().extract().triplets().create(...)` | `POST` | `/ontology/extract/extract/triplets` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `ontology().extract().extract().triplets().create(...)` | `POST` | `/ontology/extract/extract/triplets` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `ontology().extract().extract().triplets().create(...)` | `POST` | `/ontology/extract/extract/triplets` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |

The generic `request(...)` methods and `Endpoints` constants remain available.
