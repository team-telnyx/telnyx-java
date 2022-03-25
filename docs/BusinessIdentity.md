

# BusinessIdentity


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | **String** |  |  [optional] [readonly]
**id** | **UUID** |  |  [optional] [readonly]
**organizationId** | **UUID** | The ID of the organization that owns the record |  [optional] [readonly]
**name** | **String** | The name of the business identity on the telnyx platform |  [optional]
**businessEmail** | **String** | The email of the business |  [optional]
**businessName** | **String** | The name of the business |  [optional]
**businessPhoneNumber** | **String** |  |  [optional]
**businessDescription** | **String** |  |  [optional]
**submissionAcknowledgement** | **Boolean** | User acceptance of the terms of submission |  [optional]
**websiteUrl** | **List&lt;String&gt;** |  |  [optional]
**address** | [**BusinessIdentityAddress**](BusinessIdentityAddress.md) |  |  [optional]
**contacts** | [**List&lt;BusinessIdentityContacts&gt;**](BusinessIdentityContacts.md) |  |  [optional]
**createdAt** | **String** | An ISO 8601 datetime string for when the business identity was added to the Telnyx platform |  [optional] [readonly]
**updatedAt** | **String** | An ISO 8601 datetime string for when the business identity was updated |  [optional] [readonly]



