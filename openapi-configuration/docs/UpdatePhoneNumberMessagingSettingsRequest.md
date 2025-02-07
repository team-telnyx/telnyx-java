

# UpdatePhoneNumberMessagingSettingsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**messagingProfileId** | **String** | Configure the messaging profile this phone number is assigned to:  * Omit this field or set its value to &#x60;null&#x60; to keep the current value. * Set this field to &#x60;\&quot;\&quot;&#x60; to unassign the number from its messaging profile * Set this field to a quoted UUID of a messaging profile to assign this number to that messaging profile |  [optional] |
|**messagingProduct** | **String** | Configure the messaging product for this number:  * Omit this field or set its value to &#x60;null&#x60; to keep the current value. * Set this field to a quoted product ID to set this phone number to that product |  [optional] |



