# Frontal Java SDK guide

This guide describes the Java SDK client and its contract-backed route access.

## Toolchain

JDK 17 or later with Maven 3.9+. See the root README for direct build and quality commands.

## Configuration

Set `FRONTAL_API_KEY` to a key beginning with `frt_`. `FRONTAL_API_URL` defaults to `https://api.frontal.dev/v1` and `FRONTAL_AI_URL` defaults to `https://ai.frontal.dev`. Java does not load `.env` files automatically. Read values with `System.getenv` or inject them through your runtime/deployment configuration.

## Package and type organization

All production types use the single package `dev.frontal.sdk` and live under `src/main/java/dev/frontal/sdk`. The `api/`, `auth/`, `config/`, `models/`, `resources/`, and `utils/` folders organize source files and do not define Java subpackages.

Tests live under `src/test/java/dev/frontal/sdk`.

Use `Frontal` to access service clients, then choose a generated endpoint from `Endpoints`. The generic request methods support Jackson-decoded response types, raw bytes, multipart uploads, and live streams.
