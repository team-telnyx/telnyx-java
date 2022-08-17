

# ConferencePlaybackEndedPayload


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**connectionId** | **String** | Call Control App ID (formerly Telnyx connection ID) used in the call. |  [optional] |
|**creatorCallSessionId** | **String** | ID that is unique to the call session that started the conference. |  [optional] |
|**conferenceId** | **String** | ID of the conference the text was spoken in. |  [optional] |
|**mediaUrl** | **String** | The audio URL being played back, if audio_url has been used to start. |  [optional] |
|**mediaName** | **String** | The name of the audio media file being played back, if media_name has been used to start. |  [optional] |
|**occurredAt** | **OffsetDateTime** | ISO 8601 datetime of when the event occurred. |  [optional] |



