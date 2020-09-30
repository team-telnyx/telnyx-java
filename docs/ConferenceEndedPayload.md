# ConferenceEndedPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callControlId** | **String** | Call ID used to issue commands via Call Control API. |  [optional]
**connectionId** | **String** | Telnyx connection ID used in the call. |  [optional]
**callLegId** | **String** | ID that is unique to the call and can be used to correlate webhook events. |  [optional]
**callSessionId** | **String** | ID that is unique to the call session and can be used to correlate webhook events. |  [optional]
**clientState** | **String** | State received from a command. |  [optional]
**conferenceId** | **String** | Conference ID that the participant joined. |  [optional]
**occurredAt** | [**OffsetDateTime**](OffsetDateTime.md) | ISO 8601 datetime of when the event occurred. |  [optional]
**reason** | [**ReasonEnum**](#ReasonEnum) | Reason the conference ended. |  [optional]

<a name="ReasonEnum"></a>
## Enum: ReasonEnum
Name | Value
---- | -----
ALL_LEFT | &quot;all_left&quot;
HOST_LEFT | &quot;host_left&quot;
TIME_EXCEEDED | &quot;time_exceeded&quot;
