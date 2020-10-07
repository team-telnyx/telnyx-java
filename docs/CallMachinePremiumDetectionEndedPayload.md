# CallMachinePremiumDetectionEndedPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callControlId** | **String** | Call ID used to issue commands via Call Control API. |  [optional]
**connectionId** | **String** | Telnyx connection ID used in the call. |  [optional]
**callLegId** | **String** | ID that is unique to the call and can be used to correlate webhook events. |  [optional]
**callSessionId** | **String** | ID that is unique to the call session and can be used to correlate webhook events. |  [optional]
**clientState** | **String** | State received from a command. |  [optional]
**from** | **String** | Number or SIP URI placing the call. |  [optional]
**to** | **String** | Destination number or SIP URI of the call. |  [optional]
**result** | [**ResultEnum**](#ResultEnum) | Premium Answering Machine Detection result. |  [optional]

<a name="ResultEnum"></a>
## Enum: ResultEnum
Name | Value
---- | -----
HUMAN_RESIDENCE | &quot;human_residence&quot;
HUMAN_BUSINESS | &quot;human_business&quot;
MACHINE | &quot;machine&quot;
SILENCE | &quot;silence&quot;
FAX_DETECTED | &quot;fax_detected&quot;
