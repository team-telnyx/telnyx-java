

# WhatsAppDetailRecord


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | WhatsApp Message Id |  [optional]
**version** | **String** | WhatsApp API Version |  [optional]
**senderId** | **String** | WhatsApp Sender Id |  [optional]
**recipientId** | **String** | WhatsApp Recipient Id |  [optional]
**messageType** | [**MessageTypeEnum**](#MessageTypeEnum) | WhatsApp Message Type. Consult WhatsApp API documentation to see all available types |  [optional]
**messageStatus** | [**MessageStatusEnum**](#MessageStatusEnum) | WhatsApp Message Status. Consult WhatsApp API documentation to see all available status |  [optional]
**direction** | [**DirectionEnum**](#DirectionEnum) | Logical direction of the message from the Telnyx customer&#39;s perspective. It&#39;s inbound when the Telnyx customer receives the message, or outbound otherwise |  [optional]
**recipientRegionCode** | **String** | CLDR two-letter region-code of recipient |  [optional]
**currency** | **String** | Telnyx account currency used to describe monetary values, including billing cost |  [optional]
**whatsappErrorCode** | **String** | A string representing Whatsapp error code. Consult WhatsApp API documentation to see all available error codes |  [optional]
**createdAt** | **OffsetDateTime** | UTC time when the message was created |  [optional]
**webhookReceivedAt** | **OffsetDateTime** | UTC time when the webhook was received |  [optional]
**webhookId** | **String** | UUID representation of the webhook unique identifier |  [optional]
**telnyxFee** | **String** | Currency amount for Telnyx billing cost |  [optional]
**whatsappFee** | **String** | Currency amount for WhatsApp cost |  [optional]
**recordType** | **String** |  | 



## Enum: MessageTypeEnum

Name | Value
---- | -----
SESSION | &quot;session&quot;
TEMPLATE | &quot;template&quot;



## Enum: MessageStatusEnum

Name | Value
---- | -----
SENT | &quot;sent&quot;
DELIVERED | &quot;delivered&quot;
READ | &quot;read&quot;
FAILED | &quot;failed&quot;
DELETED | &quot;deleted&quot;



## Enum: DirectionEnum

Name | Value
---- | -----
INBOUND | &quot;inbound&quot;
OUTBOUND | &quot;outbound&quot;



