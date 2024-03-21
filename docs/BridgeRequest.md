

# BridgeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callControlId** | **String** | The Call Control ID of the call you want to bridge with, can&#39;t be used together with queue parameter or video_room_id parameter. |  |
|**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional] |
|**commandId** | **String** | Use this field to avoid duplicate commands. Telnyx will ignore any command with the same &#x60;command_id&#x60; for the same &#x60;call_control_id&#x60;. |  [optional] |
|**queue** | **String** | The name of the queue you want to bridge with, can&#39;t be used together with call_control_id parameter or video_room_id parameter. Bridging with a queue means bridging with the first call in the queue. The call will always be removed from the queue regardless of whether bridging succeeds. Returns an error when the queue is empty. |  [optional] |
|**videoRoomId** | **UUID** | The ID of the video room you want to bridge with, can&#39;t be used together with call_control_id parameter or queue parameter. |  [optional] |
|**videoRoomContext** | **String** | The additional parameter that will be passed to the video conference. It is a text field and the user can decide how to use it. For example, you can set the participant name or pass JSON text. It can be used only with video_room_id parameter. |  [optional] |
|**parkAfterUnbridge** | **String** | Specifies behavior after the bridge ends (i.e. the opposite leg either hangs up or is transferred). If supplied with the value &#x60;self&#x60;, the current leg will be parked after unbridge. If not set, the default behavior is to hang up the leg. |  [optional] |



