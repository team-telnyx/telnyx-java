# Call

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) |  | 
**callSessionId** | **String** | ID that is unique to the call session and can be used to correlate webhook events | 
**callLegId** | **String** | ID that is unique to the call and can be used to correlate webhook events | 
**callControlId** | **String** | Unique identifier and token for controlling the call. For Dial command it will always be &#x60;null&#x60; (dialing is asynchronous). | 
**isAlive** | **Boolean** | Indicates whether the call is alive or not. For Dial command it will always be &#x60;false&#x60; (dialing is asynchronous). | 

<a name="RecordTypeEnum"></a>
## Enum: RecordTypeEnum
Name | Value
---- | -----
CALL | &quot;call&quot;
