

# StartRecordingRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**format** | [**FormatEnum**](#FormatEnum) | The audio file format used when storing the call recording. Can be either &#x60;mp3&#x60; or &#x60;wav&#x60;. | 
**channels** | [**ChannelsEnum**](#ChannelsEnum) | When &#x60;dual&#x60;, final audio file will be stereo recorded with the first leg on channel A, and the rest on channel B. | 
**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional]
**commandId** | **String** | Use this field to avoid duplicate commands. Telnyx will ignore commands with the same &#x60;command_id&#x60;. |  [optional]
**playBeep** | **Boolean** | If enabled, a beep sound will be played at the start of a recording. |  [optional]



## Enum: FormatEnum

Name | Value
---- | -----
WAV | &quot;wav&quot;
MP3 | &quot;mp3&quot;



## Enum: ChannelsEnum

Name | Value
---- | -----
SINGLE | &quot;single&quot;
DUAL | &quot;dual&quot;



