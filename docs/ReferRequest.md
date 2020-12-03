

# ReferRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sipAddress** | **String** | The SIP URI to which the call will be referred to. | 
**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional]
**commandId** | **String** | Use this field to avoid execution of duplicate commands. Telnyx will ignore subsequent commands with the same &#x60;command_id&#x60; as one that has already been executed. |  [optional]
**customHeaders** | [**List&lt;CustomSipHeader&gt;**](CustomSipHeader.md) | Custom headers to be added to the SIP INVITE. |  [optional]
**sipAuthUsername** | **String** | SIP Authentication username used for SIP challenges. |  [optional]
**sipAuthPassword** | **String** | SIP Authentication password used for SIP challenges. |  [optional]



