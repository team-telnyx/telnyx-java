

# PortingOrderDocument


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Uniquely identifies the document in the porting order |  [optional] |
|**documentType** | [**DocumentTypeEnum**](#DocumentTypeEnum) | The type of document |  [optional] |
|**documentId** | **UUID** | Uniquely identifies a document uploaded via the &lt;code&gt;&lt;a href&#x3D;\&quot;https://developers.telnyx.com/docs/api/v2/documents/Documents#createDocument\&quot;&gt;/v2/documents&lt;/a&gt;&lt;/code&gt; endpoint. |  [optional] |
|**recordType** | **String** | Identifies the type of the resource. |  [optional] |
|**createdAt** | **OffsetDateTime** | ISO 8601 formatted date/time when document was associated for the porting order. |  [optional] |



## Enum: DocumentTypeEnum

| Name | Value |
|---- | -----|
| LOA | &quot;loa&quot; |
| INVOICE | &quot;invoice&quot; |
| OTHER | &quot;other&quot; |



