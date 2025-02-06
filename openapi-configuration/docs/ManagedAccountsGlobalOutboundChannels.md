

# ManagedAccountsGlobalOutboundChannels


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**managedAccountAllowCustomPricing** | **Boolean** | Boolean value that indicates if the managed account is able to have custom pricing set for it or not. If false, uses the pricing of the manager account. Defaults to false. This value may be changed, but there may be time lag between when the value is changed and pricing changes take effect. |  [optional] |
|**allocatableGlobalOutboundChannels** | **Integer** | The total amount of allocatable global outbound channels available to the authenticated manager. Will be 0 if the feature is not enabled for their account. |  [optional] |
|**recordType** | **String** | The type of the data contained in this record. |  [optional] |
|**totalGlobalChannelsAllocated** | **Integer** | The total number of allocatable global outbound channels currently allocated across all managed accounts for the authenticated user. This includes any amount of channels allocated by default at managed account creation time. Will be 0 if the feature is not enabled for their account. |  [optional] |



