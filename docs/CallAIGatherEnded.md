

# CallAIGatherEnded


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) | Identifies the type of the resource. |  [optional] |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) | The type of event being delivered. |  [optional] |
|**id** | **UUID** | Identifies the type of resource. |  [optional] |
|**occurredAt** | **OffsetDateTime** | ISO 8601 datetime of when the event occurred. |  [optional] |
|**payload** | [**CallAIGatherEndedPayload**](CallAIGatherEndedPayload.md) |  |  [optional] |



## Enum: RecordTypeEnum

| Name | Value |
|---- | -----|
| EVENT | &quot;event&quot; |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| CALL_AI_GATHER_ENDED | &quot;call.ai_gather.ended&quot; |



