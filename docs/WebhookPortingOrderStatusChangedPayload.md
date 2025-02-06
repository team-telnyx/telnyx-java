

# WebhookPortingOrderStatusChangedPayload

The webhook payload for the porting_order.status_changed event

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Identifies the porting order that was moved. |  [optional] |
|**customerReference** | **String** | Identifies the customer reference associated with the porting order. |  [optional] |
|**status** | [**PortingOrderStatus**](PortingOrderStatus.md) |  |  [optional] |
|**supportKey** | **String** | Identifies the support key associated with the porting order. |  [optional] |
|**updatedAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the porting order was moved. |  [optional] |
|**webhookUrl** | **String** | The URL to send the webhook to. |  [optional] |



