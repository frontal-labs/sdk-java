# Java examples

Examples in this repository use Java 17 and the Maven coordinate `dev.frontal:frontal-sdk:1.0.0`. The SDK exposes contract routes through `Endpoints` and accepts caller-provided response types when a contract does not define a typed model.

For standalone starter applications tailored to common deployment patterns, see [`templates/README.md`](../templates/README.md).

The README test harness supplies `mock` and runs this example without a Frontal backend. For a live client, use `Frontal.fromEnvironment()` after setting `FRONTAL_API_KEY`.

```java
try (Frontal client = Frontal.builder()
    .apiKey("frt_test_key")
    .baseUrl(mock.url("/v1").toString())
    .build()) {
  PageResult<JsonNode> agents = client.agents().list(Map.of(), JsonNode.class);
  for (JsonNode agent : agents) {
    System.out.println(agent.path("id").asText());
  }
}
```

For binary responses, use `requestBytes`; for multipart uploads use `requestForm`; for streaming endpoints use `streamPublisher` or `streamEvents` and close the blocking iterator when finished. See the root README for environment variables and Gradle setup.
