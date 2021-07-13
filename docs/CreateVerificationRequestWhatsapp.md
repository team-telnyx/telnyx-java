

# CreateVerificationRequestWhatsapp

The request body when creating a verification.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**phoneNumber** | **String** | +E164 formatted phone number. | 
**verifyProfileId** | [**UUID**](UUID.md) | The identifier of the associated Verify profile. | 
**timeoutSecs** | **Integer** | The number of seconds the verification code is valid for. |  [optional]
**appName** | **String** | The name that identifies the application requesting 2fa in the verification message. |  [optional]



