

# UserAddressCreate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerReference** | **String** | A customer reference string for customer look ups. |  [optional] |
|**firstName** | **String** | The first name associated with the address. An address must have either a first last name or a business name. |  |
|**lastName** | **String** | The last name associated with the address. An address must have either a first last name or a business name. |  |
|**businessName** | **String** | The business name associated with the address. An address must have either a first last name or a business name. |  |
|**phoneNumber** | **String** | The phone number associated with the address. |  [optional] |
|**streetAddress** | **String** | The primary street address information about the address. |  |
|**extendedAddress** | **String** | Additional street address information about the address such as, but not limited to, unit number or apartment number. |  [optional] |
|**locality** | **String** | The locality of the address. For US addresses, this corresponds to the city of the address. |  |
|**administrativeArea** | **String** | The locality of the address. For US addresses, this corresponds to the state of the address. |  [optional] |
|**neighborhood** | **String** | The neighborhood of the address. This field is not used for addresses in the US but is used for some international addresses. |  [optional] |
|**borough** | **String** | The borough of the address. This field is not used for addresses in the US but is used for some international addresses. |  [optional] |
|**postalCode** | **String** | The postal code of the address. |  [optional] |
|**countryCode** | **String** | The two-character (ISO 3166-1 alpha-2) country code of the address. |  |
|**skipAddressVerification** | **String** | An optional boolean value specifying if verification of the address should be skipped or not. UserAddresses are generally used for shipping addresses, and failure to validate your shipping address will likely result in a failure to deliver SIM cards or other items ordered from Telnyx. Do not use this parameter unless you are sure that the address is correct even though it cannot be validated. If this is set to any value other than true, verification of the address will be attempted, and the user address will not be allowed if verification fails. If verification fails but suggested values are available that might make the address correct, they will be present in the response as well. If this value is set to true, then the verification will not be attempted. Defaults to false (verification will be performed). |  [optional] |



