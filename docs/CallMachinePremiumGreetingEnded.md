# CallMachinePremiumGreetingEnded

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) | Identifies the type of the resource. |  [optional]
**eventType** | [**EventTypeEnum**](#EventTypeEnum) | The type of event being delivered. |  [optional]
**id** | [**UUID**](UUID.md) | Identifies the type of resource. |  [optional]
**occurredAt** | [**OffsetDateTime**](OffsetDateTime.md) | ISO 8601 datetime of when the event occurred. |  [optional]
**payload** | [**CallMachinePremiumGreetingEndedPayload**](CallMachinePremiumGreetingEndedPayload.md) |  |  [optional]

<a name="RecordTypeEnum"></a>
## Enum: RecordTypeEnum
Name | Value
---- | -----
EVENT | &quot;event&quot;

<a name="EventTypeEnum"></a>
## Enum: EventTypeEnum
Name | Value
---- | -----
ENDED | &quot;call.machine.premium.greeting.ended&quot;
