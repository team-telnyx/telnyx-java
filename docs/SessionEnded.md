

# SessionEnded


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) | An identifier for the type of the resource. |  [optional]
**eventType** | [**EventTypeEnum**](#EventTypeEnum) | The type of event being delivered. |  [optional]
**id** | **UUID** | Uniquely identify the event. |  [optional]
**occurredAt** | **OffsetDateTime** | ISO 8601 datetime of when the event occurred. |  [optional]
**payload** | [**SessionEndedPayload**](SessionEndedPayload.md) |  |  [optional]



## Enum: RecordTypeEnum

Name | Value
---- | -----
EVENT | &quot;event&quot;



## Enum: EventTypeEnum

Name | Value
---- | -----
VIDEO_ROOM_SESSION_ENDED | &quot;video.room.session.ended&quot;



