

# ShortCode


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) | Identifies the type of the resource. |  [optional] [readonly] |
|**id** | **UUID** | Identifies the type of resource. |  [optional] [readonly] |
|**shortCode** | **String** | Short digit sequence used to address messages. |  [optional] [readonly] |
|**countryCode** | **String** | ISO 3166-1 alpha-2 country code. |  [optional] [readonly] |
|**messagingProfileId** | **String** | Unique identifier for a messaging profile. |  |
|**createdAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was created. |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was updated. |  [optional] [readonly] |



## Enum: RecordTypeEnum

| Name | Value |
|---- | -----|
| SHORT_CODE | &quot;short_code&quot; |



