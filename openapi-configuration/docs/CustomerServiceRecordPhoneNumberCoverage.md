

# CustomerServiceRecordPhoneNumberCoverage


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**phoneNumber** | **String** | The phone number that is being verified. |  [optional] |
|**hasCsrCoverage** | **Boolean** | Indicates whether the phone number is covered or not. |  [optional] |
|**reason** | **String** | The reason why the phone number is not covered. Only returned if &#x60;has_csr_coverage&#x60; is false. |  [optional] |
|**additionalDataRequired** | [**List&lt;AdditionalDataRequiredEnum&gt;**](#List&lt;AdditionalDataRequiredEnum&gt;) | Additional data required to perform CSR for the phone number. Only returned if &#x60;has_csr_coverage&#x60; is true. |  [optional] |
|**recordType** | **String** | Identifies the type of the resource. |  [optional] |



## Enum: List&lt;AdditionalDataRequiredEnum&gt;

| Name | Value |
|---- | -----|
| NAME | &quot;name&quot; |
| AUTHORIZED_PERSON_NAME | &quot;authorized_person_name&quot; |
| ACCOUNT_NUMBER | &quot;account_number&quot; |
| CUSTOMER_CODE | &quot;customer_code&quot; |
| PIN | &quot;pin&quot; |
| ADDRESS_LINE_1 | &quot;address_line_1&quot; |
| CITY | &quot;city&quot; |
| STATE | &quot;state&quot; |
| ZIP_CODE | &quot;zip_code&quot; |
| BILLING_PHONE_NUMBER | &quot;billing_phone_number&quot; |



