# OutboundMessageResponseFrom

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**phoneNumber** | **String** | Sending address (+E.164 formatted phone number, alphanumeric sender ID, or short code). |  [optional]
**carrier** | **String** | The carrier of the receiver. |  [optional]
**lineType** | [**LineTypeEnum**](#LineTypeEnum) | The line-type of the receiver. |  [optional]

<a name="LineTypeEnum"></a>
## Enum: LineTypeEnum
Name | Value
---- | -----
WIRELINE | &quot;Wireline&quot;
WIRELESS | &quot;Wireless&quot;
VOWIFI | &quot;VoWiFi&quot;
VOIP | &quot;VoIP&quot;
PRE_PAID_WIRELESS | &quot;Pre-Paid Wireless&quot;
