# Java API contracts

The JSON and OpenAPI files here are shared Frontal API inputs for the Java client. `sdk-endpoints.json` lists service operations and `coverage-floor.json` holds the project's coverage baseline. Do not edit generated snapshots by hand.

`reports/conformance.json` and `reports/migration-matrix.md` describe this Java repository only. The generated `Endpoints` catalog contains all 370 route entries in `sdk-endpoints.json`, and the shared transport supports JSON, raw bytes, multipart requests, and streams. Operation-specific typed request and response models are not generated because the inventory does not include complete schemas.
