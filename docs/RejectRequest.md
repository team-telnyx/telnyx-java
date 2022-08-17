

# RejectRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional] |
|**commandId** | **String** | Use this field to avoid duplicate commands. Telnyx will ignore any command with the same &#x60;command_id&#x60; for the same &#x60;call_control_id&#x60;. |  [optional] |
|**cause** | [**CauseEnum**](#CauseEnum) | Cause for call rejection. |  |



## Enum: CauseEnum

| Name | Value |
|---- | -----|
| CALL_REJECTED | &quot;CALL_REJECTED&quot; |
| USER_BUSY | &quot;USER_BUSY&quot; |



