# Java examples

Examples in this repository use Java 17 and the Maven coordinate `dev.frontal:frontal-sdk:2.0.0`. Named service methods take immutable `QueryParams`, `JsonNode` request bodies when schemas are unavailable, and caller-selected response types. `Endpoints` remains available for generic requests.

For standalone starter applications tailored to common deployment patterns, see [`templates/README.md`](../templates/README.md).

The README test harness supplies `mock` and runs this example without a Frontal backend. For a live client, use `Frontal.fromEnvironment()` after setting `FRONTAL_API_KEY`.

```java
try (Frontal client = Frontal.builder()
    .apiKey("frt_test_key")
    .apiBaseUrl(mock.url("/v1").toString())
    .build()) {
  PageResult<JsonNode> agents = client.agents().list(QueryParams.empty(), JsonNode.class);
  for (JsonNode agent : agents) {
    System.out.println(agent.path("id").asText());
  }
}
```

For small binary responses, use `requestBytes`; for larger downloads, use `streamBody` in try-with-resources. For multipart uploads use `requestForm`; for streaming endpoints use `streamPublisher` or `streamEvents` and close the blocking iterator when finished. The request timeout applies to ordinary calls and downloads. Long-lived SSE connections have no read timeout, so cancellation or closing is required. See the root README for error handling, wire-name serialization, environment variables, and Gradle setup.
