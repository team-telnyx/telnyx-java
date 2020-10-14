

# PhoneNumberWithMessagingSettings

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) | Identifies the type of the resource. |  [optional] [readonly]
**id** | **String** | Identifies the type of resource. |  [optional] [readonly]
**phoneNumber** | **String** | +E.164 formatted phone number. |  [optional] [readonly]
**messagingProfileId** | **String** | Unique identifier for a messaging profile. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | ISO 8601 formatted date indicating when the resource was created. |  [optional] [readonly]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | ISO 8601 formatted date indicating when the resource was updated. |  [optional] [readonly]
**countryCode** | **String** | ISO 3166-1 alpha-2 country code. |  [optional] [readonly]
**type** | [**TypeEnum**](#TypeEnum) | The type of the phone number |  [optional] [readonly]
**health** | [**NumberHealthMetrics**](NumberHealthMetrics.md) |  |  [optional]
**eligibleMessagingProducts** | **List&lt;String&gt;** | The messaging products that this number can be registered to use |  [optional] [readonly]
**trafficType** | **String** | The messaging traffic or use case for which the number is currently configured. |  [optional] [readonly]
**messagingProduct** | **String** | The messaging product that the number is registered to use |  [optional]
**features** | [**PhoneNumberWithMessagingSettingsFeatures**](PhoneNumberWithMessagingSettingsFeatures.md) |  |  [optional]



## Enum: RecordTypeEnum

Name | Value
---- | -----
MESSAGING_PHONE_NUMBER | &quot;messaging_phone_number&quot;



## Enum: TypeEnum

Name | Value
---- | -----
LONG_CODE | &quot;long-code&quot;
TOLL_FREE | &quot;toll-free&quot;
SHORT_CODE | &quot;short-code&quot;
LONGCODE | &quot;longcode&quot;
TOLLFREE | &quot;tollfree&quot;
SHORTCODE | &quot;shortcode&quot;



