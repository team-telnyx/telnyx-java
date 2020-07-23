# Participant

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) |  | 
**id** | **String** | Uniquely identifies the participant | 
**callLegId** | **String** | Uniquely identifies the call leg associated with the participant | 
**callControlId** | **String** | Call Control ID associated with the partiipant of the conference | 
**conference** | [**ParticipantConference**](ParticipantConference.md) |  | 
**whisperCallControlIds** | **List&lt;String&gt;** | Array of unique call_control_ids the participant can whisper to.. | 
**createdAt** | **String** | ISO 8601 formatted date of when the participant was created | 
**updatedAt** | **String** | ISO 8601 formatted date of when the participant was last updated | 
**endConferenceOnExit** | **Boolean** | Whether the conference will end and all remaining participants be hung up after the participant leaves the conference. | 
**softEndConferenceOnExit** | **Boolean** | Whether the conference will end after the participant leaves the conference. | 
**status** | [**StatusEnum**](#StatusEnum) | The status of the participant with respect to the lifecycle within the conference | 
**muted** | **Boolean** | Whether the participant is muted. | 
**onHold** | **Boolean** | Whether the participant is put on_hold. | 

<a name="RecordTypeEnum"></a>
## Enum: RecordTypeEnum
Name | Value
---- | -----
PARTICIPANT | &quot;participant&quot;

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
JOINING | &quot;joining&quot;
JOINED | &quot;joined&quot;
LEFT | &quot;left&quot;
