

# FaxDeliveredPayload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callDurationSecs** | **Integer** | The duration of the call in seconds. |  [optional]
**connectionId** | **String** | The ID of the connection that was used to send the fax. |  [optional]
**direction** | [**DirectionEnum**](#DirectionEnum) | The direction of the fax. |  [optional]
**faxId** | [**UUID**](UUID.md) | Identifies the fax. |  [optional]
**originalMediaUrl** | **String** | The original URL to the PDF used for the fax&#39;s media. |  [optional]
**to** | **String** | The phone number, in E.164 format, the fax will be sent to or SIP URI |  [optional]
**from** | **String** | The phone number, in E.164 format, the fax will be sent from. |  [optional]
**userId** | [**UUID**](UUID.md) | Identifier of the user to whom the fax belongs |  [optional]
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



