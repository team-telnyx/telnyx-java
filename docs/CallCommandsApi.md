# CallCommandsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callAnswer**](CallCommandsApi.md#callAnswer) | **POST** /calls/{call_control_id}/actions/answer | Answer a call
[**callBridge**](CallCommandsApi.md#callBridge) | **POST** /calls/{call_control_id}/actions/bridge | Bridge calls
[**callDial**](CallCommandsApi.md#callDial) | **POST** /calls | Dial a call
[**callForkStart**](CallCommandsApi.md#callForkStart) | **POST** /calls/{call_control_id}/actions/fork_start | Start forking a call
[**callForkStop**](CallCommandsApi.md#callForkStop) | **POST** /calls/{call_control_id}/actions/fork_stop | Stop forking a call
[**callGatherStop**](CallCommandsApi.md#callGatherStop) | **POST** /calls/{call_control_id}/actions/gather_stop | Gather stop on a call
[**callGatherUsingAudio**](CallCommandsApi.md#callGatherUsingAudio) | **POST** /calls/{call_control_id}/actions/gather_using_audio | Gather using audio on a call
[**callGatherUsingSpeak**](CallCommandsApi.md#callGatherUsingSpeak) | **POST** /calls/{call_control_id}/actions/gather_using_speak | Gather using speak on a call
[**callHangup**](CallCommandsApi.md#callHangup) | **POST** /calls/{call_control_id}/actions/hangup | Hangup a call
[**callPlaybackStart**](CallCommandsApi.md#callPlaybackStart) | **POST** /calls/{call_control_id}/actions/playback_start | Play audio URL on a call
[**callPlaybackStop**](CallCommandsApi.md#callPlaybackStop) | **POST** /calls/{call_control_id}/actions/playback_stop | Stop audio playback on a call
[**callRecordStart**](CallCommandsApi.md#callRecordStart) | **POST** /calls/{call_control_id}/actions/record_start | Start recording a call
[**callRecordStop**](CallCommandsApi.md#callRecordStop) | **POST** /calls/{call_control_id}/actions/record_stop | Stop recording a call
[**callReject**](CallCommandsApi.md#callReject) | **POST** /calls/{call_control_id}/actions/reject | Reject a call
[**callSendDTMF**](CallCommandsApi.md#callSendDTMF) | **POST** /calls/{call_control_id}/actions/send_dtmf | Send DTMF on a call
[**callSpeak**](CallCommandsApi.md#callSpeak) | **POST** /calls/{call_control_id}/actions/speak | Speak text on a call
[**callTransfer**](CallCommandsApi.md#callTransfer) | **POST** /calls/{call_control_id}/actions/transfer | Transfer a call

<a name="callAnswer"></a>
# **callAnswer**
> CallControlCommandResponse callAnswer(body, callControlId)

Answer a call

Answer an incoming call. You must issue this command before executing subsequent commands on an incoming call.  **Expected Webhooks:**  - &#x60;call.answered&#x60; 

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.CallCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallCommandsApi apiInstance = new CallCommandsApi();
AnswerRequest body = new AnswerRequest(); // AnswerRequest | Answer call request
String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
try {
    CallControlCommandResponse result = apiInstance.callAnswer(body, callControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallCommandsApi#callAnswer");
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

<a name="callBridge"></a>
# **callBridge**
> CallControlCommandResponse callBridge(body, callControlId)

Bridge calls

Bridge two call control calls.  **Expected Webhooks:**  - &#x60;call.bridged&#x60; for Leg A - &#x60;call.bridged&#x60; for Leg B 

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.CallCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallCommandsApi apiInstance = new CallCommandsApi();
BridgeRequest body = new BridgeRequest(); // BridgeRequest | Bridge call request
String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
try {
    CallControlCommandResponse result = apiInstance.callBridge(body, callControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallCommandsApi#callBridge");
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

<a name="callDial"></a>
# **callDial**
> RetrieveCallStatusResponse callDial(body)

Dial a call

Dial a number from a given connection. A successful response will include a &#x60;call_leg_id&#x60; which can be used to correlate the command with subsequent webhooks.  **Expected Webhooks:**  - &#x60;call.initiated&#x60; - &#x60;call.answered&#x60; or &#x60;call.hangup&#x60; - &#x60;call.machine.detection.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested - &#x60;call.machine.greeting.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested to detect the end of machine greeting - &#x60;call.machine.premium.detection.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested - &#x60;call.machine.premium.greeting.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested and a beep was detected 

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.CallCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallCommandsApi apiInstance = new CallCommandsApi();
DialRequest body = new DialRequest(); // DialRequest | Dial request
try {
    RetrieveCallStatusResponse result = apiInstance.callDial(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallCommandsApi#callDial");
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

<a name="callForkStart"></a>
# **callForkStart**
> CallControlCommandResponse callForkStart(body, callControlId)

Start forking a call

Call forking allows you to stream the media from a call to a specific target in realtime.  This stream can be used to enable realtime audio analysis to support a  variety of use cases, including fraud detection, or the creation of AI-generated audio responses.  Requests must specify either the &#x60;target&#x60; attribute or the &#x60;rx&#x60; and &#x60;tx&#x60; attributes.  **Expected Webhooks:**  - &#x60;call.fork.started&#x60; - &#x60;call.fork.stopped&#x60;  **Simple Telnyx RTP Encapsulation Protocol (STREP)**  *Note: This header/encapsulation is not used when the &#x60;rx&#x60; and &#x60;tx&#x60; parameters have been specified; it only applies when media is forked using the &#x60;target&#x60; attribute.*  If the destination for forked media is specified using the \&quot;target\&quot; attribute, the RTP will be encapsulated in an extra Telnyx protocol, which adds a 24 byte header to the RTP payload in each packet. The STREP header includes the Call Control &#x60;call_leg_id&#x60; for stream identification, along with bits that represent the direction (inbound or outbound) of the media. This 24-byte header sits between the UDP header and the RTP header.  The STREP header makes it possible to fork RTP for multiple calls (or two RTP streams for the same call) to the same IP:port, where the streams can be demultiplexed by your application using the information in the header. Of course, it&#x27;s still possible to ignore this header completely, for example, if sending forked media for different calls to different ports or IP addresses. In this case, simply strip 24 bytes (or use the second byte to find the header length) from the received UDP payload to get the RTP (RTP header and payload).  &#x60;&#x60;&#x60; STREP Specification    0                   1                   2                   3   0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+  |1 1|Version|L|D|    HeaderLen  |  reserved (2 bytes)           |  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+  |       reserved (4 bytes, for UDP ports or anything else)      |  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+  |               The call_leg_id                                 |  |                   from Call Control                           |  |                       (128 bits / 16 bytes)                   |  |                           (this is binary data)               |  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+   11    Static bits 11, always set to 11 to easily distinguish forked media    from RTP (10) and T.38 media (usually 00) and SIP (which begins    with a capital letter, so begins with bits 01). This is a magic number.   Version    Four bits to indicate the version number of the protocol, starting at 0001.   L    One bit to represent the leg of the call (A or B).    0 represents the A (first) leg of the call.    1 represents the B (second) leg of the call.   D    One bit to represent the direction of this RTP stream.    0 represents media received by Telnyx.    1 represents media transmitted by Telnyx.   HeaderLen (1 byte)    The length of the header in bytes.    Note that this value does not include the length of the payload. The total    size of the RTP can be calculated by subtracting the HeaderLen from the UDP    length (minus 8 for the UDP header).    In version 1, this value will always be 24.   Reserved (6 bytes)    Reserved for future use and to make sure that the header is a multiple of 32 bits   Call Leg ID    A 128-bit identifier for the call leg.    This is the call_leg_id from Call Control. &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.CallCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallCommandsApi apiInstance = new CallCommandsApi();
StartForkingRequest body = new StartForkingRequest(); // StartForkingRequest | Fork media request
String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
try {
    CallControlCommandResponse result = apiInstance.callForkStart(body, callControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallCommandsApi#callForkStart");
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

<a name="callForkStop"></a>
# **callForkStop**
> CallControlCommandResponse callForkStop(body, callControlId)

Stop forking a call

Stop forking a call.  **Expected Webhooks:**  - &#x60;call.fork.stopped&#x60; 

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.CallCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallCommandsApi apiInstance = new CallCommandsApi();
StopForkingRequest body = new StopForkingRequest(); // StopForkingRequest | Stop forking media request
String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
try {
    CallControlCommandResponse result = apiInstance.callForkStop(body, callControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallCommandsApi#callForkStop");
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

<a name="callGatherStop"></a>
# **callGatherStop**
> CallControlCommandResponse callGatherStop(body, callControlId)

Gather stop on a call

Stop current gather.  **Expected Webhooks:**  - &#x60;call.gather.ended&#x60; 

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.CallCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallCommandsApi apiInstance = new CallCommandsApi();
StopGatherRequest body = new StopGatherRequest(); // StopGatherRequest | Stop current gather
String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
try {
    CallControlCommandResponse result = apiInstance.callGatherStop(body, callControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallCommandsApi#callGatherStop");
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

<a name="callGatherUsingAudio"></a>
# **callGatherUsingAudio**
> CallControlCommandResponse callGatherUsingAudio(body, callControlId)

Gather using audio on a call

Play an audio file on the call until the required DTMF signals are gathered to build interactive menus.  You can pass a list of valid digits along with an &#x27;invalid_audio_url&#x27;, which will be played back at the beginning of each prompt. Playback will be interrupted when a DTMF signal is received. The [Answer](/docs/api/v2/call-control/Call-Commands#CallControlAnswer) command must be issued before the &#x60;gather_using_audio&#x60; command.  **Expected Webhooks:**  - &#x60;call.playback.started&#x60; - &#x60;call.playback.ended&#x60; - &#x60;call.dtmf.received&#x60; (you may receive many of these webhooks) - &#x60;call.gather.ended&#x60; 

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.CallCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallCommandsApi apiInstance = new CallCommandsApi();
GatherUsingAudioRequest body = new GatherUsingAudioRequest(); // GatherUsingAudioRequest | Gather using audio request
String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
try {
    CallControlCommandResponse result = apiInstance.callGatherUsingAudio(body, callControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallCommandsApi#callGatherUsingAudio");
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

<a name="callGatherUsingSpeak"></a>
# **callGatherUsingSpeak**
> CallControlCommandResponse callGatherUsingSpeak(body, callControlId)

Gather using speak on a call

Convert text to speech and play it on the call until the required DTMF signals are gathered to build interactive menus.  You can pass a list of valid digits along with an &#x27;invalid_payload&#x27;, which will be played back at the beginning of each prompt. Speech will be interrupted when a DTMF signal is received. The [Answer](/docs/api/v2/call-control/Call-Commands#CallControlAnswer) command must be issued before the &#x60;gather_using_speak&#x60; command.  **Expected Webhooks:**  - &#x60;call.dtmf.received&#x60; (you may receive many of these webhooks) - &#x60;call.gather.ended&#x60; 

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.CallCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallCommandsApi apiInstance = new CallCommandsApi();
GatherUsingSpeakRequest body = new GatherUsingSpeakRequest(); // GatherUsingSpeakRequest | Gather using speak request
String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
try {
    CallControlCommandResponse result = apiInstance.callGatherUsingSpeak(body, callControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallCommandsApi#callGatherUsingSpeak");
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

<a name="callHangup"></a>
# **callHangup**
> CallControlCommandResponse callHangup(body, callControlId)

Hangup a call

Hang up the call.  **Expected Webhooks:**  - &#x60;call.hangup&#x60; - &#x60;call.recording.saved&#x60; 

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.CallCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallCommandsApi apiInstance = new CallCommandsApi();
HangupRequest body = new HangupRequest(); // HangupRequest | Hangup request
String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
try {
    CallControlCommandResponse result = apiInstance.callHangup(body, callControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallCommandsApi#callHangup");
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

<a name="callPlaybackStart"></a>
# **callPlaybackStart**
> CallControlCommandResponse callPlaybackStart(body, callControlId)

Play audio URL on a call

Play an audio file on the call. If multiple play audio commands are issued consecutively, the audio files will be placed in a queue awaiting playback.  *Notes:*  - When &#x60;overlay&#x60; is enabled, &#x60;loop&#x60; is limited to 1, and &#x60;target_legs&#x60; is limited to &#x60;self&#x60;. - A customer cannot Play Audio with &#x60;overlay&#x3D;true&#x60; unless there is a Play Audio with &#x60;overlay&#x3D;false&#x60; actively playing.  **Expected Webhooks:**  - &#x60;call.playback.started&#x60; - &#x60;call.playback.ended&#x60; 

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.CallCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallCommandsApi apiInstance = new CallCommandsApi();
PlayAudioUrlRequest body = new PlayAudioUrlRequest(); // PlayAudioUrlRequest | Play audio URL request
String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
try {
    CallControlCommandResponse result = apiInstance.callPlaybackStart(body, callControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallCommandsApi#callPlaybackStart");
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

<a name="callPlaybackStop"></a>
# **callPlaybackStop**
> CallControlCommandResponse callPlaybackStop(body, callControlId)

Stop audio playback on a call

Stop audio being played on the call.  **Expected Webhooks:**  - &#x60;call.playback.ended&#x60; or &#x60;call.speak.ended&#x60; 

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.CallCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallCommandsApi apiInstance = new CallCommandsApi();
PlaybackStopRequest body = new PlaybackStopRequest(); // PlaybackStopRequest | Stop audio playback request
String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
try {
    CallControlCommandResponse result = apiInstance.callPlaybackStop(body, callControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallCommandsApi#callPlaybackStop");
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

<a name="callRecordStart"></a>
# **callRecordStart**
> CallControlCommandResponse callRecordStart(body, callControlId)

Start recording a call

Start recording the call. Recording will stop on call hang-up, or can be initiated via the Stop Recording command.  **Expected Webhooks:**  - &#x60;call.recording.saved&#x60; 

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.CallCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallCommandsApi apiInstance = new CallCommandsApi();
StartRecordingRequest body = new StartRecordingRequest(); // StartRecordingRequest | Start recording audio request
String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
try {
    CallControlCommandResponse result = apiInstance.callRecordStart(body, callControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallCommandsApi#callRecordStart");
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

<a name="callRecordStop"></a>
# **callRecordStop**
> CallControlCommandResponse callRecordStop(body, callControlId)

Stop recording a call

Stop recording the call.  **Expected Webhooks:**  - &#x60;call.recording.saved&#x60; 

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.CallCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallCommandsApi apiInstance = new CallCommandsApi();
StopRecordingRequest body = new StopRecordingRequest(); // StopRecordingRequest | Stop recording call request
String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
try {
    CallControlCommandResponse result = apiInstance.callRecordStop(body, callControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallCommandsApi#callRecordStop");
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

<a name="callReject"></a>
# **callReject**
> CallControlCommandResponse callReject(body, callControlId)

Reject a call

Reject an incoming call.  **Expected Webhooks:**  - &#x60;call.hangup&#x60; 

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.CallCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallCommandsApi apiInstance = new CallCommandsApi();
RejectRequest body = new RejectRequest(); // RejectRequest | Reject request
String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
try {
    CallControlCommandResponse result = apiInstance.callReject(body, callControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallCommandsApi#callReject");
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

<a name="callSendDTMF"></a>
# **callSendDTMF**
> CallControlCommandResponse callSendDTMF(body, callControlId)

Send DTMF on a call

Sends DTMF tones from this leg. DTMF tones will be heard by the other end of the call.  **Expected Webhooks:**  There are no webhooks associated with this command. 

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.CallCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallCommandsApi apiInstance = new CallCommandsApi();
SendDTMFRequest body = new SendDTMFRequest(); // SendDTMFRequest | Send DTMF request
String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
try {
    CallControlCommandResponse result = apiInstance.callSendDTMF(body, callControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallCommandsApi#callSendDTMF");
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

<a name="callSpeak"></a>
# **callSpeak**
> CallControlCommandResponse callSpeak(body, callControlId)

Speak text on a call

Convert text to speech and play it back on the call. If multiple speak text commands are issued consecutively, the audio files will be placed in a queue awaiting playback.  **Expected Webhooks:**  - &#x60;call.speak.started&#x60; - &#x60;call.speak.ended&#x60; 

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.CallCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallCommandsApi apiInstance = new CallCommandsApi();
SpeakRequest body = new SpeakRequest(); // SpeakRequest | Speak request
String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
try {
    CallControlCommandResponse result = apiInstance.callSpeak(body, callControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallCommandsApi#callSpeak");
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

<a name="callTransfer"></a>
# **callTransfer**
> CallControlCommandResponse callTransfer(body, callControlId)

Transfer a call

Transfer a call to a new destination. If the transfer is unsuccessful, a &#x60;call.hangup&#x60; webhook for the other call (Leg B) will be sent indicating that the transfer could not be completed. The original call will remain active and may be issued additional commands, potentially transfering the call to an alternate destination.  **Expected Webhooks:**  - &#x60;call.initiated&#x60; - &#x60;call.bridged&#x60; to Leg B - &#x60;call.answered&#x60; or &#x60;call.hangup&#x60; - &#x60;call.machine.detection.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested - &#x60;call.machine.greeting.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested to detect the end of machine greeting - &#x60;call.machine.premium.detection.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested - &#x60;call.machine.premium.greeting.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested and a beep was detected 

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.CallCommandsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CallCommandsApi apiInstance = new CallCommandsApi();
TransferCallRequest body = new TransferCallRequest(); // TransferCallRequest | Transfer call request
String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
try {
    CallControlCommandResponse result = apiInstance.callTransfer(body, callControlId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallCommandsApi#callTransfer");
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

