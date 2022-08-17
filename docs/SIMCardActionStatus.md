

# SIMCardActionStatus


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**value** | [**ValueEnum**](#ValueEnum) | The current status of the SIM card action. |  [optional] [readonly] |
|**reason** | **String** | It describes why the SIM card action is in the current status. This will be &lt;code&gt;null&lt;/code&gt; for self-explanatory statuses, such as &lt;code&gt;in-progress&lt;/code&gt; and &lt;code&gt;completed&lt;/code&gt; but will include further information on statuses like &lt;code&gt;interrupted&lt;/code&gt; and &lt;code&gt;failed&lt;/code&gt;. |  [optional] [readonly] |



## Enum: ValueEnum

| Name | Value |
|---- | -----|
| IN_PROGRESS | &quot;in-progress&quot; |
| COMPLETED | &quot;completed&quot; |
| FAILED | &quot;failed&quot; |
| INTERRUPTED | &quot;interrupted&quot; |



