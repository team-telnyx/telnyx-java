

# MediaFeatures

The media features settings for a phone number.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rtpAutoAdjustEnabled** | **Boolean** | When RTP Auto-Adjust is enabled, the destination RTP address port will be automatically changed to match the source of the incoming RTP packets. |  [optional] |
|**acceptAnyRtpPacketsEnabled** | **Boolean** | When enabled, Telnyx will accept RTP packets from any customer-side IP address and port, not just those to which Telnyx is sending RTP. |  [optional] |
|**t38FaxGatewayEnabled** | **Boolean** | Controls whether Telnyx will accept a T.38 re-INVITE for this phone number. Note that Telnyx will not send a T.38 re-INVITE; this option only controls whether one will be accepted. |  [optional] |



