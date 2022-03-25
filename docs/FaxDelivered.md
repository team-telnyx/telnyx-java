

# FaxDelivered


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) | Identifies the type of the resource. |  [optional]
**id** | **UUID** | Identifies the type of resource. |  [optional]
**eventType** | [**EventTypeEnum**](#EventTypeEnum) | The type of event being delivered. |  [optional]
**payload** | [**FaxDeliveredPayload**](FaxDeliveredPayload.md) |  |  [optional]



## Enum: RecordTypeEnum

Name | Value
---- | -----
EVENT | &quot;event&quot;



## Enum: EventTypeEnum

Name | Value
---- | -----
FAX_DELIVERED | &quot;fax.delivered&quot;



