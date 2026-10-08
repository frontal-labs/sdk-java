# Frontal Java SDK guide

This guide describes the Java SDK client and its contract-backed route access.

## Toolchain

JDK 17 or 21. See the root README for Gradle build and quality commands.

## Configuration

Set `FRONTAL_API_KEY` to a key beginning with `frt_`. `FRONTAL_API_URL` defaults to `https://api.frontal.dev/v1`, and `FRONTAL_AI_URL` defaults to `https://ai.frontal.dev`. `FRONTAL_ENV` sets the environment label, `FRONTAL_DEBUG` enables debug logging, and `FRONTAL_TIMEOUT` sets the request timeout in milliseconds. Java does not load `.env` files automatically.

## Package and type organization

All production types use the single package `dev.frontal.sdk`. The multi-module source roots are `core/src/main/java`, `services/src/main/java`, and `sdk/src/main/java`; the `api/`, `auth/`, `config/`, `models/`, `resources/`, and `utils/` folders organize types without defining Java subpackages.

Tests live under each module's `src/test/java` source root.

Use `Frontal` to access service clients, then choose a generated endpoint from `Endpoints`. The generic request methods support Jackson-decoded response types, raw bytes, multipart uploads, and live streams.
