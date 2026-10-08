---
name: java-mockwebserver-tests
description: Write deterministic JUnit and MockWebServer tests for the Frontal Java SDK.
---

# Java MockWebServer Tests

Use this skill when testing Java client transport, service, error, pagination, or streaming behavior.

- Use JUnit 5 and OkHttp `MockWebServer`; do not call a live Frontal backend or require a real key.
- Point `Frontal.builder().baseUrl(...)` at the server URL. Close both `Frontal` and `MockWebServer` in structured cleanup.
- Assert the recorded HTTP method, encoded path/query, auth and environment headers, and serialized request body, then exercise the actual SDK response parser.
- Cover typed API/network exceptions, request IDs, pagination continuation, and SSE publisher/iterator completion or cleanup where applicable.
- Prefer focused behavior assertions over internal call-count assertions. Keep tests in the owning module's `src/test/java` and use the same Java package only when package access is needed.
- Run the relevant Gradle test task, then `./gradlew spotlessCheck lint checkContracts` for broader client changes.

Follow the JDK 17 baseline and supported 17/21 test matrix in `AGENTS.md`.
