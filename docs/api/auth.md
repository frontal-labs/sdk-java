# Auth API

Service accessor: `frontal.auth()` (`AuthClient`).

Named methods are generated from the committed route catalog. Build query values with `QueryParams` using exact API wire names. Routes without request schemas accept `JsonNode`; select `JsonNode` or a caller-provided model for unmodeled responses.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `deleteAuthAccountMfaParam(...)` | `DELETE` | `/auth/account/mfa/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `deleteAuthAccountMfaParam(...)` | `DELETE` | `/auth/account/mfa/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `deleteAuthAccountProfile(...)` | `DELETE` | `/auth/account/profile` | `query, Class<T> responseType` | `@Nullable T` |
| `deleteAuthAccountProfile(...)` | `DELETE` | `/auth/account/profile` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `deleteAuthAccountSecurityApiKeysParam(...)` | `DELETE` | `/auth/account/security/api-keys/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `deleteAuthAccountSecurityApiKeysParam(...)` | `DELETE` | `/auth/account/security/api-keys/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `deleteAuthAccountSecurityDevicesParam(...)` | `DELETE` | `/auth/account/security/devices/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `deleteAuthAccountSecurityDevicesParam(...)` | `DELETE` | `/auth/account/security/devices/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `deleteAuthAccountSessionsParam(...)` | `DELETE` | `/auth/account/sessions/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `deleteAuthAccountSessionsParam(...)` | `DELETE` | `/auth/account/sessions/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `deleteAuthAdminUsersParam(...)` | `DELETE` | `/auth/admin/users/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `deleteAuthAdminUsersParam(...)` | `DELETE` | `/auth/admin/users/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `deleteAuthAdminUsersParamFactorsParam(...)` | `DELETE` | `/auth/admin/users/{param}/factors/{param}` | `pathParam1, pathParam2, query, Class<T> responseType` | `@Nullable T` |
| `deleteAuthAdminUsersParamFactorsParam(...)` | `DELETE` | `/auth/admin/users/{param}/factors/{param}` | `pathParam1, pathParam2, query, TypeReference<T> responseType` | `@Nullable T` |
| `deleteAuthFactorsParam(...)` | `DELETE` | `/auth/factors/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `deleteAuthFactorsParam(...)` | `DELETE` | `/auth/factors/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `deleteAuthUserIdentitiesParam(...)` | `DELETE` | `/auth/user/identities/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `deleteAuthUserIdentitiesParam(...)` | `DELETE` | `/auth/user/identities/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getAuthAccountAuditLog(...)` | `GET` | `/auth/account/audit-log` | `query, Class<T> responseType` | `@Nullable T` |
| `getAuthAccountAuditLog(...)` | `GET` | `/auth/account/audit-log` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getAuthAccountMfa(...)` | `GET` | `/auth/account/mfa` | `query, Class<T> responseType` | `@Nullable T` |
| `getAuthAccountMfa(...)` | `GET` | `/auth/account/mfa` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getAuthAccountMfaParam(...)` | `GET` | `/auth/account/mfa/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getAuthAccountMfaParam(...)` | `GET` | `/auth/account/mfa/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getAuthAccountProfile(...)` | `GET` | `/auth/account/profile` | `query, Class<T> responseType` | `@Nullable T` |
| `getAuthAccountProfile(...)` | `GET` | `/auth/account/profile` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getAuthAccountSecurityApiKeys(...)` | `GET` | `/auth/account/security/api-keys` | `query, Class<T> responseType` | `@Nullable T` |
| `getAuthAccountSecurityApiKeys(...)` | `GET` | `/auth/account/security/api-keys` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getAuthAccountSecurityApiKeysParam(...)` | `GET` | `/auth/account/security/api-keys/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getAuthAccountSecurityApiKeysParam(...)` | `GET` | `/auth/account/security/api-keys/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getAuthAccountSecurityDevices(...)` | `GET` | `/auth/account/security/devices` | `query, Class<T> responseType` | `@Nullable T` |
| `getAuthAccountSecurityDevices(...)` | `GET` | `/auth/account/security/devices` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getAuthAccountSecurityDevicesParam(...)` | `GET` | `/auth/account/security/devices/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getAuthAccountSecurityDevicesParam(...)` | `GET` | `/auth/account/security/devices/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getAuthAccountSessions(...)` | `GET` | `/auth/account/sessions` | `query, Class<T> responseType` | `@Nullable T` |
| `getAuthAccountSessions(...)` | `GET` | `/auth/account/sessions` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getAuthAdminUsers(...)` | `GET` | `/auth/admin/users` | `query, Class<T> responseType` | `@Nullable T` |
| `getAuthAdminUsers(...)` | `GET` | `/auth/admin/users` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getAuthAdminUsersParam(...)` | `GET` | `/auth/admin/users/{param}` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getAuthAdminUsersParam(...)` | `GET` | `/auth/admin/users/{param}` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getAuthAdminUsersParamFactors(...)` | `GET` | `/auth/admin/users/{param}/factors` | `pathParam1, query, Class<T> responseType` | `@Nullable T` |
| `getAuthAdminUsersParamFactors(...)` | `GET` | `/auth/admin/users/{param}/factors` | `pathParam1, query, TypeReference<T> responseType` | `@Nullable T` |
| `getAuthAuthSession(...)` | `GET` | `/auth/auth/session` | `query, Class<T> responseType` | `@Nullable T` |
| `getAuthAuthSession(...)` | `GET` | `/auth/auth/session` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getAuthFactors(...)` | `GET` | `/auth/factors` | `query, Class<T> responseType` | `@Nullable T` |
| `getAuthFactors(...)` | `GET` | `/auth/factors` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getAuthMfaStatus(...)` | `GET` | `/auth/mfa/status` | `query, Class<T> responseType` | `@Nullable T` |
| `getAuthMfaStatus(...)` | `GET` | `/auth/mfa/status` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getAuthUser(...)` | `GET` | `/auth/user` | `query, Class<T> responseType` | `@Nullable T` |
| `getAuthUser(...)` | `GET` | `/auth/user` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `getAuthUserIdentities(...)` | `GET` | `/auth/user/identities` | `query, Class<T> responseType` | `@Nullable T` |
| `getAuthUserIdentities(...)` | `GET` | `/auth/user/identities` | `query, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthAccountMfa(...)` | `POST` | `/auth/account/mfa` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthAccountMfa(...)` | `POST` | `/auth/account/mfa` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthAccountMfaParamChallenge(...)` | `POST` | `/auth/account/mfa/{param}/challenge` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthAccountMfaParamChallenge(...)` | `POST` | `/auth/account/mfa/{param}/challenge` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthAccountMfaParamVerify(...)` | `POST` | `/auth/account/mfa/{param}/verify` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthAccountMfaParamVerify(...)` | `POST` | `/auth/account/mfa/{param}/verify` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthAccountPassword(...)` | `POST` | `/auth/account/password` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthAccountPassword(...)` | `POST` | `/auth/account/password` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthAccountSecurityApiKeys(...)` | `POST` | `/auth/account/security/api-keys` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthAccountSecurityApiKeys(...)` | `POST` | `/auth/account/security/api-keys` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthAccountSecurityDevices(...)` | `POST` | `/auth/account/security/devices` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthAccountSecurityDevices(...)` | `POST` | `/auth/account/security/devices` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthAccountSecurityDevicesParamTrust(...)` | `POST` | `/auth/account/security/devices/{param}/trust` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthAccountSecurityDevicesParamTrust(...)` | `POST` | `/auth/account/security/devices/{param}/trust` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthAccountSessionsParamExtend(...)` | `POST` | `/auth/account/sessions/{param}/extend` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthAccountSessionsParamExtend(...)` | `POST` | `/auth/account/sessions/{param}/extend` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthAdminGenerateLink(...)` | `POST` | `/auth/admin/generate_link` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthAdminGenerateLink(...)` | `POST` | `/auth/admin/generate_link` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthAdminLogout(...)` | `POST` | `/auth/admin/logout` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthAdminLogout(...)` | `POST` | `/auth/admin/logout` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthAdminUsers(...)` | `POST` | `/auth/admin/users` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthAdminUsers(...)` | `POST` | `/auth/admin/users` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthAuthSession(...)` | `POST` | `/auth/auth/session` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthAuthSession(...)` | `POST` | `/auth/auth/session` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthAuthorize(...)` | `POST` | `/auth/authorize` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthAuthorize(...)` | `POST` | `/auth/authorize` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthFactors(...)` | `POST` | `/auth/factors` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthFactors(...)` | `POST` | `/auth/factors` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthFactorsParamChallenge(...)` | `POST` | `/auth/factors/{param}/challenge` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthFactorsParamChallenge(...)` | `POST` | `/auth/factors/{param}/challenge` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthFactorsParamVerify(...)` | `POST` | `/auth/factors/{param}/verify` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthFactorsParamVerify(...)` | `POST` | `/auth/factors/{param}/verify` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthInvite(...)` | `POST` | `/auth/invite` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthInvite(...)` | `POST` | `/auth/invite` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthLogin(...)` | `POST` | `/auth/login` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthLogin(...)` | `POST` | `/auth/login` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthLogout(...)` | `POST` | `/auth/logout` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthLogout(...)` | `POST` | `/auth/logout` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthMfaBackupCodesRegenerate(...)` | `POST` | `/auth/mfa/backup-codes/regenerate` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthMfaBackupCodesRegenerate(...)` | `POST` | `/auth/mfa/backup-codes/regenerate` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthMfaDisable(...)` | `POST` | `/auth/mfa/disable` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthMfaDisable(...)` | `POST` | `/auth/mfa/disable` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthMfaEnable(...)` | `POST` | `/auth/mfa/enable` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthMfaEnable(...)` | `POST` | `/auth/mfa/enable` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthMfaSetup(...)` | `POST` | `/auth/mfa/setup` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthMfaSetup(...)` | `POST` | `/auth/mfa/setup` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthMfaVerify(...)` | `POST` | `/auth/mfa/verify` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthMfaVerify(...)` | `POST` | `/auth/mfa/verify` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthOtp(...)` | `POST` | `/auth/otp` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthOtp(...)` | `POST` | `/auth/otp` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthReauthenticate(...)` | `POST` | `/auth/reauthenticate` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthReauthenticate(...)` | `POST` | `/auth/reauthenticate` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthRecover(...)` | `POST` | `/auth/recover` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthRecover(...)` | `POST` | `/auth/recover` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthResend(...)` | `POST` | `/auth/resend` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthResend(...)` | `POST` | `/auth/resend` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthSignup(...)` | `POST` | `/auth/signup` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthSignup(...)` | `POST` | `/auth/signup` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthSso(...)` | `POST` | `/auth/sso` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthSso(...)` | `POST` | `/auth/sso` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthTokenGrantTypeIdToken(...)` | `POST` | `/auth/token?grant_type=id_token` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthTokenGrantTypeIdToken(...)` | `POST` | `/auth/token?grant_type=id_token` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthTokenGrantTypePassword(...)` | `POST` | `/auth/token?grant_type=password` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthTokenGrantTypePassword(...)` | `POST` | `/auth/token?grant_type=password` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthTokenGrantTypePkce(...)` | `POST` | `/auth/token?grant_type=pkce` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthTokenGrantTypePkce(...)` | `POST` | `/auth/token?grant_type=pkce` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthTokenGrantTypeRefreshToken(...)` | `POST` | `/auth/token?grant_type=refresh_token` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthTokenGrantTypeRefreshToken(...)` | `POST` | `/auth/token?grant_type=refresh_token` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthUserIdentities(...)` | `POST` | `/auth/user/identities` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthUserIdentities(...)` | `POST` | `/auth/user/identities` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `postAuthVerify(...)` | `POST` | `/auth/verify` | `query, body, Class<T> responseType` | `@Nullable T` |
| `postAuthVerify(...)` | `POST` | `/auth/verify` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `putAuthAccountProfile(...)` | `PUT` | `/auth/account/profile` | `query, body, Class<T> responseType` | `@Nullable T` |
| `putAuthAccountProfile(...)` | `PUT` | `/auth/account/profile` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| `putAuthAccountSecurityApiKeysParam(...)` | `PUT` | `/auth/account/security/api-keys/{param}` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `putAuthAccountSecurityApiKeysParam(...)` | `PUT` | `/auth/account/security/api-keys/{param}` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `putAuthAdminUsersParam(...)` | `PUT` | `/auth/admin/users/{param}` | `pathParam1, query, body, Class<T> responseType` | `@Nullable T` |
| `putAuthAdminUsersParam(...)` | `PUT` | `/auth/admin/users/{param}` | `pathParam1, query, body, TypeReference<T> responseType` | `@Nullable T` |
| `putAuthUser(...)` | `PUT` | `/auth/user` | `query, body, Class<T> responseType` | `@Nullable T` |
| `putAuthUser(...)` | `PUT` | `/auth/user` | `query, body, TypeReference<T> responseType` | `@Nullable T` |
| No catalogued operations | — | — | — | — |

The generic `request(...)` methods and `Endpoints` constants remain available.
