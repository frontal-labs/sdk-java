# Frontal Java SDK

Hand-written Java 17+ clients for Frontal services, with OkHttp transport, Jackson models, cursor pagination, typed failures, retries for safe reads, and SSE streams.

## Install

Maven:

```xml
<dependency>
  <groupId>dev.frontal</groupId>
  <artifactId>frontal-sdk</artifactId>
  <version>1.0.0</version>
</dependency>
```

Gradle Kotlin DSL:

```kotlin
implementation("dev.frontal:frontal-sdk:1.0.0")
```

Set `FRONTAL_API_KEY`, then make a testable call. The README snippet is compiled and run against MockWebServer in CI:

```java
try (Frontal f = Frontal.builder().apiKey("frt_test_key").baseUrl(mock.url("/v1").toString()).build()) {
  JsonNode agent = f.agents().get("agt_123", JsonNode.class);
  if (!"triage".equals(agent.path("name").asText())) throw new AssertionError();
}
```

The production default base URL is `https://api.frontal.dev/v1`; `baseUrl(...)` is useful for tests and compatible gateways. `Frontal` exposes every API service, with named operation helpers for AI, agents, and workflows. Each service shares one transport, and all catalogued routes remain available through its `request` methods and `Endpoints` constants.

## Configuration

`Frontal.builder()` accepts `apiKey`, `baseUrl`, `aiBaseUrl`, `env`, `debug`, `timeout`, `connectTimeout`, `maxRetries`, and custom headers. `Frontal.fromEnvironment()` reads `FRONTAL_API_KEY`, `FRONTAL_API_URL`, `FRONTAL_AI_URL`, `FRONTAL_ENV`, `FRONTAL_DEBUG`, and `FRONTAL_TIMEOUT`. Java does not load `.env` files automatically.

HTTP errors are `FrontalException` subclasses: `AuthException`, `RateLimitException`, `ValidationException`, `ServerException`, or `ApiException`. They expose `code()`, `requestId()`, `statusCode()`, and `retryable()`. Network failures use `NetworkException`.

Paginated list operations return `PageResult<T>` with `nextPage()`, `all()`, and `Iterable<T>` support. Streaming endpoints expose `Flow.Publisher<String>` and a blocking `SseEventIterator` that callers close after use.

## Build and verify

Requirements: JDK 17 or 21 and Python 3 for the contract check. The Gradle wrapper is the supported build entry point.

```bash
./gradlew spotlessApply
./gradlew spotlessCheck build lint test examplesTest docsTest checkContracts
```

The Java modules are `core` (transport), `services` (domain clients and route catalog), `sdk` (unified facade), and `examples` (consumer smoke checks). See [CONTRIBUTING.md](./CONTRIBUTING.md), [docs/ONBOARDING.md](./docs/ONBOARDING.md), and [docs/PUBLISHING.md](./docs/PUBLISHING.md).

## License

Apache-2.0. See [LICENSE.md](./LICENSE.md).
