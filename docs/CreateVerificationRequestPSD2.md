

# CreateVerificationRequestPSD2

The request body when creating a verification.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**phoneNumber** | **String** | +E164 formatted phone number. |  |
|**verifyProfileId** | **UUID** | The identifier of the associated Verify profile. |  |
|**currency** | **Currencies** |  |  |
|**amount** | **String** |  |  |
|**payee** | **String** |  |  |
|**timeoutSecs** | **Integer** | The number of seconds the verification code is valid for. |  [optional] |



