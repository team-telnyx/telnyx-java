

# CallAnsweredPayload


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callControlId** | **String** | Call ID used to issue commands via Call Control API. |  [optional] |
|**connectionId** | **String** | Call Control App ID (formerly Telnyx connection ID) used in the call. |  [optional] |
|**callLegId** | **String** | ID that is unique to the call and can be used to correlate webhook events. |  [optional] |
|**callSessionId** | **String** | ID that is unique to the call session and can be used to correlate webhook events. Call session is a group of related call legs that logically belong to the same phone call, e.g. an inbound and outbound leg of a transferred call. |  [optional] |
|**clientState** | **String** | State received from a command. |  [optional] |
|**customHeaders** | [**List&lt;CustomSipHeader&gt;**](CustomSipHeader.md) | Custom headers set on answer command |  [optional] |
|**sipHeaders** | [**List&lt;SipHeader&gt;**](SipHeader.md) | User-to-User and Diversion headers from sip invite. |  [optional] |
|**from** | **String** | Number or SIP URI placing the call. |  [optional] |
|**to** | **String** | Destination number or SIP URI of the call. |  [optional] |
|**startTime** | **OffsetDateTime** | ISO 8601 datetime of when the call started. |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | State received from a command. |  [optional] |
|**tags** | **List&lt;String&gt;** | Array of tags associated to number. |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| ANSWERED | &quot;answered&quot; |



