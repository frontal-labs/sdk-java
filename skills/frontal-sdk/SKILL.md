---
name: frontal-sdk-java
description: Guidance for adding or reviewing integrations using the Frontal Java SDK.
---

# Frontal Java SDK

Check the matching Java service client and contract before using an operation. Follow the idioms and toolchain documented in this repository.

## Configuration

The builder accepts an API key (`frt_...`) and optional URLs, environment, debug, timeout, retry, and header settings. Environment defaults include `FRONTAL_API_KEY`, `FRONTAL_API_URL`, `FRONTAL_AI_URL`, `FRONTAL_ENV`, and `FRONTAL_DEBUG`. See `.env.example`; Java does not load `.env` files automatically.

## Modules

See [the architecture guide](../../docs/ARCHITECTURE.md) and Java sources under `../../core/`, `../../services/`, and `../../sdk/`.
