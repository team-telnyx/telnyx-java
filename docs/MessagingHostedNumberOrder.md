

# MessagingHostedNumberOrder


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | **String** | Identifies the type of the resource. |  [optional] [readonly]
**id** | **UUID** | Resource unique identifier. |  [optional] [readonly]
**messagingProfileId** | **String** | Automatically associate the number with this messaging profile ID when the order is complete. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**phoneNumbers** | [**List&lt;HostedNumber&gt;**](HostedNumber.md) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
FAILED | &quot;failed&quot;
PENDING | &quot;pending&quot;
SUCCESSFUL | &quot;successful&quot;



