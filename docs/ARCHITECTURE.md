# Java SDK architecture

The SDK is a Gradle multi-module project with one public artifact, `dev.frontal:frontal-sdk:2.0.0`, and one Java package, `dev.frontal.sdk`.

## Modules and source organization

- `core/` owns OkHttp transport, Jackson conversion, authentication, configuration, errors, pagination, polling, and stream support.
- `services/` owns contract-backed route constants and service resource classes.
- `sdk/` owns `Frontal`, the unified builder and service accessors, plus integration and contract tests.
- `examples/` verifies the consumer experience with MockWebServer.
- Production classes remain in `dev.frontal.sdk`. The `api/`, `auth/`, `config/`, `models/`, `resources/`, and `utils/` folders organize types by role and do not create Java subpackages.

`Endpoints`, nested resource clients, and concise operations are derived from `contracts/sdk-endpoints.json` and operation metadata in the committed OpenAPI snapshots. The snapshots remain unchanged and feed the contract gate. Resource clients follow route segments and expose conventional `list`, `get`, `create`, `update`, and `delete` methods plus named actions. Calls can omit `QueryParams` when they do not need query values. Request bodies without a usable schema use `JsonNode`, and callers choose response types where no model is available.

## Request flow

`Application → Frontal → service client → shared ApiClient → auth/config/retry → OkHttp → Frontal API`

`Frontal` creates one `ApiClient` and shares it with each typed service client. `ClientConfig` is immutable after build. Each request gets a unique request ID, and error mapping happens once in the shared transport. Safe GET requests may retry; writes run once. Buffered responses are bounded by `maxResponseBytes`; error diagnostics have a separate `maxErrorBodyBytes` cap. `streamBody()` supports larger downloads without buffering. Streaming endpoints transfer response-body ownership to `ApiStream`, `SseEventIterator`, or a Flow subscription so cancellation closes the connection. SSE connections disable read and call timeouts; the caller must close or cancel long-lived streams.

## Service APIs

The route inventory generates endpoint constants and named methods for the SDK’s 611 supported routes. Agent runs live under `agents().runs()`, while other nested paths follow their route resources. The contract gate verifies SDK routes against the committed inventory and maps supported operations in the public and AI OpenAPI snapshots. Caller-provided classes, `TypeReference`, or Jackson `JsonNode` types handle payloads that the current snapshots do not fully model. Generated references for service and resource clients live in `docs/api/`.
