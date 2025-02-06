

# Room


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | A unique identifier for the room. |  [optional] |
|**maxParticipants** | **Integer** | Maximum participants allowed in the room. |  [optional] |
|**uniqueName** | **String** | The unique (within the Telnyx account scope) name of the room. |  [optional] |
|**createdAt** | **String** | ISO 8601 timestamp when the room was created. |  [optional] |
|**updatedAt** | **String** | ISO 8601 timestamp when the room was updated. |  [optional] |
|**activeSessionId** | **UUID** | The identifier of the active room session if any. |  [optional] |
|**sessions** | [**List&lt;RoomSession&gt;**](RoomSession.md) |  |  [optional] |
|**enableRecording** | **Boolean** | Enable or disable recording for that room. |  [optional] |
|**webhookEventUrl** | **String** | The URL where webhooks related to this room will be sent. Must include a scheme, such as &#39;https&#39;. |  [optional] |
|**webhookEventFailoverUrl** | **String** | The failover URL where webhooks related to this room will be sent if sending to the primary URL fails. Must include a scheme, such as &#39;https&#39;. |  [optional] |
|**webhookTimeoutSecs** | **Integer** | Specifies how many seconds to wait before timing out a webhook. |  [optional] |
|**recordType** | **String** |  |  [optional] [readonly] |



