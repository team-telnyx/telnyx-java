

# MdrPostDetailReportRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startDate** | **OffsetDateTime** |  |  |
|**endDate** | **OffsetDateTime** |  |  |
|**directions** | [**List&lt;DirectionsEnum&gt;**](#List&lt;DirectionsEnum&gt;) |  |  [optional] |
|**recordTypes** | [**List&lt;RecordTypesEnum&gt;**](#List&lt;RecordTypesEnum&gt;) |  |  [optional] |
|**connections** | **List&lt;Long&gt;** |  |  [optional] |
|**reportName** | **String** |  |  [optional] |
|**includeMessageBody** | **Boolean** |  |  [optional] |
|**filters** | [**List&lt;Filter&gt;**](Filter.md) |  |  [optional] |
|**profiles** | **String** |  |  [optional] |



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



