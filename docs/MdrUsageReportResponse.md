

# MdrUsageReportResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Identifies the resource |  [optional] |
|**startDate** | **OffsetDateTime** |  |  [optional] |
|**endDate** | **OffsetDateTime** |  |  [optional] |
|**connections** | **List&lt;Long&gt;** |  |  [optional] |
|**aggregationType** | [**AggregationTypeEnum**](#AggregationTypeEnum) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**reportUrl** | **String** |  |  [optional] |
|**result** | [**List&lt;MdrUsageRecord&gt;**](MdrUsageRecord.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**profiles** | **String** |  |  [optional] |
|**recordType** | **String** |  |  [optional] |



## Enum: AggregationTypeEnum

| Name | Value |
|---- | -----|
| NO_AGGREGATION | &quot;NO_AGGREGATION&quot; |
| PROFILE | &quot;PROFILE&quot; |
| TAGS | &quot;TAGS&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| COMPLETE | &quot;COMPLETE&quot; |
| FAILED | &quot;FAILED&quot; |
| EXPIRED | &quot;EXPIRED&quot; |



