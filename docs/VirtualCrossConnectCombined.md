

# VirtualCrossConnectCombined


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Identifies the resource. |  [optional] [readonly] |
|**recordType** | **String** | Identifies the type of the resource. |  [optional] [readonly] |
|**createdAt** | **String** | ISO 8601 formatted date-time indicating when the resource was created. |  [optional] [readonly] |
|**updatedAt** | **String** | ISO 8601 formatted date-time indicating when the resource was updated. |  [optional] [readonly] |
|**networkId** | **UUID** | The id of the network associated with the interface. |  |
|**name** | **String** | A user specified name for the interface. |  [optional] |
|**status** | **InterfaceStatus** |  |  [optional] |
|**cloudProvider** | [**CloudProviderEnum**](#CloudProviderEnum) | The Virtual Private Cloud with which you would like to establish a cross connect. |  |
|**cloudRegion** | **String** | The region where your Virtual Private Cloud hosts are located.&lt;br /&gt;&lt;br /&gt;The available regions can be found using the /virtual_cross_connect_regions endpoint. |  |
|**bgpAsn** | **BigDecimal** | The Border Gateway Protocol (BGP) Autonomous System Number (ASN). If null, value will be assigned by Telnyx. |  |
|**bandwidthMbps** | **BigDecimal** | The desired throughput in Megabits per Second (Mbps) for your Virtual Cross Connect.&lt;br /&gt;&lt;br /&gt;The available bandwidths can be found using the /virtual_cross_connect_regions endpoint. |  [optional] |
|**primaryEnabled** | **Boolean** | Indicates whether the primary circuit is enabled. Setting this to &#x60;false&#x60; will disable the circuit. |  [optional] |
|**primaryCloudAccountId** | **String** | The identifier for your Virtual Private Cloud. The number will be different based upon your Cloud provider. |  |
|**primaryTelnyxIp** | **String** | The IP address assigned to the Telnyx side of the Virtual Cross Connect.&lt;br /&gt;&lt;br /&gt;If none is provided, one will be generated for you.&lt;br /&gt;&lt;br /&gt;This value should be null for GCE as Google will only inform you of your assigned IP once the connection has been accepted. |  [optional] |
|**primaryCloudIp** | **String** | The IP address assigned for your side of the Virtual Cross Connect.&lt;br /&gt;&lt;br /&gt;If none is provided, one will be generated for you.&lt;br /&gt;&lt;br /&gt;This value can not be patched once the VXC has bene provisioned. |  [optional] |
|**primaryBgpKey** | **String** | The authentication key for BGP peer configuration. |  [optional] |
|**secondaryEnabled** | **Boolean** | Indicates whether the secondary circuit is enabled. Setting this to &#x60;false&#x60; will disable the circuit. |  [optional] |
|**secondaryCloudAccountId** | **String** | The identifier for your Virtual Private Cloud. The number will be different based upon your Cloud provider.&lt;br /&gt;&lt;br /&gt;This attribute is only necessary for GCE. |  [optional] |
|**secondaryTelnyxIp** | **String** | The IP address assigned to the Telnyx side of the Virtual Cross Connect.&lt;br /&gt;&lt;br /&gt;If none is provided, one will be generated for you.&lt;br /&gt;&lt;br /&gt;This value should be null for GCE as Google will only inform you of your assigned IP once the connection has been accepted. |  [optional] |
|**secondaryCloudIp** | **String** | The IP address assigned for your side of the Virtual Cross Connect.&lt;br /&gt;&lt;br /&gt;If none is provided, one will be generated for you.&lt;br /&gt;&lt;br /&gt;This value can not be patched once the VXC has bene provisioned. |  [optional] |
|**secondaryBgpKey** | **String** | The authentication key for BGP peer configuration. |  [optional] |
|**regionCode** | **String** | The region interface is deployed to. |  |
|**primaryRoutingAnnouncement** | **Boolean** | Whether the primary BGP route is being announced. |  [optional] |
|**secondaryRoutingAnnouncement** | **Boolean** | Whether the secondary BGP route is being announced. |  [optional] |
|**region** | [**RegionOutRegion**](RegionOutRegion.md) |  |  [optional] |



## Enum: CloudProviderEnum

| Name | Value |
|---- | -----|
| AWS | &quot;aws&quot; |
| AZURE | &quot;azure&quot; |
| GCE | &quot;gce&quot; |



