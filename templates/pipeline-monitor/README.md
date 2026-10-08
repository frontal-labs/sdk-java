# Pipeline run monitor

A Java 17 event consumer that connects to a pipeline run stream and prints each received line. Use it for a terminal monitor or as the basis for forwarding events to a log or metrics system.

## Configure and run

From the repository root, install the unpublished SDK snapshot:

```bash
mvn --batch-mode --no-transfer-progress install
```

Set `FRONTAL_API_KEY`, then run with a pipeline run ID:

```bash
cd templates/pipeline-monitor
mvn exec:java -Dexec.args="your-pipeline-run-id"
```

The stream remains open until the server closes it or the process is interrupted. The application closes the SDK stream when it exits and retries up to three times after transport I/O failures. Set `FRONTAL_STREAM_MAX_RETRIES` to an integer from 0 to 10 to change the retry limit. Reconnecting may replay events, so downstream consumers should be idempotent or deduplicate by the event identifier provided in the stream.

Use a least-privilege API key and route event output to an access-controlled logging or processing system. API errors are logged to standard error and return a nonzero process status.
