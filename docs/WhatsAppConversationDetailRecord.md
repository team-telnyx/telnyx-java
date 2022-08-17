

# WhatsAppConversationDetailRecord


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recipientRegionCode** | **String** | CLDR two-letter region-code of recipient |  [optional] |
|**currency** | **String** | Telnyx account currency used to describe monetary values, including billing cost |  [optional] |
|**createdAt** | **OffsetDateTime** | UTC time when the message was created |  [optional] |
|**whatsappFee** | **String** | Currency amount for WhatsApp cost |  [optional] |
|**conversationId** | **String** | Whatsapp Conversation ID |  [optional] |
|**conversationOrigin** | [**ConversationOriginEnum**](#ConversationOriginEnum) | Whatsapp Conversation Origin |  [optional] |
|**whatsappBusinessAccountId** | **String** | Whatsapp Business Account ID |  [optional] |
|**recordType** | **String** |  |  |



## Enum: ConversationOriginEnum

| Name | Value |
|---- | -----|
| BUSINESS_INITIATED | &quot;business_initiated&quot; |
| USER_INITIATED | &quot;user_initiated&quot; |
| REFERRAL_CONVERSION | &quot;referral_conversion&quot; |



