

# ChatCompletionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**messages** | [**List&lt;ChatCompletionSystemMessageParam&gt;**](ChatCompletionSystemMessageParam.md) | A list of the previous chat messages for context. |  |
|**model** | **String** | The language model to chat with. If you are optimizing for speed, try [mistralai/Mistral-7B-Instruct-v0.1](https://huggingface.co/mistralai/Mistral-7B-Instruct-v0.1). For quality, try [NousResearch/Nous-Hermes-2-Mixtral-8x7B-DPO](https://huggingface.co/NousResearch/Nous-Hermes-2-Mixtral-8x7B-DPO) |  [optional] |
|**stream** | **Boolean** | Whether or not to stream data-only server-sent events as they become available. |  [optional] |
|**maxTokens** | **Integer** | Maximum number of completion tokens the model should generate. |  [optional] |
|**temperature** | **BigDecimal** | Adjusts the \&quot;creativity\&quot; of the model. Lower values make the model more deterministic and repetitive, while higher values make the model more random and creative. |  [optional] |
|**minP** | **BigDecimal** | This is an alternative to &#x60;temperature&#x60; that [many prefer](https://github.com/huggingface/transformers/issues/27670). Must be in [0, 1]. |  [optional] |
|**n** | **BigDecimal** | This will return multiple choices for you instead of a single chat completion. |  [optional] |
|**tools** | [**List&lt;ChatCompletionRequestToolsInner&gt;**](ChatCompletionRequestToolsInner.md) | The &#x60;retrieval&#x60; tool type is unique to Telnyx. You may pass a list of [embedded storage buckets](https://developers.telnyx.com/api/inference/inference-embedding/post-embedding) for retrieval-augmented generation. |  [optional] |
|**toolChoice** | [**ToolChoiceEnum**](#ToolChoiceEnum) |  |  [optional] |
|**useBeamSearch** | **Boolean** | Setting this to &#x60;true&#x60; will allow the model to [explore more completion options](https://huggingface.co/blog/how-to-generate#beam-search). This is not supported by OpenAI. |  [optional] |
|**bestOf** | **Integer** | This is used with &#x60;use_beam_search&#x60; to determine how many candidate beams to explore. |  [optional] |
|**lengthPenalty** | **BigDecimal** | This is used with &#x60;use_beam_search&#x60; to prefer shorter or longer completions. |  [optional] |
|**earlyStopping** | **Boolean** | This is used with &#x60;use_beam_search&#x60;. If &#x60;true&#x60;, generation stops as soon as there are &#x60;best_of&#x60; complete candidates; if &#x60;false&#x60;, a heuristic is applied and the generation stops when is it very unlikely to find better candidates. |  [optional] |
|**frequencyPenalty** | **BigDecimal** | Higher values will penalize the model from repeating the same output tokens. |  [optional] |
|**presencePenalty** | **BigDecimal** | Higher values will penalize the model from repeating the same output tokens. |  [optional] |
|**topP** | **BigDecimal** | An alternative to &#x60;temperature&#x60;. |  [optional] |
|**openaiApiKey** | **String** | If you are using OpenAI models using our API, this is how you pass along your OpenAI API key. |  [optional] |



## Enum: ToolChoiceEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| AUTO | &quot;auto&quot; |



