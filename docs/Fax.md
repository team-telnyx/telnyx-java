

# Fax


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) | Identifies the type of the resource. |  [optional] |
|**id** | **UUID** | Identifies the type of resource. |  [optional] |
|**connectionId** | **String** | The ID of the connection used to send the fax. |  [optional] |
|**direction** | **Direction** |  |  [optional] |
|**mediaUrl** | **String** | The URL to the PDF used for the fax&#39;s media. media_url and media_name/contents can&#39;t be submitted together. |  [optional] |
|**mediaName** | **String** | The media_name used for the fax&#39;s media. Must point to a file previously uploaded to api.telnyx.com/v2/media by the same user/organization. media_name and media_url/contents can&#39;t be submitted together. |  [optional] |
|**to** | **String** | The phone number, in E.164 format, the fax will be sent to or SIP URI |  [optional] |
|**from** | **String** | The phone number, in E.164 format, the fax will be sent from. |  [optional] |
|**fromDisplayName** | **String** | The string used as the caller id name (SIP From Display Name) presented to the destination (&#x60;to&#x60; number). |  [optional] |
|**quality** | **Quality** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the fax |  [optional] |
|**webhookUrl** | **String** | URL that will receive fax webhooks |  [optional] |
|**webhookFailoverUrl** | **String** | Optional failover URL that will receive fax webhooks if webhook_url doesn&#39;t return a 2XX response |  [optional] |
|**storeMedia** | **Boolean** | Should fax media be stored on temporary URL. It does not support media_name. |  [optional] |
|**storedMediaUrl** | **String** | If store_media was set to true, this is a link to temporary location. Link expires after 10 minutes. |  [optional] |
|**createdAt** | **String** | ISO 8601 timestamp when resource was created |  [optional] |
|**updatedAt** | **String** | ISO 8601 timestamp when resource was updated |  [optional] |



## Enum: RecordTypeEnum

| Name | Value |
|---- | -----|
| FAX | &quot;fax&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| QUEUED | &quot;queued&quot; |
| MEDIA_PROCESSED | &quot;media.processed&quot; |
| ORIGINATED | &quot;originated&quot; |
| SENDING | &quot;sending&quot; |
| DELIVERED | &quot;delivered&quot; |
| FAILED | &quot;failed&quot; |
| INITIATED | &quot;initiated&quot; |
| RECEIVING | &quot;receiving&quot; |
| MEDIA_PROCESSING | &quot;media.processing&quot; |
| RECEIVED | &quot;received&quot; |



