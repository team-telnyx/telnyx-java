

# ReservedPhoneNumber

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  |  [optional] [readonly]
**recordType** | **String** |  |  [optional] [readonly]
**phoneNumber** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the phone number&#39;s reservation. |  [optional] [readonly]
**createdAt** | **String** | An ISO 8901 datetime string denoting when the individual number reservation was created. |  [optional] [readonly]
**updatedAt** | **String** | An ISO 8901 datetime string for when the the individual number reservation was updated. |  [optional] [readonly]
**expiredAt** | **String** | An ISO 8901 datetime string for when the individual number reservation is going to expire |  [optional] [readonly]
**errors** | **String** | Errors the reservation could happen upon |  [optional] [readonly]



## Enum: StatusEnum

Name | Value
---- | -----
PENDING | &quot;pending&quot;
SUCCESS | &quot;success&quot;
FAILURE | &quot;failure&quot;



