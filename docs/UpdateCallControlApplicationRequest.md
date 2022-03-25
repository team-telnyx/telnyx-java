

# UpdateCallControlApplicationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applicationName** | **String** | A user-assigned name to help manage the application. | 
**webhookEventUrl** | **String** | The URL where webhooks related to this connection will be sent. Must include a scheme, such as &#39;https&#39;. | 
**active** | **Boolean** | Specifies whether the connection can be used. |  [optional]
**anchorsiteOverride** | [**AnchorsiteOverrideEnum**](#AnchorsiteOverrideEnum) | &lt;code&gt;Latency&lt;/code&gt; directs Telnyx to route media through the site with the lowest round-trip time to the user&#39;s connection. Telnyx calculates this time using ICMP ping messages. This can be disabled by specifying a site to handle all media.  |  [optional]
**dtmfType** | [**DtmfTypeEnum**](#DtmfTypeEnum) | Sets the type of DTMF digits sent from Telnyx to this Connection. Note that DTMF digits sent to Telnyx will be accepted in all formats. |  [optional]
**firstCommandTimeout** | **Boolean** | Specifies whether calls to phone numbers associated with this connection should hangup after timing out. |  [optional]
**firstCommandTimeoutSecs** | **Integer** | Specifies how many seconds to wait before timing out a dial command. |  [optional]
**inbound** | [**CallControlApplicationInbound**](CallControlApplicationInbound.md) |  |  [optional]
**outbound** | [**CallControlApplicationOutbound**](CallControlApplicationOutbound.md) |  |  [optional]
**webhookApiVersion** | [**WebhookApiVersionEnum**](#WebhookApiVersionEnum) | Determines which webhook format will be used, Telnyx API v1 or v2. |  [optional]
**webhookEventFailoverUrl** | **String** | The failover URL where webhooks related to this connection will be sent if sending to the primary URL fails. Must include a scheme, such as &#39;https&#39;. |  [optional]
**webhookTimeoutSecs** | **Integer** | Specifies how many seconds to wait before timing out a webhook. |  [optional]



## Enum: AnchorsiteOverrideEnum

Name | Value
---- | -----
LATENCY_ | &quot;\&quot;Latency\&quot;&quot;
CHICAGO_IL_ | &quot;\&quot;Chicago, IL\&quot;&quot;
ASHBURN_VA_ | &quot;\&quot;Ashburn, VA\&quot;&quot;
SAN_JOSE_CA_ | &quot;\&quot;San Jose, CA\&quot;&quot;



## Enum: DtmfTypeEnum

Name | Value
---- | -----
RFC_2833 | &quot;RFC 2833&quot;
INBAND | &quot;Inband&quot;
SIP_INFO | &quot;SIP INFO&quot;



## Enum: WebhookApiVersionEnum

Name | Value
---- | -----
_1 | &quot;1&quot;
_2 | &quot;2&quot;



