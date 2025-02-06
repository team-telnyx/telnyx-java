

# Carrier


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mobileCountryCode** | **String** | Region code that matches the specific country calling code if the requested phone number type is mobile |  [optional] |
|**mobileNetworkCode** | **String** | National destination code (NDC), with a 0 prefix, if an NDC is found and the requested phone number type is mobile |  [optional] |
|**name** | **String** | SPID (Service Provider ID) name, if the requested phone number has been ported; otherwise, the name of carrier who owns the phone number block |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | A phone number type that identifies the type of service associated with the requested phone number |  [optional] |
|**errorCode** | **String** | Unused |  [optional] |
|**normalizedCarrier** | **String** | If known to Telnyx and applicable, the primary network carrier. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FIXED_LINE | &quot;fixed line&quot; |
| MOBILE | &quot;mobile&quot; |
| VOIP | &quot;voip&quot; |
| FIXED_LINE_OR_MOBILE | &quot;fixed line or mobile&quot; |
| TOLL_FREE | &quot;toll free&quot; |
| PREMIUM_RATE | &quot;premium rate&quot; |
| SHARED_COST | &quot;shared cost&quot; |
| PERSONAL_NUMBER | &quot;personal number&quot; |
| PAGER | &quot;pager&quot; |
| UAN | &quot;uan&quot; |
| VOICEMAIL | &quot;voicemail&quot; |
| UNKNOWN | &quot;unknown&quot; |



