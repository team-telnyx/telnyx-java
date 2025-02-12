

# VerifyVerificationCodeRequestById


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | This is the code the user submits for verification. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Identifies if the verification code has been accepted or rejected. Only permitted if custom_code was used for the verification. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACCEPTED | &quot;accepted&quot; |
| REJECTED | &quot;rejected&quot; |



