

# StartForkingRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**target** | **String** | The network target, &lt;udp:ip_address:port&gt;, where the call&#39;s RTP media packets should be forwarded. Both incoming and outgoing media packets will be delivered to the specified target, and information about the stream will be included in the encapsulation protocol header, including the direction (0 &#x3D; inbound; 1 &#x3D; outbound), leg (0 &#x3D; A-leg; 1 &#x3D; B-leg), and call_leg_id. |  [optional]
**rx** | **String** | The network target, &lt;udp:ip_address:port&gt;, where the call&#39;s incoming RTP media packets should be forwarded. |  [optional]
**tx** | **String** | The network target, &lt;udp:ip_address:port&gt;, where the call&#39;s outgoing RTP media packets should be forwarded. |  [optional]
**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional]
**commandId** | **String** | Use this field to avoid duplicate commands. Telnyx will ignore commands with the same &#x60;command_id&#x60;. |  [optional]



