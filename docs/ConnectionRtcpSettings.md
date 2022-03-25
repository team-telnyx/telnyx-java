

# ConnectionRtcpSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**port** | [**PortEnum**](#PortEnum) | RTCP port by default is rtp+1, it can also be set to rtcp-mux |  [optional]
**captureEnabled** | **Boolean** | BETA - Enable the capture and storage of RTCP messages to create QoS reports on the Telnyx Mission Control Portal. |  [optional]
**reportFrequencySecs** | **Integer** | RTCP reports are sent to customers based on the frequency set. Frequency is in seconds and it can be set to values from 5 to 3000 seconds. |  [optional]



## Enum: PortEnum

Name | Value
---- | -----
RTCP_MUX | &quot;rtcp-mux&quot;
RTP_1 | &quot;rtp+1&quot;



