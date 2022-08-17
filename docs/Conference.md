

# Conference


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) |  |  |
|**id** | **String** | Uniquely identifies the conference |  |
|**name** | **String** | Name of the conference |  |
|**createdAt** | **String** | ISO 8601 formatted date of when the conference was created |  |
|**expiresAt** | **String** | ISO 8601 formatted date of when the conference will expire |  |
|**updatedAt** | **String** | ISO 8601 formatted date of when the conference was last updated |  [optional] |
|**region** | **String** | Region where the conference is hosted |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the conference |  [optional] |
|**endReason** | [**EndReasonEnum**](#EndReasonEnum) | Reason why the conference ended |  [optional] |
|**endedBy** | [**ConferenceEndedBy**](ConferenceEndedBy.md) |  |  [optional] |
|**connectionId** | **String** | Identifies the connection (Call Control App) associated with the conference |  [optional] |



## Enum: RecordTypeEnum

| Name | Value |
|---- | -----|
| CONFERENCE | &quot;conference&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| INIT | &quot;init&quot; |
| IN_PROGRESS | &quot;in_progress&quot; |
| COMPLETED | &quot;completed&quot; |



## Enum: EndReasonEnum

| Name | Value |
|---- | -----|
| ALL_LEFT | &quot;all_left&quot; |
| ENDED_VIA_API | &quot;ended_via_api&quot; |
| HOST_LEFT | &quot;host_left&quot; |
| TIME_EXCEEDED | &quot;time_exceeded&quot; |



