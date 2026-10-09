# Governance API

Service accessor: `frontal.governance()` (`GovernanceClient`).

Operations are grouped by resource path. Collection methods use `list` and `create`; item methods use `get`, `update`, and `delete`. Calls can omit `QueryParams` when no query values are needed. Use contract-defined `JsonNode` bodies and caller-selected response types where schemas are not available.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `governance().access().check(...)` | `POST` | `/access/check` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `governance().access().check(...)` | `POST` | `/access/check` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `governance().access().check(...)` | `POST` | `/access/check` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `governance().access().check(...)` | `POST` | `/access/check` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `governance().compliance().getScore(...)` | `GET` | `/compliance/score` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `governance().compliance().getScore(...)` | `GET` | `/compliance/score` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `governance().compliance().getScore(...)` | `GET` | `/compliance/score` | `Class<T> responseType` | `@Nullable T` |
| `governance().compliance().getScore(...)` | `GET` | `/compliance/score` | `TypeReference<T> responseType` | `@Nullable T` |
| `governance().permissions().list(...)` | `GET` | `/permissions` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `governance().permissions().list(...)` | `GET` | `/permissions` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `governance().permissions().list(...)` | `GET` | `/permissions` | `Class<T> responseType` | `@Nullable T` |
| `governance().permissions().list(...)` | `GET` | `/permissions` | `TypeReference<T> responseType` | `@Nullable T` |
| `governance().permissions().get(...)` | `GET` | `/permissions/{param}` | `String permissionId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `governance().permissions().get(...)` | `GET` | `/permissions/{param}` | `String permissionId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `governance().permissions().get(...)` | `GET` | `/permissions/{param}` | `String permissionId, Class<T> responseType` | `@Nullable T` |
| `governance().permissions().get(...)` | `GET` | `/permissions/{param}` | `String permissionId, TypeReference<T> responseType` | `@Nullable T` |
| `governance().permissions().create(...)` | `POST` | `/permissions` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `governance().permissions().create(...)` | `POST` | `/permissions` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `governance().permissions().create(...)` | `POST` | `/permissions` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `governance().permissions().create(...)` | `POST` | `/permissions` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `governance().policies().delete(...)` | `DELETE` | `/policies/{param}` | `String policyId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `governance().policies().delete(...)` | `DELETE` | `/policies/{param}` | `String policyId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `governance().policies().delete(...)` | `DELETE` | `/policies/{param}` | `String policyId, Class<T> responseType` | `@Nullable T` |
| `governance().policies().delete(...)` | `DELETE` | `/policies/{param}` | `String policyId, TypeReference<T> responseType` | `@Nullable T` |
| `governance().policies().list(...)` | `GET` | `/policies` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `governance().policies().list(...)` | `GET` | `/policies` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `governance().policies().list(...)` | `GET` | `/policies` | `Class<T> responseType` | `@Nullable T` |
| `governance().policies().list(...)` | `GET` | `/policies` | `TypeReference<T> responseType` | `@Nullable T` |
| `governance().policies().get(...)` | `GET` | `/policies/{param}` | `String policyId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `governance().policies().get(...)` | `GET` | `/policies/{param}` | `String policyId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `governance().policies().get(...)` | `GET` | `/policies/{param}` | `String policyId, Class<T> responseType` | `@Nullable T` |
| `governance().policies().get(...)` | `GET` | `/policies/{param}` | `String policyId, TypeReference<T> responseType` | `@Nullable T` |
| `governance().policies().create(...)` | `POST` | `/policies` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `governance().policies().create(...)` | `POST` | `/policies` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `governance().policies().create(...)` | `POST` | `/policies` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `governance().policies().create(...)` | `POST` | `/policies` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `governance().policies().createFromTemplate(...)` | `POST` | `/policies/from-template` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `governance().policies().createFromTemplate(...)` | `POST` | `/policies/from-template` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `governance().policies().createFromTemplate(...)` | `POST` | `/policies/from-template` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `governance().policies().createFromTemplate(...)` | `POST` | `/policies/from-template` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `governance().policies().validate(...)` | `POST` | `/policies/validate` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `governance().policies().validate(...)` | `POST` | `/policies/validate` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `governance().policies().validate(...)` | `POST` | `/policies/validate` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `governance().policies().validate(...)` | `POST` | `/policies/validate` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `governance().policies().update(...)` | `PUT` | `/policies/{param}` | `String policyId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `governance().policies().update(...)` | `PUT` | `/policies/{param}` | `String policyId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `governance().policies().update(...)` | `PUT` | `/policies/{param}` | `String policyId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `governance().policies().update(...)` | `PUT` | `/policies/{param}` | `String policyId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `governance().roles().delete(...)` | `DELETE` | `/roles/{param}` | `String roleId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `governance().roles().delete(...)` | `DELETE` | `/roles/{param}` | `String roleId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `governance().roles().delete(...)` | `DELETE` | `/roles/{param}` | `String roleId, Class<T> responseType` | `@Nullable T` |
| `governance().roles().delete(...)` | `DELETE` | `/roles/{param}` | `String roleId, TypeReference<T> responseType` | `@Nullable T` |
| `governance().roles().list(...)` | `GET` | `/roles` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `governance().roles().list(...)` | `GET` | `/roles` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `governance().roles().list(...)` | `GET` | `/roles` | `Class<T> responseType` | `@Nullable T` |
| `governance().roles().list(...)` | `GET` | `/roles` | `TypeReference<T> responseType` | `@Nullable T` |
| `governance().roles().get(...)` | `GET` | `/roles/{param}` | `String roleId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `governance().roles().get(...)` | `GET` | `/roles/{param}` | `String roleId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `governance().roles().get(...)` | `GET` | `/roles/{param}` | `String roleId, Class<T> responseType` | `@Nullable T` |
| `governance().roles().get(...)` | `GET` | `/roles/{param}` | `String roleId, TypeReference<T> responseType` | `@Nullable T` |
| `governance().roles().create(...)` | `POST` | `/roles` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `governance().roles().create(...)` | `POST` | `/roles` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `governance().roles().create(...)` | `POST` | `/roles` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `governance().roles().create(...)` | `POST` | `/roles` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `governance().compliance().assessments().list(...)` | `GET` | `/compliance/assessments` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `governance().compliance().assessments().list(...)` | `GET` | `/compliance/assessments` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `governance().compliance().assessments().list(...)` | `GET` | `/compliance/assessments` | `Class<T> responseType` | `@Nullable T` |
| `governance().compliance().assessments().list(...)` | `GET` | `/compliance/assessments` | `TypeReference<T> responseType` | `@Nullable T` |
| `governance().compliance().assessments().get(...)` | `GET` | `/compliance/assessments/{param}` | `String assessmentId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `governance().compliance().assessments().get(...)` | `GET` | `/compliance/assessments/{param}` | `String assessmentId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `governance().compliance().assessments().get(...)` | `GET` | `/compliance/assessments/{param}` | `String assessmentId, Class<T> responseType` | `@Nullable T` |
| `governance().compliance().assessments().get(...)` | `GET` | `/compliance/assessments/{param}` | `String assessmentId, TypeReference<T> responseType` | `@Nullable T` |
| `governance().compliance().assessments().create(...)` | `POST` | `/compliance/assessments` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `governance().compliance().assessments().create(...)` | `POST` | `/compliance/assessments` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `governance().compliance().assessments().create(...)` | `POST` | `/compliance/assessments` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `governance().compliance().assessments().create(...)` | `POST` | `/compliance/assessments` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `governance().compliance().frameworks().list(...)` | `GET` | `/compliance/frameworks` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `governance().compliance().frameworks().list(...)` | `GET` | `/compliance/frameworks` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `governance().compliance().frameworks().list(...)` | `GET` | `/compliance/frameworks` | `Class<T> responseType` | `@Nullable T` |
| `governance().compliance().frameworks().list(...)` | `GET` | `/compliance/frameworks` | `TypeReference<T> responseType` | `@Nullable T` |
| `governance().compliance().violations().list(...)` | `GET` | `/compliance/violations` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `governance().compliance().violations().list(...)` | `GET` | `/compliance/violations` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `governance().compliance().violations().list(...)` | `GET` | `/compliance/violations` | `Class<T> responseType` | `@Nullable T` |
| `governance().compliance().violations().list(...)` | `GET` | `/compliance/violations` | `TypeReference<T> responseType` | `@Nullable T` |
| `governance().compliance().violations().resolve(...)` | `POST` | `/compliance/violations/{param}/resolve` | `String violationId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `governance().compliance().violations().resolve(...)` | `POST` | `/compliance/violations/{param}/resolve` | `String violationId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `governance().compliance().violations().resolve(...)` | `POST` | `/compliance/violations/{param}/resolve` | `String violationId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `governance().compliance().violations().resolve(...)` | `POST` | `/compliance/violations/{param}/resolve` | `String violationId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `governance().policies().templates().list(...)` | `GET` | `/policies/templates` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `governance().policies().templates().list(...)` | `GET` | `/policies/templates` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `governance().policies().templates().list(...)` | `GET` | `/policies/templates` | `Class<T> responseType` | `@Nullable T` |
| `governance().policies().templates().list(...)` | `GET` | `/policies/templates` | `TypeReference<T> responseType` | `@Nullable T` |
| `governance().policies().versions().list(...)` | `GET` | `/policies/{param}/versions` | `String policyId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `governance().policies().versions().list(...)` | `GET` | `/policies/{param}/versions` | `String policyId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `governance().policies().versions().list(...)` | `GET` | `/policies/{param}/versions` | `String policyId, Class<T> responseType` | `@Nullable T` |
| `governance().policies().versions().list(...)` | `GET` | `/policies/{param}/versions` | `String policyId, TypeReference<T> responseType` | `@Nullable T` |

The generic `request(...)` methods and `Endpoints` constants remain available.
