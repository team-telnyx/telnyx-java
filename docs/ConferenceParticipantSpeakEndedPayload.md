

# ConferenceParticipantSpeakEndedPayload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callControlId** | **String** | Participant&#39;s call ID used to issue commands via Call Control API. |  [optional]
**callLegId** | **String** | ID that is unique to the call and can be used to correlate webhook events. |  [optional]
**callSessionId** | **String** | ID that is unique to the call session and can be used to correlate webhook events. |  [optional]
**clientState** | **String** | State received from a command. |  [optional]
**connectionId** | **String** | Telnyx connection ID used in the call. |  [optional]
**creatorCallSessionId** | **String** | ID that is unique to the call session that started the conference. |  [optional]
**conferenceId** | **String** | ID of the conference the text was spoken in. |  [optional]
**occurredAt** | [**OffsetDateTime**](OffsetDateTime.md) | ISO 8601 datetime of when the event occurred. |  [optional]



