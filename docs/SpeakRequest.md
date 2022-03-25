

# SpeakRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**payload** | **String** | The text or SSML to be converted into speech. There is a 3,000 character limit. | 
**payloadType** | [**PayloadTypeEnum**](#PayloadTypeEnum) | The type of the provided payload. The payload can either be plain text, or Speech Synthesis Markup Language (SSML). |  [optional]
**serviceLevel** | [**ServiceLevelEnum**](#ServiceLevelEnum) | This parameter impacts speech quality, language options and payload types. When using &#x60;basic&#x60;, only the &#x60;en-US&#x60; language and payload type &#x60;text&#x60; are allowed. |  [optional]
**stop** | **String** | When specified, it stops the current audio being played. Specify &#x60;current&#x60; to stop the current audio being played, and to play the next file in the queue. Specify &#x60;all&#x60; to stop the current audio file being played and to also clear all audio files from the queue. |  [optional]
**voice** | [**VoiceEnum**](#VoiceEnum) | The gender of the voice used to speak back the text. | 
**language** | [**LanguageEnum**](#LanguageEnum) | The language you want spoken. | 
**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional]
**commandId** | **String** | Use this field to avoid duplicate commands. Telnyx will ignore any command with the same &#x60;command_id&#x60; for the same &#x60;call_control_id&#x60;. |  [optional]



## Enum: PayloadTypeEnum

Name | Value
---- | -----
TEXT | &quot;text&quot;
SSML | &quot;ssml&quot;



## Enum: ServiceLevelEnum

Name | Value
---- | -----
BASIC | &quot;basic&quot;
PREMIUM | &quot;premium&quot;



## Enum: VoiceEnum

Name | Value
---- | -----
MALE | &quot;male&quot;
FEMALE | &quot;female&quot;



## Enum: LanguageEnum

Name | Value
---- | -----
ARB | &quot;arb&quot;
CMN_CN | &quot;cmn-CN&quot;
CY_GB | &quot;cy-GB&quot;
DA_DK | &quot;da-DK&quot;
DE_DE | &quot;de-DE&quot;
EN_AU | &quot;en-AU&quot;
EN_GB | &quot;en-GB&quot;
EN_GB_WLS | &quot;en-GB-WLS&quot;
EN_IN | &quot;en-IN&quot;
EN_US | &quot;en-US&quot;
ES_ES | &quot;es-ES&quot;
ES_MX | &quot;es-MX&quot;
ES_US | &quot;es-US&quot;
FR_CA | &quot;fr-CA&quot;
FR_FR | &quot;fr-FR&quot;
HI_IN | &quot;hi-IN&quot;
IS_IS | &quot;is-IS&quot;
IT_IT | &quot;it-IT&quot;
JA_JP | &quot;ja-JP&quot;
KO_KR | &quot;ko-KR&quot;
NB_NO | &quot;nb-NO&quot;
NL_NL | &quot;nl-NL&quot;
PL_PL | &quot;pl-PL&quot;
PT_BR | &quot;pt-BR&quot;
PT_PT | &quot;pt-PT&quot;
RO_RO | &quot;ro-RO&quot;
RU_RU | &quot;ru-RU&quot;
SV_SE | &quot;sv-SE&quot;
TR_TR | &quot;tr-TR&quot;



