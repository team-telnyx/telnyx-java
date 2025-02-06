

# SlimPhoneNumberDetailed


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Uniquely identifies the resource. |  [optional] |
|**recordType** | **String** | Identifies the type of the resource. |  [optional] [readonly] |
|**phoneNumber** | **String** | The +E.164-formatted phone number associated with this record. |  [optional] [readonly] |
|**countryIsoAlpha2** | **String** | The ISO 3166-1 alpha-2 country code of the phone number. |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | The phone number&#39;s current status. |  [optional] [readonly] |
|**externalPin** | **String** | If someone attempts to port your phone number away from Telnyx and your phone number has an external PIN set, Telnyx will attempt to verify that you provided the correct external PIN to the winning carrier. Note that not all carriers cooperate with this security mechanism. |  [optional] |
|**connectionId** | **String** | Identifies the connection associated with the phone number. |  [optional] |
|**customerReference** | **String** | A customer reference string for customer look ups. |  [optional] |
|**billingGroupId** | **String** | Identifies the billing group associated with the phone number. |  [optional] |
|**emergencyEnabled** | **Boolean** | Indicates whether emergency services are enabled for this number. |  [optional] [readonly] |
|**emergencyAddressId** | **String** | Identifies the emergency address associated with the phone number. |  [optional] [readonly] |
|**emergencyStatus** | [**EmergencyStatusEnum**](#EmergencyStatusEnum) | Indicates the status of the provisioning of emergency services for the phone number. This field contains information about activity that may be ongoing for a number where it either is being provisioned or deprovisioned but is not yet enabled/disabled. |  [optional] |
|**callForwardingEnabled** | **Boolean** | Indicates if call forwarding will be enabled for this number if forwards_to and forwarding_type are filled in. Defaults to true for backwards compatibility with APIV1 use of numbers endpoints. |  [optional] [readonly] |
|**cnamListingEnabled** | **Boolean** | Indicates whether a CNAM listing is enabled for this number. |  [optional] [readonly] |
|**callerIdNameEnabled** | **Boolean** | Indicates whether caller ID is enabled for this number. |  [optional] [readonly] |
|**callRecordingEnabled** | **Boolean** | Indicates whether call recording is enabled for this number. |  [optional] [readonly] |
|**t38FaxGatewayEnabled** | **Boolean** | Indicates whether T38 Fax Gateway for inbound calls to this number. |  [optional] [readonly] |
|**purchasedAt** | **String** | ISO 8601 formatted date indicating when the resource was purchased. |  [optional] [readonly] |
|**createdAt** | **String** | ISO 8601 formatted date indicating when the resource was created. |  [optional] [readonly] |
|**phoneNumberType** | [**PhoneNumberTypeEnum**](#PhoneNumberTypeEnum) | The phone number&#39;s type. Note: For numbers purchased prior to July 2023 or when fetching a number&#39;s details immediately after a purchase completes, the legacy values &#x60;tollfree&#x60;, &#x60;shortcode&#x60; or &#x60;longcode&#x60; may be returned instead. |  [optional] [readonly] |
|**inboundCallScreening** | [**InboundCallScreeningEnum**](#InboundCallScreeningEnum) | The inbound_call_screening setting is a phone number configuration option variable that allows users to configure their settings to block or flag fraudulent calls. It can be set to disabled, reject_calls, or flag_calls. This feature has an additional per-number monthly cost associated with it. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PURCHASE_PENDING | &quot;purchase-pending&quot; |
| PURCHASE_FAILED | &quot;purchase-failed&quot; |
| PORT_PENDING | &quot;port-pending&quot; |
| PORT_FAILED | &quot;port-failed&quot; |
| ACTIVE | &quot;active&quot; |
| DELETED | &quot;deleted&quot; |
| EMERGENCY_ONLY | &quot;emergency-only&quot; |
| PORTED_OUT | &quot;ported-out&quot; |
| PORT_OUT_PENDING | &quot;port-out-pending&quot; |
| REQUIREMENT_INFO_PENDING | &quot;requirement-info-pending&quot; |
| REQUIREMENT_INFO_UNDER_REVIEW | &quot;requirement-info-under-review&quot; |
| REQUIREMENT_INFO_EXCEPTION | &quot;requirement-info-exception&quot; |
| PROVISION_PENDING | &quot;provision-pending&quot; |



## Enum: EmergencyStatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| DEPROVISIONING | &quot;deprovisioning&quot; |
| DISABLED | &quot;disabled&quot; |
| PROVISIONING | &quot;provisioning&quot; |
| PROVISIONING_FAILED | &quot;provisioning-failed&quot; |



## Enum: PhoneNumberTypeEnum

| Name | Value |
|---- | -----|
| LOCAL | &quot;local&quot; |
| TOLL_FREE | &quot;toll_free&quot; |
| MOBILE | &quot;mobile&quot; |
| NATIONAL | &quot;national&quot; |
| SHARED_COST | &quot;shared_cost&quot; |
| LANDLINE | &quot;landline&quot; |
| TOLLFREE | &quot;tollfree&quot; |
| SHORTCODE | &quot;shortcode&quot; |
| LONGCODE | &quot;longcode&quot; |



## Enum: InboundCallScreeningEnum

| Name | Value |
|---- | -----|
| DISABLED | &quot;disabled&quot; |
| REJECT_CALLS | &quot;reject_calls&quot; |
| FLAG_CALLS | &quot;flag_calls&quot; |



