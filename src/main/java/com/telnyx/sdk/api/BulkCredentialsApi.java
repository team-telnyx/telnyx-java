package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.BulkCredentialRequest;
import com.telnyx.sdk.model.BulkCredentialResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class BulkCredentialsApi {
  private ApiClient apiClient;

  public BulkCredentialsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BulkCredentialsApi(ApiClient apiClient) {
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
   * Perform activate or deactivate action on all credentials filtered by the provided tag.
   * Perform activate or deactivate action on all credentials filtered by the provided tag. Activate action will change the status to active, making it possible to connect calls with the credential. Deactivate action will change the status to inactive, making it impossible to connect calls with the credential.
   * @param action Identifies the action to be taken. Activate will change the status to active. Deactivate will change the status to inactive. (required)
   * @param filterTag Filter by tag, required by bulk operations. (required)
   * @return BulkCredentialResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response for Bulk credential requests </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public BulkCredentialResponse bulkCredentialAction(String action, String filterTag) throws ApiException {
    return bulkCredentialActionWithHttpInfo(action, filterTag).getData();
  }

  /**
   * Perform activate or deactivate action on all credentials filtered by the provided tag.
   * Perform activate or deactivate action on all credentials filtered by the provided tag. Activate action will change the status to active, making it possible to connect calls with the credential. Deactivate action will change the status to inactive, making it impossible to connect calls with the credential.
   * @param action Identifies the action to be taken. Activate will change the status to active. Deactivate will change the status to inactive. (required)
   * @param filterTag Filter by tag, required by bulk operations. (required)
   * @return ApiResponse&lt;BulkCredentialResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response for Bulk credential requests </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BulkCredentialResponse> bulkCredentialActionWithHttpInfo(String action, String filterTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'action' is set
    if (action == null) {
      throw new ApiException(400, "Missing the required parameter 'action' when calling bulkCredentialAction");
    }
    
    // verify the required parameter 'filterTag' is set
    if (filterTag == null) {
      throw new ApiException(400, "Missing the required parameter 'filterTag' when calling bulkCredentialAction");
    }
    
    // create path and map variables
    String localVarPath = "/actions/{action}/telephony_credentials"
      .replaceAll("\\{" + "action" + "\\}", apiClient.escapeString(action.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tag]", filterTag));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<BulkCredentialResponse> localVarReturnType = new GenericType<BulkCredentialResponse>() {};

    return apiClient.invokeAPI("BulkCredentialsApi.bulkCredentialAction", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Creates several credentials
   * Creates several credentials in bulk.
   * @param bulkCredentialRequest Requested parameters to create credentials on bulk (required)
   * @return BulkCredentialResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response for Bulk credential requests </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public BulkCredentialResponse createBulkTelephonyCredentials(BulkCredentialRequest bulkCredentialRequest) throws ApiException {
    return createBulkTelephonyCredentialsWithHttpInfo(bulkCredentialRequest).getData();
  }

  /**
   * Creates several credentials
   * Creates several credentials in bulk.
   * @param bulkCredentialRequest Requested parameters to create credentials on bulk (required)
   * @return ApiResponse&lt;BulkCredentialResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response for Bulk credential requests </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BulkCredentialResponse> createBulkTelephonyCredentialsWithHttpInfo(BulkCredentialRequest bulkCredentialRequest) throws ApiException {
    Object localVarPostBody = bulkCredentialRequest;
    
    // verify the required parameter 'bulkCredentialRequest' is set
    if (bulkCredentialRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'bulkCredentialRequest' when calling createBulkTelephonyCredentials");
    }
    
    // create path and map variables
    String localVarPath = "/actions/bulk/telephony_credentials";

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

    GenericType<BulkCredentialResponse> localVarReturnType = new GenericType<BulkCredentialResponse>() {};

    return apiClient.invokeAPI("BulkCredentialsApi.createBulkTelephonyCredentials", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete several credentials
   * Delete several credentials in bulk.
   * @param filterTag Filter by tag, required by bulk operations. (required)
   * @return BulkCredentialResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response for Bulk credential requests </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public BulkCredentialResponse deleteTelephonyCredentials(String filterTag) throws ApiException {
    return deleteTelephonyCredentialsWithHttpInfo(filterTag).getData();
  }

  /**
   * Delete several credentials
   * Delete several credentials in bulk.
   * @param filterTag Filter by tag, required by bulk operations. (required)
   * @return ApiResponse&lt;BulkCredentialResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response for Bulk credential requests </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BulkCredentialResponse> deleteTelephonyCredentialsWithHttpInfo(String filterTag) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'filterTag' is set
    if (filterTag == null) {
      throw new ApiException(400, "Missing the required parameter 'filterTag' when calling deleteTelephonyCredentials");
    }
    
    // create path and map variables
    String localVarPath = "/actions/bulk/telephony_credentials";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tag]", filterTag));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<BulkCredentialResponse> localVarReturnType = new GenericType<BulkCredentialResponse>() {};

    return apiClient.invokeAPI("BulkCredentialsApi.deleteTelephonyCredentials", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update several credentials
   * Update several credentials in bulk.
   * @param filterTag Filter by tag, required by bulk operations. (required)
   * @param bulkCredentialRequest Parameters to update credentials on bulk (required)
   * @return BulkCredentialResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response for Bulk credential requests </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public BulkCredentialResponse updateBulkTelephonyCredential(String filterTag, BulkCredentialRequest bulkCredentialRequest) throws ApiException {
    return updateBulkTelephonyCredentialWithHttpInfo(filterTag, bulkCredentialRequest).getData();
  }

  /**
   * Update several credentials
   * Update several credentials in bulk.
   * @param filterTag Filter by tag, required by bulk operations. (required)
   * @param bulkCredentialRequest Parameters to update credentials on bulk (required)
   * @return ApiResponse&lt;BulkCredentialResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response for Bulk credential requests </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BulkCredentialResponse> updateBulkTelephonyCredentialWithHttpInfo(String filterTag, BulkCredentialRequest bulkCredentialRequest) throws ApiException {
    Object localVarPostBody = bulkCredentialRequest;
    
    // verify the required parameter 'filterTag' is set
    if (filterTag == null) {
      throw new ApiException(400, "Missing the required parameter 'filterTag' when calling updateBulkTelephonyCredential");
    }
    
    // verify the required parameter 'bulkCredentialRequest' is set
    if (bulkCredentialRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'bulkCredentialRequest' when calling updateBulkTelephonyCredential");
    }
    
    // create path and map variables
    String localVarPath = "/actions/bulk/telephony_credentials";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tag]", filterTag));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<BulkCredentialResponse> localVarReturnType = new GenericType<BulkCredentialResponse>() {};

    return apiClient.invokeAPI("BulkCredentialsApi.updateBulkTelephonyCredential", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
