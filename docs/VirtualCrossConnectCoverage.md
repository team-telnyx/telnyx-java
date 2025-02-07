

# VirtualCrossConnectCoverage


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recordType** | **String** | Identifies the type of the resource. |  [optional] [readonly] |
|**location** | [**Location**](Location.md) |  |  [optional] |
|**cloudProvider** | [**CloudProviderEnum**](#CloudProviderEnum) | The Virtual Private Cloud with which you would like to establish a cross connect. |  [optional] |
|**cloudProviderRegion** | **String** | The region where your Virtual Private Cloud hosts are located. Should be identical to how the cloud provider names region, i.e. us-east-1 for AWS but Frankfurt for Azure |  [optional] |
|**availableBandwidth** | **List&lt;BigDecimal&gt;** | The available throughput in Megabits per Second (Mbps) for your Virtual Cross Connect. |  [optional] |



## Enum: CloudProviderEnum

| Name | Value |
|---- | -----|
| AWS | &quot;aws&quot; |
| AZURE | &quot;azure&quot; |
| GCE | &quot;gce&quot; |



