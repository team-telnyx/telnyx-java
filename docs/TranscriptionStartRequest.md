

# TranscriptionStartRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transcriptionEngine** | [**TranscriptionEngineEnum**](#TranscriptionEngineEnum) | Engine to use for speech recognition. &#x60;A&#x60; - &#x60;Google&#x60;, &#x60;B&#x60; - &#x60;Telnyx&#x60;. |  [optional] |
|**language** | [**StartRecordingRequestTranscriptionLanguage**](StartRecordingRequestTranscriptionLanguage.md) |  |  [optional] |
|**interimResults** | **Boolean** | Whether to send also interim results. If set to false, only final results will be sent. Applies to &#x60;google&#x60; engine only. |  [optional] |
|**enableSpeakerDiarization** | **Boolean** | Enables speaker diarization. Applies to &#x60;google&#x60; engine only. |  [optional] |
|**minSpeakerCount** | **Integer** | Defines minimum number of speakers in the conversation. Applies to &#x60;google&#x60; engine only. |  [optional] |
|**maxSpeakerCount** | **Integer** | Defines maximum number of speakers in the conversation. Applies to &#x60;google&#x60; engine only. |  [optional] |
|**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional] |
|**transcriptionTracks** | **String** | Indicates which leg of the call will be transcribed. Use &#x60;inbound&#x60; for the leg that requested the transcription, &#x60;outbound&#x60; for the other leg, and &#x60;both&#x60; for both legs of the call. Will default to &#x60;inbound&#x60;. |  [optional] |
|**commandId** | **String** | Use this field to avoid duplicate commands. Telnyx will ignore any command with the same &#x60;command_id&#x60; for the same &#x60;call_control_id&#x60;. |  [optional] |



## Enum: TranscriptionEngineEnum

| Name | Value |
|---- | -----|
| A | &quot;A&quot; |
| B | &quot;B&quot; |



