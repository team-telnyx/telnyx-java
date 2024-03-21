

# StartRecordingRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**format** | [**FormatEnum**](#FormatEnum) | The audio file format used when storing the call recording. Can be either &#x60;mp3&#x60; or &#x60;wav&#x60;. |  |
|**channels** | [**ChannelsEnum**](#ChannelsEnum) | When &#x60;dual&#x60;, final audio file will be stereo recorded with the first leg on channel A, and the rest on channel B. |  |
|**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional] |
|**commandId** | **String** | Use this field to avoid duplicate commands. Telnyx will ignore any command with the same &#x60;command_id&#x60; for the same &#x60;call_control_id&#x60;. |  [optional] |
|**playBeep** | **Boolean** | If enabled, a beep sound will be played at the start of a recording. |  [optional] |
|**maxLength** | **Integer** | Defines the maximum length for the recording in seconds. The minimum value is 0. The maximum value is 14400. The default value is 0 (infinite) |  [optional] |
|**timeoutSecs** | **Integer** | The number of seconds that Telnyx will wait for the recording to be stopped if silence is detected. The timer only starts when the speech is detected. Please note that call transcription is used to detect silence and the related charge will be applied. The minimum value is 0. The default value is 0 (infinite) |  [optional] |
|**recordingTrack** | [**RecordingTrackEnum**](#RecordingTrackEnum) | The audio track to be recorded. Can be either &#x60;both&#x60;, &#x60;inbound&#x60; or &#x60;outbound&#x60;. If only single track is specified (&#x60;inbound&#x60;, &#x60;outbound&#x60;), &#x60;channels&#x60; configuration is ignored and it will be recorded as mono (single channel). |  [optional] |
|**trim** | [**TrimEnum**](#TrimEnum) | When set to &#x60;trim-silence&#x60;, silence will be removed from the beginning and end of the recording. |  [optional] |
|**customFileName** | **String** | The custom recording file name to be used instead of the default &#x60;call_leg_id&#x60;. Telnyx will still add a Unix timestamp suffix. |  [optional] |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| WAV | &quot;wav&quot; |
| MP3 | &quot;mp3&quot; |



## Enum: ChannelsEnum

| Name | Value |
|---- | -----|
| SINGLE | &quot;single&quot; |
| DUAL | &quot;dual&quot; |



## Enum: RecordingTrackEnum

| Name | Value |
|---- | -----|
| BOTH | &quot;both&quot; |
| INBOUND | &quot;inbound&quot; |
| OUTBOUND | &quot;outbound&quot; |



## Enum: TrimEnum

| Name | Value |
|---- | -----|
| TRIM_SILENCE | &quot;trim-silence&quot; |



