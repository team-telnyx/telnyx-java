# CallPlaybackEndedPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callControlId** | **String** | Call ID used to issue commands via Call Control API. |  [optional]
**connectionId** | **String** | Telnyx connection ID used in the call. |  [optional]
**callLegId** | **String** | ID that is unique to the call and can be used to correlate webhook events. |  [optional]
**callSessionId** | **String** | ID that is unique to the call session and can be used to correlate webhook events. |  [optional]
**clientState** | **String** | State received from a command. |  [optional]
**mediaUrl** | **String** | The audio URL being played back. |  [optional]
**overlay** | **Boolean** | Whether the audio is going to be played in overlay mode or not. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Reflects how command ended. |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
VALID | &quot;valid&quot;
INVALID | &quot;invalid&quot;
CALL_HANGUP | &quot;call_hangup&quot;
