package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.RetrieveCallStatusResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CallInformationApi {
  private ApiClient apiClient;

  public CallInformationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CallInformationApi(ApiClient apiClient) {
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
   * Retrieve a call status
   * Returns the status of a call (data is available 10 minutes after call ended).
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @return RetrieveCallStatusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a call status. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveCallStatusResponse retrieveCallStatus(String callControlId) throws ApiException {
    return retrieveCallStatusWithHttpInfo(callControlId).getData();
  }

  /**
   * Retrieve a call status
   * Returns the status of a call (data is available 10 minutes after call ended).
   * @param callControlId Unique identifier and token for controlling the call (required)
   * @return ApiResponse&lt;RetrieveCallStatusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a call status. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveCallStatusResponse> retrieveCallStatusWithHttpInfo(String callControlId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'callControlId' is set
    if (callControlId == null) {
      throw new ApiException(400, "Missing the required parameter 'callControlId' when calling retrieveCallStatus");
    }
    
    // create path and map variables
    String localVarPath = "/calls/{call_control_id}"
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<RetrieveCallStatusResponse> localVarReturnType = new GenericType<RetrieveCallStatusResponse>() {};

    return apiClient.invokeAPI("CallInformationApi.retrieveCallStatus", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
