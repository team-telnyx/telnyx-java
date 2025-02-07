

# BulkMessagingSettingsUpdatePhoneNumbers


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) | Identifies the type of the resource. |  [optional] [readonly] |
|**orderId** | **UUID** | Order ID to verify bulk update status. |  [optional] [readonly] |
|**success** | **List&lt;String&gt;** | Phoned numbers updated successfully. |  [optional] |
|**pending** | **List&lt;String&gt;** | Phone numbers pending to be updated. |  [optional] |
|**failed** | **List&lt;String&gt;** | Phone numbers that failed to update. |  [optional] |



## Enum: RecordTypeEnum

| Name | Value |
|---- | -----|
| MESSAGING_NUMBERS_BULK_UPDATE | &quot;messaging_numbers_bulk_update&quot; |



