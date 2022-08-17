

# RecordingStartedPayload


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sessionId** | **UUID** | Session ID associated with the recording. |  [optional] |
|**roomId** | **UUID** | Room ID associated with the recording. |  [optional] |
|**participantId** | **UUID** | Participant ID associated with the recording. |  [optional] |
|**recordingId** | **UUID** | Recording ID associated with the recording. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the recording. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AUDIO | &quot;audio&quot; |
| VIDEO | &quot;video&quot; |



