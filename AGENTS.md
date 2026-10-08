<!-- context7 -->
Use the `ctx7` CLI to fetch current documentation when code changes use a library, framework, SDK, API, CLI tool, or cloud service. Resolve a library with `npx ctx7@latest library <name> "<question>"`, then fetch its documentation with `npx ctx7@latest docs <libraryId> "<question>"`. Prefer these docs over web search for library APIs. Do not use this for general programming concepts, refactoring, or code review. Do not include credentials in queries.
<!-- context7 -->

# Frontal Java SDK - Agent Instructions

## Repository scope

This repository is the hand-written Frontal Java SDK. Treat the committed `contracts/sdk-endpoints.json` and OpenAPI snapshots as the source for endpoint shapes and generated route constants. Do not change the public HTTP API or OpenAPI snapshots as part of SDK implementation.

## Layout

- `settings.gradle.kts`, `build.gradle.kts` — Gradle Kotlin DSL multi-module build and shared toolchain.
- `core/` — transport, auth, configuration, errors, common models, and utilities.
- `services/` — contract-backed endpoints and service clients.
- `sdk/` — published `dev.frontal:frontal-sdk` facade and SDK tests.
- `examples/` — downstream consumer smoke tests.
- `contracts/openapi/` — shared OpenAPI snapshots.
- `contracts/sdk-endpoints.json` — source inventory for generated route constants.
- `docs/`, `examples/`, and `templates/` — Java-specific developer material.

## Java conventions

The SDK targets Java 17 and tests on Java 17 and 21. Every production class declares the single package `dev.frontal.sdk`; module and source folders organize code by role and do not create Java subpackages. Keep source files under the role folders `api/`, `auth/`, `config/`, `models/`, `resources/`, and `utils/` in their owning module. Tests use `src/test/java` and may declare the same package when package access is needed.

- Do not create Java subpackages or per-service directories.
- Keep service resource types under `resources/`.
- Use OkHttp and Jackson for transport and JSON.
- Use Spotless with palantir-java-format, Error Prone with NullAway, JUnit 5, and MockWebServer.
- Add or update service methods from the committed contracts; keep route constants synchronized with `scripts/generate_endpoints.py`.
- Document new public APIs and provide runnable examples.
- Never check in credentials or customer data.

## Key commands

```bash
./gradlew spotlessCheck
./gradlew assemble
./gradlew lint
./gradlew test
./gradlew examplesTest docsTest checkContracts
```

The contract and documentation index helpers use Python 3's standard library. They do not add a Python runtime dependency to the SDK.
