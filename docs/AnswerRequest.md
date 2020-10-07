# AnswerRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientState** | **byte[]** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional]
**commandId** | **String** | Use this field to avoid duplicate commands. Telnyx will ignore commands with the same &#x60;command_id&#x60;. |  [optional]
**webhookUrl** | **String** | Use this field to override the URL for which Telnyx will send subsuqeunt webhooks to for this call. |  [optional]
**webhookUrlMethod** | [**WebhookUrlMethodEnum**](#WebhookUrlMethodEnum) | HTTP request type used for &#x60;webhook_url&#x60;. |  [optional]

<a name="WebhookUrlMethodEnum"></a>
## Enum: WebhookUrlMethodEnum
Name | Value
---- | -----
POST | &quot;POST&quot;
GET | &quot;GET&quot;
