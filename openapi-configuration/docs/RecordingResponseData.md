

# RecordingResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callControlId** | **String** | Unique identifier and token for controlling the call. |  [optional] |
|**callLegId** | **String** | ID that is unique to the call and can be used to correlate webhook events. |  [optional] |
|**callSessionId** | **String** | ID that is unique to the call session and can be used to correlate webhook events. Call session is a group of related call legs that logically belong to the same phone call, e.g. an inbound and outbound leg of a transferred call. |  [optional] |
|**channels** | [**ChannelsEnum**](#ChannelsEnum) | When &#x60;dual&#x60;, final audio file has the first leg on channel A, and the rest on channel B. |  [optional] |
|**conferenceId** | **String** | Uniquely identifies the conference. |  [optional] |
|**createdAt** | **String** | ISO 8601 formatted date indicating when the resource was created. |  [optional] |
|**downloadUrls** | [**RecordingResponseDataDownloadUrls**](RecordingResponseDataDownloadUrls.md) |  |  [optional] |
|**durationMillis** | **Integer** | The duration of the recording in milliseconds. |  [optional] |
|**id** | **String** | Uniquely identifies the recording. |  [optional] |
|**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) |  |  [optional] |
|**recordingStartedAt** | **String** | ISO 8601 formatted date of when the recording started. |  [optional] |
|**recordingEndedAt** | **String** | ISO 8601 formatted date of when the recording ended. |  [optional] |
|**source** | [**SourceEnum**](#SourceEnum) | The kind of event that led to this recording being created. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the recording. Only resources for &#x60;completed&#x60; recordings are currently supported. |  [optional] |
|**updatedAt** | **String** | ISO 8601 formatted date indicating when the resource was updated. |  [optional] |



## Enum: ChannelsEnum

| Name | Value |
|---- | -----|
| SINGLE | &quot;single&quot; |
| DUAL | &quot;dual&quot; |



## Enum: RecordTypeEnum

| Name | Value |
|---- | -----|
| RECORDING | &quot;recording&quot; |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| CONFERENCE | &quot;conference&quot; |
| CALL | &quot;call&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;completed&quot; |



