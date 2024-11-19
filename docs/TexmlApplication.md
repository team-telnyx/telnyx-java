

# TexmlApplication


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Uniquely identifies the resource. |  [optional] |
|**recordType** | **String** | Identifies the type of the resource. |  [optional] |
|**friendlyName** | **String** | A user-assigned name to help manage the application. |  [optional] |
|**active** | **Boolean** | Specifies whether the connection can be used. |  [optional] |
|**anchorsiteOverride** | **AnchorsiteOverride** |  |  [optional] |
|**dtmfType** | **DtmfType** |  |  [optional] |
|**firstCommandTimeout** | **Boolean** | Specifies whether calls to phone numbers associated with this connection should hangup after timing out. |  [optional] |
|**firstCommandTimeoutSecs** | **Integer** | Specifies how many seconds to wait before timing out a dial command. |  [optional] |
|**voiceUrl** | **String** | URL to which Telnyx will deliver your XML Translator webhooks. |  [optional] |
|**voiceFallbackUrl** | **String** | URL to which Telnyx will deliver your XML Translator webhooks if we get an error response from your voice_url. |  [optional] |
|**voiceMethod** | [**VoiceMethodEnum**](#VoiceMethodEnum) | HTTP request method Telnyx will use to interact with your XML Translator webhooks. Either &#39;get&#39; or &#39;post&#39;. |  [optional] |
|**statusCallback** | **String** | URL for Telnyx to send requests to containing information about call progress events. |  [optional] |
|**statusCallbackMethod** | [**StatusCallbackMethodEnum**](#StatusCallbackMethodEnum) | HTTP request method Telnyx should use when requesting the status_callback URL. |  [optional] |
|**inbound** | [**CreateTexmlApplicationRequestInbound**](CreateTexmlApplicationRequestInbound.md) |  |  [optional] |
|**outbound** | [**CreateTexmlApplicationRequestOutbound**](CreateTexmlApplicationRequestOutbound.md) |  |  [optional] |
|**createdAt** | **String** | ISO 8601 formatted date-time indicating when the resource was created. |  [optional] [readonly] |
|**updatedAt** | **String** | ISO 8601 formatted date-time indicating when the resource was updated. |  [optional] [readonly] |



## Enum: VoiceMethodEnum

| Name | Value |
|---- | -----|
| GET | &quot;get&quot; |
| POST | &quot;post&quot; |



## Enum: StatusCallbackMethodEnum

| Name | Value |
|---- | -----|
| GET | &quot;get&quot; |
| POST | &quot;post&quot; |



