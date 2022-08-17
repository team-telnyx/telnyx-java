

# DynamicEmergencyAddress


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] [readonly] |
|**recordType** | **String** | Identifies the type of the resource. |  [optional] [readonly] |
|**sipGeolocationId** | **String** | Unique location reference string to be used in SIP INVITE from / p-asserted headers. |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of dynamic emergency address |  [optional] [readonly] |
|**houseNumber** | **String** |  |  |
|**houseSuffix** | **String** |  |  [optional] |
|**streetPreDirectional** | **String** |  |  [optional] |
|**streetName** | **String** |  |  |
|**streetSuffix** | **String** |  |  [optional] |
|**streetPostDirectional** | **String** |  |  [optional] |
|**extendedAddress** | **String** |  |  [optional] |
|**locality** | **String** |  |  |
|**administrativeArea** | **String** |  |  |
|**postalCode** | **String** |  |  |
|**countryCode** | [**CountryCodeEnum**](#CountryCodeEnum) |  |  [optional] |
|**createdAt** | **String** | ISO 8601 formatted date of when the resource was created |  [optional] [readonly] |
|**updatedAt** | **String** | ISO 8601 formatted date of when the resource was last updated |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| ACTIVATED | &quot;activated&quot; |
| REJECTED | &quot;rejected&quot; |



## Enum: CountryCodeEnum

| Name | Value |
|---- | -----|
| US | &quot;US&quot; |
| CA | &quot;CA&quot; |
| PR | &quot;PR&quot; |



