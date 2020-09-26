# CreateNumberReservationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  |  [optional]
**recordType** | **String** |  |  [optional]
**phoneNumbers** | [**List&lt;ReservedPhoneNumber&gt;**](ReservedPhoneNumber.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the entire reservation. |  [optional]
**customerReference** | **String** | A customer reference string for customer look ups. |  [optional]
**createdAt** | **String** | An ISO 8901 datetime string denoting when the numbers reservation was created. |  [optional]
**updatedAt** | **String** | An ISO 8901 datetime string for when the number reservation was updated. |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;pending&quot;
SUCCESS | &quot;success&quot;
FAILURE | &quot;failure&quot;
