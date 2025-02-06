

# RegistrationStatus


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recordType** | **String** | Identifies the type of the resource. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The current registration status of your SIP connection |  [optional] |
|**sipUsername** | **String** | The user name of the SIP connection |  [optional] |
|**ipAddress** | **String** | The ip used during the SIP connection |  [optional] |
|**transport** | **String** | The protocol of the SIP connection |  [optional] |
|**port** | **Integer** | The port of the SIP connection |  [optional] |
|**userAgent** | **String** | The user agent of the SIP connection |  [optional] |
|**lastRegistration** | **String** | ISO 8601 formatted date indicating when the resource was last updated. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NOT_APPLICABLE | &quot;Not Applicable&quot; |
| NOT_REGISTERED | &quot;Not Registered&quot; |
| FAILED | &quot;Failed&quot; |
| EXPIRED | &quot;Expired&quot; |
| REGISTERED | &quot;Registered&quot; |
| UNREGISTERED | &quot;Unregistered&quot; |



