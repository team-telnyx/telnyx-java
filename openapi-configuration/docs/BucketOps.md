

# BucketOps


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bytesSent** | **Integer** | The number of bytes sent |  [optional] |
|**bytesReceived** | **Integer** | The number of bytes received |  [optional] |
|**ops** | **Integer** | The number of operations |  [optional] |
|**successfulOps** | **Integer** | The number of successful operations |  [optional] |
|**category** | [**CategoryEnum**](#CategoryEnum) | The category of the bucket operation |  [optional] |



## Enum: CategoryEnum

| Name | Value |
|---- | -----|
| LIST_BUCKET | &quot;list_bucket&quot; |
| LIST_BUCKETS | &quot;list_buckets&quot; |
| GET_BUCKET_LOCATION | &quot;get-bucket_location&quot; |
| CREATE_BUCKET | &quot;create_bucket&quot; |
| STAT_BUCKET | &quot;stat_bucket&quot; |
| GET_BUCKET_VERSIONING | &quot;get_bucket_versioning&quot; |
| SET_BUCKET_VERSIONING | &quot;set_bucket_versioning&quot; |
| GET_OBJ | &quot;get_obj&quot; |
| PUT_OBJ | &quot;put_obj&quot; |
| DELETE_OBJ | &quot;delete_obj&quot; |



