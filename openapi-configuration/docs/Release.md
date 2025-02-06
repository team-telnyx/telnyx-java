

# Release


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ticketId** | **UUID** | Uniquely identifies the resource. |  [optional] |
|**tenantId** | **UUID** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Represents the status of the release on Microsoft Teams. |  [optional] |
|**errorMessage** | **String** | A message set if there is an error with the upload process. |  [optional] |
|**telephoneNumbers** | [**List&lt;TnReleaseEntry&gt;**](TnReleaseEntry.md) |  |  [optional] |
|**createdAt** | **String** | ISO 8601 formatted date indicating when the resource was created. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING_UPLOAD | &quot;pending_upload&quot; |
| PENDING | &quot;pending&quot; |
| IN_PROGRESS | &quot;in_progress&quot; |
| COMPLETE | &quot;complete&quot; |
| FAILED | &quot;failed&quot; |
| EXPIRED | &quot;expired&quot; |
| UNKNOWN | &quot;unknown&quot; |



