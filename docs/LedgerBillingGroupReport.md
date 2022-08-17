

# LedgerBillingGroupReport


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) | Identifies the type of the resource. |  [optional] |
|**id** | **UUID** | Identifies the type of resource. |  [optional] |
|**organizationId** | **UUID** | Uniquely identifies the organization that owns the resource. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the ledger billing group report |  [optional] |
|**reportUrl** | **String** | External url of the ledger billing group report, if the status is complete |  [optional] |
|**createdAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was created. |  [optional] |
|**updatedAt** | **OffsetDateTime** | ISO 8601 formatted date indicating when the resource was updated. |  [optional] |



## Enum: RecordTypeEnum

| Name | Value |
|---- | -----|
| LEDGER_BILLING_GROUP_REPORT | &quot;ledger_billing_group_report&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| COMPLETE | &quot;complete&quot; |
| FAILED | &quot;failed&quot; |
| DELETED | &quot;deleted&quot; |



