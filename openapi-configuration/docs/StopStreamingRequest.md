

# StopStreamingRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional] |
|**commandId** | **String** | Use this field to avoid duplicate commands. Telnyx will ignore any command with the same &#x60;command_id&#x60; for the same &#x60;call_control_id&#x60;. |  [optional] |
|**streamId** | **UUID** | Identifies the stream. If the &#x60;stream_id&#x60; is not provided the command stops all streams associated with a given &#x60;call_control_id&#x60;. |  [optional] |



