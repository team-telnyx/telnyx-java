# UrlShortenerSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**domain** | **String** | One of the domains provided by the Telnyx URL shortener service.  | 
**prefix** | **String** | Optional prefix that can be used to identify your brand, and will appear in the Telnyx generated URLs after the domain name.  |  [optional]
**replaceBlacklistOnly** | **Boolean** | Use the link replacement tool only for links that are specifically blacklisted by Telnyx.  |  [optional]
**sendWebhooks** | **Boolean** | Receive webhooks for when your replaced links are clicked. Webhooks are sent to the webhooks on the messaging profile.  |  [optional]
