

# ExternalConnectionPhoneNumber


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ticketId** | **UUID** | Uniquely identifies the resource. |  [optional] |
|**telephoneNumber** | **String** | Phone number in E164 format. |  [optional] |
|**numberId** | **String** | Phone number ID from the Telnyx API. |  [optional] |
|**civicAddressId** | **UUID** | Identifies the civic address assigned to the phone number. |  [optional] |
|**locationId** | **UUID** | Identifies the location assigned to the phone number. |  [optional] |
|**displayedCountryCode** | **String** | The iso country code that will be displayed to the user when they receive a call from this phone number. |  [optional] |
|**acquiredCapabilities** | [**List&lt;AcquiredCapabilitiesEnum&gt;**](#List&lt;AcquiredCapabilitiesEnum&gt;) |  |  [optional] |



## Enum: List&lt;AcquiredCapabilitiesEnum&gt;

| Name | Value |
|---- | -----|
| FIRST_PARTY_APP_ASSIGNMENT | &quot;FirstPartyAppAssignment&quot; |
| INBOUND_CALLING | &quot;InboundCalling&quot; |
| OFFICE365 | &quot;Office365&quot; |
| OUTBOUND_CALLING | &quot;OutboundCalling&quot; |
| USER_ASSIGNMENT | &quot;UserAssignment&quot; |



