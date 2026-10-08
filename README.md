# Frontal Java SDK

![Frontal Banner](./banner.png)

**Frontal client library for Java.**

This repository contains the Frontal Java SDK as a single Maven artifact. Production code uses the standard Maven `src/main/java` layout and the single Java package `dev.frontal.sdk`. Six source folders organize SDK code by responsibility; they do not create Java subpackages.

The SDK includes a configurable HTTP client, Bearer and custom authentication, typed Jackson request and response handling, structured API errors, bounded response handling, retries for safe reads, multipart uploads, binary responses, event streaming, and generated constants for all 370 routes in the 18-service contract inventory.

## Repository map

| Path | Purpose |
| --- | --- |
| `src/main/java/dev/frontal/sdk/` | The single Java package, organized into `api/`, `auth/`, `config/`, `models/`, `resources/`, and `utils/` |
| `src/test/java/dev/frontal/sdk/` | Tests using the same package when package access is needed |
| `contracts/` | OpenAPI snapshots, endpoint inventory, and this repository's conformance reports |
| `docs/` | Java architecture, onboarding, testing, and release guidance |
| `examples/` | Java integration guide and usage examples |
| `templates/` | Enterprise-oriented Java starters for approval, batch, and streaming setups |
| `scripts/` | Contract and documentation maintenance utilities |
| `.github/` | Java CI, security analysis, and contribution templates |

## Install

Add this dependency to your Maven `pom.xml` after the first Maven Central release:

```xml
<dependency>
  <groupId>dev.frontal</groupId>
  <artifactId>frontal-sdk</artifactId>
  <version>0.1.0</version>
</dependency>
```

The package is not published yet. Follow the setup instructions below to work from this checkout.

```java
import dev.frontal.sdk.Endpoints;
import dev.frontal.sdk.Frontal;
import com.fasterxml.jackson.databind.JsonNode;

Frontal frontal = Frontal.fromEnvironment();
JsonNode agent = frontal.agents().request(
    Endpoints.Agents.GET_AGENTS_PARAM,
    java.util.List.of("agent-id"),
    java.util.Map.of(),
    null,
    JsonNode.class);
```

## Development

Requirements: JDK 17 or later with Maven 3.9+. Check the toolchain with `java --version` and `mvn --version`.

```bash
mvn --batch-mode --no-transfer-progress verify
mvn spotless:apply
mvn spotless:check
mvn test
mvn package
```

`mvn verify` runs unit tests, Checkstyle, and the Google Java Format check for SDK and template sources. Apply formatting with `mvn spotless:apply` before committing Java changes.

See [`CONTRIBUTING.md`](./CONTRIBUTING.md), [`docs/ONBOARDING.md`](./docs/ONBOARDING.md), and [`AGENTS.md`](./AGENTS.md).

## Configuration

| Variable | Purpose |
| --- | --- |
| `FRONTAL_API_KEY` | API key (`frt_...`) |
| `FRONTAL_API_URL` | API base URL; defaults to `https://api.frontal.dev/v1` |
| `FRONTAL_AI_URL` | AI base URL; defaults to `https://ai.frontal.dev` |
| `FRONTAL_ENV` | Runtime environment (`development`, `test`, or `production`) |
| `FRONTAL_DEBUG` | Enable debug logging |

Java does not load `.env` files automatically. Read values with `System.getenv` or inject them through your runtime/deployment configuration. The committed [`.env.example`](./.env.example) is a reference only; do not commit a populated `.env` file.

## License

Apache-2.0. See [`LICENSE.md`](./LICENSE.md).
