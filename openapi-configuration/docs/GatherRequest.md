

# GatherRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**minimumDigits** | **Integer** | The minimum number of digits to fetch. This parameter has a minimum value of 1. |  [optional] |
|**maximumDigits** | **Integer** | The maximum number of digits to fetch. This parameter has a maximum value of 128. |  [optional] |
|**timeoutMillis** | **Integer** | The number of milliseconds to wait to complete the request. |  [optional] |
|**interDigitTimeoutMillis** | **Integer** | The number of milliseconds to wait for input between digits. |  [optional] |
|**initialTimeoutMillis** | **Integer** | The number of milliseconds to wait for the first DTMF. |  [optional] |
|**terminatingDigit** | **String** | The digit used to terminate input if fewer than &#x60;maximum_digits&#x60; digits have been gathered. |  [optional] |
|**validDigits** | **String** | A list of all digits accepted as valid. |  [optional] |
|**gatherId** | **String** | An id that will be sent back in the corresponding &#x60;call.gather.ended&#x60; webhook. Will be randomly generated if not specified. |  [optional] |
|**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional] |
|**commandId** | **String** | Use this field to avoid duplicate commands. Telnyx will ignore any command with the same &#x60;command_id&#x60; for the same &#x60;call_control_id&#x60;. |  [optional] |



