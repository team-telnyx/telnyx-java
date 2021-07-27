

# ConferenceDetailRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Conference id |  [optional]
**name** | **String** | Conference name |  [optional]
**userId** | **String** | User id |  [optional]
**startedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Conference start time |  [optional]
**endedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Conference end time |  [optional]
**expiresAt** | [**OffsetDateTime**](OffsetDateTime.md) | Conference expiry time |  [optional]
**region** | **String** | Region where the conference is hosted |  [optional]
**callLegId** | **String** | Telnyx UUID that identifies the conference call leg |  [optional]
**callSessionId** | **String** | Telnyx UUID that identifies with conference call session |  [optional]
**connectionId** | **String** | Connection id |  [optional]
**callSec** | **Integer** | Duration of the conference call in seconds |  [optional]
**participantCount** | **Integer** | Number of participants that joined the conference call |  [optional]
**participantCallSec** | **Integer** | Sum of the conference call duration for all participants in seconds |  [optional]
**isTelnyxBillable** | **Boolean** | Indicates whether Telnyx billing charges might be applicable |  [optional]
**recordType** | **String** |  | 



