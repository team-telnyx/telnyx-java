

# ManagedAccount


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) | Identifies the type of the resource. |  |
|**id** | **UUID** | Uniquely identifies the managed account. |  |
|**email** | **String** | The managed account&#39;s email. |  |
|**apiKey** | **String** | The managed account&#39;s V2 API access key |  |
|**apiUser** | **String** | The manager account&#39;s email, which serves as the V1 API user identifier |  |
|**apiToken** | **String** | The managed account&#39;s V1 API token |  |
|**organizationName** | **String** | The organization the managed account is associated with. |  [optional] |
|**managerAccountId** | **String** | The ID of the manager account associated with the managed account. |  |
|**balance** | [**ManagedAccountBalance**](ManagedAccountBalance.md) |  |  [optional] |
|**createdAt** | **String** | ISO 8601 formatted date indicating when the resource was created. |  |
|**updatedAt** | **String** | ISO 8601 formatted date indicating when the resource was updated. |  |
|**managedAccountAllowCustomPricing** | **Boolean** | Boolean value that indicates if the managed account is able to have custom pricing set for it or not. If false, uses the pricing of the manager account. Defaults to false. There may be time lag between when the value is changed and pricing changes take effect. |  [optional] |
|**rollupBilling** | **Boolean** | Boolean value that indicates if the billing information and charges to the managed account \&quot;roll up\&quot; to the manager account. If true, the managed account will not have its own balance and will use the shared balance with the manager account. This value cannot be changed after account creation without going through Telnyx support as changes require manual updates to the account ledger. Defaults to false. |  [optional] |



## Enum: RecordTypeEnum

| Name | Value |
|---- | -----|
| MANAGED_ACCOUNT | &quot;managed_account&quot; |



