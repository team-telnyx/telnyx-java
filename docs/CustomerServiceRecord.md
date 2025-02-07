

# CustomerServiceRecord


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Uniquely identifies this customer service record |  [optional] [readonly] |
|**phoneNumber** | **String** | The phone number of the customer service record. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the customer service record |  [optional] |
|**errorMessage** | **String** | The error message in case status is &#x60;failed&#x60;. This field would be null in case of &#x60;pending&#x60; or &#x60;completed&#x60; status. |  [optional] |
|**result** | [**CustomerServiceRecordResult**](CustomerServiceRecordResult.md) |  |  [optional] |
|**recordType** | **String** | Identifies the type of the resource. |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was created. |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was created. |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| COMPLETED | &quot;completed&quot; |
| FAILED | &quot;failed&quot; |



