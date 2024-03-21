

# TexmlRecordingTranscription


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountSid** | **String** |  |  [optional] |
|**callSid** | **String** |  |  [optional] |
|**apiVersion** | **String** | The version of the API that was used to make the request. |  [optional] |
|**dateCreated** | **String** |  |  [optional] |
|**dateUpdated** | **String** |  |  [optional] |
|**duration** | **String** | The duration of this recording, given in seconds. |  [optional] |
|**sid** | **String** | Identifier of a resource. |  [optional] |
|**recordingSid** | **String** | Identifier of a resource. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the recording transcriptions. The transcription text will be available only when the status is completed. |  [optional] |
|**transcriptionText** | **String** | The recording&#39;s transcribed text |  [optional] |
|**uri** | **String** | The relative URI for the recording transcription resource. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| IN_PROGRESS | &quot;in-progress&quot; |
| COMPLETED | &quot;completed&quot; |



