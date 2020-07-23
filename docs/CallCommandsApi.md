# CallCommandsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callControlAnswer**](CallCommandsApi.md#callControlAnswer) | **POST** /calls/{call_control_id}/actions/answer | Answer call
[**callControlBridge**](CallCommandsApi.md#callControlBridge) | **POST** /calls/{call_control_id}/actions/bridge | Bridge calls
[**callControlDial**](CallCommandsApi.md#callControlDial) | **POST** /calls | Dial
[**callControlForkStart**](CallCommandsApi.md#callControlForkStart) | **POST** /calls/{call_control_id}/actions/fork_start | Forking start
[**callControlForkStop**](CallCommandsApi.md#callControlForkStop) | **POST** /calls/{call_control_id}/actions/fork_stop | Forking stop
[**callControlGatherStop**](CallCommandsApi.md#callControlGatherStop) | **POST** /calls/{call_control_id}/actions/gather_stop | Gather stop
[**callControlGatherUsingAudio**](CallCommandsApi.md#callControlGatherUsingAudio) | **POST** /calls/{call_control_id}/actions/gather_using_audio | Gather using audio
[**callControlGatherUsingSpeak**](CallCommandsApi.md#callControlGatherUsingSpeak) | **POST** /calls/{call_control_id}/actions/gather_using_speak | Gather using speak
[**callControlHangup**](CallCommandsApi.md#callControlHangup) | **POST** /calls/{call_control_id}/actions/hangup | Hangup call
[**callControlPlaybackStart**](CallCommandsApi.md#callControlPlaybackStart) | **POST** /calls/{call_control_id}/actions/playback_start | Play audio URL
[**callControlPlaybackStop**](CallCommandsApi.md#callControlPlaybackStop) | **POST** /calls/{call_control_id}/actions/playback_stop | Stop audio playback
[**callControlRecordStart**](CallCommandsApi.md#callControlRecordStart) | **POST** /calls/{call_control_id}/actions/record_start | Recording start
[**callControlRecordStop**](CallCommandsApi.md#callControlRecordStop) | **POST** /calls/{call_control_id}/actions/record_stop | Recording stop
[**callControlReject**](CallCommandsApi.md#callControlReject) | **POST** /calls/{call_control_id}/actions/reject | Reject call
[**callControlSendDTMF**](CallCommandsApi.md#callControlSendDTMF) | **POST** /calls/{call_control_id}/actions/send_dtmf | Send DTMF
[**callControlSpeak**](CallCommandsApi.md#callControlSpeak) | **POST** /calls/{call_control_id}/actions/speak | Speak text
[**callControlTransfer**](CallCommandsApi.md#callControlTransfer) | **POST** /calls/{call_control_id}/actions/transfer | Transfer call

<a name="callControlAnswer"></a>
# **callControlAnswer**
> CallControlCommandResponse callControlAnswer(body, callControlId)

Answer call

Answer an incoming call. You must issue this command before executing subsequent commands on an incoming call.  **Expected Webhooks:**  - &#x60;call.answered&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CallCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallCommandsApi apiInstance = new CallCommandsApi();
AnswerRequest body = new AnswerRequest(); // AnswerRequest | Answer call request
String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
try {
    CallControlCommandResponse result = apiInstance.callControlAnswer(body, callControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallCommandsApi#callControlAnswer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AnswerRequest**](AnswerRequest.md)| Answer call request |
 **callControlId** | **String**| Unique identifier and token for controlling the call |

### Return type

[**CallControlCommandResponse**](CallControlCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="callControlBridge"></a>
# **callControlBridge**
> CallControlCommandResponse callControlBridge(body, callControlId)

Bridge calls

Bridge two call control calls.  **Expected Webhooks:**  - &#x60;call.bridged&#x60; for Leg A - &#x60;call.bridged&#x60; for Leg B 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CallCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallCommandsApi apiInstance = new CallCommandsApi();
BridgeRequest body = new BridgeRequest(); // BridgeRequest | Bridge call request
String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
try {
    CallControlCommandResponse result = apiInstance.callControlBridge(body, callControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallCommandsApi#callControlBridge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BridgeRequest**](BridgeRequest.md)| Bridge call request |
 **callControlId** | **String**| Unique identifier and token for controlling the call |

### Return type

[**CallControlCommandResponse**](CallControlCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="callControlDial"></a>
# **callControlDial**
> RetrieveCallStatusResponse callControlDial(body)

Dial

Dial a number from a given connection. A successful response will include a &#x60;call_leg_id&#x60; which can be used to correlate the command with subsequent webhooks.  **Expected Webhooks:**  - &#x60;call.initiated&#x60; - &#x60;call.answered&#x60; or &#x60;call.hangup&#x60; - &#x60;call.machine.detection.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested - &#x60;call.machine.greeting.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested to detect the end of machine greeting 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CallCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallCommandsApi apiInstance = new CallCommandsApi();
DialRequest body = new DialRequest(); // DialRequest | Dial request
try {
    RetrieveCallStatusResponse result = apiInstance.callControlDial(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallCommandsApi#callControlDial");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DialRequest**](DialRequest.md)| Dial request |

### Return type

[**RetrieveCallStatusResponse**](RetrieveCallStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="callControlForkStart"></a>
# **callControlForkStart**
> CallControlCommandResponse callControlForkStart(body, callControlId)

Forking start

Call forking allows you to stream the media from a call to a specific target in realtime.  This stream can be used to enable realtime audio analysis to support a  variety of use cases, including fraud detection, or the creation of AI-generated audio responses.  Requests must specify either the &#x60;target&#x60; attribute or the &#x60;rx&#x60; and &#x60;tx&#x60; attributes.  **Expected Webhooks:**  - &#x60;call.fork.started&#x60; - &#x60;call.fork.stopped&#x60;  **Simple Telnyx RTP Encapsulation Protocol (STREP)**  *Note: This header/encapsulation is not used when the &#x60;rx&#x60; and &#x60;tx&#x60; parameters have been specified; it only applies when media is forked using the &#x60;target&#x60; attribute.*  If the destination for forked media is specified using the \&quot;target\&quot; attribute, the RTP will be encapsulated in an extra Telnyx protocol, which adds a 24 byte header to the RTP payload in each packet. The STREP header includes the Call Control &#x60;call_leg_id&#x60; for stream identification, along with bits that represent the direction (inbound or outbound) of the media. This 24-byte header sits between the UDP header and the RTP header.  The STREP header makes it possible to fork RTP for multiple calls (or two RTP streams for the same call) to the same IP:port, where the streams can be demultiplexed by your application using the information in the header. Of course, it&#x27;s still possible to ignore this header completely, for example, if sending forked media for different calls to different ports or IP addresses. In this case, simply strip 24 bytes (or use the second byte to find the header length) from the received UDP payload to get the RTP (RTP header and payload).  &#x60;&#x60;&#x60; STREP Specification    0                   1                   2                   3   0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+  |1 1|Version|L|D|    HeaderLen  |  reserved (2 bytes)           |  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+  |       reserved (4 bytes, for UDP ports or anything else)      |  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+  |               The call_leg_id                                 |  |                   from Call Control                           |  |                       (128 bits / 16 bytes)                   |  |                           (this is binary data)               |  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+   11    Static bits 11, always set to 11 to easily distinguish forked media    from RTP (10) and T.38 media (usually 00) and SIP (which begins    with a capital letter, so begins with bits 01). This is a magic number.   Version    Four bits to indicate the version number of the protocol, starting at 0001.   L    One bit to represent the leg of the call (A or B).    0 represents the A (first) leg of the call.    1 represents the B (second) leg of the call.   D    One bit to represent the direction of this RTP stream.    0 represents media received by Telnyx.    1 represents media transmitted by Telnyx.   HeaderLen (1 byte)    The length of the header in bytes.    Note that this value does not include the length of the payload. The total    size of the RTP can be calculated by subtracting the HeaderLen from the UDP    length (minus 8 for the UDP header).    In version 1, this value will always be 24.   Reserved (6 bytes)    Reserved for future use and to make sure that the header is a multiple of 32 bits   Call Leg ID    A 128-bit identifier for the call leg.    This is the call_leg_id from Call Control. &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CallCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallCommandsApi apiInstance = new CallCommandsApi();
StartForkingRequest body = new StartForkingRequest(); // StartForkingRequest | Fork media request
String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
try {
    CallControlCommandResponse result = apiInstance.callControlForkStart(body, callControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallCommandsApi#callControlForkStart");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StartForkingRequest**](StartForkingRequest.md)| Fork media request |
 **callControlId** | **String**| Unique identifier and token for controlling the call |

### Return type

[**CallControlCommandResponse**](CallControlCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="callControlForkStop"></a>
# **callControlForkStop**
> CallControlCommandResponse callControlForkStop(body, callControlId)

Forking stop

Stop forking a call.  **Expected Webhooks:**  - &#x60;call.fork.stopped&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CallCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallCommandsApi apiInstance = new CallCommandsApi();
StopForkingRequest body = new StopForkingRequest(); // StopForkingRequest | Stop forking media request
String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
try {
    CallControlCommandResponse result = apiInstance.callControlForkStop(body, callControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallCommandsApi#callControlForkStop");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StopForkingRequest**](StopForkingRequest.md)| Stop forking media request |
 **callControlId** | **String**| Unique identifier and token for controlling the call |

### Return type

[**CallControlCommandResponse**](CallControlCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="callControlGatherStop"></a>
# **callControlGatherStop**
> CallControlCommandResponse callControlGatherStop(body, callControlId)

Gather stop

Stop current gather.  **Expected Webhooks:**  - &#x60;call.gather.ended&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CallCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallCommandsApi apiInstance = new CallCommandsApi();
StopGatherRequest body = new StopGatherRequest(); // StopGatherRequest | Stop current gather
String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
try {
    CallControlCommandResponse result = apiInstance.callControlGatherStop(body, callControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallCommandsApi#callControlGatherStop");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StopGatherRequest**](StopGatherRequest.md)| Stop current gather |
 **callControlId** | **String**| Unique identifier and token for controlling the call |

### Return type

[**CallControlCommandResponse**](CallControlCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="callControlGatherUsingAudio"></a>
# **callControlGatherUsingAudio**
> CallControlCommandResponse callControlGatherUsingAudio(body, callControlId)

Gather using audio

Play an audio file on the call until the required DTMF signals are gathered to build interactive menus.  You can pass a list of valid digits along with an &#x27;invalid_audio_url&#x27;, which will be played back at the beginning of each prompt. Playback will be interrupted when a DTMF signal is received. The [Answer](/docs/api/v2/call-control/Call-Commands#CallControlAnswer) command must be issued before the &#x60;gather_using_audio&#x60; command.  **Expected Webhooks:**  - &#x60;call.playback.started&#x60; - &#x60;call.playback.ended&#x60; - &#x60;call.dtmf.received&#x60; (you may receive many of these webhooks) - &#x60;call.gather.ended&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CallCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallCommandsApi apiInstance = new CallCommandsApi();
GatherUsingAudioRequest body = new GatherUsingAudioRequest(); // GatherUsingAudioRequest | Gather using audio request
String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
try {
    CallControlCommandResponse result = apiInstance.callControlGatherUsingAudio(body, callControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallCommandsApi#callControlGatherUsingAudio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatherUsingAudioRequest**](GatherUsingAudioRequest.md)| Gather using audio request |
 **callControlId** | **String**| Unique identifier and token for controlling the call |

### Return type

[**CallControlCommandResponse**](CallControlCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="callControlGatherUsingSpeak"></a>
# **callControlGatherUsingSpeak**
> CallControlCommandResponse callControlGatherUsingSpeak(body, callControlId)

Gather using speak

Convert text to speech and play it on the call until the required DTMF signals are gathered to build interactive menus.  You can pass a list of valid digits along with an &#x27;invalid_payload&#x27;, which will be played back at the beginning of each prompt. Speech will be interrupted when a DTMF signal is received. The [Answer](/docs/api/v2/call-control/Call-Commands#CallControlAnswer) command must be issued before the &#x60;gather_using_speak&#x60; command.  **Expected Webhooks:**  - &#x60;call.dtmf.received&#x60; (you may receive many of these webhooks) - &#x60;call.gather.ended&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CallCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallCommandsApi apiInstance = new CallCommandsApi();
GatherUsingSpeakRequest body = new GatherUsingSpeakRequest(); // GatherUsingSpeakRequest | Gather using speak request
String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
try {
    CallControlCommandResponse result = apiInstance.callControlGatherUsingSpeak(body, callControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallCommandsApi#callControlGatherUsingSpeak");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatherUsingSpeakRequest**](GatherUsingSpeakRequest.md)| Gather using speak request |
 **callControlId** | **String**| Unique identifier and token for controlling the call |

### Return type

[**CallControlCommandResponse**](CallControlCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="callControlHangup"></a>
# **callControlHangup**
> CallControlCommandResponse callControlHangup(body, callControlId)

Hangup call

Hang up the call.  **Expected Webhooks:**  - &#x60;call.hangup&#x60; - &#x60;call.recording.saved&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CallCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallCommandsApi apiInstance = new CallCommandsApi();
HangupRequest body = new HangupRequest(); // HangupRequest | Hangup request
String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
try {
    CallControlCommandResponse result = apiInstance.callControlHangup(body, callControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallCommandsApi#callControlHangup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**HangupRequest**](HangupRequest.md)| Hangup request |
 **callControlId** | **String**| Unique identifier and token for controlling the call |

### Return type

[**CallControlCommandResponse**](CallControlCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="callControlPlaybackStart"></a>
# **callControlPlaybackStart**
> CallControlCommandResponse callControlPlaybackStart(body, callControlId)

Play audio URL

Play an audio file on the call. If multiple play audio commands are issued consecutively, the audio files will be placed in a queue awaiting playback.  *Notes:*  - When &#x60;overlay&#x60; is enabled, &#x60;loop&#x60; is limited to 1, and &#x60;target_legs&#x60; is limited to &#x60;self&#x60;. - A customer cannot Play Audio with &#x60;overlay&#x3D;true&#x60; unless there is a Play Audio with &#x60;overlay&#x3D;false&#x60; actively playing.  **Expected Webhooks:**  - &#x60;call.playback.started&#x60; - &#x60;call.playback.ended&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CallCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallCommandsApi apiInstance = new CallCommandsApi();
PlayAudioUrlRequest body = new PlayAudioUrlRequest(); // PlayAudioUrlRequest | Play audio URL request
String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
try {
    CallControlCommandResponse result = apiInstance.callControlPlaybackStart(body, callControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallCommandsApi#callControlPlaybackStart");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PlayAudioUrlRequest**](PlayAudioUrlRequest.md)| Play audio URL request |
 **callControlId** | **String**| Unique identifier and token for controlling the call |

### Return type

[**CallControlCommandResponse**](CallControlCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="callControlPlaybackStop"></a>
# **callControlPlaybackStop**
> CallControlCommandResponse callControlPlaybackStop(body, callControlId)

Stop audio playback

Stop audio being played on the call.  **Expected Webhooks:**  - &#x60;call.playback.ended&#x60; or &#x60;call.speak.ended&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CallCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallCommandsApi apiInstance = new CallCommandsApi();
PlaybackStopRequest body = new PlaybackStopRequest(); // PlaybackStopRequest | Stop audio playback request
String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
try {
    CallControlCommandResponse result = apiInstance.callControlPlaybackStop(body, callControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallCommandsApi#callControlPlaybackStop");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PlaybackStopRequest**](PlaybackStopRequest.md)| Stop audio playback request |
 **callControlId** | **String**| Unique identifier and token for controlling the call |

### Return type

[**CallControlCommandResponse**](CallControlCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="callControlRecordStart"></a>
# **callControlRecordStart**
> CallControlCommandResponse callControlRecordStart(body, callControlId)

Recording start

Start recording the call. Recording will stop on call hang-up, or can be initiated via the Stop Recording command.  **Expected Webhooks:**  - &#x60;call.recording.saved&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CallCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallCommandsApi apiInstance = new CallCommandsApi();
StartRecordingRequest body = new StartRecordingRequest(); // StartRecordingRequest | Start recording audio request
String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
try {
    CallControlCommandResponse result = apiInstance.callControlRecordStart(body, callControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallCommandsApi#callControlRecordStart");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StartRecordingRequest**](StartRecordingRequest.md)| Start recording audio request |
 **callControlId** | **String**| Unique identifier and token for controlling the call |

### Return type

[**CallControlCommandResponse**](CallControlCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="callControlRecordStop"></a>
# **callControlRecordStop**
> CallControlCommandResponse callControlRecordStop(body, callControlId)

Recording stop

Stop recording the call.  **Expected Webhooks:**  - &#x60;call.recording.saved&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CallCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallCommandsApi apiInstance = new CallCommandsApi();
StopRecordingRequest body = new StopRecordingRequest(); // StopRecordingRequest | Stop recording call request
String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
try {
    CallControlCommandResponse result = apiInstance.callControlRecordStop(body, callControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallCommandsApi#callControlRecordStop");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StopRecordingRequest**](StopRecordingRequest.md)| Stop recording call request |
 **callControlId** | **String**| Unique identifier and token for controlling the call |

### Return type

[**CallControlCommandResponse**](CallControlCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="callControlReject"></a>
# **callControlReject**
> CallControlCommandResponse callControlReject(body, callControlId)

Reject call

Reject an incoming call.  **Expected Webhooks:**  - &#x60;call.hangup&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CallCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallCommandsApi apiInstance = new CallCommandsApi();
RejectRequest body = new RejectRequest(); // RejectRequest | Reject request
String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
try {
    CallControlCommandResponse result = apiInstance.callControlReject(body, callControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallCommandsApi#callControlReject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RejectRequest**](RejectRequest.md)| Reject request |
 **callControlId** | **String**| Unique identifier and token for controlling the call |

### Return type

[**CallControlCommandResponse**](CallControlCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="callControlSendDTMF"></a>
# **callControlSendDTMF**
> CallControlCommandResponse callControlSendDTMF(body, callControlId)

Send DTMF

Sends DTMF tones from this leg. DTMF tones will be heard by the other end of the call.  **Expected Webhooks:**  There are no webhooks associated with this command. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CallCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallCommandsApi apiInstance = new CallCommandsApi();
SendDTMFRequest body = new SendDTMFRequest(); // SendDTMFRequest | Send DTMF request
String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
try {
    CallControlCommandResponse result = apiInstance.callControlSendDTMF(body, callControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallCommandsApi#callControlSendDTMF");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SendDTMFRequest**](SendDTMFRequest.md)| Send DTMF request |
 **callControlId** | **String**| Unique identifier and token for controlling the call |

### Return type

[**CallControlCommandResponse**](CallControlCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="callControlSpeak"></a>
# **callControlSpeak**
> CallControlCommandResponse callControlSpeak(body, callControlId)

Speak text

Convert text to speech and play it back on the call. If multiple speak text commands are issued consecutively, the audio files will be placed in a queue awaiting playback.  **Expected Webhooks:**  - &#x60;call.speak.started&#x60; - &#x60;call.speak.ended&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CallCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallCommandsApi apiInstance = new CallCommandsApi();
SpeakRequest body = new SpeakRequest(); // SpeakRequest | Speak request
String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
try {
    CallControlCommandResponse result = apiInstance.callControlSpeak(body, callControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallCommandsApi#callControlSpeak");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SpeakRequest**](SpeakRequest.md)| Speak request |
 **callControlId** | **String**| Unique identifier and token for controlling the call |

### Return type

[**CallControlCommandResponse**](CallControlCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="callControlTransfer"></a>
# **callControlTransfer**
> CallControlCommandResponse callControlTransfer(body, callControlId)

Transfer call

Transfer a call to a new destination. If the transfer is unsuccessful, a &#x60;call.hangup&#x60; webhook will be sent indicating that the transfer could not be completed. The original call will remain active and may be issued additional commands, potentially transfering the call to an alternate destination.  **Expected Webhooks:**  - &#x60;call.initiated&#x60; - &#x60;call.bridged&#x60; to Leg B - &#x60;call.answered&#x60; or &#x60;call.hangup&#x60; - &#x60;call.machine.detection.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested - &#x60;call.machine.greeting.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested to detect the end of machine greeting 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CallCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallCommandsApi apiInstance = new CallCommandsApi();
TransferCallRequest body = new TransferCallRequest(); // TransferCallRequest | Transfer call request
String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
try {
    CallControlCommandResponse result = apiInstance.callControlTransfer(body, callControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallCommandsApi#callControlTransfer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TransferCallRequest**](TransferCallRequest.md)| Transfer call request |
 **callControlId** | **String**| Unique identifier and token for controlling the call |

### Return type

[**CallControlCommandResponse**](CallControlCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

