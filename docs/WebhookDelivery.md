

# WebhookDelivery

Record of all attempts to deliver a webhook.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Uniquely identifies the webhook_delivery record. |  [optional]
**userId** | **UUID** | Uniquely identifies the user that owns the webhook_delivery record. |  [optional]
**recordType** | **String** | Identifies the type of the resource. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Delivery status: &#39;delivered&#39; when successfuly delivered or &#39;failed&#39; if all attempts have failed. |  [optional]
**webhook** | [**WebhookDeliveryWebhook**](WebhookDeliveryWebhook.md) |  |  [optional]
**startedAt** | **OffsetDateTime** | ISO 8601 timestamp indicating when the first request attempt was initiated. |  [optional]
**finishedAt** | **OffsetDateTime** | ISO 8601 timestamp indicating when the last webhook response has been received. |  [optional]
**attempts** | [**List&lt;Attempt&gt;**](Attempt.md) | Detailed delivery attempts, ordered by most recent. |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
DELIVERED | &quot;delivered&quot;
FAILED | &quot;failed&quot;



