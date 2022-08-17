

# CheckContact



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) | Identifies the type of the resource. |  [optional] [readonly] |
|**input** | **String** | The value you sent in the contacts field of the JSON request. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the user. |  [optional] |
|**id** | **String** | WhatsApp user identifier that can be used in other API calls. Only returned if the status is valid. |  [optional] |



## Enum: RecordTypeEnum

| Name | Value |
|---- | -----|
| WHATSAPP_CONTACT | &quot;whatsapp_contact&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PROCESSING | &quot;processing&quot; |
| VALID | &quot;valid&quot; |
| INVALID | &quot;invalid&quot; |



