

# CallHangupPayload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callControlId** | **String** | Call ID used to issue commands via Call Control API. |  [optional]
**connectionId** | **String** | Telnyx connection ID used in the call. |  [optional]
**callLegId** | **String** | ID that is unique to the call and can be used to correlate webhook events. |  [optional]
**callSessionId** | **String** | ID that is unique to the call session and can be used to correlate webhook events. |  [optional]
**clientState** | **String** | State received from a command. |  [optional]
**from** | **String** | Number or SIP URI placing the call. |  [optional]
**to** | **String** | Destination number or SIP URI of the call. |  [optional]
**state** | [**StateEnum**](#StateEnum) | State received from a command. |  [optional]
**hangupCause** | [**HangupCauseEnum**](#HangupCauseEnum) | The reason the call was ended (&#x60;call_rejected&#x60;, &#x60;normal_clearing&#x60;, &#x60;originator_cancel&#x60;, &#x60;timeout&#x60;, &#x60;time_limit&#x60;, &#x60;user_busy&#x60;, &#x60;not_found&#x60; or &#x60;unspecified&#x60;). |  [optional]
**hangupSource** | [**HangupSourceEnum**](#HangupSourceEnum) | The party who ended the call (&#x60;callee&#x60;, &#x60;caller&#x60;, &#x60;unknown&#x60;). |  [optional]
**sipHangupCause** | **String** | The reason the call was ended (SIP response code). If the SIP response is unavailable (in inbound calls for example) this is set to &#x60;unspecified&#x60;. |  [optional]



## Enum: StateEnum

Name | Value
---- | -----
HANGUP | &quot;hangup&quot;



## Enum: HangupCauseEnum

Name | Value
---- | -----
CALL_REJECTED | &quot;call_rejected&quot;
NORMAL_CLEARING | &quot;normal_clearing&quot;
ORIGINATOR_CANCEL | &quot;originator_cancel&quot;
TIMEOUT | &quot;timeout&quot;
TIME_LIMIT | &quot;time_limit&quot;
USER_BUSY | &quot;user_busy&quot;
NOT_FOUND | &quot;not_found&quot;
UNSPECIFIED | &quot;unspecified&quot;



## Enum: HangupSourceEnum

Name | Value
---- | -----
CALLER | &quot;caller&quot;
CALLEE | &quot;callee&quot;
UNKNOWN | &quot;unknown&quot;



