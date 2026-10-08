# Scheduled agent export

A one-shot Java 17 batch application that fetches agent pages and saves a JSON snapshot. Schedule the command with cron, a container scheduler, or your platform's job runner.

## Configure and run

To build against the SDK in this checkout, publish its modules locally as described in [`templates/README.md`](../README.md#java-application-templates).

Set `FRONTAL_API_KEY`, then run from this directory:

```bash
mvn --batch-mode --no-transfer-progress compile exec:java
```

The export is written to the current directory. Pass `-Dexec.args="path/to/export.json"` to choose a specific output path. The program writes a temporary file beside the destination and renames it into place after serialization, so readers do not see a partial snapshot. Schedule non-overlapping runs when using a fixed output path.

API and file errors are logged to standard error and return a nonzero process status, so a scheduler can detect failures. Store snapshots in an access-controlled location and define a retention policy for exported data.
