

# SimplifiedOTAUpdate

This object represents an Over the Air (OTA) update request. It allows tracking the current status of a operation that apply settings in a particular SIM card. <br/><br/>

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Identifies the resource. |  [optional] [readonly] |
|**recordType** | **String** |  |  [optional] [readonly] |
|**simCardId** | **UUID** | The identification UUID of the related SIM card resource. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Represents the type of the operation requested. This will relate directly to the source of the request. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**createdAt** | **String** | ISO 8601 formatted date-time indicating when the resource was created. |  [optional] [readonly] |
|**updatedAt** | **String** | ISO 8601 formatted date-time indicating when the resource was updated. |  [optional] [readonly] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SIM_CARD_NETWORK_PREFERENCES | &quot;sim_card_network_preferences&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| IN_PROGRESS | &quot;in-progress&quot; |
| COMPLETED | &quot;completed&quot; |
| FAILED | &quot;failed&quot; |



