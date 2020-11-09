

# NumberOrdered

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) | Identifies the type of the resource. |  [optional]
**id** | [**UUID**](UUID.md) | Identifies the type of resource. |  [optional]
**eventType** | **String** | The type of event being delivered. |  [optional]
**occurredAt** | [**OffsetDateTime**](OffsetDateTime.md) | ISO 8601 formatted date indicating when the resource was created. |  [optional]
**payload** | [**NumberOrder**](NumberOrder.md) |  |  [optional]



## Enum: RecordTypeEnum

Name | Value
---- | -----
EVENT | &quot;event&quot;



