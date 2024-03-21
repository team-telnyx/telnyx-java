

# Upload


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ticketId** | **UUID** | Uniquely identifies the resource. |  [optional] |
|**tenantId** | **UUID** |  |  [optional] |
|**locationId** | **UUID** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Represents the status of the upload on Microsoft Teams. |  [optional] |
|**availableUsages** | [**List&lt;AvailableUsagesEnum&gt;**](#List&lt;AvailableUsagesEnum&gt;) |  |  [optional] |
|**errorCode** | **String** | A code returned by Microsoft Teams if there is an error with the upload process. |  [optional] |
|**errorMessage** | **String** | A message set if there is an error with the upload process. |  [optional] |
|**tnUploadEntries** | [**List&lt;TnUploadEntry&gt;**](TnUploadEntry.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING_UPLOAD | &quot;pending_upload&quot; |
| PENDING | &quot;pending&quot; |
| IN_PROGRESS | &quot;in_progress&quot; |
| PARTIAL_SUCCESS | &quot;partial_success&quot; |
| SUCCESS | &quot;success&quot; |
| ERROR | &quot;error&quot; |



## Enum: List&lt;AvailableUsagesEnum&gt;

| Name | Value |
|---- | -----|
| CALLING_USER_ASSIGNMENT | &quot;calling_user_assignment&quot; |
| FIRST_PARTY_APP_ASSIGNMENT | &quot;first_party_app_assignment&quot; |



