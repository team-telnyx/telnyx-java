

# ConferenceRecordingSavedPayload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conferenceId** | **String** | ID that is unique to the conference and can be used to correlate webhook events. |  [optional]
**connectionId** | **String** | Telnyx connection ID used in the call. |  [optional]
**recordingId** | **String** | ID of the recording. |  [optional]
**recordingStartedAt** | [**OffsetDateTime**](OffsetDateTime.md) | ISO 8601 datetime of when recording started. |  [optional]
**recordingEndedAt** | [**OffsetDateTime**](OffsetDateTime.md) | ISO 8601 datetime of when recording ended. |  [optional]
**channels** | [**ChannelsEnum**](#ChannelsEnum) | Whether recording was recorded in &#x60;single&#x60; or &#x60;dual&#x60; channel. |  [optional]
**recordingUrls** | [**CallRecordingSavedPayloadRecordingUrls**](CallRecordingSavedPayloadRecordingUrls.md) |  |  [optional]
**publicRecordingUrls** | [**CallRecordingSavedPayloadPublicRecordingUrls**](CallRecordingSavedPayloadPublicRecordingUrls.md) |  |  [optional]



## Enum: ChannelsEnum

Name | Value
---- | -----
SINGLE | &quot;single&quot;
DUAL | &quot;dual&quot;



