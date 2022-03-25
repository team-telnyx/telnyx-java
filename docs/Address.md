

# Address


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Uniquely identifies the address. |  [optional]
**recordType** | **String** | Identifies the type of the resource. |  [optional]
**customerReference** | **String** | A customer reference string for customer look ups. |  [optional]
**firstName** | **String** | The first name associated with the address. An address must have either a first last name or a business name. |  [optional]
**lastName** | **String** | The last name associated with the address. An address must have either a first last name or a business name. |  [optional]
**businessName** | **String** | The business name associated with the address. An address must have either a first last name or a business name. |  [optional]
**phoneNumber** | **String** | The phone number associated with the address. |  [optional]
**streetAddress** | **String** | The primary street address information about the address. |  [optional]
**extendedAddress** | **String** | Additional street address information about the address such as, but not limited to, unit number or apartment number. |  [optional]
**locality** | **String** | The locality of the address. For US addresses, this corresponds to the city of the address. |  [optional]
**administrativeArea** | **String** | The locality of the address. For US addresses, this corresponds to the state of the address. |  [optional]
**neighborhood** | **String** | The neighborhood of the address. This field is not used for addresses in the US but is used for some international addresses. |  [optional]
**borough** | **String** | The borough of the address. This field is not used for addresses in the US but is used for some international addresses. |  [optional]
**postalCode** | **String** | The postal code of the address. |  [optional]
**countryCode** | **String** | The two-character (ISO 3166-1 alpha-2) country code of the address. |  [optional]
**addressBook** | **Boolean** | Indicates whether or not the address should be considered part of your list of addresses that appear for regular use. |  [optional]
**validateAddress** | **Boolean** | Indicates whether or not the address should be validated for emergency use upon creation or not. This should be left with the default value of &#x60;true&#x60; unless you have used the &#x60;/addresses/actions/validate&#x60; endpoint to validate the address separately prior to creation. If an address is not validated for emergency use upon creation and it is not valid, it will not be able to be used for emergency services. |  [optional]
**createdAt** | **String** | ISO 8601 formatted date indicating when the resource was created. |  [optional]
**updatedAt** | **String** | ISO 8601 formatted date indicating when the resource was updated. |  [optional]



