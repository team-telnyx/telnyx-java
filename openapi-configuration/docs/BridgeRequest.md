

# BridgeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callControlId** | **String** | The Call Control ID of the call you want to bridge with, can&#39;t be used together with queue parameter or video_room_id parameter. |  |
|**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional] |
|**commandId** | **String** | Use this field to avoid duplicate commands. Telnyx will ignore any command with the same &#x60;command_id&#x60; for the same &#x60;call_control_id&#x60;. |  [optional] |
|**queue** | **String** | The name of the queue you want to bridge with, can&#39;t be used together with call_control_id parameter or video_room_id parameter. Bridging with a queue means bridging with the first call in the queue. The call will always be removed from the queue regardless of whether bridging succeeds. Returns an error when the queue is empty. |  [optional] |
|**videoRoomId** | **UUID** | The ID of the video room you want to bridge with, can&#39;t be used together with call_control_id parameter or queue parameter. |  [optional] |
|**videoRoomContext** | **String** | The additional parameter that will be passed to the video conference. It is a text field and the user can decide how to use it. For example, you can set the participant name or pass JSON text. It can be used only with video_room_id parameter. |  [optional] |
|**parkAfterUnbridge** | **String** | Specifies behavior after the bridge ends (i.e. the opposite leg either hangs up or is transferred). If supplied with the value &#x60;self&#x60;, the current leg will be parked after unbridge. If not set, the default behavior is to hang up the leg. |  [optional] |
|**playRingtone** | **Boolean** | Specifies whether to play a ringtone if the call you want to bridge with has not yet been answered. |  [optional] |
|**ringtone** | [**RingtoneEnum**](#RingtoneEnum) | Specifies which country ringtone to play when &#x60;play_ringtone&#x60; is set to &#x60;true&#x60;. If not set, the US ringtone will be played. |  [optional] |
|**record** | [**RecordEnum**](#RecordEnum) | Start recording automatically after an event. Disabled by default. |  [optional] |
|**recordChannels** | [**RecordChannelsEnum**](#RecordChannelsEnum) | Defines which channel should be recorded (&#39;single&#39; or &#39;dual&#39;) when &#x60;record&#x60; is specified. |  [optional] |
|**recordFormat** | [**RecordFormatEnum**](#RecordFormatEnum) | Defines the format of the recording (&#39;wav&#39; or &#39;mp3&#39;) when &#x60;record&#x60; is specified. |  [optional] |
|**recordMaxLength** | **Integer** | Defines the maximum length for the recording in seconds when &#x60;record&#x60; is specified. The minimum value is 0. The maximum value is 43200. The default value is 0 (infinite). |  [optional] |
|**recordTimeoutSecs** | **Integer** | The number of seconds that Telnyx will wait for the recording to be stopped if silence is detected when &#x60;record&#x60; is specified. The timer only starts when the speech is detected. Please note that call transcription is used to detect silence and the related charge will be applied. The minimum value is 0. The default value is 0 (infinite). |  [optional] |
|**recordTrack** | [**RecordTrackEnum**](#RecordTrackEnum) | The audio track to be recorded. Can be either &#x60;both&#x60;, &#x60;inbound&#x60; or &#x60;outbound&#x60;. If only single track is specified (&#x60;inbound&#x60;, &#x60;outbound&#x60;), &#x60;channels&#x60; configuration is ignored and it will be recorded as mono (single channel). |  [optional] |
|**recordTrim** | [**RecordTrimEnum**](#RecordTrimEnum) | When set to &#x60;trim-silence&#x60;, silence will be removed from the beginning and end of the recording. |  [optional] |
|**recordCustomFileName** | **String** | The custom recording file name to be used instead of the default &#x60;call_leg_id&#x60;. Telnyx will still add a Unix timestamp suffix. |  [optional] |



## Enum: RingtoneEnum

| Name | Value |
|---- | -----|
| AT | &quot;at&quot; |
| AU | &quot;au&quot; |
| BE | &quot;be&quot; |
| BG | &quot;bg&quot; |
| BR | &quot;br&quot; |
| CH | &quot;ch&quot; |
| CL | &quot;cl&quot; |
| CN | &quot;cn&quot; |
| CZ | &quot;cz&quot; |
| DE | &quot;de&quot; |
| DK | &quot;dk&quot; |
| EE | &quot;ee&quot; |
| ES | &quot;es&quot; |
| FI | &quot;fi&quot; |
| FR | &quot;fr&quot; |
| GR | &quot;gr&quot; |
| HU | &quot;hu&quot; |
| IL | &quot;il&quot; |
| IN | &quot;in&quot; |
| IT | &quot;it&quot; |
| JP | &quot;jp&quot; |
| LT | &quot;lt&quot; |
| MX | &quot;mx&quot; |
| MY | &quot;my&quot; |
| NL | &quot;nl&quot; |
| NO | &quot;no&quot; |
| NZ | &quot;nz&quot; |
| PH | &quot;ph&quot; |
| PL | &quot;pl&quot; |
| PT | &quot;pt&quot; |
| RU | &quot;ru&quot; |
| SE | &quot;se&quot; |
| SG | &quot;sg&quot; |
| TH | &quot;th&quot; |
| TW | &quot;tw&quot; |
| UK | &quot;uk&quot; |
| US_OLD | &quot;us-old&quot; |
| US | &quot;us&quot; |
| VE | &quot;ve&quot; |
| ZA | &quot;za&quot; |



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



