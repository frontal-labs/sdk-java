# Branch protection baseline

Protect `main`. Require pull requests, at least one review, resolved review conversations, and the `CI` and `CodeQL` checks. Block force pushes and branch deletion. Keep release tags protected. Restrict the `maven-central` environment to `main`, require a deployment reviewer, and store publishing credentials only as environment secrets.
