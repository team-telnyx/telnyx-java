

# VerifiedCallsDisplayProfileCallReasons

The Call Reason to be displayed to the call recipient

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | **String** |  |  [optional] [readonly]
**id** | **UUID** |  |  [optional] [readonly]
**reason** | **String** | The Call Reason text to be displayed to the call recipient |  [optional]
**googleVerificationStatus** | [**GoogleVerificationStatusEnum**](#GoogleVerificationStatusEnum) | The approval status of this individual call reason in Google |  [optional] [readonly]
**googleApprovalInfo** | **String** | Additional information about the decision, if available. |  [optional] [readonly]
**displayProfileId** | **UUID** |  |  [optional] [readonly]
**delete** | **Boolean** | Marks the Phone Number to be removed from the Display Profile |  [optional]



## Enum: GoogleVerificationStatusEnum

Name | Value
---- | -----
STATE_UNSPECIFIED | &quot;STATE_UNSPECIFIED&quot;
PENDING_APPROVAL | &quot;PENDING_APPROVAL&quot;
APPROVED | &quot;APPROVED&quot;
DENIED | &quot;DENIED&quot;
PENDING_REMOVAL | &quot;PENDING_REMOVAL&quot;



