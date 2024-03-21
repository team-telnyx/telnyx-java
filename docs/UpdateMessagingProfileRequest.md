

# UpdateMessagingProfileRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) | Identifies the type of the resource. |  [optional] [readonly] |
|**id** | **UUID** | Identifies the type of resource. |  [optional] [readonly] |
|**name** | **String** | A user friendly name for the messaging profile. |  [optional] |
|**enabled** | **Boolean** | Specifies whether the messaging profile is enabled or not. |  [optional] |
|**webhookUrl** | **String** | The URL where webhooks related to this messaging profile will be sent. |  [optional] |
|**webhookFailoverUrl** | **String** | The failover URL where webhooks related to this messaging profile will be sent if sending to the primary URL fails. |  [optional] |
|**webhookApiVersion** | [**WebhookApiVersionEnum**](#WebhookApiVersionEnum) | Determines which webhook format will be used, Telnyx API v1, v2, or a legacy 2010-04-01 format. |  [optional] |
|**whitelistedDestinations** | **List&lt;String&gt;** | Destinations to which the messaging profile is allowed to send. The elements in the list must be valid ISO 3166-1 alpha-2 country codes. If set to &#x60;[\&quot;*\&quot;]&#x60;, all destinations will be allowed.  This field is required if the messaging profile doesn&#39;t have it defined yet. |  [optional] |
|**createdAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was created. |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was updated. |  [optional] [readonly] |
|**v1Secret** | **String** | Secret used to authenticate with v1 endpoints. |  [optional] |
|**numberPoolSettings** | [**NumberPoolSettings**](NumberPoolSettings.md) |  |  [optional] |
|**urlShortenerSettings** | [**UrlShortenerSettings**](UrlShortenerSettings.md) |  |  [optional] |
|**alphaSender** | **String** | The alphanumeric sender ID to use when sending to destinations that require an alphanumeric sender ID. |  [optional] |



## Enum: RecordTypeEnum

| Name | Value |
|---- | -----|
| MESSAGING_PROFILE | &quot;messaging_profile&quot; |



## Enum: WebhookApiVersionEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |
| _2010_04_01 | &quot;2010-04-01&quot; |



