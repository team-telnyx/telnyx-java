

# AuditLog


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier for the audit log entry. |  [optional] |
|**userId** | **UUID** | Unique identifier for the user who made the change. |  [optional] |
|**recordType** | **String** | The type of the resource being audited. |  [optional] |
|**resourceId** | **String** | Unique identifier for the resource that was changed. |  [optional] |
|**alternateResourceId** | **String** | An alternate identifier for a resource which may be considered unique enough to identify the resource but is not the primary identifier for the resource. For example, this field could be used to store the phone number value for a phone number when the primary database identifier is a separate distinct value. |  [optional] |
|**changeMadeBy** | [**ChangeMadeByEnum**](#ChangeMadeByEnum) | Indicates if the change was made by Telnyx on your behalf, the organization owner, a member of your organization, or in the case of managed accounts, the account manager. |  [optional] |
|**changes** | **List&lt;List&lt;AuditEventChangesInner&gt;&gt;** | Details of the changes made to the resource. |  [optional] |
|**organizationId** | **UUID** | Unique identifier for the organization that owns the resource. |  [optional] |
|**changeType** | **String** | The type of change that occurred. |  [optional] |
|**createdAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the change occurred. |  [optional] |



## Enum: ChangeMadeByEnum

| Name | Value |
|---- | -----|
| TELNYX | &quot;telnyx&quot; |
| ACCOUNT_MANAGER | &quot;account_manager&quot; |
| ACCOUNT_OWNER | &quot;account_owner&quot; |
| ORGANIZATION_MEMBER | &quot;organization_member&quot; |



