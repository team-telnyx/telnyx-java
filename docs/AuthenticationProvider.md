

# AuthenticationProvider


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Uniquely identifies the authentication provider. |  [optional]
**recordType** | **String** | Identifies the type of the resource. |  [optional]
**name** | **String** | The name associated with the authentication provider. |  [optional]
**shortName** | **String** | The short name associated with the authentication provider. This must be unique and URL-friendly, as it&#39;s going to be part of the login URL. |  [optional]
**organizationId** | **UUID** | The id from the Organization the authentication provider belongs to. |  [optional]
**active** | **Boolean** | The active status of the authentication provider |  [optional]
**settings** | [**AuthenticationProviderSettings**](AuthenticationProviderSettings.md) |  |  [optional]
**createdAt** | **String** | ISO 8601 formatted date indicating when the resource was created. |  [optional]
**updatedAt** | **String** | ISO 8601 formatted date indicating when the resource was updated. |  [optional]



