

# SubNumberOrderRegulatoryRequirementWithValue


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recordType** | **String** |  |  [optional] [readonly] |
|**requirementId** | **UUID** | Unique id for a requirement. |  [optional] |
|**fieldType** | [**FieldTypeEnum**](#FieldTypeEnum) |  |  [optional] [readonly] |
|**fieldValue** | **String** | The value of the requirement, this could be an id to a resource or a string value. |  [optional] |



## Enum: FieldTypeEnum

| Name | Value |
|---- | -----|
| TEXTUAL | &quot;textual&quot; |
| DATETIME | &quot;datetime&quot; |
| ADDRESS | &quot;address&quot; |
| DOCUMENT | &quot;document&quot; |



