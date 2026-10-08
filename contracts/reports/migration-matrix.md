# Java SDK route coverage

_Status: generated route catalog complete. This measures catalog coverage and generic transport availability, not route-specific typed models._

| Metric | Value |
| --- | ---: |
| Contract endpoint entries | 370 |
| Generated endpoint constants | 370 |
| Catalog coverage | 100% |
| Route-specific typed request/response models | Not generated |

`scripts/generate_endpoints.py` regenerates `src/main/java/dev/frontal/sdk/resources/Endpoints.java` from `contracts/sdk-endpoints.json`. All catalogued routes use the shared Java transport; callers provide response types when decoding JSON.
