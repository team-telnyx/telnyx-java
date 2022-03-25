

# DocReqsRequirement


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | **String** | Identifies the type of the resource. |  [optional] [readonly]
**countryCode** | **String** | The 2-character (ISO 3166-1 alpha-2) country code where this requirement applies |  [optional]
**locality** | **String** | The locality where this requirement applies |  [optional]
**phoneNumberType** | [**PhoneNumberTypeEnum**](#PhoneNumberTypeEnum) | Indicates the phone_number_type this requirement applies to. Leave blank if this requirement applies to all number_types. |  [optional]
**action** | [**ActionEnum**](#ActionEnum) | Indicates whether this requirement applies to ordering, porting, or both |  [optional]
**requirementsTypes** | [**List&lt;DocReqsRequirementType&gt;**](DocReqsRequirementType.md) | Lists the requirement types necessary to fulfill this requirement |  [optional] [readonly]
**id** | **UUID** | Identifies the associated document |  [optional] [readonly]
**createdAt** | **String** | ISO 8601 formatted date-time indicating when the resource was created. |  [optional] [readonly]
**updatedAt** | **String** | ISO 8601 formatted date-time indicating when the resource was last updated. |  [optional] [readonly]



## Enum: PhoneNumberTypeEnum

Name | Value
---- | -----
LOCAL | &quot;local&quot;
NATIONAL | &quot;national&quot;
TOLL_FREE | &quot;toll_free&quot;



## Enum: ActionEnum

Name | Value
---- | -----
BOTH | &quot;both&quot;
ORDERING | &quot;ordering&quot;
PORTING | &quot;porting&quot;



