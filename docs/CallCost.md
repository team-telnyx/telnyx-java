

# CallCost


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) | Identifies the type of resource. |  [optional]
**eventType** | [**EventTypeEnum**](#EventTypeEnum) | The type of the event being delivered |  [optional]
**id** | **UUID** | Uniquely identifies a webhook |  [optional]
**occurredAt** | **OffsetDateTime** | ISO 8601 datetime of when the event occurred. |  [optional]
**meta** | [**CallCostMeta**](CallCostMeta.md) |  |  [optional]
**payload** | [**CallCostPayload**](CallCostPayload.md) |  |  [optional]



## Enum: RecordTypeEnum

Name | Value
---- | -----
EVENT | &quot;event&quot;



## Enum: EventTypeEnum

Name | Value
---- | -----
CALL_COST | &quot;call.cost&quot;



