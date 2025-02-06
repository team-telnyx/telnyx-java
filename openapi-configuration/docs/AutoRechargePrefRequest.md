

# AutoRechargePrefRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**thresholdAmount** | **BigDecimal** | The threshold amount at which the account will be recharged. |  [optional] |
|**rechargeAmount** | **BigDecimal** | The amount to recharge the account, the actual recharge amount will be the amount necessary to reach the threshold amount plus the recharge amount. |  [optional] |
|**enabled** | **Boolean** | Whether auto recharge is enabled. |  [optional] |
|**invoiceEnabled** | **Boolean** |  |  [optional] |
|**preference** | [**PreferenceEnum**](#PreferenceEnum) | The payment preference for auto recharge. |  [optional] |



## Enum: PreferenceEnum

| Name | Value |
|---- | -----|
| CREDIT_PAYPAL | &quot;credit_paypal&quot; |
| ACH | &quot;ach&quot; |



