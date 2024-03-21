

# UpdateVerifyProfileSMSRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**messagingEnabled** | **Boolean** | Enables SMS text messaging for the Verify profile. |  [optional] |
|**messagingTemplateId** | **UUID** | The message template identifier selected from /verify_profiles/templates |  [optional] |
|**appName** | **String** | The name that identifies the application requesting 2fa in the verification message. |  [optional] |
|**defaultVerificationTimeoutSecs** | **Integer** | For every request that is initiated via this Verify profile, this sets the number of seconds before a verification request code expires. Once the verification request expires, the user cannot use the code to verify their identity. |  [optional] |



