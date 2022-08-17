

# CallGatherEndedPayload


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callControlId** | **String** | Call ID used to issue commands via Call Control API. |  [optional] |
|**connectionId** | **String** | Call Control App ID (formerly Telnyx connection ID) used in the call. |  [optional] |
|**callLegId** | **String** | ID that is unique to the call and can be used to correlate webhook events. |  [optional] |
|**callSessionId** | **String** | ID that is unique to the call session and can be used to correlate webhook events. Call session is a group of related call legs that logically belong to the same phone call, e.g. an inbound and outbound leg of a transferred call. |  [optional] |
|**clientState** | **String** | State received from a command. |  [optional] |
|**from** | **String** | Number or SIP URI placing the call. |  [optional] |
|**to** | **String** | Destination number or SIP URI of the call. |  [optional] |
|**digits** | **String** | The received DTMF digit or symbol. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Reflects how command ended. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| VALID | &quot;valid&quot; |
| INVALID | &quot;invalid&quot; |
| CALL_HANGUP | &quot;call_hangup&quot; |
| CANCELLED | &quot;cancelled&quot; |
| CANCELLED_AMD | &quot;cancelled_amd&quot; |
| TIMEOUT | &quot;timeout&quot; |



