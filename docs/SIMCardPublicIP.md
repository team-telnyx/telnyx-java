

# SIMCardPublicIP


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | **String** |  |  [optional] [readonly]
**simCardId** | **UUID** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] [readonly]
**ip** | **String** | The provisioned IP address. This attribute will only be available when underlying resource status is in a \&quot;provisioned\&quot; status. |  [optional] [readonly]
**createdAt** | **String** | ISO 8601 formatted date-time indicating when the resource was created. |  [optional] [readonly]
**updatedAt** | **String** | ISO 8601 formatted date-time indicating when the resource was updated. |  [optional] [readonly]



## Enum: TypeEnum

Name | Value
---- | -----
IPV4 | &quot;ipv4&quot;



