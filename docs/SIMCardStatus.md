

# SIMCardStatus


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | [**ValueEnum**](#ValueEnum) | The current status of the SIM card. It will be one of the following: &lt;br/&gt; &lt;ul&gt;  &lt;li&gt;&lt;code&gt;registering&lt;/code&gt; - the card is being registered&lt;/li&gt;  &lt;li&gt;&lt;code&gt;enabling&lt;/code&gt; - the card is being enabled&lt;/li&gt;  &lt;li&gt;&lt;code&gt;enabled&lt;/code&gt; - the card is enabled and ready for use&lt;/li&gt;  &lt;li&gt;&lt;code&gt;disabling&lt;/code&gt; - the card is being disabled&lt;/li&gt;  &lt;li&gt;&lt;code&gt;disabled&lt;/code&gt; - the card has been disabled and cannot be used&lt;/li&gt;  &lt;li&gt;&lt;code&gt;data_limit_exceeded&lt;/code&gt; - the card has exceeded its data consumption limit&lt;/li&gt;  &lt;li&gt;&lt;code&gt;setting_standby&lt;/code&gt; - the process to set the card in stand by is in progress&lt;/li&gt;  &lt;li&gt;&lt;code&gt;standby&lt;/code&gt; - the card is in stand by&lt;/li&gt; &lt;/ul&gt; Transitioning between the enabled and disabled states may take a period of time.  |  [optional] [readonly]
**reason** | **String** | It describes why the SIM card is in the current status. |  [optional] [readonly]



## Enum: ValueEnum

Name | Value
---- | -----
REGISTERING | &quot;registering&quot;
ENABLING | &quot;enabling&quot;
ENABLED | &quot;enabled&quot;
DISABLING | &quot;disabling&quot;
DISABLED | &quot;disabled&quot;
DATA_LIMIT_EXCEEDED | &quot;data_limit_exceeded&quot;
SETTING_STANDBY | &quot;setting_standby&quot;
STANDBY | &quot;standby&quot;



