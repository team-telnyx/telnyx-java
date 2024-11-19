

# GatherUsingAIRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**parameters** | **Object** | The parameters described as a JSON Schema object that needs to be gathered by the voice assistant. See the [JSON Schema reference](https://json-schema.org/understanding-json-schema) for documentation about the format |  |
|**voice** | **String** | The voice to be used by the voice assistant. Currently we support ElevenLabs, Telnyx and AWS voices only, for ElevenLabs voices you can pass the voice as &#x60;ElevenLabs.&lt;model_id&gt;.&lt;voice_id&gt;&#x60;, for Telnyx voices you can pass the voice as &#x60;Telnyx.&lt;model_id&gt;.&lt;voice_id&gt;&#x60;, for AWS Polly voices you can pass the voice as &#x60;AWS.Polly.&lt;voice_id&gt;&#x60; |  [optional] |
|**voiceSettings** | [**GatherUsingAIRequestVoiceSettings**](GatherUsingAIRequestVoiceSettings.md) |  |  [optional] |
|**greeting** | **String** | Text that will be played when the gathering starts, if none then nothing will be played when the gathering starts. The greeting can be text for any voice or SSML for &#x60;AWS.Polly.&lt;voice_id&gt;&#x60; voices. There is a 3,000 character limit. |  [optional] |
|**assistant** | [**Assistant**](Assistant.md) |  |  [optional] |
|**messageHistory** | [**List&lt;CallAIGatherEndedPayloadMessageHistoryInner&gt;**](CallAIGatherEndedPayloadMessageHistoryInner.md) | The message history you want the voice assistant to be aware of, this can be useful to keep the context of the conversation, or to pass additional information to the voice assistant. |  [optional] |
|**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional] |
|**commandId** | **String** | Use this field to avoid duplicate commands. Telnyx will ignore any command with the same &#x60;command_id&#x60; for the same &#x60;call_control_id&#x60;. |  [optional] |



