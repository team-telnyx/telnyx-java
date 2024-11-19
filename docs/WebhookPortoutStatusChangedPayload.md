

# WebhookPortoutStatusChangedPayload

The webhook payload for the portout.status_changed event

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Identifies the port out that was moved. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The new status of the port out. |  [optional] |
|**phoneNumbers** | **List&lt;String&gt;** | Phone numbers associated with this port-out order |  [optional] |
|**carrierName** | **String** | Carrier the number will be ported out to |  [optional] |
|**spid** | **String** | The new carrier SPID. |  [optional] |
|**userId** | **UUID** | Identifies the user that the port-out order belongs to. |  [optional] |
|**subscriberName** | **String** | The name of the port-out&#39;s end user. |  [optional] |
|**rejectionReason** | **String** | The reason why the order is being rejected by the user. If the order is authorized, this field can be left null |  [optional] |
|**attemptedPin** | **String** | The PIN that was attempted to be used to authorize the port out. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| AUTHORIZED | &quot;authorized&quot; |
| PORTED | &quot;ported&quot; |
| REJECTED | &quot;rejected&quot; |
| REJECTED_PENDING | &quot;rejected-pending&quot; |
| CANCELED | &quot;canceled&quot; |



