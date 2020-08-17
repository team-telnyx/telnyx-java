# RegulatoryRequirement

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | **String** | Identifies the type of the resource. |  [optional]
**requirementType** | [**RequirementTypeEnum**](#RequirementTypeEnum) |  |  [optional]
**label** | **String** |  |  [optional]
**fieldType** | [**FieldTypeEnum**](#FieldTypeEnum) |  |  [optional]
**description** | **String** |  |  [optional]

<a name="RequirementTypeEnum"></a>
## Enum: RequirementTypeEnum
Name | Value
---- | -----
END_USER_PROOF_OF_ADDRESS | &quot;end user proof of address&quot;
ENTITY_IDENTIFICATION | &quot;entity identification&quot;
END_USER_ADDRESS | &quot;end user address&quot;

<a name="FieldTypeEnum"></a>
## Enum: FieldTypeEnum
Name | Value
---- | -----
FILE_UPLOAD | &quot;file upload&quot;
TEXT_FIELD | &quot;text field&quot;
ADDRESS | &quot;address&quot;
DATETIME | &quot;datetime&quot;
