# Java SDK overview

The Frontal Java SDK is published as one Maven artifact, `dev.frontal:frontal-sdk`. Production sources use the single package `dev.frontal.sdk` and are organized into six role folders under `src/main/java/dev/frontal/sdk`.

The route inventory generates `Endpoints` constants for all 370 current API routes. `Frontal` creates service-scoped clients, and `ApiClient` handles Jackson JSON, binary payloads, multipart uploads, SSE streams, retries for safe reads, and structured HTTP errors. Request and response classes can be provided by SDK consumers where the shared contract snapshots do not include a typed schema.
