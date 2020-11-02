# OutboundMessage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) | Identifies the type of the resource. |  [optional]
**direction** | [**DirectionEnum**](#DirectionEnum) | The direction of the message. Inbound messages are sent to you whereas outbound messages are sent from you. |  [optional]
**id** | [**UUID**](UUID.md) | Identifies the type of resource. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of message. |  [optional]
**messagingProfileId** | [**UUID**](UUID.md) | Unique identifier for a messaging profile. |  [optional]
**from** | [**OutboundMessageFrom**](OutboundMessageFrom.md) |  |  [optional]
**to** | [**List&lt;OutboundMessageTo&gt;**](OutboundMessageTo.md) |  |  [optional]
**text** | **String** | Message body (i.e., content) as a non-empty string.  **Required for SMS** |  [optional]
**subject** | **String** | Subject of multimedia message |  [optional]
**media** | [**List&lt;OutboundMessageMedia&gt;**](OutboundMessageMedia.md) |  |  [optional]
**webhookUrl** | **String** | The URL where webhooks related to this message will be sent. |  [optional]
**webhookFailoverUrl** | **String** | The failover URL where webhooks related to this message will be sent if sending to the primary URL fails. |  [optional]
**encoding** | **String** | Encoding scheme used for the message body. |  [optional]
**parts** | **Integer** | Number of parts into which the message&#x27;s body must be split. |  [optional]
**tags** | **List&lt;String&gt;** | Tags associated with the resource. |  [optional]
**cost** | [**OutboundMessageCost**](OutboundMessageCost.md) |  |  [optional]
**receivedAt** | [**OffsetDateTime**](OffsetDateTime.md) | ISO 8601 formatted date indicating when the message request was received. |  [optional]
**sentAt** | [**OffsetDateTime**](OffsetDateTime.md) | ISO 8601 formatted date indicating when the message was sent. |  [optional]
**completedAt** | [**OffsetDateTime**](OffsetDateTime.md) | ISO 8601 formatted date indicating when the message was finalized. |  [optional]
**validUntil** | [**OffsetDateTime**](OffsetDateTime.md) | Message must be out of the queue by this time or else it will be discarded and marked as &#x27;sending_failed&#x27;. Once the message moves out of the queue, this field will be nulled |  [optional]
**errors** | [**List&lt;Error&gt;**](Error.md) | These errors may point at addressees when referring to unsuccessful/unconfirmed delivery statuses. |  [optional]

<a name="RecordTypeEnum"></a>
## Enum: RecordTypeEnum
Name | Value
---- | -----
MESSAGE | &quot;message&quot;

<a name="DirectionEnum"></a>
## Enum: DirectionEnum
Name | Value
---- | -----
OUTBOUND | &quot;outbound&quot;

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
SMS | &quot;SMS&quot;
MMS | &quot;MMS&quot;
