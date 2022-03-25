

# AuthenticationProviderCreate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name associated with the authentication provider. | 
**shortName** | **String** | The short name associated with the authentication provider. This must be unique and URL-friendly, as it&#39;s going to be part of the login URL. | 
**active** | **Boolean** | The active status of the authentication provider |  [optional]
**settings** | [**Settings**](Settings.md) |  | 
**settingsUrl** | **String** | The URL for the identity provider metadata file to populate the settings automatically. If the settings attribute is provided, that will be used instead. |  [optional]



