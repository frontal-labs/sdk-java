# Java SDK architecture

The SDK is a Gradle multi-module project with one public artifact, `dev.frontal:frontal-sdk:1.0.0`, and one Java package, `dev.frontal.sdk`.

## Modules and source organization

- `core/` owns OkHttp transport, Jackson conversion, authentication, configuration, errors, pagination, polling, and stream support.
- `services/` owns contract-backed route constants and service resource classes.
- `sdk/` owns `Frontal`, the unified builder and service accessors, plus integration and contract tests.
- `examples/` verifies the consumer experience with MockWebServer.
- Production classes remain in `dev.frontal.sdk`. The `api/`, `auth/`, `config/`, `models/`, `resources/`, and `utils/` folders organize types by role and do not create Java subpackages.

`Endpoints` is derived from `contracts/sdk-endpoints.json`. The OpenAPI snapshots remain unchanged and feed the contract gate.

## Request flow

`Application → Frontal → service client → shared ApiClient → auth/config/retry → OkHttp → Frontal API`

`Frontal` creates one `ApiClient` and shares it with each service client. `ClientConfig` is immutable after build. Each request gets a unique request ID, and error mapping happens once in the shared transport. Safe GET requests may retry; writes run once. Streaming endpoints transfer response-body ownership to `ApiStream`, `SseEventIterator`, or a Flow subscription so cancellation closes the connection.

## Service APIs

AI, agents, and workflows have named convenience methods for their core operations. All 622 catalogued routes remain accessible through service-scoped `request` methods and the `Endpoints` constants. The contract gate maps every operation in the public and AI OpenAPI snapshots to an endpoint. Caller-provided classes, `TypeReference`, or Jackson `JsonNode` types handle payloads that the current snapshots do not fully model.
