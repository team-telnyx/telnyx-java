

# PortingEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Uniquely identifies the event. |  [optional] |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) | Identifies the event type |  [optional] |
|**portingOrderId** | **UUID** | Identifies the porting order associated with the event. |  [optional] |
|**availableNotificationMethods** | [**List&lt;AvailableNotificationMethodsEnum&gt;**](#List&lt;AvailableNotificationMethodsEnum&gt;) | Indicates the notification methods used. |  [optional] |
|**payloadStatus** | [**PayloadStatusEnum**](#PayloadStatusEnum) | The status of the payload generation. |  [optional] |
|**payload** | [**PortingEventPayload**](PortingEventPayload.md) |  |  [optional] |
|**recordType** | **String** | Identifies the type of the resource. |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was created. |  [optional] |
|**updatedAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was updated. |  [optional] |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| PORTING_ORDER_DELETED | &quot;porting_order.deleted&quot; |
| PORTING_ORDER_LOA_UPDATED | &quot;porting_order.loa_updated&quot; |
| PORTING_ORDER_MESSAGING_CHANGED | &quot;porting_order.messaging_changed&quot; |
| PORTING_ORDER_STATUS_CHANGED | &quot;porting_order.status_changed&quot; |
| PORTING_ORDER_SHARING_TOKEN_EXPIRED | &quot;porting_order.sharing_token_expired&quot; |
| PORTING_ORDER_NEW_COMMENT | &quot;porting_order.new_comment&quot; |
| PORTING_ORDER_SPLIT | &quot;porting_order.split&quot; |



## Enum: List&lt;AvailableNotificationMethodsEnum&gt;

| Name | Value |
|---- | -----|
| EMAIL | &quot;email&quot; |
| WEBHOOK | &quot;webhook&quot; |
| WEBHOOK_V1 | &quot;webhook_v1&quot; |



## Enum: PayloadStatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;created&quot; |
| COMPLETED | &quot;completed&quot; |



