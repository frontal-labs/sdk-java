# Java developer guide

## Tooling

Use JDK 17 or 21 with the Gradle wrapper and commands listed in [`README.md`](../README.md). The SDK runtime is written in Java. Repository contract and documentation index scripts use Python 3's standard library.

## Change placement

Keep all production types in `dev.frontal.sdk`. Place source files in the matching `api/`, `auth/`, `config/`, `models/`, `resources/`, or `utils/` folder, while keeping the Java package declaration unchanged. Do not create subpackages for those roles or individual services.

## Contract workflow

`contracts/openapi/` and `contracts/sdk-endpoints.json` are shared inputs. After updating the public OpenAPI snapshot, run `python3 scripts/sync_endpoint_inventory.py` to add operations to the route inventory. Then run `python3 scripts/generate_endpoints.py` and `python3 scripts/check_contracts.py`. Run `python3 scripts/generate_docs_manifest.py` after adding or removing Markdown files.
