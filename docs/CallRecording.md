

# CallRecording

The call recording settings for a phone number.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**inboundCallRecordingEnabled** | **Boolean** | When enabled, any inbound call to this number will be recorded. |  [optional] |
|**inboundCallRecordingFormat** | [**InboundCallRecordingFormatEnum**](#InboundCallRecordingFormatEnum) | The audio file format for calls being recorded. |  [optional] |
|**inboundCallRecordingChannels** | [**InboundCallRecordingChannelsEnum**](#InboundCallRecordingChannelsEnum) | When using &#39;dual&#39; channels, final audio file will be stereo recorded with the first leg on channel A, and the rest on channel B. |  [optional] |



## Enum: InboundCallRecordingFormatEnum

| Name | Value |
|---- | -----|
| WAV | &quot;wav&quot; |
| MP3 | &quot;mp3&quot; |



## Enum: InboundCallRecordingChannelsEnum

| Name | Value |
|---- | -----|
| SINGLE | &quot;single&quot; |
| DUAL | &quot;dual&quot; |



