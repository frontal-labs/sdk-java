# Java SDK route coverage

_Status: generated route catalog and named operation surface complete. Typed models are provided only where committed schemas are usable._

| Metric | Value |
| --- | ---: |
| Contract endpoint entries | 619 |
| Generated endpoint constants | 608 |
| Named operation methods for supported routes | 608 |
| Contract routes omitted from the SDK surface | 11 |
| Operation-specific payload schemas usable | Limited by committed contract snapshots |

`scripts/generate_endpoints.py` regenerates `services/src/main/java/dev/frontal/sdk/resources/Endpoints.java` from `contracts/sdk-endpoints.json`, grouping agent-run operations with agents. SDK routes use the shared Java transport; callers provide response types when decoding JSON.
