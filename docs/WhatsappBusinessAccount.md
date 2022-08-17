

# WhatsappBusinessAccount


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recordType** | **String** |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**organizationId** | **UUID** | The owning organization&#39;s ID |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The configuration status for the account in the Telnyx platform |  [optional] |
|**whatsappSettings** | [**WhatsappBusinessAccountWhatsappSettings**](WhatsappBusinessAccountWhatsappSettings.md) |  |  [optional] |
|**createdAt** | **String** | An ISO 8601 datetime string denoting when the account was added to the Telnyx platform |  [optional] |
|**updatedAt** | **String** | An ISO 8601 datetime string for when the number order was updated. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SETUP | &quot;setup&quot; |
| READY | &quot;ready&quot; |



