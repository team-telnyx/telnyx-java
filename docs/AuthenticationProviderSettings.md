

# AuthenticationProviderSettings

The settings associated with the authentication provider.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assertionConsumerServiceUrl** | **String** | The Assertion Consumer Service URL for the service provider (Telnyx). |  [optional]
**serviceProviderEntityId** | **String** | The Entity ID for the service provider (Telnyx). |  [optional]
**idpEntityId** | **String** | The Entity ID for the identity provider (IdP). |  [optional]
**idpSsoTargetUrl** | **String** | The SSO target url for the identity provider (IdP). |  [optional]
**idpCertFingerprint** | **String** | The certificate fingerprint for the identity provider (IdP) |  [optional]
**idpCertFingerprintAlgorithm** | [**IdpCertFingerprintAlgorithmEnum**](#IdpCertFingerprintAlgorithmEnum) | The algorithm used to generate the identity provider&#39;s (IdP) certificate fingerprint |  [optional]
**nameIdentifierFormat** | **String** | The name identifier format associated with the authentication provider. This must be the same for both the Identity Provider (IdP) and the service provider (Telnyx). |  [optional]



## Enum: IdpCertFingerprintAlgorithmEnum

Name | Value
---- | -----
SHA1 | &quot;sha1&quot;
SHA256 | &quot;sha256&quot;
SHA384 | &quot;sha384&quot;
SHA512 | &quot;sha512&quot;



