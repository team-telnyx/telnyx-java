

# FaxFailedPayload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connectionId** | **String** | The ID of the connection that was used to send the fax. |  [optional]
**direction** | [**DirectionEnum**](#DirectionEnum) | The direction of the fax. |  [optional]
**faxId** | [**UUID**](UUID.md) | Identifies the fax. |  [optional]
**originalMediaUrl** | **String** | The original URL to the PDF used for the fax&#39;s media. |  [optional]
**to** | **String** | The phone number, in E.164 format, the fax will be sent to or SIP URI |  [optional]
**from** | **String** | The phone number, in E.164 format, the fax will be sent from. |  [optional]
**userId** | [**UUID**](UUID.md) | Identifier of the user to whom the fax belongs |  [optional]
**failureReason** | [**FailureReasonEnum**](#FailureReasonEnum) | Cause of the sending failure |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the fax. |  [optional]



## Enum: DirectionEnum

Name | Value
---- | -----
INBOUND | &quot;inbound&quot;
OUTBOUND | &quot;outbound&quot;



## Enum: FailureReasonEnum

Name | Value
---- | -----
REJECTED | &quot;rejected&quot;



## Enum: StatusEnum

Name | Value
---- | -----
FAILED | &quot;failed&quot;



