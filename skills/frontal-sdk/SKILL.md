---
name: frontal-sdk-java
description: Guidance for adding or reviewing integrations using the Frontal Java SDK.
---

# Frontal Java SDK

This repository is a scaffold. Check the matching Java package and source before using an operation; an endpoint in `contracts/` does not guarantee a public method exists. Follow the idioms and toolchain documented in this repository.

## Configuration

The client configuration uses `FRONTAL_API_KEY` (`frt_...`) and `FRONTAL_API_URL` (default `https://api.frontal.dev/v1`). See the root `.env.example`; this language does not load `.env` files automatically.

## Modules

See [the architecture guide](../../docs/ARCHITECTURE.md) and Java sources under `../../src/main/java/dev/frontal/sdk/`.
