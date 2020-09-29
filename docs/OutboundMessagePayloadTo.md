# OutboundMessagePayloadTo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**phoneNumber** | **String** | Receiving address (+E.164 formatted phone number or short code). |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The delivery status of the message. |  [optional]
**carrier** | **String** | The carrier of the receiver. |  [optional]
**lineType** | [**LineTypeEnum**](#LineTypeEnum) | The line-type of the receiver. |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
QUEUED | &quot;queued&quot;
SENDING | &quot;sending&quot;
SENT | &quot;sent&quot;
EXPIRED | &quot;expired&quot;
SENDING_FAILED | &quot;sending_failed&quot;
DELIVERY_UNCONFIRMED | &quot;delivery_unconfirmed&quot;
DELIVERED | &quot;delivered&quot;
DELIVERY_FAILED | &quot;delivery_failed&quot;

<a name="LineTypeEnum"></a>
## Enum: LineTypeEnum
Name | Value
---- | -----
WIRELINE | &quot;Wireline&quot;
WIRELESS | &quot;Wireless&quot;
VOWIFI | &quot;VoWiFi&quot;
VOIP | &quot;VoIP&quot;
PRE_PAID_WIRELESS | &quot;Pre-Paid Wireless&quot;
