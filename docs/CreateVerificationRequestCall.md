

# CreateVerificationRequestCall

The request body when creating a verification.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**phoneNumber** | **String** | +E164 formatted phone number. | 
**verifyProfileId** | **UUID** | The identifier of the associated Verify profile. | 
**timeoutSecs** | **Integer** | The number of seconds the verification code is valid for. |  [optional]
**callTimeoutSecs** | **Integer** | Must be less than the profile&#39;s default_verification_timeout_secs or timeout_secs, whichever is lesser. |  [optional]



