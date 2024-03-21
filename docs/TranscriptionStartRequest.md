

# TranscriptionStartRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transcriptionEngine** | [**TranscriptionEngineEnum**](#TranscriptionEngineEnum) | Engine to use for speech recognition. &#x60;A&#x60; - &#x60;google&#x60;, &#x60;B&#x60; - &#x60;telnyx&#x60;. |  [optional] |
|**language** | [**LanguageEnum**](#LanguageEnum) | Language to use for speech recognition |  [optional] |
|**interimResults** | **Boolean** | Whether to send also interim results. If set to false, only final results will be sent. Applies to &#x60;google&#x60; engine only. |  [optional] |
|**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional] |
|**transcriptionTracks** | **String** | Indicates which leg of the call will be transcribed. Use &#x60;inbound&#x60; for the leg that requested the transcription, &#x60;outbound&#x60; for the other leg, and &#x60;both&#x60; for both legs of the call. Will default to &#x60;inbound&#x60;. |  [optional] |
|**commandId** | **String** | Use this field to avoid duplicate commands. Telnyx will ignore any command with the same &#x60;command_id&#x60; for the same &#x60;call_control_id&#x60;. |  [optional] |



## Enum: TranscriptionEngineEnum

| Name | Value |
|---- | -----|
| A | &quot;A&quot; |
| B | &quot;B&quot; |



## Enum: LanguageEnum

| Name | Value |
|---- | -----|
| DE | &quot;de&quot; |
| EN | &quot;en&quot; |
| ES | &quot;es&quot; |
| FR | &quot;fr&quot; |
| IT | &quot;it&quot; |
| PL | &quot;pl&quot; |



