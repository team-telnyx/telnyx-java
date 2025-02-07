

# CallRequestConferenceConfig

Optional configuration parameters to dial new participant into a conference.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Conference ID to be joined |  [optional] |
|**conferenceName** | **String** | Conference name to be joined |  [optional] |
|**earlyMedia** | **Boolean** | Controls the moment when dialled call is joined into conference. If set to &#x60;true&#x60; user will be joined as soon as media is available (ringback). If &#x60;false&#x60; user will be joined when call is answered. Defaults to &#x60;true&#x60; |  [optional] |
|**endConferenceOnExit** | **Boolean** | Whether the conference should end and all remaining participants be hung up after the participant leaves the conference. Defaults to \&quot;false\&quot;. |  [optional] |
|**softEndConferenceOnExit** | **Boolean** | Whether the conference should end after the participant leaves the conference. NOTE this doesn&#39;t hang up the other participants. Defaults to \&quot;false\&quot;. |  [optional] |
|**hold** | **Boolean** | Whether the participant should be put on hold immediately after joining the conference. Defaults to \&quot;false\&quot;. |  [optional] |
|**holdAudioUrl** | **String** | The URL of a file to be played to the participant when they are put on hold after joining the conference. hold_media_name and hold_audio_url cannot be used together in one request. Takes effect only when \&quot;start_conference_on_create\&quot; is set to \&quot;false\&quot;. This property takes effect only if \&quot;hold\&quot; is set to \&quot;true\&quot;. |  [optional] |
|**holdMediaName** | **String** | The media_name of a file to be played to the participant when they are put on hold after joining the conference. The media_name must point to a file previously uploaded to api.telnyx.com/v2/media by the same user/organization. The file must either be a WAV or MP3 file. Takes effect only when \&quot;start_conference_on_create\&quot; is set to \&quot;false\&quot;. This property takes effect only if \&quot;hold\&quot; is set to \&quot;true\&quot;. |  [optional] |
|**mute** | **Boolean** | Whether the participant should be muted immediately after joining the conference. Defaults to \&quot;false\&quot;. |  [optional] |
|**startConferenceOnEnter** | **Boolean** | Whether the conference should be started after the participant joins the conference. Defaults to \&quot;false\&quot;. |  [optional] |
|**startConferenceOnCreate** | **Boolean** | Whether the conference should be started on creation. If the conference isn&#39;t started all participants that join are automatically put on hold. Defaults to \&quot;true\&quot;. |  [optional] |
|**supervisorRole** | [**SupervisorRoleEnum**](#SupervisorRoleEnum) | Sets the joining participant as a supervisor for the conference. A conference can have multiple supervisors. \&quot;barge\&quot; means the supervisor enters the conference as a normal participant. This is the same as \&quot;none\&quot;. \&quot;monitor\&quot; means the supervisor is muted but can hear all participants. \&quot;whisper\&quot; means that only the specified \&quot;whisper_call_control_ids\&quot; can hear the supervisor. Defaults to \&quot;none\&quot;. |  [optional] |
|**whisperCallControlIds** | **List&lt;String&gt;** | Array of unique call_control_ids the joining supervisor can whisper to. If none provided, the supervisor will join the conference as a monitoring participant only. |  [optional] |
|**beepEnabled** | [**BeepEnabledEnum**](#BeepEnabledEnum) | Whether a beep sound should be played when the participant joins and/or leaves the conference. Can be used to override the conference-level setting. |  [optional] |



## Enum: SupervisorRoleEnum

| Name | Value |
|---- | -----|
| BARGE | &quot;barge&quot; |
| MONITOR | &quot;monitor&quot; |
| NONE | &quot;none&quot; |
| WHISPER | &quot;whisper&quot; |



## Enum: BeepEnabledEnum

| Name | Value |
|---- | -----|
| ALWAYS | &quot;always&quot; |
| NEVER | &quot;never&quot; |
| ON_ENTER | &quot;on_enter&quot; |
| ON_EXIT | &quot;on_exit&quot; |



