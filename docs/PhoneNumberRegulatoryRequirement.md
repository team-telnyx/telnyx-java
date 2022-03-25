

# PhoneNumberRegulatoryRequirement

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | **String** |  |  [optional] [readonly]
**requirementId** | [**UUID**](UUID.md) | Unique id for a requirement. |  [optional]
**fieldValue** | **String** | The value of the requirement, this could be an id to a resource or a string value. |  [optional]
**fieldType** | [**FieldTypeEnum**](#FieldTypeEnum) |  |  [optional] [readonly]



## Enum: FieldTypeEnum

Name | Value
---- | -----
STRING | &quot;string&quot;
DATETIME | &quot;datetime&quot;
ADDRESS_ID | &quot;address_id&quot;
NUMBER_ORDER_DOCUMENT_ID | &quot;number_order_document_id&quot;



