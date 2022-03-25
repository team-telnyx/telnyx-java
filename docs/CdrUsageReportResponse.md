

# CdrUsageReportResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Identifies the resource |  [optional]
**startTime** | **OffsetDateTime** |  |  [optional]
**endTime** | **OffsetDateTime** |  |  [optional]
**connections** | **List&lt;Long&gt;** |  |  [optional]
**aggregationType** | [**AggregationTypeEnum**](#AggregationTypeEnum) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**reportUrl** | **String** |  |  [optional]
**result** | **Object** |  |  [optional]
**createdAt** | **OffsetDateTime** |  |  [optional]
**updatedAt** | **OffsetDateTime** |  |  [optional]
**recordType** | **String** |  |  [optional]
**productBreakdown** | [**ProductBreakdownEnum**](#ProductBreakdownEnum) |  |  [optional]



## Enum: AggregationTypeEnum

Name | Value
---- | -----
NO_AGGREGATION | &quot;NO_AGGREGATION&quot;
CONNECTION | &quot;CONNECTION&quot;
TAG | &quot;TAG&quot;
BILLING_GROUP | &quot;BILLING_GROUP&quot;



## Enum: StatusEnum

Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
COMPLETE | &quot;COMPLETE&quot;
FAILED | &quot;FAILED&quot;
EXPIRED | &quot;EXPIRED&quot;



## Enum: ProductBreakdownEnum

Name | Value
---- | -----
NO_BREAKDOWN | &quot;NO_BREAKDOWN&quot;
DID_VS_TOLL_FREE | &quot;DID_VS_TOLL_FREE&quot;
COUNTRY | &quot;COUNTRY&quot;
DID_VS_TOLL_FREE_PER_COUNTRY | &quot;DID_VS_TOLL_FREE_PER_COUNTRY&quot;



