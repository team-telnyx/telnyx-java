# CallCommandsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**answerCall**](CallCommandsApi.md#answerCall) | **POST** /calls/{call_control_id}/actions/answer | Answer call
[**bridgeCall**](CallCommandsApi.md#bridgeCall) | **POST** /calls/{call_control_id}/actions/bridge | Bridge calls
[**dialCall**](CallCommandsApi.md#dialCall) | **POST** /calls | Dial
[**enqueueCall**](CallCommandsApi.md#enqueueCall) | **POST** /calls/{call_control_id}/actions/enqueue | Enqueue call
[**gatherCall**](CallCommandsApi.md#gatherCall) | **POST** /calls/{call_control_id}/actions/gather | Gather
[**gatherUsingAudio**](CallCommandsApi.md#gatherUsingAudio) | **POST** /calls/{call_control_id}/actions/gather_using_audio | Gather using audio
[**gatherUsingSpeak**](CallCommandsApi.md#gatherUsingSpeak) | **POST** /calls/{call_control_id}/actions/gather_using_speak | Gather using speak
[**hangupCall**](CallCommandsApi.md#hangupCall) | **POST** /calls/{call_control_id}/actions/hangup | Hangup call
[**leaveQueue**](CallCommandsApi.md#leaveQueue) | **POST** /calls/{call_control_id}/actions/leave_queue | Remove call from a queue
[**noiseSuppressionStart**](CallCommandsApi.md#noiseSuppressionStart) | **POST** /calls/{call_control_id}/actions/suppression_start | Noise Suppression Start (BETA)
[**noiseSuppressionStop**](CallCommandsApi.md#noiseSuppressionStop) | **POST** /calls/{call_control_id}/actions/suppression_stop | Noise Suppression Stop (BETA)
[**pauseCallRecording**](CallCommandsApi.md#pauseCallRecording) | **POST** /calls/{call_control_id}/actions/record_pause | Record pause
[**referCall**](CallCommandsApi.md#referCall) | **POST** /calls/{call_control_id}/actions/refer | SIP Refer a call
[**rejectCall**](CallCommandsApi.md#rejectCall) | **POST** /calls/{call_control_id}/actions/reject | Reject a call
[**resumeCallRecording**](CallCommandsApi.md#resumeCallRecording) | **POST** /calls/{call_control_id}/actions/record_resume | Record resume
[**sendDTMF**](CallCommandsApi.md#sendDTMF) | **POST** /calls/{call_control_id}/actions/send_dtmf | Send DTMF
[**speakCall**](CallCommandsApi.md#speakCall) | **POST** /calls/{call_control_id}/actions/speak | Speak text
[**startCallFork**](CallCommandsApi.md#startCallFork) | **POST** /calls/{call_control_id}/actions/fork_start | Forking start
[**startCallPlayback**](CallCommandsApi.md#startCallPlayback) | **POST** /calls/{call_control_id}/actions/playback_start | Play audio URL
[**startCallRecord**](CallCommandsApi.md#startCallRecord) | **POST** /calls/{call_control_id}/actions/record_start | Recording start
[**startCallStreaming**](CallCommandsApi.md#startCallStreaming) | **POST** /calls/{call_control_id}/actions/streaming_start | Streaming start
[**startCallTranscription**](CallCommandsApi.md#startCallTranscription) | **POST** /calls/{call_control_id}/actions/transcription_start | Transcription start
[**stopCallFork**](CallCommandsApi.md#stopCallFork) | **POST** /calls/{call_control_id}/actions/fork_stop | Forking stop
[**stopCallGather**](CallCommandsApi.md#stopCallGather) | **POST** /calls/{call_control_id}/actions/gather_stop | Gather stop
[**stopCallPlayback**](CallCommandsApi.md#stopCallPlayback) | **POST** /calls/{call_control_id}/actions/playback_stop | Stop audio playback
[**stopCallRecording**](CallCommandsApi.md#stopCallRecording) | **POST** /calls/{call_control_id}/actions/record_stop | Recording stop
[**stopCallStreaming**](CallCommandsApi.md#stopCallStreaming) | **POST** /calls/{call_control_id}/actions/streaming_stop | Streaming stop
[**stopCallTranscription**](CallCommandsApi.md#stopCallTranscription) | **POST** /calls/{call_control_id}/actions/transcription_stop | Transcription stop
[**transferCall**](CallCommandsApi.md#transferCall) | **POST** /calls/{call_control_id}/actions/transfer | Transfer call
[**updateClientState**](CallCommandsApi.md#updateClientState) | **PUT** /calls/{call_control_id}/actions/client_state_update | Update client state



## answerCall

> CallControlCommandResponse answerCall(callControlId, answerRequest)

Answer call

Answer an incoming call. You must issue this command before executing subsequent commands on an incoming call.

**Expected Webhooks:**

- `call.answered`
- `streaming.started`, `streaming.stopped` or `streaming.failed` if `stream_url` was set


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallCommandsApi;

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
            CallControlCommandResponse result = apiInstance.answerCall(callControlId, answerRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#answerCall");
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
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## bridgeCall

> CallControlCommandResponse bridgeCall(callControlId, bridgeRequest)

Bridge calls

Bridge two call control calls.

**Expected Webhooks:**

- `call.bridged` for Leg A
- `call.bridged` for Leg B


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallCommandsApi;

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
            CallControlCommandResponse result = apiInstance.bridgeCall(callControlId, bridgeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#bridgeCall");
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
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## dialCall

> RetrieveCallStatusResponse dialCall(callRequest)

Dial

Dial a number or SIP URI from a given connection. A successful response will include a `call_leg_id` which can be used to correlate the command with subsequent webhooks.

**Expected Webhooks:**

- `call.initiated`
- `call.answered` or `call.hangup`
- `call.machine.detection.ended` if `answering_machine_detection` was requested
- `call.machine.greeting.ended` if `answering_machine_detection` was requested to detect the end of machine greeting
- `call.machine.premium.detection.ended` if `answering_machine_detection=premium` was requested
- `call.machine.premium.greeting.ended` if `answering_machine_detection=premium` was requested and a beep was detected
- `streaming.started`, `streaming.stopped` or `streaming.failed` if `stream_url` was set


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallCommandsApi;

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
            RetrieveCallStatusResponse result = apiInstance.dialCall(callRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#dialCall");
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
| **200** | Successful response with details about a call status. |  -  |
| **0** | Unexpected error |  -  |


## enqueueCall

> CallControlCommandResponse enqueueCall(callControlId, enqueueRequest)

Enqueue call

Put the call in a queue.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        EnqueueRequest enqueueRequest = new EnqueueRequest(); // EnqueueRequest | Enqueue call request
        try {
            CallControlCommandResponse result = apiInstance.enqueueCall(callControlId, enqueueRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#enqueueCall");
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
 **enqueueRequest** | [**EnqueueRequest**](EnqueueRequest.md)| Enqueue call request |

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
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## gatherCall

> CallControlCommandResponse gatherCall(callControlId, gatherRequest)

Gather

Gather DTMF signals to build interactive menus.

You can pass a list of valid digits. The `Answer` command must be issued before the `gather` command.

**Expected Webhooks:**

- `call.dtmf.received` (you may receive many of these webhooks)
- `call.gather.ended`


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        GatherRequest gatherRequest = new GatherRequest(); // GatherRequest | Gather
        try {
            CallControlCommandResponse result = apiInstance.gatherCall(callControlId, gatherRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#gatherCall");
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
 **gatherRequest** | [**GatherRequest**](GatherRequest.md)| Gather |

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
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## gatherUsingAudio

> CallControlCommandResponse gatherUsingAudio(callControlId, gatherUsingAudioRequest)

Gather using audio

Play an audio file on the call until the required DTMF signals are gathered to build interactive menus.

You can pass a list of valid digits along with an 'invalid_audio_url', which will be played back at the beginning of each prompt. Playback will be interrupted when a DTMF signal is received. The `Answer command must be issued before the `gather_using_audio` command.

**Expected Webhooks:**

- `call.playback.started`
- `call.playback.ended`
- `call.dtmf.received` (you may receive many of these webhooks)
- `call.gather.ended`


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallCommandsApi;

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
            CallControlCommandResponse result = apiInstance.gatherUsingAudio(callControlId, gatherUsingAudioRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#gatherUsingAudio");
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
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## gatherUsingSpeak

> CallControlCommandResponse gatherUsingSpeak(callControlId, gatherUsingSpeakRequest)

Gather using speak

Convert text to speech and play it on the call until the required DTMF signals are gathered to build interactive menus.

You can pass a list of valid digits along with an 'invalid_payload', which will be played back at the beginning of each prompt. Speech will be interrupted when a DTMF signal is received. The `Answer` command must be issued before the `gather_using_speak` command.

**Expected Webhooks:**

- `call.dtmf.received` (you may receive many of these webhooks)
- `call.gather.ended`


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallCommandsApi;

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
            CallControlCommandResponse result = apiInstance.gatherUsingSpeak(callControlId, gatherUsingSpeakRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#gatherUsingSpeak");
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
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## hangupCall

> CallControlCommandResponse hangupCall(callControlId, hangupRequest)

Hangup call

Hang up the call.

**Expected Webhooks:**

- `call.hangup`
- `call.recording.saved`


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallCommandsApi;

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
            CallControlCommandResponse result = apiInstance.hangupCall(callControlId, hangupRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#hangupCall");
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
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## leaveQueue

> CallControlCommandResponse leaveQueue(callControlId, leaveQueueRequest)

Remove call from a queue

Removes the call from a queue.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        LeaveQueueRequest leaveQueueRequest = new LeaveQueueRequest(); // LeaveQueueRequest | Removes the call from the queue, the call currently is enqueued in.
        try {
            CallControlCommandResponse result = apiInstance.leaveQueue(callControlId, leaveQueueRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#leaveQueue");
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
 **leaveQueueRequest** | [**LeaveQueueRequest**](LeaveQueueRequest.md)| Removes the call from the queue, the call currently is enqueued in. |

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
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## noiseSuppressionStart

> CallControlCommandResponse noiseSuppressionStart(callControlId, noiseSuppressionStart)

Noise Suppression Start (BETA)

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        NoiseSuppressionStart noiseSuppressionStart = new NoiseSuppressionStart(); // NoiseSuppressionStart | Start streaming media request
        try {
            CallControlCommandResponse result = apiInstance.noiseSuppressionStart(callControlId, noiseSuppressionStart);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#noiseSuppressionStart");
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
 **noiseSuppressionStart** | [**NoiseSuppressionStart**](NoiseSuppressionStart.md)| Start streaming media request |

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
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## noiseSuppressionStop

> CallControlCommandResponse noiseSuppressionStop(callControlId, noiseSuppressionStop)

Noise Suppression Stop (BETA)

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        NoiseSuppressionStop noiseSuppressionStop = new NoiseSuppressionStop(); // NoiseSuppressionStop | Start streaming media request
        try {
            CallControlCommandResponse result = apiInstance.noiseSuppressionStop(callControlId, noiseSuppressionStop);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#noiseSuppressionStop");
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
 **noiseSuppressionStop** | [**NoiseSuppressionStop**](NoiseSuppressionStop.md)| Start streaming media request |

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
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## pauseCallRecording

> CallControlCommandResponse pauseCallRecording(callControlId, pauseRecordingRequest)

Record pause

Pause recording the call. Recording can be resumed via Resume recording command.

**Expected Webhooks:**

There are no webhooks associated with this command.


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        PauseRecordingRequest pauseRecordingRequest = new PauseRecordingRequest(); // PauseRecordingRequest | Pause recording call request
        try {
            CallControlCommandResponse result = apiInstance.pauseCallRecording(callControlId, pauseRecordingRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#pauseCallRecording");
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
 **pauseRecordingRequest** | [**PauseRecordingRequest**](PauseRecordingRequest.md)| Pause recording call request |

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
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## referCall

> CallControlCommandResponse referCall(callControlId, referRequest)

SIP Refer a call

Initiate a SIP Refer on a Call Control call. You can initiate a SIP Refer at any point in the duration of a call.

**Expected Webhooks:**

- `call.refer.started`
- `call.refer.completed`
- `call.refer.failed`


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        ReferRequest referRequest = new ReferRequest(); // ReferRequest | Refer request
        try {
            CallControlCommandResponse result = apiInstance.referCall(callControlId, referRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#referCall");
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
 **referRequest** | [**ReferRequest**](ReferRequest.md)| Refer request |

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
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## rejectCall

> CallControlCommandResponse rejectCall(callControlId, rejectRequest)

Reject a call

Reject an incoming call.

**Expected Webhooks:**

- `call.hangup`


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallCommandsApi;

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
            CallControlCommandResponse result = apiInstance.rejectCall(callControlId, rejectRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#rejectCall");
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
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## resumeCallRecording

> CallControlCommandResponse resumeCallRecording(callControlId, resumeRecordingRequest)

Record resume

Resume recording the call.

**Expected Webhooks:**

There are no webhooks associated with this command.


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        ResumeRecordingRequest resumeRecordingRequest = new ResumeRecordingRequest(); // ResumeRecordingRequest | Resume recording call request
        try {
            CallControlCommandResponse result = apiInstance.resumeCallRecording(callControlId, resumeRecordingRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#resumeCallRecording");
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
 **resumeRecordingRequest** | [**ResumeRecordingRequest**](ResumeRecordingRequest.md)| Resume recording call request |

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
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## sendDTMF

> CallControlCommandResponse sendDTMF(callControlId, sendDTMFRequest)

Send DTMF

Sends DTMF tones from this leg. DTMF tones will be heard by the other end of the call.

**Expected Webhooks:**

There are no webhooks associated with this command.


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallCommandsApi;

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
            CallControlCommandResponse result = apiInstance.sendDTMF(callControlId, sendDTMFRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#sendDTMF");
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
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## speakCall

> CallControlCommandResponse speakCall(callControlId, speakRequest)

Speak text

Convert text to speech and play it back on the call. If multiple speak text commands are issued consecutively, the audio files will be placed in a queue awaiting playback.

**Expected Webhooks:**

- `call.speak.started`
- `call.speak.ended`


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallCommandsApi;

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
            CallControlCommandResponse result = apiInstance.speakCall(callControlId, speakRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#speakCall");
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
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## startCallFork

> CallControlCommandResponse startCallFork(callControlId, startForkingRequest)

Forking start

Call forking allows you to stream the media from a call to a specific target in realtime. 
This stream can be used to enable realtime audio analysis to support a 
variety of use cases, including fraud detection, or the creation of AI-generated audio responses. 
Requests must specify either the `target` attribute or the `rx` and `tx` attributes.

**Expected Webhooks:**

- `call.fork.started`
- `call.fork.stopped`

**Simple Telnyx RTP Encapsulation Protocol (STREP)**

*Note: This header/encapsulation is not used when the `rx` and `tx`
parameters have been specified; it only applies when media is forked
using the `target` attribute.*

If the destination for forked media is specified using the "target"
attribute, the RTP will be encapsulated in an extra Telnyx protocol,
which adds a 24 byte header to the RTP payload in each packet. The STREP
header includes the Call Control `call_leg_id` for stream
identification, along with bits that represent the direction (inbound or
outbound) of the media. This 24-byte header sits between the UDP header
and the RTP header.

The STREP header makes it possible to fork RTP for multiple calls (or
two RTP streams for the same call) to the same IP:port, where the
streams can be demultiplexed by your application using the information
in the header. Of course, it's still possible to ignore this header
completely, for example, if sending forked media for different calls to
different ports or IP addresses. In this case, simply strip 24 bytes
(or use the second byte to find the header length) from the received UDP
payload to get the RTP (RTP header and payload).

```
STREP Specification

  0                   1                   2                   3
  0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1
 +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
 |1 1|Version|L|D|    HeaderLen  |  reserved (2 bytes)           |
 +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
 |       reserved (4 bytes, for UDP ports or anything else)      |
 +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
 |               The call_leg_id                                 |
 |                   from Call Control                           |
 |                       (128 bits / 16 bytes)                   |
 |                           (this is binary data)               |
 +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+

 11
   Static bits 11, always set to 11 to easily distinguish forked media
   from RTP (10) and T.38 media (usually 00) and SIP (which begins
   with a capital letter, so begins with bits 01). This is a magic number.

 Version
   Four bits to indicate the version number of the protocol, starting at 0001.

 L
   One bit to represent the leg of the call (A or B).
   0 represents the A (first) leg of the call.
   1 represents the B (second) leg of the call.

 D
   One bit to represent the direction of this RTP stream.
   0 represents media received by Telnyx.
   1 represents media transmitted by Telnyx.

 HeaderLen (1 byte)
   The length of the header in bytes.
   Note that this value does not include the length of the payload. The total
   size of the RTP can be calculated by subtracting the HeaderLen from the UDP
   length (minus 8 for the UDP header).
   In version 1, this value will always be 24.

 Reserved (6 bytes)
   Reserved for future use and to make sure that the header is a multiple of 32 bits

 Call Leg ID
   A 128-bit identifier for the call leg.
   This is the call_leg_id from Call Control.
```


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallCommandsApi;

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
            CallControlCommandResponse result = apiInstance.startCallFork(callControlId, startForkingRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#startCallFork");
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
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## startCallPlayback

> CallControlCommandResponse startCallPlayback(callControlId, playAudioUrlRequest)

Play audio URL

Play an audio file on the call. If multiple play audio commands are issued consecutively,
the audio files will be placed in a queue awaiting playback.

*Notes:*

- When `overlay` is enabled, `target_legs` is limited to `self`.
- A customer cannot Play Audio with `overlay=true` unless there is a Play Audio with `overlay=false` actively playing.

**Expected Webhooks:**

- `call.playback.started`
- `call.playback.ended`


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallCommandsApi;

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
            CallControlCommandResponse result = apiInstance.startCallPlayback(callControlId, playAudioUrlRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#startCallPlayback");
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
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## startCallRecord

> CallControlCommandResponse startCallRecord(callControlId, startRecordingRequest)

Recording start

Start recording the call. Recording will stop on call hang-up, or can be initiated via the Stop Recording command.

**Expected Webhooks:**

- `call.recording.saved`


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallCommandsApi;

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
            CallControlCommandResponse result = apiInstance.startCallRecord(callControlId, startRecordingRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#startCallRecord");
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
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## startCallStreaming

> CallControlCommandResponse startCallStreaming(callControlId, startStreamingRequest)

Streaming start

Start streaming the media from a call to a specific WebSocket address or Dialogflow connection in near-realtime. Audio will be delivered as base64-encoded RTP payload (raw audio), wrapped in JSON payloads. 

**Example: Starting a stream to a Websocket address**

 The `stream_url` param is mandatory.

```
curl -X POST \ 
  --header "Content-Type: application/json" \ 
  --header "Accept: application/json" \ 
  --header "Authorization: Bearer YOUR_API_KEY" \ 
  --data '{
 "stream_url": "wss://www.example.com/websocket",\ 
"client_state":"aGF2ZSBhIG5pY2UgZGF5ID1d",\ 
"command_id":"891510ac-f3e4-11e8-af5b-de00688a4901" \ 
}' \ 
  https://api.telnyx.com/v2/calls/{call_control_id}/actions/streaming_start 
``` 

 **Example: Starting a stream to a Dialogflow connection** 

 Enable the Dialogflow integration by sending `"enable_dialogflow": true` in the request. You need to have a Dialogflow connection associated with your Call Control application first, [click here for instructions](https://developers.telnyx.com/docs/voice/programmable-voice/dialogflow-es).
```
curl -X POST \ 
  --header "Content-Type: application/json" \ 
  --header "Accept: application/json" \ 
  --header "Authorization: Bearer YOUR_API_KEY" \ 
  --data '{
 "client_state":"aGF2ZSBhIG5pY2UgZGF5ID1d", \ 
"command_id":"891510ac-f3e4-11e8-af5b-de00688a4901", \ 
"enable_dialogflow": true \ 
}' \ 
  https://api.telnyx.com/v2/calls/{call_control_id}/actions/streaming_start 
```

**Expected Webhooks:**

- `streaming.started`
- `streaming.stopped`
- `streaming.failed`

**WebSocket events**

When the WebSocket connection is established, the following event is being sent over it:
```
{
  "event": "connected",
  "version": "1.0.0"
}
```
And when the call is started, an event which contains information about the encoding and `stream_id` that identifies a particular stream:
```
{
  "event": "start",
  "sequence_number": "1",
  "start": {
    "user_id": "3e6f995f-85f7-4705-9741-53b116d28237",
    "call_control_id": "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg", 
    "client_state": "aGF2ZSBhIG5pY2UgZGF5ID1d",
    "media_format": {
      "encoding": "audio/x-mulaw",
      "sample_rate": 8000,
      "channels": 1
    }
  },
  "stream_id": "32de0dea-53cb-4b21-89a4-9e1819c043bc"
}
```
The start event is followed by the following media events that contain base64-encoded RTP payload (raw audio, no RTP headers) (:
```
{ 
  "event": "media",
  "sequence_number": "4",
  "media": { 
    "track": "inbound/outbound", 
    "chunk": "2",
    "timestamp": "5",
    "payload": "no+JhoaJjpzSHxAKBgYJD...IsSbjomGhoqQn1Ic" 
  },
  "stream_id": "32de0dea-53cb-4b21-89a4-9e1819c043bc" 
}
```
Please note that the order of events is not guaranteed and the chunk number can be used to reorder the events.

When the call ends, the stop event over WebSockets connection is sent:
```
{ 
  "event": "stop",
  "sequence_number": "5",
  "stop": {
    "user_id": "3e6f995f-85f7-4705-9741-53b116d28237",
    "call_control_id": "v2:T02llQxIyaRkhfRKxgAP8nY511EhFLizdvdUKJiSw8d6A9BborherQ"
   },
    "stream_id": "32de0dea-53cb-4b21-89a4-9e1819c043bc" 
 }
```

**Bidirectional Media Streaming**

Media can be sent back to the call through the websocket as well. This is done in a way very similar to the [playback_start](https://developers.telnyx.com/docs/api/v2/call-control/Call-Commands#callPlaybackStart)
command, when using a base64 encoded mp3 file in the payload. Simply send a packet to the websocket connection as follows:

```
{
  "event": "media",
  "media": {
    "payload" : <your base64 encoded mp3 file>
  }
}
```

The payload, which is a base64-encoded mp3 file, will be played on the call.

Some limitations to be aware of:

- Media payloads can only be submitted once per second.
- Media _must_ be base64 encoded mp3

**Stream Errors**

Any errors in the media packet, including when a rate limit is reached, will result in an error frame being
sent to your websocket server. The error frame will appear as follows:

```
{
  "stream_id": "32de0dea-53cb-4b21-89a4-9e1819c043bc",
  "event": "error",
  "sequence_number": "6",
  "error": {
    "title": "rate_limit_reached",
    "code": "100005",
    "detail": "Too many requests"
  }
}
```

Possible errors are as follows:

- Error 100002: `"unknown_error"`
- Error 100003: `"malformed_frame"`
- Error 100004: `"invalid_media"`
- Error 100005: `"rate_limit_reached"`


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        StartStreamingRequest startStreamingRequest = new StartStreamingRequest(); // StartStreamingRequest | Start streaming media request
        try {
            CallControlCommandResponse result = apiInstance.startCallStreaming(callControlId, startStreamingRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#startCallStreaming");
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
 **startStreamingRequest** | [**StartStreamingRequest**](StartStreamingRequest.md)| Start streaming media request |

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
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## startCallTranscription

> CallControlCommandResponse startCallTranscription(callControlId, transcriptionStartRequest)

Transcription start

Start real-time transcription. Transcription will stop on call hang-up, or can be initiated via the Transcription stop command.

**Expected Webhooks:**

- `call.transcription`


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        TranscriptionStartRequest transcriptionStartRequest = new TranscriptionStartRequest(); // TranscriptionStartRequest | Transcription start request
        try {
            CallControlCommandResponse result = apiInstance.startCallTranscription(callControlId, transcriptionStartRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#startCallTranscription");
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
 **transcriptionStartRequest** | [**TranscriptionStartRequest**](TranscriptionStartRequest.md)| Transcription start request |

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
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## stopCallFork

> CallControlCommandResponse stopCallFork(callControlId, stopForkingRequest)

Forking stop

Stop forking a call.

**Expected Webhooks:**

- `call.fork.stopped`


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallCommandsApi;

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
            CallControlCommandResponse result = apiInstance.stopCallFork(callControlId, stopForkingRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#stopCallFork");
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
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## stopCallGather

> CallControlCommandResponse stopCallGather(callControlId, stopGatherRequest)

Gather stop

Stop current gather.

**Expected Webhooks:**

- `call.gather.ended`


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallCommandsApi;

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
            CallControlCommandResponse result = apiInstance.stopCallGather(callControlId, stopGatherRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#stopCallGather");
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
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## stopCallPlayback

> CallControlCommandResponse stopCallPlayback(callControlId, playbackStopRequest)

Stop audio playback

Stop audio being played on the call.

**Expected Webhooks:**

- `call.playback.ended` or `call.speak.ended`


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallCommandsApi;

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
            CallControlCommandResponse result = apiInstance.stopCallPlayback(callControlId, playbackStopRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#stopCallPlayback");
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
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## stopCallRecording

> CallControlCommandResponse stopCallRecording(callControlId, stopRecordingRequest)

Recording stop

Stop recording the call.

**Expected Webhooks:**

- `call.recording.saved`


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallCommandsApi;

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
            CallControlCommandResponse result = apiInstance.stopCallRecording(callControlId, stopRecordingRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#stopCallRecording");
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
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## stopCallStreaming

> CallControlCommandResponse stopCallStreaming(callControlId, stopStreamingRequest)

Streaming stop

Stop streaming a call to a WebSocket.

**Expected Webhooks:**

- `streaming.stopped`


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        StopStreamingRequest stopStreamingRequest = new StopStreamingRequest(); // StopStreamingRequest | Stop streaming media request
        try {
            CallControlCommandResponse result = apiInstance.stopCallStreaming(callControlId, stopStreamingRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#stopCallStreaming");
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
 **stopStreamingRequest** | [**StopStreamingRequest**](StopStreamingRequest.md)| Stop streaming media request |

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
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## stopCallTranscription

> CallControlCommandResponse stopCallTranscription(callControlId, transcriptionStopRequest)

Transcription stop

Stop real-time transcription.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        TranscriptionStopRequest transcriptionStopRequest = new TranscriptionStopRequest(); // TranscriptionStopRequest | Transcription stop request
        try {
            CallControlCommandResponse result = apiInstance.stopCallTranscription(callControlId, transcriptionStopRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#stopCallTranscription");
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
 **transcriptionStopRequest** | [**TranscriptionStopRequest**](TranscriptionStopRequest.md)| Transcription stop request |

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
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## transferCall

> CallControlCommandResponse transferCall(callControlId, transferCallRequest)

Transfer call

Transfer a call to a new destination. If the transfer is unsuccessful, a `call.hangup` webhook for the other call (Leg B) will be sent indicating that the transfer could not be completed. The original call will remain active and may be issued additional commands, potentially transfering the call to an alternate destination.

**Expected Webhooks:**

- `call.initiated`
- `call.bridged` to Leg B
- `call.answered` or `call.hangup`
- `call.machine.detection.ended` if `answering_machine_detection` was requested
- `call.machine.greeting.ended` if `answering_machine_detection` was requested to detect the end of machine greeting
- `call.machine.premium.detection.ended` if `answering_machine_detection=premium` was requested
- `call.machine.premium.greeting.ended` if `answering_machine_detection=premium` was requested and a beep was detected


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallCommandsApi;

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
            CallControlCommandResponse result = apiInstance.transferCall(callControlId, transferCallRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#transferCall");
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
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |


## updateClientState

> CallControlCommandResponse updateClientState(callControlId, clientStateUpdateRequest)

Update client state

Updates client state

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallCommandsApi apiInstance = new CallCommandsApi(defaultClient);
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        ClientStateUpdateRequest clientStateUpdateRequest = new ClientStateUpdateRequest(); // ClientStateUpdateRequest | Updates client state for every subsequent webhook
        try {
            CallControlCommandResponse result = apiInstance.updateClientState(callControlId, clientStateUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallCommandsApi#updateClientState");
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
 **clientStateUpdateRequest** | [**ClientStateUpdateRequest**](ClientStateUpdateRequest.md)| Updates client state for every subsequent webhook |

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
| **200** | Successful response upon making a call control command. |  -  |
| **0** | Unexpected error |  -  |

