

# ConferenceParticipantDetailRecord


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Participant id |  [optional] |
|**userId** | **String** | User id |  [optional] |
|**conferenceId** | **String** | Conference id |  [optional] |
|**joinedAt** | **OffsetDateTime** | Participant join time |  [optional] |
|**leftAt** | **OffsetDateTime** | Participant leave time |  [optional] |
|**destinationNumber** | **String** | Number called by the participant to join the conference |  [optional] |
|**originatingNumber** | **String** | Participant origin number used in the conference call |  [optional] |
|**callLegId** | **String** | Telnyx UUID that identifies the conference call leg |  [optional] |
|**callSessionId** | **String** | Telnyx UUID that identifies with conference call session |  [optional] |
|**callSec** | **Integer** | Duration of the conference call in seconds |  [optional] |
|**billedSec** | **Integer** | Duration of the conference call for billing purposes |  [optional] |
|**isTelnyxBillable** | **Boolean** | Indicates whether Telnyx billing charges might be applicable |  [optional] |
|**rate** | **String** | Currency amount per billing unit used to calculate the Telnyx billing cost |  [optional] |
|**rateMeasuredIn** | **String** | Billing unit used to calculate the Telnyx billing cost |  [optional] |
|**cost** | **String** | Currency amount for Telnyx billing cost |  [optional] |
|**currency** | **String** | Telnyx account currency used to describe monetary values, including billing cost |  [optional] |
|**recordType** | **String** |  |  |



