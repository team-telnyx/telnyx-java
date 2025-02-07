

# UpdatePortingOrder


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**misc** | [**PortingOrderMisc**](PortingOrderMisc.md) |  |  [optional] |
|**endUser** | [**PortingOrderEndUser**](PortingOrderEndUser.md) |  |  [optional] |
|**documents** | [**PortingOrderDocuments**](PortingOrderDocuments.md) |  |  [optional] |
|**activationSettings** | [**UpdatePortingOrderActivationSettings**](UpdatePortingOrderActivationSettings.md) |  |  [optional] |
|**phoneNumberConfiguration** | [**PortingOrderPhoneNumberConfiguration**](PortingOrderPhoneNumberConfiguration.md) |  |  [optional] |
|**requirementGroupId** | **UUID** | If present, we will read the current values from the specified Requirement Group into the Documents and Requirements for this Porting Order. Note that any future changes in the Requirement Group would have no impact on this Porting Order. We will return an error if a specified Requirement Group conflicts with documents or requirements in the same request. |  [optional] |
|**requirements** | [**List&lt;UpdatePortingOrderRequirement&gt;**](UpdatePortingOrderRequirement.md) | List of requirements for porting numbers.  |  [optional] |
|**userFeedback** | [**PortingOrderUserFeedback**](PortingOrderUserFeedback.md) |  |  [optional] |
|**webhookUrl** | **URI** |  |  [optional] |
|**customerReference** | **String** |  |  [optional] |
|**messaging** | [**UpdatePortingOrderMessaging**](UpdatePortingOrderMessaging.md) |  |  [optional] |



