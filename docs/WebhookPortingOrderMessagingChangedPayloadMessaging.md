

# WebhookPortingOrderMessagingChangedPayloadMessaging

The messaging portability status of the porting order.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**messagingCapable** | **Boolean** | Indicates whether the porting order is messaging capable. |  [optional] |
|**enableMessaging** | **Boolean** | Indicates whether Telnyx will port messaging capabilities from the losing carrier. If false, any messaging capabilities will stay with their current provider. |  [optional] |
|**messagingPortStatus** | [**MessagingPortStatusEnum**](#MessagingPortStatusEnum) | Indicates the messaging port status of the porting order. |  [optional] |
|**messagingPortCompleted** | **Boolean** | Indicates whether the messaging port is completed. |  [optional] |



## Enum: MessagingPortStatusEnum

| Name | Value |
|---- | -----|
| NOT_APPLICABLE | &quot;not_applicable&quot; |
| PENDING | &quot;pending&quot; |
| ACTIVATING | &quot;activating&quot; |
| EXCEPTION | &quot;exception&quot; |
| CANCELED | &quot;canceled&quot; |
| PARTIAL_PORT_COMPLETE | &quot;partial_port_complete&quot; |
| PORTED | &quot;ported&quot; |



