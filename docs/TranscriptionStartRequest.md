

# TranscriptionStartRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**language** | [**LanguageEnum**](#LanguageEnum) | Language to use for speech recognition |  [optional] |
|**interimResults** | **Boolean** | Whether to send also interim results. If set to false, only final results will be sent. |  [optional] |
|**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional] |
|**transcriptionTracks** | **String** | Indicates which leg of the call will be transcribed. Use &#x60;inbound&#x60; for the leg that requested the transcription, &#x60;outbound&#x60; for the other leg, and &#x60;both&#x60; for both legs of the call. Will default to &#x60;inbound&#x60;. |  [optional] |
|**commandId** | **String** | Use this field to avoid duplicate commands. Telnyx will ignore any command with the same &#x60;command_id&#x60; for the same &#x60;call_control_id&#x60;. |  [optional] |



## Enum: LanguageEnum

| Name | Value |
|---- | -----|
| DE | &quot;de&quot; |
| EN | &quot;en&quot; |
| ES | &quot;es&quot; |
| FR | &quot;fr&quot; |
| IT | &quot;it&quot; |
| PL | &quot;pl&quot; |



