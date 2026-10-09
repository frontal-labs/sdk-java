# Frontal Java SDK

![Frontal Banner](./banner.png)

[![skills.sh](https://skills.sh/b/frontal-labs/sdk-java)](https://skills.sh/frontal-labs/sdk-java)

Hand-written Java 17+ clients for Frontal services, with OkHttp transport, Jackson models, cursor pagination, typed failures, retries for safe reads, and SSE streams.

## Install

Maven:

```xml
<dependency>
  <groupId>dev.frontal</groupId>
  <artifactId>frontal-sdk</artifactId>
  <version>2.0.0</version>
</dependency>
```

Gradle Kotlin DSL:

```kotlin
implementation("dev.frontal:frontal-sdk:2.0.0")
```

Set `FRONTAL_API_KEY`, then make a testable call. The README snippet is compiled and run against MockWebServer in CI:

```java
try (Frontal quickstartClient = Frontal.builder().apiKey("frt_test_key").apiBaseUrl(mock.url("/v1").toString()).build()) {
  JsonNode agent = quickstartClient.agents().get("agt_123", JsonNode.class);
  if (!"triage".equals(agent.path("name").asText())) throw new AssertionError();
}
```

The production default API base URL is `https://api.frontal.dev/v1`; `apiBaseUrl(...)` configures test servers and compatible gateways. `Frontal` exposes a client for every API service, with nested resource clients and concise methods generated from the route catalog. Collection methods use names such as `list()` and `create()`, item methods use `get(id)`, `update(id, body)`, and `delete(id)`, and custom actions keep their action names. Each resource shares one transport; `Endpoints` and generic `request` methods remain available for advanced use.

Nested routes follow their resource path:

```java
JsonNode run = f.agents().runs().get("run_123", JsonNode.class);
```

```java
JsonNode dataset = f.data().ingest().datasets().get("dataset_123", JsonNode.class);
```

For routes whose contracts do not define a payload schema, named methods accept `JsonNode` request bodies and caller-selected response types. Use `QueryParams` when you need to add query values and `TypeReference<T>` for generic collections:

```java
  JsonNode health = f.agents().health(JsonNode.class);
```

## Configuration

`Frontal.builder()` accepts `apiKey`, `apiBaseUrl`, `aiBaseUrl`, `environment`, `debug`, `requestTimeout`, `connectTimeout`, `maxRetries`, `maxResponseBytes`, `maxErrorBodyBytes`, `userAgent`, custom headers, and an optional `ObjectMapper`. The SDK copies a supplied mapper at build time. `Frontal.fromEnvironment()` reads `FRONTAL_API_KEY`, `FRONTAL_API_URL`, `FRONTAL_AI_URL`, `FRONTAL_ENV`, `FRONTAL_DEBUG`, and `FRONTAL_TIMEOUT`. Java does not load `.env` files automatically.

HTTP errors are `FrontalException` subclasses: `AuthException`, `RateLimitException`, `ValidationException`, `ServerException`, or `ApiException`. They expose `code()`, `requestId()`, `statusCode()`, and `retryable()`. Network failures use `NetworkException`. `responseBody()` retains at most 16 KiB by default; `responseBodyTruncated()` reports when the diagnostic body was capped.

With a `Frontal` client open, catch typed failures when the application needs different handling, and use the request ID for support diagnostics. Error response bodies are available through `responseBody()` and may contain sensitive data, so avoid logging them indiscriminately:

```java
try {
  JsonNode agent = f.agents().get("agt_123", JsonNode.class);
} catch (RateLimitException e) {
  System.err.println("Retry after " + e.retryAfter() + "; request " + e.requestId());
} catch (FrontalException e) {
  System.err.println("Frontal request failed: " + e.code() + "; request " + e.requestId());
}
```

Paginated list operations return `PageResult<T>` with `nextPage()`, `all()`, and `Iterable<T>` support. Streaming endpoints expose `Flow.Publisher<String>` and a blocking `SseEventIterator` that callers close after use.

Iterate pages lazily when the result may be large:

```java
for (JsonNode agent : f.agents().listPages(QueryParams.empty(), JsonNode.class)) {
  System.out.println(agent.path("id").asText());
}
```

`requestBytes()` buffers a response up to the configured response limit. For larger downloads, use `streamBody()` and close the response. This example assumes `outputStream` is an open `OutputStream`:

```java
Endpoint download = new Endpoint(ApiService.DATA, HttpMethod.GETRAW, "/exports/{param}");
try (ApiStream response = f.data().streamBody(download, List.of("exp_123"), QueryParams.empty(), null)) {
  response.body().transferTo(outputStream);
}
```

Request and query maps use their keys verbatim as wire names; for example, use `"agent_id"` when the API expects `agent_id`. Java bean properties use the default snake case Jackson strategy. A custom mapper’s settings are honored, and `@JsonProperty` controls exact field names.

The configured request timeout applies to each ordinary call attempt and `streamBody()` download attempt. Safe GET requests may retry up to `maxRetries`; writes run once. Retry delays are capped at five seconds. SSE connections disable the read and call timeout so long-lived streams can remain open; close the blocking iterator or cancel the Flow subscription to release the connection.


Browse the [service API reference](./docs/api/README.md) for all named operations and route signatures.

## Build and verify

Requirements: JDK 17 or 21 and Python 3 for the contract check. The Gradle wrapper is the supported build entry point.

```bash
./gradlew spotlessApply
./gradlew spotlessCheck build lint test examplesTest docsTest checkContracts
```

The Java modules are `core` (transport), `services` (domain clients and route catalog), `sdk` (unified facade), and `examples` (consumer smoke checks). See [CONTRIBUTING.md](./CONTRIBUTING.md), [docs/ONBOARDING.md](./docs/ONBOARDING.md), and [docs/PUBLISHING.md](./docs/PUBLISHING.md).

## Agent skills

Install this repository's Java-specific agent skills with the [skills CLI](https://skills.sh/docs/cli):

```bash
npx skills add frontal-labs/sdk-java
```

## License

Apache-2.0. See [LICENSE.md](./LICENSE.md).
