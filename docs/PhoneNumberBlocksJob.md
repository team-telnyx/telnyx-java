

# PhoneNumberBlocksJob


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Identifies the resource. |  [optional] [readonly]
**recordType** | **String** | Identifies the type of the resource. |  [optional] [readonly]
**status** | [**StatusEnum**](#StatusEnum) | Indicates the completion status of the background operation. |  [optional] [readonly]
**type** | [**TypeEnum**](#TypeEnum) | Identifies the type of the background job. |  [optional] [readonly]
**etc** | **OffsetDateTime** | ISO 8601 formatted date indicating when the estimated time of completion of the background job. |  [optional] [readonly]
**createdAt** | **String** | ISO 8601 formatted date indicating when the resource was created. |  [optional] [readonly]
**updatedAt** | **String** | ISO 8601 formatted date indicating when the resource was updated. |  [optional] [readonly]
**successfulOperations** | [**List&lt;PhoneNumberBlocksJobSuccessfulOperation&gt;**](PhoneNumberBlocksJobSuccessfulOperation.md) |  |  [optional] [readonly]
**failedOperations** | [**List&lt;PhoneNumberBlocksJobFailedOperation&gt;**](PhoneNumberBlocksJobFailedOperation.md) |  |  [optional] [readonly]



## Enum: StatusEnum

Name | Value
---- | -----
PENDING | &quot;pending&quot;
IN_PROGRESS | &quot;in_progress&quot;
COMPLETED | &quot;completed&quot;
FAILED | &quot;failed&quot;



## Enum: TypeEnum

Name | Value
---- | -----
DELETE_PHONE_NUMBER_BLOCK | &quot;delete_phone_number_block&quot;



