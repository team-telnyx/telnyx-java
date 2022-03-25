

# FaxDeliveredPayload


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callDurationSecs** | **Integer** | The duration of the call in seconds. |  [optional]
**connectionId** | **String** | The ID of the connection that was used to send the fax. |  [optional]
**direction** | [**DirectionEnum**](#DirectionEnum) | The direction of the fax. |  [optional]
**faxId** | **UUID** | Identifies the fax. |  [optional]
**originalMediaUrl** | **String** | The original URL to the PDF used for the fax&#39;s media. If media_name was supplied, this is omitted |  [optional]
**mediaName** | **String** | The media_name used for the fax&#39;s media. Must point to a file previously uploaded to api.telnyx.com/v2/media by the same user/organization |  [optional]
**to** | **String** | The phone number, in E.164 format, the fax will be sent to or SIP URI |  [optional]
**from** | **String** | The phone number, in E.164 format, the fax will be sent from. |  [optional]
**userId** | **UUID** | Identifier of the user to whom the fax belongs |  [optional]
**pageCount** | **Integer** | Number of transferred pages |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the fax. |  [optional]



## Enum: DirectionEnum

Name | Value
---- | -----
INBOUND | &quot;inbound&quot;
OUTBOUND | &quot;outbound&quot;



## Enum: StatusEnum

Name | Value
---- | -----
DELIVERED | &quot;delivered&quot;



