

# WdrReport


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Identifies the resource. |  [optional] [readonly] |
|**recordType** | **String** |  |  [optional] [readonly] |
|**createdAt** | **String** | ISO 8601 formatted date-time indicating when the resource was created. |  [optional] [readonly] |
|**updatedAt** | **String** | ISO 8601 formatted date-time indicating when the resource was updated. |  [optional] [readonly] |
|**startTime** | **String** | ISO 8601 formatted date-time indicating the start time. |  [optional] |
|**endTime** | **String** | ISO 8601 formatted date-time indicating the end time. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Indicates the status of the report, which is updated asynchronously. |  [optional] |
|**reportUrl** | **String** | The URL where the report content, when generated, will be published to. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| COMPLETE | &quot;complete&quot; |
| FAILED | &quot;failed&quot; |
| DELETED | &quot;deleted&quot; |



