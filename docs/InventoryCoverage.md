

# InventoryCoverage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**group** | **String** |  |  [optional]
**groupType** | **String** |  |  [optional]
**numberRange** | **Integer** |  |  [optional]
**numberType** | [**NumberTypeEnum**](#NumberTypeEnum) |  |  [optional]
**phoneNumberType** | [**PhoneNumberTypeEnum**](#PhoneNumberTypeEnum) |  |  [optional]
**coverageType** | [**CoverageTypeEnum**](#CoverageTypeEnum) |  |  [optional]
**recordType** | **String** |  |  [optional]
**count** | **Integer** |  |  [optional]



## Enum: NumberTypeEnum

Name | Value
---- | -----
DID | &quot;did&quot;
TOLL_FREE | &quot;toll-free&quot;



## Enum: PhoneNumberTypeEnum

Name | Value
---- | -----
LOCAL | &quot;local&quot;
TOLL_FREE | &quot;toll_free&quot;
NATIONAL | &quot;national&quot;
LANDLINE | &quot;landline&quot;
SHARED_COST | &quot;shared_cost&quot;
MOBILE | &quot;mobile&quot;



## Enum: CoverageTypeEnum

Name | Value
---- | -----
NUMBER | &quot;number&quot;
BLOCK | &quot;block&quot;



