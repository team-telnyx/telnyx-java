

# WireguardInterfaceCreate


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
|**endpoint** | **String** | The Telnyx WireGuard peers &#x60;Peer.endpoint&#x60; value. |  [optional] [readonly] |
|**publicKey** | **String** | The Telnyx WireGuard peers &#x60;Peer.PublicKey&#x60;. |  [optional] [readonly] |
|**enableSipTrunking** | **Boolean** | Enable SIP traffic forwarding over VPN interface. |  [optional] |
|**regionCode** | **String** | The region the interface should be deployed to. |  |



