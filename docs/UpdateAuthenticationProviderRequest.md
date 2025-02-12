

# UpdateAuthenticationProviderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name associated with the authentication provider. |  [optional] |
|**shortName** | **String** | The short name associated with the authentication provider. This must be unique and URL-friendly, as it&#39;s going to be part of the login URL. |  [optional] |
|**active** | **Boolean** | The active status of the authentication provider |  [optional] |
|**settings** | [**Settings**](Settings.md) |  |  [optional] |
|**settingsUrl** | **URI** | The URL for the identity provider metadata file to populate the settings automatically. If the settings attribute is provided, that will be used instead. |  [optional] |



