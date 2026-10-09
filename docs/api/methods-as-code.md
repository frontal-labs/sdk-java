# Canonical Java calls

Generated from the contract route catalog. Query parameters are optional; use `QueryParams` when required by the endpoint.

## agents

```java
client.agents().delete(agentId, responseType);
client.agents().list(responseType);
client.agents().health(responseType);
client.agents().get(agentId, responseType);
client.agents().create(body, responseType);
client.agents().rollback(agentId, body, responseType);
client.agents().update(agentId, body, responseType);
client.agents().runs().getByActionRunId(actionRunId, responseType);
client.agents().runs().get(runId, responseType);
client.agents().runs().conversation(runId, responseType);
client.agents().runs().list(agentId, responseType);
client.agents().runs().create(agentId, body, responseType);
client.agents().runs().stream(runId);
client.agents().runs().streamBlocking(runId);
client.agents().versions().list(agentId, responseType);
```

## ai

```java
client.ai().health(responseType);
client.ai().internal().embed(body, responseType);
client.ai().internal().predict(body, responseType);
client.ai().internal().rerank(body, responseType);
client.ai().internal().predictForm(fields, files, responseType);
client.ai().internal().predictRaw(body, responseType);
client.ai().chat().completions().create(body, responseType);
client.ai().internal().models().list(responseType);
client.ai().internal().models().defaults(responseType);
```

## audit

```java
client.audit().events().list(responseType);
client.audit().events().get(eventId, responseType);
client.audit().events().create(body, responseType);
client.audit().events().batch(body, responseType);
```

## auth

```java
client.auth().getUser(responseType);
client.auth().createAuthorize(body, responseType);
client.auth().createInvite(body, responseType);
client.auth().login(body, responseType);
client.auth().logout(body, responseType);
client.auth().createOtp(body, responseType);
client.auth().createReauthenticate(body, responseType);
client.auth().createRecover(body, responseType);
client.auth().createResend(body, responseType);
client.auth().createSignup(body, responseType);
client.auth().createSso(body, responseType);
client.auth().createTokenGrantTypeIdToken(body, responseType);
client.auth().createTokenGrantTypePassword(body, responseType);
client.auth().createTokenGrantTypePkce(body, responseType);
client.auth().createTokenGrantTypeRefreshToken(body, responseType);
client.auth().verify(body, responseType);
client.auth().updateUser(body, responseType);
client.auth().account().deleteProfile(responseType);
client.auth().account().getAuditLog(responseType);
client.auth().account().getMfa(responseType);
client.auth().account().getProfile(responseType);
client.auth().account().createMfa(body, responseType);
client.auth().account().createPassword(body, responseType);
client.auth().account().updateProfile(body, responseType);
client.auth().admin().createGenerateLink(body, responseType);
client.auth().admin().logout(body, responseType);
client.auth().auth().getSession(responseType);
client.auth().auth().createSession(body, responseType);
client.auth().factors().delete(factorId, responseType);
client.auth().factors().list(responseType);
client.auth().factors().create(body, responseType);
client.auth().factors().createChallenge(factorId, body, responseType);
client.auth().factors().verify(factorId, body, responseType);
client.auth().mfa().status(responseType);
client.auth().mfa().disable(body, responseType);
client.auth().mfa().enable(body, responseType);
client.auth().mfa().setup(body, responseType);
client.auth().mfa().verify(body, responseType);
client.auth().account().mfa().delete(mfaId, responseType);
client.auth().account().mfa().get(mfaId, responseType);
client.auth().account().mfa().createChallenge(mfaId, body, responseType);
client.auth().account().mfa().verify(mfaId, body, responseType);
client.auth().account().sessions().delete(sessionId, responseType);
client.auth().account().sessions().list(responseType);
client.auth().account().sessions().extend(sessionId, body, responseType);
client.auth().admin().users().delete(userId, responseType);
client.auth().admin().users().list(responseType);
client.auth().admin().users().get(userId, responseType);
client.auth().admin().users().create(body, responseType);
client.auth().admin().users().update(userId, body, responseType);
client.auth().mfa().backupCodes().createRegenerate(body, responseType);
client.auth().user().identities().delete(identityId, responseType);
client.auth().user().identities().list(responseType);
client.auth().user().identities().create(body, responseType);
client.auth().account().security().apiKeys().delete(apiKeyId, responseType);
client.auth().account().security().apiKeys().list(responseType);
client.auth().account().security().apiKeys().get(apiKeyId, responseType);
client.auth().account().security().apiKeys().create(body, responseType);
client.auth().account().security().apiKeys().update(apiKeyId, body, responseType);
client.auth().account().security().devices().delete(deviceId, responseType);
client.auth().account().security().devices().list(responseType);
client.auth().account().security().devices().get(deviceId, responseType);
client.auth().account().security().devices().create(body, responseType);
client.auth().account().security().devices().trust(deviceId, body, responseType);
client.auth().admin().users().factors().delete(userId, factorId, responseType);
client.auth().admin().users().factors().list(userId, responseType);
```

## billing

```java
client.billing().customers().usage(customerId, responseType);
client.billing().invoices().getPdf(invoiceId, responseType);
client.billing().invoices().preview(body, responseType);
client.billing().invoices().finalize(invoiceId, body, responseType);
client.billing().invoices().resourceVoid(invoiceId, body, responseType);
client.billing().meters().disable(meterId, body, responseType);
client.billing().plans().clone(planId, body, responseType);
client.billing().subscriptions().activate(subscriptionId, body, responseType);
client.billing().subscriptions().cancel(subscriptionId, body, responseType);
client.billing().subscriptions().pause(subscriptionId, body, responseType);
client.billing().subscriptions().resume(subscriptionId, body, responseType);
client.billing().wallets().createTerminate(walletId, body, responseType);
client.billing().wallets().topUp(walletId, body, responseType);
client.billing().addons().entitlements().list(addonId, responseType);
client.billing().customers().entitlements().list(customerId, responseType);
client.billing().customers().invoices().summary(customerId, responseType);
client.billing().customers().portal().get(portalId, responseType);
client.billing().customers().wallets().list(customerId, responseType);
client.billing().plans().entitlements().list(planId, responseType);
client.billing().prices().lookup().get(lookupId, responseType);
client.billing().subscriptions().entitlements().list(subscriptionId, responseType);
client.billing().wallets().balance().getRealTime(walletId, responseType);
client.billing().wallets().transactions().list(walletId, responseType);
```

## blob

```java
client.blob().object().delete(objectId, objectId2, responseType);
client.blob().object().get(objectId, objectId2, responseType);
client.blob().object().copy(body, responseType);
client.blob().object().move(body, responseType);
client.blob().object().get2(objectId, objectId2, fields, files, responseType);
client.blob().object().info().get(infoId, infoId2, responseType);
client.blob().object().list().get(listId, body, responseType);
client.blob().object().sign().get(signId, signId2, body, responseType);
```

## connection-tests

```java
client.connectionTests().get(connectionTestId, responseType);
```

## connectors

```java
client.connectors().getCatalog(responseType);
client.connectors().catalog().get(catalogId, responseType);
client.connectors().connectionTests().get(connectionTestId, responseType);
client.connectors().diagnostics().list(responseType);
client.connectors().installations().delete(installationId, responseType);
client.connectors().installations().list(responseType);
client.connectors().installations().get(installationId, responseType);
client.connectors().installations().update(installationId, body, responseType);
client.connectors().installations().create(body, responseType);
client.connectors().installations().pause(installationId, body, responseType);
client.connectors().installations().resume(installationId, body, responseType);
client.connectors().syncRuns().replay(syncRunId, body, responseType);
```

## data

```java
client.data().aggregations().health(responseType);
client.data().aggregations().getInfo(responseType);
client.data().archival().health(responseType);
client.data().archival().getInfo(responseType);
client.data().catalog().health(responseType);
client.data().catalog().getInfo(responseType);
client.data().enrichment().health(responseType);
client.data().enrichment().getInfo(responseType);
client.data().exports().health(responseType);
client.data().exports().getInfo(responseType);
client.data().ingest().health(responseType);
client.data().ingest().getInfo(responseType);
client.data().normalization().health(responseType);
client.data().normalization().getInfo(responseType);
client.data().pipelines().health(responseType);
client.data().pipelines().getInfo(responseType);
client.data().quality().health(responseType);
client.data().quality().getInfo(responseType);
client.data().query().health(responseType);
client.data().query().getInfo(responseType);
client.data().schemas().health(responseType);
client.data().schemas().getInfo(responseType);
client.data().serving().health(responseType);
client.data().serving().getInfo(responseType);
client.data().streams().health(responseType);
client.data().streams().getInfo(responseType);
client.data().sync().health(responseType);
client.data().sync().getInfo(responseType);
client.data().transformations().health(responseType);
client.data().transformations().getInfo(responseType);
client.data().aggregations().aggregations().list(responseType);
client.data().aggregations().aggregations().get(aggregationId, responseType);
client.data().aggregations().aggregations().create(body, responseType);
client.data().aggregations().capabilities().list(responseType);
client.data().aggregations().runs().list(responseType);
client.data().aggregations().runs().get(runId, responseType);
client.data().aggregations().runs().create(body, responseType);
client.data().archival().capabilities().list(responseType);
client.data().archival().runs().list(responseType);
client.data().archival().runs().get(runId, responseType);
client.data().archival().runs().create(body, responseType);
client.data().catalog().capabilities().list(responseType);
client.data().catalog().runs().list(responseType);
client.data().catalog().runs().get(runId, responseType);
client.data().catalog().runs().create(body, responseType);
client.data().enrichment().capabilities().list(responseType);
client.data().enrichment().runs().list(responseType);
client.data().enrichment().runs().get(runId, responseType);
client.data().enrichment().runs().create(body, responseType);
client.data().exports().capabilities().list(responseType);
client.data().exports().exports().list(responseType);
client.data().exports().exports().get(exportId, responseType);
client.data().exports().exports().create(body, responseType);
client.data().exports().runs().list(responseType);
client.data().exports().runs().get(runId, responseType);
client.data().exports().runs().create(body, responseType);
client.data().ingest().capabilities().list(responseType);
client.data().ingest().datasets().list(responseType);
client.data().ingest().datasets().get(datasetId, responseType);
client.data().ingest().datasets().ingest(body, responseType);
client.data().ingest().runs().list(responseType);
client.data().ingest().runs().get(runId, responseType);
client.data().ingest().runs().create(body, responseType);
client.data().ingest().schemas().list(responseType);
client.data().ingest().schemas().get(schemaRef, responseType);
client.data().normalization().capabilities().list(responseType);
client.data().normalization().runs().list(responseType);
client.data().normalization().runs().get(runId, responseType);
client.data().normalization().runs().create(body, responseType);
client.data().pipelines().capabilities().list(responseType);
client.data().pipelines().pipelineRuns().list(responseType);
client.data().pipelines().pipelineRuns().get(runId, responseType);
client.data().pipelines().pipelines().list(responseType);
client.data().pipelines().pipelines().get(definitionId, responseType);
client.data().pipelines().pipelines().create(body, responseType);
client.data().pipelines().runs().list(responseType);
client.data().pipelines().runs().get(runId, responseType);
client.data().pipelines().runs().create(body, responseType);
client.data().quality().capabilities().list(responseType);
client.data().quality().runs().list(responseType);
client.data().quality().runs().get(runId, responseType);
client.data().quality().runs().create(body, responseType);
client.data().query().capabilities().list(responseType);
client.data().query().query().federated(body, responseType);
client.data().query().runs().list(responseType);
client.data().query().runs().get(runId, responseType);
client.data().query().runs().create(body, responseType);
client.data().schemas().capabilities().list(responseType);
client.data().schemas().runs().list(responseType);
client.data().schemas().runs().get(runId, responseType);
client.data().schemas().runs().create(body, responseType);
client.data().schemas().schemas().list(responseType);
client.data().schemas().schemas().get(schemaRef, responseType);
client.data().schemas().schemas().create(body, responseType);
client.data().schemas().schemas().resolve(body, responseType);
client.data().serving().capabilities().list(responseType);
client.data().serving().runs().list(responseType);
client.data().serving().runs().get(runId, responseType);
client.data().serving().runs().create(body, responseType);
client.data().streams().capabilities().list(responseType);
client.data().streams().runs().list(responseType);
client.data().streams().runs().get(runId, responseType);
client.data().streams().runs().create(body, responseType);
client.data().streams().streams().list(responseType);
client.data().streams().streams().get(streamId, responseType);
client.data().streams().streams().create(body, responseType);
client.data().sync().capabilities().list(responseType);
client.data().sync().runs().list(responseType);
client.data().sync().runs().get(runId, responseType);
client.data().sync().runs().create(body, responseType);
client.data().transformations().capabilities().list(responseType);
client.data().transformations().runs().list(responseType);
client.data().transformations().runs().get(runId, responseType);
client.data().transformations().runs().create(body, responseType);
client.data().transformations().transformations().list(responseType);
client.data().transformations().transformations().get(transformationId, responseType);
client.data().transformations().transformations().create(body, responseType);
client.data().aggregations().aggregations().executions().create(aggregationId, body, responseType);
client.data().archival().archival().policies().list(responseType);
client.data().archival().archival().policies().get(policyId, responseType);
client.data().archival().archival().policies().create(body, responseType);
client.data().catalog().catalog().datasets().list(responseType);
client.data().catalog().catalog().datasets().get(datasetId, responseType);
client.data().catalog().catalog().sources().list(responseType);
client.data().catalog().catalog().sources().get(sourceId, responseType);
client.data().enrichment().enrichment().profiles().list(responseType);
client.data().enrichment().enrichment().profiles().get(profileId, responseType);
client.data().enrichment().enrichment().profiles().create(body, responseType);
client.data().exports().exports().executions().create(exportId, body, responseType);
client.data().ingest().datasets().artifacts().getContent(datasetId, manifestId, responseType);
client.data().normalization().normalization().profiles().list(responseType);
client.data().normalization().normalization().profiles().get(profileId, responseType);
client.data().normalization().normalization().profiles().create(body, responseType);
client.data().quality().quality().rulesets().list(responseType);
client.data().quality().quality().rulesets().get(rulesetId, responseType);
client.data().quality().quality().rulesets().create(body, responseType);
client.data().serving().serving().products().list(responseType);
client.data().serving().serving().products().get(productId, responseType);
client.data().serving().serving().products().create(body, responseType);
client.data().streams().streams().deliveries().create(streamId, body, responseType);
client.data().sync().sync().jobs().list(responseType);
client.data().sync().sync().jobs().get(jobId, responseType);
client.data().sync().sync().jobs().create(body, responseType);
client.data().transformations().transformations().executions().create(transformationId, body, responseType);
client.data().archival().archival().policies().executions().create(policyId, body, responseType);
client.data().catalog().catalog().datasets().artifacts().getContent(datasetId, manifestId, responseType);
client.data().enrichment().enrichment().profiles().executions().create(profileId, body, responseType);
client.data().normalization().normalization().profiles().executions().create(profileId, body, responseType);
client.data().quality().quality().rulesets().evaluations().create(rulesetId, body, responseType);
client.data().serving().serving().products().refreshes().create(productId, body, responseType);
client.data().sync().sync().jobs().executions().create(jobId, body, responseType);
```

## events

```java
client.events().list(responseType);
client.events().getMonitoring(responseType);
client.events().get(id, responseType);
client.events().create(body, responseType);
client.events().analytics(body, responseType);
client.events().createAnalyticsV2(body, responseType);
client.events().bulk(body, responseType);
client.events().createHuggingfaceBilling(body, responseType);
client.events().query(body, responseType);
client.events().reprocess(body, responseType);
client.events().usage(body, responseType);
client.events().benchmark().createV1(body, responseType);
client.events().benchmark().createV2(body, responseType);
client.events().reprocess().createInternal(body, responseType);
client.events().usage().createMeter(body, responseType);
client.events().raw().reprocess().createAll(body, responseType);
client.events().raw().reprocess().createPending(body, responseType);
```

## governance

```java
client.governance().access().check(body, responseType);
client.governance().compliance().getScore(responseType);
client.governance().permissions().list(responseType);
client.governance().permissions().get(permissionId, responseType);
client.governance().permissions().create(body, responseType);
client.governance().policies().delete(policyId, responseType);
client.governance().policies().list(responseType);
client.governance().policies().get(policyId, responseType);
client.governance().policies().create(body, responseType);
client.governance().policies().createFromTemplate(body, responseType);
client.governance().policies().validate(body, responseType);
client.governance().policies().update(policyId, body, responseType);
client.governance().roles().delete(roleId, responseType);
client.governance().roles().list(responseType);
client.governance().roles().get(roleId, responseType);
client.governance().roles().create(body, responseType);
client.governance().compliance().assessments().list(responseType);
client.governance().compliance().assessments().get(assessmentId, responseType);
client.governance().compliance().assessments().create(body, responseType);
client.governance().compliance().frameworks().list(responseType);
client.governance().compliance().violations().list(responseType);
client.governance().compliance().violations().resolve(violationId, body, responseType);
client.governance().policies().templates().list(responseType);
client.governance().policies().versions().list(policyId, responseType);
```

## invocations

```java
client.invocations().create(body, responseType);
```

## lineage

```java
client.lineage().getGraph(responseType);
client.lineage().createImpact(body, responseType);
client.lineage().edges().list(responseType);
client.lineage().edges().get(edgeId, responseType);
client.lineage().nodes().list(responseType);
client.lineage().nodes().get(nodeId, responseType);
client.lineage().nodes().getTrace(nodeId, responseType);
```

## observability

```java
client.observability().alerts().delete(alertId, responseType);
client.observability().alerts().list(responseType);
client.observability().alerts().create(body, responseType);
client.observability().alerts().disable(alertId, body, responseType);
client.observability().alerts().enable(alertId, body, responseType);
client.observability().alerts().update(alertId, body, responseType);
client.observability().dashboards().delete(dashboardId, responseType);
client.observability().dashboards().list(responseType);
client.observability().dashboards().get(dashboardId, responseType);
client.observability().dashboards().create(body, responseType);
client.observability().dashboards().share(dashboardId, body, responseType);
client.observability().dashboards().update(dashboardId, body, responseType);
client.observability().events().create(body, responseType);
client.observability().events().batch(body, responseType);
client.observability().logs().ingest(body, responseType);
client.observability().logs().query(body, responseType);
client.observability().logs().stream();
client.observability().logs().streamBlocking();
client.observability().metrics().list(responseType);
client.observability().metrics().getList(responseType);
client.observability().metrics().ingest(body, responseType);
client.observability().traces().list(responseType);
client.observability().traces().get(traceId, responseType);
client.observability().traces().query(body, responseType);
client.observability().alerts().incidents().list(responseType);
client.observability().alerts().rules().delete(ruleId, responseType);
client.observability().alerts().rules().list(responseType);
client.observability().alerts().rules().get(ruleId, responseType);
client.observability().alerts().rules().create(body, responseType);
client.observability().alerts().rules().toggle(ruleId, body, responseType);
client.observability().alerts().rules().update(ruleId, body, responseType);
client.observability().events().stats().list(responseType);
```

## ontology

```java
client.ontology().engine().health(responseType);
client.ontology().engine().getInfo(responseType);
client.ontology().events().health(responseType);
client.ontology().events().getInfo(responseType);
client.ontology().extract().health(responseType);
client.ontology().extract().getInfo(responseType);
client.ontology().graph().health(responseType);
client.ontology().graph().getInfo(responseType);
client.ontology().objects().health(responseType);
client.ontology().objects().getInfo(responseType);
client.ontology().reasoning().health(responseType);
client.ontology().reasoning().getInfo(responseType);
client.ontology().reasoning().createExplain(body, responseType);
client.ontology().relationships().health(responseType);
client.ontology().relationships().getInfo(responseType);
client.ontology().rollouts().health(responseType);
client.ontology().rollouts().getInfo(responseType);
client.ontology().rollups().health(responseType);
client.ontology().rollups().getInfo(responseType);
client.ontology().schemas().health(responseType);
client.ontology().schemas().getInfo(responseType);
client.ontology().transformations().health(responseType);
client.ontology().transformations().getInfo(responseType);
client.ontology().validation().health(responseType);
client.ontology().validation().getInfo(responseType);
client.ontology().versions().health(responseType);
client.ontology().versions().getInfo(responseType);
client.ontology().engine().capabilities().list(responseType);
client.ontology().engine().ontologies().export(body, responseType);
client.ontology().engine().ontologies().createExportShacl(body, responseType);
client.ontology().engine().ontologies().generate(body, responseType);
client.ontology().engine().ontologies().validate(body, responseType);
client.ontology().engine().runs().list(responseType);
client.ontology().engine().runs().get(runId, responseType);
client.ontology().engine().runs().create(body, responseType);
client.ontology().events().capabilities().list(responseType);
client.ontology().events().events().list(responseType);
client.ontology().events().events().get(eventId, responseType);
client.ontology().events().events().create(body, responseType);
client.ontology().events().runs().list(responseType);
client.ontology().events().runs().get(runId, responseType);
client.ontology().events().runs().create(body, responseType);
client.ontology().extract().capabilities().list(responseType);
client.ontology().extract().extract().analyze(body, responseType);
client.ontology().extract().extract().createArchitecture(body, responseType);
client.ontology().extract().runs().list(responseType);
client.ontology().extract().runs().get(runId, responseType);
client.ontology().extract().runs().create(body, responseType);
client.ontology().graph().capabilities().list(responseType);
client.ontology().graph().entities().get(entityId, responseType);
client.ontology().graph().entities().getProvenance(entityId, responseType);
client.ontology().graph().entities().update(entityId, body, responseType);
client.ontology().graph().graph().analyze(body, responseType);
client.ontology().graph().graph().createBuild(body, responseType);
client.ontology().graph().graph().createBulkRead(body, responseType);
client.ontology().graph().graph().createNeighborhood(body, responseType);
client.ontology().graph().graph().createPath(body, responseType);
client.ontology().graph().graph().query(body, responseType);
client.ontology().graph().relationships().get(relationshipId, responseType);
client.ontology().graph().relationships().update(relationshipId, body, responseType);
client.ontology().graph().runs().list(responseType);
client.ontology().graph().runs().get(runId, responseType);
client.ontology().graph().runs().create(body, responseType);
client.ontology().objects().capabilities().list(responseType);
client.ontology().objects().objectTypes().delete(objectTypeId, responseType);
client.ontology().objects().objectTypes().list(responseType);
client.ontology().objects().objectTypes().get(objectTypeId, responseType);
client.ontology().objects().objectTypes().update(objectTypeId, body, responseType);
client.ontology().objects().objects().delete(objectId, responseType);
client.ontology().objects().objects().list(responseType);
client.ontology().objects().objects().get(objectId, responseType);
client.ontology().objects().objects().update(objectId, body, responseType);
client.ontology().objects().runs().list(responseType);
client.ontology().objects().runs().get(runId, responseType);
client.ontology().objects().runs().create(body, responseType);
client.ontology().reasoning().capabilities().list(responseType);
client.ontology().reasoning().facts().create(body, responseType);
client.ontology().reasoning().facts().createLoadGraph(body, responseType);
client.ontology().reasoning().reason().createBackward(body, responseType);
client.ontology().reasoning().reason().createForward(body, responseType);
client.ontology().reasoning().rules().delete(ruleId, responseType);
client.ontology().reasoning().rules().list(responseType);
client.ontology().reasoning().rules().create(body, responseType);
client.ontology().reasoning().rules().update(ruleId, body, responseType);
client.ontology().reasoning().runs().list(responseType);
client.ontology().reasoning().runs().get(runId, responseType);
client.ontology().reasoning().runs().create(body, responseType);
client.ontology().relationships().capabilities().list(responseType);
client.ontology().relationships().relationshipTypes().delete(relationshipTypeId, responseType);
client.ontology().relationships().relationshipTypes().list(responseType);
client.ontology().relationships().relationships().delete(relationshipId, responseType);
client.ontology().relationships().relationships().list(responseType);
client.ontology().relationships().relationships().get(relationshipId, responseType);
client.ontology().relationships().relationships().update(relationshipId, body, responseType);
client.ontology().relationships().runs().list(responseType);
client.ontology().relationships().runs().get(runId, responseType);
client.ontology().relationships().runs().create(body, responseType);
client.ontology().rollouts().capabilities().list(responseType);
client.ontology().rollouts().rollouts().delete(rolloutId, responseType);
client.ontology().rollouts().rollouts().list(responseType);
client.ontology().rollouts().rollouts().get(rolloutId, responseType);
client.ontology().rollouts().rollouts().status(rolloutId, responseType);
client.ontology().rollouts().rollouts().create(body, responseType);
client.ontology().rollouts().rollouts().pause(rolloutId, body, responseType);
client.ontology().rollouts().rollouts().resume(rolloutId, body, responseType);
client.ontology().rollouts().rollouts().rollback(rolloutId, body, responseType);
client.ontology().rollouts().rollouts().createStart(rolloutId, body, responseType);
client.ontology().rollouts().rollouts().update(rolloutId, body, responseType);
client.ontology().rollouts().runs().list(responseType);
client.ontology().rollouts().runs().get(runId, responseType);
client.ontology().rollouts().runs().create(body, responseType);
client.ontology().rollups().capabilities().list(responseType);
client.ontology().rollups().rollupResults().get(executionId, responseType);
client.ontology().rollups().rollups().delete(rollupId, responseType);
client.ontology().rollups().rollups().list(responseType);
client.ontology().rollups().rollups().get(rollupId, responseType);
client.ontology().rollups().rollups().getResult(rollupId, responseType);
client.ontology().rollups().rollups().create(body, responseType);
client.ontology().rollups().rollups().execute(rollupId, body, responseType);
client.ontology().rollups().rollups().preview(rollupId, body, responseType);
client.ontology().rollups().rollups().update(rollupId, body, responseType);
client.ontology().rollups().runs().list(responseType);
client.ontology().rollups().runs().get(runId, responseType);
client.ontology().rollups().runs().create(body, responseType);
client.ontology().schemas().capabilities().list(responseType);
client.ontology().schemas().runs().list(responseType);
client.ontology().schemas().runs().get(runId, responseType);
client.ontology().schemas().runs().create(body, responseType);
client.ontology().schemas().schemas().delete(schemaId, responseType);
client.ontology().schemas().schemas().list(responseType);
client.ontology().schemas().schemas().get(schemaId, responseType);
client.ontology().schemas().schemas().create(body, responseType);
client.ontology().schemas().schemas().validate(body, responseType);
client.ontology().transformations().capabilities().list(responseType);
client.ontology().transformations().runs().list(responseType);
client.ontology().transformations().runs().get(runId, responseType);
client.ontology().transformations().runs().create(body, responseType);
client.ontology().transformations().transformations().create(body, responseType);
client.ontology().validation().capabilities().list(responseType);
client.ontology().validation().payloads().validate(body, responseType);
client.ontology().validation().rules().delete(ruleId, responseType);
client.ontology().validation().rules().list(responseType);
client.ontology().validation().rules().get(ruleId, responseType);
client.ontology().validation().rules().create(body, responseType);
client.ontology().validation().runs().list(responseType);
client.ontology().validation().runs().get(runId, responseType);
client.ontology().validation().runs().create(body, responseType);
client.ontology().versions().audit().verify(body, responseType);
client.ontology().versions().capabilities().list(responseType);
client.ontology().versions().releaseBundles().list(responseType);
client.ontology().versions().releaseBundles().get(bundleId, responseType);
client.ontology().versions().releaseBundles().create(body, responseType);
client.ontology().versions().runs().list(responseType);
client.ontology().versions().runs().get(runId, responseType);
client.ontology().versions().runs().create(body, responseType);
client.ontology().versions().versions().delete(versionId, responseType);
client.ontology().versions().versions().get(versionId, responseType);
client.ontology().versions().versions().create(body, responseType);
client.ontology().versions().versions().compare(body, responseType);
client.ontology().engine().ontologies().compareVersions().create(body, responseType);
client.ontology().engine().ontologies().inferClasses().create(body, responseType);
client.ontology().engine().ontologies().inferProperties().create(body, responseType);
client.ontology().events().events().checkpoints().get(consumer, responseType);
client.ontology().events().events().checkpoints().create(body, responseType);
client.ontology().events().events().leases().acknowledge(body, responseType);
client.ontology().events().events().leases().acquire(body, responseType);
client.ontology().extract().extract().coreferences().create(body, responseType);
client.ontology().extract().extract().entities().create(body, responseType);
client.ontology().extract().extract().events().create(body, responseType);
client.ontology().extract().extract().relations().create(body, responseType);
client.ontology().extract().extract().triplets().create(body, responseType);
```

## pipelines

```java
client.pipelines().data().pipelines().health(responseType);
client.pipelines().data().pipelines().getInfo(responseType);
client.pipelines().data().pipelines().capabilities().list(responseType);
client.pipelines().data().pipelines().pipelineRuns().list(responseType);
client.pipelines().data().pipelines().pipelineRuns().get(pipelineRunId, responseType);
client.pipelines().data().pipelines().pipelineRuns().get2(pipelineRunId);
client.pipelines().data().pipelines().pipelineRuns().get2Blocking(pipelineRunId);
client.pipelines().data().pipelines().pipelines().list(responseType);
client.pipelines().data().pipelines().pipelines().get(pipelineId, responseType);
client.pipelines().data().pipelines().pipelines().create(body, responseType);
client.pipelines().data().pipelines().runs().list(responseType);
client.pipelines().data().pipelines().runs().create(body, responseType);
```

## providers

```java
client.providers().get(providerSlug, responseType);
```

## react

```java
```

## sandbox

```java
client.sandbox().createSelfTest(body, responseType);
client.sandbox().submit(body, responseType);
client.sandbox().languages().list(responseType);
```

## schedules

```java
client.schedules().workflows().cron().parse(body, responseType);
client.schedules().workflows().cron().validate(body, responseType);
client.schedules().workflows().schedules().delete(scheduleId, responseType);
client.schedules().workflows().schedules().list(responseType);
client.schedules().workflows().schedules().get(scheduleId, responseType);
client.schedules().workflows().schedules().update(scheduleId, body, responseType);
client.schedules().workflows().schedules().create(body, responseType);
client.schedules().workflows().schedules().pause(scheduleId, body, responseType);
client.schedules().workflows().schedules().resume(scheduleId, body, responseType);
client.schedules().workflows().schedules().trigger(scheduleId, body, responseType);
```

## webhook-endpoints

```java
client.webhookEndpoints().delete(id, responseType);
client.webhookEndpoints().list(responseType);
client.webhookEndpoints().get(id, responseType);
client.webhookEndpoints().update(id, body, responseType);
client.webhookEndpoints().create(body, responseType);
client.webhookEndpoints().rotateSecret(id, body, responseType);
client.webhookEndpoints().deliveries().list(id, responseType);
```

## webhooks

```java
client.webhooks().delete(webhookId, responseType);
client.webhooks().list(responseType);
client.webhooks().get(webhookId, responseType);
client.webhooks().create(body, responseType);
client.webhooks().rotateSecret(webhookId, body, responseType);
client.webhooks().update(webhookId, body, responseType);
client.webhooks().deliveries().list(responseType);
client.webhooks().deliveries().get(deliveryId, responseType);
client.webhooks().deliveries().retry(deliveryId, body, responseType);
client.webhooks().stats().list(responseType);
```

## workflows

```java
client.workflows().delete(workflowId, responseType);
client.workflows().list(responseType);
client.workflows().get(workflowId, responseType);
client.workflows().get2(workflowId, runId, responseType);
client.workflows().summary(workflowId, runId, responseType);
client.workflows().timeline(workflowId, runId, responseType);
client.workflows().update(workflowId, body, responseType);
client.workflows().create(body, responseType);
client.workflows().batch(body, responseType);
client.workflows().search(body, responseType);
client.workflows().archive(workflowId, body, responseType);
client.workflows().publish(workflowId, body, responseType);
client.workflows().restore(workflowId, body, responseType);
client.workflows().approvals().list(responseType);
client.workflows().approvals().get(approvalId, responseType);
client.workflows().approvals().approve(approvalId, body, responseType);
client.workflows().approvals().reject(approvalId, body, responseType);
client.workflows().executions().list(responseType);
client.workflows().executions().get(executionId, responseType);
client.workflows().executions().create(body, responseType);
client.workflows().tasks().get(taskId, responseType);
client.workflows().tasks().cancel(taskId, body, responseType);
client.workflows().tasks().retry(taskId, body, responseType);
client.workflows().templates().list(responseType);
client.workflows().templates().get(templateId, responseType);
client.workflows().templates().create(body, responseType);
client.workflows().templates().instantiate(templateId, body, responseType);
client.workflows().versions().create(workflowId, body, responseType);
client.workflows().executions().tasks().list(executionId, responseType);
client.workflows().runs().steps().list(runId, responseType);
```
