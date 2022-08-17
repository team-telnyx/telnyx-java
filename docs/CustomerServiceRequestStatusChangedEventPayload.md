

# CustomerServiceRequestStatusChangedEventPayload


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Uniquely identifies the customer service request. |  [optional] |
|**phoneNumber** | **String** | The phone number of the customer service request. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the customer service request |  [optional] |
|**updatedAt** | **OffsetDateTime** | ISO 8601 formatted date indicating the last time where the resource was updated. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| COMPLETED | &quot;completed&quot; |
| FAILED | &quot;failed&quot; |



