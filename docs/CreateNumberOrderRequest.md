

# CreateNumberOrderRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  |  [optional] [readonly]
**recordType** | **String** |  |  [optional] [readonly]
**phoneNumbers** | [**List&lt;PhoneNumber&gt;**](PhoneNumber.md) |  |  [optional]
**phoneNumbersCount** | **Integer** | The count of phone numbers in the number order. |  [optional] [readonly]
**status** | [**StatusEnum**](#StatusEnum) | The status of the order. |  [optional] [readonly]
**customerReference** | **String** | A customer reference string for customer look ups. |  [optional]
**createdAt** | **String** | An ISO 8901 datetime string denoting when the number order was created. |  [optional] [readonly]
**updatedAt** | **String** | An ISO 8901 datetime string for when the number order was updated. |  [optional] [readonly]
**requirementsMet** | **Boolean** | True if all requirements are met for every phone number, false otherwise. |  [optional] [readonly]



## Enum: StatusEnum

Name | Value
---- | -----
PENDING | &quot;pending&quot;
SUCCESS | &quot;success&quot;
FAILURE | &quot;failure&quot;



