# CallCommandsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callAnswer**](CallCommandsApi.md#callAnswer) | **POST** /calls/{call_control_id}/actions/answer | Answer call
[**callBridge**](CallCommandsApi.md#callBridge) | **POST** /calls/{call_control_id}/actions/bridge | Bridge calls
[**callDial**](CallCommandsApi.md#callDial) | **POST** /calls | Dial
[**callForkStart**](CallCommandsApi.md#callForkStart) | **POST** /calls/{call_control_id}/actions/fork_start | Forking start
[**callForkStop**](CallCommandsApi.md#callForkStop) | **POST** /calls/{call_control_id}/actions/fork_stop | Forking stop
[**callGatherStop**](CallCommandsApi.md#callGatherStop) | **POST** /calls/{call_control_id}/actions/gather_stop | Gather stop
[**callGatherUsingAudio**](CallCommandsApi.md#callGatherUsingAudio) | **POST** /calls/{call_control_id}/actions/gather_using_audio | Gather using audio
[**callGatherUsingSpeak**](CallCommandsApi.md#callGatherUsingSpeak) | **POST** /calls/{call_control_id}/actions/gather_using_speak | Gather using speak
[**callHangup**](CallCommandsApi.md#callHangup) | **POST** /calls/{call_control_id}/actions/hangup | Hangup call
[**callPlaybackStart**](CallCommandsApi.md#callPlaybackStart) | **POST** /calls/{call_control_id}/actions/playback_start | Play audio URL
[**callPlaybackStop**](CallCommandsApi.md#callPlaybackStop) | **POST** /calls/{call_control_id}/actions/playback_stop | Stop audio playback
[**callRecordStart**](CallCommandsApi.md#callRecordStart) | **POST** /calls/{call_control_id}/actions/record_start | Recording start
[**callRecordStop**](CallCommandsApi.md#callRecordStop) | **POST** /calls/{call_control_id}/actions/record_stop | Recording stop
[**callReject**](CallCommandsApi.md#callReject) | **POST** /calls/{call_control_id}/actions/reject | Reject a call
[**callSendDTMF**](CallCommandsApi.md#callSendDTMF) | **POST** /calls/{call_control_id}/actions/send_dtmf | Send DTMF
[**callSpeak**](CallCommandsApi.md#callSpeak) | **POST** /calls/{call_control_id}/actions/speak | Speak text
[**callTransfer**](CallCommandsApi.md#callTransfer) | **POST** /calls/{call_control_id}/actions/transfer | Transfer call


<a name="callAnswer"></a>
# **callAnswer**
> CallControlCommandResponse callAnswer(callControlId, answerRequest).execute();

Answer call

Answer an incoming call. You must issue this command before executing subsequent commands on an incoming call.  **Expected Webhooks:**  - &#x60;call.answered&#x60; 

### Example
```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.telnyx.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
    String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
    AnswerRequest answerRequest = new AnswerRequest(); // AnswerRequest | Answer call request
    try {
      CallControlCommandResponse result = apiInstance.callAnswer(callControlId, answerRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallCommandsApi#callAnswer");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callControlId** | **String**| Unique identifier and token for controlling the call |
 **answerRequest** | [**AnswerRequest**](AnswerRequest.md)| Answer call request |

### Return type

[**CallControlCommandResponse**](CallControlCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response upon making a call control command. |  -  |
**0** | Unexpected error |  -  |

<a name="callBridge"></a>
# **callBridge**
> CallControlCommandResponse callBridge(callControlId, bridgeRequest).execute();

Bridge calls

Bridge two call control calls.  **Expected Webhooks:**  - &#x60;call.bridged&#x60; for Leg A - &#x60;call.bridged&#x60; for Leg B 

### Example
```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.telnyx.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
    String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
    BridgeRequest bridgeRequest = new BridgeRequest(); // BridgeRequest | Bridge call request
    try {
      CallControlCommandResponse result = apiInstance.callBridge(callControlId, bridgeRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallCommandsApi#callBridge");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callControlId** | **String**| Unique identifier and token for controlling the call |
 **bridgeRequest** | [**BridgeRequest**](BridgeRequest.md)| Bridge call request |

### Return type

[**CallControlCommandResponse**](CallControlCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response upon making a call control command. |  -  |
**0** | Unexpected error |  -  |

<a name="callDial"></a>
# **callDial**
> RetrieveCallStatusResponse callDial(callRequest).execute();

Dial

Dial a number or SIP URI from a given connection. A successful response will include a &#x60;call_leg_id&#x60; which can be used to correlate the command with subsequent webhooks.  **Expected Webhooks:**  - &#x60;call.initiated&#x60; - &#x60;call.answered&#x60; or &#x60;call.hangup&#x60; - &#x60;call.machine.detection.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested - &#x60;call.machine.greeting.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested to detect the end of machine greeting - &#x60;call.machine.premium.detection.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested - &#x60;call.machine.premium.greeting.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested and a beep was detected 

### Example
```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.telnyx.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
    CallRequest callRequest = new CallRequest(); // CallRequest | Call request
    try {
      RetrieveCallStatusResponse result = apiInstance.callDial(callRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallCommandsApi#callDial");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callRequest** | [**CallRequest**](CallRequest.md)| Call request |

### Return type

[**RetrieveCallStatusResponse**](RetrieveCallStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response with details about a call status. |  -  |
**0** | Unexpected error |  -  |

<a name="callForkStart"></a>
# **callForkStart**
> CallControlCommandResponse callForkStart(callControlId, startForkingRequest).execute();

Forking start

Call forking allows you to stream the media from a call to a specific target in realtime.  This stream can be used to enable realtime audio analysis to support a  variety of use cases, including fraud detection, or the creation of AI-generated audio responses.  Requests must specify either the &#x60;target&#x60; attribute or the &#x60;rx&#x60; and &#x60;tx&#x60; attributes.  **Expected Webhooks:**  - &#x60;call.fork.started&#x60; - &#x60;call.fork.stopped&#x60;  **Simple Telnyx RTP Encapsulation Protocol (STREP)**  *Note: This header/encapsulation is not used when the &#x60;rx&#x60; and &#x60;tx&#x60; parameters have been specified; it only applies when media is forked using the &#x60;target&#x60; attribute.*  If the destination for forked media is specified using the \&quot;target\&quot; attribute, the RTP will be encapsulated in an extra Telnyx protocol, which adds a 24 byte header to the RTP payload in each packet. The STREP header includes the Call Control &#x60;call_leg_id&#x60; for stream identification, along with bits that represent the direction (inbound or outbound) of the media. This 24-byte header sits between the UDP header and the RTP header.  The STREP header makes it possible to fork RTP for multiple calls (or two RTP streams for the same call) to the same IP:port, where the streams can be demultiplexed by your application using the information in the header. Of course, it&#39;s still possible to ignore this header completely, for example, if sending forked media for different calls to different ports or IP addresses. In this case, simply strip 24 bytes (or use the second byte to find the header length) from the received UDP payload to get the RTP (RTP header and payload).  &#x60;&#x60;&#x60; STREP Specification    0                   1                   2                   3   0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+  |1 1|Version|L|D|    HeaderLen  |  reserved (2 bytes)           |  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+  |       reserved (4 bytes, for UDP ports or anything else)      |  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+  |               The call_leg_id                                 |  |                   from Call Control                           |  |                       (128 bits / 16 bytes)                   |  |                           (this is binary data)               |  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+   11    Static bits 11, always set to 11 to easily distinguish forked media    from RTP (10) and T.38 media (usually 00) and SIP (which begins    with a capital letter, so begins with bits 01). This is a magic number.   Version    Four bits to indicate the version number of the protocol, starting at 0001.   L    One bit to represent the leg of the call (A or B).    0 represents the A (first) leg of the call.    1 represents the B (second) leg of the call.   D    One bit to represent the direction of this RTP stream.    0 represents media received by Telnyx.    1 represents media transmitted by Telnyx.   HeaderLen (1 byte)    The length of the header in bytes.    Note that this value does not include the length of the payload. The total    size of the RTP can be calculated by subtracting the HeaderLen from the UDP    length (minus 8 for the UDP header).    In version 1, this value will always be 24.   Reserved (6 bytes)    Reserved for future use and to make sure that the header is a multiple of 32 bits   Call Leg ID    A 128-bit identifier for the call leg.    This is the call_leg_id from Call Control. &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.telnyx.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
    String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
    StartForkingRequest startForkingRequest = new StartForkingRequest(); // StartForkingRequest | Fork media request
    try {
      CallControlCommandResponse result = apiInstance.callForkStart(callControlId, startForkingRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallCommandsApi#callForkStart");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callControlId** | **String**| Unique identifier and token for controlling the call |
 **startForkingRequest** | [**StartForkingRequest**](StartForkingRequest.md)| Fork media request |

### Return type

[**CallControlCommandResponse**](CallControlCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response upon making a call control command. |  -  |
**0** | Unexpected error |  -  |

<a name="callForkStop"></a>
# **callForkStop**
> CallControlCommandResponse callForkStop(callControlId, stopForkingRequest).execute();

Forking stop

Stop forking a call.  **Expected Webhooks:**  - &#x60;call.fork.stopped&#x60; 

### Example
```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.telnyx.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
    String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
    StopForkingRequest stopForkingRequest = new StopForkingRequest(); // StopForkingRequest | Stop forking media request
    try {
      CallControlCommandResponse result = apiInstance.callForkStop(callControlId, stopForkingRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallCommandsApi#callForkStop");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callControlId** | **String**| Unique identifier and token for controlling the call |
 **stopForkingRequest** | [**StopForkingRequest**](StopForkingRequest.md)| Stop forking media request |

### Return type

[**CallControlCommandResponse**](CallControlCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response upon making a call control command. |  -  |
**0** | Unexpected error |  -  |

<a name="callGatherStop"></a>
# **callGatherStop**
> CallControlCommandResponse callGatherStop(callControlId, stopGatherRequest).execute();

Gather stop

Stop current gather.  **Expected Webhooks:**  - &#x60;call.gather.ended&#x60; 

### Example
```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.telnyx.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
    String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
    StopGatherRequest stopGatherRequest = new StopGatherRequest(); // StopGatherRequest | Stop current gather
    try {
      CallControlCommandResponse result = apiInstance.callGatherStop(callControlId, stopGatherRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallCommandsApi#callGatherStop");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callControlId** | **String**| Unique identifier and token for controlling the call |
 **stopGatherRequest** | [**StopGatherRequest**](StopGatherRequest.md)| Stop current gather |

### Return type

[**CallControlCommandResponse**](CallControlCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response upon making a call control command. |  -  |
**0** | Unexpected error |  -  |

<a name="callGatherUsingAudio"></a>
# **callGatherUsingAudio**
> CallControlCommandResponse callGatherUsingAudio(callControlId, gatherUsingAudioRequest).execute();

Gather using audio

Play an audio file on the call until the required DTMF signals are gathered to build interactive menus.  You can pass a list of valid digits along with an &#39;invalid_audio_url&#39;, which will be played back at the beginning of each prompt. Playback will be interrupted when a DTMF signal is received. The [Answer](/docs/api/v2/call-control/Call-Commands#CallControlAnswer) command must be issued before the &#x60;gather_using_audio&#x60; command.  **Expected Webhooks:**  - &#x60;call.playback.started&#x60; - &#x60;call.playback.ended&#x60; - &#x60;call.dtmf.received&#x60; (you may receive many of these webhooks) - &#x60;call.gather.ended&#x60; 

### Example
```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.telnyx.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
    String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
    GatherUsingAudioRequest gatherUsingAudioRequest = new GatherUsingAudioRequest(); // GatherUsingAudioRequest | Gather using audio request
    try {
      CallControlCommandResponse result = apiInstance.callGatherUsingAudio(callControlId, gatherUsingAudioRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallCommandsApi#callGatherUsingAudio");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callControlId** | **String**| Unique identifier and token for controlling the call |
 **gatherUsingAudioRequest** | [**GatherUsingAudioRequest**](GatherUsingAudioRequest.md)| Gather using audio request |

### Return type

[**CallControlCommandResponse**](CallControlCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response upon making a call control command. |  -  |
**0** | Unexpected error |  -  |

<a name="callGatherUsingSpeak"></a>
# **callGatherUsingSpeak**
> CallControlCommandResponse callGatherUsingSpeak(callControlId, gatherUsingSpeakRequest).execute();

Gather using speak

Convert text to speech and play it on the call until the required DTMF signals are gathered to build interactive menus.  You can pass a list of valid digits along with an &#39;invalid_payload&#39;, which will be played back at the beginning of each prompt. Speech will be interrupted when a DTMF signal is received. The [Answer](/docs/api/v2/call-control/Call-Commands#CallControlAnswer) command must be issued before the &#x60;gather_using_speak&#x60; command.  **Expected Webhooks:**  - &#x60;call.dtmf.received&#x60; (you may receive many of these webhooks) - &#x60;call.gather.ended&#x60; 

### Example
```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.telnyx.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
    String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
    GatherUsingSpeakRequest gatherUsingSpeakRequest = new GatherUsingSpeakRequest(); // GatherUsingSpeakRequest | Gather using speak request
    try {
      CallControlCommandResponse result = apiInstance.callGatherUsingSpeak(callControlId, gatherUsingSpeakRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallCommandsApi#callGatherUsingSpeak");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callControlId** | **String**| Unique identifier and token for controlling the call |
 **gatherUsingSpeakRequest** | [**GatherUsingSpeakRequest**](GatherUsingSpeakRequest.md)| Gather using speak request |

### Return type

[**CallControlCommandResponse**](CallControlCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response upon making a call control command. |  -  |
**0** | Unexpected error |  -  |

<a name="callHangup"></a>
# **callHangup**
> CallControlCommandResponse callHangup(callControlId, hangupRequest).execute();

Hangup call

Hang up the call.  **Expected Webhooks:**  - &#x60;call.hangup&#x60; - &#x60;call.recording.saved&#x60; 

### Example
```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.telnyx.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
    String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
    HangupRequest hangupRequest = new HangupRequest(); // HangupRequest | Hangup request
    try {
      CallControlCommandResponse result = apiInstance.callHangup(callControlId, hangupRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallCommandsApi#callHangup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callControlId** | **String**| Unique identifier and token for controlling the call |
 **hangupRequest** | [**HangupRequest**](HangupRequest.md)| Hangup request |

### Return type

[**CallControlCommandResponse**](CallControlCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response upon making a call control command. |  -  |
**0** | Unexpected error |  -  |

<a name="callPlaybackStart"></a>
# **callPlaybackStart**
> CallControlCommandResponse callPlaybackStart(callControlId, playAudioUrlRequest).execute();

Play audio URL

Play an audio file on the call. If multiple play audio commands are issued consecutively, the audio files will be placed in a queue awaiting playback.  *Notes:*  - When &#x60;overlay&#x60; is enabled, &#x60;loop&#x60; is limited to 1, and &#x60;target_legs&#x60; is limited to &#x60;self&#x60;. - A customer cannot Play Audio with &#x60;overlay&#x3D;true&#x60; unless there is a Play Audio with &#x60;overlay&#x3D;false&#x60; actively playing.  **Expected Webhooks:**  - &#x60;call.playback.started&#x60; - &#x60;call.playback.ended&#x60; 

### Example
```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.telnyx.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
    String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
    PlayAudioUrlRequest playAudioUrlRequest = new PlayAudioUrlRequest(); // PlayAudioUrlRequest | Play audio URL request
    try {
      CallControlCommandResponse result = apiInstance.callPlaybackStart(callControlId, playAudioUrlRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallCommandsApi#callPlaybackStart");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callControlId** | **String**| Unique identifier and token for controlling the call |
 **playAudioUrlRequest** | [**PlayAudioUrlRequest**](PlayAudioUrlRequest.md)| Play audio URL request |

### Return type

[**CallControlCommandResponse**](CallControlCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response upon making a call control command. |  -  |
**0** | Unexpected error |  -  |

<a name="callPlaybackStop"></a>
# **callPlaybackStop**
> CallControlCommandResponse callPlaybackStop(callControlId, playbackStopRequest).execute();

Stop audio playback

Stop audio being played on the call.  **Expected Webhooks:**  - &#x60;call.playback.ended&#x60; or &#x60;call.speak.ended&#x60; 

### Example
```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.telnyx.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
    String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
    PlaybackStopRequest playbackStopRequest = new PlaybackStopRequest(); // PlaybackStopRequest | Stop audio playback request
    try {
      CallControlCommandResponse result = apiInstance.callPlaybackStop(callControlId, playbackStopRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallCommandsApi#callPlaybackStop");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callControlId** | **String**| Unique identifier and token for controlling the call |
 **playbackStopRequest** | [**PlaybackStopRequest**](PlaybackStopRequest.md)| Stop audio playback request |

### Return type

[**CallControlCommandResponse**](CallControlCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response upon making a call control command. |  -  |
**0** | Unexpected error |  -  |

<a name="callRecordStart"></a>
# **callRecordStart**
> CallControlCommandResponse callRecordStart(callControlId, startRecordingRequest).execute();

Recording start

Start recording the call. Recording will stop on call hang-up, or can be initiated via the Stop Recording command.  **Expected Webhooks:**  - &#x60;call.recording.saved&#x60; 

### Example
```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.telnyx.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
    String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
    StartRecordingRequest startRecordingRequest = new StartRecordingRequest(); // StartRecordingRequest | Start recording audio request
    try {
      CallControlCommandResponse result = apiInstance.callRecordStart(callControlId, startRecordingRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallCommandsApi#callRecordStart");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callControlId** | **String**| Unique identifier and token for controlling the call |
 **startRecordingRequest** | [**StartRecordingRequest**](StartRecordingRequest.md)| Start recording audio request |

### Return type

[**CallControlCommandResponse**](CallControlCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response upon making a call control command. |  -  |
**0** | Unexpected error |  -  |

<a name="callRecordStop"></a>
# **callRecordStop**
> CallControlCommandResponse callRecordStop(callControlId, stopRecordingRequest).execute();

Recording stop

Stop recording the call.  **Expected Webhooks:**  - &#x60;call.recording.saved&#x60; 

### Example
```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.telnyx.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
    String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
    StopRecordingRequest stopRecordingRequest = new StopRecordingRequest(); // StopRecordingRequest | Stop recording call request
    try {
      CallControlCommandResponse result = apiInstance.callRecordStop(callControlId, stopRecordingRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallCommandsApi#callRecordStop");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callControlId** | **String**| Unique identifier and token for controlling the call |
 **stopRecordingRequest** | [**StopRecordingRequest**](StopRecordingRequest.md)| Stop recording call request |

### Return type

[**CallControlCommandResponse**](CallControlCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response upon making a call control command. |  -  |
**0** | Unexpected error |  -  |

<a name="callReject"></a>
# **callReject**
> CallControlCommandResponse callReject(callControlId, rejectRequest).execute();

Reject a call

Reject an incoming call.  **Expected Webhooks:**  - &#x60;call.hangup&#x60; 

### Example
```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.telnyx.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
    String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
    RejectRequest rejectRequest = new RejectRequest(); // RejectRequest | Reject request
    try {
      CallControlCommandResponse result = apiInstance.callReject(callControlId, rejectRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallCommandsApi#callReject");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callControlId** | **String**| Unique identifier and token for controlling the call |
 **rejectRequest** | [**RejectRequest**](RejectRequest.md)| Reject request |

### Return type

[**CallControlCommandResponse**](CallControlCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response upon making a call control command. |  -  |
**0** | Unexpected error |  -  |

<a name="callSendDTMF"></a>
# **callSendDTMF**
> CallControlCommandResponse callSendDTMF(callControlId, sendDTMFRequest).execute();

Send DTMF

Sends DTMF tones from this leg. DTMF tones will be heard by the other end of the call.  **Expected Webhooks:**  There are no webhooks associated with this command. 

### Example
```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.telnyx.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
    String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
    SendDTMFRequest sendDTMFRequest = new SendDTMFRequest(); // SendDTMFRequest | Send DTMF request
    try {
      CallControlCommandResponse result = apiInstance.callSendDTMF(callControlId, sendDTMFRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallCommandsApi#callSendDTMF");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callControlId** | **String**| Unique identifier and token for controlling the call |
 **sendDTMFRequest** | [**SendDTMFRequest**](SendDTMFRequest.md)| Send DTMF request |

### Return type

[**CallControlCommandResponse**](CallControlCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response upon making a call control command. |  -  |
**0** | Unexpected error |  -  |

<a name="callSpeak"></a>
# **callSpeak**
> CallControlCommandResponse callSpeak(callControlId, speakRequest).execute();

Speak text

Convert text to speech and play it back on the call. If multiple speak text commands are issued consecutively, the audio files will be placed in a queue awaiting playback.  **Expected Webhooks:**  - &#x60;call.speak.started&#x60; - &#x60;call.speak.ended&#x60; 

### Example
```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.telnyx.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
    String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
    SpeakRequest speakRequest = new SpeakRequest(); // SpeakRequest | Speak request
    try {
      CallControlCommandResponse result = apiInstance.callSpeak(callControlId, speakRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallCommandsApi#callSpeak");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callControlId** | **String**| Unique identifier and token for controlling the call |
 **speakRequest** | [**SpeakRequest**](SpeakRequest.md)| Speak request |

### Return type

[**CallControlCommandResponse**](CallControlCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response upon making a call control command. |  -  |
**0** | Unexpected error |  -  |

<a name="callTransfer"></a>
# **callTransfer**
> CallControlCommandResponse callTransfer(callControlId, transferCallRequest).execute();

Transfer call

Transfer a call to a new destination. If the transfer is unsuccessful, a &#x60;call.hangup&#x60; webhook for the other call (Leg B) will be sent indicating that the transfer could not be completed. The original call will remain active and may be issued additional commands, potentially transfering the call to an alternate destination.  **Expected Webhooks:**  - &#x60;call.initiated&#x60; - &#x60;call.bridged&#x60; to Leg B - &#x60;call.answered&#x60; or &#x60;call.hangup&#x60; - &#x60;call.machine.detection.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested - &#x60;call.machine.greeting.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested to detect the end of machine greeting - &#x60;call.machine.premium.detection.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested - &#x60;call.machine.premium.greeting.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested and a beep was detected 

### Example
```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CallCommandsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.telnyx.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
    String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
    TransferCallRequest transferCallRequest = new TransferCallRequest(); // TransferCallRequest | Transfer call request
    try {
      CallControlCommandResponse result = apiInstance.callTransfer(callControlId, transferCallRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallCommandsApi#callTransfer");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callControlId** | **String**| Unique identifier and token for controlling the call |
 **transferCallRequest** | [**TransferCallRequest**](TransferCallRequest.md)| Transfer call request |

### Return type

[**CallControlCommandResponse**](CallControlCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response upon making a call control command. |  -  |
**0** | Unexpected error |  -  |

