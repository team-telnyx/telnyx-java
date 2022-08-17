

# ConferenceCallRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callControlId** | **String** | Unique identifier and token for controlling the call |  |
|**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional] |
|**commandId** | **String** | Use this field to avoid execution of duplicate commands. Telnyx will ignore subsequent commands with the same &#x60;command_id&#x60; as one that has already been executed. |  [optional] |
|**from** | **String** | The &#x60;from&#x60; number to be used as the caller id presented to the destination (&#x60;to&#x60; number). |  |
|**hold** | **Boolean** | Whether the participant should be put on hold immediately after joining the conference. |  [optional] |
|**holdAudioUrl** | **String** | The URL of a file to be played to the participant when they are put on hold after joining the conference. If media_name is also supplied, this is currently ignored. Takes effect only when \&quot;start_conference_on_create\&quot; is set to \&quot;false\&quot;. This property takes effect only if \&quot;hold\&quot; is set to \&quot;true\&quot;. |  [optional] |
|**holdMediaName** | **String** | The media_name of a file to be played to the participant when they are put on hold after joining the conference. The media_name must point to a file previously uploaded to api.telnyx.com/v2/media by the same user/organization. The file must either be a WAV or MP3 file. Takes effect only when \&quot;start_conference_on_create\&quot; is set to \&quot;false\&quot;. This property takes effect only if \&quot;hold\&quot; is set to \&quot;true\&quot;. |  [optional] |
|**mute** | **Boolean** | Whether the participant should be muted immediately after joining the conference. |  [optional] |
|**startConferenceOnEnter** | **Boolean** | Whether the conference should be started after the participant joins the conference. |  [optional] |
|**supervisorRole** | [**SupervisorRoleEnum**](#SupervisorRoleEnum) | Sets the joining participant as a supervisor for the conference. A conference can have multiple supervisors. \&quot;barge\&quot; means the supervisor enters the conference as a normal participant. This is the same as \&quot;none\&quot;. \&quot;monitor\&quot; means the supervisor is muted but can hear all participants. \&quot;whisper\&quot; means that only the specified \&quot;whisper_call_control_ids\&quot; can hear the supervisor. Defaults to \&quot;none\&quot;. |  [optional] |
|**to** | **String** | The DID or SIP URI to dial out and bridge to the given call. |  |
|**whisperCallControlIds** | **List&lt;String&gt;** | Array of unique call_control_ids the joining supervisor can whisper to. If none provided, the supervisor will join the conference as a monitoring participant only. |  [optional] |



## Enum: SupervisorRoleEnum

| Name | Value |
|---- | -----|
| BARGE | &quot;barge&quot; |
| MONITOR | &quot;monitor&quot; |
| NONE | &quot;none&quot; |
| WHISPER | &quot;whisper&quot; |



