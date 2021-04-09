

# GatherUsingSpeakRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**payload** | **String** | The text or SSML to be converted into speech. There is a 5,000 character limit. | 
**invalidPayload** | **String** | The text or SSML to be converted into speech when digits don&#39;t match the &#x60;valid_digits&#x60; parameter or the number of digits is not between &#x60;min&#x60; and &#x60;max&#x60;. There is a 5,000 character limit. |  [optional]
**payloadType** | [**PayloadTypeEnum**](#PayloadTypeEnum) | The type of the provided payload. The payload can either be plain text, or Speech Synthesis Markup Language (SSML). |  [optional]
**serviceLevel** | [**ServiceLevelEnum**](#ServiceLevelEnum) | This parameter impacts speech quality, language options and payload types. When using &#x60;basic&#x60;, only the &#x60;en-US&#x60; language and payload type &#x60;text&#x60; are allowed. |  [optional]
**voice** | [**VoiceEnum**](#VoiceEnum) | The gender of the voice used to speak back the text. | 
**language** | [**LanguageEnum**](#LanguageEnum) | The language you want spoken. | 
**minimumDigits** | **Integer** | The minimum number of digits to fetch. This parameter has a minimum value of 1. |  [optional]
**maximumDigits** | **Integer** | The maximum number of digits to fetch. This parameter has a maximum value of 128. |  [optional]
**maximumTries** | **Integer** | The maximum number of times that a file should be played back if there is no input from the user on the call. |  [optional]
**timeoutMillis** | **Integer** | The number of milliseconds to wait for a DTMF response after speak ends before a replaying the sound file. |  [optional]
**terminatingDigit** | **String** | The digit used to terminate input if fewer than &#x60;maximum_digits&#x60; digits have been gathered. |  [optional]
**validDigits** | **String** | A list of all digits accepted as valid. |  [optional]
**interDigitTimeoutMillis** | **Integer** | The number of milliseconds to wait for input between digits. |  [optional]
**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional]
**commandId** | **String** | Use this field to avoid duplicate commands. Telnyx will ignore commands with the same &#x60;command_id&#x60;. |  [optional]



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



