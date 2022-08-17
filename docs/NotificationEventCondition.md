

# NotificationEventCondition


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A UUID. |  [optional] [readonly] |
|**name** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**notificationEventId** | **String** |  |  [optional] |
|**associatedRecordType** | [**AssociatedRecordTypeEnum**](#AssociatedRecordTypeEnum) |  |  [optional] |
|**parameters** | [**List&lt;NotificationEventConditionParametersInner&gt;**](NotificationEventConditionParametersInner.md) |  |  [optional] |
|**enabled** | **Boolean** |  |  [optional] |
|**allowMultipleChannels** | **Boolean** | Dictates whether a notification channel id needs to be provided when creating a notficiation setting. |  [optional] |
|**asynchronous** | **Boolean** | Dictates whether a notification setting will take effect immediately. |  [optional] |
|**supportedChannels** | **List&lt;String&gt;** | Dictates the supported notification channel types that can be emitted. |  [optional] |
|**createdAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was created. |  [optional] |
|**updatedAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was updated. |  [optional] |



## Enum: AssociatedRecordTypeEnum

| Name | Value |
|---- | -----|
| ACCOUNT | &quot;account&quot; |
| PHONE_NUMBER | &quot;phone_number&quot; |



