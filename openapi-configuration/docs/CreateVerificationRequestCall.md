

# CreateVerificationRequestCall

The request body when creating a verification.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**phoneNumber** | **String** | +E164 formatted phone number. |  |
|**verifyProfileId** | **UUID** | The identifier of the associated Verify profile. |  |
|**customCode** | **String** | Send a self-generated numeric code to the end-user |  [optional] |
|**timeoutSecs** | **Integer** | The number of seconds the verification code is valid for. |  [optional] |



