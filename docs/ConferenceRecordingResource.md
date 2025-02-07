

# ConferenceRecordingResource


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountSid** | **String** | The id of the account the resource belongs to. |  [optional] |
|**callSid** | **String** | The identifier of the related participant&#39;s call. |  [optional] |
|**channels** | **Integer** | The number of channels in the recording. |  [optional] |
|**conferenceSid** | **String** | The identifier of the related conference. |  [optional] |
|**dateCreated** | **String** | The timestamp of when the resource was created. |  [optional] |
|**dateUpdated** | **String** | The timestamp of when the resource was last updated. |  [optional] |
|**duration** | **Integer** | Duratin of the recording in seconds. |  [optional] |
|**errorCode** | **String** | The recording error, if any. |  [optional] |
|**mediaUrl** | **String** | The URL to use to download the recording. |  [optional] |
|**sid** | **String** | The unique identifier of the recording. |  [optional] |
|**source** | [**SourceEnum**](#SourceEnum) | How the recording was started. |  [optional] |
|**startTime** | **String** | The timestamp of when the recording was started. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the recording. |  [optional] |
|**subresourceUris** | **Object** | A list of related resources identified by their relative URIs. |  [optional] |
|**uri** | **String** | The relative URI for this recording. |  [optional] |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| DIAL_VERB | &quot;DialVerb&quot; |
| CONFERENCE | &quot;Conference&quot; |
| OUTBOUND_API | &quot;OutboundAPI&quot; |
| TRUNKING | &quot;Trunking&quot; |
| RECORD_VERB | &quot;RecordVerb&quot; |
| START_CALL_RECORDING_API | &quot;StartCallRecordingAPI&quot; |
| START_CONFERENCE_RECORDING_API | &quot;StartConferenceRecordingAPI&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PROCESSING | &quot;processing&quot; |
| ABSENT | &quot;absent&quot; |
| COMPLETED | &quot;completed&quot; |
| DELETED | &quot;deleted&quot; |



