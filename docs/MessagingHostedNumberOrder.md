# MessagingHostedNumberOrder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | **String** | Identifies the type of the resource. |  [optional]
**id** | [**UUID**](UUID.md) | Resource unique identifier. |  [optional]
**messagingProfileId** | **String** | Automatically associate the number with this messaging profile ID when the order is complete. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**phoneNumbers** | [**List&lt;HostedNumber&gt;**](HostedNumber.md) |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
FAILED | &quot;failed&quot;
PENDING | &quot;pending&quot;
SUCCESSFUL | &quot;successful&quot;
