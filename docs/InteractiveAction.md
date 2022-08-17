

# InteractiveAction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**button** | **String** | Button content. It cannot be an empty string and must be unique within the message. Emojis are supported, markdown is not. Required for List Messages. |  [optional] |
|**buttons** | [**List&lt;InteractiveButton&gt;**](InteractiveButton.md) | A list of buttons. Required for Reply Button Messages. |  [optional] |
|**sections** | [**List&lt;InteractiveSection&gt;**](InteractiveSection.md) | Array of section objects. Required for List Messages and Multi-Product Messages. |  [optional] |
|**catalogId** | **String** | Unique identifier of the Facebook catalog linked to your WhatsApp Business Account. This ID can be retrieved via Commerce Manager. Required for Single Product Messages and Multi-Product Messages. |  [optional] |
|**productRetailerId** | **String** | Unique identifier of the product in a catalog. To get this ID, go to Commerce Manager, select your Facebook Business account, and you will see a list of shops connected to your account. Click the shop you want to use. On the left-side panel, click Catalog &gt; Items, and find the item you want to mention. The ID for that item is displayed under the item&#39;s name. |  [optional] |



