

# UpdatePhoneNumberRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Identifies the type of resource. |  [optional] [readonly] |
|**tags** | **List&lt;String&gt;** | A list of user-assigned tags to help organize phone numbers. |  [optional] |
|**externalPin** | **String** | If someone attempts to port your phone number away from Telnyx and your phone number has an external PIN set, we will attempt to verify that you provided the correct external PIN to the winning carrier. Note that not all carriers cooperate with this security mechanism. |  [optional] |
|**hdVoiceEnabled** | **Boolean** | Indicates whether HD voice is enabled for this number. |  [optional] |
|**customerReference** | **String** | A customer reference string for customer look ups. |  [optional] |
|**connectionId** | **String** | Identifies the connection associated with the phone number. |  [optional] |
|**billingGroupId** | **String** | Identifies the billing group associated with the phone number. |  [optional] |
|**numberLevelRouting** | [**NumberLevelRoutingEnum**](#NumberLevelRoutingEnum) | Deprecated field, the only value for this is &#39;disabled&#39;. All routing for numbers should be configured via connection settings. |  [optional] |



## Enum: NumberLevelRoutingEnum

| Name | Value |
|---- | -----|
| DISABLED | &quot;disabled&quot; |



