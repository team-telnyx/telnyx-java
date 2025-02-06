

# CreateExternalConnectionUploadRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**numberIds** | **List&lt;String&gt;** |  |  [optional] |
|**usage** | [**UsageEnum**](#UsageEnum) | The use case of the upload request. NOTE: &#x60;calling_user_assignment&#x60; is not supported for toll free numbers. |  [optional] |
|**additionalUsages** | [**List&lt;AdditionalUsagesEnum&gt;**](#List&lt;AdditionalUsagesEnum&gt;) |  |  [optional] |
|**locationId** | **UUID** | Identifies the location to assign all phone numbers to. |  [optional] |
|**civicAddressId** | **UUID** | Identifies the civic address to assign all phone numbers to. |  [optional] |



## Enum: UsageEnum

| Name | Value |
|---- | -----|
| CALLING_USER_ASSIGNMENT | &quot;calling_user_assignment&quot; |
| FIRST_PARTY_APP_ASSIGNMENT | &quot;first_party_app_assignment&quot; |



## Enum: List&lt;AdditionalUsagesEnum&gt;

| Name | Value |
|---- | -----|
| CALLING_USER_ASSIGNMENT | &quot;calling_user_assignment&quot; |
| FIRST_PARTY_APP_ASSIGNMENT | &quot;first_party_app_assignment&quot; |



