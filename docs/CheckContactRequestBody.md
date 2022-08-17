

# CheckContactRequestBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**whatsappUserId** | **String** | The sender&#39;s WhatsApp ID. |  |
|**blocking** | [**BlockingEnum**](#BlockingEnum) | Blocking determines whether the request should wait for the processing to complete (synchronous) or not (asynchronous). |  [optional] |
|**contacts** | **List&lt;String&gt;** | Array of contact phone numbers. The numbers can be in any standard telephone number format. |  |



## Enum: BlockingEnum

| Name | Value |
|---- | -----|
| NO_WAIT | &quot;no_wait&quot; |
| WAIT | &quot;wait&quot; |



