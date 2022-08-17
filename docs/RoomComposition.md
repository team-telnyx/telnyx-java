

# RoomComposition


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | A unique identifier for the room composition. |  [optional] |
|**roomId** | **UUID** | Identify the room associated with the room composition. |  [optional] |
|**sessionId** | **UUID** | Identify the room session associated with the room composition. |  [optional] |
|**userId** | **UUID** | Identify the user associated with the room composition. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Shows the room composition status. |  [optional] |
|**sizeMb** | **Float** | Shows the room composition size in MB. |  [optional] |
|**downloadUrl** | **String** | Url to download the composition. |  [optional] |
|**durationSecs** | **Integer** | Shows the room composition duration in seconds. |  [optional] |
|**format** | [**FormatEnum**](#FormatEnum) | Shows format of the room composition. |  [optional] |
|**createdAt** | **String** | ISO 8601 timestamp when the room composition was created. |  [optional] |
|**updatedAt** | **String** | ISO 8601 timestamp when the room composition was updated. |  [optional] |
|**endedAt** | **String** | ISO 8601 timestamp when the room composition has ended. |  [optional] |
|**startedAt** | **String** | ISO 8601 timestamp when the room composition has stated. |  [optional] |
|**completedAt** | **String** | ISO 8601 timestamp when the room composition has completed. |  [optional] |
|**videoLayout** | [**Map&lt;String, VideoRegion&gt;**](VideoRegion.md) | Describes the video layout of the room composition in terms of regions. Limited to 2 regions. |  [optional] |
|**webhookEventUrl** | **String** | The URL where webhooks related to this room composition will be sent. Must include a scheme, such as &#39;https&#39;. |  [optional] |
|**webhookEventFailoverUrl** | **String** | The failover URL where webhooks related to this room composition will be sent if sending to the primary URL fails. Must include a scheme, such as &#39;https&#39;. |  [optional] |
|**webhookTimeoutSecs** | **Integer** | Specifies how many seconds to wait before timing out a webhook. |  [optional] |
|**recordType** | **String** |  |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;completed&quot; |
| ENQUEUED | &quot;enqueued&quot; |
| PROCESSING | &quot;processing&quot; |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| MP4 | &quot;mp4&quot; |



