

# NotificationChannel

A Notification Channel

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | A UUID. |  [optional] [readonly]
**notificationProfileId** | **String** | A UUID reference to the associated Notification Profile. |  [optional]
**channelTypeId** | [**ChannelTypeIdEnum**](#ChannelTypeIdEnum) | A Channel Type ID |  [optional]
**channelDestination** | **String** | The destination associated with the channel type. |  [optional]
**createdAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was created. |  [optional] [readonly]
**updatedAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was updated. |  [optional] [readonly]



## Enum: ChannelTypeIdEnum

Name | Value
---- | -----
SMS | &quot;sms&quot;
VOICE | &quot;voice&quot;
EMAIL | &quot;email&quot;
WEBHOOK | &quot;webhook&quot;



