

# PortoutDetails


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**recordType** | **String** | Identifies the type of the resource. |  [optional] [readonly]
**phoneNumbers** | **List&lt;String&gt;** | Phone numbers associated with this portout |  [optional]
**carrierName** | **String** | Carrier the number will be ported out to |  [optional]
**focDate** | **String** | ISO 8601 formatted Date/Time of the FOC date |  [optional]
**requestedFocDate** | **String** | ISO 8601 formatted Date/Time of the user requested FOC date |  [optional]
**spid** | **String** | New service provider spid |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of portout request |  [optional]
**createdAt** | **String** | ISO 8601 formatted date of when the portout was created |  [optional]
**updatedAt** | **String** | ISO 8601 formatted date of when the portout was last updated |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
PENDING | &quot;pending&quot;
AUTHORIZED | &quot;authorized&quot;
PORTED | &quot;ported&quot;
REJECTED | &quot;rejected&quot;
REJECTED_PENDING | &quot;rejected-pending&quot;
CANCELED | &quot;canceled&quot;



