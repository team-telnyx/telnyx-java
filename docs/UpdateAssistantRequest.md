

# UpdateAssistantRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**model** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**instructions** | **String** |  |  [optional] |
|**tools** | [**List&lt;ToolsInner&gt;**](ToolsInner.md) | The &#x60;function&#x60; tool type follows the same schema as the [OpenAI Assistants API](https://platform.openai.com/docs/api-reference/assistants/modifyAssistant). The &#x60;retrieval&#x60; tool type is unique to Telnyx. You may pass a list of [embedded storage buckets](https://developers.telnyx.com/api/inference/inference-embedding/post-embedding) for retrieval-augmented generation. |  [optional] |



