

# CallForkStartedPayload


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**connectionId** | **String** | Call Control App ID (formerly Telnyx connection ID) used in the call. |  [optional] |
|**callControlId** | **String** | Unique ID for controlling the call. |  [optional] |
|**callLegId** | **String** | ID that is unique to the call and can be used to correlate webhook events. |  [optional] |
|**callSessionId** | **String** | ID that is unique to the call session and can be used to correlate webhook events. Call session is a group of related call legs that logically belong to the same phone call, e.g. an inbound and outbound leg of a transferred call. |  [optional] |
|**clientState** | **String** | State received from a command. |  [optional] |
|**streamType** | [**StreamTypeEnum**](#StreamTypeEnum) | Type of media streamed. It can be either &#39;raw&#39; or &#39;decrypted&#39;. |  [optional] |



## Enum: StreamTypeEnum

| Name | Value |
|---- | -----|
| DECRYPTED | &quot;decrypted&quot; |



