

# SIMCardOrder


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Identifies the resource. |  [optional] [readonly]
**recordType** | **String** | Identifies the type of the resource. |  [optional] [readonly]
**quantity** | **Integer** | The amount of SIM cards requested in the SIM card order. |  [optional]
**cost** | [**SIMCardOrderCost**](SIMCardOrderCost.md) |  |  [optional]
**orderAddress** | [**SIMCardOrderOrderAddress**](SIMCardOrderOrderAddress.md) |  |  [optional]
**trackingUrl** | **String** | The URL used to get tracking information about the order. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The current status of the SIM Card order.&lt;ul&gt; &lt;li&gt;&lt;code&gt;pending&lt;/code&gt; - the order is waiting to be processed.&lt;/li&gt; &lt;li&gt;&lt;code&gt;processing&lt;/code&gt; - the order is currently being processed.&lt;/li&gt; &lt;li&gt;&lt;code&gt;ready_to_ship&lt;/code&gt; - the order is ready to be shipped to the specified &lt;b&gt;address&lt;/b&gt;.&lt;/li&gt; &lt;li&gt;&lt;code&gt;shipped&lt;/code&gt; - the order was shipped and is on its way to be delivered to the specified &lt;b&gt;address&lt;/b&gt;.&lt;/li&gt; &lt;li&gt;&lt;code&gt;delivered&lt;/code&gt; - the order was delivered to the specified &lt;b&gt;address&lt;/b&gt;.&lt;/li&gt; &lt;li&gt;&lt;code&gt;canceled&lt;/code&gt; - the order was canceled.&lt;/li&gt; &lt;/ul&gt; |  [optional]
**createdAt** | **String** | ISO 8601 formatted date-time indicating when the resource was last created. |  [optional] [readonly]
**updatedAt** | **String** | ISO 8601 formatted date-time indicating when the resource was last updated. |  [optional] [readonly]



## Enum: StatusEnum

Name | Value
---- | -----
PENDING | &quot;pending&quot;
PROCESSING | &quot;processing&quot;
READY_TO_SHIP | &quot;ready_to_ship&quot;
SHIPPED | &quot;shipped&quot;
DELIVERED | &quot;delivered&quot;
CANCELED | &quot;canceled&quot;



