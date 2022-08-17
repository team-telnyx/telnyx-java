

# DynamicEmergencyEndpoint


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] [readonly] |
|**recordType** | **String** | Identifies the type of the resource. |  [optional] [readonly] |
|**dynamicEmergencyAddressId** | **String** | An id of a currently active dynamic emergency location. |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status of dynamic emergency address |  [optional] [readonly] |
|**sipFromId** | **String** |  |  [optional] [readonly] |
|**callbackNumber** | **String** |  |  |
|**callerName** | **String** |  |  |
|**createdAt** | **String** | ISO 8601 formatted date of when the resource was created |  [optional] [readonly] |
|**updatedAt** | **String** | ISO 8601 formatted date of when the resource was last updated |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| ACTIVATED | &quot;activated&quot; |
| REJECTED | &quot;rejected&quot; |



