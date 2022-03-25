

# PhoneNumbersJob


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Identifies the resource. |  [optional] [readonly]
**recordType** | **String** | Identifies the type of the resource. |  [optional] [readonly]
**status** | [**StatusEnum**](#StatusEnum) | Indicates the completion status of the background update. |  [optional] [readonly]
**type** | [**TypeEnum**](#TypeEnum) | Identifies the type of the background job. |  [optional] [readonly]
**etc** | **OffsetDateTime** | ISO 8601 formatted date indicating when the estimated time of completion of the background job. |  [optional] [readonly]
**createdAt** | **String** | ISO 8601 formatted date indicating when the resource was created. |  [optional] [readonly]
**updatedAt** | **String** | ISO 8601 formatted date indicating when the resource was updated. |  [optional] [readonly]
**phoneNumbers** | [**List&lt;PhoneNumbersJobPhoneNumber&gt;**](PhoneNumbersJobPhoneNumber.md) |  |  [optional]
**successfulOperations** | [**List&lt;PhoneNumbersJobSuccessfulOperation&gt;**](PhoneNumbersJobSuccessfulOperation.md) |  |  [optional] [readonly]
**pendingOperations** | [**List&lt;PhoneNumbersJobPendingOperation&gt;**](PhoneNumbersJobPendingOperation.md) |  |  [optional] [readonly]
**failedOperations** | [**List&lt;PhoneNumbersJobFailedOperation&gt;**](PhoneNumbersJobFailedOperation.md) |  |  [optional] [readonly]



## Enum: StatusEnum

Name | Value
---- | -----
PENDING | &quot;pending&quot;
IN_PROGRESS | &quot;in_progress&quot;
COMPLETED | &quot;completed&quot;
FAILED | &quot;failed&quot;
EXPIRED | &quot;expired&quot;



## Enum: TypeEnum

Name | Value
---- | -----
UPDATE_EMERGENCY_SETTINGS | &quot;update_emergency_settings&quot;
DELETE_PHONE_NUMBERS | &quot;delete_phone_numbers&quot;
UPDATE_PHONE_NUMBERS | &quot;update_phone_numbers&quot;



