

# CustomerServiceRecordStatusChangedEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Uniquely identifies the callback event. |  [optional] |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) | The type of the callback event. |  [optional] |
|**payload** | [**CustomerServiceRecordStatusChangedEventPayload**](CustomerServiceRecordStatusChangedEventPayload.md) |  |  [optional] |
|**occurredAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the callback event occurred. |  [optional] |
|**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) | Identifies the type of the resource. |  [optional] |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| CUSTOMER_SERVICE_RECORD_STATUS_CHANGED | &quot;customer_service_record.status_changed&quot; |



## Enum: RecordTypeEnum

| Name | Value |
|---- | -----|
| EVENT | &quot;event&quot; |



