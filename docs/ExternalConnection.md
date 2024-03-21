

# ExternalConnection


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Identifies the resource. |  [optional] [readonly] |
|**recordType** | **String** | Identifies the type of the resource. |  [optional] |
|**active** | **Boolean** | Specifies whether the connection can be used. |  [optional] |
|**credentialActive** | **Boolean** | If the credential associated with this service is active. |  [optional] |
|**externalSipConnection** | **ExternalSipConnection** |  |  [optional] |
|**webhookEventUrl** | **String** | The URL where webhooks related to this connection will be sent. Must include a scheme, such as &#39;https&#39;. |  [optional] |
|**webhookEventFailoverUrl** | **String** | The failover URL where webhooks related to this connection will be sent if sending to the primary URL fails. Must include a scheme, such as &#39;https&#39;. |  [optional] |
|**webhookApiVersion** | [**WebhookApiVersionEnum**](#WebhookApiVersionEnum) | Determines which webhook format will be used, Telnyx API v1 or v2. |  [optional] |
|**webhookTimeoutSecs** | **Integer** | Specifies how many seconds to wait before timing out a webhook. |  [optional] |
|**inbound** | [**CreateExternalConnectionRequestInbound**](CreateExternalConnectionRequestInbound.md) |  |  [optional] |
|**outbound** | [**CreateExternalConnectionRequestOutbound**](CreateExternalConnectionRequestOutbound.md) |  |  [optional] |
|**createdAt** | **String** | ISO 8601 formatted date indicating when the resource was created. |  [optional] |
|**updatedAt** | **String** | ISO 8601 formatted date indicating when the resource was updated. |  [optional] |



## Enum: WebhookApiVersionEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |



