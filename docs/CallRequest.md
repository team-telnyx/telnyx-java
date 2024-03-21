

# CallRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**to** | [**CallRequestTo**](CallRequestTo.md) |  |  |
|**from** | **String** | The &#x60;from&#x60; number to be used as the caller id presented to the destination (&#x60;to&#x60; number). The number should be in +E164 format. |  |
|**fromDisplayName** | **String** | The &#x60;from_display_name&#x60; string to be used as the caller id name (SIP From Display Name) presented to the destination (&#x60;to&#x60; number). The string should have a maximum of 128 characters, containing only letters, numbers, spaces, and -_~!.+ special characters. If ommited, the display name will be the same as the number in the &#x60;from&#x60; field. |  [optional] |
|**connectionId** | **String** | The ID of the Call Control App (formerly ID of the connection) to be used when dialing the destination. |  |
|**audioUrl** | **String** | The URL of a file to be played back to the callee when the call is answered. The URL can point to either a WAV or MP3 file. media_name and audio_url cannot be used together in one request. |  [optional] |
|**mediaName** | **String** | The media_name of a file to be played back to the callee when the call is answered. The media_name must point to a file previously uploaded to api.telnyx.com/v2/media by the same user/organization. The file must either be a WAV or MP3 file. |  [optional] |
|**preferredCodecs** | **String** | The list of comma-separated codecs in a preferred order for the forked media to be received. |  [optional] |
|**timeoutSecs** | **Integer** | The number of seconds that Telnyx will wait for the call to be answered by the destination to which it is being called. If the timeout is reached before an answer is received, the call will hangup and a &#x60;call.hangup&#x60; webhook with a &#x60;hangup_cause&#x60; of &#x60;timeout&#x60; will be sent. Minimum value is 5 seconds. Maximum value is 120 seconds. |  [optional] |
|**timeLimitSecs** | **Integer** | Sets the maximum duration of a Call Control Leg in seconds. If the time limit is reached, the call will hangup and a &#x60;call.hangup&#x60; webhook with a &#x60;hangup_cause&#x60; of &#x60;time_limit&#x60; will be sent. For example, by setting a time limit of 120 seconds, a Call Leg will be automatically terminated two minutes after being answered. The default time limit is 14400 seconds or 4 hours and this is also the maximum allowed call length. |  [optional] |
|**answeringMachineDetection** | [**AnsweringMachineDetectionEnum**](#AnsweringMachineDetectionEnum) | Enables Answering Machine Detection. Telnyx offers Premium and Standard detections. With Premium detection, when a call is answered, Telnyx runs real-time detection and sends a &#x60;call.machine.premium.detection.ended&#x60; webhook with one of the following results: &#x60;human_residence&#x60;, &#x60;human_business&#x60;, &#x60;machine&#x60;, &#x60;silence&#x60; or &#x60;fax_detected&#x60;. If we detect a beep, we also send a &#x60;call.machine.premium.greeting.ended&#x60; webhook with the result of &#x60;beep_detected&#x60;. If we detect a beep before &#x60;call.machine.premium.detection.ended&#x60; we only send &#x60;call.machine.premium.greeting.ended&#x60;, and if we detect a beep after &#x60;call.machine.premium.detection.ended&#x60;, we send both webhooks. With Standard detection, when a call is answered, Telnyx runs real-time detection to determine if it was picked up by a human or a machine and sends an &#x60;call.machine.detection.ended&#x60; webhook with the analysis result. If &#x60;greeting_end&#x60; or &#x60;detect_words&#x60; is used and a &#x60;machine&#x60; is detected, you will receive another &#x60;call.machine.greeting.ended&#x60; webhook when the answering machine greeting ends with a beep or silence. If &#x60;detect_beep&#x60; is used, you will only receive &#x60;call.machine.greeting.ended&#x60; if a beep is detected. |  [optional] |
|**answeringMachineDetectionConfig** | [**CallRequestAnsweringMachineDetectionConfig**](CallRequestAnsweringMachineDetectionConfig.md) |  |  [optional] |
|**customHeaders** | [**List&lt;CustomSipHeader&gt;**](CustomSipHeader.md) | Custom headers to be added to the SIP INVITE. |  [optional] |
|**billingGroupId** | **UUID** | Use this field to set the Billing Group ID for the call. Must be a valid and existing Billing Group ID. |  [optional] |
|**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional] |
|**commandId** | **String** | Use this field to avoid duplicate commands. Telnyx will ignore others Dial commands with the same &#x60;command_id&#x60;. |  [optional] |
|**linkTo** | **String** | Use another call&#39;s control id for sharing the same call session id |  [optional] |
|**mediaEncryption** | [**MediaEncryptionEnum**](#MediaEncryptionEnum) | Defines whether media should be encrypted on the call. |  [optional] |
|**sipAuthUsername** | **String** | SIP Authentication username used for SIP challenges. |  [optional] |
|**sipAuthPassword** | **String** | SIP Authentication password used for SIP challenges. |  [optional] |
|**sipHeaders** | [**List&lt;SipHeader&gt;**](SipHeader.md) | SIP headers to be added to the SIP INVITE request. Currently only User-to-User header is supported. |  [optional] |
|**sipTransportProtocol** | [**SipTransportProtocolEnum**](#SipTransportProtocolEnum) | Defines SIP transport protocol to be used on the call. |  [optional] |
|**soundModifications** | [**SoundModifications**](SoundModifications.md) |  |  [optional] |
|**streamUrl** | **String** | The destination WebSocket address where the stream is going to be delivered. |  [optional] |
|**streamTrack** | [**StreamTrackEnum**](#StreamTrackEnum) | Specifies which track should be streamed. |  [optional] |
|**sendSilenceWhenIdle** | **Boolean** | Generate silence RTP packets when no transmission available. |  [optional] |
|**webhookUrl** | **String** | Use this field to override the URL for which Telnyx will send subsequent webhooks to for this call. |  [optional] |
|**webhookUrlMethod** | [**WebhookUrlMethodEnum**](#WebhookUrlMethodEnum) | HTTP request type used for &#x60;webhook_url&#x60;. |  [optional] |
|**record** | [**RecordEnum**](#RecordEnum) | Start recording automatically after an event. Disabled by default. |  [optional] |
|**recordChannels** | [**RecordChannelsEnum**](#RecordChannelsEnum) | Defines which channel should be recorded (&#39;single&#39; or &#39;dual&#39;) when &#x60;record&#x60; is specified. |  [optional] |
|**recordFormat** | [**RecordFormatEnum**](#RecordFormatEnum) | Defines the format of the recording (&#39;wav&#39; or &#39;mp3&#39;) when &#x60;record&#x60; is specified. |  [optional] |
|**recordMaxLength** | **Integer** | Defines the maximum length for the recording in seconds when &#x60;record&#x60; is specified. The minimum value is 0. The maximum value is 43200. The default value is 0 (infinite). |  [optional] |
|**recordTimeoutSecs** | **Integer** | The number of seconds that Telnyx will wait for the recording to be stopped if silence is detected when &#x60;record&#x60; is specified. The timer only starts when the speech is detected. Please note that call transcription is used to detect silence and the related charge will be applied. The minimum value is 0. The default value is 0 (infinite). |  [optional] |
|**recordTrim** | [**RecordTrimEnum**](#RecordTrimEnum) | When set to &#x60;trim-silence&#x60;, silence will be removed from the beginning and end of the recording. |  [optional] |
|**recordCustomFileName** | **String** | The custom recording file name to be used instead of the default &#x60;call_leg_id&#x60;. Telnyx will still add a Unix timestamp suffix. |  [optional] |
|**enableDialogflow** | **Boolean** | Enables Dialogflow for the current call. The default value is false. |  [optional] |
|**dialogflowConfig** | [**DialogflowConfig**](DialogflowConfig.md) |  |  [optional] |



## Enum: AnsweringMachineDetectionEnum

| Name | Value |
|---- | -----|
| PREMIUM | &quot;premium&quot; |
| DETECT | &quot;detect&quot; |
| DETECT_BEEP | &quot;detect_beep&quot; |
| DETECT_WORDS | &quot;detect_words&quot; |
| GREETING_END | &quot;greeting_end&quot; |
| DISABLED | &quot;disabled&quot; |



## Enum: MediaEncryptionEnum

| Name | Value |
|---- | -----|
| DISABLED | &quot;disabled&quot; |
| SRTP | &quot;SRTP&quot; |



## Enum: SipTransportProtocolEnum

| Name | Value |
|---- | -----|
| UDP | &quot;UDP&quot; |
| TCP | &quot;TCP&quot; |
| TLS | &quot;TLS&quot; |



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



## Enum: RecordTrimEnum

| Name | Value |
|---- | -----|
| TRIM_SILENCE | &quot;trim-silence&quot; |



