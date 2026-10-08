---
name: frontal-sdk-java
description: Build Java integrations with Frontal or change, test, and document the hand-written Frontal Java SDK.
---

# Frontal Java SDK

Use this skill for downstream Java consumers and SDK implementation work. Verify names, signatures, and request shapes against this checkout's Java sources and the committed contracts; `contracts/sdk-endpoints.json` and `contracts/openapi/` define supported operations.

## Use the client

The published artifact is `dev.frontal:frontal-sdk`; production types use the single package `dev.frontal.sdk`. Build one `Frontal` with `Frontal.builder()` or `Frontal.fromEnvironment()`, then use its service accessors. The named convenience methods and generic service `request` methods are both backed by the route inventory. Use the matching `Endpoints` constants when available.

```java
try (Frontal frontal = Frontal.builder()
    .apiKey(System.getenv("FRONTAL_API_KEY"))
    .build()) {
  JsonNode agent = frontal.agents().get("agt_123", JsonNode.class);
}
```

Do not guess operation methods or payload schemas. Use `JsonNode` for a response without a declared model rather than fabricating a model. Preserve the API's wire names through Jackson conventions already present in the owning module.

## Configuration and lifecycle

Builder options include `baseUrl`, `aiBaseUrl`, `env`, `debug`, `timeout`, `connectTimeout`, `maxRetries`, and custom headers. `fromEnvironment()` reads `FRONTAL_API_KEY`, `FRONTAL_API_URL`, `FRONTAL_AI_URL`, `FRONTAL_ENV`, and `FRONTAL_DEBUG` (the implementation may also support `FRONTAL_TIMEOUT`). Java does not load `.env` files. Close `Frontal` when its lifecycle ends; use try-with-resources in applications and tests. Never log keys or include them in URLs or exception messages.

## Runtime patterns

- The shared transport uses OkHttp and JSON uses Jackson. Reuse the client so services share transport configuration and resources.
- Handle `FrontalException` subclasses explicitly when useful: auth, rate-limit, validation, server, and generic API errors. Network failures are `NetworkException`. Preserve `requestId()` for support diagnostics.
- `PageResult<T>` supports lazy `nextPage()`, `all()`, and iteration. Prefer lazy iteration for potentially large result sets.
- Use `Poller.pollUntil` for long-running operations. For SSE, prefer `Flow.Publisher<String>` for reactive consumers; close `SseEventIterator` in a `try`/resource scope when using the blocking API.
- Do not automatically retry a write unless its contract and caller provide idempotency guarantees.

## Change the SDK

This is a hand-written multi-module SDK. `core/` owns transport, auth, config, errors, shared models, and utilities; `services/` owns domain clients and endpoint constants; `sdk/` owns the published facade; `examples/` checks consumer usage. Put production classes in the existing role folders (`api/`, `auth/`, `config/`, `models/`, `resources/`, `utils/`) in the owning module. Do not introduce Java subpackages or per-service directories.

For contract-backed operations, update the appropriate service implementation and keep generated constants synchronized through `scripts/generate_endpoints.py`. Do not modify OpenAPI snapshots or the public API contract unless the task explicitly concerns those sources. Document new public APIs and add a runnable consumer example when appropriate.

## Tests and quality

Use OkHttp `MockWebServer`; ordinary tests must work offline with no API key. Cover URL construction, auth/environment headers, JSON mapping, typed failures, pagination, polling, and SSE resource cleanup for affected behavior. Follow the repository's JDK 17 baseline and supported JDK 17/21 test matrix.

Useful checks from the root:

```bash
./gradlew spotlessCheck
./gradlew assemble
./gradlew lint
./gradlew test
./gradlew examplesTest docsTest checkContracts
```

Spotless uses palantir-java-format; Error Prone and NullAway are enabled. Read `AGENTS.md`, `docs/ARCHITECTURE.md`, `docs/ONBOARDING.md`, and `CONTRIBUTING.md` for detailed repository rules. For library/API syntax changes, follow the repository's `ctx7` instructions in `AGENTS.md`.
