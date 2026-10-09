# Sandbox API

Service accessor: `frontal.sandbox()` (`SandboxClient`).

Named methods are generated from the committed route catalog. Build query values with `QueryParams` using exact API wire names. Routes without request schemas accept `JsonNode`; select `JsonNode` or a caller-provided model for unmodeled responses.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `getSandboxLanguages(...)` | `GET` | `/sandbox/languages` | `query, Class<T> responseType` | `@Nullable T` |
| `getSandboxLanguages(...)` | `GET` | `/sandbox/languages` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `postSandboxSelfTest(...)` | `POST` | `/sandbox/self-test` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postSandboxSelfTest(...)` | `POST` | `/sandbox/self-test` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postSandboxSubmit(...)` | `POST` | `/sandbox/submit` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postSandboxSubmit(...)` | `POST` | `/sandbox/submit` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| No catalogued operations | — | — | — | — |

The generic `request(...)` methods and `Endpoints` constants remain available.
