

# CallStreamingFailedPayloadStreamParams

Streaming parameters as they were originally given to the Call Control API.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**streamUrl** | **String** | The destination WebSocket address where the stream is going to be delivered. |  [optional] |
|**track** | [**TrackEnum**](#TrackEnum) | Specifies which track should be streamed. |  [optional] |



## Enum: TrackEnum

| Name | Value |
|---- | -----|
| INBOUND_TRACK | &quot;inbound_track&quot; |
| OUTBOUND_TRACK | &quot;outbound_track&quot; |
| BOTH_TRACKS | &quot;both_tracks&quot; |



