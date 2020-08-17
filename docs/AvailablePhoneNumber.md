# AvailablePhoneNumber

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) |  |  [optional]
**phoneNumber** | **String** |  |  [optional]
**vanityFormat** | **String** |  |  [optional]
**bestEffort** | **Boolean** | Specifies whether the phone number is an exact match based on the search criteria or not. |  [optional]
**quickship** | **Boolean** | Specifies whether the phone number can receive calls immediately after purchase or not. |  [optional]
**reservable** | **Boolean** | Specifies whether the phone number can be reserved before purchase or not. |  [optional]
**regionInformation** | [**List&lt;RegionInformation&gt;**](RegionInformation.md) |  |  [optional]
**costInformation** | [**CostInformation**](CostInformation.md) |  |  [optional]
**regulatoryRequirements** | [**List&lt;RegulatoryRequirement&gt;**](RegulatoryRequirement.md) |  |  [optional]

<a name="RecordTypeEnum"></a>
## Enum: RecordTypeEnum
Name | Value
---- | -----
NUMBER | &quot;available_phone_number&quot;
