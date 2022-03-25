package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreatePortabilityCheckRequest;
import com.telnyx.sdk.model.PortabilityCheckResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PhoneNumberPortingApi {
  private ApiClient apiClient;

  public PhoneNumberPortingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PhoneNumberPortingApi(ApiClient apiClient) {
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
   * Run a portability check
   * Runs a portability check, returning the results immediately.
   * @param createPortabilityCheckRequest  (required)
   * @return PortabilityCheckResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> PortabilityCheck Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public PortabilityCheckResponse postPortabilityCheck(CreatePortabilityCheckRequest createPortabilityCheckRequest) throws ApiException {
    return postPortabilityCheckWithHttpInfo(createPortabilityCheckRequest).getData();
  }

  /**
   * Run a portability check
   * Runs a portability check, returning the results immediately.
   * @param createPortabilityCheckRequest  (required)
   * @return ApiResponse&lt;PortabilityCheckResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> PortabilityCheck Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PortabilityCheckResponse> postPortabilityCheckWithHttpInfo(CreatePortabilityCheckRequest createPortabilityCheckRequest) throws ApiException {
    Object localVarPostBody = createPortabilityCheckRequest;
    
    // verify the required parameter 'createPortabilityCheckRequest' is set
    if (createPortabilityCheckRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createPortabilityCheckRequest' when calling postPortabilityCheck");
    }
    
    // create path and map variables
    String localVarPath = "/portability_checks";

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

    GenericType<PortabilityCheckResponse> localVarReturnType = new GenericType<PortabilityCheckResponse>() {};

    return apiClient.invokeAPI("PhoneNumberPortingApi.postPortabilityCheck", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
