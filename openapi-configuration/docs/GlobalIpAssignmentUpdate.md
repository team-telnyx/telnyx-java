

# GlobalIpAssignmentUpdate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Identifies the resource. |  [optional] [readonly] |
|**recordType** | **String** | Identifies the type of the resource. |  [optional] [readonly] |
|**createdAt** | **String** | ISO 8601 formatted date-time indicating when the resource was created. |  [optional] [readonly] |
|**updatedAt** | **String** | ISO 8601 formatted date-time indicating when the resource was updated. |  [optional] [readonly] |
|**globalIpId** | **Object** |  |  [optional] [readonly] |
|**wireguardPeerId** | **Object** |  |  [optional] [readonly] |
|**status** | **InterfaceStatus** |  |  [optional] |
|**isConnected** | **Boolean** | Wireguard peer is connected. |  [optional] [readonly] |
|**isInMaintenance** | **Boolean** | Enable/disable BGP announcement. |  [optional] |
|**isAnnounced** | **Boolean** | Status of BGP announcement. |  [optional] [readonly] |



