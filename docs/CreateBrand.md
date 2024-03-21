

# CreateBrand


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entityType** | **EntityType** | Entity type behind the brand. This is the form of business establishment. |  |
|**displayName** | **String** | Display name, marketing name, or DBA name of the brand. |  |
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
|**vertical** | **Vertical** | Vertical or industry segment of the brand. |  |
|**isReseller** | **Boolean** |  |  [optional] |
|**mock** | **Boolean** | Mock brand for testing purposes |  [optional] |
|**mobilePhone** | **String** | Valid mobile phone number in e.164 international format. |  [optional] |



