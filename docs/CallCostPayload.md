

# CallCostPayload


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**billedDurationSecs** | **Integer** | The number of seconds for which this call will be billed |  [optional]
**callControlId** | **String** | Call ID used to issue commands via Call Control API. |  [optional]
**callLegId** | **String** | ID that is unique to the call and can be used to correlate webhook events. |  [optional]
**callSessionId** | **String** | ID that is unique to the call session and can be used to correlate webhook events. Call session is a group of related call legs that logically belong to the same phone call, e.g. an inbound and outbound leg of a transferred call. |  [optional]
**clientState** | **String** | State received from a command. |  [optional]
**connectionId** | **String** | Identifies the type of resource. |  [optional]
**costParts** | [**List&lt;CallCostPayloadCostParts&gt;**](CallCostPayloadCostParts.md) |  |  [optional]
**totalCost** | **BigDecimal** | The billed cost of the call |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Reflects how command ended. |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
VALID | &quot;valid&quot;
INVALID | &quot;invalid&quot;
CALL_HANGUP | &quot;call_hangup&quot;
CANCELLED | &quot;cancelled&quot;
CANCELLED_AMD | &quot;cancelled_amd&quot;



