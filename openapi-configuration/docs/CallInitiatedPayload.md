

# CallInitiatedPayload


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callControlId** | **String** | Call ID used to issue commands via Call Control API. |  [optional] |
|**connectionId** | **String** | Call Control App ID (formerly Telnyx connection ID) used in the call. |  [optional] |
|**connectionCodecs** | **String** | The list of comma-separated codecs enabled for the connection. |  [optional] |
|**offeredCodecs** | **String** | The list of comma-separated codecs offered by caller. |  [optional] |
|**callLegId** | **String** | ID that is unique to the call and can be used to correlate webhook events. |  [optional] |
|**customHeaders** | [**List&lt;CustomSipHeader&gt;**](CustomSipHeader.md) | Custom headers from sip invite |  [optional] |
|**sipHeaders** | [**List&lt;SipHeader&gt;**](SipHeader.md) | User-to-User and Diversion headers from sip invite. |  [optional] |
|**shakenStirAttestation** | **String** | SHAKEN/STIR attestation level. |  [optional] |
|**shakenStirValidated** | **Boolean** | Whether attestation was successfully validated or not. |  [optional] |
|**callSessionId** | **String** | ID that is unique to the call session and can be used to correlate webhook events. Call session is a group of related call legs that logically belong to the same phone call, e.g. an inbound and outbound leg of a transferred call. |  [optional] |
|**clientState** | **String** | State received from a command. |  [optional] |
|**callerIdName** | **String** | Caller id. |  [optional] |
|**callScreeningResult** | **String** | Call screening result. |  [optional] |
|**from** | **String** | Number or SIP URI placing the call. |  [optional] |
|**to** | **String** | Destination number or SIP URI of the call. |  [optional] |
|**direction** | [**DirectionEnum**](#DirectionEnum) | Whether the call is &#x60;incoming&#x60; or &#x60;outgoing&#x60;. |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | State received from a command. |  [optional] |
|**startTime** | **OffsetDateTime** | ISO 8601 datetime of when the call started. |  [optional] |
|**tags** | **List&lt;String&gt;** | Array of tags associated to number. |  [optional] |



## Enum: DirectionEnum

| Name | Value |
|---- | -----|
| INCOMING | &quot;incoming&quot; |
| OUTGOING | &quot;outgoing&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| PARKED | &quot;parked&quot; |
| BRIDGING | &quot;bridging&quot; |



