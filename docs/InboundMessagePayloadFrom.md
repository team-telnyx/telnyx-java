

# InboundMessagePayloadFrom


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**phoneNumber** | **String** | Sending address (+E.164 formatted phone number, alphanumeric sender ID, or short code). |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**carrier** | **String** | The carrier of the sender. |  [optional]
**lineType** | [**LineTypeEnum**](#LineTypeEnum) | The line-type of the sender. |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
RECEIVED | &quot;received&quot;
DELIVERED | &quot;delivered&quot;



## Enum: LineTypeEnum

Name | Value
---- | -----
WIRELINE | &quot;Wireline&quot;
WIRELESS | &quot;Wireless&quot;
VOWIFI | &quot;VoWiFi&quot;
VOIP | &quot;VoIP&quot;
PRE_PAID_WIRELESS | &quot;Pre-Paid Wireless&quot;
EMPTY | &quot;&quot;



