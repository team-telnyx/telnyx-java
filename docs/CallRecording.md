# CallRecording

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inboundCallRecordingEnabled** | **Boolean** | When enabled, any inbound call to this number will be recorded. |  [optional]
**inboundCallRecordingFormat** | [**InboundCallRecordingFormatEnum**](#InboundCallRecordingFormatEnum) | The audio file format for calls being recorded. |  [optional]
**inboundCallRecordingChannels** | [**InboundCallRecordingChannelsEnum**](#InboundCallRecordingChannelsEnum) | When using &#x27;dual&#x27; channels, final audio file will be stereo recorded with the first leg on channel A, and the rest on channel B. |  [optional]

<a name="InboundCallRecordingFormatEnum"></a>
## Enum: InboundCallRecordingFormatEnum
Name | Value
---- | -----
WAV | &quot;wav&quot;
MP3 | &quot;mp3&quot;

<a name="InboundCallRecordingChannelsEnum"></a>
## Enum: InboundCallRecordingChannelsEnum
Name | Value
---- | -----
SINGLE | &quot;single&quot;
DUAL | &quot;dual&quot;
