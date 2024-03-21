

# PortingAdditionalDocument


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Uniquely identifies this additional document |  [optional] |
|**documentType** | [**DocumentTypeEnum**](#DocumentTypeEnum) | Identifies the type of additional document |  [optional] |
|**documentId** | **UUID** | Identifies the associated document |  [optional] |
|**filename** | **String** | The filename of the related document. |  [optional] |
|**contentType** | **String** | The content type of the related document. |  [optional] |
|**portingOrderId** | **UUID** | Identifies the associated porting order |  [optional] |
|**recordType** | **String** | Identifies the type of the resource. |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was created. |  [optional] |
|**updatedAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was updated. |  [optional] |



## Enum: DocumentTypeEnum

| Name | Value |
|---- | -----|
| LOA | &quot;loa&quot; |
| INVOICE | &quot;invoice&quot; |
| CSR | &quot;csr&quot; |
| OTHER | &quot;other&quot; |



