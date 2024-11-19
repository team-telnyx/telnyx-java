

# PortingPhoneNumberBlock


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Uniquely identifies this porting phone number block. |  [optional] [readonly] |
|**countryCode** | **String** | Specifies the country code for this porting phone number block. It is a two-letter ISO 3166-1 alpha-2 country code. |  [optional] |
|**phoneNumberType** | [**PhoneNumberTypeEnum**](#PhoneNumberTypeEnum) | Specifies the phone number type for this porting phone number block. |  [optional] |
|**phoneNumberRange** | [**PortingPhoneNumberBlockPhoneNumberRange**](PortingPhoneNumberBlockPhoneNumberRange.md) |  |  [optional] |
|**activationRanges** | [**List&lt;PortingPhoneNumberBlockActivationRangesInner&gt;**](PortingPhoneNumberBlockActivationRangesInner.md) | Specifies the activation ranges for this porting phone number block. The activation range must be within the phone number range and should not overlap with other activation ranges. |  [optional] |
|**recordType** | **String** | Identifies the type of the resource. |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was created. |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was last updated. |  [optional] [readonly] |



## Enum: PhoneNumberTypeEnum

| Name | Value |
|---- | -----|
| LANDLINE | &quot;landline&quot; |
| LOCAL | &quot;local&quot; |
| MOBILE | &quot;mobile&quot; |
| NATIONAL | &quot;national&quot; |
| SHARED_COST | &quot;shared_cost&quot; |
| TOLL_FREE | &quot;toll_free&quot; |



