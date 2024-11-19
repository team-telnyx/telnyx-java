

# RequirementGroup


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**countryCode** | **String** |  |  [optional] |
|**phoneNumberType** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**action** | **String** |  |  [optional] |
|**customerReference** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**recordType** | **String** |  |  [optional] |
|**regulatoryRequirements** | [**List&lt;UserRequirement&gt;**](UserRequirement.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| APPROVED | &quot;approved&quot; |
| UNAPPROVED | &quot;unapproved&quot; |
| PENDING_APPROVAL | &quot;pending-approval&quot; |
| DECLINED | &quot;declined&quot; |



