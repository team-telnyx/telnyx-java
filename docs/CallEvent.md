# CallEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) |  | 
**callLegId** | **String** | Uniquely identifies an individual call leg. | 
**callSessionId** | **String** | Uniquely identifies the call control session. A session may include multiple call leg events. | 
**eventTimestamp** | **String** | Event timestamp | 
**name** | **String** | Event name | 
**type** | [**TypeEnum**](#TypeEnum) | Event type | 
**metadata** | **Object** | Event metadata, which includes raw event, and extra information based on event type | 

<a name="RecordTypeEnum"></a>
## Enum: RecordTypeEnum
Name | Value
---- | -----
EVENT | &quot;call_event&quot;

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
COMMAND | &quot;command&quot;
WEBHOOK | &quot;webhook&quot;
