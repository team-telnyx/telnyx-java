

# ESimPurchase


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**simCardGroupId** | **UUID** | The group SIMCardGroup identification. This attribute can be &lt;code&gt;null&lt;/code&gt; when it&#39;s present in an associated resource. |  [optional] |
|**tags** | **List&lt;String&gt;** | Searchable tags associated with the SIM cards |  [optional] |
|**amount** | **Integer** | The amount of eSIMs to be purchased. |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status on which the SIM cards will be set after being successfully registered. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ENABLED | &quot;enabled&quot; |
| DISABLED | &quot;disabled&quot; |
| STANDBY | &quot;standby&quot; |



