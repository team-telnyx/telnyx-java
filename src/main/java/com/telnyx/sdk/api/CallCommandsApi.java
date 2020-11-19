package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.AnswerRequest;
import com.telnyx.sdk.model.BridgeRequest;
import com.telnyx.sdk.model.CallControlCommandResponse;
import com.telnyx.sdk.model.CallRequest;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.GatherUsingAudioRequest;
import com.telnyx.sdk.model.GatherUsingSpeakRequest;
import com.telnyx.sdk.model.HangupRequest;
import com.telnyx.sdk.model.PauseRecordingRequest;
import com.telnyx.sdk.model.PlayAudioUrlRequest;
import com.telnyx.sdk.model.PlaybackStopRequest;
import com.telnyx.sdk.model.ReferRequest;
import com.telnyx.sdk.model.RejectRequest;
import com.telnyx.sdk.model.ResumeRecordingRequest;
import com.telnyx.sdk.model.RetrieveCallStatusResponse;
import com.telnyx.sdk.model.SendDTMFRequest;
import com.telnyx.sdk.model.SpeakRequest;
import com.telnyx.sdk.model.StartForkingRequest;
import com.telnyx.sdk.model.StartRecordingRequest;
import com.telnyx.sdk.model.StopForkingRequest;
import com.telnyx.sdk.model.StopGatherRequest;
import com.telnyx.sdk.model.StopRecordingRequest;
import com.telnyx.sdk.model.TransferCallRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CallCommandsApi {
  private ApiClient apiClient;

  public CallCommandsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CallCommandsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API cilent
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API cilent
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Answer call
   * Answer an incoming call. You must issue this command before executing subsequent commands on an incoming call.  **Expected Webhooks:**  - &#x60;call.answered&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param answerRequest Answer call request (required)
   * @return CallControlCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CallControlCommandResponse callAnswer(String callControlId, AnswerRequest answerRequest) throws ApiException {
    return callAnswerWithHttpInfo(callControlId, answerRequest).getData();
  }

  /**
   * Answer call
   * Answer an incoming call. You must issue this command before executing subsequent commands on an incoming call.  **Expected Webhooks:**  - &#x60;call.answered&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param answerRequest Answer call request (required)
   * @return ApiResponse&lt;CallControlCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CallControlCommandResponse> callAnswerWithHttpInfo(String callControlId, AnswerRequest answerRequest) throws ApiException {
    Object localVarPostBody = answerRequest;
    
    // verify the required parameter 'callControlId' is set
    if (callControlId == null) {
      throw new ApiException(400, "Missing the required parameter 'callControlId' when calling callAnswer");
    }
    
    // verify the required parameter 'answerRequest' is set
    if (answerRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'answerRequest' when calling callAnswer");
    }
    
    // create path and map variables
    String localVarPath = "/calls/{call_control_id}/actions/answer"
      .replaceAll("\\{" + "call_control_id" + "\\}", apiClient.escapeString(callControlId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CallControlCommandResponse> localVarReturnType = new GenericType<CallControlCommandResponse>() {};

    return apiClient.invokeAPI("CallCommandsApi.callAnswer", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Bridge calls
   * Bridge two call control calls.  **Expected Webhooks:**  - &#x60;call.bridged&#x60; for Leg A - &#x60;call.bridged&#x60; for Leg B 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param bridgeRequest Bridge call request (required)
   * @return CallControlCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CallControlCommandResponse callBridge(String callControlId, BridgeRequest bridgeRequest) throws ApiException {
    return callBridgeWithHttpInfo(callControlId, bridgeRequest).getData();
  }

  /**
   * Bridge calls
   * Bridge two call control calls.  **Expected Webhooks:**  - &#x60;call.bridged&#x60; for Leg A - &#x60;call.bridged&#x60; for Leg B 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param bridgeRequest Bridge call request (required)
   * @return ApiResponse&lt;CallControlCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CallControlCommandResponse> callBridgeWithHttpInfo(String callControlId, BridgeRequest bridgeRequest) throws ApiException {
    Object localVarPostBody = bridgeRequest;
    
    // verify the required parameter 'callControlId' is set
    if (callControlId == null) {
      throw new ApiException(400, "Missing the required parameter 'callControlId' when calling callBridge");
    }
    
    // verify the required parameter 'bridgeRequest' is set
    if (bridgeRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeRequest' when calling callBridge");
    }
    
    // create path and map variables
    String localVarPath = "/calls/{call_control_id}/actions/bridge"
      .replaceAll("\\{" + "call_control_id" + "\\}", apiClient.escapeString(callControlId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CallControlCommandResponse> localVarReturnType = new GenericType<CallControlCommandResponse>() {};

    return apiClient.invokeAPI("CallCommandsApi.callBridge", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Dial
   * Dial a number or SIP URI from a given connection. A successful response will include a &#x60;call_leg_id&#x60; which can be used to correlate the command with subsequent webhooks.  **Expected Webhooks:**  - &#x60;call.initiated&#x60; - &#x60;call.answered&#x60; or &#x60;call.hangup&#x60; - &#x60;call.machine.detection.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested - &#x60;call.machine.greeting.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested to detect the end of machine greeting - &#x60;call.machine.premium.detection.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested - &#x60;call.machine.premium.greeting.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested and a beep was detected 
   * @param callRequest Call request (required)
   * @return RetrieveCallStatusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a call status. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveCallStatusResponse callDial(CallRequest callRequest) throws ApiException {
    return callDialWithHttpInfo(callRequest).getData();
  }

  /**
   * Dial
   * Dial a number or SIP URI from a given connection. A successful response will include a &#x60;call_leg_id&#x60; which can be used to correlate the command with subsequent webhooks.  **Expected Webhooks:**  - &#x60;call.initiated&#x60; - &#x60;call.answered&#x60; or &#x60;call.hangup&#x60; - &#x60;call.machine.detection.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested - &#x60;call.machine.greeting.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested to detect the end of machine greeting - &#x60;call.machine.premium.detection.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested - &#x60;call.machine.premium.greeting.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested and a beep was detected 
   * @param callRequest Call request (required)
   * @return ApiResponse&lt;RetrieveCallStatusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a call status. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveCallStatusResponse> callDialWithHttpInfo(CallRequest callRequest) throws ApiException {
    Object localVarPostBody = callRequest;
    
    // verify the required parameter 'callRequest' is set
    if (callRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'callRequest' when calling callDial");
    }
    
    // create path and map variables
    String localVarPath = "/calls";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<RetrieveCallStatusResponse> localVarReturnType = new GenericType<RetrieveCallStatusResponse>() {};

    return apiClient.invokeAPI("CallCommandsApi.callDial", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Forking start
   * Call forking allows you to stream the media from a call to a specific target in realtime.  This stream can be used to enable realtime audio analysis to support a  variety of use cases, including fraud detection, or the creation of AI-generated audio responses.  Requests must specify either the &#x60;target&#x60; attribute or the &#x60;rx&#x60; and &#x60;tx&#x60; attributes.  **Expected Webhooks:**  - &#x60;call.fork.started&#x60; - &#x60;call.fork.stopped&#x60;  **Simple Telnyx RTP Encapsulation Protocol (STREP)**  *Note: This header/encapsulation is not used when the &#x60;rx&#x60; and &#x60;tx&#x60; parameters have been specified; it only applies when media is forked using the &#x60;target&#x60; attribute.*  If the destination for forked media is specified using the \&quot;target\&quot; attribute, the RTP will be encapsulated in an extra Telnyx protocol, which adds a 24 byte header to the RTP payload in each packet. The STREP header includes the Call Control &#x60;call_leg_id&#x60; for stream identification, along with bits that represent the direction (inbound or outbound) of the media. This 24-byte header sits between the UDP header and the RTP header.  The STREP header makes it possible to fork RTP for multiple calls (or two RTP streams for the same call) to the same IP:port, where the streams can be demultiplexed by your application using the information in the header. Of course, it&#39;s still possible to ignore this header completely, for example, if sending forked media for different calls to different ports or IP addresses. In this case, simply strip 24 bytes (or use the second byte to find the header length) from the received UDP payload to get the RTP (RTP header and payload).  &#x60;&#x60;&#x60; STREP Specification    0                   1                   2                   3   0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+  |1 1|Version|L|D|    HeaderLen  |  reserved (2 bytes)           |  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+  |       reserved (4 bytes, for UDP ports or anything else)      |  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+  |               The call_leg_id                                 |  |                   from Call Control                           |  |                       (128 bits / 16 bytes)                   |  |                           (this is binary data)               |  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+   11    Static bits 11, always set to 11 to easily distinguish forked media    from RTP (10) and T.38 media (usually 00) and SIP (which begins    with a capital letter, so begins with bits 01). This is a magic number.   Version    Four bits to indicate the version number of the protocol, starting at 0001.   L    One bit to represent the leg of the call (A or B).    0 represents the A (first) leg of the call.    1 represents the B (second) leg of the call.   D    One bit to represent the direction of this RTP stream.    0 represents media received by Telnyx.    1 represents media transmitted by Telnyx.   HeaderLen (1 byte)    The length of the header in bytes.    Note that this value does not include the length of the payload. The total    size of the RTP can be calculated by subtracting the HeaderLen from the UDP    length (minus 8 for the UDP header).    In version 1, this value will always be 24.   Reserved (6 bytes)    Reserved for future use and to make sure that the header is a multiple of 32 bits   Call Leg ID    A 128-bit identifier for the call leg.    This is the call_leg_id from Call Control. &#x60;&#x60;&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param startForkingRequest Fork media request (required)
   * @return CallControlCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CallControlCommandResponse callForkStart(String callControlId, StartForkingRequest startForkingRequest) throws ApiException {
    return callForkStartWithHttpInfo(callControlId, startForkingRequest).getData();
  }

  /**
   * Forking start
   * Call forking allows you to stream the media from a call to a specific target in realtime.  This stream can be used to enable realtime audio analysis to support a  variety of use cases, including fraud detection, or the creation of AI-generated audio responses.  Requests must specify either the &#x60;target&#x60; attribute or the &#x60;rx&#x60; and &#x60;tx&#x60; attributes.  **Expected Webhooks:**  - &#x60;call.fork.started&#x60; - &#x60;call.fork.stopped&#x60;  **Simple Telnyx RTP Encapsulation Protocol (STREP)**  *Note: This header/encapsulation is not used when the &#x60;rx&#x60; and &#x60;tx&#x60; parameters have been specified; it only applies when media is forked using the &#x60;target&#x60; attribute.*  If the destination for forked media is specified using the \&quot;target\&quot; attribute, the RTP will be encapsulated in an extra Telnyx protocol, which adds a 24 byte header to the RTP payload in each packet. The STREP header includes the Call Control &#x60;call_leg_id&#x60; for stream identification, along with bits that represent the direction (inbound or outbound) of the media. This 24-byte header sits between the UDP header and the RTP header.  The STREP header makes it possible to fork RTP for multiple calls (or two RTP streams for the same call) to the same IP:port, where the streams can be demultiplexed by your application using the information in the header. Of course, it&#39;s still possible to ignore this header completely, for example, if sending forked media for different calls to different ports or IP addresses. In this case, simply strip 24 bytes (or use the second byte to find the header length) from the received UDP payload to get the RTP (RTP header and payload).  &#x60;&#x60;&#x60; STREP Specification    0                   1                   2                   3   0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+  |1 1|Version|L|D|    HeaderLen  |  reserved (2 bytes)           |  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+  |       reserved (4 bytes, for UDP ports or anything else)      |  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+  |               The call_leg_id                                 |  |                   from Call Control                           |  |                       (128 bits / 16 bytes)                   |  |                           (this is binary data)               |  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+   11    Static bits 11, always set to 11 to easily distinguish forked media    from RTP (10) and T.38 media (usually 00) and SIP (which begins    with a capital letter, so begins with bits 01). This is a magic number.   Version    Four bits to indicate the version number of the protocol, starting at 0001.   L    One bit to represent the leg of the call (A or B).    0 represents the A (first) leg of the call.    1 represents the B (second) leg of the call.   D    One bit to represent the direction of this RTP stream.    0 represents media received by Telnyx.    1 represents media transmitted by Telnyx.   HeaderLen (1 byte)    The length of the header in bytes.    Note that this value does not include the length of the payload. The total    size of the RTP can be calculated by subtracting the HeaderLen from the UDP    length (minus 8 for the UDP header).    In version 1, this value will always be 24.   Reserved (6 bytes)    Reserved for future use and to make sure that the header is a multiple of 32 bits   Call Leg ID    A 128-bit identifier for the call leg.    This is the call_leg_id from Call Control. &#x60;&#x60;&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param startForkingRequest Fork media request (required)
   * @return ApiResponse&lt;CallControlCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CallControlCommandResponse> callForkStartWithHttpInfo(String callControlId, StartForkingRequest startForkingRequest) throws ApiException {
    Object localVarPostBody = startForkingRequest;
    
    // verify the required parameter 'callControlId' is set
    if (callControlId == null) {
      throw new ApiException(400, "Missing the required parameter 'callControlId' when calling callForkStart");
    }
    
    // verify the required parameter 'startForkingRequest' is set
    if (startForkingRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'startForkingRequest' when calling callForkStart");
    }
    
    // create path and map variables
    String localVarPath = "/calls/{call_control_id}/actions/fork_start"
      .replaceAll("\\{" + "call_control_id" + "\\}", apiClient.escapeString(callControlId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CallControlCommandResponse> localVarReturnType = new GenericType<CallControlCommandResponse>() {};

    return apiClient.invokeAPI("CallCommandsApi.callForkStart", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Forking stop
   * Stop forking a call.  **Expected Webhooks:**  - &#x60;call.fork.stopped&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param stopForkingRequest Stop forking media request (required)
   * @return CallControlCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CallControlCommandResponse callForkStop(String callControlId, StopForkingRequest stopForkingRequest) throws ApiException {
    return callForkStopWithHttpInfo(callControlId, stopForkingRequest).getData();
  }

  /**
   * Forking stop
   * Stop forking a call.  **Expected Webhooks:**  - &#x60;call.fork.stopped&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param stopForkingRequest Stop forking media request (required)
   * @return ApiResponse&lt;CallControlCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CallControlCommandResponse> callForkStopWithHttpInfo(String callControlId, StopForkingRequest stopForkingRequest) throws ApiException {
    Object localVarPostBody = stopForkingRequest;
    
    // verify the required parameter 'callControlId' is set
    if (callControlId == null) {
      throw new ApiException(400, "Missing the required parameter 'callControlId' when calling callForkStop");
    }
    
    // verify the required parameter 'stopForkingRequest' is set
    if (stopForkingRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'stopForkingRequest' when calling callForkStop");
    }
    
    // create path and map variables
    String localVarPath = "/calls/{call_control_id}/actions/fork_stop"
      .replaceAll("\\{" + "call_control_id" + "\\}", apiClient.escapeString(callControlId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CallControlCommandResponse> localVarReturnType = new GenericType<CallControlCommandResponse>() {};

    return apiClient.invokeAPI("CallCommandsApi.callForkStop", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Gather stop
   * Stop current gather.  **Expected Webhooks:**  - &#x60;call.gather.ended&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param stopGatherRequest Stop current gather (required)
   * @return CallControlCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CallControlCommandResponse callGatherStop(String callControlId, StopGatherRequest stopGatherRequest) throws ApiException {
    return callGatherStopWithHttpInfo(callControlId, stopGatherRequest).getData();
  }

  /**
   * Gather stop
   * Stop current gather.  **Expected Webhooks:**  - &#x60;call.gather.ended&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param stopGatherRequest Stop current gather (required)
   * @return ApiResponse&lt;CallControlCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CallControlCommandResponse> callGatherStopWithHttpInfo(String callControlId, StopGatherRequest stopGatherRequest) throws ApiException {
    Object localVarPostBody = stopGatherRequest;
    
    // verify the required parameter 'callControlId' is set
    if (callControlId == null) {
      throw new ApiException(400, "Missing the required parameter 'callControlId' when calling callGatherStop");
    }
    
    // verify the required parameter 'stopGatherRequest' is set
    if (stopGatherRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'stopGatherRequest' when calling callGatherStop");
    }
    
    // create path and map variables
    String localVarPath = "/calls/{call_control_id}/actions/gather_stop"
      .replaceAll("\\{" + "call_control_id" + "\\}", apiClient.escapeString(callControlId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CallControlCommandResponse> localVarReturnType = new GenericType<CallControlCommandResponse>() {};

    return apiClient.invokeAPI("CallCommandsApi.callGatherStop", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Gather using audio
   * Play an audio file on the call until the required DTMF signals are gathered to build interactive menus.  You can pass a list of valid digits along with an &#39;invalid_audio_url&#39;, which will be played back at the beginning of each prompt. Playback will be interrupted when a DTMF signal is received. The [Answer](/docs/api/v2/call-control/Call-Commands#CallControlAnswer) command must be issued before the &#x60;gather_using_audio&#x60; command.  **Expected Webhooks:**  - &#x60;call.playback.started&#x60; - &#x60;call.playback.ended&#x60; - &#x60;call.dtmf.received&#x60; (you may receive many of these webhooks) - &#x60;call.gather.ended&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param gatherUsingAudioRequest Gather using audio request (required)
   * @return CallControlCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CallControlCommandResponse callGatherUsingAudio(String callControlId, GatherUsingAudioRequest gatherUsingAudioRequest) throws ApiException {
    return callGatherUsingAudioWithHttpInfo(callControlId, gatherUsingAudioRequest).getData();
  }

  /**
   * Gather using audio
   * Play an audio file on the call until the required DTMF signals are gathered to build interactive menus.  You can pass a list of valid digits along with an &#39;invalid_audio_url&#39;, which will be played back at the beginning of each prompt. Playback will be interrupted when a DTMF signal is received. The [Answer](/docs/api/v2/call-control/Call-Commands#CallControlAnswer) command must be issued before the &#x60;gather_using_audio&#x60; command.  **Expected Webhooks:**  - &#x60;call.playback.started&#x60; - &#x60;call.playback.ended&#x60; - &#x60;call.dtmf.received&#x60; (you may receive many of these webhooks) - &#x60;call.gather.ended&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param gatherUsingAudioRequest Gather using audio request (required)
   * @return ApiResponse&lt;CallControlCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CallControlCommandResponse> callGatherUsingAudioWithHttpInfo(String callControlId, GatherUsingAudioRequest gatherUsingAudioRequest) throws ApiException {
    Object localVarPostBody = gatherUsingAudioRequest;
    
    // verify the required parameter 'callControlId' is set
    if (callControlId == null) {
      throw new ApiException(400, "Missing the required parameter 'callControlId' when calling callGatherUsingAudio");
    }
    
    // verify the required parameter 'gatherUsingAudioRequest' is set
    if (gatherUsingAudioRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gatherUsingAudioRequest' when calling callGatherUsingAudio");
    }
    
    // create path and map variables
    String localVarPath = "/calls/{call_control_id}/actions/gather_using_audio"
      .replaceAll("\\{" + "call_control_id" + "\\}", apiClient.escapeString(callControlId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CallControlCommandResponse> localVarReturnType = new GenericType<CallControlCommandResponse>() {};

    return apiClient.invokeAPI("CallCommandsApi.callGatherUsingAudio", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Gather using speak
   * Convert text to speech and play it on the call until the required DTMF signals are gathered to build interactive menus.  You can pass a list of valid digits along with an &#39;invalid_payload&#39;, which will be played back at the beginning of each prompt. Speech will be interrupted when a DTMF signal is received. The [Answer](/docs/api/v2/call-control/Call-Commands#CallControlAnswer) command must be issued before the &#x60;gather_using_speak&#x60; command.  **Expected Webhooks:**  - &#x60;call.dtmf.received&#x60; (you may receive many of these webhooks) - &#x60;call.gather.ended&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param gatherUsingSpeakRequest Gather using speak request (required)
   * @return CallControlCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CallControlCommandResponse callGatherUsingSpeak(String callControlId, GatherUsingSpeakRequest gatherUsingSpeakRequest) throws ApiException {
    return callGatherUsingSpeakWithHttpInfo(callControlId, gatherUsingSpeakRequest).getData();
  }

  /**
   * Gather using speak
   * Convert text to speech and play it on the call until the required DTMF signals are gathered to build interactive menus.  You can pass a list of valid digits along with an &#39;invalid_payload&#39;, which will be played back at the beginning of each prompt. Speech will be interrupted when a DTMF signal is received. The [Answer](/docs/api/v2/call-control/Call-Commands#CallControlAnswer) command must be issued before the &#x60;gather_using_speak&#x60; command.  **Expected Webhooks:**  - &#x60;call.dtmf.received&#x60; (you may receive many of these webhooks) - &#x60;call.gather.ended&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param gatherUsingSpeakRequest Gather using speak request (required)
   * @return ApiResponse&lt;CallControlCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CallControlCommandResponse> callGatherUsingSpeakWithHttpInfo(String callControlId, GatherUsingSpeakRequest gatherUsingSpeakRequest) throws ApiException {
    Object localVarPostBody = gatherUsingSpeakRequest;
    
    // verify the required parameter 'callControlId' is set
    if (callControlId == null) {
      throw new ApiException(400, "Missing the required parameter 'callControlId' when calling callGatherUsingSpeak");
    }
    
    // verify the required parameter 'gatherUsingSpeakRequest' is set
    if (gatherUsingSpeakRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gatherUsingSpeakRequest' when calling callGatherUsingSpeak");
    }
    
    // create path and map variables
    String localVarPath = "/calls/{call_control_id}/actions/gather_using_speak"
      .replaceAll("\\{" + "call_control_id" + "\\}", apiClient.escapeString(callControlId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CallControlCommandResponse> localVarReturnType = new GenericType<CallControlCommandResponse>() {};

    return apiClient.invokeAPI("CallCommandsApi.callGatherUsingSpeak", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Hangup call
   * Hang up the call.  **Expected Webhooks:**  - &#x60;call.hangup&#x60; - &#x60;call.recording.saved&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param hangupRequest Hangup request (required)
   * @return CallControlCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CallControlCommandResponse callHangup(String callControlId, HangupRequest hangupRequest) throws ApiException {
    return callHangupWithHttpInfo(callControlId, hangupRequest).getData();
  }

  /**
   * Hangup call
   * Hang up the call.  **Expected Webhooks:**  - &#x60;call.hangup&#x60; - &#x60;call.recording.saved&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param hangupRequest Hangup request (required)
   * @return ApiResponse&lt;CallControlCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CallControlCommandResponse> callHangupWithHttpInfo(String callControlId, HangupRequest hangupRequest) throws ApiException {
    Object localVarPostBody = hangupRequest;
    
    // verify the required parameter 'callControlId' is set
    if (callControlId == null) {
      throw new ApiException(400, "Missing the required parameter 'callControlId' when calling callHangup");
    }
    
    // verify the required parameter 'hangupRequest' is set
    if (hangupRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'hangupRequest' when calling callHangup");
    }
    
    // create path and map variables
    String localVarPath = "/calls/{call_control_id}/actions/hangup"
      .replaceAll("\\{" + "call_control_id" + "\\}", apiClient.escapeString(callControlId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CallControlCommandResponse> localVarReturnType = new GenericType<CallControlCommandResponse>() {};

    return apiClient.invokeAPI("CallCommandsApi.callHangup", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Play audio URL
   * Play an audio file on the call. If multiple play audio commands are issued consecutively, the audio files will be placed in a queue awaiting playback.  *Notes:*  - When &#x60;overlay&#x60; is enabled, &#x60;loop&#x60; is limited to 1, and &#x60;target_legs&#x60; is limited to &#x60;self&#x60;. - A customer cannot Play Audio with &#x60;overlay&#x3D;true&#x60; unless there is a Play Audio with &#x60;overlay&#x3D;false&#x60; actively playing.  **Expected Webhooks:**  - &#x60;call.playback.started&#x60; - &#x60;call.playback.ended&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param playAudioUrlRequest Play audio URL request (required)
   * @return CallControlCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CallControlCommandResponse callPlaybackStart(String callControlId, PlayAudioUrlRequest playAudioUrlRequest) throws ApiException {
    return callPlaybackStartWithHttpInfo(callControlId, playAudioUrlRequest).getData();
  }

  /**
   * Play audio URL
   * Play an audio file on the call. If multiple play audio commands are issued consecutively, the audio files will be placed in a queue awaiting playback.  *Notes:*  - When &#x60;overlay&#x60; is enabled, &#x60;loop&#x60; is limited to 1, and &#x60;target_legs&#x60; is limited to &#x60;self&#x60;. - A customer cannot Play Audio with &#x60;overlay&#x3D;true&#x60; unless there is a Play Audio with &#x60;overlay&#x3D;false&#x60; actively playing.  **Expected Webhooks:**  - &#x60;call.playback.started&#x60; - &#x60;call.playback.ended&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param playAudioUrlRequest Play audio URL request (required)
   * @return ApiResponse&lt;CallControlCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CallControlCommandResponse> callPlaybackStartWithHttpInfo(String callControlId, PlayAudioUrlRequest playAudioUrlRequest) throws ApiException {
    Object localVarPostBody = playAudioUrlRequest;
    
    // verify the required parameter 'callControlId' is set
    if (callControlId == null) {
      throw new ApiException(400, "Missing the required parameter 'callControlId' when calling callPlaybackStart");
    }
    
    // verify the required parameter 'playAudioUrlRequest' is set
    if (playAudioUrlRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'playAudioUrlRequest' when calling callPlaybackStart");
    }
    
    // create path and map variables
    String localVarPath = "/calls/{call_control_id}/actions/playback_start"
      .replaceAll("\\{" + "call_control_id" + "\\}", apiClient.escapeString(callControlId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CallControlCommandResponse> localVarReturnType = new GenericType<CallControlCommandResponse>() {};

    return apiClient.invokeAPI("CallCommandsApi.callPlaybackStart", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Stop audio playback
   * Stop audio being played on the call.  **Expected Webhooks:**  - &#x60;call.playback.ended&#x60; or &#x60;call.speak.ended&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param playbackStopRequest Stop audio playback request (required)
   * @return CallControlCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CallControlCommandResponse callPlaybackStop(String callControlId, PlaybackStopRequest playbackStopRequest) throws ApiException {
    return callPlaybackStopWithHttpInfo(callControlId, playbackStopRequest).getData();
  }

  /**
   * Stop audio playback
   * Stop audio being played on the call.  **Expected Webhooks:**  - &#x60;call.playback.ended&#x60; or &#x60;call.speak.ended&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param playbackStopRequest Stop audio playback request (required)
   * @return ApiResponse&lt;CallControlCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CallControlCommandResponse> callPlaybackStopWithHttpInfo(String callControlId, PlaybackStopRequest playbackStopRequest) throws ApiException {
    Object localVarPostBody = playbackStopRequest;
    
    // verify the required parameter 'callControlId' is set
    if (callControlId == null) {
      throw new ApiException(400, "Missing the required parameter 'callControlId' when calling callPlaybackStop");
    }
    
    // verify the required parameter 'playbackStopRequest' is set
    if (playbackStopRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'playbackStopRequest' when calling callPlaybackStop");
    }
    
    // create path and map variables
    String localVarPath = "/calls/{call_control_id}/actions/playback_stop"
      .replaceAll("\\{" + "call_control_id" + "\\}", apiClient.escapeString(callControlId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CallControlCommandResponse> localVarReturnType = new GenericType<CallControlCommandResponse>() {};

    return apiClient.invokeAPI("CallCommandsApi.callPlaybackStop", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Record pause
   * Pause recording the call. Recording can be resumed via Resume recording command.  **Expected Webhooks:**  There are no webhooks associated with this command. 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param pauseRecordingRequest Pause recording call request (required)
   * @return CallControlCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CallControlCommandResponse callRecordPause(String callControlId, PauseRecordingRequest pauseRecordingRequest) throws ApiException {
    return callRecordPauseWithHttpInfo(callControlId, pauseRecordingRequest).getData();
  }

  /**
   * Record pause
   * Pause recording the call. Recording can be resumed via Resume recording command.  **Expected Webhooks:**  There are no webhooks associated with this command. 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param pauseRecordingRequest Pause recording call request (required)
   * @return ApiResponse&lt;CallControlCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CallControlCommandResponse> callRecordPauseWithHttpInfo(String callControlId, PauseRecordingRequest pauseRecordingRequest) throws ApiException {
    Object localVarPostBody = pauseRecordingRequest;
    
    // verify the required parameter 'callControlId' is set
    if (callControlId == null) {
      throw new ApiException(400, "Missing the required parameter 'callControlId' when calling callRecordPause");
    }
    
    // verify the required parameter 'pauseRecordingRequest' is set
    if (pauseRecordingRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'pauseRecordingRequest' when calling callRecordPause");
    }
    
    // create path and map variables
    String localVarPath = "/calls/{call_control_id}/actions/record_pause"
      .replaceAll("\\{" + "call_control_id" + "\\}", apiClient.escapeString(callControlId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CallControlCommandResponse> localVarReturnType = new GenericType<CallControlCommandResponse>() {};

    return apiClient.invokeAPI("CallCommandsApi.callRecordPause", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Record resume
   * Resume recording the call.  **Expected Webhooks:**  There are no webhooks associated with this command. 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param resumeRecordingRequest Resume recording call request (required)
   * @return CallControlCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CallControlCommandResponse callRecordResume(String callControlId, ResumeRecordingRequest resumeRecordingRequest) throws ApiException {
    return callRecordResumeWithHttpInfo(callControlId, resumeRecordingRequest).getData();
  }

  /**
   * Record resume
   * Resume recording the call.  **Expected Webhooks:**  There are no webhooks associated with this command. 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param resumeRecordingRequest Resume recording call request (required)
   * @return ApiResponse&lt;CallControlCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CallControlCommandResponse> callRecordResumeWithHttpInfo(String callControlId, ResumeRecordingRequest resumeRecordingRequest) throws ApiException {
    Object localVarPostBody = resumeRecordingRequest;
    
    // verify the required parameter 'callControlId' is set
    if (callControlId == null) {
      throw new ApiException(400, "Missing the required parameter 'callControlId' when calling callRecordResume");
    }
    
    // verify the required parameter 'resumeRecordingRequest' is set
    if (resumeRecordingRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'resumeRecordingRequest' when calling callRecordResume");
    }
    
    // create path and map variables
    String localVarPath = "/calls/{call_control_id}/actions/record_resume"
      .replaceAll("\\{" + "call_control_id" + "\\}", apiClient.escapeString(callControlId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CallControlCommandResponse> localVarReturnType = new GenericType<CallControlCommandResponse>() {};

    return apiClient.invokeAPI("CallCommandsApi.callRecordResume", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Recording start
   * Start recording the call. Recording will stop on call hang-up, or can be initiated via the Stop Recording command.  **Expected Webhooks:**  - &#x60;call.recording.saved&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param startRecordingRequest Start recording audio request (required)
   * @return CallControlCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CallControlCommandResponse callRecordStart(String callControlId, StartRecordingRequest startRecordingRequest) throws ApiException {
    return callRecordStartWithHttpInfo(callControlId, startRecordingRequest).getData();
  }

  /**
   * Recording start
   * Start recording the call. Recording will stop on call hang-up, or can be initiated via the Stop Recording command.  **Expected Webhooks:**  - &#x60;call.recording.saved&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param startRecordingRequest Start recording audio request (required)
   * @return ApiResponse&lt;CallControlCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CallControlCommandResponse> callRecordStartWithHttpInfo(String callControlId, StartRecordingRequest startRecordingRequest) throws ApiException {
    Object localVarPostBody = startRecordingRequest;
    
    // verify the required parameter 'callControlId' is set
    if (callControlId == null) {
      throw new ApiException(400, "Missing the required parameter 'callControlId' when calling callRecordStart");
    }
    
    // verify the required parameter 'startRecordingRequest' is set
    if (startRecordingRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'startRecordingRequest' when calling callRecordStart");
    }
    
    // create path and map variables
    String localVarPath = "/calls/{call_control_id}/actions/record_start"
      .replaceAll("\\{" + "call_control_id" + "\\}", apiClient.escapeString(callControlId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CallControlCommandResponse> localVarReturnType = new GenericType<CallControlCommandResponse>() {};

    return apiClient.invokeAPI("CallCommandsApi.callRecordStart", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Recording stop
   * Stop recording the call.  **Expected Webhooks:**  - &#x60;call.recording.saved&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param stopRecordingRequest Stop recording call request (required)
   * @return CallControlCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CallControlCommandResponse callRecordStop(String callControlId, StopRecordingRequest stopRecordingRequest) throws ApiException {
    return callRecordStopWithHttpInfo(callControlId, stopRecordingRequest).getData();
  }

  /**
   * Recording stop
   * Stop recording the call.  **Expected Webhooks:**  - &#x60;call.recording.saved&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param stopRecordingRequest Stop recording call request (required)
   * @return ApiResponse&lt;CallControlCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CallControlCommandResponse> callRecordStopWithHttpInfo(String callControlId, StopRecordingRequest stopRecordingRequest) throws ApiException {
    Object localVarPostBody = stopRecordingRequest;
    
    // verify the required parameter 'callControlId' is set
    if (callControlId == null) {
      throw new ApiException(400, "Missing the required parameter 'callControlId' when calling callRecordStop");
    }
    
    // verify the required parameter 'stopRecordingRequest' is set
    if (stopRecordingRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'stopRecordingRequest' when calling callRecordStop");
    }
    
    // create path and map variables
    String localVarPath = "/calls/{call_control_id}/actions/record_stop"
      .replaceAll("\\{" + "call_control_id" + "\\}", apiClient.escapeString(callControlId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CallControlCommandResponse> localVarReturnType = new GenericType<CallControlCommandResponse>() {};

    return apiClient.invokeAPI("CallCommandsApi.callRecordStop", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * SIP Refer a call
   * Initiate a SIP Refer on a Call Control call. You can initiate a SIP Refer at any point in the duration of a call.  **Expected Webhooks:**  - &#x60;call.refer.started&#x60; - &#x60;call.refer.completed&#x60; - &#x60;call.refer.failed&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param referRequest Refer request (required)
   * @return CallControlCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CallControlCommandResponse callRefer(String callControlId, ReferRequest referRequest) throws ApiException {
    return callReferWithHttpInfo(callControlId, referRequest).getData();
  }

  /**
   * SIP Refer a call
   * Initiate a SIP Refer on a Call Control call. You can initiate a SIP Refer at any point in the duration of a call.  **Expected Webhooks:**  - &#x60;call.refer.started&#x60; - &#x60;call.refer.completed&#x60; - &#x60;call.refer.failed&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param referRequest Refer request (required)
   * @return ApiResponse&lt;CallControlCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CallControlCommandResponse> callReferWithHttpInfo(String callControlId, ReferRequest referRequest) throws ApiException {
    Object localVarPostBody = referRequest;
    
    // verify the required parameter 'callControlId' is set
    if (callControlId == null) {
      throw new ApiException(400, "Missing the required parameter 'callControlId' when calling callRefer");
    }
    
    // verify the required parameter 'referRequest' is set
    if (referRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'referRequest' when calling callRefer");
    }
    
    // create path and map variables
    String localVarPath = "/calls/{call_control_id}/actions/refer"
      .replaceAll("\\{" + "call_control_id" + "\\}", apiClient.escapeString(callControlId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CallControlCommandResponse> localVarReturnType = new GenericType<CallControlCommandResponse>() {};

    return apiClient.invokeAPI("CallCommandsApi.callRefer", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Reject a call
   * Reject an incoming call.  **Expected Webhooks:**  - &#x60;call.hangup&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param rejectRequest Reject request (required)
   * @return CallControlCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CallControlCommandResponse callReject(String callControlId, RejectRequest rejectRequest) throws ApiException {
    return callRejectWithHttpInfo(callControlId, rejectRequest).getData();
  }

  /**
   * Reject a call
   * Reject an incoming call.  **Expected Webhooks:**  - &#x60;call.hangup&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param rejectRequest Reject request (required)
   * @return ApiResponse&lt;CallControlCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CallControlCommandResponse> callRejectWithHttpInfo(String callControlId, RejectRequest rejectRequest) throws ApiException {
    Object localVarPostBody = rejectRequest;
    
    // verify the required parameter 'callControlId' is set
    if (callControlId == null) {
      throw new ApiException(400, "Missing the required parameter 'callControlId' when calling callReject");
    }
    
    // verify the required parameter 'rejectRequest' is set
    if (rejectRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'rejectRequest' when calling callReject");
    }
    
    // create path and map variables
    String localVarPath = "/calls/{call_control_id}/actions/reject"
      .replaceAll("\\{" + "call_control_id" + "\\}", apiClient.escapeString(callControlId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CallControlCommandResponse> localVarReturnType = new GenericType<CallControlCommandResponse>() {};

    return apiClient.invokeAPI("CallCommandsApi.callReject", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Send DTMF
   * Sends DTMF tones from this leg. DTMF tones will be heard by the other end of the call.  **Expected Webhooks:**  There are no webhooks associated with this command. 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param sendDTMFRequest Send DTMF request (required)
   * @return CallControlCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CallControlCommandResponse callSendDTMF(String callControlId, SendDTMFRequest sendDTMFRequest) throws ApiException {
    return callSendDTMFWithHttpInfo(callControlId, sendDTMFRequest).getData();
  }

  /**
   * Send DTMF
   * Sends DTMF tones from this leg. DTMF tones will be heard by the other end of the call.  **Expected Webhooks:**  There are no webhooks associated with this command. 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param sendDTMFRequest Send DTMF request (required)
   * @return ApiResponse&lt;CallControlCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CallControlCommandResponse> callSendDTMFWithHttpInfo(String callControlId, SendDTMFRequest sendDTMFRequest) throws ApiException {
    Object localVarPostBody = sendDTMFRequest;
    
    // verify the required parameter 'callControlId' is set
    if (callControlId == null) {
      throw new ApiException(400, "Missing the required parameter 'callControlId' when calling callSendDTMF");
    }
    
    // verify the required parameter 'sendDTMFRequest' is set
    if (sendDTMFRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'sendDTMFRequest' when calling callSendDTMF");
    }
    
    // create path and map variables
    String localVarPath = "/calls/{call_control_id}/actions/send_dtmf"
      .replaceAll("\\{" + "call_control_id" + "\\}", apiClient.escapeString(callControlId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CallControlCommandResponse> localVarReturnType = new GenericType<CallControlCommandResponse>() {};

    return apiClient.invokeAPI("CallCommandsApi.callSendDTMF", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Speak text
   * Convert text to speech and play it back on the call. If multiple speak text commands are issued consecutively, the audio files will be placed in a queue awaiting playback.  **Expected Webhooks:**  - &#x60;call.speak.started&#x60; - &#x60;call.speak.ended&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param speakRequest Speak request (required)
   * @return CallControlCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CallControlCommandResponse callSpeak(String callControlId, SpeakRequest speakRequest) throws ApiException {
    return callSpeakWithHttpInfo(callControlId, speakRequest).getData();
  }

  /**
   * Speak text
   * Convert text to speech and play it back on the call. If multiple speak text commands are issued consecutively, the audio files will be placed in a queue awaiting playback.  **Expected Webhooks:**  - &#x60;call.speak.started&#x60; - &#x60;call.speak.ended&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param speakRequest Speak request (required)
   * @return ApiResponse&lt;CallControlCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CallControlCommandResponse> callSpeakWithHttpInfo(String callControlId, SpeakRequest speakRequest) throws ApiException {
    Object localVarPostBody = speakRequest;
    
    // verify the required parameter 'callControlId' is set
    if (callControlId == null) {
      throw new ApiException(400, "Missing the required parameter 'callControlId' when calling callSpeak");
    }
    
    // verify the required parameter 'speakRequest' is set
    if (speakRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'speakRequest' when calling callSpeak");
    }
    
    // create path and map variables
    String localVarPath = "/calls/{call_control_id}/actions/speak"
      .replaceAll("\\{" + "call_control_id" + "\\}", apiClient.escapeString(callControlId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CallControlCommandResponse> localVarReturnType = new GenericType<CallControlCommandResponse>() {};

    return apiClient.invokeAPI("CallCommandsApi.callSpeak", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Transfer call
   * Transfer a call to a new destination. If the transfer is unsuccessful, a &#x60;call.hangup&#x60; webhook for the other call (Leg B) will be sent indicating that the transfer could not be completed. The original call will remain active and may be issued additional commands, potentially transfering the call to an alternate destination.  **Expected Webhooks:**  - &#x60;call.initiated&#x60; - &#x60;call.bridged&#x60; to Leg B - &#x60;call.answered&#x60; or &#x60;call.hangup&#x60; - &#x60;call.machine.detection.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested - &#x60;call.machine.greeting.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested to detect the end of machine greeting - &#x60;call.machine.premium.detection.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested - &#x60;call.machine.premium.greeting.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested and a beep was detected 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param transferCallRequest Transfer call request (required)
   * @return CallControlCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CallControlCommandResponse callTransfer(String callControlId, TransferCallRequest transferCallRequest) throws ApiException {
    return callTransferWithHttpInfo(callControlId, transferCallRequest).getData();
  }

  /**
   * Transfer call
   * Transfer a call to a new destination. If the transfer is unsuccessful, a &#x60;call.hangup&#x60; webhook for the other call (Leg B) will be sent indicating that the transfer could not be completed. The original call will remain active and may be issued additional commands, potentially transfering the call to an alternate destination.  **Expected Webhooks:**  - &#x60;call.initiated&#x60; - &#x60;call.bridged&#x60; to Leg B - &#x60;call.answered&#x60; or &#x60;call.hangup&#x60; - &#x60;call.machine.detection.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested - &#x60;call.machine.greeting.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested to detect the end of machine greeting - &#x60;call.machine.premium.detection.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested - &#x60;call.machine.premium.greeting.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested and a beep was detected 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param transferCallRequest Transfer call request (required)
   * @return ApiResponse&lt;CallControlCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CallControlCommandResponse> callTransferWithHttpInfo(String callControlId, TransferCallRequest transferCallRequest) throws ApiException {
    Object localVarPostBody = transferCallRequest;
    
    // verify the required parameter 'callControlId' is set
    if (callControlId == null) {
      throw new ApiException(400, "Missing the required parameter 'callControlId' when calling callTransfer");
    }
    
    // verify the required parameter 'transferCallRequest' is set
    if (transferCallRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'transferCallRequest' when calling callTransfer");
    }
    
    // create path and map variables
    String localVarPath = "/calls/{call_control_id}/actions/transfer"
      .replaceAll("\\{" + "call_control_id" + "\\}", apiClient.escapeString(callControlId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CallControlCommandResponse> localVarReturnType = new GenericType<CallControlCommandResponse>() {};

    return apiClient.invokeAPI("CallCommandsApi.callTransfer", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
