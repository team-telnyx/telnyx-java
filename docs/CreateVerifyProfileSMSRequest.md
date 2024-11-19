

# CreateVerifyProfileSMSRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**messagingTemplateId** | **UUID** | The message template identifier selected from /verify_profiles/templates |  [optional] |
|**appName** | **String** | The name that identifies the application requesting 2fa in the verification message. |  [optional] |
|**alphaSender** | **String** | The alphanumeric sender ID to use when sending to destinations that require an alphanumeric sender ID. |  [optional] |
|**codeLength** | **Integer** | The length of the verify code to generate. |  [optional] |
|**whitelistedDestinations** | **List&lt;String&gt;** | Enabled country destinations to send verification codes. The elements in the list must be valid ISO 3166-1 alpha-2 country codes. If set to &#x60;[\&quot;*\&quot;]&#x60;, all destinations will be allowed. |  |
|**defaultVerificationTimeoutSecs** | **Integer** | For every request that is initiated via this Verify profile, this sets the number of seconds before a verification request code expires. Once the verification request expires, the user cannot use the code to verify their identity. |  [optional] |



