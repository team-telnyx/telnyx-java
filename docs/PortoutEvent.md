

# PortoutEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Uniquely identifies the event. |  [optional] |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) | Identifies the event type |  [optional] |
|**portoutId** | **UUID** | Identifies the port-out order associated with the event. |  [optional] |
|**availableNotificationMethods** | [**List&lt;AvailableNotificationMethodsEnum&gt;**](#List&lt;AvailableNotificationMethodsEnum&gt;) | Indicates the notification methods used. |  [optional] |
|**payloadStatus** | [**PayloadStatusEnum**](#PayloadStatusEnum) | The status of the payload generation. |  [optional] |
|**payload** | [**PortoutEventPayload**](PortoutEventPayload.md) |  |  [optional] |
|**recordType** | **String** | Identifies the type of the resource. |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was created. |  [optional] |
|**updatedAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was updated. |  [optional] |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| STATUS_CHANGED | &quot;portout.status_changed&quot; |
| FOC_DATE_CHANGED | &quot;portout.foc_date_changed&quot; |
| NEW_COMMENT | &quot;portout.new_comment&quot; |



## Enum: List&lt;AvailableNotificationMethodsEnum&gt;

| Name | Value |
|---- | -----|
| EMAIL | &quot;email&quot; |
| WEBHOOK | &quot;webhook&quot; |



## Enum: PayloadStatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;created&quot; |
| COMPLETED | &quot;completed&quot; |



