# Java SDK architecture

The Java SDK is one Maven artifact with one production Java package: `dev.frontal.sdk`.

## Package and source organization

- All production source files live under `src/main/java/dev/frontal/sdk` and declare `package dev.frontal.sdk;`.
- The `api/`, `auth/`, `config/`, `models/`, `resources/`, and `utils/` source folders organize code by role. They do not create Java subpackages.
- `resources/Endpoints.java` contains generated route constants for every service. `resources/ServiceClient.java` scopes requests to one service.
- Tests live under `src/test/java/dev/frontal/sdk` and may use the same package when package-level access is needed.
- `contracts` stores shared API snapshots and conformance reports.

Keep authentication types separate by responsibility from the Frontal Auth service resource types, even though both use the single SDK package.

## Java mapping

This repository is a single Maven project with coordinates `dev.frontal:frontal-sdk`. The root POM manages the JDK baseline and shared plugin versions. Production code follows `src/main/java`; tests follow `src/test/java`. Role folders are organizational, while all production classes deliberately use the one package name `dev.frontal.sdk`. Public APIs target JDK 17+.

## Request flow

`Application → Frontal → service client → API client → shared auth/config/model handling → HTTP request → Frontal API`

Resource types use shared authentication and configuration rather than defining independent request defaults. Keep utilities stateless and avoid turning them into a catch-all for domain behavior.

## Current implementation status

The SDK exposes the current contract inventory through generated endpoint constants and a generic service client. The shared snapshots do not define complete schemas for every route, so request bodies accept Java objects and responses can be decoded into caller-provided Java types or Jackson nodes.
