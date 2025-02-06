

# CallStreamingFailedPayload


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callControlId** | **String** | Call ID used to issue commands via Call Control API. |  [optional] |
|**connectionId** | **String** | Call Control App ID (formerly Telnyx connection ID) used in the call. |  [optional] |
|**callLegId** | **String** | ID that is unique to the call and can be used to correlate webhook events. |  [optional] |
|**callSessionId** | **String** | ID that is unique to the call session and can be used to correlate webhook events. Call session is a group of related call legs that logically belong to the same phone call, e.g. an inbound and outbound leg of a transferred call. |  [optional] |
|**clientState** | **String** | State received from a command. |  [optional] |
|**failureReason** | **String** | A short description explaning why the media streaming failed. |  [optional] |
|**streamId** | **UUID** | Identifies the streaming. |  [optional] |
|**streamParams** | [**CallStreamingFailedPayloadStreamParams**](CallStreamingFailedPayloadStreamParams.md) |  |  [optional] |
|**streamType** | [**StreamTypeEnum**](#StreamTypeEnum) | The type of stream connection the stream is performing. |  [optional] |



## Enum: StreamTypeEnum

| Name | Value |
|---- | -----|
| WEBSOCKET | &quot;websocket&quot; |
| DIALOGFLOW | &quot;dialogflow&quot; |



