

# TexmlUpdateSiprecSessionResponseBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountSid** | **String** | The id of the account the resource belongs to. |  [optional] |
|**callSid** | **String** | The id of the call the resource belongs to. |  [optional] |
|**sid** | **String** | The SID of the siprec session. |  [optional] |
|**dateUpdated** | **String** | The date and time the siprec session was last updated. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the siprec session. |  [optional] |
|**uri** | **String** | The URI of the siprec session. |  [optional] |
|**errorCode** | **String** | The error code of the siprec session. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| IN_PROGRESS | &quot;in-progress&quot; |
| STOPPED | &quot;stopped&quot; |



