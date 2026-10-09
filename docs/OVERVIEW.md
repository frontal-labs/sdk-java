# Java SDK overview

The Frontal Java SDK is configured to publish the `dev.frontal:frontal-sdk:2.0.0` facade artifact from a Gradle multi-module build. Production sources use the single package `dev.frontal.sdk` and six role folders across `core`, `services`, and `sdk`.

The SDK exposes 611 named operations across its service clients, with agent run lookup available through `frontal.agents()`. `Endpoints` constants follow the supported SDK route catalog. `ApiClient` handles Jackson JSON, binary payloads, multipart uploads, SSE streams, safe-read retries, bounded error diagnostics, and structured HTTP errors. Named operations use immutable `QueryParams`, `JsonNode` for request bodies without contract schemas, and caller-provided response types.
