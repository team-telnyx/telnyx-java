

# CallControlApplication

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Boolean** | Specifies whether the connection can be used. |  [optional]
**anchorsiteOverride** | [**AnchorsiteOverrideEnum**](#AnchorsiteOverrideEnum) | &#x60;Latency&#x60; directs Telnyx to route media through the site with the lowest round-trip time to the user&#39;s connection. Telnyx calculates this time using ICMP ping messages. This can be disabled by specifying a site to handle all media.  |  [optional]
**applicationName** | **String** | A user-assigned name to help manage the application. |  [optional]
**createdAt** | **String** | ISO 8601 formatted date of when the resource was created |  [optional]
**dtmfType** | [**DtmfTypeEnum**](#DtmfTypeEnum) | Sets the type of DTMF digits sent from Telnyx to this Connection. Note that DTMF digits sent to Telnyx will be accepted in all formats. |  [optional]
**firstCommandTimeout** | **Boolean** | Specifies whether calls to phone numbers associated with this connection should hangup after timing out. |  [optional]
**firstCommandTimeoutSecs** | **Integer** | Specifies how many seconds to wait before timing out a dial command. |  [optional]
**id** | **String** |  |  [optional]
**inbound** | [**CallControlApplicationInbound**](CallControlApplicationInbound.md) |  |  [optional]
**outbound** | [**CallControlApplicationOutbound**](CallControlApplicationOutbound.md) |  |  [optional]
**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) |  |  [optional]
**updatedAt** | **String** | ISO 8601 formatted date of when the resource was last updated |  [optional]
**webhookApiVersion** | [**WebhookApiVersionEnum**](#WebhookApiVersionEnum) | Determines which webhook format will be used, Telnyx API v1 or v2. |  [optional]
**webhookEventFailoverUrl** | **String** | The failover URL where webhooks related to this connection will be sent if sending to the primary URL fails. Must include a scheme, such as &#x60;https&#x60;. |  [optional]
**webhookEventUrl** | **String** | The URL where webhooks related to this connection will be sent. Must include a scheme, such as &#x60;https&#x60;. |  [optional]
**webhookTimeoutSecs** | **Integer** |  |  [optional]



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



## Enum: RecordTypeEnum

Name | Value
---- | -----
CALL_CONTROL_APPLICATION | &quot;call_control_application&quot;



## Enum: WebhookApiVersionEnum

Name | Value
---- | -----
_1 | &quot;1&quot;
_2 | &quot;2&quot;



