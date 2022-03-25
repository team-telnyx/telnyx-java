

# Connection


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifies the specific resource. |  [optional]
**recordType** | **String** | Identifies the type of the resource. |  [optional]
**active** | **Boolean** | Defaults to true |  [optional]
**anchorsiteOverride** | **AnchorsiteOverride** |  |  [optional]
**connectionName** | **String** |  |  [optional]
**createdAt** | **String** | ISO 8601 formatted date indicating when the resource was created. |  [optional]
**updatedAt** | **String** | ISO 8601 formatted date indicating when the resource was updated. |  [optional]
**webhookEventUrl** | **String** | The URL where webhooks related to this connection will be sent. |  [optional]
**webhookEventFailoverUrl** | **String** | The failover URL where webhooks related to this connection will be sent if sending to the primary URL fails. |  [optional]
**webhookApiVersion** | [**WebhookApiVersionEnum**](#WebhookApiVersionEnum) | Determines which webhook format will be used, Telnyx API v1 or v2. |  [optional]
**outboundVoiceProfileId** | **String** | Identifies the associated outbound voice profile. |  [optional]



## Enum: WebhookApiVersionEnum

Name | Value
---- | -----
_1 | &quot;1&quot;
_2 | &quot;2&quot;



