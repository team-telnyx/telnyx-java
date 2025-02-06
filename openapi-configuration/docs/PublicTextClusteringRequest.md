

# PublicTextClusteringRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bucket** | **String** | The embedded storage bucket to compute the clusters from. The bucket must already be [embedded](https://developers.telnyx.com/api/inference/inference-embedding/post-embedding). |  |
|**prefix** | **String** | Prefix to filter whcih files in the buckets are included. |  [optional] |
|**files** | **List&lt;String&gt;** | Array of files to filter which are included. |  [optional] |
|**minClusterSize** | **Integer** | Smallest number of related text chunks to qualify as a cluster. Top-level clusters should be thought of as identifying broad themes in your data. |  [optional] |
|**minSubclusterSize** | **Integer** | Smallest number of related text chunks to qualify as a sub-cluster. Sub-clusters should be thought of as identifying more specific topics within a broader theme. |  [optional] |



