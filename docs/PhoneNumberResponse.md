# PhoneNumberResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**recordType** | **String** | Identifies the type of the resource. |  [optional]
**phoneNumber** | **String** | The +E.164-formatted phone number associated with this record |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The phone number&#x27;s current status |  [optional]
**tags** | **List&lt;String&gt;** | A list of user-assigned tags to help manage the phone number. |  [optional]
**externalPin** | **String** | If someone attempts to port your phone number away from Telnyx and your phone number has an external PIN set, Telnyx will attempt to verify that you provided the correct external PIN to the winning carrier. Note that not all carriers cooperate with this security mechanism. |  [optional]
**connectionName** | **String** | The user-assigned name of the connection to be associated with this phone number. |  [optional]
**connectionId** | **String** | Identifies the connection associated with the phone number. |  [optional]
**messagingProfileId** | **String** | Identifies the messaging profile associated with the phone number. |  [optional]
**messagingProfileName** | **String** | The name of the messaging profile associated with the phone number. |  [optional]
**billingGroupId** | **String** | Identifies the billing group associated with the phone number. |  [optional]
**emergencyEnabled** | **Boolean** | Indicates whether emergency services are enabled for this number. |  [optional]
**emergencyAddressId** | **String** | Identifies the emergency address associated with the phone number. |  [optional]
**callForwardingEnabled** | **Boolean** | Indicates if call forwarding will be enabled for this number if forwards_to and forwarding_type are filled in. Defaults to true for backwards compatibility with APIV1 use of numbers endpoints. |  [optional]
**cnamListingEnabled** | **Boolean** | Indicates whether a CNAM listing is enabled for this number. |  [optional]
**callerIdNameEnabled** | **Boolean** | Indicates whether caller ID is enabled for this number. |  [optional]
**callRecordingEnabled** | **Boolean** | Indicates whether call recording is enabled for this number. |  [optional]
**t38FaxGatewayEnabled** | **Boolean** | Indicates whether T38 Fax Gateway for inbound calls to this number. |  [optional]
**purchasedAt** | **String** | ISO 8601 formatted date indicating when the resource was purchased. |  [optional]
**createdAt** | **String** | ISO 8601 formatted date indicating when the resource was created. |  [optional]
**updatedAt** | **String** | ISO 8601 formatted date indicating when the resource was updated. |  [optional]

<a name="StatusEnum"></a>
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
