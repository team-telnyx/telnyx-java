

# RecordingCompletedPayload


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sessionId** | **UUID** | Session ID associated with the recording. |  [optional] |
|**roomId** | **UUID** | Room ID associated with the recording. |  [optional] |
|**participantId** | **UUID** | Participant ID associated with the recording. |  [optional] |
|**recordingId** | **UUID** | Recording ID that identifies the recording. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the recording. |  [optional] |
|**sizeMb** | **Float** | Recording size in MB. |  [optional] |
|**downloadUrl** | **String** | Url to download the recording. |  [optional] |
|**codec** | **String** | Codec used for the recording. |  [optional] |
|**durationSecs** | **Integer** | Recording duration in seconds. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AUDIO | &quot;audio&quot; |
| VIDEO | &quot;video&quot; |



