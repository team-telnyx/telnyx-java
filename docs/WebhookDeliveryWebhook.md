

# WebhookDeliveryWebhook

Original webhook JSON data. Payload fields vary according to event type.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) | Identifies the type of the resource. |  [optional] |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) | The type of event being delivered. |  [optional] |
|**id** | **UUID** | Identifies the type of resource. |  [optional] |
|**occurredAt** | **OffsetDateTime** | ISO 8601 datetime of when the event occurred. |  [optional] |
|**payload** | **Object** |  |  [optional] |



## Enum: RecordTypeEnum

| Name | Value |
|---- | -----|
| EVENT | &quot;event&quot; |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| WEBHOOK_COMMAND | &quot;webhook.command&quot; |



