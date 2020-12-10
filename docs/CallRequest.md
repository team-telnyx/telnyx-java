

# CallRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**to** | **String** | The DID or SIP URI to dial out to. | 
**from** | **String** | The &#x60;from&#x60; number to be used as the caller id presented to the destination (&#x60;to&#x60; number). The number should be in +E164 format. This attribute will default to the &#x60;from&#x60; number of the original call if omitted. | 
**connectionId** | **String** | The ID of the connection to be used when dialing the destination. | 
**audioUrl** | **String** | The URL of a file to be played back to the callee when the call is answered. The URL can point to either a WAV or MP3 file. |  [optional]
**timeoutSecs** | **Integer** | The number of seconds that Telnyx will wait for the call to be answered by the destination to which it is being called. If the timeout is reached before an answer is received, the call will hangup and a &#x60;call.hangup&#x60; webhook with a &#x60;hangup_cause&#x60; of &#x60;timeout&#x60; will be sent. Minimum value is 5 seconds. Maximum value is 120 seconds. |  [optional]
**timeLimitSecs** | **Integer** | Sets the maximum duration of a Call Control Leg in seconds. If the time limit is reached, the call will hangup and a &#x60;call.hangup&#x60; webhook with a &#x60;hangup_cause&#x60; of &#x60;time_limit&#x60; will be sent. For example, by setting a time limit of 120 seconds, a Call Leg will be automatically terminated two minutes after being answered. The default time limit is 14400 seconds or 4 hours and this is also the maximum allowed call length. |  [optional]
**answeringMachineDetection** | [**AnsweringMachineDetectionEnum**](#AnsweringMachineDetectionEnum) | Enables Answering Machine Detection. Telnyx offers Premium and Standard detections. With Premium detection, when a call is answered, Telnyx runs real-time detection and sends a &#x60;call.machine.premium.detection.ended&#x60; webhook with one of the following results: &#x60;human_residence&#x60;, &#x60;human_business&#x60;, &#x60;machine&#x60;, &#x60;silence&#x60; or &#x60;fax_detected&#x60;. If we detect a beep, we also send a &#x60;call.machine.premium.greeting.ended&#x60; webhook with the result of &#x60;beep_detected&#x60;. If we detect a beep before &#x60;call.machine.premium.detection.ended&#x60; we only send &#x60;call.machine.premium.greeting.ended&#x60;, and if we detect a beep after &#x60;call.machine.premium.detection.ended&#x60;, we send both webhooks. With Standard detection, when a call is answered, Telnyx runs real-time detection to determine if it was picked up by a human or a machine and sends an &#x60;call.machine.detection.ended&#x60; webhook with the analysis result. If &#x60;greeting_end&#x60; or &#x60;detect_words&#x60; is used and a &#x60;machine&#x60; is detected, you will receive another &#x60;call.machine.greeting.ended&#x60; webhook when the answering machine greeting ends with a beep or silence. If &#x60;detect_beep&#x60; is used, you will only receive &#x60;call.machine.greeting.ended&#x60; if a beep is detected. |  [optional]
**answeringMachineDetectionConfig** | [**CallRequestAnsweringMachineDetectionConfig**](CallRequestAnsweringMachineDetectionConfig.md) |  |  [optional]
**customHeaders** | [**List&lt;CustomSipHeader&gt;**](CustomSipHeader.md) | Custom headers to be added to the SIP INVITE. |  [optional]
**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional]
**commandId** | **String** | Use this field to avoid duplicate commands. Telnyx will ignore commands with the same &#x60;command_id&#x60;. |  [optional]
**linkTo** | **String** | Use another call&#39;s control id for sharing the same call session id |  [optional]
**sipAuthUsername** | **String** | SIP Authentication username used for SIP challenges. |  [optional]
**sipAuthPassword** | **String** | SIP Authentication password used for SIP challenges. |  [optional]
**webhookUrl** | **String** | Use this field to override the URL for which Telnyx will send subsuqeunt webhooks to for this call. |  [optional]
**webhookUrlMethod** | [**WebhookUrlMethodEnum**](#WebhookUrlMethodEnum) | HTTP request type used for &#x60;webhook_url&#x60;. |  [optional]



## Enum: AnsweringMachineDetectionEnum

Name | Value
---- | -----
PREMIUM | &quot;premium&quot;
DETECT | &quot;detect&quot;
DETECT_BEEP | &quot;detect_beep&quot;
DETECT_WORDS | &quot;detect_words&quot;
GREETING_END | &quot;greeting_end&quot;
DISABLED | &quot;disabled&quot;



## Enum: WebhookUrlMethodEnum

Name | Value
---- | -----
POST | &quot;POST&quot;
GET | &quot;GET&quot;



