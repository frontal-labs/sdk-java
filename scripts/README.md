# Java repository scripts

`check_contracts.py` parses the committed API snapshot JSON. `generate_docs_manifest.py` indexes Markdown documentation and writes `docs/mcp.json` plus the root `mcp.json`. `generate_endpoints.py` writes the SDK route constants to `src/main/java/dev/frontal/sdk/resources/Endpoints.java` and refreshes the route coverage reports from the checked-in inventory. These are repository maintenance utilities written in Python 3's standard library; they do not affect the Java runtime or package dependencies.

Run them directly:

```bash
python3 scripts/check_contracts.py
python3 scripts/generate_docs_manifest.py
python3 scripts/generate_endpoints.py
```
