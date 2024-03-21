

# UpdateCredentialConnectionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**active** | **Boolean** | Defaults to true |  [optional] |
|**userName** | **String** | The user name to be used as part of the credentials. Must be 4-32 characters long and alphanumeric values only (no spaces or special characters). |  [optional] |
|**password** | **String** | The password to be used as part of the credentials. Must be 8 to 128 characters long. |  [optional] |
|**anchorsiteOverride** | **AnchorsiteOverride** |  |  [optional] |
|**connectionName** | **String** | A user-assigned name to help manage the connection. |  [optional] |
|**sipUriCallingPreference** | [**SipUriCallingPreferenceEnum**](#SipUriCallingPreferenceEnum) | This feature enables inbound SIP URI calls to your Credential Auth Connection. If enabled for all (unrestricted) then anyone who calls the SIP URI &lt;your-username&gt;@telnyx.com will be connected to your Connection. You can also choose to allow only calls that are originated on any Connections under your account (internal). |  [optional] |
|**defaultOnHoldComfortNoiseEnabled** | **Boolean** | When enabled, Telnyx will generate comfort noise when you place the call on hold. If disabled, you will need to generate comfort noise or on hold music to avoid RTP timeout. |  [optional] |
|**dtmfType** | **DtmfType** |  |  [optional] |
|**encodeContactHeaderEnabled** | **Boolean** | Encode the SIP contact header sent by Telnyx to avoid issues for NAT or ALG scenarios. |  [optional] |
|**encryptedMedia** | **EncryptedMedia** |  |  [optional] |
|**onnetT38PassthroughEnabled** | **Boolean** | Enable on-net T38 if you prefer the sender and receiver negotiating T38 directly if both are on the Telnyx network. If this is disabled, Telnyx will be able to use T38 on just one leg of the call depending on each leg&#39;s settings. |  [optional] |
|**iosPushCredentialId** | **String** | The uuid of the push credential for Ios |  [optional] |
|**androidPushCredentialId** | **String** | The uuid of the push credential for Android |  [optional] |
|**webhookEventUrl** | **String** | The URL where webhooks related to this connection will be sent. Must include a scheme, such as &#39;https&#39;. |  [optional] |
|**webhookEventFailoverUrl** | **String** | The failover URL where webhooks related to this connection will be sent if sending to the primary URL fails. Must include a scheme, such as &#39;https&#39;. |  [optional] |
|**webhookApiVersion** | [**WebhookApiVersionEnum**](#WebhookApiVersionEnum) | Determines which webhook format will be used, Telnyx API v1 or v2. |  [optional] |
|**webhookTimeoutSecs** | **Integer** | Specifies how many seconds to wait before timing out a webhook. |  [optional] |
|**rtcpSettings** | [**ConnectionRtcpSettings**](ConnectionRtcpSettings.md) |  |  [optional] |
|**inbound** | [**CredentialInbound**](CredentialInbound.md) |  |  [optional] |
|**outbound** | [**CredentialOutbound**](CredentialOutbound.md) |  |  [optional] |



## Enum: SipUriCallingPreferenceEnum

| Name | Value |
|---- | -----|
| DISABLED | &quot;disabled&quot; |
| UNRESTRICTED | &quot;unrestricted&quot; |
| INTERNAL | &quot;internal&quot; |



## Enum: WebhookApiVersionEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |



