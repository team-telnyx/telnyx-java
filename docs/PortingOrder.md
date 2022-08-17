

# PortingOrder


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Uniquely identifies this porting order |  [optional] [readonly] |
|**customerReference** | **String** | A customer-specified reference number for customer bookkeeping purposes |  [optional] |
|**createdAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was created. |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was created. |  [optional] [readonly] |
|**status** | [**PortingOrderStatus**](PortingOrderStatus.md) |  |  [optional] |
|**supportKey** | **String** | A key to reference this porting order when contacting Telnyx customer support. This information is not available in draft porting orders. |  [optional] [readonly] |
|**parentSupportKey** | **String** | A key to reference for the porting order group when contacting Telnyx customer support. This information is not available for porting orders in &#x60;draft&#x60; state |  [optional] [readonly] |
|**portingPhoneNumbersCount** | **Integer** | Count of phone numbers associated with this porting order |  [optional] [readonly] |
|**oldServiceProviderOcn** | **String** | Identifies the old service provider |  [optional] [readonly] |
|**documents** | [**PortingOrderDocuments**](PortingOrderDocuments.md) |  |  [optional] |
|**misc** | [**PortingOrderMisc**](PortingOrderMisc.md) |  |  [optional] |
|**endUser** | [**PortingOrderEndUser**](PortingOrderEndUser.md) |  |  [optional] |
|**activationSettings** | [**PortingOrderActivationSettings**](PortingOrderActivationSettings.md) |  |  [optional] |
|**phoneNumberConfiguration** | [**PortingOrderPhoneNumberConfiguration**](PortingOrderPhoneNumberConfiguration.md) |  |  [optional] |
|**phoneNumberType** | [**PhoneNumberTypeEnum**](#PhoneNumberTypeEnum) | The type of the phone number |  [optional] |
|**description** | **String** | A description of the porting order |  [optional] [readonly] |
|**requirements** | [**List&lt;PortingOrderRequirement&gt;**](PortingOrderRequirement.md) | List of documentation requirements for porting numbers. |  [optional] |
|**requirementsMet** | **Boolean** | Is true when the required documentation is met |  [optional] |
|**userFeedback** | [**PortingOrderUserFeedback**](PortingOrderUserFeedback.md) |  |  [optional] |
|**userId** | **UUID** | Identifies the user (or organization) who requested the porting order |  [optional] |
|**webhookUrl** | **URI** |  |  [optional] |
|**recordType** | **String** | Identifies the type of the resource. |  [optional] [readonly] |



## Enum: PhoneNumberTypeEnum

| Name | Value |
|---- | -----|
| LANDLINE | &quot;landline&quot; |
| LOCAL | &quot;local&quot; |
| MOBILE | &quot;mobile&quot; |
| NATIONAL | &quot;national&quot; |
| SHARED_COST | &quot;shared_cost&quot; |
| TOLL_FREE | &quot;toll_free&quot; |



