

# CallRecordingSavedPayload


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callLegId** | **String** | ID that is unique to the call and can be used to correlate webhook events. |  [optional] |
|**callSessionId** | **String** | ID that is unique to the call session and can be used to correlate webhook events. Call session is a group of related call legs that logically belong to the same phone call, e.g. an inbound and outbound leg of a transferred call. |  [optional] |
|**connectionId** | **String** | Call Control App ID (formerly Telnyx connection ID) used in the call. |  [optional] |
|**clientState** | **String** | State received from a command. |  [optional] |
|**recordingStartedAt** | **OffsetDateTime** | ISO 8601 datetime of when recording started. |  [optional] |
|**recordingEndedAt** | **OffsetDateTime** | ISO 8601 datetime of when recording ended. |  [optional] |
|**channels** | [**ChannelsEnum**](#ChannelsEnum) | Whether recording was recorded in &#x60;single&#x60; or &#x60;dual&#x60; channel. |  [optional] |
|**recordingUrls** | [**CallRecordingSavedPayloadRecordingUrls**](CallRecordingSavedPayloadRecordingUrls.md) |  |  [optional] |
|**publicRecordingUrls** | [**CallRecordingSavedPayloadPublicRecordingUrls**](CallRecordingSavedPayloadPublicRecordingUrls.md) |  |  [optional] |



## Enum: ChannelsEnum

| Name | Value |
|---- | -----|
| SINGLE | &quot;single&quot; |
| DUAL | &quot;dual&quot; |



