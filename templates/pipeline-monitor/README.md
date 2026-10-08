# Pipeline run monitor

A Java 17 event consumer that connects to a pipeline run stream and prints each event payload. Use it for a terminal monitor or as a starting point for forwarding events to a log or metrics system.

## Configure and run

To build against the SDK in this checkout, publish its modules locally as described in [`templates/README.md`](../README.md#java-application-templates).

Set `FRONTAL_API_KEY`, then run from this directory with a pipeline run ID:

```bash
mvn --batch-mode --no-transfer-progress compile exec:java -Dexec.args="run_123"
```

The stream remains open until the server closes it or the process is interrupted. The application closes the SDK stream when it exits and retries retryable failures up to three times. Set `FRONTAL_STREAM_MAX_RETRIES` to an integer from 0 to 10 to change the retry limit. Reconnecting may replay events, so downstream consumers should be idempotent or deduplicate events when the stream provides an identifier.

Use a least-privilege API key and route event output to an access-controlled logging or processing system. API errors are logged to standard error and return a nonzero process status.
