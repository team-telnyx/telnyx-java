# MessagingProfile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) | Identifies the type of the resource. |  [optional]
**id** | [**UUID**](UUID.md) | Identifies the type of resource. |  [optional]
**name** | **String** | A user friendly name for the messaging profile. |  [optional]
**enabled** | **Boolean** | Specifies whether the messaging profile is enabled or not. |  [optional]
**webhookUrl** | **String** | The URL where webhooks related to this messaging profile will be sent. |  [optional]
**webhookFailoverUrl** | **String** | The failover URL where webhooks related to this messaging profile will be sent if sending to the primary URL fails. |  [optional]
**webhookApiVersion** | [**WebhookApiVersionEnum**](#WebhookApiVersionEnum) | Determines which webhook format will be used, Telnyx API v1, v2, or a legacy 2010-04-01 format. |  [optional]
**whitelistedDestinations** | **List&lt;String&gt;** | Destinations to which the messaging profile is allowed to send. If set to &#x60;null&#x60;, all destinations will be allowed. Setting a value of &#x60;[\&quot;*\&quot;]&#x60; has the equivalent effect. The elements in the list must be valid ISO 3166-1 alpha-2 country codes. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | ISO 8601 formatted date indicating when the resource was created. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | ISO 8601 formatted date indicating when the resource was updated. |  [optional]
**v1Secret** | **String** | Secret used to authenticate with v1 endpoints. |  [optional]
**numberPoolSettings** | [**NumberPoolSettings**](NumberPoolSettings.md) |  |  [optional]
**urlShortenerSettings** | [**UrlShortenerSettings**](UrlShortenerSettings.md) |  |  [optional]

<a name="RecordTypeEnum"></a>
## Enum: RecordTypeEnum
Name | Value
---- | -----
PROFILE | &quot;messaging_profile&quot;

<a name="WebhookApiVersionEnum"></a>
## Enum: WebhookApiVersionEnum
Name | Value
---- | -----
_1 | &quot;1&quot;
_2 | &quot;2&quot;
_2010_04_01 | &quot;2010-04-01&quot;
