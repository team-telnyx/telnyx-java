

# StopForkingRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional] |
|**commandId** | **String** | Use this field to avoid duplicate commands. Telnyx will ignore any command with the same &#x60;command_id&#x60; for the same &#x60;call_control_id&#x60;. |  [optional] |
|**streamType** | [**StreamTypeEnum**](#StreamTypeEnum) | Optionally specify a &#x60;stream_type&#x60;. This should match the &#x60;stream_type&#x60; that was used in &#x60;fork_start&#x60; command to properly stop the fork. |  [optional] |



## Enum: StreamTypeEnum

| Name | Value |
|---- | -----|
| RAW | &quot;raw&quot; |
| DECRYPTED | &quot;decrypted&quot; |



