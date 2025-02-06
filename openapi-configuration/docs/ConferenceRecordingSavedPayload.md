

# ConferenceRecordingSavedPayload


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callControlId** | **String** | Participant&#39;s call ID used to issue commands via Call Control API. |  [optional] |
|**callSessionId** | **String** | ID that is unique to the call session and can be used to correlate webhook events. Call session is a group of related call legs that logically belong to the same phone call, e.g. an inbound and outbound leg of a transferred call. |  [optional] |
|**clientState** | **String** | State received from a command. |  [optional] |
|**channels** | [**ChannelsEnum**](#ChannelsEnum) | Whether recording was recorded in &#x60;single&#x60; or &#x60;dual&#x60; channel. |  [optional] |
|**conferenceId** | **UUID** | ID of the conference that is being recorded. |  [optional] |
|**connectionId** | **String** | Call Control App ID (formerly Telnyx connection ID) used in the call. |  [optional] |
|**format** | [**FormatEnum**](#FormatEnum) | The audio file format used when storing the call recording. Can be either &#x60;mp3&#x60; or &#x60;wav&#x60;. |  [optional] |
|**publicRecordingUrls** | [**CallRecordingSavedPayloadPublicRecordingUrls**](CallRecordingSavedPayloadPublicRecordingUrls.md) |  |  [optional] |
|**recordingEndedAt** | **OffsetDateTime** | ISO 8601 datetime of when recording ended. |  [optional] |
|**recordingId** | **UUID** | ID of the conference recording. |  [optional] |
|**recordingStartedAt** | **OffsetDateTime** | ISO 8601 datetime of when recording started. |  [optional] |
|**recordingUrls** | [**CallRecordingSavedPayloadRecordingUrls**](CallRecordingSavedPayloadRecordingUrls.md) |  |  [optional] |



## Enum: ChannelsEnum

| Name | Value |
|---- | -----|
| SINGLE | &quot;single&quot; |
| DUAL | &quot;dual&quot; |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| WAV | &quot;wav&quot; |
| MP3 | &quot;mp3&quot; |



