# ReservedPhoneNumber

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  |  [optional]
**recordType** | **String** |  |  [optional]
**phoneNumber** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the phone number&#x27;s reservation. |  [optional]
**createdAt** | **String** | An ISO 8901 datetime string denoting when the individual number reservation was created. |  [optional]
**updatedAt** | **String** | An ISO 8901 datetime string for when the the individual number reservation was updated. |  [optional]
**expiredAt** | **String** | An ISO 8901 datetime string for when the individual number reservation is going to expire |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;pending&quot;
SUCCESS | &quot;success&quot;
FAILURE | &quot;failure&quot;
