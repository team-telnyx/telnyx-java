

# CsvDownload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifies the resource. |  [optional] [readonly]
**recordType** | **String** | Identifies the type of the resource. |  [optional] [readonly]
**url** | **String** | The URL at which the CSV file can be retrieved. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Indicates the completion level of the CSV report. Only complete CSV download requests will be able to be retrieved. |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
PENDING | &quot;pending&quot;
COMPLETE | &quot;complete&quot;
FAILED | &quot;failed&quot;
EXPIRED | &quot;expired&quot;



