

# VerifiedCallsDisplayProfile


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordType** | **String** |  |  [optional] [readonly]
**id** | **UUID** |  |  [optional] [readonly]
**name** | **String** | The Verified Calls Display Profile&#39;s name |  [optional]
**displayName** | **String** | The display name to be shown as the caller name in phones |  [optional]
**logoUrl** | **String** | The URL pointing to a public image file that will be displayed during calls in phones |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The approval status of the Verified Calls Display Profile in Google |  [optional] [readonly]
**businessIdentity** | [**VerifiedCallsDisplayProfileBusinessIdentity**](VerifiedCallsDisplayProfileBusinessIdentity.md) |  |  [optional]
**phoneNumbers** | [**List&lt;VerifiedCallsDisplayProfilePhoneNumbers&gt;**](VerifiedCallsDisplayProfilePhoneNumbers.md) |  |  [optional]
**callReasons** | [**List&lt;VerifiedCallsDisplayProfileCallReasons&gt;**](VerifiedCallsDisplayProfileCallReasons.md) |  |  [optional]
**createdAt** | **String** | An ISO 8601 datetime string for when the display profile was added to the Telnyx platform |  [optional] [readonly]
**updatedAt** | **String** | An ISO 8601 datetime string for when the display profile was updated |  [optional] [readonly]



## Enum: StatusEnum

Name | Value
---- | -----
UNSPECIFIED | &quot;VERIFICATION_STATE_UNSPECIFIED&quot;
UNVERIFIED | &quot;VERIFICATION_STATE_UNVERIFIED&quot;
PENDING | &quot;VERIFICATION_STATE_PENDING&quot;
VERIFIED | &quot;VERIFICATION_STATE_VERIFIED&quot;
SUSPENDED_IN_GMB | &quot;VERIFICATION_STATE_SUSPENDED_IN_GMB&quot;



