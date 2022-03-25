

# SendDTMFRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**digits** | **String** | DTMF digits to send. Valid digits are 0-9, A-D, *, and #. Pauses can be added using w (0.5s) and W (1s). | 
**durationMillis** | **Integer** | Specifies for how many milliseconds each digit will be played in the audio stream. Ranges from 100 to 500ms |  [optional]
**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional]
**commandId** | **String** | Use this field to avoid duplicate commands. Telnyx will ignore any command with the same &#x60;command_id&#x60; for the same &#x60;call_control_id&#x60;. |  [optional]



