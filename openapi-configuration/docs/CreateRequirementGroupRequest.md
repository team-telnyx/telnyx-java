

# CreateRequirementGroupRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**countryCode** | **String** | ISO alpha 2 country code |  |
|**phoneNumberType** | [**PhoneNumberTypeEnum**](#PhoneNumberTypeEnum) |  |  |
|**action** | [**ActionEnum**](#ActionEnum) |  |  |
|**customerReference** | **String** |  |  [optional] |
|**regulatoryRequirements** | [**List&lt;CreateRequirementGroupRequestRegulatoryRequirementsInner&gt;**](CreateRequirementGroupRequestRegulatoryRequirementsInner.md) |  |  [optional] |



## Enum: PhoneNumberTypeEnum

| Name | Value |
|---- | -----|
| LOCAL | &quot;local&quot; |
| TOLL_FREE | &quot;toll_free&quot; |
| MOBILE | &quot;mobile&quot; |
| NATIONAL | &quot;national&quot; |
| SHARED_COST | &quot;shared_cost&quot; |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| ORDERING | &quot;ordering&quot; |
| PORTING | &quot;porting&quot; |



