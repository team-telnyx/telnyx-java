

# AnswerRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**billingGroupId** | **UUID** | Use this field to set the Billing Group ID for the call. Must be a valid and existing Billing Group ID. |  [optional] |
|**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional] |
|**commandId** | **String** | Use this field to avoid duplicate commands. Telnyx will ignore any command with the same &#x60;command_id&#x60; for the same &#x60;call_control_id&#x60;. |  [optional] |
|**customHeaders** | [**List&lt;CustomSipHeader&gt;**](CustomSipHeader.md) | Custom headers to be added to the SIP INVITE response. |  [optional] |
|**preferredCodecs** | [**PreferredCodecsEnum**](#PreferredCodecsEnum) | The list of comma-separated codecs in a preferred order for the forked media to be received. |  [optional] |
|**sipHeaders** | [**List&lt;SipHeader&gt;**](SipHeader.md) | SIP headers to be added to the SIP INVITE response. Currently only User-to-User header is supported. |  [optional] |
|**soundModifications** | [**SoundModifications**](SoundModifications.md) |  |  [optional] |
|**streamUrl** | **String** | The destination WebSocket address where the stream is going to be delivered. |  [optional] |
|**streamTrack** | [**StreamTrackEnum**](#StreamTrackEnum) | Specifies which track should be streamed. |  [optional] |
|**streamBidirectionalMode** | **StreamBidirectionalMode** |  |  [optional] |
|**streamBidirectionalCodec** | **StreamBidirectionalCodec** |  |  [optional] |
|**streamBidirectionalTargetLegs** | **StreamBidirectionalTargetLegs** |  |  [optional] |
|**sendSilenceWhenIdle** | **Boolean** | Generate silence RTP packets when no transmission available. |  [optional] |
|**webhookUrl** | **String** | Use this field to override the URL for which Telnyx will send subsequent webhooks to for this call. |  [optional] |
|**webhookUrlMethod** | [**WebhookUrlMethodEnum**](#WebhookUrlMethodEnum) | HTTP request type used for &#x60;webhook_url&#x60;. |  [optional] |
|**transcription** | **Boolean** | Enable transcription upon call answer. The default value is false. |  [optional] |
|**transcriptionConfig** | [**TranscriptionStartRequest**](TranscriptionStartRequest.md) |  |  [optional] |
|**record** | [**RecordEnum**](#RecordEnum) | Start recording automatically after an event. Disabled by default. |  [optional] |
|**recordChannels** | [**RecordChannelsEnum**](#RecordChannelsEnum) | Defines which channel should be recorded (&#39;single&#39; or &#39;dual&#39;) when &#x60;record&#x60; is specified. |  [optional] |
|**recordFormat** | [**RecordFormatEnum**](#RecordFormatEnum) | Defines the format of the recording (&#39;wav&#39; or &#39;mp3&#39;) when &#x60;record&#x60; is specified. |  [optional] |
|**recordMaxLength** | **Integer** | Defines the maximum length for the recording in seconds when &#x60;record&#x60; is specified. The minimum value is 0. The maximum value is 43200. The default value is 0 (infinite). |  [optional] |
|**recordTimeoutSecs** | **Integer** | The number of seconds that Telnyx will wait for the recording to be stopped if silence is detected when &#x60;record&#x60; is specified. The timer only starts when the speech is detected. Please note that call transcription is used to detect silence and the related charge will be applied. The minimum value is 0. The default value is 0 (infinite). |  [optional] |
|**recordTrack** | [**RecordTrackEnum**](#RecordTrackEnum) | The audio track to be recorded. Can be either &#x60;both&#x60;, &#x60;inbound&#x60; or &#x60;outbound&#x60;. If only single track is specified (&#x60;inbound&#x60;, &#x60;outbound&#x60;), &#x60;channels&#x60; configuration is ignored and it will be recorded as mono (single channel). |  [optional] |
|**recordTrim** | [**RecordTrimEnum**](#RecordTrimEnum) | When set to &#x60;trim-silence&#x60;, silence will be removed from the beginning and end of the recording. |  [optional] |
|**recordCustomFileName** | **String** | The custom recording file name to be used instead of the default &#x60;call_leg_id&#x60;. Telnyx will still add a Unix timestamp suffix. |  [optional] |



## Enum: PreferredCodecsEnum

| Name | Value |
|---- | -----|
| G722_PCMU_PCMA_G729_OPUS_VP8_H264 | &quot;G722,PCMU,PCMA,G729,OPUS,VP8,H264&quot; |



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



## Enum: RecordEnum

| Name | Value |
|---- | -----|
| RECORD_FROM_ANSWER | &quot;record-from-answer&quot; |



## Enum: RecordChannelsEnum

| Name | Value |
|---- | -----|
| SINGLE | &quot;single&quot; |
| DUAL | &quot;dual&quot; |



## Enum: RecordFormatEnum

| Name | Value |
|---- | -----|
| WAV | &quot;wav&quot; |
| MP3 | &quot;mp3&quot; |



## Enum: RecordTrackEnum

| Name | Value |
|---- | -----|
| BOTH | &quot;both&quot; |
| INBOUND | &quot;inbound&quot; |
| OUTBOUND | &quot;outbound&quot; |



## Enum: RecordTrimEnum

| Name | Value |
|---- | -----|
| TRIM_SILENCE | &quot;trim-silence&quot; |



