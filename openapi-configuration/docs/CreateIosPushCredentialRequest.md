

# CreateIosPushCredentialRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Type of mobile push credential. Should be &lt;code&gt;ios&lt;/code&gt; here |  |
|**certificate** | **String** | Certificate as received from APNs |  |
|**privateKey** | **String** | Corresponding private key to the certificate as received from APNs |  |
|**alias** | **String** | Alias to uniquely identify the credential |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| IOS | &quot;ios&quot; |



