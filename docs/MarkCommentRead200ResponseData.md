

# MarkCommentRead200ResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] [readonly] |
|**body** | **String** |  |  [optional] |
|**commenter** | **String** |  |  [optional] [readonly] |
|**commenterType** | [**CommenterTypeEnum**](#CommenterTypeEnum) |  |  [optional] [readonly] |
|**commentRecordType** | [**CommentRecordTypeEnum**](#CommentRecordTypeEnum) |  |  [optional] |
|**commentRecordId** | **UUID** |  |  [optional] |
|**readAt** | **String** | An ISO 8901 datetime string for when the comment was read. |  [optional] [readonly] |
|**createdAt** | **String** | An ISO 8901 datetime string denoting when the comment was created. |  [optional] [readonly] |
|**updatedAt** | **String** | An ISO 8901 datetime string for when the comment was updated. |  [optional] [readonly] |



## Enum: CommenterTypeEnum

| Name | Value |
|---- | -----|
| ADMIN | &quot;admin&quot; |
| USER | &quot;user&quot; |



## Enum: CommentRecordTypeEnum

| Name | Value |
|---- | -----|
| NUMBER_ORDER | &quot;number_order&quot; |
| SUB_NUMBER_ORDER | &quot;sub_number_order&quot; |
| NUMBER_ORDER_PHONE_NUMBER | &quot;number_order_phone_number&quot; |



