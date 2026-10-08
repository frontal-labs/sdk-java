---
name: frontal-sdk-java
description: Guidance for using, implementing, and testing the hand-written Frontal Java SDK.
---

# Frontal Java SDK

Use the Java SDK source and contract snapshots as the reference for Java method names and request shapes. Keep all production types in `dev.frontal.sdk` and place service classes under `resources/`.

## Quick start

```java
Frontal frontal = Frontal.builder().apiKey(System.getenv("FRONTAL_API_KEY")).build();
JsonNode agent = frontal.agents().get("agt_123", JsonNode.class);
```

`Frontal.builder()` also accepts `baseUrl`, `aiBaseUrl`, `env`, `debug`, `timeout`, `connectTimeout`, `maxRetries`, and custom headers. `Frontal.fromEnvironment()` reads `FRONTAL_API_KEY`, `FRONTAL_API_URL`, `FRONTAL_AI_URL`, `FRONTAL_ENV`, and `FRONTAL_DEBUG`. Java does not load `.env` files automatically.

## Services

All service accessors use the same OkHttp transport. AI, agents, and workflows have named convenience operations; every route in `contracts/sdk-endpoints.json` is available through the matching service's `request` methods and `Endpoints` constants. Service-specific classes belong in `resources/` and use contract-backed paths.

## Errors and long-running work

HTTP failures use the sealed `FrontalException` hierarchy: `AuthException`, `RateLimitException`, `ValidationException`, `ServerException`, and `ApiException`. Network failures use `NetworkException`. All expose `code()`, `requestId()`, `statusCode()`, and `retryable()`.

Paginated operations return `PageResult<T>` with lazy `nextPage()`, `all()`, and `Iterable<T>` support. Poll long-running work with `Poller.pollUntil`. SSE endpoints expose `Flow.Publisher<String>` and a blocking `SseEventIterator`; close the iterator when finished.

## Testing and verification

Mock HTTP behavior with OkHttp `MockWebServer`; tests must not require a live Frontal backend or API key. CI checks formatting, compilation, Error Prone/NullAway, JUnit 5, example consumers, executable README Java blocks, and route/OpenAPI contract drift.
