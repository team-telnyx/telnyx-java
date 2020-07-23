# PlaybackStopRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stop** | **String** | Use &#x60;current&#x60; to stop only the current audio or &#x60;all&#x60; to stop all audios in the queue. |  [optional]
**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional]
**commandId** | **String** | Use this field to avoid duplicate commands. Telnyx will ignore commands with the same &#x60;command_id&#x60;. |  [optional]
