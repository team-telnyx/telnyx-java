

# TranscriptionPayloadTranscriptionData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**confidence** | **Double** | Speech recognition confidence level. |  [optional] |
|**isFinal** | **Boolean** | When false, it means that this is an interim result. |  [optional] |
|**transcript** | **String** | Recognized text. |  [optional] |
|**transcriptionTrack** | [**TranscriptionTrackEnum**](#TranscriptionTrackEnum) | Indicates which leg of the call has been transcribed. This is only available when &#x60;transcription_engine&#x60; is set to &#x60;B&#x60;. |  [optional] |



## Enum: TranscriptionTrackEnum

| Name | Value |
|---- | -----|
| INBOUND | &quot;inbound&quot; |
| OUTBOUND | &quot;outbound&quot; |



