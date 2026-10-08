# Java examples

Examples in this repository use Java project conventions. The SDK exposes every current route through `Endpoints` and accepts caller-provided Java response types when a contract does not define a typed model.

For runnable Maven applications tailored to common deployment patterns, see [`templates/README.md`](../templates/README.md).

```java
import com.fasterxml.jackson.databind.JsonNode;
import dev.frontal.sdk.Endpoints;
import dev.frontal.sdk.Frontal;
import java.util.List;
import java.util.Map;

Frontal client = Frontal.fromEnvironment();
JsonNode agent = client.agents().request(
    Endpoints.Agents.GET_AGENTS_PARAM,
    List.of("agent-id"),
    Map.of("include", List.of("versions", "runs")),
    null,
    JsonNode.class);
```

For binary responses, use `requestBytes`; for multipart uploads use `requestForm`; for streaming endpoints use `streamResponse` and close the returned `ApiStream` when finished. See the root README for environment variables and Maven setup.
