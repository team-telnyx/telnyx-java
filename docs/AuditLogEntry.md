

# AuditLogEntry


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier for the audit log entry |  [optional] |
|**userId** | **UUID** | Unique identifier for the user who made the change |  [optional] |
|**recordType** | **String** | Identifies the type of the resource. |  [optional] |
|**resourceId** | **String** | Unique identifier for the resource that was changed |  [optional] |
|**organizationId** | **UUID** | Unique identifier for the organization that owns the resource |  [optional] |
|**changes** | [**List&lt;AuditLogEntryChangesInner&gt;**](AuditLogEntryChangesInner.md) |  |  [optional] |
|**changeMadeBy** | [**ChangeMadeByEnum**](#ChangeMadeByEnum) | Indicates what type of user made the change |  [optional] |
|**resourceType** | **String** | Identifies the type of the resource that was changed |  [optional] |
|**changeType** | **String** | Identifies the type of change that was made |  [optional] |
|**createdAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the change was made |  [optional] |



## Enum: ChangeMadeByEnum

| Name | Value |
|---- | -----|
| ACCOUNT_OWNER | &quot;account_owner&quot; |
| ORGANIZATION_MEMBER | &quot;organization_member&quot; |
| ACCOUNT_MANAGER | &quot;account_manager&quot; |
| TELNYX | &quot;telnyx&quot; |



