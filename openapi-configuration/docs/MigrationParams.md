

# MigrationParams


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for the data migration. |  [optional] [readonly] |
|**sourceId** | **String** | ID of the Migration Source from which to migrate data. |  |
|**targetBucketName** | **String** | Bucket name to migrate the data into. Will default to the same name as the &#x60;source_bucket_name&#x60;. |  |
|**targetRegion** | **String** | Telnyx Cloud Storage region to migrate the data to. |  |
|**refresh** | **Boolean** | If true, will continue to poll the source bucket to ensure new data is continually migrated over. |  [optional] |
|**lastCopy** | **OffsetDateTime** | Time when data migration was last copied from the source. |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the migration. |  [optional] [readonly] |
|**bytesToMigrate** | **Integer** | Total amount of data found in source bucket to migrate. |  [optional] [readonly] |
|**bytesMigrated** | **Integer** | Total amount of data that has been succesfully migrated. |  [optional] [readonly] |
|**speed** | **Integer** | Current speed of the migration. |  [optional] [readonly] |
|**eta** | **OffsetDateTime** | Estimated time the migration will complete. |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** | Time when data migration was created |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| CHECKING | &quot;checking&quot; |
| MIGRATING | &quot;migrating&quot; |
| COMPLETE | &quot;complete&quot; |
| ERROR | &quot;error&quot; |
| STOPPED | &quot;stopped&quot; |



