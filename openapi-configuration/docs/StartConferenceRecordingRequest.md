

# StartConferenceRecordingRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**format** | [**FormatEnum**](#FormatEnum) | The audio file format used when storing the conference recording. Can be either &#x60;mp3&#x60; or &#x60;wav&#x60;. |  |
|**commandId** | **String** | Use this field to avoid duplicate commands. Telnyx will ignore any command with the same &#x60;command_id&#x60; for the same &#x60;conference_id&#x60;. |  [optional] |
|**playBeep** | **Boolean** | If enabled, a beep sound will be played at the start of a recording. |  [optional] |
|**trim** | [**TrimEnum**](#TrimEnum) | When set to &#x60;trim-silence&#x60;, silence will be removed from the beginning and end of the recording. |  [optional] |
|**customFileName** | **String** | The custom recording file name to be used instead of the default &#x60;call_leg_id&#x60;. Telnyx will still add a Unix timestamp suffix. |  [optional] |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| WAV | &quot;wav&quot; |
| MP3 | &quot;mp3&quot; |



## Enum: TrimEnum

| Name | Value |
|---- | -----|
| TRIM_SILENCE | &quot;trim-silence&quot; |



