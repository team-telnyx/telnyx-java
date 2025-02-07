

# TelnyxBrandWithCampaignsCount


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entityType** | **EntityType** | Entity type behind the brand. This is the form of business establishment. |  |
|**cspId** | **String** | Unique identifier assigned to the csp by the registry. |  [optional] |
|**brandId** | **String** | Unique identifier assigned to the brand. |  [optional] |
|**tcrBrandId** | **String** | Unique identifier assigned to the brand by the registry. |  [optional] |
|**displayName** | **String** | Display or marketing name of the brand. |  |
|**companyName** | **String** | (Required for Non-profit/private/public) Legal company name. |  [optional] |
|**firstName** | **String** | First name of business contact. |  [optional] |
|**lastName** | **String** | Last name of business contact. |  [optional] |
|**ein** | **String** | (Required for Non-profit) Government assigned corporate tax ID. EIN is 9-digits in U.S. |  [optional] |
|**phone** | **String** | Valid phone number in e.164 international format. |  [optional] |
|**street** | **String** | Street number and name. |  [optional] |
|**city** | **String** | City name |  [optional] |
|**state** | **String** | State. Must be 2 letters code for United States. |  [optional] |
|**postalCode** | **String** | Postal codes. Use 5 digit zipcode for United States |  [optional] |
|**country** | **String** | ISO2 2 characters country code. Example: US - United States |  |
|**email** | **String** | Valid email address of brand support contact. |  |
|**stockSymbol** | **String** | (Required for public company) stock symbol. |  [optional] |
|**stockExchange** | **StockExchange** | (Required for public company) stock exchange. |  [optional] |
|**ipAddress** | **String** | IP address of the browser requesting to create brand identity. |  [optional] |
|**website** | **String** | Brand website URL. |  [optional] |
|**brandRelationship** | **BrandRelationship** | Brand relationship to the CSP |  |
|**vertical** | **String** | Vertical or industry segment of the brand. |  |
|**altBusinessId** | **String** | Alternate business identifier such as DUNS, LEI, or GIIN |  [optional] |
|**altBusinessIdType** | **AltBusinessIdType** |  |  [optional] |
|**universalEin** | **String** | Universal EIN of Brand, Read Only. |  [optional] |
|**referenceId** | **String** | Unique identifier Telnyx assigned to the brand - the brandId |  [optional] |
|**identityStatus** | **BrandIdentityStatus** |  |  [optional] |
|**optionalAttributes** | [**BrandOptionalAttributes**](BrandOptionalAttributes.md) |  |  [optional] |
|**mock** | **Boolean** | Mock brand for testing purposes |  [optional] |
|**mobilePhone** | **String** | Valid mobile phone number in e.164 international format. |  [optional] |
|**isReseller** | **Boolean** | Indicates whether this brand is known to be a reseller |  [optional] |
|**webhookURL** | **String** | Webhook to which brand status updates are sent. |  [optional] |
|**businessContactEmail** | **String** | Business contact email.  Required if &#x60;entityType&#x60; is &#x60;PUBLIC_PROFIT&#x60;. |  [optional] |
|**webhookFailoverURL** | **String** | Failover webhook to which brand status updates are sent. |  [optional] |
|**createdAt** | **String** | Date and time that the brand was created at. |  [optional] |
|**updatedAt** | **String** | Date and time that the brand was last updated at. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the brand |  [optional] |
|**failureReasons** | **Object** | Failure reasons for brand |  [optional] |
|**assignedCampaignsCount** | **BigDecimal** | Number of campaigns associated with the brand |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OK | &quot;OK&quot; |
| REGISTRATION_PENDING | &quot;REGISTRATION_PENDING&quot; |
| REGISTRATION_FAILED | &quot;REGISTRATION_FAILED&quot; |



