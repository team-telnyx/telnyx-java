

# PhoneNumber


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] [readonly] |
|**recordType** | **String** |  |  [optional] [readonly] |
|**phoneNumber** | **String** |  |  [optional] |
|**countryIsoAlpha2** | **String** | The ISO 3166-1 alpha-2 country code of the phone number. |  [optional] [readonly] |
|**regulatoryRequirements** | [**List&lt;SubNumberOrderRegulatoryRequirementWithValue&gt;**](SubNumberOrderRegulatoryRequirementWithValue.md) |  |  [optional] |
|**requirementsMet** | **Boolean** | True if all requirements are met for a phone number, false otherwise. |  [optional] [readonly] |
|**requirementsStatus** | [**RequirementsStatusEnum**](#RequirementsStatusEnum) | Status of document requirements (if applicable) |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the phone number in the order. |  [optional] [readonly] |
|**bundleId** | **UUID** |  |  [optional] [readonly] |
|**phoneNumberType** | [**PhoneNumberTypeEnum**](#PhoneNumberTypeEnum) | Phone number type |  [optional] [readonly] |
|**countryCode** | **String** | Country code of the phone number |  [optional] [readonly] |



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



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| SUCCESS | &quot;success&quot; |
| FAILURE | &quot;failure&quot; |



## Enum: PhoneNumberTypeEnum

| Name | Value |
|---- | -----|
| LOCAL | &quot;local&quot; |
| MOBILE | &quot;mobile&quot; |
| NATIONAL | &quot;national&quot; |
| SHARED_COST | &quot;shared_cost&quot; |
| TOLL_FREE | &quot;toll_free&quot; |



