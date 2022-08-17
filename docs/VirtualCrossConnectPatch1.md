

# VirtualCrossConnectPatch1


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**primaryEnabled** | **Boolean** | Indicates whether the primary circuit is enabled. Setting this to &#x60;false&#x60; will disable the circuit. |  [optional] |
|**primaryRoutingAnnouncement** | **Boolean** | Whether the primary BGP route is being announced. |  [optional] |
|**primaryCloudIp** | **String** | The IP address assigned for your side of the Virtual Cross Connect.&lt;br /&gt;&lt;br /&gt;If none is provided, one will be generated for you.&lt;br /&gt;&lt;br /&gt;This value can not be patched once the VXC has bene provisioned. |  [optional] |
|**secondaryEnabled** | **Boolean** | Indicates whether the secondary circuit is enabled. Setting this to &#x60;false&#x60; will disable the circuit. |  [optional] |
|**secondaryRoutingAnnouncement** | **Boolean** | Whether the secondary BGP route is being announced. |  [optional] |
|**secondaryCloudIp** | **String** | The IP address assigned for your side of the Virtual Cross Connect.&lt;br /&gt;&lt;br /&gt;If none is provided, one will be generated for you.&lt;br /&gt;&lt;br /&gt;This value can not be patched once the VXC has bene provisioned. |  [optional] |



