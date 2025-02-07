

# InboundMessagePayload


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) | Identifies the type of the resource. |  [optional] |
|**direction** | [**DirectionEnum**](#DirectionEnum) | The direction of the message. Inbound messages are sent to you whereas outbound messages are sent from you. |  [optional] |
|**id** | **UUID** | Identifies the type of resource. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of message. This value can be either &#39;sms&#39; or &#39;mms&#39;. |  [optional] |
|**messagingProfileId** | **String** | Unique identifier for a messaging profile. |  [optional] |
|**to** | [**List&lt;InboundMessagePayloadToInner&gt;**](InboundMessagePayloadToInner.md) |  |  [optional] |
|**cc** | [**List&lt;InboundMessagePayloadCcInner&gt;**](InboundMessagePayloadCcInner.md) |  |  [optional] |
|**from** | [**InboundMessagePayloadFrom**](InboundMessagePayloadFrom.md) |  |  [optional] |
|**text** | **String** | Message body (i.e., content) as a non-empty string.  **Required for SMS** |  [optional] |
|**media** | [**List&lt;InboundMessagePayloadMediaInner&gt;**](InboundMessagePayloadMediaInner.md) |  |  [optional] |
|**webhookUrl** | **String** | The URL where webhooks related to this message will be sent. |  [optional] |
|**webhookFailoverUrl** | **String** | The failover URL where webhooks related to this message will be sent if sending to the primary URL fails. |  [optional] |
|**encoding** | **String** | Encoding scheme used for the message body. |  [optional] |
|**parts** | **Integer** | Number of parts into which the message&#39;s body must be split. |  [optional] |
|**tags** | **List&lt;String&gt;** | Tags associated with the resource. |  [optional] |
|**cost** | [**OutboundMessagePayloadCost**](OutboundMessagePayloadCost.md) |  |  [optional] |
|**receivedAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the message request was received. |  [optional] |
|**sentAt** | **OffsetDateTime** | Not used for inbound messages. |  [optional] |
|**completedAt** | **OffsetDateTime** | Not used for inbound messages. |  [optional] |
|**validUntil** | **OffsetDateTime** | Not used for inbound messages. |  [optional] |
|**errors** | [**List&lt;Error&gt;**](Error.md) | These errors may point at addressees when referring to unsuccessful/unconfirmed delivery statuses. |  [optional] |



## Enum: RecordTypeEnum

| Name | Value |
|---- | -----|
| MESSAGE | &quot;message&quot; |



## Enum: DirectionEnum

| Name | Value |
|---- | -----|
| INBOUND | &quot;inbound&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SMS | &quot;SMS&quot; |
| MMS | &quot;MMS&quot; |



