

# MdrDetailReportResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Identifies the resource |  [optional] |
|**startDate** | **OffsetDateTime** |  |  [optional] |
|**endDate** | **OffsetDateTime** |  |  [optional] |
|**directions** | [**List&lt;DirectionsEnum&gt;**](#List&lt;DirectionsEnum&gt;) |  |  [optional] |
|**recordTypes** | [**List&lt;RecordTypesEnum&gt;**](#List&lt;RecordTypesEnum&gt;) |  |  [optional] |
|**connections** | **List&lt;Long&gt;** |  |  [optional] |
|**reportName** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**reportUrl** | **String** |  |  [optional] |
|**filters** | [**List&lt;Filter&gt;**](Filter.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**profiles** | **String** |  |  [optional] |
|**recordType** | **String** |  |  [optional] |



## Enum: List&lt;DirectionsEnum&gt;

| Name | Value |
|---- | -----|
| INBOUND | &quot;INBOUND&quot; |
| OUTBOUND | &quot;OUTBOUND&quot; |



## Enum: List&lt;RecordTypesEnum&gt;

| Name | Value |
|---- | -----|
| INCOMPLETE | &quot;INCOMPLETE&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| ERRORS | &quot;ERRORS&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| COMPLETE | &quot;COMPLETE&quot; |
| FAILED | &quot;FAILED&quot; |
| EXPIRED | &quot;EXPIRED&quot; |



