

# PrivateWirelessGatewayStatus

The current status or failure details of the Private Wireless Gateway.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**value** | [**ValueEnum**](#ValueEnum) | The current status or failure details of the Private Wireless Gateway. &lt;ul&gt;  &lt;li&gt;&lt;code&gt;provisioning&lt;/code&gt; - the Private Wireless Gateway is being provisioned.&lt;/li&gt;  &lt;li&gt;&lt;code&gt;provisioned&lt;/code&gt; - the Private Wireless Gateway was provisioned and able to receive connections.&lt;/li&gt;  &lt;li&gt;&lt;code&gt;failed&lt;/code&gt; - the provisioning had failed for a reason and it requires an intervention.&lt;/li&gt;  &lt;li&gt;&lt;code&gt;decommissioning&lt;/code&gt; - the Private Wireless Gateway is being removed from the network.&lt;/li&gt;  &lt;/ul&gt;  Transitioning between the provisioning and provisioned states may take some time. |  [optional] [readonly] |
|**errorDescription** | **String** | This attribute provides a human-readable explanation of why a failure happened. |  [optional] [readonly] |
|**errorCode** | **String** | This attribute is an [error code](https://developers.telnyx.com/api/errors) related to the failure reason. |  [optional] [readonly] |



## Enum: ValueEnum

| Name | Value |
|---- | -----|
| PROVISIONING | &quot;provisioning&quot; |
| PROVISIONED | &quot;provisioned&quot; |
| FAILED | &quot;failed&quot; |
| DECOMMISSIONING | &quot;decommissioning&quot; |



