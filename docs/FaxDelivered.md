

# FaxDelivered


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recordType** | **String** | Identifies record type. |  [optional] |
|**id** | **UUID** | Identifies the resource. |  [optional] [readonly] |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) | The type of event being delivered. |  [optional] |
|**payload** | [**FaxDeliveredPayload**](FaxDeliveredPayload.md) |  |  [optional] |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| FAX_DELIVERED | &quot;fax.delivered&quot; |



