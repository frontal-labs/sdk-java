# Scheduled agent export

A one-shot Java 17 batch application that fetches the agent collection and saves the JSON response as a timestamped file. Schedule the command with cron, a container scheduler, or your platform's job runner.

## Configure and run

From the repository root, install the unpublished SDK snapshot:

```bash
mvn --batch-mode --no-transfer-progress install
```

Set `FRONTAL_API_KEY`, then run:

```bash
cd templates/cron-export
mvn exec:java
```

The export is written to the current directory. Pass `-Dexec.args="path/to/export.json"` to choose a specific output path. The program writes a temporary file beside the destination and renames it into place after serialization, so readers do not see a partially written snapshot. Schedule non-overlapping runs when using a fixed output path.

API and file errors are logged to standard error and return a nonzero process status, so a scheduler can detect failures. Store snapshots in an access-controlled location and define a retention policy for exported data.
