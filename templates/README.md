# Java application templates

Each directory is a standalone Java 17 Maven application that uses `dev.frontal:frontal-sdk:2.0.0`. To build a template against this checkout, publish the SDK modules to your local Maven repository from the repository root:

```bash
./gradlew :core:publishToMavenLocal :services:publishToMavenLocal :sdk:publishToMavenLocal
```

Then enter a template directory and follow its README. Inject `FRONTAL_API_KEY` from your deployment secret store; do not place credentials in source files, shell scripts, or committed environment files. `FRONTAL_API_URL` and `FRONTAL_AI_URL` use the SDK defaults when omitted.

| Template | Setup pattern | SDK features |
| --- | --- | --- |
| [`agent-approval/`](./agent-approval/) | Human-in-the-loop command-line tool | List and explicitly approve workflow requests |
| [`cron-export/`](./cron-export/) | Scheduled batch job | Fetch agents and atomically publish a JSON snapshot |
| [`pipeline-monitor/`](./pipeline-monitor/) | Long-running event consumer | Read and reconnect to a pipeline run event stream |

These projects demonstrate operational patterns and safe defaults. Review each README, set least-privilege API access, and configure deployment-specific logging, monitoring, and retention before production use.
