

# CreateRoomRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uniqueName** | **String** | The unique (within the Telnyx account scope) name of the room. |  [optional] |
|**maxParticipants** | **Integer** | The maximum amount of participants allowed in a room. If new participants try to join after that limit is reached, their request will be rejected. |  [optional] |
|**enableRecording** | **Boolean** | Enable or disable recording for that room. |  [optional] |
|**webhookEventUrl** | **String** | The URL where webhooks related to this room will be sent. Must include a scheme, such as &#39;https&#39;. |  [optional] |
|**webhookEventFailoverUrl** | **String** | The failover URL where webhooks related to this room will be sent if sending to the primary URL fails. Must include a scheme, such as &#39;https&#39;. |  [optional] |
|**webhookTimeoutSecs** | **Integer** | Specifies how many seconds to wait before timing out a webhook. |  [optional] |



