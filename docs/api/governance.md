# Governance API

Service accessor: `frontal.governance()` (`GovernanceClient`).

Named methods are generated from the committed route catalog. Build query values with `QueryParams` using exact API wire names. Routes without request schemas accept `JsonNode`; select `JsonNode` or a caller-provided model for unmodeled responses.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `deletePoliciesParam(...)` | `DELETE` | `/policies/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `deletePoliciesParam(...)` | `DELETE` | `/policies/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `deleteRolesParam(...)` | `DELETE` | `/roles/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `deleteRolesParam(...)` | `DELETE` | `/roles/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getComplianceAssessments(...)` | `GET` | `/compliance/assessments` | `query, Class<T> responseType` | `@Nullable T` |
| `getComplianceAssessments(...)` | `GET` | `/compliance/assessments` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getComplianceAssessmentsParam(...)` | `GET` | `/compliance/assessments/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getComplianceAssessmentsParam(...)` | `GET` | `/compliance/assessments/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getComplianceFrameworks(...)` | `GET` | `/compliance/frameworks` | `query, Class<T> responseType` | `@Nullable T` |
| `getComplianceFrameworks(...)` | `GET` | `/compliance/frameworks` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getComplianceScore(...)` | `GET` | `/compliance/score` | `query, Class<T> responseType` | `@Nullable T` |
| `getComplianceScore(...)` | `GET` | `/compliance/score` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getComplianceViolations(...)` | `GET` | `/compliance/violations` | `query, Class<T> responseType` | `@Nullable T` |
| `getComplianceViolations(...)` | `GET` | `/compliance/violations` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getPermissions(...)` | `GET` | `/permissions` | `query, Class<T> responseType` | `@Nullable T` |
| `getPermissions(...)` | `GET` | `/permissions` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getPermissionsParam(...)` | `GET` | `/permissions/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getPermissionsParam(...)` | `GET` | `/permissions/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getPolicies(...)` | `GET` | `/policies` | `query, Class<T> responseType` | `@Nullable T` |
| `getPolicies(...)` | `GET` | `/policies` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getPoliciesTemplates(...)` | `GET` | `/policies/templates` | `query, Class<T> responseType` | `@Nullable T` |
| `getPoliciesTemplates(...)` | `GET` | `/policies/templates` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getPoliciesParam(...)` | `GET` | `/policies/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getPoliciesParam(...)` | `GET` | `/policies/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getPoliciesParamVersions(...)` | `GET` | `/policies/{param}/versions` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getPoliciesParamVersions(...)` | `GET` | `/policies/{param}/versions` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getRoles(...)` | `GET` | `/roles` | `query, Class<T> responseType` | `@Nullable T` |
| `getRoles(...)` | `GET` | `/roles` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getRolesParam(...)` | `GET` | `/roles/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getRolesParam(...)` | `GET` | `/roles/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `postAccessCheck(...)` | `POST` | `/access/check` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postAccessCheck(...)` | `POST` | `/access/check` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postComplianceAssessments(...)` | `POST` | `/compliance/assessments` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postComplianceAssessments(...)` | `POST` | `/compliance/assessments` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postComplianceViolationsParamResolve(...)` | `POST` | `/compliance/violations/{param}/resolve` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postComplianceViolationsParamResolve(...)` | `POST` | `/compliance/violations/{param}/resolve` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postPermissions(...)` | `POST` | `/permissions` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postPermissions(...)` | `POST` | `/permissions` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postPolicies(...)` | `POST` | `/policies` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postPolicies(...)` | `POST` | `/policies` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postPoliciesFromTemplate(...)` | `POST` | `/policies/from-template` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postPoliciesFromTemplate(...)` | `POST` | `/policies/from-template` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postPoliciesValidate(...)` | `POST` | `/policies/validate` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postPoliciesValidate(...)` | `POST` | `/policies/validate` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postRoles(...)` | `POST` | `/roles` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postRoles(...)` | `POST` | `/roles` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `putPoliciesParam(...)` | `PUT` | `/policies/{param}` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `putPoliciesParam(...)` | `PUT` | `/policies/{param}` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| No catalogued operations | — | — | — | — |

The generic `request(...)` methods and `Endpoints` constants remain available.
