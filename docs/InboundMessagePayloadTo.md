

# InboundMessagePayloadTo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**phoneNumber** | **String** | Receiving address (+E.164 formatted phone number or short code). |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**carrier** | **String** | The carrier of the receiver. |  [optional]
**lineType** | [**LineTypeEnum**](#LineTypeEnum) | The line-type of the receiver. |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
QUEUED | &quot;queued&quot;
SENDING | &quot;sending&quot;
SENT | &quot;sent&quot;
DELIVERED | &quot;delivered&quot;
SENDING_FAILED | &quot;sending_failed&quot;
DELIVERY_FAILED | &quot;delivery_failed&quot;
DELIVERY_UNCONFIRMED | &quot;delivery_unconfirmed&quot;



## Enum: LineTypeEnum

Name | Value
---- | -----
WIRELINE | &quot;Wireline&quot;
WIRELESS | &quot;Wireless&quot;
VOWIFI | &quot;VoWiFi&quot;
VOIP | &quot;VoIP&quot;
PRE_PAID_WIRELESS | &quot;Pre-Paid Wireless&quot;
EMPTY | &quot;&quot;



