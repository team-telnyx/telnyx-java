# JoinConferenceRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callControlId** | **String** | Unique identifier and token for controlling the call | 
**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional]
**commandId** | **String** | Use this field to avoid execution of duplicate commands. Telnyx will ignore subsequent commands with the same &#x60;command_id&#x60; as one that has already been executed. |  [optional]
**endConferenceOnExit** | **Boolean** | Whether the conference should end and all remaining participants be hung up after the participant leaves the conference. Defaults to \&quot;false\&quot;. |  [optional]
**softEndConferenceOnExit** | **Boolean** | Whether the conference should end after the participant leaves the conference. NOTE this doesn&#x27;t hang up the other participants. Defaults to \&quot;false\&quot;. |  [optional]
**hold** | **Boolean** | Whether the participant should be put on hold immediately after joining the conference. Defaults to \&quot;false\&quot;. |  [optional]
**holdAudioUrl** | **String** | The URL of an audio file to be played to the participant when they are put on hold after joining the conference. This property takes effect only if \&quot;hold\&quot; is set to \&quot;true\&quot;. |  [optional]
**mute** | **Boolean** | Whether the participant should be muted immediately after joining the conference. Defaults to \&quot;false\&quot;. |  [optional]
**startConferenceOnEnter** | **Boolean** | Whether the conference should be started after the participant joins the conference. Defaults to \&quot;false\&quot;. |  [optional]
**supervisorRole** | [**SupervisorRoleEnum**](#SupervisorRoleEnum) | Sets the joining participant as a supervisor for the conference. A conference can have multiple supervisors. \&quot;barge\&quot; means the supervisor enters the conference as a normal participant. This is the same as \&quot;none\&quot;. \&quot;monitor\&quot; means the supervisor is muted but can hear all participants. \&quot;whisper\&quot; means that only the specified \&quot;whisper_call_control_ids\&quot; can hear the supervisor. Defaults to \&quot;none\&quot;. |  [optional]
**whisperCallControlIds** | **List&lt;String&gt;** | Array of unique call_control_ids the joining supervisor can whisper to. If none provided, the supervisor will join the conference as a monitoring participant only. |  [optional]

<a name="SupervisorRoleEnum"></a>
## Enum: SupervisorRoleEnum
Name | Value
---- | -----
BARGE | &quot;barge&quot;
MONITOR | &quot;monitor&quot;
NONE | &quot;none&quot;
WHISPER | &quot;whisper&quot;
