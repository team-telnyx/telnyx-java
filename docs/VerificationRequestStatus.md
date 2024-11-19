

# VerificationRequestStatus

A verification request and its status, suitable for returning to users

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**businessName** | **String** |  |  |
|**corporateWebsite** | **String** |  |  |
|**businessAddr1** | **String** |  |  |
|**businessAddr2** | **String** |  |  [optional] |
|**businessCity** | **String** |  |  |
|**businessState** | **String** |  |  |
|**businessZip** | **String** |  |  |
|**businessContactFirstName** | **String** |  |  |
|**businessContactLastName** | **String** |  |  |
|**businessContactEmail** | **String** |  |  |
|**businessContactPhone** | **String** |  |  |
|**messageVolume** | **Volume** | One of the following exact values: 10; 100; 1,000; 10,000; 100,000; 250,000; 500,000; 750,000; 1,000,000; 5,000,000; 10,000,000+ |  |
|**phoneNumbers** | [**List&lt;TFPhoneNumber&gt;**](TFPhoneNumber.md) |  |  |
|**useCase** | **UseCaseCategories** |  |  |
|**useCaseSummary** | **String** |  |  |
|**productionMessageContent** | **String** |  |  |
|**optInWorkflow** | **String** |  |  |
|**optInWorkflowImageURLs** | [**List&lt;Url&gt;**](Url.md) |  |  |
|**additionalInformation** | **String** |  |  |
|**isvReseller** | **String** |  |  |
|**webhookUrl** | **String** |  |  [optional] |
|**id** | **UUID** |  |  |
|**verificationStatus** | **TFVerificationStatus** |  |  |
|**reason** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



