# Invocations API

Service accessor: `frontal.invocations()` (`InvocationsClient`).

Named methods are generated from the committed route catalog. Build query values with `QueryParams` using exact API wire names. Routes without request schemas accept `JsonNode`; select `JsonNode` or a caller-provided model for unmodeled responses.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `postInvocations(...)` | `POST` | `/invocations` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postInvocations(...)` | `POST` | `/invocations` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| No catalogued operations | — | — | — | — |

The generic `request(...)` methods and `Endpoints` constants remain available.
