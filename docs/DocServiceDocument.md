

# DocServiceDocument


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Identifies the resource. |  [optional] [readonly] |
|**recordType** | **String** | Identifies the type of the resource. |  [optional] [readonly] |
|**createdAt** | **String** | ISO 8601 formatted date-time indicating when the resource was created. |  [optional] [readonly] |
|**updatedAt** | **String** | ISO 8601 formatted date-time indicating when the resource was updated. |  [optional] [readonly] |
|**contentType** | **String** | The document&#39;s content_type. |  [optional] [readonly] |
|**size** | [**DocServiceDocumentAllOfSize**](DocServiceDocumentAllOfSize.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Indicates the current document reviewing status |  [optional] [readonly] |
|**sha256** | **String** | The document&#39;s SHA256 hash provided for optional verification purposes. |  [optional] [readonly] |
|**filename** | **String** | The filename of the document. |  [optional] |
|**customerReference** | **String** | Optional reference string for customer tracking. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| VERIFIED | &quot;verified&quot; |
| DENIED | &quot;denied&quot; |



