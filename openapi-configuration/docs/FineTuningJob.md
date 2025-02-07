

# FineTuningJob

The `fine_tuning.job` object represents a fine-tuning job that has been created through the API.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The name of the fine-tuned model that is being created. |  |
|**createdAt** | **Integer** | The Unix timestamp (in seconds) for when the fine-tuning job was created. |  |
|**finishedAt** | **Integer** | The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running. |  |
|**hyperparameters** | [**FineTuningJobHyperparameters**](FineTuningJobHyperparameters.md) |  |  |
|**model** | **String** | The base model that is being fine-tuned. |  |
|**organizationId** | **String** | The organization that owns the fine-tuning job. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The current status of the fine-tuning job. |  |
|**trainedTokens** | **Integer** | The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running. |  |
|**trainingFile** | **String** | The storage bucket or object used for training. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| QUEUED | &quot;queued&quot; |
| RUNNING | &quot;running&quot; |
| SUCCEEDED | &quot;succeeded&quot; |
| FAILED | &quot;failed&quot; |
| CANCELLED | &quot;cancelled&quot; |



