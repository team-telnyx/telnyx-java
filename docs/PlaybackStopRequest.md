

# PlaybackStopRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**overlay** | **Boolean** | When enabled, it stops the audio being played in the overlay queue. |  [optional]
**stop** | **String** | Use &#x60;current&#x60; to stop the current audio being played. Use &#x60;all&#x60; to stop the current audio file being played and clear all audio files from the queue. |  [optional]
**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional]
**commandId** | **String** | Use this field to avoid duplicate commands. Telnyx will ignore any command with the same &#x60;command_id&#x60; for the same &#x60;call_control_id&#x60;. |  [optional]



