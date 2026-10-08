# Workflow approval CLI

A Java 17 Maven command-line operator tool for reviewing workflow approvals and explicitly approving one by ID. The program requires a confirmation string before making the state-changing request and never logs the API key.

## Configure and run

From the repository root, install the unpublished SDK snapshot:

```bash
mvn --batch-mode --no-transfer-progress install
```

Set `FRONTAL_API_KEY`, then run:

```bash
cd templates/agent-approval
mvn exec:java
```

The CLI prints the current approval queue, prompts for an approval ID, and requires the exact confirmation `approve <id>` before sending the approval request. Press Enter at the ID prompt to exit without approving anything. API errors are logged to standard error and return a nonzero process status.

Run this tool only in an operator-controlled terminal. Use a least-privilege API key and avoid capturing approval payloads in shared terminal logs, since the queue may contain sensitive business data.
