

# PhoneNumberWithVoiceSettings

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifies the type of resource. |  [optional] [readonly]
**recordType** | **String** | Identifies the type of the resource. |  [optional] [readonly]
**phoneNumber** | **String** | The phone number in +E164 format. |  [optional] [readonly]
**connectionId** | **String** | Identifies the connection associated with this phone number. |  [optional]
**customerReference** | **String** | A customer reference string for customer look ups. |  [optional]
**techPrefixEnabled** | **Boolean** | Controls whether a tech prefix is enabled for this phone number. |  [optional]
**translatedNumber** | **String** | This field allows you to rewrite the destination number of an inbound call before the call is routed to you. The value of this field may be any alphanumeric value, and the value will replace the number originally dialed. |  [optional]
**callForwarding** | [**CallForwarding**](CallForwarding.md) |  |  [optional]
**cnamListing** | [**CnamListing**](CnamListing.md) |  |  [optional]
**emergency** | [**EmergencySettings**](EmergencySettings.md) |  |  [optional]
**usagePaymentMethod** | [**UsagePaymentMethodEnum**](#UsagePaymentMethodEnum) | Controls whether a number is billed per minute or uses your concurrent channels. |  [optional]
**mediaFeatures** | [**MediaFeatures**](MediaFeatures.md) |  |  [optional]
**callRecording** | [**CallRecording**](CallRecording.md) |  |  [optional]



## Enum: UsagePaymentMethodEnum

Name | Value
---- | -----
PAY_PER_MINUTE | &quot;pay-per-minute&quot;
CHANNEL | &quot;channel&quot;



