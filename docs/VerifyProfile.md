

# VerifyProfile

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  | 
**recordType** | **String** | Identifies the type of the resource. |  [optional]
**name** | **String** | The name of the Verify profile. | 
**createdAt** | **String** |  | 
**updatedAt** | **String** |  | 
**messagingEnabled** | **Boolean** | Enables SMS text messaging for the Verify profile. |  [optional]
**rcsEnabled** | **Boolean** | Enables RCS messaging for the Verify profile. | 
**messagingTemplate** | **String** | Optionally sets a messaging text template when sending the verification code. Uses &#x60;{code}&#x60; to template in the actual verification code. |  [optional]
**defaultTimeoutSecs** | **Integer** | For every request that is initiated via this Verify profile, this sets the number of seconds before a verification request code expires. Once the verification request expires, the user cannot use the code to verify their identity. | 
**vsmsEnabled** | **Boolean** | Enables VSMS for the Verify profile. |  [optional]



