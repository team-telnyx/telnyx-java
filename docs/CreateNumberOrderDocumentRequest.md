# CreateNumberOrderDocumentRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  |  [optional]
**recordType** | **String** |  |  [optional]
**fileId** | **String** | The id of the file to associate as a number order document. |  [optional]
**requirementsId** | **String** | Unique id for a requirement. |  [optional]
**customerReference** | **String** | A customer reference string for customer look ups. |  [optional]
**requirementType** | [**RequirementTypeEnum**](#RequirementTypeEnum) |  |  [optional]
**createdAt** | **String** | An ISO 8901 datetime string denoting when the number order document was uploaded. |  [optional]

<a name="RequirementTypeEnum"></a>
## Enum: RequirementTypeEnum
Name | Value
---- | -----
ADDRESS_PROOF | &quot;address_proof&quot;
IDENTIFICATION | &quot;identification&quot;
REG_FORM | &quot;reg_form&quot;
