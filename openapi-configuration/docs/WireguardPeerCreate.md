

# WireguardPeerCreate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Identifies the resource. |  [optional] [readonly] |
|**recordType** | **String** | Identifies the type of the resource. |  [optional] [readonly] |
|**createdAt** | **String** | ISO 8601 formatted date-time indicating when the resource was created. |  [optional] [readonly] |
|**updatedAt** | **String** | ISO 8601 formatted date-time indicating when the resource was updated. |  [optional] [readonly] |
|**publicKey** | **String** | The WireGuard &#x60;PublicKey&#x60;.&lt;br /&gt;&lt;br /&gt;If you do not provide a Public Key, a new Public and Private key pair will be generated for you. |  [optional] |
|**lastSeen** | **String** | ISO 8601 formatted date-time indicating when peer sent traffic last time. |  [optional] [readonly] |
|**wireguardInterfaceId** | **UUID** | The id of the wireguard interface associated with the peer. |  |
|**privateKey** | **String** | Your WireGuard &#x60;Interface.PrivateKey&#x60;.&lt;br /&gt;&lt;br /&gt;This attribute is only ever utlised if, on POST, you do NOT provide your own &#x60;public_key&#x60;. In which case, a new Public and Private key pair will be generated for you. When your &#x60;private_key&#x60; is returned, you must save this immediately as we do not save it within Telnyx. If you lose your Private Key, it can not be recovered. |  [optional] [readonly] |



