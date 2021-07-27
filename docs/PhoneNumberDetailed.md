

# PhoneNumberDetailed

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifies the resource. |  [optional] [readonly]
**recordType** | **String** | Identifies the type of the resource. |  [optional] [readonly]
**phoneNumber** | **String** | The +E.164-formatted phone number associated with this record. |  [optional] [readonly]
**status** | [**StatusEnum**](#StatusEnum) | The phone number&#39;s current status. |  [optional] [readonly]
**tags** | **List&lt;String&gt;** | A list of user-assigned tags to help manage the phone number. |  [optional]
**externalPin** | **String** | If someone attempts to port your phone number away from Telnyx and your phone number has an external PIN set, Telnyx will attempt to verify that you provided the correct external PIN to the winning carrier. Note that not all carriers cooperate with this security mechanism. |  [optional]
**connectionName** | **String** | The user-assigned name of the connection to be associated with this phone number. |  [optional] [readonly]
**customerReference** | **String** | A customer reference string for customer look ups. |  [optional]
**connectionId** | **String** | Identifies the connection associated with the phone number. |  [optional]
**messagingProfileId** | **String** | Identifies the messaging profile associated with the phone number. |  [optional]
**messagingProfileName** | **String** | The name of the messaging profile associated with the phone number. |  [optional]
**billingGroupId** | **String** | Identifies the billing group associated with the phone number. |  [optional]
**emergencyEnabled** | **Boolean** | Indicates whether emergency services are enabled for this number. |  [optional] [readonly]
**emergencyAddressId** | **String** | Identifies the emergency address associated with the phone number. |  [optional] [readonly]
**callForwardingEnabled** | **Boolean** | Indicates if call forwarding will be enabled for this number if forwards_to and forwarding_type are filled in. Defaults to true for backwards compatibility with APIV1 use of numbers endpoints. |  [optional] [readonly]
**cnamListingEnabled** | **Boolean** | Indicates whether a CNAM listing is enabled for this number. |  [optional] [readonly]
**callerIdNameEnabled** | **Boolean** | Indicates whether caller ID is enabled for this number. |  [optional] [readonly]
**callRecordingEnabled** | **Boolean** | Indicates whether call recording is enabled for this number. |  [optional] [readonly]
**t38FaxGatewayEnabled** | **Boolean** | Indicates whether T38 Fax Gateway for inbound calls to this number. |  [optional] [readonly]
**phoneNumberType** | [**PhoneNumberTypeEnum**](#PhoneNumberTypeEnum) | The phone number&#39;s type. |  [optional] [readonly]
**purchasedAt** | **String** | ISO 8601 formatted date indicating when the resource was purchased. |  [optional] [readonly]
**createdAt** | **String** | ISO 8601 formatted date indicating when the resource was created. |  [optional] [readonly]



## Enum: StatusEnum

Name | Value
---- | -----
PURCHASE_PENDING | &quot;purchase-pending&quot;
PURCHASE_FAILED | &quot;purchase-failed&quot;
PORT_PENDING | &quot;port-pending&quot;
PORT_FAILED | &quot;port-failed&quot;
ACTIVE | &quot;active&quot;
DELETED | &quot;deleted&quot;
EMERGENCY_ONLY | &quot;emergency-only&quot;
PORTED_OUT | &quot;ported-out&quot;
PORT_OUT_PENDING | &quot;port-out-pending&quot;



## Enum: PhoneNumberTypeEnum

Name | Value
---- | -----
LONGCODE | &quot;longcode&quot;
TOLLFREE | &quot;tollfree&quot;



