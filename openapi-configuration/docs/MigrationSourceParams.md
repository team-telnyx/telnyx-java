

# MigrationSourceParams


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for the data migration source. |  [optional] [readonly] |
|**provider** | [**ProviderEnum**](#ProviderEnum) | Cloud provider from which to migrate data. |  |
|**providerAuth** | [**MigrationSourceParamsProviderAuth**](MigrationSourceParamsProviderAuth.md) |  |  |
|**bucketName** | **String** | Bucket name to migrate the data from. |  |



## Enum: ProviderEnum

| Name | Value |
|---- | -----|
| AWS | &quot;aws&quot; |



