

# ESimPurchase


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**simCardGroupId** | **UUID** | The group SIMCardGroup identification. This attribute can be &lt;code&gt;null&lt;/code&gt; when it&#39;s present in an associated resource. |  [optional] |
|**tags** | **List&lt;String&gt;** | Searchable tags associated with the SIM cards |  [optional] |
|**product** | **String** | Type of product to be purchased, specify \&quot;whitelabel\&quot; to use a custom SPN |  [optional] |
|**whitelabelName** | **String** | Service Provider Name (SPN) for the Whitelabel eSIM product. It will be displayed as the mobile service name by operating systems of smartphones. This parameter must only contain letters, numbers and whitespaces. |  [optional] |
|**amount** | **Integer** | The amount of eSIMs to be purchased. |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status on which the SIM cards will be set after being successfully registered. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ENABLED | &quot;enabled&quot; |
| DISABLED | &quot;disabled&quot; |
| STANDBY | &quot;standby&quot; |



