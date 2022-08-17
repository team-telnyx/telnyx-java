

# RoomRecording


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | A unique identifier for the room recording. |  [optional] |
|**roomId** | **UUID** | Identify the room associated with the room recording. |  [optional] |
|**sessionId** | **UUID** | Identify the room session associated with the room recording. |  [optional] |
|**participantId** | **UUID** | Identify the room participant associated with the room recording. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Shows the room recording status. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Shows the room recording type. |  [optional] |
|**sizeMb** | **Float** | Shows the room recording size in MB. |  [optional] |
|**downloadUrl** | **String** | Url to download the recording. |  [optional] |
|**codec** | **String** | Shows the codec used for the room recording. |  [optional] |
|**durationSecs** | **Integer** | Shows the room recording duration in seconds. |  [optional] |
|**createdAt** | **String** | ISO 8601 timestamp when the room recording was created. |  [optional] |
|**updatedAt** | **String** | ISO 8601 timestamp when the room recording was updated. |  [optional] |
|**endedAt** | **String** | ISO 8601 timestamp when the room recording has ended. |  [optional] |
|**startedAt** | **String** | ISO 8601 timestamp when the room recording has stated. |  [optional] |
|**completedAt** | **String** | ISO 8601 timestamp when the room recording has completed. |  [optional] |
|**recordType** | **String** |  |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;completed&quot; |
| PROCESSING | &quot;processing&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AUDIO | &quot;audio&quot; |
| VIDEO | &quot;video&quot; |



