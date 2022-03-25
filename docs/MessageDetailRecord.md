

# MessageDetailRecord


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **String** | Unique identifier of the message |  [optional]
**userId** | **String** | Identifier of the Telnyx account who owns the message |  [optional]
**completedAt** | **OffsetDateTime** | Message completion time |  [optional]
**createdAt** | **OffsetDateTime** | Message creation time |  [optional]
**updatedAt** | **OffsetDateTime** | Message updated time |  [optional]
**sentAt** | **OffsetDateTime** | Time when the message was sent |  [optional]
**carrier** | **String** | Country-specific carrier used to send or receive the message |  [optional]
**carrierFee** | **String** | Fee charged by certain carriers in order to deliver certain message types. Telnyx passes this fee on to the customer according to our pricing table |  [optional]
**cld** | **String** | The recipient of the message (to parameter in the Messaging API) |  [optional]
**cli** | **String** | The sender of the message (from parameter in the Messaging API). For Alphanumeric ID messages, this is the sender ID value |  [optional]
**countryCode** | **String** | Two-letter representation of the country of the cld property using the ISO 3166-1 alpha-2 format |  [optional]
**deliveryStatus** | **String** | Final webhook delivery status |  [optional]
**deliveryStatusFailoverUrl** | **String** | Failover customer-provided URL which Telnyx posts delivery status webhooks to |  [optional]
**deliveryStatusWebhookUrl** | **String** | Primary customer-provided URL which Telnyx posts delivery status webhooks to |  [optional]
**direction** | [**DirectionEnum**](#DirectionEnum) | Logical direction of the message from the Telnyx customer&#39;s perspective. It&#39;s inbound when the Telnyx customer receives the message, or outbound otherwise |  [optional]
**fteu** | **Boolean** | Indicates whether this is a Free-To-End-User (FTEU) short code message |  [optional]
**mcc** | **String** | Mobile country code. Only available for certain products, such as Global Outbound-Only from Alphanumeric Sender ID |  [optional]
**mnc** | **String** | Mobile network code. Only available for certain products, such as Global Outbound-Only from Alphanumeric Sender ID |  [optional]
**messageType** | [**MessageTypeEnum**](#MessageTypeEnum) | Describes the Messaging service used to send the message. Available services are: Short Message Service (SMS), Multimedia Messaging Service (MMS), and Rich Communication Services (RCS) |  [optional]
**onNet** | **Boolean** | Indicates whether both sender and recipient numbers are Telnyx-managed |  [optional]
**profileId** | **String** | Unique identifier of the Messaging Profile used to send or receive the message |  [optional]
**profileName** | **String** | Name of the Messaging Profile used to send or receive the message |  [optional]
**sourceCountryCode** | **String** | Two-letter representation of the country of the cli property using the ISO 3166-1 alpha-2 format |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Final status of the message after the delivery attempt |  [optional]
**tags** | **String** | Comma-separated tags assigned to the Telnyx number associated with the message |  [optional]
**rate** | **String** | Currency amount per billing unit used to calculate the Telnyx billing cost |  [optional]
**currency** | **String** | Telnyx account currency used to describe monetary values, including billing cost |  [optional]
**cost** | **String** | Amount, in the user currency, for the Telnyx billing cost |  [optional]
**errors** | **List&lt;String&gt;** | Telnyx API error codes returned by the Telnyx gateway |  [optional]
**parts** | **Integer** | Number of message parts. The message is broken down in multiple parts when its length surpasses the limit of 160 characters |  [optional]
**recordType** | **String** | Identifies the record schema | 



## Enum: DirectionEnum

Name | Value
---- | -----
INBOUND | &quot;inbound&quot;
OUTBOUND | &quot;outbound&quot;



## Enum: MessageTypeEnum

Name | Value
---- | -----
SMS | &quot;SMS&quot;
MMS | &quot;MMS&quot;
RCS | &quot;RCS&quot;



## Enum: StatusEnum

Name | Value
---- | -----
GW_TIMEOUT | &quot;gw_timeout&quot;
DELIVERED | &quot;delivered&quot;
DLR_UNCONFIRMED | &quot;dlr_unconfirmed&quot;
DLR_TIMEOUT | &quot;dlr_timeout&quot;
RECEIVED | &quot;received&quot;
GW_REJECT | &quot;gw_reject&quot;
FAILED | &quot;failed&quot;



