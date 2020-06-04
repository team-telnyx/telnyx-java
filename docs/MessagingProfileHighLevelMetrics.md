# MessagingProfileHighLevelMetrics

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) | Identifies the type of the resource. |  [optional]
**messagingProfileId** | [**UUID**](UUID.md) | Identifies the type of resource. |  [optional]
**phoneNumbers** | [**BigDecimal**](BigDecimal.md) | The number of phone numbers associated with the messaging profile. |  [optional]
**outbound** | [**MessagingProfileHighLevelMetricsOutbound**](MessagingProfileHighLevelMetricsOutbound.md) |  |  [optional]
**inbound** | [**MessagingProfileHighLevelMetricsInbound**](MessagingProfileHighLevelMetricsInbound.md) |  |  [optional]

<a name="RecordTypeEnum"></a>
## Enum: RecordTypeEnum
Name | Value
---- | -----
METRICS | &quot;messaging_profile_metrics&quot;
