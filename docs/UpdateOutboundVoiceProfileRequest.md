

# UpdateOutboundVoiceProfileRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | A user-supplied name to help with organization. |  [optional]
**trafficType** | [**TrafficType**](TrafficType.md) |  |  [optional]
**servicePlan** | [**ServicePlan**](ServicePlan.md) |  |  [optional]
**concurrentCallLimit** | **Integer** | Must be no more than your global concurrent call limit. Null means no limit. |  [optional]
**enabled** | **Boolean** | Specifies whether the outbound voice profile can be used. Disabled profiles will result in outbound calls being blocked for the associated Connections. |  [optional]
**tags** | **List&lt;String&gt;** |  |  [optional]
**usagePaymentMethod** | [**UsagePaymentMethod**](UsagePaymentMethod.md) |  |  [optional]
**whitelistedDestinations** | **List&lt;String&gt;** | The list of destinations you want to be able to call using this outbound voice profile formatted in alpha2. |  [optional]
**maxDestinationRate** | [**BigDecimal**](BigDecimal.md) | Maximum rate (price per minute) for a Destination to be allowed when making outbound calls. |  [optional]
**dailySpendLimit** | **String** | The maximum amount of usage charges, in USD, you want Telnyx to allow on this outbound voice profile in a day before disallowing new calls. |  [optional]
**dailySpendLimitEnabled** | **Boolean** | Specifies whether to enforce the daily_spend_limit on this outbound voice profile. |  [optional]
**callRecording** | [**OutboundCallRecording**](OutboundCallRecording.md) |  |  [optional]
**billingGroupId** | [**UUID**](UUID.md) | The ID of the billing group associated with the outbound proflile. Defaults to null (for no group assigned). |  [optional]



