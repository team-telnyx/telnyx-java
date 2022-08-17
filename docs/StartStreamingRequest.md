

# StartStreamingRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**streamUrl** | **String** | The destination WebSocket address where the stream is going to be delivered. |  [optional] |
|**streamTrack** | [**StreamTrackEnum**](#StreamTrackEnum) | Specifies which track should be streamed. |  [optional] |
|**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional] |
|**commandId** | **String** | Use this field to avoid duplicate commands. Telnyx will ignore any command with the same &#x60;command_id&#x60; for the same &#x60;call_control_id&#x60;. |  [optional] |
|**enableDialogflow** | **Boolean** | Enables Dialogflow for the current call. The default value is false. |  [optional] |
|**dialogflowConfig** | [**DialogflowConfig**](DialogflowConfig.md) |  |  [optional] |



## Enum: StreamTrackEnum

| Name | Value |
|---- | -----|
| INBOUND_TRACK | &quot;inbound_track&quot; |
| OUTBOUND_TRACK | &quot;outbound_track&quot; |
| BOTH_TRACKS | &quot;both_tracks&quot; |



