

# PortingPhoneNumber


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portingOrderStatus** | [**PortingOrderStatusEnum**](#PortingOrderStatusEnum) | The current status of the porting order |  [optional]
**phoneNumberType** | [**PhoneNumberTypeEnum**](#PhoneNumberTypeEnum) | The type of the phone number |  [optional]
**phoneNumber** | **String** | E164 formatted phone number |  [optional]
**portingOrderId** | **UUID** | Identifies the associated port request |  [optional]
**supportKey** | **String** | A key to reference this porting order when contacting Telnyx customer support |  [optional]
**activationStatus** | **PortingOrderActivationStatus** |  |  [optional]
**portabilityStatus** | **PortabilityStatus** |  |  [optional]
**requirementsStatus** | [**RequirementsStatusEnum**](#RequirementsStatusEnum) | The current status of the requirements in a INTL porting order |  [optional]
**recordType** | **String** | Identifies the type of the resource. |  [optional] [readonly]



## Enum: PortingOrderStatusEnum

Name | Value
---- | -----
DRAFT | &quot;draft&quot;
IN_PROCESS | &quot;in-process&quot;
SUBMITTED | &quot;submitted&quot;
EXCEPTION | &quot;exception&quot;
FOC_DATE_CONFIRMED | &quot;foc-date-confirmed&quot;
CANCEL_PENDING | &quot;cancel-pending&quot;
PORTED | &quot;ported&quot;
CANCELLED | &quot;cancelled&quot;



## Enum: PhoneNumberTypeEnum

Name | Value
---- | -----
LANDLINE | &quot;landline&quot;
LOCAL | &quot;local&quot;
MOBILE | &quot;mobile&quot;
NATIONAL | &quot;national&quot;
SHARED_COST | &quot;shared_cost&quot;
TOLL_FREE | &quot;toll_free&quot;



## Enum: RequirementsStatusEnum

Name | Value
---- | -----
REQUIREMENT_INFO_PENDING | &quot;requirement-info-pending&quot;
REQUIREMENT_INFO_UNDER_REVIEW | &quot;requirement-info-under-review&quot;
REQUIREMENT_INFO_EXCEPTION | &quot;requirement-info-exception&quot;
APPROVED | &quot;approved&quot;



