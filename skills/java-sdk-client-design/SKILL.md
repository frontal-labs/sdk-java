---
name: java-sdk-client-design
description: Extend the Frontal Java SDK with contract-backed clients, configuration, models, and public APIs.
---

# Java SDK Client Design

Use this skill for production API design or implementation in `sdk-java`.

- Keep all production classes in `dev.frontal.sdk`; module/source role folders organize code but do not create Java subpackages.
- Follow the module split: `core` for transport/config/auth/errors/common utilities, `services` for domain clients and route constants, and `sdk` for the public facade.
- Check `contracts/sdk-endpoints.json` and OpenAPI before selecting routes or modeling fields. Do not change contract snapshots as a side effect of SDK work.
- Reuse the shared OkHttp transport and Jackson conventions. Keep nullability explicit and satisfy Error Prone/NullAway.
- Keep public methods discoverable from the `Frontal` facade and document new API behavior with a runnable consumer example.
- For new route constants, synchronize generated output through `scripts/generate_endpoints.py`.

Read `AGENTS.md` and `docs/ARCHITECTURE.md` before moving responsibilities between modules.
