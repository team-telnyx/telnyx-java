

# RecordingTranscription


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **String** | ISO 8601 formatted date indicating when the resource was created. |  [optional] |
|**durationMillis** | **Integer** | The duration of the recording transcription in milliseconds. |  [optional] |
|**id** | **String** | Uniquely identifies the recording transcription. |  [optional] |
|**recordingId** | **String** | Uniquely identifies the recording associated with this transcription. |  [optional] |
|**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the recording transcriptions. The transcription text will be available only when the status is completed. |  [optional] |
|**transcriptionText** | **String** | The recording&#39;s transcribed text |  [optional] |
|**updatedAt** | **String** | ISO 8601 formatted date indicating when the resource was updated. |  [optional] |



## Enum: RecordTypeEnum

| Name | Value |
|---- | -----|
| RECORDING_TRANSCRIPTION | &quot;recording_transcription&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| IN_PROGRESS | &quot;in-progress&quot; |
| COMPLETED | &quot;completed&quot; |



