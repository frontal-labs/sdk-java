# Workflow approval CLI

A Java 17 Maven command-line tool for reviewing workflow approvals and approving one by ID. It requires an explicit confirmation before it changes state and never logs the API key.

## Configure and run

To build against the SDK in this checkout, publish its modules locally as described in [`templates/README.md`](../README.md#java-application-templates).

Set `FRONTAL_API_KEY`, then run from this directory:

```bash
mvn --batch-mode --no-transfer-progress compile exec:java
```

The CLI prints the current approval queue, prompts for an approval ID, and requires the exact confirmation `approve <id>` before sending the approval request. Press Enter at the ID prompt to exit without approving anything. API errors are logged to standard error and return a nonzero process status.

Run this tool only in an operator-controlled terminal. Use a least-privilege API key and avoid capturing approval payloads in shared terminal logs, since the queue may contain sensitive business data.
