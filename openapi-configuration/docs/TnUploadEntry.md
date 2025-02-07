

# TnUploadEntry


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**numberId** | **UUID** | Uniquely identifies the resource. |  [optional] |
|**phoneNumber** | **String** | Phone number in E164 format. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Represents the status of the phone number entry upload on Microsoft Teams. |  [optional] |
|**errorCode** | [**ErrorCodeEnum**](#ErrorCodeEnum) | A code returned by Microsoft Teams if there is an error with the phone number entry upload. |  [optional] |
|**errorMessage** | **String** | A message returned by Microsoft Teams if there is an error with the upload process. |  [optional] |
|**civicAddressId** | **UUID** | Identifies the civic address assigned to the phone number entry. |  [optional] |
|**locationId** | **UUID** | Identifies the location assigned to the phone number entry. |  [optional] |
|**internalStatus** | [**InternalStatusEnum**](#InternalStatusEnum) | Represents the status of the phone number entry upload on Telnyx. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING_UPLOAD | &quot;pending_upload&quot; |
| PENDING | &quot;pending&quot; |
| IN_PROGRESS | &quot;in_progress&quot; |
| SUCCESS | &quot;success&quot; |
| ERROR | &quot;error&quot; |



## Enum: ErrorCodeEnum

| Name | Value |
|---- | -----|
| INTERNAL_ERROR | &quot;internal_error&quot; |
| UNABLE_TO_RETRIEVE_DEFAULT_LOCATION | &quot;unable_to_retrieve_default_location&quot; |
| UNKNOWN_COUNTRY_CODE | &quot;unknown_country_code&quot; |
| UNABLE_TO_RETRIEVE_LOCATION | &quot;unable_to_retrieve_location&quot; |
| UNABLE_TO_RETRIEVE_PARTNER_INFO | &quot;unable_to_retrieve_partner_info&quot; |
| UNABLE_TO_MATCH_GEOGRAPHY_ENTRY | &quot;unable_to_match_geography_entry&quot; |



## Enum: InternalStatusEnum

| Name | Value |
|---- | -----|
| PENDING_ASSIGNMENT | &quot;pending_assignment&quot; |
| IN_PROGRESS | &quot;in_progress&quot; |
| ALL_INTERNAL_JOBS_COMPLETED | &quot;all_internal_jobs_completed&quot; |
| RELEASE_REQUESTED | &quot;release_requested&quot; |
| RELEASE_COMPLETED | &quot;release_completed&quot; |
| ERROR | &quot;error&quot; |



