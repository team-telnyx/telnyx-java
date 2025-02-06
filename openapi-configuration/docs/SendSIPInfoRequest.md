

# SendSIPInfoRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contentType** | **String** | Content type of the INFO body. Must be MIME type compliant. There is a 1,400 bytes limit |  |
|**body** | **String** | Content of the SIP INFO |  |
|**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional] |
|**commandId** | **String** | Use this field to avoid duplicate commands. Telnyx will ignore any command with the same &#x60;command_id&#x60; for the same &#x60;call_control_id&#x60;. |  [optional] |



