# Java SDK overview

The Frontal Java SDK is configured to publish the `dev.frontal:frontal-sdk:1.0.0` facade artifact from a Gradle multi-module build. Production sources use the single package `dev.frontal.sdk` and six role folders across `core`, `services`, and `sdk`.

The route inventory generates `Endpoints` constants for all 622 current API routes and maps every operation in the public and AI OpenAPI snapshots. `Frontal` creates service-scoped clients, and `ApiClient` handles Jackson JSON, binary payloads, multipart uploads, SSE streams, retries for safe reads, and structured HTTP errors. Request and response classes can be provided by SDK consumers where the shared contract snapshots do not include a typed schema.
