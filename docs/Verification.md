

# Verification


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional]
**verificationType** | **VerificationType** |  |  [optional]
**recordType** | **VerificationRecordType** |  |  [optional]
**phoneNumber** | **String** | +E164 formatted phone number. |  [optional]
**verifyProfileId** | **UUID** | The identifier of the associated Verify profile. |  [optional]
**timeoutSecs** | **Integer** | This is the number of seconds before the code of the request is expired. Once this request has expired, the code will no longer verify the user. Note: this will override the &#x60;default_verification_timeout_secs&#x60; on the Verify profile. |  [optional]
**callTimeoutSecs** | **Integer** | This is the number of seconds before the call ends, if the verification makes a call. Note: this will override the &#x60;default_call_timeout_secs&#x60; on the Verify profile. |  [optional]
**status** | **VerificationStatus** |  |  [optional]
**createdAt** | **String** |  |  [optional]
**updatedAt** | **String** |  |  [optional]



