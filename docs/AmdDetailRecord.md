

# AmdDetailRecord


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Feature invocation id |  [optional] |
|**invokedAt** | **OffsetDateTime** | Feature invocation time |  [optional] |
|**feature** | [**FeatureEnum**](#FeatureEnum) | Feature name |  [optional] |
|**tags** | **String** | User-provided tags |  [optional] |
|**billingGroupId** | **String** | Billing Group id |  [optional] |
|**billingGroupName** | **String** | Name of the Billing Group specified in billing_group_id |  [optional] |
|**connectionId** | **String** | Connection id |  [optional] |
|**connectionName** | **String** | Connection name |  [optional] |
|**callLegId** | **String** | Telnyx UUID that identifies the related call leg |  [optional] |
|**callSessionId** | **String** | Telnyx UUID that identifies the related call session |  [optional] |
|**isTelnyxBillable** | **Boolean** | Indicates whether Telnyx billing charges might be applicable |  [optional] |
|**rate** | **String** | Currency amount per billing unit used to calculate the Telnyx billing cost |  [optional] |
|**rateMeasuredIn** | **String** | Billing unit used to calculate the Telnyx billing cost |  [optional] |
|**cost** | **String** | Currency amount for Telnyx billing cost |  [optional] |
|**currency** | **String** | Telnyx account currency used to describe monetary values, including billing cost |  [optional] |
|**recordType** | **String** |  |  |



## Enum: FeatureEnum

| Name | Value |
|---- | -----|
| PREMIUM | &quot;PREMIUM&quot; |



