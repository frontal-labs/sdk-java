# Frontal Java SDK - Agent Instructions

## Repository scope

This repository is the Frontal Java SDK. Treat the committed contract snapshots as the source for endpoint shapes and generated route constants.

## Layout

- `pom.xml` — single Maven project producing `dev.frontal:frontal-sdk`.
- `src/main/java/dev/frontal/sdk/` — the single SDK Java package, organized into six source folders.
- `src/test/java/dev/frontal/sdk/` — SDK tests.
- `contracts/openapi/` — shared OpenAPI snapshots.
- `contracts/sdk-endpoints.json` — source inventory for generated route constants.
- `docs/`, `examples/`, and `templates/` — Java-specific developer material.

## Java conventions

This repository is a single Maven project with coordinates `dev.frontal:frontal-sdk`. The root POM manages the JDK baseline and shared plugin versions. Production classes use the standard `src/main/java` source root and all declare the single package `dev.frontal.sdk`. Files are organized under `api/`, `auth/`, `config/`, `models/`, `resources/`, and `utils/`; these are source organization folders, not Java subpackages. Tests use `src/test/java` and may declare the same package when package access is needed. Public APIs target JDK 17+.

- Keep production `.java` files under the six role folders in `src/main/java/dev/frontal/sdk`; every file must still declare `package dev.frontal.sdk;`.
- Do not create Java subpackages or service-specific directories.
- Add `src/main/resources` or `src/test/resources` only when needed.
- Use the Java toolchain documented in the root README and document direct native commands.
- Name and design types according to their role: public client/API, authentication, typed models, configuration, service resources, or stateless utilities.
- Keep service resource types in the `resources/` source folder; do not make per-service subpackages.
- Do not invent public method names. Add docs and runnable examples when the matching API is implemented.
- Never check in credentials or customer data.

## Key commands

```bash
mvn --batch-mode --no-transfer-progress verify
mvn test
mvn package
```

The contract and docs index helpers are Python 3 standard-library maintenance scripts; they do not add Python as a runtime dependency for the SDK.
