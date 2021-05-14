

# ConferenceRecordingSavedPayload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callControlId** | **String** | Participant&#39;s call ID used to issue commands via Call Control API. |  [optional]
**channels** | [**ChannelsEnum**](#ChannelsEnum) | Whether recording was recorded in &#x60;single&#x60; or &#x60;dual&#x60; channel. |  [optional]
**conferenceId** | [**UUID**](UUID.md) | ID of the conference that is being recorded. |  [optional]
**connectionId** | **String** | Call Control App ID (formerly Telnyx connection ID) used in the call. |  [optional]
**format** | [**FormatEnum**](#FormatEnum) | The audio file format used when storing the call recording. Can be either &#x60;mp3&#x60; or &#x60;wav&#x60;. |  [optional]
**publicRecordingUrls** | [**CallRecordingSavedPayloadPublicRecordingUrls**](CallRecordingSavedPayloadPublicRecordingUrls.md) |  |  [optional]
**recordingEndedAt** | [**OffsetDateTime**](OffsetDateTime.md) | ISO 8601 datetime of when recording ended. |  [optional]
**recordingId** | [**UUID**](UUID.md) | ID of the conference recording. |  [optional]
**recordingStartedAt** | [**OffsetDateTime**](OffsetDateTime.md) | ISO 8601 datetime of when recording started. |  [optional]
**recordingUrls** | [**CallRecordingSavedPayloadRecordingUrls**](CallRecordingSavedPayloadRecordingUrls.md) |  |  [optional]



## Enum: ChannelsEnum

Name | Value
---- | -----
SINGLE | &quot;single&quot;
DUAL | &quot;dual&quot;



## Enum: FormatEnum

Name | Value
---- | -----
WAV | &quot;wav&quot;
MP3 | &quot;mp3&quot;



