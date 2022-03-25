

# EmergencySettings

The emergency services settings for a phone number.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**emergencyEnabled** | **Boolean** | Allows you to enable or disable emergency services on the phone number. In order to enable emergency services, you must also set an emergency_address_id. |  [optional]
**emergencyAddressId** | **String** | Identifies the address to be used with emergency services. |  [optional]
**emergencyStatus** | [**EmergencyStatusEnum**](#EmergencyStatusEnum) | Represents the state of the number regarding emergency activation. |  [optional]



## Enum: EmergencyStatusEnum

Name | Value
---- | -----
DISABLED | &quot;disabled&quot;
ACTIVE | &quot;active&quot;
PROVISIONING | &quot;provisioning&quot;
DEPROVISIONING | &quot;deprovisioning&quot;



