

# PortingOrderStatus

Porting order status

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**details** | [**List&lt;PortingOrdersExceptionType&gt;**](PortingOrdersExceptionType.md) | A list of 0 or more details about this porting order&#39;s status |  [optional] |
|**value** | [**ValueEnum**](#ValueEnum) | The current status of the porting order |  [optional] |



## Enum: ValueEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;draft&quot; |
| IN_PROCESS | &quot;in-process&quot; |
| SUBMITTED | &quot;submitted&quot; |
| EXCEPTION | &quot;exception&quot; |
| FOC_DATE_CONFIRMED | &quot;foc-date-confirmed&quot; |
| PORTED | &quot;ported&quot; |
| CANCELED | &quot;canceled&quot; |
| CANCEL_PENDING | &quot;cancel-pending&quot; |



