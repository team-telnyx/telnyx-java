

# DocReqsRequirementType


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acceptanceCriteria** | [**DocReqsRequirementTypeAcceptanceCriteria**](DocReqsRequirementTypeAcceptanceCriteria.md) |  |  [optional]
**description** | **String** | Describes the requirement type |  [optional]
**example** | **String** | Provides one or more examples of acceptable documents |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Defines the type of this requirement type |  [optional]
**name** | **String** | A short descriptive name for this requirement_type |  [optional] [readonly]
**recordType** | **String** | Identifies the type of the resource |  [optional] [readonly]
**id** | **UUID** | Identifies the associated document |  [optional] [readonly]
**createdAt** | **String** | ISO 8601 formatted date-time indicating when the resource was created. |  [optional] [readonly]
**updatedAt** | **String** | ISO 8601 formatted date-time indicating when the resource was last updated. |  [optional] [readonly]



## Enum: TypeEnum

Name | Value
---- | -----
DOCUMENT | &quot;document&quot;
ADDRESS | &quot;address&quot;
TEXTUAL | &quot;textual&quot;



