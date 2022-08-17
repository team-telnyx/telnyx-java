

# PrivateWirelessGateway


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Identifies the resource. |  [optional] [readonly] |
|**networkId** | **UUID** | The identification of the related network resource. |  [optional] |
|**recordType** | **String** |  |  [optional] [readonly] |
|**createdAt** | **String** | ISO 8601 formatted date-time indicating when the resource was created. |  [optional] [readonly] |
|**updatedAt** | **String** | ISO 8601 formatted date-time indicating when the resource was updated. |  [optional] [readonly] |
|**name** | **String** | The private wireless gateway name. |  [optional] |
|**regionCode** | **String** | The geographical region where the Private Wireless Gateway is deployed to. |  [optional] |
|**status** | [**PrivateWirelessGatewayStatus**](PrivateWirelessGatewayStatus.md) |  |  [optional] |
|**ipRange** | **String** | IP block used to assign IPs to the SIM cards in the Private Wireless Gateway. |  [optional] [readonly] |
|**assignedResources** | [**List&lt;PWGAssignedResourcesSummary&gt;**](PWGAssignedResourcesSummary.md) | A list of the resources that have been assigned to the Private Wireless Gateway |  [optional] |



