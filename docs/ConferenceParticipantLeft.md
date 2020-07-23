# ConferenceParticipantLeft

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) | Identifies the type of the resource. |  [optional]
**eventType** | [**EventTypeEnum**](#EventTypeEnum) | The type of event being delivered. |  [optional]
**id** | [**UUID**](UUID.md) | Identifies the type of resource. |  [optional]
**occurredAt** | [**OffsetDateTime**](OffsetDateTime.md) | ISO 8601 datetime of when the event occurred. |  [optional]
**payload** | [**ConferenceParticipantJoinedPayload**](ConferenceParticipantJoinedPayload.md) |  |  [optional]

<a name="RecordTypeEnum"></a>
## Enum: RecordTypeEnum
Name | Value
---- | -----
EVENT | &quot;event&quot;

<a name="EventTypeEnum"></a>
## Enum: EventTypeEnum
Name | Value
---- | -----
LEFT | &quot;conference.participant.left&quot;
