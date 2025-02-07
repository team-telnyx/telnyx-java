

# CustomerServiceRecordResult

The result of the CSR request. This field would be null in case of `pending` or `failed` status.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**carrierName** | **String** | The name of the carrier that the customer service record is for. |  [optional] |
|**associatedPhoneNumbers** | **List&lt;String&gt;** | The associated phone numbers of the customer service record. |  [optional] |
|**admin** | [**CustomerServiceRecordResultAdmin**](CustomerServiceRecordResultAdmin.md) |  |  [optional] |
|**address** | [**CustomerServiceRecordResultAddress**](CustomerServiceRecordResultAddress.md) |  |  [optional] |



