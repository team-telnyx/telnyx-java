# PhoneNumber

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  |  [optional]
**recordType** | **String** |  |  [optional]
**phoneNumber** | **String** |  |  [optional]
**regulatoryGroupId** | **String** |  |  [optional]
**regulatoryRequirements** | [**List&lt;PhoneNumberRegulatoryRequirement&gt;**](PhoneNumberRegulatoryRequirement.md) |  |  [optional]
**requirementsMet** | **Boolean** | True if all requirements are met for a phone number, false otherwise. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the phone number in the order. |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;pending&quot;
SUCCESS | &quot;success&quot;
FAILURE | &quot;failure&quot;
