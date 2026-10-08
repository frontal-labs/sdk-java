# Repository security settings

Configure these settings in the repository UI because GitHub does not apply them from files:

## `main` ruleset

- Require a pull request before merging, with at least one approving review.
- Dismiss stale approvals when new commits are pushed and require approval of the most recent push.
- Require all review conversations to be resolved.
- Require these status checks: `Conventional commits`, `CI / ubuntu-latest / Java 17`, `CI / ubuntu-latest / Java 21`, `CI / macos-latest / Java 17`, `CI / macos-latest / Java 21`, `CI / windows-latest / Java 17`, `CI / windows-latest / Java 21`, `CodeQL / analyze`, and `Dependency review / review`.
- Require linear history; block force pushes and branch deletion.
- Do not allow bypasses except for an explicitly approved emergency administrator group.

## Supply-chain settings

- Under **Settings → Code security and analysis**, enable Dependabot alerts, Dependabot security updates, secret scanning, and push protection. Enable code scanning if available; this repository also uploads CodeQL results through Actions.
- Protect release tags matching `v*` from update and deletion with a tag ruleset.
- Configure the `maven-central` environment to allow deployments from `main` and `v*` release tags, with at least one required reviewer. Store the Central Portal and signing credentials as environment secrets only.
- In **Settings → Actions → General**, choose “Read repository contents and packages permissions” as the default `GITHUB_TOKEN` permission and require actions to be pinned to a full-length commit SHA when available.
