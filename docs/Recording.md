# Recording

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) |  | 
**id** | **String** | Uniquely identifies the recording | 
**createdAt** | **String** | ISO 8601 formatted date of when the recording was created | 
**updatedAt** | **String** | ISO 8601 formatted date of when the recording was last updated | 
**recordingStartedAt** | **String** | ISO 8601 formatted date of when the recording started | 
**recordingEndedAt** | **String** | ISO 8601 formatted date of when the recording ended | 
**durationMillis** | **Integer** | The duration of the recording in milliseconds | 
**status** | [**StatusEnum**](#StatusEnum) | The status of the recording. Only resources for &#x60;completed&#x60; recordings are currently supported | 
**channels** | [**ChannelsEnum**](#ChannelsEnum) | When &#x60;dual&#x60;, final audio file has the first leg on channel A, and the rest on channel B. | 
**source** | [**SourceEnum**](#SourceEnum) | The kind of event that led to this recording being created | 
**conferenceId** | **String** | If a conference recording, uniquely identifies the recorded conference |  [optional]
**callLegId** | **String** | If a call recording, uniquely identifies the recorded call leg |  [optional]
**callSessionId** | **String** | If a call recording, uniquely identifies the recorded call session |  [optional]
**downloadUrls** | [**RecordingDownloadUrls**](RecordingDownloadUrls.md) |  | 

<a name="RecordTypeEnum"></a>
## Enum: RecordTypeEnum
Name | Value
---- | -----
RECORDING | &quot;recording&quot;

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
COMPLETED | &quot;completed&quot;

<a name="ChannelsEnum"></a>
## Enum: ChannelsEnum
Name | Value
---- | -----
SINGLE | &quot;single&quot;
DUAL | &quot;dual&quot;

<a name="SourceEnum"></a>
## Enum: SourceEnum
Name | Value
---- | -----
CONFERENCE | &quot;conference&quot;
CALL | &quot;call&quot;
