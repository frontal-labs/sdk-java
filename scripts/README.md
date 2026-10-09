# Java repository scripts

`sync_endpoint_inventory.py` adds operations from the committed public OpenAPI snapshot to `contracts/sdk-endpoints.json`. `generate_endpoints.py` writes route constants, nested resource clients with concise operation names, per-service API references, and route coverage reports. Run Spotless after generation so generated Java matches repository formatting. `check_contracts.py` verifies the inventory, generated API references, Java constants, and named methods, then confirms every public and AI OpenAPI operation maps to an endpoint. `generate_docs_manifest.py` indexes Markdown documentation and writes `docs/mcp.json` plus the root `mcp.json`. The Python utilities use the standard library and do not affect the Java runtime or package dependencies.

Run them directly:

```bash
python3 scripts/sync_endpoint_inventory.py
python3 scripts/generate_endpoints.py
./gradlew spotlessApply
python3 scripts/check_contracts.py
python3 scripts/generate_docs_manifest.py
```
