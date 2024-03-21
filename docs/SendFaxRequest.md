

# SendFaxRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**connectionId** | **String** | The connection ID to send the fax with. |  |
|**mediaUrl** | **String** | The URL to the PDF used for the fax&#39;s media. media_url and media_name/contents can&#39;t be submitted together. |  [optional] |
|**mediaName** | **String** | The media_name used for the fax&#39;s media. Must point to a file previously uploaded to api.telnyx.com/v2/media by the same user/organization. media_name and media_url/contents can&#39;t be submitted together. |  [optional] |
|**to** | **String** | The phone number, in E.164 format, the fax will be sent to or SIP URI |  |
|**from** | **String** | The phone number, in E.164 format, the fax will be sent from. |  |
|**fromDisplayName** | **String** | The &#x60;from_display_name&#x60; string to be used as the caller id name (SIP From Display Name) presented to the destination (&#x60;to&#x60; number). The string should have a maximum of 128 characters, containing only letters, numbers, spaces, and -_~!.+ special characters. If ommited, the display name will be the same as the number in the &#x60;from&#x60; field. |  [optional] |
|**quality** | **Quality** |  |  [optional] |
|**t38Enabled** | **Boolean** | The flag to disable the T.38 protocol. |  [optional] |
|**monochrome** | **Boolean** | The flag to enable monochrome, true black and white fax results. |  [optional] |
|**storeMedia** | **Boolean** | Should fax media be stored on temporary URL. It does not support media_name, they can&#39;t be submitted together. |  [optional] |
|**webhookUrl** | **String** | Use this field to override the URL to which Telnyx will send subsequent webhooks for this fax. |  [optional] |



