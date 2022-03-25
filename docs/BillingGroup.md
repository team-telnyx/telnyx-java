

# BillingGroup


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) | Identifies the type of the resource. |  [optional]
**id** | **UUID** | Identifies the type of resource. |  [optional]
**organizationId** | **UUID** | Identifies the organization that owns the resource. |  [optional]
**name** | **String** | A user-specified name for the billing group |  [optional]
**createdAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was created. |  [optional]
**updatedAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was updated. |  [optional]
**deletedAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was removed. |  [optional]



## Enum: RecordTypeEnum

Name | Value
---- | -----
BILLING_GROUP | &quot;billing_group&quot;



