

# MessagingProfileHighLevelMetrics


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) | Identifies the type of the resource. |  [optional] [readonly]
**messagingProfileId** | **UUID** | Identifies the type of resource. |  [optional] [readonly]
**phoneNumbers** | **BigDecimal** | The number of phone numbers associated with the messaging profile. |  [optional] [readonly]
**outbound** | [**MessagingProfileHighLevelMetricsOutbound**](MessagingProfileHighLevelMetricsOutbound.md) |  |  [optional]
**inbound** | [**MessagingProfileHighLevelMetricsInbound**](MessagingProfileHighLevelMetricsInbound.md) |  |  [optional]



## Enum: RecordTypeEnum

Name | Value
---- | -----
MESSAGING_PROFILE_METRICS | &quot;messaging_profile_metrics&quot;



