package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreatePushCredentialRequest;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.PushCredentialResponse;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class PushCredentialsApi {
  private ApiClient apiClient;

  public PushCredentialsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PushCredentialsApi(ApiClient apiClient) {
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
   * Creates a new mobile push credential
   * Creates a new mobile push credential
   * @param createPushCredentialRequest Mobile push credential parameters that need to be sent in the request (required)
   * @return PushCredentialResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Mobile push credential created </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized request </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unable to process request </td><td>  -  </td></tr>
     </table>
   */
  public PushCredentialResponse createPushCredential(CreatePushCredentialRequest createPushCredentialRequest) throws ApiException {
    return createPushCredentialWithHttpInfo(createPushCredentialRequest).getData();
  }

  /**
   * Creates a new mobile push credential
   * Creates a new mobile push credential
   * @param createPushCredentialRequest Mobile push credential parameters that need to be sent in the request (required)
   * @return ApiResponse&lt;PushCredentialResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Mobile push credential created </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized request </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unable to process request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PushCredentialResponse> createPushCredentialWithHttpInfo(CreatePushCredentialRequest createPushCredentialRequest) throws ApiException {
    Object localVarPostBody = createPushCredentialRequest;
    
    // verify the required parameter 'createPushCredentialRequest' is set
    if (createPushCredentialRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createPushCredentialRequest' when calling createPushCredential");
    }
    
    // create path and map variables
    String localVarPath = "/mobile_push_credentials";

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

    GenericType<PushCredentialResponse> localVarReturnType = new GenericType<PushCredentialResponse>() {};

    return apiClient.invokeAPI("PushCredentialsApi.createPushCredential", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Deletes a mobile push credential
   * Deletes a mobile push credential based on the given &#x60;push_credential_id&#x60;
   * @param pushCredentialId The unique identifier of a mobile push credential (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The mobile push credential was deleted successfully </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unable to process request </td><td>  -  </td></tr>
     </table>
   */
  public void deletePushCredentialById(UUID pushCredentialId) throws ApiException {
    deletePushCredentialByIdWithHttpInfo(pushCredentialId);
  }

  /**
   * Deletes a mobile push credential
   * Deletes a mobile push credential based on the given &#x60;push_credential_id&#x60;
   * @param pushCredentialId The unique identifier of a mobile push credential (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The mobile push credential was deleted successfully </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unable to process request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deletePushCredentialByIdWithHttpInfo(UUID pushCredentialId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'pushCredentialId' is set
    if (pushCredentialId == null) {
      throw new ApiException(400, "Missing the required parameter 'pushCredentialId' when calling deletePushCredentialById");
    }
    
    // create path and map variables
    String localVarPath = "/mobile_push_credentials/{push_credential_id}"
      .replaceAll("\\{" + "push_credential_id" + "\\}", apiClient.escapeString(pushCredentialId.toString()));

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

    return apiClient.invokeAPI("PushCredentialsApi.deletePushCredentialById", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Retrieves a mobile push credential
   * Retrieves mobile push credential based on the given &#x60;push_credential_id&#x60;
   * @param pushCredentialId The unique identifier of a mobile push credential (required)
   * @return PushCredentialResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful get mobile push credential response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unable to process request </td><td>  -  </td></tr>
     </table>
   */
  public PushCredentialResponse getPushCredentialById(UUID pushCredentialId) throws ApiException {
    return getPushCredentialByIdWithHttpInfo(pushCredentialId).getData();
  }

  /**
   * Retrieves a mobile push credential
   * Retrieves mobile push credential based on the given &#x60;push_credential_id&#x60;
   * @param pushCredentialId The unique identifier of a mobile push credential (required)
   * @return ApiResponse&lt;PushCredentialResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful get mobile push credential response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unable to process request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PushCredentialResponse> getPushCredentialByIdWithHttpInfo(UUID pushCredentialId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'pushCredentialId' is set
    if (pushCredentialId == null) {
      throw new ApiException(400, "Missing the required parameter 'pushCredentialId' when calling getPushCredentialById");
    }
    
    // create path and map variables
    String localVarPath = "/mobile_push_credentials/{push_credential_id}"
      .replaceAll("\\{" + "push_credential_id" + "\\}", apiClient.escapeString(pushCredentialId.toString()));

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

    GenericType<PushCredentialResponse> localVarReturnType = new GenericType<PushCredentialResponse>() {};

    return apiClient.invokeAPI("PushCredentialsApi.getPushCredentialById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List mobile push credentials
   * List mobile push credentials
   * @param filterType type of mobile push credentials (optional)
   * @param filterAlias Unique mobile push credential alias (optional)
   * @param pageSize The size of the page (optional, default to 20)
   * @param pageNumber The page number to load (optional, default to 1)
   * @return ListPushCredentialsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Mobile mobile push credentials </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized request </td><td>  -  </td></tr>
     </table>
   */

  /**
   * List mobile push credentials
   * List mobile push credentials
   * @param filterType type of mobile push credentials (optional)
   * @param filterAlias Unique mobile push credential alias (optional)
   * @param pageSize The size of the page (optional, default to 20)
   * @param pageNumber The page number to load (optional, default to 1)
   * @return ApiResponse&lt;ListPushCredentialsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Mobile mobile push credentials </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<String> listPushCredentialsWithHttpInfo(String filterType, String filterAlias, Integer pageSize, Integer pageNumber) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/mobile_push_credentials";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[type]", filterType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[alias]", filterAlias));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    return apiClient.invokeAPI("PushCredentialsApi.listPushCredentials", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
}
