

# PlayAudioUrlRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**audioUrl** | **String** | The URL of a file to be played back on the call. The URL can point to either a WAV or MP3 file. media_name and audio_url cannot be used together in one request. |  [optional] |
|**mediaName** | **String** | The media_name of a file to be played back on the call. The media_name must point to a file previously uploaded to api.telnyx.com/v2/media by the same user/organization. The file must either be a WAV or MP3 file. |  [optional] |
|**loop** | [**Loopcount**](Loopcount.md) |  |  [optional] |
|**overlay** | **Boolean** | When enabled, audio will be mixed on top of any other audio that is actively being played back. Note that &#x60;overlay: true&#x60; will only work if there is another audio file already being played on the call. |  [optional] |
|**stop** | **String** | When specified, it stops the current audio being played. Specify &#x60;current&#x60; to stop the current audio being played, and to play the next file in the queue. Specify &#x60;all&#x60; to stop the current audio file being played and to also clear all audio files from the queue. |  [optional] |
|**targetLegs** | **String** | Specifies the leg or legs on which audio will be played. If supplied, the value must be either &#x60;self&#x60;, &#x60;opposite&#x60; or &#x60;both&#x60;. |  [optional] |
|**cacheAudio** | **Boolean** | Caches the audio file. Useful when playing the same audio file multiple times during the call. |  [optional] |
|**audioType** | [**AudioTypeEnum**](#AudioTypeEnum) | Specifies the type of audio provided in &#x60;audio_url&#x60; or &#x60;playback_content&#x60;. |  [optional] |
|**playbackContent** | **String** | Allows a user to provide base64 encoded mp3 or wav. Note: when using this parameter, &#x60;media_url&#x60; and &#x60;media_name&#x60; in the &#x60;playback_started&#x60; and &#x60;playback_ended&#x60; webhooks will be empty |  [optional] |
|**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional] |
|**commandId** | **String** | Use this field to avoid duplicate commands. Telnyx will ignore any command with the same &#x60;command_id&#x60; for the same &#x60;call_control_id&#x60;. |  [optional] |



## Enum: AudioTypeEnum

| Name | Value |
|---- | -----|
| MP3 | &quot;mp3&quot; |
| WAV | &quot;wav&quot; |



