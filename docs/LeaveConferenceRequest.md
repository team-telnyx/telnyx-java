

# LeaveConferenceRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callControlId** | **String** | Unique identifier and token for controlling the call | 
**commandId** | **String** | Use this field to avoid execution of duplicate commands. Telnyx will ignore subsequent commands with the same &#x60;command_id&#x60; as one that has already been executed. |  [optional]
**beepEnabled** | [**BeepEnabledEnum**](#BeepEnabledEnum) | Whether a beep sound should be played when the participant leaves the conference. Can be used to override the conference-level setting. |  [optional]



## Enum: BeepEnabledEnum

Name | Value
---- | -----
ALWAYS | &quot;always&quot;
NEVER | &quot;never&quot;
ON_ENTER | &quot;on_enter&quot;
ON_EXIT | &quot;on_exit&quot;



