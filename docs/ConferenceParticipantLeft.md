

# ConferenceParticipantLeft


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) | Identifies the type of the resource. |  [optional]
**eventType** | [**EventTypeEnum**](#EventTypeEnum) | The type of event being delivered. |  [optional]
**id** | **UUID** | Identifies the type of resource. |  [optional]
**occurredAt** | **OffsetDateTime** | ISO 8601 datetime of when the event occurred. |  [optional]
**payload** | [**ConferenceParticipantJoinedPayload**](ConferenceParticipantJoinedPayload.md) |  |  [optional]



## Enum: RecordTypeEnum

Name | Value
---- | -----
EVENT | &quot;event&quot;



## Enum: EventTypeEnum

Name | Value
---- | -----
CONFERENCE_PARTICIPANT_LEFT | &quot;conference.participant.left&quot;



