

# InboundIp

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aniNumberFormat** | [**AniNumberFormatEnum**](#AniNumberFormatEnum) | This setting allows you to set the format with which the caller&#39;s number (ANI) is sent for inbound phone calls. |  [optional]
**dnisNumberFormat** | [**DnisNumberFormatEnum**](#DnisNumberFormatEnum) |  |  [optional]
**codecs** | **List&lt;String&gt;** | Defines the list of codecs that Telnyx will send for inbound calls to a specific number on your portal account, in priority order. This only works when the Connection the number is assigned to uses Media Handling mode: default. OPUS and H.264 codecs are available only when using TCP or TLS transport for SIP. |  [optional]
**defaultPrimaryIpId** | **String** | The default primary IP to use for the number. Only settable if the connection is               of IP authentication type. Value must be the ID of an authorized IP set on the connection. |  [optional]
**defaultSecondaryIpId** | **String** | The default secondary IP to use for the number. Only settable if the connection is               of IP authentication type. Value must be the ID of an authorized IP set on the connection. |  [optional]
**defaultTertiaryIpId** | **String** | The default tertiary IP to use for the number. Only settable if the connection is               of IP authentication type. Value must be the ID of an authorized IP set on the connection. |  [optional]
**defaultRoutingMethod** | [**DefaultRoutingMethodEnum**](#DefaultRoutingMethodEnum) | Default routing method to be used when a number is associated with the connection. Must be one of the routing method types or left blank, other values are not allowed. |  [optional]
**channelLimit** | **Integer** | When set, this will limit the total number of inbound calls to phone numbers associated with this connection. |  [optional]
**generateRingbackTone** | **Boolean** | Generate ringback tone through 183 session progress message with early media. |  [optional]
**isupHeadersEnabled** | **Boolean** | When set, inbound phone calls will receive ISUP parameters via SIP headers. (Only when available and only when using TCP or TLS transport.) |  [optional]
**prackEnabled** | **Boolean** | Enable PRACK messages as defined in RFC3262. |  [optional]
**privacyZoneEnabled** | **Boolean** | By default, Telnyx does not send caller-id information when the caller has chosen to hide this information. When this option is enabled, Telnyx will send the SIP header Privacy:id plus the caller-id information so that the receiver side can choose when to hide it. |  [optional]
**sipCompactHeadersEnabled** | **Boolean** | Defaults to true. |  [optional]
**sipRegion** | [**SipRegionEnum**](#SipRegionEnum) | Selects which &#x60;sip_region&#x60; to receive inbound calls from. If null, the default region (US) will be used. |  [optional]
**sipSubdomain** | **String** | Specifies a subdomain that can be used to receive Inbound calls to a Connection, in the same way a phone number is used, from a SIP endpoint. Example: the subdomain \&quot;example.sip.telnyx.com\&quot; can be called from any SIP endpoint by using the SIP URI \&quot;sip:@example.sip.telnyx.com\&quot; where the user part can be any alphanumeric value. Please note TLS encrypted calls are not allowed for subdomain calls. |  [optional]
**sipSubdomainReceiveSettings** | [**SipSubdomainReceiveSettingsEnum**](#SipSubdomainReceiveSettingsEnum) | This option can be enabled to receive calls from: \&quot;Anyone\&quot; (any SIP endpoint in the public Internet) or \&quot;Only my connections\&quot; (any connection assigned to the same Telnyx user). |  [optional]
**timeout1xxSecs** | **Integer** | Time(sec) before aborting if connection is not made. |  [optional]
**timeout2xxSecs** | **Integer** | Time(sec) before aborting if call is unanswered (min: 1, max: 600). |  [optional]



## Enum: AniNumberFormatEnum

Name | Value
---- | -----
_E_164 | &quot;+E.164&quot;
E_164 | &quot;E.164&quot;
_E_164_NATIONAL | &quot;+E.164-national&quot;
E_164_NATIONAL | &quot;E.164-national&quot;



## Enum: DnisNumberFormatEnum

Name | Value
---- | -----
_E164 | &quot;+e164&quot;
E164 | &quot;e164&quot;
NATIONAL | &quot;national&quot;
SIP_USERNAME | &quot;sip_username&quot;



## Enum: DefaultRoutingMethodEnum

Name | Value
---- | -----
SEQUENTIAL | &quot;sequential&quot;
ROUND_ROBIN | &quot;round-robin&quot;



## Enum: SipRegionEnum

Name | Value
---- | -----
US | &quot;US&quot;
EUROPE | &quot;Europe&quot;
AUSTRALIA | &quot;Australia&quot;



## Enum: SipSubdomainReceiveSettingsEnum

Name | Value
---- | -----
ONLY_MY_CONNECTIONS | &quot;only_my_connections&quot;
FROM_ANYONE | &quot;from_anyone&quot;



