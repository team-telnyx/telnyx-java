

# Queue


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) |  |  |
|**id** | **String** | Uniquely identifies the queue |  |
|**name** | **String** | Name of the queue |  |
|**createdAt** | **String** | ISO 8601 formatted date of when the queue was created |  |
|**updatedAt** | **String** | ISO 8601 formatted date of when the queue was last updated |  |
|**currentSize** | **Integer** | The number of calls currently in the queue |  |
|**maxSize** | **Integer** | Maximum number of calls that can be in the queue at once |  |
|**averageWaitTimeSecs** | **Integer** | The average time that the calls currently in the queue have spent waiting, given in seconds. |  |



## Enum: RecordTypeEnum

| Name | Value |
|---- | -----|
| QUEUE | &quot;queue&quot; |



