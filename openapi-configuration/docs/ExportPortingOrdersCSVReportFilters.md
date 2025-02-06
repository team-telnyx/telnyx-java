

# ExportPortingOrdersCSVReportFilters

The filters to apply to the export porting order CSV report.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**statusIn** | [**List&lt;StatusInEnum&gt;**](#List&lt;StatusInEnum&gt;) | The status of the porting orders to include in the report. |  [optional] |
|**customerReferenceIn** | **List&lt;String&gt;** | The customer reference of the porting orders to include in the report. |  [optional] |
|**createdAtLt** | **OffsetDateTime** | The date and time the porting order was created before. |  [optional] |
|**createdAtGt** | **OffsetDateTime** | The date and time the porting order was created after. |  [optional] |



## Enum: List&lt;StatusInEnum&gt;

| Name | Value |
|---- | -----|
| DRAFT | &quot;draft&quot; |
| IN_PROCESS | &quot;in-process&quot; |
| SUBMITTED | &quot;submitted&quot; |
| EXCEPTION | &quot;exception&quot; |
| FOC_DATE_CONFIRMED | &quot;foc-date-confirmed&quot; |
| CANCEL_PENDING | &quot;cancel-pending&quot; |
| PORTED | &quot;ported&quot; |
| CANCELLED | &quot;cancelled&quot; |



