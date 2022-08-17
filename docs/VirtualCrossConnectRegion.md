

# VirtualCrossConnectRegion


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Identifies the resource. |  [optional] [readonly] |
|**recordType** | **String** | Identifies the type of the resource. |  [optional] [readonly] |
|**createdAt** | **String** | ISO 8601 formatted date-time indicating when the resource was created. |  [optional] [readonly] |
|**updatedAt** | **String** | ISO 8601 formatted date-time indicating when the resource was updated. |  [optional] [readonly] |
|**regionCode** | **String** | The region the interface is deployed to. |  [optional] |
|**cloudProvider** | [**CloudProviderEnum**](#CloudProviderEnum) | The Virtual Private Cloud with which you would like to establish a cross connect. |  [optional] |
|**cloudRegion** | **String** | The region where your Virtual Private Cloud hosts are located. |  [optional] |
|**bandwidthMbps** | **List&lt;BigDecimal&gt;** | The available throughput in Megabits per Second (Mbps) for your Virtual Cross Connect. |  [optional] |



## Enum: CloudProviderEnum

| Name | Value |
|---- | -----|
| AWS | &quot;aws&quot; |
| AZURE | &quot;azure&quot; |
| GCE | &quot;gce&quot; |



