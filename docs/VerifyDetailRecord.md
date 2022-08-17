

# VerifyDetailRecord


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique ID of the verification |  [optional] |
|**verifyProfileId** | **UUID** |  |  [optional] |
|**deliveryStatus** | **String** |  |  [optional] |
|**verificationStatus** | **String** |  |  [optional] |
|**destinationPhoneNumber** | **String** | E.164 formatted phone number |  [optional] |
|**verifyChannelType** | [**VerifyChannelTypeEnum**](#VerifyChannelTypeEnum) | Depending on the type of verification, the &#x60;verify_channel_id&#x60; points to one of the following channel ids; --- verify_channel_type | verify_channel_id ------------------- | ----------------- sms, psd2           | messaging_id call, flashcall     | call_control_id whatsapp            | messaging_whatsapp_id ---  |  [optional] |
|**verifyChannelId** | **UUID** |  |  [optional] |
|**createdAt** | **String** |  |  [optional] |
|**updatedAt** | **String** |  |  [optional] |
|**rate** | **String** | Currency amount per billing unit used to calculate the Telnyx billing costs |  [optional] |
|**rateMeasuredIn** | **String** | Billing unit used to calculate the Telnyx billing costs |  [optional] |
|**verifyUsageFee** | **String** | Currency amount for Verify Usage Fee |  [optional] |
|**currency** | **String** | Telnyx account currency used to describe monetary values, including billing costs |  [optional] |
|**recordType** | **String** |  |  |



## Enum: VerifyChannelTypeEnum

| Name | Value |
|---- | -----|
| SMS | &quot;sms&quot; |
| PSD2 | &quot;psd2&quot; |
| CALL | &quot;call&quot; |
| FLASHCALL | &quot;flashcall&quot; |
| WHATSAPP | &quot;whatsapp&quot; |



