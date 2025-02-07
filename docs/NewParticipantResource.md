

# NewParticipantResource


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountSid** | **String** | The id of the account the resource belongs to. |  [optional] |
|**callSid** | **String** | The identifier of this participant&#39;s call. |  [optional] |
|**coaching** | **Boolean** | Whether the participant is coaching another call. |  [optional] |
|**coachingCallSid** | **String** | The identifier of the coached participant&#39;s call. |  [optional] |
|**endConferenceOnExit** | **Boolean** | Whether the conference ends when the participant leaves. |  [optional] |
|**hold** | **Boolean** | Whether the participant is on hold. |  [optional] |
|**muted** | **Boolean** | Whether the participant is muted. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the participant&#39;s call in the conference. |  [optional] |
|**uri** | **String** | The relative URI for this participant. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CONNECTING | &quot;connecting&quot; |
| CONNECTED | &quot;connected&quot; |
| COMPLETED | &quot;completed&quot; |



