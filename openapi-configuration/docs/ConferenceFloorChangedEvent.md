

# ConferenceFloorChangedEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) | Identifies the type of the resource. |  [optional] |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) | The type of event being delivered. |  [optional] |
|**id** | **UUID** | Identifies the type of resource. |  [optional] |
|**payload** | [**ConferenceFloorChangedEventPayload**](ConferenceFloorChangedEventPayload.md) |  |  [optional] |



## Enum: RecordTypeEnum

| Name | Value |
|---- | -----|
| EVENT | &quot;event&quot; |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| CONFERENCE_FLOOR_CHANGED | &quot;conference.floor.changed&quot; |



