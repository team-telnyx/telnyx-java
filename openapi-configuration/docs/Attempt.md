

# Attempt

Webhook delivery attempt details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**startedAt** | **OffsetDateTime** | ISO 8601 timestamp indicating when the attempt was initiated. |  [optional] |
|**finishedAt** | **OffsetDateTime** | ISO 8601 timestamp indicating when the attempt has finished. |  [optional] |
|**http** | [**Http**](Http.md) |  |  [optional] |
|**errors** | **List&lt;Integer&gt;** | Webhook delivery error codes. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DELIVERED | &quot;delivered&quot; |
| FAILED | &quot;failed&quot; |



