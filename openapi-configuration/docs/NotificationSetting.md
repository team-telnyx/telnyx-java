

# NotificationSetting


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A UUID. |  [optional] [readonly] |
|**notificationEventConditionId** | **String** | A UUID reference to the associated Notification Event Condition. |  [optional] |
|**notificationProfileId** | **String** | A UUID reference to the associated Notification Profile. |  [optional] |
|**associatedRecordType** | **String** |  |  [optional] [readonly] |
|**associatedRecordTypeValue** | **String** |  |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | Most preferences apply immediately; however, other may needs to propagate. |  [optional] [readonly] |
|**notificationChannelId** | **String** | A UUID reference to the associated Notification Channel. |  [optional] |
|**parameters** | [**List&lt;NotificationSettingParametersInner&gt;**](NotificationSettingParametersInner.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was created. |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was updated. |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ENABLED | &quot;enabled&quot; |
| ENABLE_RECEIVED | &quot;enable-received&quot; |
| ENABLE_PENDING | &quot;enable-pending&quot; |
| ENABLE_SUBMTITED | &quot;enable-submtited&quot; |
| DELETE_RECEIVED | &quot;delete-received&quot; |
| DELETE_PENDING | &quot;delete-pending&quot; |
| DELETE_SUBMITTED | &quot;delete-submitted&quot; |
| DELETED | &quot;deleted&quot; |



