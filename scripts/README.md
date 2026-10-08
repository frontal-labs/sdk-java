# Java repository scripts

`sync_endpoint_inventory.py` adds operations from the committed public OpenAPI snapshot to `contracts/sdk-endpoints.json`. `generate_endpoints.py` writes the route constants to `services/src/main/java/dev/frontal/sdk/resources/Endpoints.java` and refreshes route coverage reports. `check_contracts.py` verifies the inventory against Java constants and confirms every public and AI OpenAPI operation maps to an endpoint. `generate_docs_manifest.py` indexes Markdown documentation and writes `docs/mcp.json` plus the root `mcp.json`. These utilities use Python 3's standard library and do not affect the Java runtime or package dependencies.

Run them directly:

```bash
python3 scripts/sync_endpoint_inventory.py
python3 scripts/generate_endpoints.py
python3 scripts/check_contracts.py
python3 scripts/generate_docs_manifest.py
```
