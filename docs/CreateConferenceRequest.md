# CreateConferenceRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callControlId** | **String** | Unique identifier and token for controlling the call | 
**name** | **String** | Name of the conference | 
**beepEnabled** | [**BeepEnabledEnum**](#BeepEnabledEnum) | Whether a beep sound should be played when participants join and/or leave the conference. |  [optional]
**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional]
**commandId** | **String** | Use this field to avoid execution of duplicate commands. Telnyx will ignore subsequent commands with the same &#x60;command_id&#x60; as one that has already been executed. |  [optional]
**durationMinutes** | **Integer** | Time length (minutes) after which the conference will end. |  [optional]
**holdAudioUrl** | **String** | The URL to an audio file to be played to participants joining the conference. Takes effect only when \&quot;start_conference_on_create\&quot; is set to \&quot;false\&quot;. |  [optional]
**startConferenceOnCreate** | **Boolean** | Whether the conference should be started on creation. If the conference isn&#x27;t started all participants that join are automatically put on hold. Defaults to \&quot;true\&quot;. |  [optional]

<a name="BeepEnabledEnum"></a>
## Enum: BeepEnabledEnum
Name | Value
---- | -----
ALWAYS | &quot;always&quot;
NEVER | &quot;never&quot;
ON_ENTER | &quot;on_enter&quot;
ON_EXIT | &quot;on_exit&quot;
