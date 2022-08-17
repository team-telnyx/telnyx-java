

# CreateWhatsAppMessageRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**whatsappUserId** | **String** | The sender&#39;s WhatsApp ID. |  |
|**to** | **String** | The WhatsApp ID (phone number) returned from contacts endpoint. |  |
|**type** | **MessageType** |  |  [optional] |
|**text** | [**Text**](Text.md) |  |  [optional] |
|**audio** | [**Audio**](Audio.md) |  |  [optional] |
|**image** | [**Image**](Image.md) |  |  [optional] |
|**document** | [**Document**](Document.md) |  |  [optional] |
|**video** | [**Video**](Video.md) |  |  [optional] |
|**location** | [**Location**](Location.md) |  |  [optional] |
|**previewUrl** | **Boolean** | Specifying preview_url in the request is optional when not including a URL in your message. To include a URL preview, set preview_url to true in the message body and make sure the URL begins with http:// or https://. |  [optional] |
|**template** | [**Template**](Template.md) |  |  [optional] |



