

# CreateManagedAccountRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**email** | **String** | The email address for the managed account. If not provided, the email address will be generated based on the email address of the manager account. |  [optional] |
|**password** | **String** | Password for the managed account. If a password is not supplied, the account will not be able to be signed into directly. (A password reset may still be performed later to enable sign-in via password.) |  [optional] |
|**businessName** | **String** | The name of the business for which the new managed account is being created, that will be used as the managed accounts&#39;s organization&#39;s name. |  |
|**managedAccountAllowCustomPricing** | **Boolean** | Boolean value that indicates if the managed account is able to have custom pricing set for it or not. If false, uses the pricing of the manager account. Defaults to false. This value may be changed after creation, but there may be time lag between when the value is changed and pricing changes take effect. |  [optional] |
|**rollupBilling** | **Boolean** | Boolean value that indicates if the billing information and charges to the managed account \&quot;roll up\&quot; to the manager account. If true, the managed account will not have its own balance and will use the shared balance with the manager account. This value cannot be changed after account creation without going through Telnyx support as changes require manual updates to the account ledger. Defaults to false. |  [optional] |



