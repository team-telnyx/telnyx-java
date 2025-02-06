

# Verification


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**type** | **VerificationType** |  |  [optional] |
|**recordType** | **VerificationRecordType** |  |  [optional] |
|**phoneNumber** | **String** | +E164 formatted phone number. |  [optional] |
|**verifyProfileId** | **UUID** | The identifier of the associated Verify profile. |  [optional] |
|**customCode** | **String** | Send a self-generated numeric code to the end-user |  [optional] |
|**timeoutSecs** | **Integer** | This is the number of seconds before the code of the request is expired. Once this request has expired, the code will no longer verify the user. Note: this will override the &#x60;default_verification_timeout_secs&#x60; on the Verify profile. |  [optional] |
|**status** | **VerificationStatus** |  |  [optional] |
|**createdAt** | **String** |  |  [optional] |
|**updatedAt** | **String** |  |  [optional] |



