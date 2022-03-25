

# SIMCardGroupAction

This object represents a SIM card group action request. It allows tracking the current status of an operation that impacts the SIM card group and SIM card in it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Identifies the resource. |  [optional] [readonly]
**recordType** | **String** |  |  [optional] [readonly]
**simCardGroupId** | **UUID** | The SIM card group identification. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Represents the type of the operation requested. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**settings** | [**SIMCardGroupActionSettings**](SIMCardGroupActionSettings.md) |  |  [optional]
**createdAt** | **String** | ISO 8601 formatted date-time indicating when the resource was created. |  [optional] [readonly]
**updatedAt** | **String** | ISO 8601 formatted date-time indicating when the resource was updated. |  [optional] [readonly]



## Enum: TypeEnum

Name | Value
---- | -----
SET_PRIVATE_WIRELESS_GATEWAY | &quot;set_private_wireless_gateway&quot;
REMOVE_PRIVATE_WIRELESS_GATEWAY | &quot;remove_private_wireless_gateway&quot;



## Enum: StatusEnum

Name | Value
---- | -----
IN_PROGRESS | &quot;in-progress&quot;
COMPLETED | &quot;completed&quot;
FAILED | &quot;failed&quot;



