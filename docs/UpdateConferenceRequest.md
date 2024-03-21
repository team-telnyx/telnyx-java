

# UpdateConferenceRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **String** | The new status of the resource. Specifying &#x60;completed&#x60; will end the conference and hang up all participants. |  [optional] |
|**announceUrl** | **String** | The URL we should call to announce something into the conference. The URL may return an MP3 file, a WAV file, or a TwiML document that contains &lt;Play&gt;, &lt;Say&gt;, &lt;Pause&gt;, or &lt;Redirect&gt; verbs. |  [optional] |
|**announceMethod** | [**AnnounceMethodEnum**](#AnnounceMethodEnum) | The HTTP method used to call the &#x60;AnnounceUrl&#x60;. Defaults to &#x60;POST&#x60;. |  [optional] |



## Enum: AnnounceMethodEnum

| Name | Value |
|---- | -----|
| GET | &quot;GET&quot; |
| POST | &quot;POST&quot; |



