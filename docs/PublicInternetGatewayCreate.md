

# PublicInternetGatewayCreate


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
|**publicIp** | **String** | The publically accessible ip for this interface. |  [optional] [readonly] |
|**regionCode** | **String** | The region the interface should be deployed to. |  [optional] |



