package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.PostPortabilityCheck201Response;
import com.telnyx.sdk.model.PostPortabilityCheckRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
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
   * @param postPortabilityCheckRequest  (required)
   * @return PostPortabilityCheck201Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> PortabilityCheck Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public PostPortabilityCheck201Response postPortabilityCheck(PostPortabilityCheckRequest postPortabilityCheckRequest) throws ApiException {
    return postPortabilityCheckWithHttpInfo(postPortabilityCheckRequest).getData();
  }

  /**
   * Run a portability check
   * Runs a portability check, returning the results immediately.
   * @param postPortabilityCheckRequest  (required)
   * @return ApiResponse&lt;PostPortabilityCheck201Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> PortabilityCheck Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PostPortabilityCheck201Response> postPortabilityCheckWithHttpInfo(PostPortabilityCheckRequest postPortabilityCheckRequest) throws ApiException {
    Object localVarPostBody = postPortabilityCheckRequest;
    
    // verify the required parameter 'postPortabilityCheckRequest' is set
    if (postPortabilityCheckRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'postPortabilityCheckRequest' when calling postPortabilityCheck");
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

    GenericType<PostPortabilityCheck201Response> localVarReturnType = new GenericType<PostPortabilityCheck201Response>() {};

    return apiClient.invokeAPI("PhoneNumberPortingApi.postPortabilityCheck", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
