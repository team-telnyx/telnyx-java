

# SubNumberOrder


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] [readonly] |
|**orderRequestId** | **UUID** |  |  [optional] [readonly] |
|**countryCode** | **String** |  |  [optional] [readonly] |
|**phoneNumberType** | [**PhoneNumberTypeEnum**](#PhoneNumberTypeEnum) |  |  [optional] |
|**userId** | **UUID** |  |  [optional] |
|**regulatoryRequirements** | [**List&lt;SubNumberOrderRegulatoryRequirement&gt;**](SubNumberOrderRegulatoryRequirement.md) |  |  [optional] |
|**recordType** | **String** |  |  [optional] [readonly] |
|**phoneNumbersCount** | **Integer** | The count of phone numbers in the number order. |  [optional] [readonly] |
|**createdAt** | **String** | An ISO 8901 datetime string denoting when the number order was created. |  [optional] [readonly] |
|**updatedAt** | **String** | An ISO 8901 datetime string for when the number order was updated. |  [optional] [readonly] |
|**requirementsMet** | **Boolean** | True if all requirements are met for every phone number, false otherwise. |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the order. |  [optional] [readonly] |
|**customerReference** | **String** | A customer reference string for customer look ups. |  [optional] |
|**isBlockSubNumberOrder** | **Boolean** | True if the sub number order is a block sub number order |  [optional] [readonly] |



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



