

# PortingOrderMisc


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **PortingOrderType** |  |  [optional] |
|**remainingNumbersAction** | [**RemainingNumbersActionEnum**](#RemainingNumbersActionEnum) | Remaining numbers can be either kept with their current service provider or disconnected. &#39;new_billing_telephone_number&#39; is required when &#39;remaining_numbers_action&#39; is &#39;keep&#39;. |  [optional] |
|**newBillingPhoneNumber** | **String** | New billing phone number for the remaining numbers. Used in case the current billing phone number is being ported to Telnyx. This will be set on your account with your current service provider and should be one of the numbers remaining on that account. |  [optional] |



## Enum: RemainingNumbersActionEnum

| Name | Value |
|---- | -----|
| KEEP | &quot;keep&quot; |
| DISCONNECT | &quot;disconnect&quot; |



