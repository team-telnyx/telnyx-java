

# CallInitiatedPayload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callControlId** | **String** | Call ID used to issue commands via Call Control API. |  [optional]
**connectionId** | **String** | Call Control App ID (formerly Telnyx connection ID) used in the call. |  [optional]
**callLegId** | **String** | ID that is unique to the call and can be used to correlate webhook events. |  [optional]
**callSessionId** | **String** | ID that is unique to the call session and can be used to correlate webhook events. |  [optional]
**clientState** | **String** | State received from a command. |  [optional]
**from** | **String** | Number or SIP URI placing the call. |  [optional]
**to** | **String** | Destination number or SIP URI of the call. |  [optional]
**direction** | [**DirectionEnum**](#DirectionEnum) | Whether the call is &#x60;incoming&#x60; or &#x60;outgoing&#x60;. |  [optional]
**state** | [**StateEnum**](#StateEnum) | State received from a command. |  [optional]



## Enum: DirectionEnum

Name | Value
---- | -----
INCOMING | &quot;incoming&quot;
OUTGOING | &quot;outgoing&quot;



## Enum: StateEnum

Name | Value
---- | -----
PARKED | &quot;parked&quot;
BRIDGING | &quot;bridging&quot;



