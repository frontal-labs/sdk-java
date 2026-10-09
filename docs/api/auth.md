# Auth API

Service accessor: `frontal.auth()` (`AuthClient`).

Operations are grouped by resource path. Collection methods use `list` and `create`; item methods use `get`, `update`, and `delete`. Calls can omit `QueryParams` when no query values are needed. Use contract-defined `JsonNode` bodies and caller-selected response types where schemas are not available.

| Method | HTTP | Route | Parameters | Response |
| --- | --- | --- | --- | --- |
| `auth().getUser(...)` | `GET` | `/auth/user` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `auth().getUser(...)` | `GET` | `/auth/user` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `auth().getUser(...)` | `GET` | `/auth/user` | `Class<T> responseType` | `@Nullable T` |
| `auth().getUser(...)` | `GET` | `/auth/user` | `TypeReference<T> responseType` | `@Nullable T` |
| `auth().createAuthorize(...)` | `POST` | `/auth/authorize` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().createAuthorize(...)` | `POST` | `/auth/authorize` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().createAuthorize(...)` | `POST` | `/auth/authorize` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().createAuthorize(...)` | `POST` | `/auth/authorize` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().createInvite(...)` | `POST` | `/auth/invite` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().createInvite(...)` | `POST` | `/auth/invite` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().createInvite(...)` | `POST` | `/auth/invite` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().createInvite(...)` | `POST` | `/auth/invite` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().login(...)` | `POST` | `/auth/login` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().login(...)` | `POST` | `/auth/login` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().login(...)` | `POST` | `/auth/login` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().login(...)` | `POST` | `/auth/login` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().logout(...)` | `POST` | `/auth/logout` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().logout(...)` | `POST` | `/auth/logout` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().logout(...)` | `POST` | `/auth/logout` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().logout(...)` | `POST` | `/auth/logout` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().createOtp(...)` | `POST` | `/auth/otp` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().createOtp(...)` | `POST` | `/auth/otp` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().createOtp(...)` | `POST` | `/auth/otp` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().createOtp(...)` | `POST` | `/auth/otp` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().createReauthenticate(...)` | `POST` | `/auth/reauthenticate` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().createReauthenticate(...)` | `POST` | `/auth/reauthenticate` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().createReauthenticate(...)` | `POST` | `/auth/reauthenticate` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().createReauthenticate(...)` | `POST` | `/auth/reauthenticate` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().createRecover(...)` | `POST` | `/auth/recover` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().createRecover(...)` | `POST` | `/auth/recover` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().createRecover(...)` | `POST` | `/auth/recover` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().createRecover(...)` | `POST` | `/auth/recover` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().createResend(...)` | `POST` | `/auth/resend` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().createResend(...)` | `POST` | `/auth/resend` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().createResend(...)` | `POST` | `/auth/resend` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().createResend(...)` | `POST` | `/auth/resend` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().createSignup(...)` | `POST` | `/auth/signup` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().createSignup(...)` | `POST` | `/auth/signup` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().createSignup(...)` | `POST` | `/auth/signup` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().createSignup(...)` | `POST` | `/auth/signup` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().createSso(...)` | `POST` | `/auth/sso` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().createSso(...)` | `POST` | `/auth/sso` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().createSso(...)` | `POST` | `/auth/sso` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().createSso(...)` | `POST` | `/auth/sso` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().createTokenGrantTypeIdToken(...)` | `POST` | `/auth/token?grant_type=id_token` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().createTokenGrantTypeIdToken(...)` | `POST` | `/auth/token?grant_type=id_token` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().createTokenGrantTypeIdToken(...)` | `POST` | `/auth/token?grant_type=id_token` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().createTokenGrantTypeIdToken(...)` | `POST` | `/auth/token?grant_type=id_token` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().createTokenGrantTypePassword(...)` | `POST` | `/auth/token?grant_type=password` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().createTokenGrantTypePassword(...)` | `POST` | `/auth/token?grant_type=password` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().createTokenGrantTypePassword(...)` | `POST` | `/auth/token?grant_type=password` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().createTokenGrantTypePassword(...)` | `POST` | `/auth/token?grant_type=password` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().createTokenGrantTypePkce(...)` | `POST` | `/auth/token?grant_type=pkce` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().createTokenGrantTypePkce(...)` | `POST` | `/auth/token?grant_type=pkce` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().createTokenGrantTypePkce(...)` | `POST` | `/auth/token?grant_type=pkce` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().createTokenGrantTypePkce(...)` | `POST` | `/auth/token?grant_type=pkce` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().createTokenGrantTypeRefreshToken(...)` | `POST` | `/auth/token?grant_type=refresh_token` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().createTokenGrantTypeRefreshToken(...)` | `POST` | `/auth/token?grant_type=refresh_token` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().createTokenGrantTypeRefreshToken(...)` | `POST` | `/auth/token?grant_type=refresh_token` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().createTokenGrantTypeRefreshToken(...)` | `POST` | `/auth/token?grant_type=refresh_token` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().verify(...)` | `POST` | `/auth/verify` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().verify(...)` | `POST` | `/auth/verify` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().verify(...)` | `POST` | `/auth/verify` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().verify(...)` | `POST` | `/auth/verify` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().updateUser(...)` | `PUT` | `/auth/user` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().updateUser(...)` | `PUT` | `/auth/user` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().updateUser(...)` | `PUT` | `/auth/user` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().updateUser(...)` | `PUT` | `/auth/user` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().deleteProfile(...)` | `DELETE` | `/auth/account/profile` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `auth().account().deleteProfile(...)` | `DELETE` | `/auth/account/profile` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().deleteProfile(...)` | `DELETE` | `/auth/account/profile` | `Class<T> responseType` | `@Nullable T` |
| `auth().account().deleteProfile(...)` | `DELETE` | `/auth/account/profile` | `TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().getAuditLog(...)` | `GET` | `/auth/account/audit-log` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `auth().account().getAuditLog(...)` | `GET` | `/auth/account/audit-log` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().getAuditLog(...)` | `GET` | `/auth/account/audit-log` | `Class<T> responseType` | `@Nullable T` |
| `auth().account().getAuditLog(...)` | `GET` | `/auth/account/audit-log` | `TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().getMfa(...)` | `GET` | `/auth/account/mfa` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `auth().account().getMfa(...)` | `GET` | `/auth/account/mfa` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().getMfa(...)` | `GET` | `/auth/account/mfa` | `Class<T> responseType` | `@Nullable T` |
| `auth().account().getMfa(...)` | `GET` | `/auth/account/mfa` | `TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().getProfile(...)` | `GET` | `/auth/account/profile` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `auth().account().getProfile(...)` | `GET` | `/auth/account/profile` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().getProfile(...)` | `GET` | `/auth/account/profile` | `Class<T> responseType` | `@Nullable T` |
| `auth().account().getProfile(...)` | `GET` | `/auth/account/profile` | `TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().createMfa(...)` | `POST` | `/auth/account/mfa` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().account().createMfa(...)` | `POST` | `/auth/account/mfa` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().createMfa(...)` | `POST` | `/auth/account/mfa` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().account().createMfa(...)` | `POST` | `/auth/account/mfa` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().createPassword(...)` | `POST` | `/auth/account/password` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().account().createPassword(...)` | `POST` | `/auth/account/password` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().createPassword(...)` | `POST` | `/auth/account/password` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().account().createPassword(...)` | `POST` | `/auth/account/password` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().updateProfile(...)` | `PUT` | `/auth/account/profile` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().account().updateProfile(...)` | `PUT` | `/auth/account/profile` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().updateProfile(...)` | `PUT` | `/auth/account/profile` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().account().updateProfile(...)` | `PUT` | `/auth/account/profile` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().admin().createGenerateLink(...)` | `POST` | `/auth/admin/generate_link` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().admin().createGenerateLink(...)` | `POST` | `/auth/admin/generate_link` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().admin().createGenerateLink(...)` | `POST` | `/auth/admin/generate_link` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().admin().createGenerateLink(...)` | `POST` | `/auth/admin/generate_link` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().admin().logout(...)` | `POST` | `/auth/admin/logout` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().admin().logout(...)` | `POST` | `/auth/admin/logout` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().admin().logout(...)` | `POST` | `/auth/admin/logout` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().admin().logout(...)` | `POST` | `/auth/admin/logout` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().auth().getSession(...)` | `GET` | `/auth/auth/session` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `auth().auth().getSession(...)` | `GET` | `/auth/auth/session` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `auth().auth().getSession(...)` | `GET` | `/auth/auth/session` | `Class<T> responseType` | `@Nullable T` |
| `auth().auth().getSession(...)` | `GET` | `/auth/auth/session` | `TypeReference<T> responseType` | `@Nullable T` |
| `auth().auth().createSession(...)` | `POST` | `/auth/auth/session` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().auth().createSession(...)` | `POST` | `/auth/auth/session` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().auth().createSession(...)` | `POST` | `/auth/auth/session` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().auth().createSession(...)` | `POST` | `/auth/auth/session` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().factors().delete(...)` | `DELETE` | `/auth/factors/{param}` | `String factorId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `auth().factors().delete(...)` | `DELETE` | `/auth/factors/{param}` | `String factorId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `auth().factors().delete(...)` | `DELETE` | `/auth/factors/{param}` | `String factorId, Class<T> responseType` | `@Nullable T` |
| `auth().factors().delete(...)` | `DELETE` | `/auth/factors/{param}` | `String factorId, TypeReference<T> responseType` | `@Nullable T` |
| `auth().factors().list(...)` | `GET` | `/auth/factors` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `auth().factors().list(...)` | `GET` | `/auth/factors` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `auth().factors().list(...)` | `GET` | `/auth/factors` | `Class<T> responseType` | `@Nullable T` |
| `auth().factors().list(...)` | `GET` | `/auth/factors` | `TypeReference<T> responseType` | `@Nullable T` |
| `auth().factors().create(...)` | `POST` | `/auth/factors` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().factors().create(...)` | `POST` | `/auth/factors` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().factors().create(...)` | `POST` | `/auth/factors` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().factors().create(...)` | `POST` | `/auth/factors` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().factors().createChallenge(...)` | `POST` | `/auth/factors/{param}/challenge` | `String factorId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().factors().createChallenge(...)` | `POST` | `/auth/factors/{param}/challenge` | `String factorId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().factors().createChallenge(...)` | `POST` | `/auth/factors/{param}/challenge` | `String factorId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().factors().createChallenge(...)` | `POST` | `/auth/factors/{param}/challenge` | `String factorId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().factors().verify(...)` | `POST` | `/auth/factors/{param}/verify` | `String factorId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().factors().verify(...)` | `POST` | `/auth/factors/{param}/verify` | `String factorId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().factors().verify(...)` | `POST` | `/auth/factors/{param}/verify` | `String factorId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().factors().verify(...)` | `POST` | `/auth/factors/{param}/verify` | `String factorId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().mfa().status(...)` | `GET` | `/auth/mfa/status` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `auth().mfa().status(...)` | `GET` | `/auth/mfa/status` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `auth().mfa().status(...)` | `GET` | `/auth/mfa/status` | `Class<T> responseType` | `@Nullable T` |
| `auth().mfa().status(...)` | `GET` | `/auth/mfa/status` | `TypeReference<T> responseType` | `@Nullable T` |
| `auth().mfa().disable(...)` | `POST` | `/auth/mfa/disable` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().mfa().disable(...)` | `POST` | `/auth/mfa/disable` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().mfa().disable(...)` | `POST` | `/auth/mfa/disable` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().mfa().disable(...)` | `POST` | `/auth/mfa/disable` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().mfa().enable(...)` | `POST` | `/auth/mfa/enable` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().mfa().enable(...)` | `POST` | `/auth/mfa/enable` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().mfa().enable(...)` | `POST` | `/auth/mfa/enable` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().mfa().enable(...)` | `POST` | `/auth/mfa/enable` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().mfa().setup(...)` | `POST` | `/auth/mfa/setup` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().mfa().setup(...)` | `POST` | `/auth/mfa/setup` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().mfa().setup(...)` | `POST` | `/auth/mfa/setup` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().mfa().setup(...)` | `POST` | `/auth/mfa/setup` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().mfa().verify(...)` | `POST` | `/auth/mfa/verify` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().mfa().verify(...)` | `POST` | `/auth/mfa/verify` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().mfa().verify(...)` | `POST` | `/auth/mfa/verify` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().mfa().verify(...)` | `POST` | `/auth/mfa/verify` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().mfa().delete(...)` | `DELETE` | `/auth/account/mfa/{param}` | `String mfaId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `auth().account().mfa().delete(...)` | `DELETE` | `/auth/account/mfa/{param}` | `String mfaId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().mfa().delete(...)` | `DELETE` | `/auth/account/mfa/{param}` | `String mfaId, Class<T> responseType` | `@Nullable T` |
| `auth().account().mfa().delete(...)` | `DELETE` | `/auth/account/mfa/{param}` | `String mfaId, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().mfa().get(...)` | `GET` | `/auth/account/mfa/{param}` | `String mfaId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `auth().account().mfa().get(...)` | `GET` | `/auth/account/mfa/{param}` | `String mfaId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().mfa().get(...)` | `GET` | `/auth/account/mfa/{param}` | `String mfaId, Class<T> responseType` | `@Nullable T` |
| `auth().account().mfa().get(...)` | `GET` | `/auth/account/mfa/{param}` | `String mfaId, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().mfa().createChallenge(...)` | `POST` | `/auth/account/mfa/{param}/challenge` | `String mfaId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().account().mfa().createChallenge(...)` | `POST` | `/auth/account/mfa/{param}/challenge` | `String mfaId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().mfa().createChallenge(...)` | `POST` | `/auth/account/mfa/{param}/challenge` | `String mfaId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().account().mfa().createChallenge(...)` | `POST` | `/auth/account/mfa/{param}/challenge` | `String mfaId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().mfa().verify(...)` | `POST` | `/auth/account/mfa/{param}/verify` | `String mfaId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().account().mfa().verify(...)` | `POST` | `/auth/account/mfa/{param}/verify` | `String mfaId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().mfa().verify(...)` | `POST` | `/auth/account/mfa/{param}/verify` | `String mfaId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().account().mfa().verify(...)` | `POST` | `/auth/account/mfa/{param}/verify` | `String mfaId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().sessions().delete(...)` | `DELETE` | `/auth/account/sessions/{param}` | `String sessionId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `auth().account().sessions().delete(...)` | `DELETE` | `/auth/account/sessions/{param}` | `String sessionId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().sessions().delete(...)` | `DELETE` | `/auth/account/sessions/{param}` | `String sessionId, Class<T> responseType` | `@Nullable T` |
| `auth().account().sessions().delete(...)` | `DELETE` | `/auth/account/sessions/{param}` | `String sessionId, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().sessions().list(...)` | `GET` | `/auth/account/sessions` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `auth().account().sessions().list(...)` | `GET` | `/auth/account/sessions` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().sessions().list(...)` | `GET` | `/auth/account/sessions` | `Class<T> responseType` | `@Nullable T` |
| `auth().account().sessions().list(...)` | `GET` | `/auth/account/sessions` | `TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().sessions().extend(...)` | `POST` | `/auth/account/sessions/{param}/extend` | `String sessionId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().account().sessions().extend(...)` | `POST` | `/auth/account/sessions/{param}/extend` | `String sessionId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().sessions().extend(...)` | `POST` | `/auth/account/sessions/{param}/extend` | `String sessionId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().account().sessions().extend(...)` | `POST` | `/auth/account/sessions/{param}/extend` | `String sessionId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().admin().users().delete(...)` | `DELETE` | `/auth/admin/users/{param}` | `String userId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `auth().admin().users().delete(...)` | `DELETE` | `/auth/admin/users/{param}` | `String userId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `auth().admin().users().delete(...)` | `DELETE` | `/auth/admin/users/{param}` | `String userId, Class<T> responseType` | `@Nullable T` |
| `auth().admin().users().delete(...)` | `DELETE` | `/auth/admin/users/{param}` | `String userId, TypeReference<T> responseType` | `@Nullable T` |
| `auth().admin().users().list(...)` | `GET` | `/auth/admin/users` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `auth().admin().users().list(...)` | `GET` | `/auth/admin/users` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `auth().admin().users().list(...)` | `GET` | `/auth/admin/users` | `Class<T> responseType` | `@Nullable T` |
| `auth().admin().users().list(...)` | `GET` | `/auth/admin/users` | `TypeReference<T> responseType` | `@Nullable T` |
| `auth().admin().users().get(...)` | `GET` | `/auth/admin/users/{param}` | `String userId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `auth().admin().users().get(...)` | `GET` | `/auth/admin/users/{param}` | `String userId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `auth().admin().users().get(...)` | `GET` | `/auth/admin/users/{param}` | `String userId, Class<T> responseType` | `@Nullable T` |
| `auth().admin().users().get(...)` | `GET` | `/auth/admin/users/{param}` | `String userId, TypeReference<T> responseType` | `@Nullable T` |
| `auth().admin().users().create(...)` | `POST` | `/auth/admin/users` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().admin().users().create(...)` | `POST` | `/auth/admin/users` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().admin().users().create(...)` | `POST` | `/auth/admin/users` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().admin().users().create(...)` | `POST` | `/auth/admin/users` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().admin().users().update(...)` | `PUT` | `/auth/admin/users/{param}` | `String userId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().admin().users().update(...)` | `PUT` | `/auth/admin/users/{param}` | `String userId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().admin().users().update(...)` | `PUT` | `/auth/admin/users/{param}` | `String userId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().admin().users().update(...)` | `PUT` | `/auth/admin/users/{param}` | `String userId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().mfa().backupCodes().createRegenerate(...)` | `POST` | `/auth/mfa/backup-codes/regenerate` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().mfa().backupCodes().createRegenerate(...)` | `POST` | `/auth/mfa/backup-codes/regenerate` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().mfa().backupCodes().createRegenerate(...)` | `POST` | `/auth/mfa/backup-codes/regenerate` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().mfa().backupCodes().createRegenerate(...)` | `POST` | `/auth/mfa/backup-codes/regenerate` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().user().identities().delete(...)` | `DELETE` | `/auth/user/identities/{param}` | `String identityId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `auth().user().identities().delete(...)` | `DELETE` | `/auth/user/identities/{param}` | `String identityId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `auth().user().identities().delete(...)` | `DELETE` | `/auth/user/identities/{param}` | `String identityId, Class<T> responseType` | `@Nullable T` |
| `auth().user().identities().delete(...)` | `DELETE` | `/auth/user/identities/{param}` | `String identityId, TypeReference<T> responseType` | `@Nullable T` |
| `auth().user().identities().list(...)` | `GET` | `/auth/user/identities` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `auth().user().identities().list(...)` | `GET` | `/auth/user/identities` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `auth().user().identities().list(...)` | `GET` | `/auth/user/identities` | `Class<T> responseType` | `@Nullable T` |
| `auth().user().identities().list(...)` | `GET` | `/auth/user/identities` | `TypeReference<T> responseType` | `@Nullable T` |
| `auth().user().identities().create(...)` | `POST` | `/auth/user/identities` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().user().identities().create(...)` | `POST` | `/auth/user/identities` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().user().identities().create(...)` | `POST` | `/auth/user/identities` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().user().identities().create(...)` | `POST` | `/auth/user/identities` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().security().apiKeys().delete(...)` | `DELETE` | `/auth/account/security/api-keys/{param}` | `String apiKeyId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `auth().account().security().apiKeys().delete(...)` | `DELETE` | `/auth/account/security/api-keys/{param}` | `String apiKeyId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().security().apiKeys().delete(...)` | `DELETE` | `/auth/account/security/api-keys/{param}` | `String apiKeyId, Class<T> responseType` | `@Nullable T` |
| `auth().account().security().apiKeys().delete(...)` | `DELETE` | `/auth/account/security/api-keys/{param}` | `String apiKeyId, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().security().apiKeys().list(...)` | `GET` | `/auth/account/security/api-keys` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `auth().account().security().apiKeys().list(...)` | `GET` | `/auth/account/security/api-keys` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().security().apiKeys().list(...)` | `GET` | `/auth/account/security/api-keys` | `Class<T> responseType` | `@Nullable T` |
| `auth().account().security().apiKeys().list(...)` | `GET` | `/auth/account/security/api-keys` | `TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().security().apiKeys().get(...)` | `GET` | `/auth/account/security/api-keys/{param}` | `String apiKeyId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `auth().account().security().apiKeys().get(...)` | `GET` | `/auth/account/security/api-keys/{param}` | `String apiKeyId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().security().apiKeys().get(...)` | `GET` | `/auth/account/security/api-keys/{param}` | `String apiKeyId, Class<T> responseType` | `@Nullable T` |
| `auth().account().security().apiKeys().get(...)` | `GET` | `/auth/account/security/api-keys/{param}` | `String apiKeyId, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().security().apiKeys().create(...)` | `POST` | `/auth/account/security/api-keys` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().account().security().apiKeys().create(...)` | `POST` | `/auth/account/security/api-keys` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().security().apiKeys().create(...)` | `POST` | `/auth/account/security/api-keys` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().account().security().apiKeys().create(...)` | `POST` | `/auth/account/security/api-keys` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().security().apiKeys().update(...)` | `PUT` | `/auth/account/security/api-keys/{param}` | `String apiKeyId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().account().security().apiKeys().update(...)` | `PUT` | `/auth/account/security/api-keys/{param}` | `String apiKeyId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().security().apiKeys().update(...)` | `PUT` | `/auth/account/security/api-keys/{param}` | `String apiKeyId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().account().security().apiKeys().update(...)` | `PUT` | `/auth/account/security/api-keys/{param}` | `String apiKeyId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().security().devices().delete(...)` | `DELETE` | `/auth/account/security/devices/{param}` | `String deviceId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `auth().account().security().devices().delete(...)` | `DELETE` | `/auth/account/security/devices/{param}` | `String deviceId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().security().devices().delete(...)` | `DELETE` | `/auth/account/security/devices/{param}` | `String deviceId, Class<T> responseType` | `@Nullable T` |
| `auth().account().security().devices().delete(...)` | `DELETE` | `/auth/account/security/devices/{param}` | `String deviceId, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().security().devices().list(...)` | `GET` | `/auth/account/security/devices` | `QueryParams query, Class<T> responseType` | `@Nullable T` |
| `auth().account().security().devices().list(...)` | `GET` | `/auth/account/security/devices` | `QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().security().devices().list(...)` | `GET` | `/auth/account/security/devices` | `Class<T> responseType` | `@Nullable T` |
| `auth().account().security().devices().list(...)` | `GET` | `/auth/account/security/devices` | `TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().security().devices().get(...)` | `GET` | `/auth/account/security/devices/{param}` | `String deviceId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `auth().account().security().devices().get(...)` | `GET` | `/auth/account/security/devices/{param}` | `String deviceId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().security().devices().get(...)` | `GET` | `/auth/account/security/devices/{param}` | `String deviceId, Class<T> responseType` | `@Nullable T` |
| `auth().account().security().devices().get(...)` | `GET` | `/auth/account/security/devices/{param}` | `String deviceId, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().security().devices().create(...)` | `POST` | `/auth/account/security/devices` | `QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().account().security().devices().create(...)` | `POST` | `/auth/account/security/devices` | `QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().security().devices().create(...)` | `POST` | `/auth/account/security/devices` | `@Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().account().security().devices().create(...)` | `POST` | `/auth/account/security/devices` | `@Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().security().devices().trust(...)` | `POST` | `/auth/account/security/devices/{param}/trust` | `String deviceId, QueryParams query, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().account().security().devices().trust(...)` | `POST` | `/auth/account/security/devices/{param}/trust` | `String deviceId, QueryParams query, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().account().security().devices().trust(...)` | `POST` | `/auth/account/security/devices/{param}/trust` | `String deviceId, @Nullable JsonNode body, Class<T> responseType` | `@Nullable T` |
| `auth().account().security().devices().trust(...)` | `POST` | `/auth/account/security/devices/{param}/trust` | `String deviceId, @Nullable JsonNode body, TypeReference<T> responseType` | `@Nullable T` |
| `auth().admin().users().factors().delete(...)` | `DELETE` | `/auth/admin/users/{param}/factors/{param}` | `String userId, String factorId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `auth().admin().users().factors().delete(...)` | `DELETE` | `/auth/admin/users/{param}/factors/{param}` | `String userId, String factorId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `auth().admin().users().factors().delete(...)` | `DELETE` | `/auth/admin/users/{param}/factors/{param}` | `String userId, String factorId, Class<T> responseType` | `@Nullable T` |
| `auth().admin().users().factors().delete(...)` | `DELETE` | `/auth/admin/users/{param}/factors/{param}` | `String userId, String factorId, TypeReference<T> responseType` | `@Nullable T` |
| `auth().admin().users().factors().list(...)` | `GET` | `/auth/admin/users/{param}/factors` | `String userId, QueryParams query, Class<T> responseType` | `@Nullable T` |
| `auth().admin().users().factors().list(...)` | `GET` | `/auth/admin/users/{param}/factors` | `String userId, QueryParams query, TypeReference<T> responseType` | `@Nullable T` |
| `auth().admin().users().factors().list(...)` | `GET` | `/auth/admin/users/{param}/factors` | `String userId, Class<T> responseType` | `@Nullable T` |
| `auth().admin().users().factors().list(...)` | `GET` | `/auth/admin/users/{param}/factors` | `String userId, TypeReference<T> responseType` | `@Nullable T` |

The generic `request(...)` methods and `Endpoints` constants remain available.
