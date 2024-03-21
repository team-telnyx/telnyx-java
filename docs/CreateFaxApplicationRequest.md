

# CreateFaxApplicationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**applicationName** | **String** | A user-assigned name to help manage the application. |  |
|**active** | **Boolean** | Specifies whether the connection can be used. |  [optional] |
|**anchorsiteOverride** | **AnchorsiteOverride** |  |  [optional] |
|**webhookEventUrl** | **String** | The URL where webhooks related to this connection will be sent. Must include a scheme, such as &#39;https&#39;. |  |
|**webhookEventFailoverUrl** | **String** | The failover URL where webhooks related to this connection will be sent if sending to the primary URL fails. Must include a scheme, such as &#39;https&#39;. |  [optional] |
|**webhookTimeoutSecs** | **Integer** | Specifies how many seconds to wait before timing out a webhook. |  [optional] |
|**inbound** | [**CreateFaxApplicationRequestInbound**](CreateFaxApplicationRequestInbound.md) |  |  [optional] |
|**outbound** | [**CreateExternalConnectionRequestOutbound**](CreateExternalConnectionRequestOutbound.md) |  |  [optional] |



