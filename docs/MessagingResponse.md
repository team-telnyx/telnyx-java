# MessagingResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messagingProfileId** | [**UUID**](UUID.md) | Unique identifier for a messaging profile. |  [optional]
**messagingProfileName** | **String** | Messaging profile name. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of the phone number. |  [optional]
**countryCode** | **String** | ISO 3166-1 alpha-2 country code. |  [optional]
**trafficType** | **String** | The messaging traffic or use case for which the number is currently configured. |  [optional]
**messagingProduct** | **String** | The messaging product that the number is registered to use. |  [optional]
**features** | [**MessagingPhoneNumberFeatures**](MessagingPhoneNumberFeatures.md) |  |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
LONG_CODE | &quot;long-code&quot;
TOLL_FREE | &quot;toll-free&quot;
SHORT_CODE | &quot;short-code&quot;
