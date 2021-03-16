

# FaxQueued

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) | Identifies the type of the resource. |  [optional]
**id** | [**UUID**](UUID.md) | Identifies the type of resource. |  [optional]
**eventType** | [**EventTypeEnum**](#EventTypeEnum) | The type of event being delivered. |  [optional]
**payload** | [**FaxQueuedPayload**](FaxQueuedPayload.md) |  |  [optional]



## Enum: RecordTypeEnum

Name | Value
---- | -----
EVENT | &quot;event&quot;



## Enum: EventTypeEnum

Name | Value
---- | -----
FAX_QUEUED | &quot;fax.queued&quot;



