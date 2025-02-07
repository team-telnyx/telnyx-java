

# PortoutReport


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Uniquely identifies the report. |  [optional] |
|**reportType** | [**ReportTypeEnum**](#ReportTypeEnum) | Identifies the type of report |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The current status of the report generation. |  [optional] |
|**params** | [**CreatePortoutReportRequestParams**](CreatePortoutReportRequestParams.md) |  |  [optional] |
|**documentId** | **UUID** | Identifies the document that was uploaded when report was generated. This field is only populated when the report is under completed status. |  [optional] |
|**recordType** | **String** | Identifies the type of the resource. |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was created. |  [optional] |
|**updatedAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was updated. |  [optional] |



## Enum: ReportTypeEnum

| Name | Value |
|---- | -----|
| EXPORT_PORTOUTS_CSV | &quot;export_portouts_csv&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| COMPLETED | &quot;completed&quot; |



