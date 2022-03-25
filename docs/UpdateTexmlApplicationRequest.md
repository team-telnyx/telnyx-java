

# UpdateTexmlApplicationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**friendlyName** | **String** | A user-assigned name to help manage the application. | 
**active** | **Boolean** | Specifies whether the connection can be used. |  [optional]
**anchorsiteOverride** | **AnchorsiteOverride** |  |  [optional]
**dtmfType** | **DtmfType** |  |  [optional]
**firstCommandTimeout** | **Boolean** | Specifies whether calls to phone numbers associated with this connection should hangup after timing out. |  [optional]
**firstCommandTimeoutSecs** | **Integer** | Specifies how many seconds to wait before timing out a dial command. |  [optional]
**voiceUrl** | **String** | URL to which Telnyx will deliver your XML Translator webhooks. | 
**voiceFallbackUrl** | **String** | URL to which Telnyx will deliver your XML Translator webhooks if we get an error response from your voice_url. |  [optional]
**voiceMethod** | [**VoiceMethodEnum**](#VoiceMethodEnum) | HTTP request method Telnyx will use to interact with your XML Translator webhooks. Either &#39;get&#39; or &#39;post&#39;. |  [optional]
**statusCallback** | **String** | URL for Telnyx to send requests to containing information about call progress events. |  [optional]
**statusCallbackMethod** | [**StatusCallbackMethodEnum**](#StatusCallbackMethodEnum) | HTTP request method Telnyx should use when requesting the status_callback URL. |  [optional]
**inbound** | [**CreateTexmlApplicationRequestInbound**](CreateTexmlApplicationRequestInbound.md) |  |  [optional]
**outbound** | [**CreateTexmlApplicationRequestOutbound**](CreateTexmlApplicationRequestOutbound.md) |  |  [optional]



## Enum: VoiceMethodEnum

Name | Value
---- | -----
GET | &quot;get&quot;
POST | &quot;post&quot;



## Enum: StatusCallbackMethodEnum

Name | Value
---- | -----
GET | &quot;get&quot;
POST | &quot;post&quot;



