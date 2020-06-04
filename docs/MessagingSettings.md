# MessagingSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) | Identifies the type of the resource. |  [optional]
**id** | **String** | Identifies the type of resource. |  [optional]
**phoneNumber** | **String** | +E.164 formatted phone number. |  [optional]
**messagingProfileId** | [**UUID**](UUID.md) | Unique identifier for a messaging profile. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | ISO 8601 formatted date indicating when the resource was created. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | ISO 8601 formatted date indicating when the resource was updated. |  [optional]
**countryCode** | **String** | ISO 3166-1 alpha-2 country code. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of the phone number |  [optional]
**health** | [**NumberHealthMetrics**](NumberHealthMetrics.md) |  |  [optional]
**eligibleMessagingProducts** | **List&lt;String&gt;** | The messaging products that this number can be registered to use |  [optional]
**trafficType** | **String** | The messaging traffic or use case for which the number is currently configured. |  [optional]
**messagingProduct** | **String** | The messaging product that the number is registered to use |  [optional]
**features** | [**MessagingPhoneNumberFeatures**](MessagingPhoneNumberFeatures.md) |  |  [optional]

<a name="RecordTypeEnum"></a>
## Enum: RecordTypeEnum
Name | Value
---- | -----
NUMBER | &quot;messaging_phone_number&quot;

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
LONG_CODE | &quot;long-code&quot;
TOLL_FREE | &quot;toll-free&quot;
SHORT_CODE | &quot;short-code&quot;
