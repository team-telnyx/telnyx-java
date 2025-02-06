

# ConferenceParticipantPlaybackStartedPayload


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callControlId** | **String** | Participant&#39;s call ID used to issue commands via Call Control API. |  [optional] |
|**callLegId** | **String** | ID that is unique to the call and can be used to correlate webhook events. |  [optional] |
|**callSessionId** | **String** | ID that is unique to the call session and can be used to correlate webhook events. Call session is a group of related call legs that logically belong to the same phone call, e.g. an inbound and outbound leg of a transferred call. |  [optional] |
|**clientState** | **String** | State received from a command. |  [optional] |
|**connectionId** | **String** | Call Control App ID (formerly Telnyx connection ID) used in the call. |  [optional] |
|**creatorCallSessionId** | **String** | ID that is unique to the call session that started the conference. |  [optional] |
|**conferenceId** | **String** | ID of the conference the text was spoken in. |  [optional] |
|**mediaUrl** | **String** | The audio URL being played back, if audio_url has been used to start. |  [optional] |
|**mediaName** | **String** | The name of the audio media file being played back, if media_name has been used to start. |  [optional] |
|**occurredAt** | **OffsetDateTime** | ISO 8601 datetime of when the event occurred. |  [optional] |



