

# ConferenceSpeakRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callControlIds** | **List&lt;String&gt;** | Call Control IDs of participants who will hear the spoken text. When empty all participants will hear the spoken text. |  [optional]
**payload** | **String** | The text or SSML to be converted into speech. There is a 3,000 character limit. | 
**payloadType** | [**PayloadTypeEnum**](#PayloadTypeEnum) | The type of the provided payload. The payload can either be plain text, or Speech Synthesis Markup Language (SSML). |  [optional]
**voice** | [**VoiceEnum**](#VoiceEnum) | The gender of the voice used to speak the text. | 
**language** | [**LanguageEnum**](#LanguageEnum) | The language used to speak the text. | 
**commandId** | **String** | Use this field to avoid execution of duplicate commands. Telnyx will ignore subsequent commands with the same &#x60;command_id&#x60; as one that has already been executed. |  [optional]



## Enum: PayloadTypeEnum

Name | Value
---- | -----
TEXT | &quot;text&quot;
SSML | &quot;ssml&quot;



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



