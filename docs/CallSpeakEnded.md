

# CallSpeakEnded

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) | Identifies the type of the resource. |  [optional]
**eventType** | [**EventTypeEnum**](#EventTypeEnum) | The type of event being delivered. |  [optional]
**id** | [**UUID**](UUID.md) | Identifies the type of resource. |  [optional]
**occurredAt** | [**OffsetDateTime**](OffsetDateTime.md) | ISO 8601 datetime of when the event occurred. |  [optional]
**payload** | [**CallSpeakEndedPayload**](CallSpeakEndedPayload.md) |  |  [optional]



## Enum: RecordTypeEnum

Name | Value
---- | -----
EVENT | &quot;event&quot;



## Enum: EventTypeEnum

Name | Value
---- | -----
CALL_SPEAK_ENDED | &quot;call.speak.ended&quot;



