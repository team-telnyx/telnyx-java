

# ExportPortoutsCSVReportFilters

The filters to apply to the export port-out CSV report.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**statusIn** | [**List&lt;StatusInEnum&gt;**](#List&lt;StatusInEnum&gt;) | The status of the port-outs to include in the report. |  [optional] |
|**customerReferenceIn** | **List&lt;String&gt;** | The customer reference of the port-outs to include in the report. |  [optional] |
|**endUserName** | **String** | The end user name of the port-outs to include in the report. |  [optional] |
|**phoneNumbersOverlaps** | **List&lt;String&gt;** | A list of phone numbers that the port-outs phone numbers must overlap with. |  [optional] |
|**createdAtLt** | **OffsetDateTime** | The date and time the port-out was created before. |  [optional] |
|**createdAtGt** | **OffsetDateTime** | The date and time the port-out was created after. |  [optional] |



## Enum: List&lt;StatusInEnum&gt;

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| AUTHORIZED | &quot;authorized&quot; |
| PORTED | &quot;ported&quot; |
| REJECTED | &quot;rejected&quot; |
| REJECTED_PENDING | &quot;rejected-pending&quot; |
| CANCELED | &quot;canceled&quot; |



