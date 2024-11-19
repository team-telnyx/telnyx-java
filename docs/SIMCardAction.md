

# SIMCardAction

This object represents a SIM card action. It allows tracking the current status of an operation that impacts the SIM card.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Identifies the resource. |  [optional] [readonly] |
|**recordType** | **String** |  |  [optional] [readonly] |
|**simCardId** | **UUID** | The related SIM card identifier. |  [optional] [readonly] |
|**actionType** | [**ActionTypeEnum**](#ActionTypeEnum) | The operation type. It can be one of the following: &lt;br/&gt; &lt;ul&gt;  &lt;li&gt;&lt;code&gt;enable&lt;/code&gt; - move the SIM card to the &lt;code&gt;enabled&lt;/code&gt; status&lt;/li&gt;  &lt;li&gt;&lt;code&gt;enable_standby_sim_card&lt;/code&gt; - move a SIM card previously on the &lt;code&gt;standby&lt;/code&gt; status to the &lt;code&gt;enabled&lt;/code&gt; status after it consumes data.&lt;/li&gt;  &lt;li&gt;&lt;code&gt;disable&lt;/code&gt; - move the SIM card to the &lt;code&gt;disabled&lt;/code&gt; status&lt;/li&gt;  &lt;li&gt;&lt;code&gt;set_standby&lt;/code&gt; - move the SIM card to the &lt;code&gt;standby&lt;/code&gt; status&lt;/li&gt;  &lt;/ul&gt; |  [optional] [readonly] |
|**status** | [**SIMCardActionStatus**](SIMCardActionStatus.md) |  |  [optional] |
|**settings** | **Object** | A JSON object representation of the action params. |  [optional] [readonly] |
|**createdAt** | **String** | ISO 8601 formatted date-time indicating when the resource was created. |  [optional] [readonly] |
|**updatedAt** | **String** | ISO 8601 formatted date-time indicating when the resource was updated. |  [optional] [readonly] |



## Enum: ActionTypeEnum

| Name | Value |
|---- | -----|
| ENABLE | &quot;enable&quot; |
| ENABLE_STANDBY_SIM_CARD | &quot;enable_standby_sim_card&quot; |
| DISABLE | &quot;disable&quot; |
| SET_STANDBY | &quot;set_standby&quot; |



