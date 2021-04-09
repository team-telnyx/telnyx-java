

# UpdateConferenceRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callControlId** | **String** | Unique identifier and token for controlling the call | 
**commandId** | **String** | Use this field to avoid execution of duplicate commands. Telnyx will ignore subsequent commands with the same &#x60;command_id&#x60; as one that has already been executed. |  [optional]
**supervisorRole** | [**SupervisorRoleEnum**](#SupervisorRoleEnum) | Sets the participant as a supervisor for the conference. A conference can have multiple supervisors. \&quot;barge\&quot; means the supervisor enters the conference as a normal participant. This is the same as \&quot;none\&quot;. \&quot;monitor\&quot; means the supervisor is muted but can hear all participants. \&quot;whisper\&quot; means that only the specified \&quot;whisper_call_control_ids\&quot; can hear the supervisor. Defaults to \&quot;none\&quot;. |  [optional]
**whisperCallControlIds** | **List&lt;String&gt;** | Array of unique call_control_ids the supervisor can whisper to. If none provided, the supervisor will join the conference as a monitoring participant only. |  [optional]



## Enum: SupervisorRoleEnum

Name | Value
---- | -----
BARGE | &quot;barge&quot;
MONITOR | &quot;monitor&quot;
NONE | &quot;none&quot;
WHISPER | &quot;whisper&quot;



