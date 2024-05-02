package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.PostNumbersFeatures200Response;
import com.telnyx.sdk.model.PostNumbersFeaturesRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class NumbersFeaturesApi {
  private ApiClient apiClient;

  public NumbersFeaturesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NumbersFeaturesApi(ApiClient apiClient) {
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
   * Retrieve the features for a list of numbers
   * Retrieve the features for a list of numbers
   * @param postNumbersFeaturesRequest  (required)
   * @return PostNumbersFeatures200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public PostNumbersFeatures200Response postNumbersFeatures(PostNumbersFeaturesRequest postNumbersFeaturesRequest) throws ApiException {
    return postNumbersFeaturesWithHttpInfo(postNumbersFeaturesRequest).getData();
  }

  /**
   * Retrieve the features for a list of numbers
   * Retrieve the features for a list of numbers
   * @param postNumbersFeaturesRequest  (required)
   * @return ApiResponse&lt;PostNumbersFeatures200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PostNumbersFeatures200Response> postNumbersFeaturesWithHttpInfo(PostNumbersFeaturesRequest postNumbersFeaturesRequest) throws ApiException {
    Object localVarPostBody = postNumbersFeaturesRequest;
    
    // verify the required parameter 'postNumbersFeaturesRequest' is set
    if (postNumbersFeaturesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'postNumbersFeaturesRequest' when calling postNumbersFeatures");
    }
    
    // create path and map variables
    String localVarPath = "/numbers_features";

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

    GenericType<PostNumbersFeatures200Response> localVarReturnType = new GenericType<PostNumbersFeatures200Response>() {};

    return apiClient.invokeAPI("NumbersFeaturesApi.postNumbersFeatures", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
