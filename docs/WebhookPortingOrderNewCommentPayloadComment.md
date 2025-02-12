

# WebhookPortingOrderNewCommentPayloadComment

The comment that was added to the porting order.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Identifies the comment. |  [optional] |
|**body** | **String** | The body of the comment. |  [optional] |
|**userId** | **UUID** | Identifies the user that create the comment. |  [optional] |
|**userType** | [**UserTypeEnum**](#UserTypeEnum) | Identifies the type of the user that created the comment. |  [optional] |
|**insertedAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the comment was created. |  [optional] |



## Enum: UserTypeEnum

| Name | Value |
|---- | -----|
| USER | &quot;user&quot; |
| ADMIN | &quot;admin&quot; |
| SYSTEM | &quot;system&quot; |



