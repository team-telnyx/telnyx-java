# ShortCode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) | Identifies the type of the resource. |  [optional]
**id** | [**UUID**](UUID.md) | Identifies the type of resource. |  [optional]
**shortCode** | **String** | Short digit sequence used to address messages. |  [optional]
**countryCode** | **String** | ISO 3166-1 alpha-2 country code. |  [optional]
**messagingProfileId** | [**UUID**](UUID.md) | Unique identifier for a messaging profile. | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | ISO 8601 formatted date indicating when the resource was created. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | ISO 8601 formatted date indicating when the resource was updated. |  [optional]

<a name="RecordTypeEnum"></a>
## Enum: RecordTypeEnum
Name | Value
---- | -----
CODE | &quot;short_code&quot;
