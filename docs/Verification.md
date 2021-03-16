

# Verification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**phoneNumber** | **String** | +E164 formatted phone number. | 
**verifyProfileId** | [**UUID**](UUID.md) | The identifier of the associated Verify profile. | 
**type** | [**VerificationType**](VerificationType.md) |  | 
**timeoutSecs** | **Integer** | This is the number of seconds before the code of the request is expired. Once this request has expired, the code will no longer verify the user. Note: this will override the &#x60;default_timeout_secs&#x60; on the Verify profile. |  [optional]
**id** | [**UUID**](UUID.md) |  | 
**status** | [**VerificationStatus**](VerificationStatus.md) |  | 
**recordType** | **String** | Identifies the type of the resource. |  [optional]
**createdAt** | **String** |  | 
**updatedAt** | **String** |  | 



