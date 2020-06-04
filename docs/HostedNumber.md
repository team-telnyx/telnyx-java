# HostedNumber

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | **String** |  |  [optional]
**id** | [**UUID**](UUID.md) | Identifies the type of resource. |  [optional]
**phoneNumber** | **String** | The messaging hosted phone number (+E.164 format) |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
DELETED | &quot;deleted&quot;
FAILED | &quot;failed&quot;
PENDING | &quot;pending&quot;
SUCCESSFUL | &quot;successful&quot;
