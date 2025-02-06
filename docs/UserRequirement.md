

# UserRequirement


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requirementId** | **String** |  |  [optional] |
|**fieldValue** | **String** |  |  [optional] |
|**fieldType** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**expiresAt** | **OffsetDateTime** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| APPROVED | &quot;approved&quot; |
| UNAPPROVED | &quot;unapproved&quot; |
| PENDING_APPROVAL | &quot;pending-approval&quot; |
| DECLINED | &quot;declined&quot; |



