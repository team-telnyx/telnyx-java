

# TFVerificationRequest

The body of a tollfree verification request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**businessName** | **String** | Name of the business; there are no specific formatting requirements |  |
|**corporateWebsite** | **String** | A URL, including the scheme, pointing to the corporate website |  |
|**businessAddr1** | **String** | Line 1 of the business address |  |
|**businessAddr2** | **String** | Line 2 of the business address |  [optional] |
|**businessCity** | **String** | The city of the business address; the first letter should be capitalized |  |
|**businessState** | **String** | The full name of the state (not the 2 letter code) of the business address; the first letter should be capitalized |  |
|**businessZip** | **String** | The ZIP code of the business address |  |
|**businessContactFirstName** | **String** | First name of the business contact; there are no specific requirements on formatting |  |
|**businessContactLastName** | **String** | Last name of the business contact; there are no specific requirements on formatting |  |
|**businessContactEmail** | **String** | The email address of the business contact |  |
|**businessContactPhone** | **String** | The phone number of the business contact in E.164 format |  |
|**messageVolume** | **Volume** | Estimated monthly volume of messages from the given phone numbers |  |
|**phoneNumbers** | [**List&lt;TFPhoneNumber&gt;**](TFPhoneNumber.md) | The phone numbers to request the verification of |  |
|**useCase** | **UseCaseCategories** | Machine-readable use-case for the phone numbers |  |
|**useCaseSummary** | **String** | Human-readable summary of the desired use-case |  |
|**productionMessageContent** | **String** | An example of a message that will be sent from the given phone numbers |  |
|**optInWorkflow** | **String** | Human-readable description of how end users will opt into receiving messages from the given phone numbers |  |
|**optInWorkflowImageURLs** | [**List&lt;Url&gt;**](Url.md) | Images showing the opt-in workflow |  |
|**additionalInformation** | **String** | Any additional information |  |
|**isvReseller** | **String** | ISV name |  |
|**webhookUrl** | **String** | URL that should receive webhooks relating to this verification request |  [optional] |



