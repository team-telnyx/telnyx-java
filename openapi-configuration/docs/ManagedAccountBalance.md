

# ManagedAccountBalance


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recordType** | [**RecordTypeEnum**](#RecordTypeEnum) | Identifies the type of the resource. |  [optional] |
|**balance** | **BigDecimal** | The account&#39;s current balance. |  [optional] |
|**creditLimit** | **BigDecimal** | The account&#39;s credit limit. |  [optional] |
|**availableCredit** | **BigDecimal** | Available amount to spend (balance + credit limit) |  [optional] |
|**currency** | **String** | The ISO 4217 currency identifier. |  [optional] |



## Enum: RecordTypeEnum

| Name | Value |
|---- | -----|
| BALANCE | &quot;balance&quot; |



