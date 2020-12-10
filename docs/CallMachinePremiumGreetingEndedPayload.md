

# CallMachinePremiumGreetingEndedPayload

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
**result** | [**ResultEnum**](#ResultEnum) | Premium Answering Machine Greeting Ended result. |  [optional]



## Enum: ResultEnum

Name | Value
---- | -----
BEEP_DETECTED | &quot;beep_detected&quot;



