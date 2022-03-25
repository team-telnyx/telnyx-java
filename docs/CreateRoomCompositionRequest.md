

# CreateRoomCompositionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**format** | **String** | The desired format of the room composition. |  [optional]
**resolution** | **String** | The desired resolution (width/height in pixels) of the resulting video of the room composition. Both width and height are required to be between 16 and 1280; and width * height should not exceed 1280 * 720 |  [optional]
**sessionId** | **UUID** | id of the room session associated with the room composition. |  [optional]
**videoLayout** | [**Map&lt;String, VideoRegion&gt;**](VideoRegion.md) | Describes the video layout of the room composition in terms of regions. |  [optional]
**webhookEventUrl** | **String** | The URL where webhooks related to this room composition will be sent. Must include a scheme, such as &#39;https&#39;. |  [optional]
**webhookEventFailoverUrl** | **String** | The failover URL where webhooks related to this room composition will be sent if sending to the primary URL fails. Must include a scheme, such as &#39;https&#39;. |  [optional]
**webhookTimeoutSecs** | **Integer** | Specifies how many seconds to wait before timing out a webhook. |  [optional]



