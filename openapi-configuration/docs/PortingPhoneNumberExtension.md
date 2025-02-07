

# PortingPhoneNumberExtension


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Uniquely identifies this porting phone number extension. |  [optional] [readonly] |
|**portingPhoneNumberId** | **UUID** | Identifies the porting phone number associated with this porting phone number extension. |  [optional] |
|**extensionRange** | [**PortingPhoneNumberExtensionExtensionRange**](PortingPhoneNumberExtensionExtensionRange.md) |  |  [optional] |
|**activationRanges** | [**List&lt;PortingPhoneNumberExtensionActivationRangesInner&gt;**](PortingPhoneNumberExtensionActivationRangesInner.md) | Specifies the activation ranges for this porting phone number extension. The activation range must be within the extension range and should not overlap with other activation ranges. |  [optional] |
|**recordType** | **String** | Identifies the type of the resource. |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was created. |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was last updated. |  [optional] [readonly] |



