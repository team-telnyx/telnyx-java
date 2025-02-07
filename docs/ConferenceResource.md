

# ConferenceResource


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountSid** | **String** | The id of the account the resource belongs to. |  [optional] |
|**apiVersion** | **String** | The version of the API that was used to make the request. |  [optional] |
|**callSidEndingConference** | **String** | Caller ID, if present. |  [optional] |
|**dateCreated** | **String** | The timestamp of when the resource was created. |  [optional] |
|**dateUpdated** | **String** | The timestamp of when the resource was last updated. |  [optional] |
|**friendlyName** | **String** | A string that you assigned to describe this conference room. |  [optional] |
|**reasonConferenceEnded** | [**ReasonConferenceEndedEnum**](#ReasonConferenceEndedEnum) | The reason why a conference ended. When a conference is in progress, will be null. |  [optional] |
|**region** | **String** | A string representing the region where the conference is hosted. |  [optional] |
|**sid** | **String** | The unique identifier of the conference. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of this conference. |  [optional] |
|**subresourceUris** | **Object** | A list of related resources identified by their relative URIs. |  [optional] |
|**uri** | **String** | The relative URI for this conference. |  [optional] |



## Enum: ReasonConferenceEndedEnum

| Name | Value |
|---- | -----|
| PARTICIPANT_WITH_END_CONFERENCE_ON_EXIT_LEFT | &quot;participant-with-end-conference-on-exit-left&quot; |
| LAST_PARTICIPANT_LEFT | &quot;last-participant-left&quot; |
| CONFERENCE_ENDED_VIA_API | &quot;conference-ended-via-api&quot; |
| TIME_EXCEEDED | &quot;time-exceeded&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| INIT | &quot;init&quot; |
| IN_PROGRESS | &quot;in-progress&quot; |
| COMPLETED | &quot;completed&quot; |



