

# BrandResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entityType** | **EntityType** |  |  |
|**cspId** | **String** | Unique identifier assigned to the csp by the registry. |  [optional] |
|**brandId** | **String** | Unique identifier assigned to the brand. |  [optional] |
|**displayName** | **String** | Display or marketing name of the brand. |  |
|**companyName** | **String** | (Required for Non-profit/private/public) Legal company name. |  [optional] |
|**ein** | **String** | (Required for Non-profit/private/public) Government assigned corporate tax ID. EIN is 9-digits in U.S. The only entity type which does not require an EIN is a Sole Proprietor. |  [optional] |
|**phone** | **String** | Valid phone number in e.164 international format. |  [optional] |
|**street** | **String** | Street number and name. |  [optional] |
|**city** | **String** | City name |  [optional] |
|**state** | **String** | State. Must be 2 letters code for United States. |  [optional] |
|**postalCode** | **String** | Postal codes. Use 5 digit zipcode for United States |  [optional] |
|**country** | **String** | ISO2 2 characters country code. Example: US - United States |  |
|**email** | **String** | Valid email address of brand support contact. |  |
|**stockSymbol** | **String** | (Required for public company) stock symbol. |  [optional] |
|**stockExchange** | **StockExchange** |  |  [optional] |
|**ipAddress** | **String** | IP address of the browser requesting to create brand identity. |  [optional] |
|**website** | **String** | Brand website URL. |  [optional] |
|**brandRelationship** | **BrandRelationship** |  |  [optional] |
|**vertical** | **Vertical** |  |  |
|**altBusinessId** | **String** | Alternate business identifier such as DUNS, LEI, or GIIN |  [optional] |
|**altBusinessIdType** | **AltBusinessIdType** |  |  [optional] |
|**universalEin** | **String** | Universal EIN of Brand, Read Only. |  [optional] |
|**identityStatus** | **String** | TCR assessment of the brand identification status. |  [optional] |



