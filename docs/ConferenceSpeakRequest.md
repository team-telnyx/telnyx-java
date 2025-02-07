

# ConferenceSpeakRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callControlIds** | **List&lt;String&gt;** | Call Control IDs of participants who will hear the spoken text. When empty all participants will hear the spoken text. |  [optional] |
|**payload** | **String** | The text or SSML to be converted into speech. There is a 3,000 character limit. |  |
|**payloadType** | [**PayloadTypeEnum**](#PayloadTypeEnum) | The type of the provided payload. The payload can either be plain text, or Speech Synthesis Markup Language (SSML). |  [optional] |
|**voice** | **String** | Specifies the voice used in speech synthesis.  - Define voices using the format &#x60;&lt;Provider&gt;.&lt;Model&gt;.&lt;VoiceId&gt;&#x60;. Specifying only the provider will give default values for voice_id and model_id.   **Supported Providers:** - **AWS:** Use &#x60;AWS.Polly.&lt;VoiceId&gt;&#x60; (e.g., &#x60;AWS.Polly.Joanna&#x60;). For neural voices, which provide more realistic, human-like speech, append &#x60;-Neural&#x60; to the &#x60;VoiceId&#x60; (e.g., &#x60;AWS.Polly.Joanna-Neural&#x60;). Check the [available voices](https://docs.aws.amazon.com/polly/latest/dg/available-voices.html) for compatibility. - **Azure:** Use &#x60;Azure.&lt;VoiceId&gt;. (e.g. Azure.en-CA-ClaraNeural, Azure.en-CA-LiamNeural, Azure.en-US-BrianMultilingualNeural, Azure.en-US-AvaMultilingualNeural. For a complete list of voices, go to [Azure Voice Gallery](https://speech.microsoft.com/portal/voicegallery).) - **ElevenLabs:** Use &#x60;ElevenLabs.&lt;ModelId&gt;.&lt;VoiceId&gt;&#x60; (e.g., &#x60;ElevenLabs.eleven_multilingual_v2.21m00Tcm4TlvDq8ikWAM&#x60;). The &#x60;ModelId&#x60; part is optional. To use ElevenLabs, you must provide your ElevenLabs API key as an integration identifier secret in &#x60;\&quot;voice_settings\&quot;: {\&quot;api_key_ref\&quot;: \&quot;&lt;secret_identifier&gt;\&quot;}&#x60;. See [integration secrets documentation](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret) for details. Check [available voices](https://elevenlabs.io/docs/api-reference/get-voices).  - **Telnyx:** Use &#x60;Telnyx.&lt;model_id&gt;.&lt;voice_id&gt;&#x60;  For service_level basic, you may define the gender of the speaker (male or female). |  |
|**voiceSettings** | [**GatherUsingSpeakRequestVoiceSettings**](GatherUsingSpeakRequestVoiceSettings.md) |  |  [optional] |
|**language** | [**LanguageEnum**](#LanguageEnum) | The language you want spoken. This parameter is ignored when a &#x60;Polly.*&#x60; voice is specified. |  [optional] |
|**commandId** | **String** | Use this field to avoid execution of duplicate commands. Telnyx will ignore subsequent commands with the same &#x60;command_id&#x60; as one that has already been executed. |  [optional] |



## Enum: PayloadTypeEnum

| Name | Value |
|---- | -----|
| TEXT | &quot;text&quot; |
| SSML | &quot;ssml&quot; |



## Enum: LanguageEnum

| Name | Value |
|---- | -----|
| ARB | &quot;arb&quot; |
| CMN_CN | &quot;cmn-CN&quot; |
| CY_GB | &quot;cy-GB&quot; |
| DA_DK | &quot;da-DK&quot; |
| DE_DE | &quot;de-DE&quot; |
| EN_AU | &quot;en-AU&quot; |
| EN_GB | &quot;en-GB&quot; |
| EN_GB_WLS | &quot;en-GB-WLS&quot; |
| EN_IN | &quot;en-IN&quot; |
| EN_US | &quot;en-US&quot; |
| ES_ES | &quot;es-ES&quot; |
| ES_MX | &quot;es-MX&quot; |
| ES_US | &quot;es-US&quot; |
| FR_CA | &quot;fr-CA&quot; |
| FR_FR | &quot;fr-FR&quot; |
| HI_IN | &quot;hi-IN&quot; |
| IS_IS | &quot;is-IS&quot; |
| IT_IT | &quot;it-IT&quot; |
| JA_JP | &quot;ja-JP&quot; |
| KO_KR | &quot;ko-KR&quot; |
| NB_NO | &quot;nb-NO&quot; |
| NL_NL | &quot;nl-NL&quot; |
| PL_PL | &quot;pl-PL&quot; |
| PT_BR | &quot;pt-BR&quot; |
| PT_PT | &quot;pt-PT&quot; |
| RO_RO | &quot;ro-RO&quot; |
| RU_RU | &quot;ru-RU&quot; |
| SV_SE | &quot;sv-SE&quot; |
| TR_TR | &quot;tr-TR&quot; |



