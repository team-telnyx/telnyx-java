

# UpdateFqdnConnectionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**active** | **Boolean** | Defaults to true |  [optional] |
|**anchorsiteOverride** | **AnchorsiteOverride** |  |  [optional] |
|**connectionName** | **String** | A user-assigned name to help manage the connection. |  [optional] |
|**transportProtocol** | **FqdnConnectionTransportProtocol** |  |  [optional] |
|**defaultOnHoldComfortNoiseEnabled** | **Boolean** | When enabled, Telnyx will generate comfort noise when you place the call on hold. If disabled, you will need to generate comfort noise or on hold music to avoid RTP timeout. |  [optional] |
|**dtmfType** | **DtmfType** |  |  [optional] |
|**encodeContactHeaderEnabled** | **Boolean** | Encode the SIP contact header sent by Telnyx to avoid issues for NAT or ALG scenarios. |  [optional] |
|**encryptedMedia** | **EncryptedMedia** |  |  [optional] |
|**onnetT38PassthroughEnabled** | **Boolean** | Enable on-net T38 if you prefer that the sender and receiver negotiate T38 directly when both are on the Telnyx network. If this is disabled, Telnyx will be able to use T38 on just one leg of the call according to each leg&#39;s settings. |  [optional] |
|**iosPushCredentialId** | **String** | The uuid of the push credential for Ios |  [optional] |
|**androidPushCredentialId** | **String** | The uuid of the push credential for Android |  [optional] |
|**webhookEventUrl** | **String** | The URL where webhooks related to this connection will be sent. Must include a scheme, such as &#39;https&#39;. |  [optional] |
|**webhookEventFailoverUrl** | **String** | The failover URL where webhooks related to this connection will be sent if sending to the primary URL fails. Must include a scheme, such as &#39;https&#39;. |  [optional] |
|**webhookApiVersion** | **WebhookApiVersion** |  |  [optional] |
|**webhookTimeoutSecs** | **Integer** | Specifies how many seconds to wait before timing out a webhook. |  [optional] |
|**rtcpSettings** | [**ConnectionRtcpSettings**](ConnectionRtcpSettings.md) |  |  [optional] |
|**inbound** | [**InboundFqdn**](InboundFqdn.md) |  |  [optional] |
|**outbound** | [**OutboundFqdn**](OutboundFqdn.md) |  |  [optional] |



