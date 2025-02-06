

# OutboundCallRecording


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callRecordingType** | [**CallRecordingTypeEnum**](#CallRecordingTypeEnum) | Specifies which calls are recorded. |  [optional] |
|**callRecordingCallerPhoneNumbers** | **List&lt;String&gt;** | When call_recording_type is &#39;by_caller_phone_number&#39;, only outbound calls using one of these numbers will be recorded. Numbers must be specified in E164 format. |  [optional] |
|**callRecordingChannels** | [**CallRecordingChannelsEnum**](#CallRecordingChannelsEnum) | When using &#39;dual&#39; channels, the final audio file will be a stereo recording with the first leg on channel A, and the rest on channel B. |  [optional] |
|**callRecordingFormat** | [**CallRecordingFormatEnum**](#CallRecordingFormatEnum) | The audio file format for calls being recorded. |  [optional] |



## Enum: CallRecordingTypeEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| NONE | &quot;none&quot; |
| BY_CALLER_PHONE_NUMBER | &quot;by_caller_phone_number&quot; |



## Enum: CallRecordingChannelsEnum

| Name | Value |
|---- | -----|
| SINGLE | &quot;single&quot; |
| DUAL | &quot;dual&quot; |



## Enum: CallRecordingFormatEnum

| Name | Value |
|---- | -----|
| WAV | &quot;wav&quot; |
| MP3 | &quot;mp3&quot; |



