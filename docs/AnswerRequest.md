

# AnswerRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**billingGroupId** | **UUID** | Use this field to set the Billing Group ID for the call. Must be a valid and existing Billing Group ID. |  [optional] |
|**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional] |
|**commandId** | **String** | Use this field to avoid duplicate commands. Telnyx will ignore any command with the same &#x60;command_id&#x60; for the same &#x60;call_control_id&#x60;. |  [optional] |
|**streamUrl** | **String** | The destination WebSocket address where the stream is going to be delivered. |  [optional] |
|**soundModifications** | [**SoundModifications**](SoundModifications.md) |  |  [optional] |
|**streamTrack** | [**StreamTrackEnum**](#StreamTrackEnum) | Specifies which track should be streamed. |  [optional] |
|**webhookUrl** | **String** | Use this field to override the URL for which Telnyx will send subsequent webhooks to for this call. |  [optional] |
|**webhookUrlMethod** | [**WebhookUrlMethodEnum**](#WebhookUrlMethodEnum) | HTTP request type used for &#x60;webhook_url&#x60;. |  [optional] |



## Enum: StreamTrackEnum

| Name | Value |
|---- | -----|
| INBOUND_TRACK | &quot;inbound_track&quot; |
| OUTBOUND_TRACK | &quot;outbound_track&quot; |
| BOTH_TRACKS | &quot;both_tracks&quot; |



## Enum: WebhookUrlMethodEnum

| Name | Value |
|---- | -----|
| POST | &quot;POST&quot; |
| GET | &quot;GET&quot; |



