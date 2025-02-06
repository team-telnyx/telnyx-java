

# WebhookPortingOrderMessagingChangedPayload

The webhook payload for the porting_order.messaging_changed event

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Identifies the porting order that was moved. |  [optional] |
|**customerReference** | **String** | Identifies the customer reference associated with the porting order. |  [optional] |
|**supportKey** | **String** | Identifies the support key associated with the porting order. |  [optional] |
|**messaging** | [**WebhookPortingOrderMessagingChangedPayloadMessaging**](WebhookPortingOrderMessagingChangedPayloadMessaging.md) |  |  [optional] |



