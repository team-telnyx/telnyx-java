

# PortoutDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**recordType** | **String** | Identifies the type of the resource. |  [optional] [readonly] |
|**phoneNumbers** | **List&lt;String&gt;** | Phone numbers associated with this portout |  [optional] |
|**authorizedName** | **String** | Name of person authorizing the porting order |  [optional] |
|**carrierName** | **String** | Carrier the number will be ported out to |  [optional] |
|**currentCarrier** | **String** | The current carrier |  [optional] |
|**endUserName** | **String** | Person name or company name requesting the port |  [optional] |
|**city** | **String** | City or municipality of billing address |  [optional] |
|**state** | **String** | State, province, or similar of billing address |  [optional] |
|**zip** | **String** | Postal Code of billing address |  [optional] |
|**lsr** | **List&lt;URI&gt;** | The Local Service Request |  [optional] |
|**pon** | **String** | Port order number assigned by the carrier the number will be ported out to |  [optional] |
|**reason** | **String** | The reason why the order is being rejected by the user. If the order is authorized, this field can be left null |  [optional] |
|**rejectionCode** | **Integer** | The rejection code for one of the valid rejections to reject a port out order |  [optional] |
|**serviceAddress** | **String** | First line of billing address (street address) |  [optional] |
|**focDate** | **String** | ISO 8601 formatted Date/Time of the FOC date |  [optional] |
|**requestedFocDate** | **String** | ISO 8601 formatted Date/Time of the user requested FOC date |  [optional] |
|**spid** | **String** | New service provider spid |  [optional] |
|**supportKey** | **String** | A key to reference this port out request when contacting Telnyx customer support |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of portout request |  [optional] |
|**alreadyPorted** | **Boolean** | Is true when the number is already ported |  [optional] |
|**userId** | **UUID** | Identifies the user (or organization) who requested the port out |  [optional] |
|**vendor** | **UUID** | Telnyx partner providing network coverage |  [optional] |
|**createdAt** | **String** | ISO 8601 formatted date of when the portout was created |  [optional] |
|**insertedAt** | **String** | ISO 8601 formatted date of when the portout was created |  [optional] |
|**updatedAt** | **String** | ISO 8601 formatted date of when the portout was last updated |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| AUTHORIZED | &quot;authorized&quot; |
| PORTED | &quot;ported&quot; |
| REJECTED | &quot;rejected&quot; |
| REJECTED_PENDING | &quot;rejected-pending&quot; |
| CANCELED | &quot;canceled&quot; |



