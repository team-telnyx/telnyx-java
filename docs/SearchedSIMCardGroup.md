

# SearchedSIMCardGroup


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Identifies the resource. |  [optional] [readonly] |
|**recordType** | **String** | Identifies the type of the resource. |  [optional] [readonly] |
|**_default** | **Boolean** | Indicates whether the SIM card group is the users default group.&lt;br/&gt;The default group is created for the user and can not be removed. |  [optional] [readonly] |
|**name** | **String** | A user friendly name for the SIM card group. |  [optional] |
|**dataLimit** | [**SearchedSIMCardGroupDataLimit**](SearchedSIMCardGroupDataLimit.md) |  |  [optional] |
|**consumedData** | [**ConsumedData**](ConsumedData.md) |  |  [optional] |
|**simCardCount** | **Integer** | The number of SIM cards associated with the group. |  [optional] |
|**privateWirelessGatewayId** | **UUID** | The identification of the related Private Wireless Gateway resource. |  [optional] |
|**createdAt** | **String** | ISO 8601 formatted date-time indicating when the resource was created. |  [optional] [readonly] |
|**updatedAt** | **String** | ISO 8601 formatted date-time indicating when the resource was updated. |  [optional] [readonly] |



