

# JoinConferenceRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callControlId** | **String** | Unique identifier and token for controlling the call | 
**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. Please note that the client_state will be updated for the participient call leg and the change will not affect conferencing webhooks unless the participient is the owner of the conference. |  [optional]
**commandId** | **String** | Use this field to avoid execution of duplicate commands. Telnyx will ignore subsequent commands with the same &#x60;command_id&#x60; as one that has already been executed. |  [optional]
**endConferenceOnExit** | **Boolean** | Whether the conference should end and all remaining participants be hung up after the participant leaves the conference. Defaults to \&quot;false\&quot;. |  [optional]
**softEndConferenceOnExit** | **Boolean** | Whether the conference should end after the participant leaves the conference. NOTE this doesn&#39;t hang up the other participants. Defaults to \&quot;false\&quot;. |  [optional]
**hold** | **Boolean** | Whether the participant should be put on hold immediately after joining the conference. Defaults to \&quot;false\&quot;. |  [optional]
**holdAudioUrl** | **String** | The URL of a file to be played to the participant when they are put on hold after joining the conference. hold_media_name and hold_audio_url cannot be used together in one request. Takes effect only when \&quot;start_conference_on_create\&quot; is set to \&quot;false\&quot;. This property takes effect only if \&quot;hold\&quot; is set to \&quot;true\&quot;. |  [optional]
**holdMediaName** | **String** | The media_name of a file to be played to the participant when they are put on hold after joining the conference. The media_name must point to a file previously uploaded to api.telnyx.com/v2/media by the same user/organization. The file must either be a WAV or MP3 file. Takes effect only when \&quot;start_conference_on_create\&quot; is set to \&quot;false\&quot;. This property takes effect only if \&quot;hold\&quot; is set to \&quot;true\&quot;. |  [optional]
**mute** | **Boolean** | Whether the participant should be muted immediately after joining the conference. Defaults to \&quot;false\&quot;. |  [optional]
**startConferenceOnEnter** | **Boolean** | Whether the conference should be started after the participant joins the conference. Defaults to \&quot;false\&quot;. |  [optional]
**supervisorRole** | [**SupervisorRoleEnum**](#SupervisorRoleEnum) | Sets the joining participant as a supervisor for the conference. A conference can have multiple supervisors. \&quot;barge\&quot; means the supervisor enters the conference as a normal participant. This is the same as \&quot;none\&quot;. \&quot;monitor\&quot; means the supervisor is muted but can hear all participants. \&quot;whisper\&quot; means that only the specified \&quot;whisper_call_control_ids\&quot; can hear the supervisor. Defaults to \&quot;none\&quot;. |  [optional]
**whisperCallControlIds** | **List&lt;String&gt;** | Array of unique call_control_ids the joining supervisor can whisper to. If none provided, the supervisor will join the conference as a monitoring participant only. |  [optional]
**beepEnabled** | [**BeepEnabledEnum**](#BeepEnabledEnum) | Whether a beep sound should be played when the participant joins and/or leaves the conference. Can be used to override the conference-level setting. |  [optional]



## Enum: SupervisorRoleEnum

Name | Value
---- | -----
BARGE | &quot;barge&quot;
MONITOR | &quot;monitor&quot;
NONE | &quot;none&quot;
WHISPER | &quot;whisper&quot;



## Enum: BeepEnabledEnum

Name | Value
---- | -----
ALWAYS | &quot;always&quot;
NEVER | &quot;never&quot;
ON_ENTER | &quot;on_enter&quot;
ON_EXIT | &quot;on_exit&quot;



