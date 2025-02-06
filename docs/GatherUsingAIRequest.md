

# GatherUsingAIRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**parameters** | **Object** | The parameters described as a JSON Schema object that needs to be gathered by the voice assistant. See the [JSON Schema reference](https://json-schema.org/understanding-json-schema) for documentation about the format |  |
|**assistant** | [**Assistant**](Assistant.md) |  |  [optional] |
|**transcription** | [**TranscriptionConfig**](TranscriptionConfig.md) |  |  [optional] |
|**voice** | **String** | The voice to be used by the voice assistant. Currently we support ElevenLabs, Telnyx and AWS voices.   **Supported Providers:** - **AWS:** Use &#x60;AWS.Polly.&lt;VoiceId&gt;&#x60; (e.g., &#x60;AWS.Polly.Joanna&#x60;). For neural voices, which provide more realistic, human-like speech, append &#x60;-Neural&#x60; to the &#x60;VoiceId&#x60; (e.g., &#x60;AWS.Polly.Joanna-Neural&#x60;). Check the [available voices](https://docs.aws.amazon.com/polly/latest/dg/available-voices.html) for compatibility. - **Azure:** Use &#x60;Azure.&lt;VoiceId&gt;. (e.g. Azure.en-CA-ClaraNeural, Azure.en-CA-LiamNeural, Azure.en-US-BrianMultilingualNeural, Azure.en-US-AvaMultilingualNeural. For a complete list of voices, go to [Azure Voice Gallery](https://speech.microsoft.com/portal/voicegallery).) - **ElevenLabs:** Use &#x60;ElevenLabs.&lt;ModelId&gt;.&lt;VoiceId&gt;&#x60; (e.g., &#x60;ElevenLabs.BaseModel.John&#x60;). The &#x60;ModelId&#x60; part is optional. To use ElevenLabs, you must provide your ElevenLabs API key as an integration secret under &#x60;\&quot;voice_settings\&quot;: {\&quot;api_key_ref\&quot;: \&quot;&lt;secret_id&gt;\&quot;}&#x60;. See [integration secrets documentation](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret) for details. Check [available voices](https://elevenlabs.io/docs/api-reference/get-voices).  - **Telnyx:** Use &#x60;Telnyx.&lt;model_id&gt;.&lt;voice_id&gt;&#x60; |  [optional] |
|**voiceSettings** | [**AIAssistantStartRequestVoiceSettings**](AIAssistantStartRequestVoiceSettings.md) |  |  [optional] |
|**greeting** | **String** | Text that will be played when the gathering starts, if none then nothing will be played when the gathering starts. The greeting can be text for any voice or SSML for &#x60;AWS.Polly.&lt;voice_id&gt;&#x60; voices. There is a 3,000 character limit. |  [optional] |
|**sendPartialResults** | **Boolean** | Default is &#x60;false&#x60;. If set to &#x60;true&#x60;, the voice assistant will send partial results via the &#x60;call.ai_gather.partial_results&#x60; [callback](https://developers.telnyx.com/api/call-control/call-gather-using-ai#callbacks) in real time as individual fields are gathered. If set to &#x60;false&#x60;, the voice assistant will only send the final result via the &#x60;call.ai_gather.ended&#x60; callback. |  [optional] |
|**messageHistory** | [**List&lt;GatherUsingAIRequestMessageHistoryInner&gt;**](GatherUsingAIRequestMessageHistoryInner.md) | The message history you want the voice assistant to be aware of, this can be useful to keep the context of the conversation, or to pass additional information to the voice assistant. |  [optional] |
|**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional] |
|**commandId** | **String** | Use this field to avoid duplicate commands. Telnyx will ignore any command with the same &#x60;command_id&#x60; for the same &#x60;call_control_id&#x60;. |  [optional] |
|**interruptionSettings** | [**InterruptionSettings**](InterruptionSettings.md) |  |  [optional] |



