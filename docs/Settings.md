

# Settings

The settings associated with the authentication provider.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**idpEntityId** | **URI** | The Entity ID for the identity provider (IdP). |  |
|**idpSsoTargetUrl** | **URI** | The SSO target url for the identity provider (IdP). |  |
|**idpCertFingerprint** | **String** | The certificate fingerprint for the identity provider (IdP) |  |
|**idpCertFingerprintAlgorithm** | [**IdpCertFingerprintAlgorithmEnum**](#IdpCertFingerprintAlgorithmEnum) | The algorithm used to generate the identity provider&#39;s (IdP) certificate fingerprint |  [optional] |



## Enum: IdpCertFingerprintAlgorithmEnum

| Name | Value |
|---- | -----|
| SHA1 | &quot;sha1&quot; |
| SHA256 | &quot;sha256&quot; |
| SHA384 | &quot;sha384&quot; |
| SHA512 | &quot;sha512&quot; |



