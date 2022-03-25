

# CustomerServiceRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Uniquely identifies this customer service request |  [optional] [readonly]
**phoneNumber** | **String** | The phone number of the customer service request. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the customer service request |  [optional]
**carrierName** | **String** | The name of the carrier that the customer service request is for. |  [optional]
**name** | **String** | The name of the customer service request. |  [optional]
**address** | [**CustomerServiceRequestAddress**](CustomerServiceRequestAddress.md) |  |  [optional]
**recordType** | **String** | Identifies the type of the resource. |  [optional] [readonly]
**createdAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was created. |  [optional] [readonly]
**updatedAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was created. |  [optional] [readonly]



## Enum: StatusEnum

Name | Value
---- | -----
PENDING | &quot;pending&quot;
COMPLETED | &quot;completed&quot;
FAILED | &quot;failed&quot;



