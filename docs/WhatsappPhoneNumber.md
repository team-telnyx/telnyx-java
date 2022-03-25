

# WhatsappPhoneNumber


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | **String** |  |  [optional]
**id** | **UUID** |  |  [optional]
**organizationId** | **UUID** | The owning organization&#39;s ID |  [optional]
**whatsappBusinessAccountId** | **UUID** | The associated WhatsApp Business Account ID |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The configuration status for the phone number in the Telnyx platform |  [optional]
**webhookUrl** | **String** | The webhook url to be used by facebook |  [optional]
**about** | **String** | The WhatsApp about section content |  [optional]
**phoneNumber** | **String** | The phone number in E164 format |  [optional]
**whatsappUserId** | **String** | The phone number&#39;s WhatsApp User ID, used in other Telnyx Whatsapp API endpoints |  [optional]
**whatsappSettings** | [**Object**](Object.md) | The WhatsApp settings associated with the business account |  [optional]
**createdAt** | **String** | An ISO 8601 datetime string denoting when the account was added to the Telnyx platform |  [optional]
**updatedAt** | **String** | An ISO 8601 datetime string for when the number order was updated. |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
PENDING | &quot;pending&quot;
READY | &quot;ready&quot;



