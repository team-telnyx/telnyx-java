

# PhoneNumberCampaign


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**phoneNumber** | **String** |  |  |
|**brandId** | **String** | Brand ID. Empty if the number is associated to a shared campaign. |  [optional] |
|**tcrBrandId** | **String** | TCR&#39;s alphanumeric ID for the brand. |  [optional] |
|**campaignId** | **String** | For shared campaigns, this is the TCR campaign ID, otherwise it is the campaign ID  |  |
|**tcrCampaignId** | **String** | TCR&#39;s alphanumeric ID for the campaign. |  [optional] |
|**telnyxCampaignId** | **String** | Campaign ID. Empty if the number is associated to a shared campaign. |  [optional] |
|**assignmentStatus** | [**AssignmentStatusEnum**](#AssignmentStatusEnum) | The assignment status of the number. |  [optional] |
|**failureReasons** | **Object** | Extra info about a failure to assign/unassign a number. Relevant only if the assignmentStatus is either FAILED_ASSIGNMENT or FAILED_UNASSIGNMENT |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: AssignmentStatusEnum

| Name | Value |
|---- | -----|
| FAILED_ASSIGNMENT | &quot;FAILED_ASSIGNMENT&quot; |
| PENDING_ASSIGNMENT | &quot;PENDING_ASSIGNMENT&quot; |
| ASSIGNED | &quot;ASSIGNED&quot; |
| PENDING_UNASSIGNMENT | &quot;PENDING_UNASSIGNMENT&quot; |
| FAILED_UNASSIGNMENT | &quot;FAILED_UNASSIGNMENT&quot; |



