# NewMessagingProfile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | A user friendly name for the messaging profile. | 
**enabled** | **Boolean** | Specifies whether the messaging profile is enabled or not. |  [optional]
**webhookUrl** | **String** | The URL where webhooks related to this messaging profile will be sent. |  [optional]
**webhookFailoverUrl** | **String** | The failover URL where webhooks related to this messaging profile will be sent if sending to the primary URL fails. |  [optional]
**webhookApiVersion** | [**WebhookApiVersionEnum**](#WebhookApiVersionEnum) | Determines which webhook format will be used, Telnyx API v1, v2, or a legacy 2010-04-01 format. |  [optional]
**numberPoolSettings** | [**NumberPoolSettings**](NumberPoolSettings.md) |  |  [optional]
**urlShortenerSettings** | [**UrlShortenerSettings**](UrlShortenerSettings.md) |  |  [optional]

<a name="WebhookApiVersionEnum"></a>
## Enum: WebhookApiVersionEnum
Name | Value
---- | -----
_1 | &quot;1&quot;
_2 | &quot;2&quot;
_2010_04_01 | &quot;2010-04-01&quot;
