

# CreateConferenceRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callControlId** | **String** | Unique identifier and token for controlling the call |  |
|**name** | **String** | Name of the conference |  |
|**beepEnabled** | [**BeepEnabledEnum**](#BeepEnabledEnum) | Whether a beep sound should be played when participants join and/or leave the conference. |  [optional] |
|**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. The client_state will be updated for the creator call leg and will be used for all webhooks related to the created conference. |  [optional] |
|**comfortNoise** | **Boolean** | Toggle background comfort noise. |  [optional] |
|**commandId** | **String** | Use this field to avoid execution of duplicate commands. Telnyx will ignore subsequent commands with the same &#x60;command_id&#x60; as one that has already been executed. |  [optional] |
|**durationMinutes** | **Integer** | Time length (minutes) after which the conference will end. |  [optional] |
|**holdAudioUrl** | **String** | The URL of a file to be played to participants joining the conference. The URL can point to either a WAV or MP3 file. hold_media_name and hold_audio_url cannot be used together in one request. Takes effect only when \&quot;start_conference_on_create\&quot; is set to \&quot;false\&quot;. |  [optional] |
|**holdMediaName** | **String** | The media_name of a file to be played to participants joining the conference. The media_name must point to a file previously uploaded to api.telnyx.com/v2/media by the same user/organization. The file must either be a WAV or MP3 file. Takes effect only when \&quot;start_conference_on_create\&quot; is set to \&quot;false\&quot;. |  [optional] |
|**maxParticipants** | **Integer** | The maximum number of active conference participants to allow. Must be between 2 and 800. Defaults to 250 |  [optional] |
|**startConferenceOnCreate** | **Boolean** | Whether the conference should be started on creation. If the conference isn&#39;t started all participants that join are automatically put on hold. Defaults to \&quot;true\&quot;. |  [optional] |



## Enum: BeepEnabledEnum

| Name | Value |
|---- | -----|
| ALWAYS | &quot;always&quot; |
| NEVER | &quot;never&quot; |
| ON_ENTER | &quot;on_enter&quot; |
| ON_EXIT | &quot;on_exit&quot; |



