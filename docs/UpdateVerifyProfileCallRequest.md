

# UpdateVerifyProfileCallRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**speechTemplate** | **String** | Optionally sets a speech text template when sending the verification code. Uses &#x60;{code}&#x60; to template in the actual verification code. |  [optional] |
|**defaultVerificationTimeoutSecs** | **Integer** | For every request that is initiated via this Verify profile, this sets the number of seconds before a verification request code expires. Once the verification request expires, the user cannot use the code to verify their identity. |  [optional] |
|**defaultCallTimeoutSecs** | **Integer** | Must be less than default_verification_timeout_secs |  [optional] |



