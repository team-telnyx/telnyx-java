# ConferenceCreated

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) | Identifies the type of the resource. |  [optional]
**eventType** | [**EventTypeEnum**](#EventTypeEnum) | The type of event being delivered. |  [optional]
**id** | [**UUID**](UUID.md) | Identifies the type of resource. |  [optional]
**payload** | [**ConferenceCreatedPayload**](ConferenceCreatedPayload.md) |  |  [optional]

<a name="RecordTypeEnum"></a>
## Enum: RecordTypeEnum
Name | Value
---- | -----
EVENT | &quot;event&quot;

<a name="EventTypeEnum"></a>
## Enum: EventTypeEnum
Name | Value
---- | -----
CREATED | &quot;conference.created&quot;
