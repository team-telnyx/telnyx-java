

# PortingOrderSharingToken


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Uniquely identifies this sharing token |  [optional] |
|**portingOrderId** | **UUID** | Identifies the porting order resource being shared |  [optional] |
|**expiresInSeconds** | **Integer** | The number of seconds until the sharing token expires |  [optional] |
|**permissions** | [**List&lt;PermissionsEnum&gt;**](#List&lt;PermissionsEnum&gt;) | The permissions granted to the sharing token |  [optional] |
|**token** | **String** | A signed JWT token that can be used to access the shared resource |  [optional] |
|**expiresAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the sharing token expires. |  [optional] |
|**recordType** | **String** | Identifies the type of the resource. |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was created. |  [optional] |



## Enum: List&lt;PermissionsEnum&gt;

| Name | Value |
|---- | -----|
| PORTING_ORDER_DOCUMENT_READ | &quot;porting_order.document.read&quot; |
| PORTING_ORDER_DOCUMENT_UPDATE | &quot;porting_order.document.update&quot; |



