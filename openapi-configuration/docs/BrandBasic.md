

# BrandBasic


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**brandId** | **String** | Unique identifier assigned to the brand. |  [optional] |
|**tcrBrandId** | **String** | Unique identifier assigned to the brand by the registry. |  [optional] |
|**entityType** | **EntityType** |  |  [optional] |
|**identityStatus** | **BrandIdentityStatus** |  |  [optional] |
|**companyName** | **String** | (Required for Non-profit/private/public) Legal company name. |  [optional] |
|**displayName** | **String** | Display or marketing name of the brand. |  [optional] |
|**email** | **String** | Valid email address of brand support contact. |  [optional] |
|**website** | **String** | Brand website URL. |  [optional] |
|**failureReasons** | **Object** | Failure reasons for brand |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the brand |  [optional] |
|**createdAt** | **String** | Date and time that the brand was created at. |  [optional] |
|**updatedAt** | **String** | Date and time that the brand was last updated at. |  [optional] |
|**assignedCampaingsCount** | **Integer** | Number of campaigns associated with the brand |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OK | &quot;OK&quot; |
| REGISTRATION_PENDING | &quot;REGISTRATION_PENDING&quot; |
| REGISTRATION_FAILED | &quot;REGISTRATION_FAILED&quot; |



