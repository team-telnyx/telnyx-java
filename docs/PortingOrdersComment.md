

# PortingOrdersComment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**body** | **String** | Body of comment |  [optional] |
|**portingOrderId** | **UUID** |  |  [optional] |
|**userType** | [**UserTypeEnum**](#UserTypeEnum) | Indicates whether this comment was created by a Telnyx Admin, user, or system |  [optional] |
|**userId** | **UUID** | The ID of the user who created this comment |  [optional] |
|**userEmail** | **String** | The email address of the user who created this comment |  [optional] |
|**recordType** | **String** | Identifies the type of the resource. |  [optional] |
|**createdAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was created. |  [optional] |



## Enum: UserTypeEnum

| Name | Value |
|---- | -----|
| ADMIN | &quot;admin&quot; |
| USER | &quot;user&quot; |
| SYSTEM | &quot;system&quot; |



