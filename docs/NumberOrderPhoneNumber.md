

# NumberOrderPhoneNumber


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] [readonly] |
|**recordType** | **String** |  |  [optional] [readonly] |
|**phoneNumber** | **String** |  |  [optional] |
|**orderRequestId** | **UUID** |  |  [optional] |
|**subNumberOrderId** | **UUID** |  |  [optional] |
|**countryCode** | **String** |  |  [optional] |
|**phoneNumberType** | [**PhoneNumberTypeEnum**](#PhoneNumberTypeEnum) |  |  [optional] |
|**regulatoryRequirements** | [**List&lt;SubNumberOrderRegulatoryRequirementWithValue&gt;**](SubNumberOrderRegulatoryRequirementWithValue.md) |  |  [optional] |
|**requirementsMet** | **Boolean** | True if all requirements are met for a phone number, false otherwise. |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the phone number in the order. |  [optional] [readonly] |
|**bundleId** | **UUID** |  |  [optional] [readonly] |
|**locality** | **String** |  |  [optional] |
|**deadline** | **String** |  |  [optional] |
|**requirementsStatus** | [**RequirementsStatusEnum**](#RequirementsStatusEnum) | Status of requirements (if applicable) |  [optional] [readonly] |
|**isBlockNumber** | **Boolean** |  |  [optional] |



## Enum: PhoneNumberTypeEnum

| Name | Value |
|---- | -----|
| LOCAL | &quot;local&quot; |
| TOLL_FREE | &quot;toll_free&quot; |
| MOBILE | &quot;mobile&quot; |
| NATIONAL | &quot;national&quot; |
| SHARED_COST | &quot;shared_cost&quot; |
| LANDLINE | &quot;landline&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| SUCCESS | &quot;success&quot; |
| FAILURE | &quot;failure&quot; |



## Enum: RequirementsStatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| APPROVED | &quot;approved&quot; |
| CANCELLED | &quot;cancelled&quot; |
| DELETED | &quot;deleted&quot; |
| REQUIREMENT_INFO_EXCEPTION | &quot;requirement-info-exception&quot; |
| REQUIREMENT_INFO_PENDING | &quot;requirement-info-pending&quot; |
| REQUIREMENT_INFO_UNDER_REVIEW | &quot;requirement-info-under-review&quot; |



