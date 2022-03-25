

# QueueCall


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) |  | 
**callSessionId** | **String** | ID that is unique to the call session and can be used to correlate webhook events. Call session is a group of related call legs that logically belong to the same phone call, e.g. an inbound and outbound leg of a transferred call | 
**callLegId** | **String** | ID that is unique to the call and can be used to correlate webhook events | 
**callControlId** | **String** | Unique identifier and token for controlling the call. | 
**connectionId** | **String** | Telnyx connection ID used in the call. | 
**from** | **String** | Number or SIP URI placing the call. | 
**to** | **String** | Destination number or SIP URI of the call. | 
**enqueuedAt** | **String** | ISO 8601 formatted date of when the call was put in the queue | 
**waitTimeSecs** | **Integer** | The time the call has been waiting in the queue, given in seconds | 
**queuePosition** | **Integer** | Current position of the call in the queue | 
**queueId** | **String** | Unique identifier of the queue the call is in. | 



## Enum: RecordTypeEnum

Name | Value
---- | -----
QUEUE_CALL | &quot;queue_call&quot;



