

# TexmlCreateSiprecSessionResponseBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountSid** | **String** | The id of the account the resource belongs to. |  [optional] |
|**callSid** | **String** | The id of the call the resource belongs to. |  [optional] |
|**sid** | **String** | The SID of the siprec session. |  [optional] |
|**dateCreated** | **String** | The date and time the siprec session was created. |  [optional] |
|**dateUpdated** | **String** | The date and time the siprec session was last updated. |  [optional] |
|**startTime** | **String** | The date and time the siprec session was started. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the siprec session. |  [optional] |
|**track** | [**TrackEnum**](#TrackEnum) | The track used for the siprec session. |  [optional] |
|**uri** | **String** | The URI of the siprec session. |  [optional] |
|**errorCode** | **String** | The error code of the siprec session. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| IN_PROGRESS | &quot;in-progress&quot; |
| STOPPED | &quot;stopped&quot; |



## Enum: TrackEnum

| Name | Value |
|---- | -----|
| BOTH_TRACKS | &quot;both_tracks&quot; |
| INBOUND_TRACK | &quot;inbound_track&quot; |
| OUTBOUND_TRACK | &quot;outbound_track&quot; |



