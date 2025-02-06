

# PortOutSupportingDocument


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**recordType** | **String** | Identifies the type of the resource. |  [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | Identifies the type of the document |  [readonly] |
|**portoutId** | **UUID** | Identifies the associated port request |  [readonly] |
|**documentId** | **UUID** | Identifies the associated document |  |
|**createdAt** | **String** | Supporting document creation timestamp in ISO 8601 format |  |
|**updatedAt** | **String** | Supporting document last changed timestamp in ISO 8601 format |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LOA | &quot;loa&quot; |
| INVOICE | &quot;invoice&quot; |



