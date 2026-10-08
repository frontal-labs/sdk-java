# Java developer guide

## Tooling

Use JDK 17 or later with Maven 3.9+ and the native commands listed in [`README.md`](../README.md). The SDK runtime is written in Java. Two small repository maintenance scripts use Python 3's standard library to parse contract JSON and build the documentation index.

## Change placement

Keep all production types in `dev.frontal.sdk`. Place source files in the matching `api/`, `auth/`, `config/`, `models/`, `resources/`, or `utils/` folder, while keeping the Java package declaration unchanged. Do not create subpackages for those roles or individual services.

## Contract workflow

`contracts/openapi/` and `contracts/sdk-endpoints.json` are shared input snapshots. Run `python3 scripts/check_contracts.py` to check the snapshot files, `python3 scripts/generate_endpoints.py` after changing the route inventory, and `python3 scripts/generate_docs_manifest.py` after changing Markdown documentation.
