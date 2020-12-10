

# IpConnection

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifies the type of resource. |  [optional]
**recordType** | **String** | Identifies the type of the resource. |  [optional]
**active** | **Boolean** | Defaults to true |  [optional]
**anchorsiteOverride** | [**AnchorsiteOverride**](AnchorsiteOverride.md) |  |  [optional]
**connectionName** | **String** |  |  [optional]
**transportProtocol** | [**TransportProtocolEnum**](#TransportProtocolEnum) | One of UDP, TLS, or TCP. Applies only to connections with IP authentication or FQDN authentication. |  [optional]
**defaultOnHoldComfortNoiseEnabled** | **Boolean** | When enabled, Telnyx will generate comfort noise when you place the call on hold. If disabled, you will need to generate comfort noise or on hold music to avoid RTP timeout. |  [optional]
**dtmfType** | [**DtmfType**](DtmfType.md) |  |  [optional]
**encodeContactHeaderEnabled** | **Boolean** | Encode the SIP contact header sent by Telnyx to avoid issues for NAT or ALG scenarios. |  [optional]
**encryptedMedia** | [**EncryptedMedia**](EncryptedMedia.md) |  |  [optional]
**onnetT38PassthroughEnabled** | **Boolean** | Enable on-net T38 if you prefer the sender and receiver negotiating T38 directly if both are on the Telnyx network. If this is disabled, Telnyx will be able to use T38 on just one leg of the call depending on each leg&#39;s settings. |  [optional]
**rtcpSettings** | [**ConnectionRtcpSettings**](ConnectionRtcpSettings.md) |  |  [optional]
**createdAt** | **String** | ISO 8601 formatted date indicating when the resource was created. |  [optional]
**updatedAt** | **String** | ISO 8601 formatted date indicating when the resource was updated. |  [optional]
**inbound** | [**InboundIp**](InboundIp.md) |  |  [optional]
**outbound** | [**OutboundIp**](OutboundIp.md) |  |  [optional]



## Enum: TransportProtocolEnum

Name | Value
---- | -----
UDP | &quot;UDP&quot;
TCP | &quot;TCP&quot;
TLS | &quot;TLS&quot;



