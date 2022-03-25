package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Errors;
import java.time.LocalDate;
import com.telnyx.sdk.model.OneOfCreateIosPushCredentialRequestCreateAndroidPushCredentialRequest;
import com.telnyx.sdk.model.PushCredentialResponse;
import com.telnyx.sdk.model.UNKNOWN_BASE_TYPE;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
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
   * Deletes a push credential
   * Deletes a push credential based on the given &#x60;id&#x60;
   * @param pushCredentialId The unique identifier of a push credential (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The push credential was deleted successfully </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unable to process request </td><td>  -  </td></tr>
     </table>
   */
  public void deletePushCredentialnById(UUID pushCredentialId) throws ApiException {
    deletePushCredentialnByIdWithHttpInfo(pushCredentialId);
  }

  /**
   * Deletes a push credential
   * Deletes a push credential based on the given &#x60;id&#x60;
   * @param pushCredentialId The unique identifier of a push credential (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The push credential was deleted successfully </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unable to process request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deletePushCredentialnByIdWithHttpInfo(UUID pushCredentialId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'pushCredentialId' is set
    if (pushCredentialId == null) {
      throw new ApiException(400, "Missing the required parameter 'pushCredentialId' when calling deletePushCredentialnById");
    }
    
    // create path and map variables
    String localVarPath = "/push_credentials/{push_credential_id}"
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

    return apiClient.invokeAPI("PushCredentialsApi.deletePushCredentialnById", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Retrieves a push credential
   * Retrieves push credential based on the given &#x60;id&#x60;
   * @param pushCredentialId The unique identifier of a push credential (required)
   * @return PushCredentialResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful get push credential response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unable to process request </td><td>  -  </td></tr>
     </table>
   */
  public PushCredentialResponse getPushCredentialById(UUID pushCredentialId) throws ApiException {
    return getPushCredentialByIdWithHttpInfo(pushCredentialId).getData();
  }

  /**
   * Retrieves a push credential
   * Retrieves push credential based on the given &#x60;id&#x60;
   * @param pushCredentialId The unique identifier of a push credential (required)
   * @return ApiResponse&lt;PushCredentialResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful get push credential response </td><td>  -  </td></tr>
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
    String localVarPath = "/push_credentials/{push_credential_id}"
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
   * Retrieves push credentials associated to a mobile application
   * Retrieves push credentials for a given mobile application based on filters for a user
   * @param mobileApplicationId The unique identifier of a mobile application (required)
   * @param filterCreatedAtEq ISO 8601 date for filtering credentials created on that date (optional)
   * @param filterCreatedAtGte ISO 8601 date for filtering credentials created after that date (optional)
   * @param filterCreatedAtLte ISO 8601 date for filtering credentials created before that date (optional)
   * @param filterAlias Unique push credential alias (optional)
   * @return List&lt;PushCredentialResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Mobile application created </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized request </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unable to process request </td><td>  -  </td></tr>
     </table>
   */
  public List<PushCredentialResponse> getPushCredentials(UUID mobileApplicationId, LocalDate filterCreatedAtEq, LocalDate filterCreatedAtGte, LocalDate filterCreatedAtLte, String filterAlias) throws ApiException {
    return getPushCredentialsWithHttpInfo(mobileApplicationId, filterCreatedAtEq, filterCreatedAtGte, filterCreatedAtLte, filterAlias).getData();
  }

  /**
   * Retrieves push credentials associated to a mobile application
   * Retrieves push credentials for a given mobile application based on filters for a user
   * @param mobileApplicationId The unique identifier of a mobile application (required)
   * @param filterCreatedAtEq ISO 8601 date for filtering credentials created on that date (optional)
   * @param filterCreatedAtGte ISO 8601 date for filtering credentials created after that date (optional)
   * @param filterCreatedAtLte ISO 8601 date for filtering credentials created before that date (optional)
   * @param filterAlias Unique push credential alias (optional)
   * @return ApiResponse&lt;List&lt;PushCredentialResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Mobile application created </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized request </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unable to process request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<PushCredentialResponse>> getPushCredentialsWithHttpInfo(UUID mobileApplicationId, LocalDate filterCreatedAtEq, LocalDate filterCreatedAtGte, LocalDate filterCreatedAtLte, String filterAlias) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'mobileApplicationId' is set
    if (mobileApplicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'mobileApplicationId' when calling getPushCredentials");
    }
    
    // create path and map variables
    String localVarPath = "/mobile_applications/{mobile_application_id}/push_credentials"
      .replaceAll("\\{" + "mobile_application_id" + "\\}", apiClient.escapeString(mobileApplicationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[created_at][eq]", filterCreatedAtEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[created_at][gte]", filterCreatedAtGte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[created_at][lte]", filterCreatedAtLte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[alias]", filterAlias));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<List<PushCredentialResponse>> localVarReturnType = new GenericType<List<PushCredentialResponse>>() {};

    return apiClient.invokeAPI("PushCredentialsApi.getPushCredentials", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Updates a push credential
   * Updates a push credential based on the given &#x60;id&#x60;
   * @param pushCredentialId The unique identifier of a push credential (required)
   * @param UNKNOWN_BASE_TYPE Push credential parameters that need to be sent in the request (optional)
   * @return PushCredentialResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The push credential was updated successfully </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unable to process request </td><td>  -  </td></tr>
     </table>
   */
  public PushCredentialResponse updatePushCredentialById(UUID pushCredentialId, UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE) throws ApiException {
    return updatePushCredentialByIdWithHttpInfo(pushCredentialId, UNKNOWN_BASE_TYPE).getData();
  }

  /**
   * Updates a push credential
   * Updates a push credential based on the given &#x60;id&#x60;
   * @param pushCredentialId The unique identifier of a push credential (required)
   * @param UNKNOWN_BASE_TYPE Push credential parameters that need to be sent in the request (optional)
   * @return ApiResponse&lt;PushCredentialResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The push credential was updated successfully </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unable to process request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PushCredentialResponse> updatePushCredentialByIdWithHttpInfo(UUID pushCredentialId, UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE) throws ApiException {
    Object localVarPostBody = UNKNOWN_BASE_TYPE;
    
    // verify the required parameter 'pushCredentialId' is set
    if (pushCredentialId == null) {
      throw new ApiException(400, "Missing the required parameter 'pushCredentialId' when calling updatePushCredentialById");
    }
    
    // create path and map variables
    String localVarPath = "/push_credentials/{push_credential_id}"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<PushCredentialResponse> localVarReturnType = new GenericType<PushCredentialResponse>() {};

    return apiClient.invokeAPI("PushCredentialsApi.updatePushCredentialById", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, true);
  }
}
