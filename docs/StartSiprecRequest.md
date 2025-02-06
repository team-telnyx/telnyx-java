

# StartSiprecRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**connectorName** | **String** | Name of configured SIPREC connector to be used. |  [optional] |
|**siprecTrack** | [**SiprecTrackEnum**](#SiprecTrackEnum) | Specifies which track should be sent on siprec session. |  [optional] |
|**includeMetadataCustomHeaders** | **Boolean** | When set, custom parameters will be added as metadata (recording.session.ExtensionParameters). Otherwise, they’ll be added to sip headers. |  [optional] |
|**secure** | **Boolean** | Controls whether to encrypt media sent to your SRS using SRTP and TLS. When set you need to configure SRS port in your connector to 5061. |  [optional] |
|**sessionTimeoutSecs** | **Integer** | Sets &#x60;Session-Expires&#x60; header to the INVITE. A reinvite is sent every half the value set. Usefull for session keep alive. Minimum value is 90, set to 0 to disable. |  [optional] |
|**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional] |



## Enum: SiprecTrackEnum

| Name | Value |
|---- | -----|
| INBOUND_TRACK | &quot;inbound_track&quot; |
| OUTBOUND_TRACK | &quot;outbound_track&quot; |
| BOTH_TRACKS | &quot;both_tracks&quot; |



