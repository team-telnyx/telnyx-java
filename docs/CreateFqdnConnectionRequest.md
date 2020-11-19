

# CreateFqdnConnectionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Boolean** | Defaults to true |  [optional]
**anchorsiteOverride** | [**AnchorsiteOverrideEnum**](#AnchorsiteOverrideEnum) | &#x60;Latency&#x60; directs Telnyx to route media through the site with the lowest round-trip time to the user&#39;s connection. Telnyx calculates this time using ICMP ping messages. This can be disabled by specifying a site to handle all media. |  [optional]
**connectionName** | **String** |  |  [optional]
**transportProtocol** | [**TransportProtocolEnum**](#TransportProtocolEnum) | One of UDP, TLS, or TCP. Applies only to connections with IP authentication or FQDN authentication. |  [optional]
**defaultOnHoldComfortNoiseEnabled** | **Boolean** | When enabled, Telnyx will generate comfort noise when you place the call on hold. If disabled, you will need to generate comfort noise or on hold music to avoid RTP timeout. |  [optional]
**dtmfType** | [**DtmfTypeEnum**](#DtmfTypeEnum) | Sets the type of DTMF digits sent from Telnyx to this Connection. Note that DTMF digits sent to Telnyx will be accepted in all formats. |  [optional]
**encodeContactHeaderEnabled** | **Boolean** | Encode the SIP contact header sent by Telnyx to avoid issues for NAT or ALG scenarios. |  [optional]
**encryptedMedia** | [**EncryptedMediaEnum**](#EncryptedMediaEnum) | Enable use of SRTP or ZRTP for encryption. Valid values are those listed or null. Cannot be set to non-null if the transport_portocol is TLS. |  [optional]
**onnetT38PassthroughEnabled** | **Boolean** | Enable on-net T38 if you prefer the sender and receiver negotiating T38 directly if both are on the Telnyx network. If this is disabled, Telnyx will be able to use T38 on just one leg of the call depending on each leg&#39;s settings. |  [optional]
**rtcpSettings** | [**ConnectionRtcpSettings**](ConnectionRtcpSettings.md) |  |  [optional]
**inbound** | [**CreateInboundFqdnRequest**](CreateInboundFqdnRequest.md) |  |  [optional]



## Enum: AnchorsiteOverrideEnum

Name | Value
---- | -----
LATENCY | &quot;Latency&quot;
CHICAGO_IL | &quot;Chicago, IL&quot;
ASHBURN_VA | &quot;Ashburn, VA&quot;
SAN_JOSE_CA | &quot;San Jose, CA&quot;
SYDNEY_AUSTRALIA | &quot;Sydney, Australia&quot;
AMSTERDAM_NETHERLANDS | &quot;Amsterdam, Netherlands&quot;
LONDON_UK | &quot;London, UK&quot;
TORONTO_CANADA | &quot;Toronto, Canada&quot;
VANCOUVER_CANADA | &quot;Vancouver, Canada&quot;
FRANKFURT_GERMANY | &quot;Frankfurt, Germany&quot;



## Enum: TransportProtocolEnum

Name | Value
---- | -----
UDP | &quot;UDP&quot;
TCP | &quot;TCP&quot;
TLS | &quot;TLS&quot;



## Enum: DtmfTypeEnum

Name | Value
---- | -----
RFC_2833 | &quot;RFC 2833&quot;
INBAND | &quot;Inband&quot;
SIP_INFO | &quot;SIP INFO&quot;



## Enum: EncryptedMediaEnum

Name | Value
---- | -----
SRTP | &quot;SRTP&quot;
ZRTP | &quot;ZRTP&quot;



