

# VerifiedCallsDisplayProfilePhoneNumbersInner

A Phone Number that can make phone calls displaying the configured brand information

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recordType** | **String** |  |  [optional] [readonly] |
|**id** | **UUID** |  |  [optional] [readonly] |
|**phoneNumber** | **String** | The phone number in e164 format |  [optional] |
|**googleVerificationStatus** | [**GoogleVerificationStatusEnum**](#GoogleVerificationStatusEnum) | The approval status of this individual phone number in Google |  [optional] [readonly] |
|**googleApprovalInfo** | **String** | Additional information about the decision, if available. |  [optional] [readonly] |
|**displayProfileId** | **UUID** |  |  [optional] [readonly] |
|**delete** | **Boolean** | Marks the Phone Number to be removed from the Display Profile |  [optional] |



## Enum: GoogleVerificationStatusEnum

| Name | Value |
|---- | -----|
| STATE_UNSPECIFIED | &quot;STATE_UNSPECIFIED&quot; |
| PENDING_APPROVAL | &quot;PENDING_APPROVAL&quot; |
| APPROVED | &quot;APPROVED&quot; |
| DENIED | &quot;DENIED&quot; |
| PENDING_REMOVAL | &quot;PENDING_REMOVAL&quot; |



