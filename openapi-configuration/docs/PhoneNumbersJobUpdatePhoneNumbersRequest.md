

# PhoneNumbersJobUpdatePhoneNumbersRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**phoneNumbers** | **List&lt;String&gt;** | Array of phone number ids and/or phone numbers in E164 format to update |  |
|**tags** | **List&lt;String&gt;** | A list of user-assigned tags to help organize phone numbers. |  [optional] |
|**externalPin** | **String** | If someone attempts to port your phone number away from Telnyx and your phone number has an external PIN set, we will attempt to verify that you provided the correct external PIN to the winning carrier. Note that not all carriers cooperate with this security mechanism. |  [optional] |
|**customerReference** | **String** | A customer reference string for customer look ups. |  [optional] |
|**connectionId** | **String** | Identifies the connection associated with the phone number. |  [optional] |
|**billingGroupId** | **String** | Identifies the billing group associated with the phone number. |  [optional] |
|**hdVoiceEnabled** | **Boolean** | Indicates whether to enable or disable HD Voice on each phone number. HD Voice is a paid feature and may not be available for all phone numbers, more details about it can be found in the Telnyx support documentation. |  [optional] |
|**voice** | [**UpdatePhoneNumberVoiceSettingsRequest**](UpdatePhoneNumberVoiceSettingsRequest.md) |  |  [optional] |



