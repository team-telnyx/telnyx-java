package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;
import com.telnyx.sdk.model.AIAssistantStartRequest;
import com.telnyx.sdk.model.AIAssistantStopRequest;
import com.telnyx.sdk.model.AnswerRequest;
import com.telnyx.sdk.model.BridgeRequest;
import com.telnyx.sdk.model.CallControlCommandResponse;
import com.telnyx.sdk.model.CallRequest;
import com.telnyx.sdk.model.ClientStateUpdateRequest;
import com.telnyx.sdk.model.EnqueueRequest;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.GatherRequest;
import com.telnyx.sdk.model.GatherUsingAIRequest;
import com.telnyx.sdk.model.GatherUsingAudioRequest;
import com.telnyx.sdk.model.GatherUsingSpeakRequest;
import com.telnyx.sdk.model.HangupRequest;
import com.telnyx.sdk.model.LeaveQueueRequest;
import com.telnyx.sdk.model.NoiseSuppressionStart;
import com.telnyx.sdk.model.NoiseSuppressionStop;
import com.telnyx.sdk.model.PauseRecordingRequest;
import com.telnyx.sdk.model.PlayAudioUrlRequest;
import com.telnyx.sdk.model.PlaybackStopRequest;
import com.telnyx.sdk.model.ReferRequest;
import com.telnyx.sdk.model.RejectRequest;
import com.telnyx.sdk.model.ResumeRecordingRequest;
import com.telnyx.sdk.model.RetrieveCallStatusResponse;
import com.telnyx.sdk.model.SendDTMFRequest;
import com.telnyx.sdk.model.SendSIPInfoRequest;
import com.telnyx.sdk.model.SpeakRequest;
import com.telnyx.sdk.model.StartForkingRequest;
import com.telnyx.sdk.model.StartRecordingRequest;
import com.telnyx.sdk.model.StartSiprecRequest;
import com.telnyx.sdk.model.StartStreamingRequest;
import com.telnyx.sdk.model.StopForkingRequest;
import com.telnyx.sdk.model.StopGatherRequest;
import com.telnyx.sdk.model.StopRecordingRequest;
import com.telnyx.sdk.model.StopSiprecRequest;
import com.telnyx.sdk.model.StopStreamingRequest;
import com.telnyx.sdk.model.TranscriptionStartRequest;
import com.telnyx.sdk.model.TranscriptionStopRequest;
import com.telnyx.sdk.model.TransferCallRequest;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CallCommandsApi {

    private ApiClient apiClient;

    public CallCommandsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CallCommandsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get the API client
     *
     * @return API client
     */
    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Set the API client
     *
     * @param apiClient an instance of API client
     */
    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
   * Answer call
   * Answer an incoming call. You must issue this command before executing subsequent commands on an incoming call.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/answer-call#callbacks) below):**  - &#x60;call.answered&#x60; - &#x60;streaming.started&#x60;, &#x60;streaming.stopped&#x60; or &#x60;streaming.failed&#x60; if &#x60;stream_url&#x60; was set 
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
    public CallControlCommandResponse answerCall(
        String callControlId,
        AnswerRequest answerRequest
    ) throws ApiException {
        return answerCallWithHttpInfo(callControlId, answerRequest).getData();
    }

    /**
   * Answer call
   * Answer an incoming call. You must issue this command before executing subsequent commands on an incoming call.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/answer-call#callbacks) below):**  - &#x60;call.answered&#x60; - &#x60;streaming.started&#x60;, &#x60;streaming.stopped&#x60; or &#x60;streaming.failed&#x60; if &#x60;stream_url&#x60; was set 
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
    public ApiResponse<CallControlCommandResponse> answerCallWithHttpInfo(
        String callControlId,
        AnswerRequest answerRequest
    ) throws ApiException {
        Object localVarPostBody = answerRequest;

        // verify the required parameter 'callControlId' is set
        if (callControlId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callControlId' when calling answerCall"
            );
        }

        // verify the required parameter 'answerRequest' is set
        if (answerRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'answerRequest' when calling answerCall"
            );
        }

        // create path and map variables
        String localVarPath =
            "/calls/{call_control_id}/actions/answer".replaceAll(
                    "\\{" + "call_control_id" + "\\}",
                    apiClient.escapeString(callControlId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CallControlCommandResponse> localVarReturnType =
            new GenericType<CallControlCommandResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.answerCall",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * Bridge calls
   * Bridge two call control calls.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/bridge-call#callbacks) below):**  - &#x60;call.bridged&#x60; for Leg A - &#x60;call.bridged&#x60; for Leg B 
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
    public CallControlCommandResponse bridgeCall(
        String callControlId,
        BridgeRequest bridgeRequest
    ) throws ApiException {
        return bridgeCallWithHttpInfo(callControlId, bridgeRequest).getData();
    }

    /**
   * Bridge calls
   * Bridge two call control calls.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/bridge-call#callbacks) below):**  - &#x60;call.bridged&#x60; for Leg A - &#x60;call.bridged&#x60; for Leg B 
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
    public ApiResponse<CallControlCommandResponse> bridgeCallWithHttpInfo(
        String callControlId,
        BridgeRequest bridgeRequest
    ) throws ApiException {
        Object localVarPostBody = bridgeRequest;

        // verify the required parameter 'callControlId' is set
        if (callControlId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callControlId' when calling bridgeCall"
            );
        }

        // verify the required parameter 'bridgeRequest' is set
        if (bridgeRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'bridgeRequest' when calling bridgeCall"
            );
        }

        // create path and map variables
        String localVarPath =
            "/calls/{call_control_id}/actions/bridge".replaceAll(
                    "\\{" + "call_control_id" + "\\}",
                    apiClient.escapeString(callControlId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CallControlCommandResponse> localVarReturnType =
            new GenericType<CallControlCommandResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.bridgeCall",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * Gather using AI
   * Gather parameters defined in the request payload using a voice assistant.   You can pass parameters described as a JSON Schema object and the voice assistant will attempt to gather these informations.   **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/call-gather-using-ai#callbacks) below):**  - &#x60;call.ai_gather.ended&#x60; - &#x60;call.ai_gather.partial_results&#x60; (if &#x60;send_partial_results&#x60; is set to &#x60;true&#x60;) - &#x60;call.ai_gather.tool_call&#x60; (if &#x60;assistant.tools&#x60; are configured)
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param gatherUsingAIRequest Gather using AI request (required)
   * @return CallControlCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public CallControlCommandResponse callGatherUsingAI(
        String callControlId,
        GatherUsingAIRequest gatherUsingAIRequest
    ) throws ApiException {
        return callGatherUsingAIWithHttpInfo(
            callControlId,
            gatherUsingAIRequest
        ).getData();
    }

    /**
   * Gather using AI
   * Gather parameters defined in the request payload using a voice assistant.   You can pass parameters described as a JSON Schema object and the voice assistant will attempt to gather these informations.   **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/call-gather-using-ai#callbacks) below):**  - &#x60;call.ai_gather.ended&#x60; - &#x60;call.ai_gather.partial_results&#x60; (if &#x60;send_partial_results&#x60; is set to &#x60;true&#x60;) - &#x60;call.ai_gather.tool_call&#x60; (if &#x60;assistant.tools&#x60; are configured)
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param gatherUsingAIRequest Gather using AI request (required)
   * @return ApiResponse&lt;CallControlCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        CallControlCommandResponse
    > callGatherUsingAIWithHttpInfo(
        String callControlId,
        GatherUsingAIRequest gatherUsingAIRequest
    ) throws ApiException {
        Object localVarPostBody = gatherUsingAIRequest;

        // verify the required parameter 'callControlId' is set
        if (callControlId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callControlId' when calling callGatherUsingAI"
            );
        }

        // verify the required parameter 'gatherUsingAIRequest' is set
        if (gatherUsingAIRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'gatherUsingAIRequest' when calling callGatherUsingAI"
            );
        }

        // create path and map variables
        String localVarPath =
            "/calls/{call_control_id}/actions/gather_using_ai".replaceAll(
                    "\\{" + "call_control_id" + "\\}",
                    apiClient.escapeString(callControlId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CallControlCommandResponse> localVarReturnType =
            new GenericType<CallControlCommandResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.callGatherUsingAI",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * Start AI Assistant (BETA)
   * **BETA** - Start an AI assistant on the call.
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param aiAssistantStartRequest AI Assistant request (required)
   * @return CallControlCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public CallControlCommandResponse callStartAIAssistant(
        String callControlId,
        AIAssistantStartRequest aiAssistantStartRequest
    ) throws ApiException {
        return callStartAIAssistantWithHttpInfo(
            callControlId,
            aiAssistantStartRequest
        ).getData();
    }

    /**
   * Start AI Assistant (BETA)
   * **BETA** - Start an AI assistant on the call.
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param aiAssistantStartRequest AI Assistant request (required)
   * @return ApiResponse&lt;CallControlCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        CallControlCommandResponse
    > callStartAIAssistantWithHttpInfo(
        String callControlId,
        AIAssistantStartRequest aiAssistantStartRequest
    ) throws ApiException {
        Object localVarPostBody = aiAssistantStartRequest;

        // verify the required parameter 'callControlId' is set
        if (callControlId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callControlId' when calling callStartAIAssistant"
            );
        }

        // verify the required parameter 'aiAssistantStartRequest' is set
        if (aiAssistantStartRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'aiAssistantStartRequest' when calling callStartAIAssistant"
            );
        }

        // create path and map variables
        String localVarPath =
            "/calls/{call_control_id}/actions/ai_assistant_start".replaceAll(
                    "\\{" + "call_control_id" + "\\}",
                    apiClient.escapeString(callControlId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CallControlCommandResponse> localVarReturnType =
            new GenericType<CallControlCommandResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.callStartAIAssistant",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * Stop AI Assistant (BETA)
   * **BETA** - Stop an AI assistant on the call.
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param aiAssistantStopRequest AI Assistant request (required)
   * @return CallControlCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public CallControlCommandResponse callStopAIAssistant(
        String callControlId,
        AIAssistantStopRequest aiAssistantStopRequest
    ) throws ApiException {
        return callStopAIAssistantWithHttpInfo(
            callControlId,
            aiAssistantStopRequest
        ).getData();
    }

    /**
   * Stop AI Assistant (BETA)
   * **BETA** - Stop an AI assistant on the call.
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param aiAssistantStopRequest AI Assistant request (required)
   * @return ApiResponse&lt;CallControlCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        CallControlCommandResponse
    > callStopAIAssistantWithHttpInfo(
        String callControlId,
        AIAssistantStopRequest aiAssistantStopRequest
    ) throws ApiException {
        Object localVarPostBody = aiAssistantStopRequest;

        // verify the required parameter 'callControlId' is set
        if (callControlId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callControlId' when calling callStopAIAssistant"
            );
        }

        // verify the required parameter 'aiAssistantStopRequest' is set
        if (aiAssistantStopRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'aiAssistantStopRequest' when calling callStopAIAssistant"
            );
        }

        // create path and map variables
        String localVarPath =
            "/calls/{call_control_id}/actions/ai_assistant_stop".replaceAll(
                    "\\{" + "call_control_id" + "\\}",
                    apiClient.escapeString(callControlId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CallControlCommandResponse> localVarReturnType =
            new GenericType<CallControlCommandResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.callStopAIAssistant",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * Dial
   * Dial a number or SIP URI from a given connection. A successful response will include a &#x60;call_leg_id&#x60; which can be used to correlate the command with subsequent webhooks.  **Expected Webhooks (see [schema](https://developers.telnyx.com/api/call-control/dial-call#callbacks) below):**  - &#x60;call.initiated&#x60; - &#x60;call.answered&#x60; or &#x60;call.hangup&#x60; - &#x60;call.machine.detection.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested - &#x60;call.machine.greeting.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested to detect the end of machine greeting - &#x60;call.machine.premium.detection.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested - &#x60;call.machine.premium.greeting.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested and a beep was detected - &#x60;streaming.started&#x60;, &#x60;streaming.stopped&#x60; or &#x60;streaming.failed&#x60; if &#x60;stream_url&#x60; was set 
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
    public RetrieveCallStatusResponse dialCall(CallRequest callRequest)
        throws ApiException {
        return dialCallWithHttpInfo(callRequest).getData();
    }

    /**
   * Dial
   * Dial a number or SIP URI from a given connection. A successful response will include a &#x60;call_leg_id&#x60; which can be used to correlate the command with subsequent webhooks.  **Expected Webhooks (see [schema](https://developers.telnyx.com/api/call-control/dial-call#callbacks) below):**  - &#x60;call.initiated&#x60; - &#x60;call.answered&#x60; or &#x60;call.hangup&#x60; - &#x60;call.machine.detection.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested - &#x60;call.machine.greeting.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested to detect the end of machine greeting - &#x60;call.machine.premium.detection.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested - &#x60;call.machine.premium.greeting.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested and a beep was detected - &#x60;streaming.started&#x60;, &#x60;streaming.stopped&#x60; or &#x60;streaming.failed&#x60; if &#x60;stream_url&#x60; was set 
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
    public ApiResponse<RetrieveCallStatusResponse> dialCallWithHttpInfo(
        CallRequest callRequest
    ) throws ApiException {
        Object localVarPostBody = callRequest;

        // verify the required parameter 'callRequest' is set
        if (callRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callRequest' when calling dialCall"
            );
        }

        // create path and map variables
        String localVarPath = "/calls";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<RetrieveCallStatusResponse> localVarReturnType =
            new GenericType<RetrieveCallStatusResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.dialCall",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * Enqueue call
   * Put the call in a queue.
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param enqueueRequest Enqueue call request (required)
   * @return CallControlCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public CallControlCommandResponse enqueueCall(
        String callControlId,
        EnqueueRequest enqueueRequest
    ) throws ApiException {
        return enqueueCallWithHttpInfo(callControlId, enqueueRequest).getData();
    }

    /**
   * Enqueue call
   * Put the call in a queue.
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param enqueueRequest Enqueue call request (required)
   * @return ApiResponse&lt;CallControlCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<CallControlCommandResponse> enqueueCallWithHttpInfo(
        String callControlId,
        EnqueueRequest enqueueRequest
    ) throws ApiException {
        Object localVarPostBody = enqueueRequest;

        // verify the required parameter 'callControlId' is set
        if (callControlId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callControlId' when calling enqueueCall"
            );
        }

        // verify the required parameter 'enqueueRequest' is set
        if (enqueueRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'enqueueRequest' when calling enqueueCall"
            );
        }

        // create path and map variables
        String localVarPath =
            "/calls/{call_control_id}/actions/enqueue".replaceAll(
                    "\\{" + "call_control_id" + "\\}",
                    apiClient.escapeString(callControlId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CallControlCommandResponse> localVarReturnType =
            new GenericType<CallControlCommandResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.enqueueCall",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * Gather
   * Gather DTMF signals to build interactive menus.  You can pass a list of valid digits. The &#x60;Answer&#x60; command must be issued before the &#x60;gather&#x60; command.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/gather-call#callbacks) below):**  - &#x60;call.dtmf.received&#x60; (you may receive many of these webhooks) - &#x60;call.gather.ended&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param gatherRequest Gather (required)
   * @return CallControlCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public CallControlCommandResponse gatherCall(
        String callControlId,
        GatherRequest gatherRequest
    ) throws ApiException {
        return gatherCallWithHttpInfo(callControlId, gatherRequest).getData();
    }

    /**
   * Gather
   * Gather DTMF signals to build interactive menus.  You can pass a list of valid digits. The &#x60;Answer&#x60; command must be issued before the &#x60;gather&#x60; command.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/gather-call#callbacks) below):**  - &#x60;call.dtmf.received&#x60; (you may receive many of these webhooks) - &#x60;call.gather.ended&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param gatherRequest Gather (required)
   * @return ApiResponse&lt;CallControlCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<CallControlCommandResponse> gatherCallWithHttpInfo(
        String callControlId,
        GatherRequest gatherRequest
    ) throws ApiException {
        Object localVarPostBody = gatherRequest;

        // verify the required parameter 'callControlId' is set
        if (callControlId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callControlId' when calling gatherCall"
            );
        }

        // verify the required parameter 'gatherRequest' is set
        if (gatherRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'gatherRequest' when calling gatherCall"
            );
        }

        // create path and map variables
        String localVarPath =
            "/calls/{call_control_id}/actions/gather".replaceAll(
                    "\\{" + "call_control_id" + "\\}",
                    apiClient.escapeString(callControlId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CallControlCommandResponse> localVarReturnType =
            new GenericType<CallControlCommandResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.gatherCall",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * Gather using audio
   * Play an audio file on the call until the required DTMF signals are gathered to build interactive menus.  You can pass a list of valid digits along with an &#39;invalid_audio_url&#39;, which will be played back at the beginning of each prompt. Playback will be interrupted when a DTMF signal is received. The &#x60;Answer command must be issued before the &#x60;gather_using_audio&#x60; command.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/gather-using-audio#callbacks) below):**  - &#x60;call.playback.started&#x60; - &#x60;call.playback.ended&#x60; - &#x60;call.dtmf.received&#x60; (you may receive many of these webhooks) - &#x60;call.gather.ended&#x60; 
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
    public CallControlCommandResponse gatherUsingAudio(
        String callControlId,
        GatherUsingAudioRequest gatherUsingAudioRequest
    ) throws ApiException {
        return gatherUsingAudioWithHttpInfo(
            callControlId,
            gatherUsingAudioRequest
        ).getData();
    }

    /**
   * Gather using audio
   * Play an audio file on the call until the required DTMF signals are gathered to build interactive menus.  You can pass a list of valid digits along with an &#39;invalid_audio_url&#39;, which will be played back at the beginning of each prompt. Playback will be interrupted when a DTMF signal is received. The &#x60;Answer command must be issued before the &#x60;gather_using_audio&#x60; command.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/gather-using-audio#callbacks) below):**  - &#x60;call.playback.started&#x60; - &#x60;call.playback.ended&#x60; - &#x60;call.dtmf.received&#x60; (you may receive many of these webhooks) - &#x60;call.gather.ended&#x60; 
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
    public ApiResponse<CallControlCommandResponse> gatherUsingAudioWithHttpInfo(
        String callControlId,
        GatherUsingAudioRequest gatherUsingAudioRequest
    ) throws ApiException {
        Object localVarPostBody = gatherUsingAudioRequest;

        // verify the required parameter 'callControlId' is set
        if (callControlId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callControlId' when calling gatherUsingAudio"
            );
        }

        // verify the required parameter 'gatherUsingAudioRequest' is set
        if (gatherUsingAudioRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'gatherUsingAudioRequest' when calling gatherUsingAudio"
            );
        }

        // create path and map variables
        String localVarPath =
            "/calls/{call_control_id}/actions/gather_using_audio".replaceAll(
                    "\\{" + "call_control_id" + "\\}",
                    apiClient.escapeString(callControlId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CallControlCommandResponse> localVarReturnType =
            new GenericType<CallControlCommandResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.gatherUsingAudio",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * Gather using speak
   * Convert text to speech and play it on the call until the required DTMF signals are gathered to build interactive menus.  You can pass a list of valid digits along with an &#39;invalid_payload&#39;, which will be played back at the beginning of each prompt. Speech will be interrupted when a DTMF signal is received. The &#x60;Answer&#x60; command must be issued before the &#x60;gather_using_speak&#x60; command.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/gather-using-speak#callbacks) below):**  - &#x60;call.dtmf.received&#x60; (you may receive many of these webhooks) - &#x60;call.gather.ended&#x60; 
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
    public CallControlCommandResponse gatherUsingSpeak(
        String callControlId,
        GatherUsingSpeakRequest gatherUsingSpeakRequest
    ) throws ApiException {
        return gatherUsingSpeakWithHttpInfo(
            callControlId,
            gatherUsingSpeakRequest
        ).getData();
    }

    /**
   * Gather using speak
   * Convert text to speech and play it on the call until the required DTMF signals are gathered to build interactive menus.  You can pass a list of valid digits along with an &#39;invalid_payload&#39;, which will be played back at the beginning of each prompt. Speech will be interrupted when a DTMF signal is received. The &#x60;Answer&#x60; command must be issued before the &#x60;gather_using_speak&#x60; command.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/gather-using-speak#callbacks) below):**  - &#x60;call.dtmf.received&#x60; (you may receive many of these webhooks) - &#x60;call.gather.ended&#x60; 
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
    public ApiResponse<CallControlCommandResponse> gatherUsingSpeakWithHttpInfo(
        String callControlId,
        GatherUsingSpeakRequest gatherUsingSpeakRequest
    ) throws ApiException {
        Object localVarPostBody = gatherUsingSpeakRequest;

        // verify the required parameter 'callControlId' is set
        if (callControlId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callControlId' when calling gatherUsingSpeak"
            );
        }

        // verify the required parameter 'gatherUsingSpeakRequest' is set
        if (gatherUsingSpeakRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'gatherUsingSpeakRequest' when calling gatherUsingSpeak"
            );
        }

        // create path and map variables
        String localVarPath =
            "/calls/{call_control_id}/actions/gather_using_speak".replaceAll(
                    "\\{" + "call_control_id" + "\\}",
                    apiClient.escapeString(callControlId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CallControlCommandResponse> localVarReturnType =
            new GenericType<CallControlCommandResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.gatherUsingSpeak",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * Hangup call
   * Hang up the call.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/hangup-call#callbacks) below):**  - &#x60;call.hangup&#x60; - &#x60;call.recording.saved&#x60; 
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
    public CallControlCommandResponse hangupCall(
        String callControlId,
        HangupRequest hangupRequest
    ) throws ApiException {
        return hangupCallWithHttpInfo(callControlId, hangupRequest).getData();
    }

    /**
   * Hangup call
   * Hang up the call.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/hangup-call#callbacks) below):**  - &#x60;call.hangup&#x60; - &#x60;call.recording.saved&#x60; 
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
    public ApiResponse<CallControlCommandResponse> hangupCallWithHttpInfo(
        String callControlId,
        HangupRequest hangupRequest
    ) throws ApiException {
        Object localVarPostBody = hangupRequest;

        // verify the required parameter 'callControlId' is set
        if (callControlId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callControlId' when calling hangupCall"
            );
        }

        // verify the required parameter 'hangupRequest' is set
        if (hangupRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'hangupRequest' when calling hangupCall"
            );
        }

        // create path and map variables
        String localVarPath =
            "/calls/{call_control_id}/actions/hangup".replaceAll(
                    "\\{" + "call_control_id" + "\\}",
                    apiClient.escapeString(callControlId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CallControlCommandResponse> localVarReturnType =
            new GenericType<CallControlCommandResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.hangupCall",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * Remove call from a queue
   * Removes the call from a queue.
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param leaveQueueRequest Removes the call from the queue, the call currently is enqueued in. (required)
   * @return CallControlCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public CallControlCommandResponse leaveQueue(
        String callControlId,
        LeaveQueueRequest leaveQueueRequest
    ) throws ApiException {
        return leaveQueueWithHttpInfo(
            callControlId,
            leaveQueueRequest
        ).getData();
    }

    /**
   * Remove call from a queue
   * Removes the call from a queue.
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param leaveQueueRequest Removes the call from the queue, the call currently is enqueued in. (required)
   * @return ApiResponse&lt;CallControlCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<CallControlCommandResponse> leaveQueueWithHttpInfo(
        String callControlId,
        LeaveQueueRequest leaveQueueRequest
    ) throws ApiException {
        Object localVarPostBody = leaveQueueRequest;

        // verify the required parameter 'callControlId' is set
        if (callControlId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callControlId' when calling leaveQueue"
            );
        }

        // verify the required parameter 'leaveQueueRequest' is set
        if (leaveQueueRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'leaveQueueRequest' when calling leaveQueue"
            );
        }

        // create path and map variables
        String localVarPath =
            "/calls/{call_control_id}/actions/leave_queue".replaceAll(
                    "\\{" + "call_control_id" + "\\}",
                    apiClient.escapeString(callControlId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CallControlCommandResponse> localVarReturnType =
            new GenericType<CallControlCommandResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.leaveQueue",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * Noise Suppression Start (BETA)
   * 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param noiseSuppressionStart Start streaming media request (required)
   * @return CallControlCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public CallControlCommandResponse noiseSuppressionStart(
        String callControlId,
        NoiseSuppressionStart noiseSuppressionStart
    ) throws ApiException {
        return noiseSuppressionStartWithHttpInfo(
            callControlId,
            noiseSuppressionStart
        ).getData();
    }

    /**
   * Noise Suppression Start (BETA)
   * 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param noiseSuppressionStart Start streaming media request (required)
   * @return ApiResponse&lt;CallControlCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        CallControlCommandResponse
    > noiseSuppressionStartWithHttpInfo(
        String callControlId,
        NoiseSuppressionStart noiseSuppressionStart
    ) throws ApiException {
        Object localVarPostBody = noiseSuppressionStart;

        // verify the required parameter 'callControlId' is set
        if (callControlId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callControlId' when calling noiseSuppressionStart"
            );
        }

        // verify the required parameter 'noiseSuppressionStart' is set
        if (noiseSuppressionStart == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'noiseSuppressionStart' when calling noiseSuppressionStart"
            );
        }

        // create path and map variables
        String localVarPath =
            "/calls/{call_control_id}/actions/suppression_start".replaceAll(
                    "\\{" + "call_control_id" + "\\}",
                    apiClient.escapeString(callControlId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CallControlCommandResponse> localVarReturnType =
            new GenericType<CallControlCommandResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.noiseSuppressionStart",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * Noise Suppression Stop (BETA)
   * 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param noiseSuppressionStop Start streaming media request (required)
   * @return CallControlCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public CallControlCommandResponse noiseSuppressionStop(
        String callControlId,
        NoiseSuppressionStop noiseSuppressionStop
    ) throws ApiException {
        return noiseSuppressionStopWithHttpInfo(
            callControlId,
            noiseSuppressionStop
        ).getData();
    }

    /**
   * Noise Suppression Stop (BETA)
   * 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param noiseSuppressionStop Start streaming media request (required)
   * @return ApiResponse&lt;CallControlCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        CallControlCommandResponse
    > noiseSuppressionStopWithHttpInfo(
        String callControlId,
        NoiseSuppressionStop noiseSuppressionStop
    ) throws ApiException {
        Object localVarPostBody = noiseSuppressionStop;

        // verify the required parameter 'callControlId' is set
        if (callControlId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callControlId' when calling noiseSuppressionStop"
            );
        }

        // verify the required parameter 'noiseSuppressionStop' is set
        if (noiseSuppressionStop == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'noiseSuppressionStop' when calling noiseSuppressionStop"
            );
        }

        // create path and map variables
        String localVarPath =
            "/calls/{call_control_id}/actions/suppression_stop".replaceAll(
                    "\\{" + "call_control_id" + "\\}",
                    apiClient.escapeString(callControlId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CallControlCommandResponse> localVarReturnType =
            new GenericType<CallControlCommandResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.noiseSuppressionStop",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
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
    public CallControlCommandResponse pauseCallRecording(
        String callControlId,
        PauseRecordingRequest pauseRecordingRequest
    ) throws ApiException {
        return pauseCallRecordingWithHttpInfo(
            callControlId,
            pauseRecordingRequest
        ).getData();
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
    public ApiResponse<
        CallControlCommandResponse
    > pauseCallRecordingWithHttpInfo(
        String callControlId,
        PauseRecordingRequest pauseRecordingRequest
    ) throws ApiException {
        Object localVarPostBody = pauseRecordingRequest;

        // verify the required parameter 'callControlId' is set
        if (callControlId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callControlId' when calling pauseCallRecording"
            );
        }

        // verify the required parameter 'pauseRecordingRequest' is set
        if (pauseRecordingRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'pauseRecordingRequest' when calling pauseCallRecording"
            );
        }

        // create path and map variables
        String localVarPath =
            "/calls/{call_control_id}/actions/record_pause".replaceAll(
                    "\\{" + "call_control_id" + "\\}",
                    apiClient.escapeString(callControlId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CallControlCommandResponse> localVarReturnType =
            new GenericType<CallControlCommandResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.pauseCallRecording",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * SIP Refer a call
   * Initiate a SIP Refer on a Call Control call. You can initiate a SIP Refer at any point in the duration of a call.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/refer-call#callbacks) below):**  - &#x60;call.refer.started&#x60; - &#x60;call.refer.completed&#x60; - &#x60;call.refer.failed&#x60; 
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
    public CallControlCommandResponse referCall(
        String callControlId,
        ReferRequest referRequest
    ) throws ApiException {
        return referCallWithHttpInfo(callControlId, referRequest).getData();
    }

    /**
   * SIP Refer a call
   * Initiate a SIP Refer on a Call Control call. You can initiate a SIP Refer at any point in the duration of a call.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/refer-call#callbacks) below):**  - &#x60;call.refer.started&#x60; - &#x60;call.refer.completed&#x60; - &#x60;call.refer.failed&#x60; 
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
    public ApiResponse<CallControlCommandResponse> referCallWithHttpInfo(
        String callControlId,
        ReferRequest referRequest
    ) throws ApiException {
        Object localVarPostBody = referRequest;

        // verify the required parameter 'callControlId' is set
        if (callControlId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callControlId' when calling referCall"
            );
        }

        // verify the required parameter 'referRequest' is set
        if (referRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'referRequest' when calling referCall"
            );
        }

        // create path and map variables
        String localVarPath =
            "/calls/{call_control_id}/actions/refer".replaceAll(
                    "\\{" + "call_control_id" + "\\}",
                    apiClient.escapeString(callControlId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CallControlCommandResponse> localVarReturnType =
            new GenericType<CallControlCommandResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.referCall",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * Reject a call
   * Reject an incoming call.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/reject-call#callbacks) below):**  - &#x60;call.hangup&#x60; 
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
    public CallControlCommandResponse rejectCall(
        String callControlId,
        RejectRequest rejectRequest
    ) throws ApiException {
        return rejectCallWithHttpInfo(callControlId, rejectRequest).getData();
    }

    /**
   * Reject a call
   * Reject an incoming call.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/reject-call#callbacks) below):**  - &#x60;call.hangup&#x60; 
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
    public ApiResponse<CallControlCommandResponse> rejectCallWithHttpInfo(
        String callControlId,
        RejectRequest rejectRequest
    ) throws ApiException {
        Object localVarPostBody = rejectRequest;

        // verify the required parameter 'callControlId' is set
        if (callControlId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callControlId' when calling rejectCall"
            );
        }

        // verify the required parameter 'rejectRequest' is set
        if (rejectRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'rejectRequest' when calling rejectCall"
            );
        }

        // create path and map variables
        String localVarPath =
            "/calls/{call_control_id}/actions/reject".replaceAll(
                    "\\{" + "call_control_id" + "\\}",
                    apiClient.escapeString(callControlId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CallControlCommandResponse> localVarReturnType =
            new GenericType<CallControlCommandResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.rejectCall",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
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
    public CallControlCommandResponse resumeCallRecording(
        String callControlId,
        ResumeRecordingRequest resumeRecordingRequest
    ) throws ApiException {
        return resumeCallRecordingWithHttpInfo(
            callControlId,
            resumeRecordingRequest
        ).getData();
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
    public ApiResponse<
        CallControlCommandResponse
    > resumeCallRecordingWithHttpInfo(
        String callControlId,
        ResumeRecordingRequest resumeRecordingRequest
    ) throws ApiException {
        Object localVarPostBody = resumeRecordingRequest;

        // verify the required parameter 'callControlId' is set
        if (callControlId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callControlId' when calling resumeCallRecording"
            );
        }

        // verify the required parameter 'resumeRecordingRequest' is set
        if (resumeRecordingRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'resumeRecordingRequest' when calling resumeCallRecording"
            );
        }

        // create path and map variables
        String localVarPath =
            "/calls/{call_control_id}/actions/record_resume".replaceAll(
                    "\\{" + "call_control_id" + "\\}",
                    apiClient.escapeString(callControlId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CallControlCommandResponse> localVarReturnType =
            new GenericType<CallControlCommandResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.resumeCallRecording",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
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
    public CallControlCommandResponse sendDTMF(
        String callControlId,
        SendDTMFRequest sendDTMFRequest
    ) throws ApiException {
        return sendDTMFWithHttpInfo(callControlId, sendDTMFRequest).getData();
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
    public ApiResponse<CallControlCommandResponse> sendDTMFWithHttpInfo(
        String callControlId,
        SendDTMFRequest sendDTMFRequest
    ) throws ApiException {
        Object localVarPostBody = sendDTMFRequest;

        // verify the required parameter 'callControlId' is set
        if (callControlId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callControlId' when calling sendDTMF"
            );
        }

        // verify the required parameter 'sendDTMFRequest' is set
        if (sendDTMFRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'sendDTMFRequest' when calling sendDTMF"
            );
        }

        // create path and map variables
        String localVarPath =
            "/calls/{call_control_id}/actions/send_dtmf".replaceAll(
                    "\\{" + "call_control_id" + "\\}",
                    apiClient.escapeString(callControlId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CallControlCommandResponse> localVarReturnType =
            new GenericType<CallControlCommandResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.sendDTMF",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * Send SIP info
   * Sends SIP info from this leg.  **Expected Webhooks:**  - &#x60;call.sip_info.received&#x60; (to be received on the target call leg) 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param sendSIPInfoRequest Send SIP INFO request (required)
   * @return CallControlCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public CallControlCommandResponse sendSIPInfo(
        String callControlId,
        SendSIPInfoRequest sendSIPInfoRequest
    ) throws ApiException {
        return sendSIPInfoWithHttpInfo(
            callControlId,
            sendSIPInfoRequest
        ).getData();
    }

    /**
   * Send SIP info
   * Sends SIP info from this leg.  **Expected Webhooks:**  - &#x60;call.sip_info.received&#x60; (to be received on the target call leg) 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param sendSIPInfoRequest Send SIP INFO request (required)
   * @return ApiResponse&lt;CallControlCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<CallControlCommandResponse> sendSIPInfoWithHttpInfo(
        String callControlId,
        SendSIPInfoRequest sendSIPInfoRequest
    ) throws ApiException {
        Object localVarPostBody = sendSIPInfoRequest;

        // verify the required parameter 'callControlId' is set
        if (callControlId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callControlId' when calling sendSIPInfo"
            );
        }

        // verify the required parameter 'sendSIPInfoRequest' is set
        if (sendSIPInfoRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'sendSIPInfoRequest' when calling sendSIPInfo"
            );
        }

        // create path and map variables
        String localVarPath =
            "/calls/{call_control_id}/actions/send_sip_info".replaceAll(
                    "\\{" + "call_control_id" + "\\}",
                    apiClient.escapeString(callControlId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CallControlCommandResponse> localVarReturnType =
            new GenericType<CallControlCommandResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.sendSIPInfo",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * Speak text
   * Convert text to speech and play it back on the call. If multiple speak text commands are issued consecutively, the audio files will be placed in a queue awaiting playback.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/speak-call#callbacks) below):**  - &#x60;call.speak.started&#x60; - &#x60;call.speak.ended&#x60; 
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
    public CallControlCommandResponse speakCall(
        String callControlId,
        SpeakRequest speakRequest
    ) throws ApiException {
        return speakCallWithHttpInfo(callControlId, speakRequest).getData();
    }

    /**
   * Speak text
   * Convert text to speech and play it back on the call. If multiple speak text commands are issued consecutively, the audio files will be placed in a queue awaiting playback.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/speak-call#callbacks) below):**  - &#x60;call.speak.started&#x60; - &#x60;call.speak.ended&#x60; 
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
    public ApiResponse<CallControlCommandResponse> speakCallWithHttpInfo(
        String callControlId,
        SpeakRequest speakRequest
    ) throws ApiException {
        Object localVarPostBody = speakRequest;

        // verify the required parameter 'callControlId' is set
        if (callControlId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callControlId' when calling speakCall"
            );
        }

        // verify the required parameter 'speakRequest' is set
        if (speakRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'speakRequest' when calling speakCall"
            );
        }

        // create path and map variables
        String localVarPath =
            "/calls/{call_control_id}/actions/speak".replaceAll(
                    "\\{" + "call_control_id" + "\\}",
                    apiClient.escapeString(callControlId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CallControlCommandResponse> localVarReturnType =
            new GenericType<CallControlCommandResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.speakCall",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * Forking start
   * Call forking allows you to stream the media from a call to a specific target in realtime.  This stream can be used to enable realtime audio analysis to support a  variety of use cases, including fraud detection, or the creation of AI-generated audio responses.  Requests must specify either the &#x60;target&#x60; attribute or the &#x60;rx&#x60; and &#x60;tx&#x60; attributes.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/start-call-fork#callbacks) below):**  - &#x60;call.fork.started&#x60; - &#x60;call.fork.stopped&#x60;  
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
    public CallControlCommandResponse startCallFork(
        String callControlId,
        StartForkingRequest startForkingRequest
    ) throws ApiException {
        return startCallForkWithHttpInfo(
            callControlId,
            startForkingRequest
        ).getData();
    }

    /**
   * Forking start
   * Call forking allows you to stream the media from a call to a specific target in realtime.  This stream can be used to enable realtime audio analysis to support a  variety of use cases, including fraud detection, or the creation of AI-generated audio responses.  Requests must specify either the &#x60;target&#x60; attribute or the &#x60;rx&#x60; and &#x60;tx&#x60; attributes.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/start-call-fork#callbacks) below):**  - &#x60;call.fork.started&#x60; - &#x60;call.fork.stopped&#x60;  
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
    public ApiResponse<CallControlCommandResponse> startCallForkWithHttpInfo(
        String callControlId,
        StartForkingRequest startForkingRequest
    ) throws ApiException {
        Object localVarPostBody = startForkingRequest;

        // verify the required parameter 'callControlId' is set
        if (callControlId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callControlId' when calling startCallFork"
            );
        }

        // verify the required parameter 'startForkingRequest' is set
        if (startForkingRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'startForkingRequest' when calling startCallFork"
            );
        }

        // create path and map variables
        String localVarPath =
            "/calls/{call_control_id}/actions/fork_start".replaceAll(
                    "\\{" + "call_control_id" + "\\}",
                    apiClient.escapeString(callControlId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CallControlCommandResponse> localVarReturnType =
            new GenericType<CallControlCommandResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.startCallFork",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * Play audio URL
   * Play an audio file on the call. If multiple play audio commands are issued consecutively, the audio files will be placed in a queue awaiting playback.  *Notes:*  - When &#x60;overlay&#x60; is enabled, &#x60;target_legs&#x60; is limited to &#x60;self&#x60;. - A customer cannot Play Audio with &#x60;overlay&#x3D;true&#x60; unless there is a Play Audio with &#x60;overlay&#x3D;false&#x60; actively playing.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/start-call-playback#callbacks) below):**  - &#x60;call.playback.started&#x60; - &#x60;call.playback.ended&#x60; 
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
    public CallControlCommandResponse startCallPlayback(
        String callControlId,
        PlayAudioUrlRequest playAudioUrlRequest
    ) throws ApiException {
        return startCallPlaybackWithHttpInfo(
            callControlId,
            playAudioUrlRequest
        ).getData();
    }

    /**
   * Play audio URL
   * Play an audio file on the call. If multiple play audio commands are issued consecutively, the audio files will be placed in a queue awaiting playback.  *Notes:*  - When &#x60;overlay&#x60; is enabled, &#x60;target_legs&#x60; is limited to &#x60;self&#x60;. - A customer cannot Play Audio with &#x60;overlay&#x3D;true&#x60; unless there is a Play Audio with &#x60;overlay&#x3D;false&#x60; actively playing.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/start-call-playback#callbacks) below):**  - &#x60;call.playback.started&#x60; - &#x60;call.playback.ended&#x60; 
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
    public ApiResponse<
        CallControlCommandResponse
    > startCallPlaybackWithHttpInfo(
        String callControlId,
        PlayAudioUrlRequest playAudioUrlRequest
    ) throws ApiException {
        Object localVarPostBody = playAudioUrlRequest;

        // verify the required parameter 'callControlId' is set
        if (callControlId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callControlId' when calling startCallPlayback"
            );
        }

        // verify the required parameter 'playAudioUrlRequest' is set
        if (playAudioUrlRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'playAudioUrlRequest' when calling startCallPlayback"
            );
        }

        // create path and map variables
        String localVarPath =
            "/calls/{call_control_id}/actions/playback_start".replaceAll(
                    "\\{" + "call_control_id" + "\\}",
                    apiClient.escapeString(callControlId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CallControlCommandResponse> localVarReturnType =
            new GenericType<CallControlCommandResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.startCallPlayback",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * Recording start
   * Start recording the call. Recording will stop on call hang-up, or can be initiated via the Stop Recording command.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/start-call-record#callbacks) below):**  - &#x60;call.recording.saved&#x60; 
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
    public CallControlCommandResponse startCallRecord(
        String callControlId,
        StartRecordingRequest startRecordingRequest
    ) throws ApiException {
        return startCallRecordWithHttpInfo(
            callControlId,
            startRecordingRequest
        ).getData();
    }

    /**
   * Recording start
   * Start recording the call. Recording will stop on call hang-up, or can be initiated via the Stop Recording command.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/start-call-record#callbacks) below):**  - &#x60;call.recording.saved&#x60; 
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
    public ApiResponse<CallControlCommandResponse> startCallRecordWithHttpInfo(
        String callControlId,
        StartRecordingRequest startRecordingRequest
    ) throws ApiException {
        Object localVarPostBody = startRecordingRequest;

        // verify the required parameter 'callControlId' is set
        if (callControlId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callControlId' when calling startCallRecord"
            );
        }

        // verify the required parameter 'startRecordingRequest' is set
        if (startRecordingRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'startRecordingRequest' when calling startCallRecord"
            );
        }

        // create path and map variables
        String localVarPath =
            "/calls/{call_control_id}/actions/record_start".replaceAll(
                    "\\{" + "call_control_id" + "\\}",
                    apiClient.escapeString(callControlId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CallControlCommandResponse> localVarReturnType =
            new GenericType<CallControlCommandResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.startCallRecord",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * Streaming start
   * Start streaming the media from a call to a specific WebSocket address or Dialogflow connection in near-realtime. Audio will be delivered as base64-encoded RTP payload (raw audio), wrapped in JSON payloads.  Please find more details about media streaming messages specification under the [link](https://developers.telnyx.com/docs/voice/programmable-voice/media-streaming).
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param startStreamingRequest Start streaming media request (required)
   * @return CallControlCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public CallControlCommandResponse startCallStreaming(
        String callControlId,
        StartStreamingRequest startStreamingRequest
    ) throws ApiException {
        return startCallStreamingWithHttpInfo(
            callControlId,
            startStreamingRequest
        ).getData();
    }

    /**
   * Streaming start
   * Start streaming the media from a call to a specific WebSocket address or Dialogflow connection in near-realtime. Audio will be delivered as base64-encoded RTP payload (raw audio), wrapped in JSON payloads.  Please find more details about media streaming messages specification under the [link](https://developers.telnyx.com/docs/voice/programmable-voice/media-streaming).
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param startStreamingRequest Start streaming media request (required)
   * @return ApiResponse&lt;CallControlCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        CallControlCommandResponse
    > startCallStreamingWithHttpInfo(
        String callControlId,
        StartStreamingRequest startStreamingRequest
    ) throws ApiException {
        Object localVarPostBody = startStreamingRequest;

        // verify the required parameter 'callControlId' is set
        if (callControlId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callControlId' when calling startCallStreaming"
            );
        }

        // verify the required parameter 'startStreamingRequest' is set
        if (startStreamingRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'startStreamingRequest' when calling startCallStreaming"
            );
        }

        // create path and map variables
        String localVarPath =
            "/calls/{call_control_id}/actions/streaming_start".replaceAll(
                    "\\{" + "call_control_id" + "\\}",
                    apiClient.escapeString(callControlId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CallControlCommandResponse> localVarReturnType =
            new GenericType<CallControlCommandResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.startCallStreaming",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * Transcription start
   * Start real-time transcription. Transcription will stop on call hang-up, or can be initiated via the Transcription stop command.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/start-call-transcription#callbacks) below):**  - &#x60;call.transcription&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param transcriptionStartRequest Transcription start request (required)
   * @return CallControlCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public CallControlCommandResponse startCallTranscription(
        String callControlId,
        TranscriptionStartRequest transcriptionStartRequest
    ) throws ApiException {
        return startCallTranscriptionWithHttpInfo(
            callControlId,
            transcriptionStartRequest
        ).getData();
    }

    /**
   * Transcription start
   * Start real-time transcription. Transcription will stop on call hang-up, or can be initiated via the Transcription stop command.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/start-call-transcription#callbacks) below):**  - &#x60;call.transcription&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param transcriptionStartRequest Transcription start request (required)
   * @return ApiResponse&lt;CallControlCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        CallControlCommandResponse
    > startCallTranscriptionWithHttpInfo(
        String callControlId,
        TranscriptionStartRequest transcriptionStartRequest
    ) throws ApiException {
        Object localVarPostBody = transcriptionStartRequest;

        // verify the required parameter 'callControlId' is set
        if (callControlId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callControlId' when calling startCallTranscription"
            );
        }

        // verify the required parameter 'transcriptionStartRequest' is set
        if (transcriptionStartRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'transcriptionStartRequest' when calling startCallTranscription"
            );
        }

        // create path and map variables
        String localVarPath =
            "/calls/{call_control_id}/actions/transcription_start".replaceAll(
                    "\\{" + "call_control_id" + "\\}",
                    apiClient.escapeString(callControlId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CallControlCommandResponse> localVarReturnType =
            new GenericType<CallControlCommandResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.startCallTranscription",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * SIPREC start
   * Start siprec session to configured in SIPREC connector SRS.   **Expected Webhooks:**  - &#x60;siprec.started&#x60; - &#x60;siprec.stopped&#x60; - &#x60;siprec.failed&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param startSiprecRequest Start siprec session to configured in SIPREC connector SRS. (required)
   * @return CallControlCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public CallControlCommandResponse startSiprecSession(
        String callControlId,
        StartSiprecRequest startSiprecRequest
    ) throws ApiException {
        return startSiprecSessionWithHttpInfo(
            callControlId,
            startSiprecRequest
        ).getData();
    }

    /**
   * SIPREC start
   * Start siprec session to configured in SIPREC connector SRS.   **Expected Webhooks:**  - &#x60;siprec.started&#x60; - &#x60;siprec.stopped&#x60; - &#x60;siprec.failed&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param startSiprecRequest Start siprec session to configured in SIPREC connector SRS. (required)
   * @return ApiResponse&lt;CallControlCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        CallControlCommandResponse
    > startSiprecSessionWithHttpInfo(
        String callControlId,
        StartSiprecRequest startSiprecRequest
    ) throws ApiException {
        Object localVarPostBody = startSiprecRequest;

        // verify the required parameter 'callControlId' is set
        if (callControlId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callControlId' when calling startSiprecSession"
            );
        }

        // verify the required parameter 'startSiprecRequest' is set
        if (startSiprecRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'startSiprecRequest' when calling startSiprecSession"
            );
        }

        // create path and map variables
        String localVarPath =
            "/calls/{call_control_id}/actions/siprec_start".replaceAll(
                    "\\{" + "call_control_id" + "\\}",
                    apiClient.escapeString(callControlId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CallControlCommandResponse> localVarReturnType =
            new GenericType<CallControlCommandResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.startSiprecSession",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * Forking stop
   * Stop forking a call.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/stop-call-fork#callbacks) below):**  - &#x60;call.fork.stopped&#x60; 
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
    public CallControlCommandResponse stopCallFork(
        String callControlId,
        StopForkingRequest stopForkingRequest
    ) throws ApiException {
        return stopCallForkWithHttpInfo(
            callControlId,
            stopForkingRequest
        ).getData();
    }

    /**
   * Forking stop
   * Stop forking a call.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/stop-call-fork#callbacks) below):**  - &#x60;call.fork.stopped&#x60; 
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
    public ApiResponse<CallControlCommandResponse> stopCallForkWithHttpInfo(
        String callControlId,
        StopForkingRequest stopForkingRequest
    ) throws ApiException {
        Object localVarPostBody = stopForkingRequest;

        // verify the required parameter 'callControlId' is set
        if (callControlId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callControlId' when calling stopCallFork"
            );
        }

        // verify the required parameter 'stopForkingRequest' is set
        if (stopForkingRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'stopForkingRequest' when calling stopCallFork"
            );
        }

        // create path and map variables
        String localVarPath =
            "/calls/{call_control_id}/actions/fork_stop".replaceAll(
                    "\\{" + "call_control_id" + "\\}",
                    apiClient.escapeString(callControlId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CallControlCommandResponse> localVarReturnType =
            new GenericType<CallControlCommandResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.stopCallFork",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * Gather stop
   * Stop current gather.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/stop-call-gather#callbacks) below):**  - &#x60;call.gather.ended&#x60; 
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
    public CallControlCommandResponse stopCallGather(
        String callControlId,
        StopGatherRequest stopGatherRequest
    ) throws ApiException {
        return stopCallGatherWithHttpInfo(
            callControlId,
            stopGatherRequest
        ).getData();
    }

    /**
   * Gather stop
   * Stop current gather.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/stop-call-gather#callbacks) below):**  - &#x60;call.gather.ended&#x60; 
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
    public ApiResponse<CallControlCommandResponse> stopCallGatherWithHttpInfo(
        String callControlId,
        StopGatherRequest stopGatherRequest
    ) throws ApiException {
        Object localVarPostBody = stopGatherRequest;

        // verify the required parameter 'callControlId' is set
        if (callControlId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callControlId' when calling stopCallGather"
            );
        }

        // verify the required parameter 'stopGatherRequest' is set
        if (stopGatherRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'stopGatherRequest' when calling stopCallGather"
            );
        }

        // create path and map variables
        String localVarPath =
            "/calls/{call_control_id}/actions/gather_stop".replaceAll(
                    "\\{" + "call_control_id" + "\\}",
                    apiClient.escapeString(callControlId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CallControlCommandResponse> localVarReturnType =
            new GenericType<CallControlCommandResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.stopCallGather",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * Stop audio playback
   * Stop audio being played on the call.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/stop-call-playback#callbacks) below):**  - &#x60;call.playback.ended&#x60; or &#x60;call.speak.ended&#x60; 
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
    public CallControlCommandResponse stopCallPlayback(
        String callControlId,
        PlaybackStopRequest playbackStopRequest
    ) throws ApiException {
        return stopCallPlaybackWithHttpInfo(
            callControlId,
            playbackStopRequest
        ).getData();
    }

    /**
   * Stop audio playback
   * Stop audio being played on the call.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/stop-call-playback#callbacks) below):**  - &#x60;call.playback.ended&#x60; or &#x60;call.speak.ended&#x60; 
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
    public ApiResponse<CallControlCommandResponse> stopCallPlaybackWithHttpInfo(
        String callControlId,
        PlaybackStopRequest playbackStopRequest
    ) throws ApiException {
        Object localVarPostBody = playbackStopRequest;

        // verify the required parameter 'callControlId' is set
        if (callControlId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callControlId' when calling stopCallPlayback"
            );
        }

        // verify the required parameter 'playbackStopRequest' is set
        if (playbackStopRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'playbackStopRequest' when calling stopCallPlayback"
            );
        }

        // create path and map variables
        String localVarPath =
            "/calls/{call_control_id}/actions/playback_stop".replaceAll(
                    "\\{" + "call_control_id" + "\\}",
                    apiClient.escapeString(callControlId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CallControlCommandResponse> localVarReturnType =
            new GenericType<CallControlCommandResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.stopCallPlayback",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * Recording stop
   * Stop recording the call.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/stop-call-recording#callbacks) below):**  - &#x60;call.recording.saved&#x60; 
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
    public CallControlCommandResponse stopCallRecording(
        String callControlId,
        StopRecordingRequest stopRecordingRequest
    ) throws ApiException {
        return stopCallRecordingWithHttpInfo(
            callControlId,
            stopRecordingRequest
        ).getData();
    }

    /**
   * Recording stop
   * Stop recording the call.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/stop-call-recording#callbacks) below):**  - &#x60;call.recording.saved&#x60; 
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
    public ApiResponse<
        CallControlCommandResponse
    > stopCallRecordingWithHttpInfo(
        String callControlId,
        StopRecordingRequest stopRecordingRequest
    ) throws ApiException {
        Object localVarPostBody = stopRecordingRequest;

        // verify the required parameter 'callControlId' is set
        if (callControlId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callControlId' when calling stopCallRecording"
            );
        }

        // verify the required parameter 'stopRecordingRequest' is set
        if (stopRecordingRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'stopRecordingRequest' when calling stopCallRecording"
            );
        }

        // create path and map variables
        String localVarPath =
            "/calls/{call_control_id}/actions/record_stop".replaceAll(
                    "\\{" + "call_control_id" + "\\}",
                    apiClient.escapeString(callControlId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CallControlCommandResponse> localVarReturnType =
            new GenericType<CallControlCommandResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.stopCallRecording",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * Streaming stop
   * Stop streaming a call to a WebSocket.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/stop-call-streaming#callbacks) below):**  - &#x60;streaming.stopped&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param stopStreamingRequest Stop streaming media request (required)
   * @return CallControlCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public CallControlCommandResponse stopCallStreaming(
        String callControlId,
        StopStreamingRequest stopStreamingRequest
    ) throws ApiException {
        return stopCallStreamingWithHttpInfo(
            callControlId,
            stopStreamingRequest
        ).getData();
    }

    /**
   * Streaming stop
   * Stop streaming a call to a WebSocket.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/stop-call-streaming#callbacks) below):**  - &#x60;streaming.stopped&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param stopStreamingRequest Stop streaming media request (required)
   * @return ApiResponse&lt;CallControlCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        CallControlCommandResponse
    > stopCallStreamingWithHttpInfo(
        String callControlId,
        StopStreamingRequest stopStreamingRequest
    ) throws ApiException {
        Object localVarPostBody = stopStreamingRequest;

        // verify the required parameter 'callControlId' is set
        if (callControlId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callControlId' when calling stopCallStreaming"
            );
        }

        // verify the required parameter 'stopStreamingRequest' is set
        if (stopStreamingRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'stopStreamingRequest' when calling stopCallStreaming"
            );
        }

        // create path and map variables
        String localVarPath =
            "/calls/{call_control_id}/actions/streaming_stop".replaceAll(
                    "\\{" + "call_control_id" + "\\}",
                    apiClient.escapeString(callControlId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CallControlCommandResponse> localVarReturnType =
            new GenericType<CallControlCommandResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.stopCallStreaming",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * Transcription stop
   * Stop real-time transcription.
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param transcriptionStopRequest Transcription stop request (required)
   * @return CallControlCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public CallControlCommandResponse stopCallTranscription(
        String callControlId,
        TranscriptionStopRequest transcriptionStopRequest
    ) throws ApiException {
        return stopCallTranscriptionWithHttpInfo(
            callControlId,
            transcriptionStopRequest
        ).getData();
    }

    /**
   * Transcription stop
   * Stop real-time transcription.
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param transcriptionStopRequest Transcription stop request (required)
   * @return ApiResponse&lt;CallControlCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        CallControlCommandResponse
    > stopCallTranscriptionWithHttpInfo(
        String callControlId,
        TranscriptionStopRequest transcriptionStopRequest
    ) throws ApiException {
        Object localVarPostBody = transcriptionStopRequest;

        // verify the required parameter 'callControlId' is set
        if (callControlId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callControlId' when calling stopCallTranscription"
            );
        }

        // verify the required parameter 'transcriptionStopRequest' is set
        if (transcriptionStopRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'transcriptionStopRequest' when calling stopCallTranscription"
            );
        }

        // create path and map variables
        String localVarPath =
            "/calls/{call_control_id}/actions/transcription_stop".replaceAll(
                    "\\{" + "call_control_id" + "\\}",
                    apiClient.escapeString(callControlId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CallControlCommandResponse> localVarReturnType =
            new GenericType<CallControlCommandResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.stopCallTranscription",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * SIPREC stop
   * Stop SIPREC session.  **Expected Webhooks:**  - &#x60;siprec.stopped&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param stopSiprecRequest Stop siprec session (required)
   * @return CallControlCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public CallControlCommandResponse stopSiprecSession(
        String callControlId,
        StopSiprecRequest stopSiprecRequest
    ) throws ApiException {
        return stopSiprecSessionWithHttpInfo(
            callControlId,
            stopSiprecRequest
        ).getData();
    }

    /**
   * SIPREC stop
   * Stop SIPREC session.  **Expected Webhooks:**  - &#x60;siprec.stopped&#x60; 
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param stopSiprecRequest Stop siprec session (required)
   * @return ApiResponse&lt;CallControlCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        CallControlCommandResponse
    > stopSiprecSessionWithHttpInfo(
        String callControlId,
        StopSiprecRequest stopSiprecRequest
    ) throws ApiException {
        Object localVarPostBody = stopSiprecRequest;

        // verify the required parameter 'callControlId' is set
        if (callControlId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callControlId' when calling stopSiprecSession"
            );
        }

        // verify the required parameter 'stopSiprecRequest' is set
        if (stopSiprecRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'stopSiprecRequest' when calling stopSiprecSession"
            );
        }

        // create path and map variables
        String localVarPath =
            "/calls/{call_control_id}/actions/siprec_stop".replaceAll(
                    "\\{" + "call_control_id" + "\\}",
                    apiClient.escapeString(callControlId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CallControlCommandResponse> localVarReturnType =
            new GenericType<CallControlCommandResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.stopSiprecSession",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * Transfer call
   * Transfer a call to a new destination. If the transfer is unsuccessful, a &#x60;call.hangup&#x60; webhook for the other call (Leg B) will be sent indicating that the transfer could not be completed. The original call will remain active and may be issued additional commands, potentially transfering the call to an alternate destination.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/transfer-call#callbacks) below):**  - &#x60;call.initiated&#x60; - &#x60;call.bridged&#x60; to Leg B - &#x60;call.answered&#x60; or &#x60;call.hangup&#x60; - &#x60;call.machine.detection.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested - &#x60;call.machine.greeting.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested to detect the end of machine greeting - &#x60;call.machine.premium.detection.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested - &#x60;call.machine.premium.greeting.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested and a beep was detected 
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
    public CallControlCommandResponse transferCall(
        String callControlId,
        TransferCallRequest transferCallRequest
    ) throws ApiException {
        return transferCallWithHttpInfo(
            callControlId,
            transferCallRequest
        ).getData();
    }

    /**
   * Transfer call
   * Transfer a call to a new destination. If the transfer is unsuccessful, a &#x60;call.hangup&#x60; webhook for the other call (Leg B) will be sent indicating that the transfer could not be completed. The original call will remain active and may be issued additional commands, potentially transfering the call to an alternate destination.  **Expected Webhooks (see [callback schema](https://developers.telnyx.com/api/call-control/transfer-call#callbacks) below):**  - &#x60;call.initiated&#x60; - &#x60;call.bridged&#x60; to Leg B - &#x60;call.answered&#x60; or &#x60;call.hangup&#x60; - &#x60;call.machine.detection.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested - &#x60;call.machine.greeting.ended&#x60; if &#x60;answering_machine_detection&#x60; was requested to detect the end of machine greeting - &#x60;call.machine.premium.detection.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested - &#x60;call.machine.premium.greeting.ended&#x60; if &#x60;answering_machine_detection&#x3D;premium&#x60; was requested and a beep was detected 
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
    public ApiResponse<CallControlCommandResponse> transferCallWithHttpInfo(
        String callControlId,
        TransferCallRequest transferCallRequest
    ) throws ApiException {
        Object localVarPostBody = transferCallRequest;

        // verify the required parameter 'callControlId' is set
        if (callControlId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callControlId' when calling transferCall"
            );
        }

        // verify the required parameter 'transferCallRequest' is set
        if (transferCallRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'transferCallRequest' when calling transferCall"
            );
        }

        // create path and map variables
        String localVarPath =
            "/calls/{call_control_id}/actions/transfer".replaceAll(
                    "\\{" + "call_control_id" + "\\}",
                    apiClient.escapeString(callControlId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CallControlCommandResponse> localVarReturnType =
            new GenericType<CallControlCommandResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.transferCall",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * Update client state
   * Updates client state
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param clientStateUpdateRequest Updates client state for every subsequent webhook (required)
   * @return CallControlCommandResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public CallControlCommandResponse updateClientState(
        String callControlId,
        ClientStateUpdateRequest clientStateUpdateRequest
    ) throws ApiException {
        return updateClientStateWithHttpInfo(
            callControlId,
            clientStateUpdateRequest
        ).getData();
    }

    /**
   * Update client state
   * Updates client state
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @param clientStateUpdateRequest Updates client state for every subsequent webhook (required)
   * @return ApiResponse&lt;CallControlCommandResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a call control command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        CallControlCommandResponse
    > updateClientStateWithHttpInfo(
        String callControlId,
        ClientStateUpdateRequest clientStateUpdateRequest
    ) throws ApiException {
        Object localVarPostBody = clientStateUpdateRequest;

        // verify the required parameter 'callControlId' is set
        if (callControlId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'callControlId' when calling updateClientState"
            );
        }

        // verify the required parameter 'clientStateUpdateRequest' is set
        if (clientStateUpdateRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'clientStateUpdateRequest' when calling updateClientState"
            );
        }

        // create path and map variables
        String localVarPath =
            "/calls/{call_control_id}/actions/client_state_update".replaceAll(
                    "\\{" + "call_control_id" + "\\}",
                    apiClient.escapeString(callControlId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CallControlCommandResponse> localVarReturnType =
            new GenericType<CallControlCommandResponse>() {};

        return apiClient.invokeAPI(
            "CallCommandsApi.updateClientState",
            localVarPath,
            "PUT",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }
}
