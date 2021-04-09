

# TranscriptionPayload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callControlId** | **String** | Unique identifier and token for controlling the call. |  [optional]
**callLegId** | **String** | ID that is unique to the call and can be used to correlate webhook events. |  [optional]
**callSessionId** | **String** | ID that is unique to the call session and can be used to correlate webhook events. |  [optional]
**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional]
**connectionId** | **String** | Telnyx connection ID used in the call. |  [optional]
**transcriptionData** | [**TranscriptionPayloadTranscriptionData**](TranscriptionPayloadTranscriptionData.md) |  |  [optional]



