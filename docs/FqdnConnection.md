

# FqdnConnection


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Identifies the resource. |  [optional] |
|**recordType** | **String** | Identifies the type of the resource. |  [optional] |
|**active** | **Boolean** | Defaults to true |  [optional] |
|**anchorsiteOverride** | **AnchorsiteOverride** |  |  [optional] |
|**connectionName** | **String** | A user-assigned name to help manage the connection. |  |
|**transportProtocol** | **FqdnConnectionTransportProtocol** |  |  [optional] |
|**defaultOnHoldComfortNoiseEnabled** | **Boolean** | When enabled, Telnyx will generate comfort noise when you place the call on hold. If disabled, you will need to generate comfort noise or on hold music to avoid RTP timeout. |  [optional] |
|**dtmfType** | **DtmfType** |  |  [optional] |
|**encodeContactHeaderEnabled** | **Boolean** | Encode the SIP contact header sent by Telnyx to avoid issues for NAT or ALG scenarios. |  [optional] |
|**encryptedMedia** | **EncryptedMedia** |  |  [optional] |
|**microsoftTeamsSbc** | **Boolean** | The connection is enabled for Microsoft Teams Direct Routing. |  [optional] |
|**onnetT38PassthroughEnabled** | **Boolean** | Enable on-net T38 if you prefer that the sender and receiver negotiate T38 directly when both are on the Telnyx network. If this is disabled, Telnyx will be able to use T38 on just one leg of the call according to each leg&#39;s settings. |  [optional] |
|**userName** | **String** | The username for the FQDN connection. |  [optional] |
|**password** | **String** | The password for the FQDN connection. |  [optional] |
|**rtpPassCodecsOnStreamChange** | **Boolean** | Defines if codecs should be passed on stream change. |  [optional] |
|**adjustDtmfTimestamp** | **Boolean** | Indicates whether DTMF timestamp adjustment is enabled. |  [optional] |
|**ignoreDtmfDuration** | **Boolean** | Indicates whether DTMF duration should be ignored. |  [optional] |
|**ignoreMarkBit** | **Boolean** | Indicates whether the mark bit should be ignored. |  [optional] |
|**callCostEnabled** | **Boolean** | Indicates whether call cost calculation is enabled. |  [optional] |
|**noiseSuppression** | **Boolean** | Indicates whether noise suppression is enabled. |  [optional] |
|**sendNormalizedTimestamps** | **Boolean** | Indicates whether normalized timestamps should be sent. |  [optional] |
|**thirdPartyControlEnabled** | **Boolean** | Indicates whether third-party control is enabled. |  [optional] |
|**txtName** | **String** | The name for the TXT record associated with the FQDN connection. |  [optional] |
|**txtValue** | **String** | The value for the TXT record associated with the FQDN connection. |  [optional] |
|**txtTtl** | **Integer** | The time to live for the TXT record associated with the FQDN connection. |  [optional] |
|**webhookEventUrl** | **String** | The URL where webhooks related to this connection will be sent. Must include a scheme, such as &#39;https&#39;. |  [optional] |
|**webhookEventFailoverUrl** | **String** | The failover URL where webhooks related to this connection will be sent if sending to the primary URL fails. Must include a scheme, such as &#39;https&#39;. |  [optional] |
|**webhookApiVersion** | **WebhookApiVersion** |  |  [optional] |
|**webhookTimeoutSecs** | **Integer** | Specifies how many seconds to wait before timing out a webhook. |  [optional] |
|**rtcpSettings** | [**ConnectionRtcpSettings**](ConnectionRtcpSettings.md) |  |  [optional] |
|**createdAt** | **String** | ISO 8601 formatted date-time indicating when the resource was created. |  [optional] [readonly] |
|**updatedAt** | **String** | ISO 8601 formatted date-time indicating when the resource was updated. |  [optional] [readonly] |
|**inbound** | [**InboundFqdn**](InboundFqdn.md) |  |  [optional] |
|**outbound** | [**OutboundFqdn**](OutboundFqdn.md) |  |  [optional] |



