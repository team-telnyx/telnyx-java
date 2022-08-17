

# BulkSIMCardAction

This object represents a bulk SIM card action. It groups SIM card actions created through a bulk endpoint under a single resource for further lookup.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Identifies the resource. |  [optional] [readonly] |
|**recordType** | **String** |  |  [optional] [readonly] |
|**actionType** | [**ActionTypeEnum**](#ActionTypeEnum) | The operation type. It can be one of the following: &lt;br/&gt; &lt;ul&gt; &lt;li&gt;&lt;code&gt;bulk_set_public_ips&lt;/code&gt; - set a public IP for each specified SIM card&lt;/li&gt; &lt;/ul&gt; |  [optional] [readonly] |
|**settings** | **Object** | A JSON object representation of the bulk action payload. |  [optional] [readonly] |
|**createdAt** | **String** | ISO 8601 formatted date-time indicating when the resource was created. |  [optional] [readonly] |
|**updatedAt** | **String** | ISO 8601 formatted date-time indicating when the resource was updated. |  [optional] [readonly] |



## Enum: ActionTypeEnum

| Name | Value |
|---- | -----|
| BULK_SET_PUBLIC_IPS | &quot;bulk_set_public_ips&quot; |



