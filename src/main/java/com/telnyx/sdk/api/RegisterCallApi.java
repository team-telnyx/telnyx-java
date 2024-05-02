package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.RegisterCallRequest;
import com.telnyx.sdk.model.RegisterCallResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class RegisterCallApi {
  private ApiClient apiClient;

  public RegisterCallApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RegisterCallApi(ApiClient apiClient) {
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
   * Register the call for Google Verified Calls
   * Register the call before dialing to show your brand on callee&#39;s phone.
   * @param registerCallRequest Register call request (required)
   * @return RegisterCallResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a register call command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public RegisterCallResponse registerCall(RegisterCallRequest registerCallRequest) throws ApiException {
    return registerCallWithHttpInfo(registerCallRequest).getData();
  }

  /**
   * Register the call for Google Verified Calls
   * Register the call before dialing to show your brand on callee&#39;s phone.
   * @param registerCallRequest Register call request (required)
   * @return ApiResponse&lt;RegisterCallResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response upon making a register call command. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RegisterCallResponse> registerCallWithHttpInfo(RegisterCallRequest registerCallRequest) throws ApiException {
    Object localVarPostBody = registerCallRequest;
    
    // verify the required parameter 'registerCallRequest' is set
    if (registerCallRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'registerCallRequest' when calling registerCall");
    }
    
    // create path and map variables
    String localVarPath = "/calls/register";

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

    GenericType<RegisterCallResponse> localVarReturnType = new GenericType<RegisterCallResponse>() {};

    return apiClient.invokeAPI("RegisterCallApi.registerCall", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
