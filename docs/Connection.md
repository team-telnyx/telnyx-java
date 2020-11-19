

# Connection

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifies the specific resource. |  [optional]
**recordType** | **String** | Identifies the type of the resource. |  [optional]
**active** | **Boolean** | Defaults to true |  [optional]
**anchorsiteOverride** | [**AnchorsiteOverrideEnum**](#AnchorsiteOverrideEnum) | &#x60;Latency&#x60; directs Telnyx to route media through the site with the lowest round-trip time to the user&#39;s connection. Telnyx calculates this time using ICMP ping messages. This can be disabled by specifying a site to handle all media. |  [optional]
**connectionName** | **String** |  |  [optional]
**createdAt** | **String** | ISO 8601 formatted date indicating when the resource was created. |  [optional]
**updatedAt** | **String** | ISO 8601 formatted date indicating when the resource was updated. |  [optional]
**webhookEventUrl** | **String** | The URL where webhooks related to this connection will be sent. |  [optional]
**webhookEventFailoverUrl** | **String** | The failover URL where webhooks related to this connection will be sent if sending to the primary URL fails. |  [optional]
**webhookApiVersion** | [**WebhookApiVersionEnum**](#WebhookApiVersionEnum) | Determines which webhook format will be used, Telnyx API v1 or v2. |  [optional]
**outboundVoiceProfileId** | **String** | Identifies the associated outbound voice profile. |  [optional]



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



## Enum: WebhookApiVersionEnum

Name | Value
---- | -----
_1 | &quot;1&quot;
_2 | &quot;2&quot;



