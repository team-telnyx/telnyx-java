# CallForwarding

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callForwardingEnabled** | **Boolean** | Indicates if call forwarding will be enabled for this number if forwards_to and forwarding_type are filled in. Defaults to true for backwards compatibility with APIV1 use of numbers endpoints. |  [optional]
**forwardsTo** | **String** | The phone number to which inbound calls to this number are forwarded. Inbound calls will not be forwarded if this field is left blank. If set, must be a +E.164-formatted phone number. |  [optional]
**forwardingType** | [**ForwardingTypeEnum**](#ForwardingTypeEnum) | Call forwarding type. &#x27;forwards_to&#x27; must be set for this to have an effect. |  [optional]

<a name="ForwardingTypeEnum"></a>
## Enum: ForwardingTypeEnum
Name | Value
---- | -----
ALWAYS | &quot;always&quot;
ON_FAILURE | &quot;on_failure&quot;
