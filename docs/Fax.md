

# Fax


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) | Identifies the type of the resource. |  [optional]
**id** | **UUID** | Identifies the fax. |  [optional]
**connectionId** | **String** | The connection ID to send the fax with. |  [optional]
**direction** | [**DirectionEnum**](#DirectionEnum) | The direction of the fax. |  [optional]
**mediaUrl** | **String** | The URL to the PDF used for the fax&#39;s media. If media_name was supplied, this is omitted. |  [optional]
**mediaName** | **String** | The media_name of a file used for the fax&#39;s media. |  [optional]
**to** | **String** | The phone number, in E.164 format, the fax will be sent to or SIP URI |  [optional]
**from** | **String** | The phone number, in E.164 format, the fax will be sent from. |  [optional]
**quality** | **String** | The quality of the fax. Can be normal, high, very_high |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the fax |  [optional]
**webhookUrl** | **String** | URL that will receive fax webhooks |  [optional]
**webhookFailoverUrl** | **String** | Optional failover URL that will receive fax webhooks if webhook_url doesn&#39;t return a 2XX response |  [optional]
**storeMedia** | **Boolean** | Should fax media be stored on temporary URL. |  [optional]
**storedMediaUrl** | **String** | If store_media was set to true, this is a link to temporary location. Link expires after 10 minutes. |  [optional]
**createdAt** | **String** | ISO 8601 timestamp when resource was created |  [optional]
**updatedAt** | **String** | ISO 8601 timestamp when resource was updated |  [optional]



## Enum: RecordTypeEnum

Name | Value
---- | -----
FAX | &quot;fax&quot;



## Enum: DirectionEnum

Name | Value
---- | -----
INBOUND | &quot;inbound&quot;
OUTBOUND | &quot;outbound&quot;



## Enum: StatusEnum

Name | Value
---- | -----
QUEUED | &quot;queued&quot;
MEDIA_PROCESSED | &quot;media.processed&quot;
SENDING | &quot;sending&quot;
DELIVERED | &quot;delivered&quot;
FAILED | &quot;failed&quot;
INITIATED | &quot;initiated&quot;
RECEIVING | &quot;receiving&quot;
MEDIA_PROCESSING | &quot;media.processing&quot;
RECEIVED | &quot;received&quot;



