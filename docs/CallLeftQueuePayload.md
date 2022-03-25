

# CallLeftQueuePayload


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callControlId** | **String** | Call ID used to issue commands via Call Control API. |  [optional]
**connectionId** | **String** | Telnyx connection ID used in the call. |  [optional]
**callLegId** | **String** | ID that is unique to the call and can be used to correlate webhook events. |  [optional]
**callSessionId** | **String** | ID that is unique to the call session and can be used to correlate webhook events. Call session is a group of related call legs that logically belong to the same phone call, e.g. an inbound and outbound leg of a transferred call. |  [optional]
**clientState** | **String** | State received from a command. |  [optional]
**queue** | **String** | The name of the queue |  [optional]
**queuePosition** | **Integer** | Last position of the call in the queue. |  [optional]
**reason** | [**ReasonEnum**](#ReasonEnum) | The reason for leaving the queue |  [optional]



## Enum: ReasonEnum

Name | Value
---- | -----
BRIDGED | &quot;bridged&quot;
BRIDGING_IN_PROCESS | &quot;bridging-in-process&quot;
HANGUP | &quot;hangup&quot;
LEAVE | &quot;leave&quot;
TIMEOUT | &quot;timeout&quot;



