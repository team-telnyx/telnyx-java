

# CallRecordingErrorPayload


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callControlId** | **String** | Call ID used to issue commands via Call Control API. |  [optional]
**connectionId** | **String** | Telnyx connection ID used in the call. |  [optional]
**callLegId** | **String** | ID that is unique to the call and can be used to correlate webhook events. |  [optional]
**callSessionId** | **String** | ID that is unique to the call session and can be used to correlate webhook events. Call session is a group of related call legs that logically belong to the same phone call, e.g. an inbound and outbound leg of a transferred call. |  [optional]
**clientState** | **String** | State received from a command. |  [optional]
**reason** | [**ReasonEnum**](#ReasonEnum) | Indication that there was a problem recording the call. |  [optional]



## Enum: ReasonEnum

Name | Value
---- | -----
FAILED_TO_AUTHORIZE_WITH_STORAGE_USING_CUSTOM_CREDENTIALS | &quot;Failed to authorize with storage using custom credentials&quot;
INVALID_CREDENTIALS_JSON | &quot;Invalid credentials json&quot;
UNSUPPORTED_BACKEND | &quot;Unsupported backend&quot;
INTERNAL_SERVER_ERROR | &quot;Internal server error&quot;



