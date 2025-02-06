

# AdvancedOrderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**countryCode** | **String** |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**quantity** | **Integer** |  |  [optional] |
|**areaCode** | **String** |  |  [optional] |
|**phoneNumberType** | [**List&lt;PhoneNumberTypeEnum&gt;**](#List&lt;PhoneNumberTypeEnum&gt;) |  |  [optional] |
|**features** | [**Set&lt;FeaturesEnum&gt;**](#Set&lt;FeaturesEnum&gt;) |  |  [optional] |
|**customerReference** | **String** |  |  [optional] |



## Enum: List&lt;PhoneNumberTypeEnum&gt;

| Name | Value |
|---- | -----|
| LOCAL | &quot;local&quot; |
| MOBILE | &quot;mobile&quot; |
| TOLL_FREE | &quot;toll_free&quot; |
| SHARED_COST | &quot;shared_cost&quot; |
| NATIONAL | &quot;national&quot; |
| LANDLINE | &quot;landline&quot; |



## Enum: Set&lt;FeaturesEnum&gt;

| Name | Value |
|---- | -----|
| SMS | &quot;sms&quot; |
| MMS | &quot;mms&quot; |
| VOICE | &quot;voice&quot; |
| FAX | &quot;fax&quot; |
| EMERGENCY | &quot;emergency&quot; |



