

# FaxApplication


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Uniquely identifies the resource. |  [optional] |
|**recordType** | **String** | Identifies the type of the resource. |  [optional] |
|**applicationName** | **String** | A user-assigned name to help manage the application. |  [optional] |
|**active** | **Boolean** | Specifies whether the connection can be used. |  [optional] |
|**anchorsiteOverride** | **AnchorsiteOverride** |  |  [optional] |
|**webhookEventUrl** | **String** | The URL where webhooks related to this connection will be sent. Must include a scheme, such as &#39;https&#39;. |  [optional] |
|**webhookEventFailoverUrl** | **String** | The failover URL where webhooks related to this connection will be sent if sending to the primary URL fails. Must include a scheme, such as &#39;https&#39;. |  [optional] |
|**webhookTimeoutSecs** | **Integer** | Specifies how many seconds to wait before timing out a webhook. |  [optional] |
|**inbound** | [**CreateFaxApplicationRequestInbound**](CreateFaxApplicationRequestInbound.md) |  |  [optional] |
|**outbound** | [**CreateFaxApplicationRequestOutbound**](CreateFaxApplicationRequestOutbound.md) |  |  [optional] |
|**createdAt** | **String** | ISO 8601 formatted date indicating when the resource was created. |  [optional] |
|**updatedAt** | **String** | ISO 8601 formatted date indicating when the resource was updated. |  [optional] |



