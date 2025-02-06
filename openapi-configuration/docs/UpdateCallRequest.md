

# UpdateCallRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **String** | The value to set the call status to. Setting the status to completed ends the call. |  [optional] |
|**url** | **String** | The URL where TeXML will make a request to retrieve a new set of TeXML instructions to continue the call flow. |  [optional] |
|**method** | [**MethodEnum**](#MethodEnum) | HTTP request type used for &#x60;Url&#x60;. |  [optional] |
|**fallbackUrl** | **String** | A failover URL for which Telnyx will retrieve the TeXML call instructions if the Url is not responding. |  [optional] |
|**fallbackMethod** | [**FallbackMethodEnum**](#FallbackMethodEnum) | HTTP request type used for &#x60;FallbackUrl&#x60;. |  [optional] |
|**statusCallback** | **String** | URL destination for Telnyx to send status callback events to for the call. |  [optional] |
|**statusCallbackMethod** | [**StatusCallbackMethodEnum**](#StatusCallbackMethodEnum) | HTTP request type used for &#x60;StatusCallback&#x60;. |  [optional] |
|**texml** | **String** | TeXML to replace the current one with. |  [optional] |



## Enum: MethodEnum

| Name | Value |
|---- | -----|
| GET | &quot;GET&quot; |
| POST | &quot;POST&quot; |



## Enum: FallbackMethodEnum

| Name | Value |
|---- | -----|
| GET | &quot;GET&quot; |
| POST | &quot;POST&quot; |



## Enum: StatusCallbackMethodEnum

| Name | Value |
|---- | -----|
| GET | &quot;GET&quot; |
| POST | &quot;POST&quot; |



