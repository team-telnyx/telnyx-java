

# PushCredential


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of a push credential |  |
|**certificate** | **String** | Apple certificate for sending push notifications. For iOS only |  |
|**privateKey** | **String** | Apple private key for a given certificate for sending push notifications. For iOS only |  |
|**projectAccountJsonFile** | **Object** | Google server key for sending push notifications. For Android only |  |
|**alias** | **String** | Alias to uniquely identify a credential |  |
|**type** | **String** | Type of mobile push credential. Either &lt;code&gt;ios&lt;/code&gt; or &lt;code&gt;android&lt;/code&gt; |  |
|**recordType** | **String** |  |  [readonly] |
|**createdAt** | **String** | ISO 8601 timestamp when the room was created |  |
|**updatedAt** | **String** | ISO 8601 timestamp when the room was updated. |  |



