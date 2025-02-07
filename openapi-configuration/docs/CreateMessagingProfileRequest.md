

# CreateMessagingProfileRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | A user friendly name for the messaging profile. |  |
|**whitelistedDestinations** | **List&lt;String&gt;** | Destinations to which the messaging profile is allowed to send. The elements in the list must be valid ISO 3166-1 alpha-2 country codes. If set to &#x60;[\&quot;*\&quot;]&#x60; all destinations will be allowed. |  |
|**enabled** | **Boolean** | Specifies whether the messaging profile is enabled or not. |  [optional] |
|**webhookUrl** | **String** | The URL where webhooks related to this messaging profile will be sent. |  [optional] |
|**webhookFailoverUrl** | **String** | The failover URL where webhooks related to this messaging profile will be sent if sending to the primary URL fails. |  [optional] |
|**webhookApiVersion** | [**WebhookApiVersionEnum**](#WebhookApiVersionEnum) | Determines which webhook format will be used, Telnyx API v1, v2, or a legacy 2010-04-01 format. |  [optional] |
|**numberPoolSettings** | [**NumberPoolSettings**](NumberPoolSettings.md) |  |  [optional] |
|**urlShortenerSettings** | [**UrlShortenerSettings**](UrlShortenerSettings.md) |  |  [optional] |
|**alphaSender** | **String** | The alphanumeric sender ID to use when sending to destinations that require an alphanumeric sender ID. |  [optional] |
|**dailySpendLimit** | **String** | The maximum amount of money (in USD) that can be spent by this profile before midnight UTC. |  [optional] |
|**dailySpendLimitEnabled** | **Boolean** | Whether to enforce the value configured by &#x60;daily_spend_limit&#x60;. |  [optional] |
|**mmsFallBackToSms** | **Boolean** | enables SMS fallback for MMS messages. |  [optional] |
|**mmsTranscoding** | **Boolean** | enables automated resizing of MMS media. |  [optional] |



## Enum: WebhookApiVersionEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |
| _2010_04_01 | &quot;2010-04-01&quot; |



