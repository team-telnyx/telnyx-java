

# SendFaxRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connectionId** | **String** | The connection ID to send the fax with. | 
**mediaUrl** | **String** | The URL to the PDF used for the fax&#39;s media. media_url and media_name can&#39;t be submitted together. |  [optional]
**mediaName** | **String** | The media_name of a file to be used for the fax&#39;s media. The media_name must point to a file previously uploaded to api.telnyx.com/v2/media by the same user/organization. media_url and media_name can&#39;t be submitted together. |  [optional]
**to** | **String** | The phone number, in E.164 format, the fax will be sent to or SIP URI. | 
**from** | **String** | The phone number, in E.164 format, the fax will be sent from. | 
**quality** | **String** | The quality of the fax. Can be normal, high, very_high. |  [optional]
**t38Enabled** | **Boolean** | The flag to disable the T.38 protocol. |  [optional]
**monochrome** | **Boolean** | The flag to enable monochrome, true black and white fax results. |  [optional]
**storeMedia** | **Boolean** | Should fax media be stored on temporary URL. It does not support media_name, they can&#39;t be submitted together. |  [optional]



