

# InitiateCallRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**applicationSid** | **String** | The ID of the TeXML Application. |  |
|**to** | **String** | The phone number of the called party. Phone numbers are formatted with a &#x60;+&#x60; and country code. |  |
|**from** | **String** | The phone number of the party that initiated the call. Phone numbers are formatted with a &#x60;+&#x60; and country code. |  |
|**url** | **String** | The URL from which Telnyx will retrieve the TeXML call instructions. |  [optional] |
|**urlMethod** | [**UrlMethodEnum**](#UrlMethodEnum) | HTTP request type used for &#x60;Url&#x60;. The default value is inherited from TeXML Application setting. |  [optional] |
|**fallbackUrl** | **String** | A failover URL for which Telnyx will retrieve the TeXML call instructions if the &#x60;Url&#x60; is not responding. |  [optional] |
|**statusCallback** | **String** | URL destination for Telnyx to send status callback events to for the call. |  [optional] |
|**statusCallbackMethod** | [**StatusCallbackMethodEnum**](#StatusCallbackMethodEnum) | HTTP request type used for &#x60;StatusCallback&#x60;. |  [optional] |
|**statusCallbackEvent** | [**StatusCallbackEventEnum**](#StatusCallbackEventEnum) | The call events for which Telnyx should send a webhook. Multiple events can be defined when separated by a space. |  [optional] |
|**machineDetection** | [**MachineDetectionEnum**](#MachineDetectionEnum) | Enables Answering Machine Detection. |  [optional] |
|**detectionMode** | [**DetectionModeEnum**](#DetectionModeEnum) | Allows you to chose between Premium and Standard detections. |  [optional] |
|**asyncAmd** | **Boolean** | Select whether to perform answering machine detection in the background. By default execution is blocked until Answering Machine Detection is completed. |  [optional] |
|**asyncAmdStatusCallback** | **String** | URL destination for Telnyx to send AMD callback events to for the call. |  [optional] |
|**asyncAmdStatusCallbackMethod** | [**AsyncAmdStatusCallbackMethodEnum**](#AsyncAmdStatusCallbackMethodEnum) | HTTP request type used for &#x60;AsyncAmdStatusCallback&#x60;. The default value is inherited from TeXML Application setting. |  [optional] |
|**machineDetectionTimeout** | **Integer** | Maximum timeout threshold in milliseconds for overall detection. |  [optional] |
|**machineDetectionSpeechThreshold** | **Integer** | Maximum threshold of a human greeting. If greeting longer than this value, considered machine. Ignored when &#x60;premium&#x60; detection is used. |  [optional] |
|**machineDetectionSpeechEndThreshold** | **Integer** | Silence duration threshold after a greeting message or voice for it be considered human. Ignored when &#x60;premium&#x60; detection is used. |  [optional] |
|**machineDetectionSilenceTimeout** | **Integer** | If initial silence duration is greater than this value, consider it a machine. Ignored when &#x60;premium&#x60; detection is used. |  [optional] |
|**cancelPlaybackOnMachineDetection** | **Boolean** | Whether to cancel ongoing playback on &#x60;machine&#x60; detection. Defaults to &#x60;true&#x60;. |  [optional] |
|**cancelPlaybackOnDetectMessageEnd** | **Boolean** | Whether to cancel ongoing playback on &#x60;greeting ended&#x60; detection. Defaults to &#x60;true&#x60;. |  [optional] |
|**preferredCodecs** | **String** | The list of comma-separated codecs to be offered on a call. |  [optional] |
|**record** | **Boolean** | Whether to record the entire participant&#39;s call leg. Defaults to &#x60;false&#x60;. |  [optional] |
|**recordingChannels** | [**RecordingChannelsEnum**](#RecordingChannelsEnum) | The number of channels in the final recording. Defaults to &#x60;mono&#x60;. |  [optional] |
|**recordingStatusCallback** | **String** | The URL the recording callbacks will be sent to. |  [optional] |
|**recordingStatusCallbackMethod** | [**RecordingStatusCallbackMethodEnum**](#RecordingStatusCallbackMethodEnum) | HTTP request type used for &#x60;RecordingStatusCallback&#x60;. Defaults to &#x60;POST&#x60;. |  [optional] |
|**recordingStatusCallbackEvent** | **String** | The changes to the recording&#39;s state that should generate a call to &#x60;RecoridngStatusCallback&#x60;. Can be: &#x60;in-progress&#x60;, &#x60;completed&#x60; and &#x60;absent&#x60;. Separate multiple values with a space. Defaults to &#x60;completed&#x60;. |  [optional] |
|**recordingTimeout** | **Integer** | The number of seconds that Telnyx will wait for the recording to be stopped if silence is detected. The timer only starts when the speech is detected. Please note that the transcription is used to detect silence and the related charge will be applied. The minimum value is 0. The default value is 0 (infinite) |  [optional] |
|**recordingTrack** | [**RecordingTrackEnum**](#RecordingTrackEnum) | The audio track to record for the call. The default is &#x60;both&#x60;. |  [optional] |
|**sipAuthPassword** | **String** | The password to use for SIP authentication. |  [optional] |
|**sipAuthUsername** | **String** | The username to use for SIP authentication. |  [optional] |
|**trim** | [**TrimEnum**](#TrimEnum) | Whether to trim any leading and trailing silence from the recording. Defaults to &#x60;trim-silence&#x60;. |  [optional] |



## Enum: UrlMethodEnum

| Name | Value |
|---- | -----|
| GET | &quot;GET&quot; |
| POST | &quot;POST&quot; |



## Enum: StatusCallbackMethodEnum

| Name | Value |
|---- | -----|
| GET | &quot;GET&quot; |
| POST | &quot;POST&quot; |



## Enum: StatusCallbackEventEnum

| Name | Value |
|---- | -----|
| INITIATED | &quot;initiated&quot; |
| RINGING | &quot;ringing&quot; |
| ANSWERED | &quot;answered&quot; |
| COMPLETED | &quot;completed&quot; |



## Enum: MachineDetectionEnum

| Name | Value |
|---- | -----|
| ENABLE | &quot;Enable&quot; |
| DISABLE | &quot;Disable&quot; |
| DETECTMESSAGEEND | &quot;DetectMessageEnd&quot; |



## Enum: DetectionModeEnum

| Name | Value |
|---- | -----|
| PREMIUM | &quot;Premium&quot; |
| REGULAR | &quot;Regular&quot; |



## Enum: AsyncAmdStatusCallbackMethodEnum

| Name | Value |
|---- | -----|
| GET | &quot;GET&quot; |
| POST | &quot;POST&quot; |



## Enum: RecordingChannelsEnum

| Name | Value |
|---- | -----|
| MONO | &quot;mono&quot; |
| DUAL | &quot;dual&quot; |



## Enum: RecordingStatusCallbackMethodEnum

| Name | Value |
|---- | -----|
| GET | &quot;GET&quot; |
| POST | &quot;POST&quot; |



## Enum: RecordingTrackEnum

| Name | Value |
|---- | -----|
| INBOUND | &quot;inbound&quot; |
| OUTBOUND | &quot;outbound&quot; |
| BOTH | &quot;both&quot; |



## Enum: TrimEnum

| Name | Value |
|---- | -----|
| TRIM_SILENCE | &quot;trim-silence&quot; |
| DO_NOT_TRIM | &quot;do-not-trim&quot; |



