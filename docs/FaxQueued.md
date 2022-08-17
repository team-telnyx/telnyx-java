

# FaxQueued


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recordType** | **String** | Identifies record type. |  [optional] |
|**id** | **UUID** | Identifies the resource. |  [optional] [readonly] |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) | The type of event being delivered. |  [optional] |
|**payload** | [**FaxQueuedPayload**](FaxQueuedPayload.md) |  |  [optional] |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| FAX_QUEUED | &quot;fax.queued&quot; |



