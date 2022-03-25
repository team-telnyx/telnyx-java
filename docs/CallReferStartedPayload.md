

# CallReferStartedPayload


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callControlId** | **String** | Unique ID for controlling the call. |  [optional]
**callLegId** | **String** | ID that is unique to the call and can be used to correlate webhook events. |  [optional]
**callSessionId** | **String** | ID that is unique to the call session and can be used to correlate webhook events. Call session is a group of related call legs that logically belong to the same phone call, e.g. an inbound and outbound leg of a transferred call. |  [optional]
**connectionId** | **String** | Call Control App ID (formerly Telnyx connection ID) used in the call. |  [optional]
**clientState** | **String** | State received from a command. |  [optional]
**from** | **String** | Number or SIP URI placing the call. |  [optional]
**sipNotifyResponse** | **Integer** | SIP NOTIFY event status for tracking the REFER attempt. |  [optional]
**to** | **String** | Destination number or SIP URI of the call. |  [optional]



