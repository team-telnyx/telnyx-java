

# BridgeRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callControlId** | **String** | The Call Control ID of the call you want to bridge with. | 
**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional]
**commandId** | **String** | Use this field to avoid duplicate commands. Telnyx will ignore any command with the same &#x60;command_id&#x60; for the same &#x60;call_control_id&#x60;. |  [optional]
**queue** | **String** | The name of the queue you want to bridge with, can&#39;t be used together with call_control_id parameter. Bridging with a queue means bridging with the first call in the queue. The call will always be removed from the queue regardless of whether bridging succeeds. Returns an error when the queue is empty. |  [optional]
**parkAfterUnbridge** | **String** | Specifies behavior after the bridge ends (i.e. the opposite leg either hangs up or is transferred). If supplied with the value &#x60;self&#x60;, the current leg will be parked after unbridge. If not set, the default behavior is to hang up the leg. |  [optional]



