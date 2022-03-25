

# HostedNumber


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | **String** |  |  [optional]
**id** | **UUID** | Identifies the type of resource. |  [optional] [readonly]
**phoneNumber** | **String** | The messaging hosted phone number (+E.164 format) |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
DELETED | &quot;deleted&quot;
FAILED | &quot;failed&quot;
PENDING | &quot;pending&quot;
SUCCESSFUL | &quot;successful&quot;



