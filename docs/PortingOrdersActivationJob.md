

# PortingOrdersActivationJob


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Uniquely identifies this activation job |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | Specifies the status of this activation job |  [optional] |
|**activationType** | [**ActivationTypeEnum**](#ActivationTypeEnum) | Specifies the type of this activation job |  [optional] |
|**activateAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the activation job should be executed. This time should be between some activation window. |  [optional] |
|**activationWindows** | [**List&lt;PortingOrdersActivationJobActivationWindowsInner&gt;**](PortingOrdersActivationJobActivationWindowsInner.md) | List of allowed activation windows for this activation job |  [optional] |
|**recordType** | **String** | Identifies the type of the resource. |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was created. |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was created. |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;created&quot; |
| IN_PROCESS | &quot;in-process&quot; |
| COMPLETED | &quot;completed&quot; |
| FAILED | &quot;failed&quot; |



## Enum: ActivationTypeEnum

| Name | Value |
|---- | -----|
| SCHEDULED | &quot;scheduled&quot; |
| ON_DEMAND | &quot;on-demand&quot; |



