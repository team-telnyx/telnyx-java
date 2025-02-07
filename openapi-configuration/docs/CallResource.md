

# CallResource


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountSid** | **String** | The id of the account the resource belongs to. |  [optional] |
|**answeredBy** | [**AnsweredByEnum**](#AnsweredByEnum) | The value of the answering machine detection result, if this feature was enabled for the call. |  [optional] |
|**callerName** | **String** | Caller ID, if present. |  [optional] |
|**dateCreated** | **String** | The timestamp of when the resource was created. |  [optional] |
|**dateUpdated** | **String** | The timestamp of when the resource was last updated. |  [optional] |
|**direction** | [**DirectionEnum**](#DirectionEnum) | The direction of this call. |  [optional] |
|**duration** | **String** | The duration of this call, given in seconds. |  [optional] |
|**endTime** | **String** | The end time of this call. |  [optional] |
|**from** | **String** | The phone number or SIP address that made this call. |  [optional] |
|**fromFormatted** | **String** | The from number formatted for display. |  [optional] |
|**price** | **String** | The price of this call, the currency is specified in the price_unit field. Only populated when the call cost feature is enabled for the account. |  [optional] |
|**priceUnit** | **String** | The unit in which the price is given. |  [optional] |
|**sid** | **String** | The identifier of this call. |  [optional] |
|**startTime** | **String** | The start time of this call. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of this call. |  [optional] |
|**to** | **String** | The phone number or SIP address that received this call. |  [optional] |
|**toFormatted** | **String** | The to number formatted for display. |  [optional] |
|**uri** | **String** | The relative URI for this call. |  [optional] |



## Enum: AnsweredByEnum

| Name | Value |
|---- | -----|
| HUMAN | &quot;human&quot; |
| MACHINE | &quot;machine&quot; |
| NOT_SURE | &quot;not_sure&quot; |



## Enum: DirectionEnum

| Name | Value |
|---- | -----|
| INBOUND | &quot;inbound&quot; |
| OUTBOUND | &quot;outbound&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| RINGING | &quot;ringing&quot; |
| IN_PROGRESS | &quot;in-progress&quot; |
| CANCELED | &quot;canceled&quot; |
| COMPLETED | &quot;completed&quot; |
| FAILED | &quot;failed&quot; |
| BUSY | &quot;busy&quot; |
| NO_ANSWER | &quot;no-answer&quot; |



