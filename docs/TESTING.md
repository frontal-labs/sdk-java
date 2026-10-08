# Java testing strategy

Use JUnit 5 for unit and integration tests. Mock HTTP at the shared OkHttp boundary with MockWebServer, and keep tests independent of live Frontal keys or a backend.

The CI gates run in this order:

1. Spotless format check with palantir-java-format.
2. Gradle module compilation and assembly.
3. Error Prone and NullAway compilation.
4. JUnit tests for request encoding, response decoding, retry behavior, typed errors, pagination, and SSE lifecycle.
5. A consumer example test.
6. Compilation and execution of each Java README block against MockWebServer.
7. OpenAPI snapshot and route-catalog conformance checks.

Run the full set with `./gradlew spotlessCheck assemble lint test examplesTest docsTest checkContracts`. Run one module with `./gradlew :sdk:test`.
