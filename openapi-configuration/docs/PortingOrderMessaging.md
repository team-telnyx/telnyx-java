

# PortingOrderMessaging

Information about messaging porting process.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**messagingCapable** | **Boolean** | Indicates whether the porting order can also port messaging capabilities. |  [optional] |
|**enableMessaging** | **Boolean** | Indicates whether Telnyx will port messaging capabilities from the losing carrier. If false, any messaging capabilities will stay with their current provider. |  [optional] |
|**messagingPortStatus** | [**MessagingPortStatusEnum**](#MessagingPortStatusEnum) | The current status of the messaging porting. |  [optional] |
|**messagingPortCompleted** | **Boolean** | Indicates whether the messaging porting has been completed. |  [optional] |



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



