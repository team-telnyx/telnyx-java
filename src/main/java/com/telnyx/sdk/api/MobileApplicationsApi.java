package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateMobileApplicationRequest;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.MobileApplicationResponse;
import com.telnyx.sdk.model.PushCredentialResponse;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MobileApplicationsApi {
  private ApiClient apiClient;

  public MobileApplicationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MobileApplicationsApi(ApiClient apiClient) {
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
   * Adds a mobile application
   * Creates a new mobile application which can be android or ios based on the &#x60;type&#x60; parameter
   * @param createMobileApplicationRequest Mobile application parameters that need to be sent in the request (required)
   * @return MobileApplicationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Mobile application created </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized request </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unable to process request </td><td>  -  </td></tr>
     </table>
   */
  public MobileApplicationResponse addMobileApplication(CreateMobileApplicationRequest createMobileApplicationRequest) throws ApiException {
    return addMobileApplicationWithHttpInfo(createMobileApplicationRequest).getData();
  }

  /**
   * Adds a mobile application
   * Creates a new mobile application which can be android or ios based on the &#x60;type&#x60; parameter
   * @param createMobileApplicationRequest Mobile application parameters that need to be sent in the request (required)
   * @return ApiResponse&lt;MobileApplicationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Mobile application created </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized request </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unable to process request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MobileApplicationResponse> addMobileApplicationWithHttpInfo(CreateMobileApplicationRequest createMobileApplicationRequest) throws ApiException {
    Object localVarPostBody = createMobileApplicationRequest;
    
    // verify the required parameter 'createMobileApplicationRequest' is set
    if (createMobileApplicationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createMobileApplicationRequest' when calling addMobileApplication");
    }
    
    // create path and map variables
    String localVarPath = "/mobile_applications";

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

    GenericType<MobileApplicationResponse> localVarReturnType = new GenericType<MobileApplicationResponse>() {};

    return apiClient.invokeAPI("MobileApplicationsApi.addMobileApplication", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Adds push credential to a given mobile application
   * Creates a new credential for a given mobile application
   * @param mobileApplicationId The unique identifier of a mobile application (required)
   * @param UNKNOWN_BASE_TYPE Push credential parameters that need to be sent in the request (required)
   * @return PushCredentialResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Push credential created </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized request </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unable to process request </td><td>  -  </td></tr>
     </table>
   */
  public PushCredentialResponse addPushCredential(UUID mobileApplicationId, String UNKNOWN_BASE_TYPE) throws ApiException {
    return addPushCredentialWithHttpInfo(mobileApplicationId, UNKNOWN_BASE_TYPE).getData();
  }

  /**
   * Adds push credential to a given mobile application
   * Creates a new credential for a given mobile application
   * @param mobileApplicationId The unique identifier of a mobile application (required)
   * @param UNKNOWN_BASE_TYPE Push credential parameters that need to be sent in the request (required)
   * @return ApiResponse&lt;PushCredentialResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Push credential created </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized request </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unable to process request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PushCredentialResponse> addPushCredentialWithHttpInfo(UUID mobileApplicationId, String UNKNOWN_BASE_TYPE) throws ApiException {
    Object localVarPostBody = UNKNOWN_BASE_TYPE;
    
    // verify the required parameter 'mobileApplicationId' is set
    if (mobileApplicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'mobileApplicationId' when calling addPushCredential");
    }
    
    // verify the required parameter 'UNKNOWN_BASE_TYPE' is set
    if (UNKNOWN_BASE_TYPE == null) {
      throw new ApiException(400, "Missing the required parameter 'UNKNOWN_BASE_TYPE' when calling addPushCredential");
    }
    
    // create path and map variables
    String localVarPath = "/mobile_applications/{mobile_application_id}/push_credentials"
      .replaceAll("\\{" + "mobile_application_id" + "\\}", apiClient.escapeString(mobileApplicationId.toString()));

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

    return apiClient.invokeAPI("MobileApplicationsApi.addPushCredential", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, true);
  }
  /**
   * Deletes a mobile application
   * Deletes a mobile application based on the given &#x60;id&#x60;
   * @param mobileApplicationId The unique identifier of a mobile application (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The mobile application was deleted successfully </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unable to process request </td><td>  -  </td></tr>
     </table>
   */
  public void deleteMobileApplicationById(UUID mobileApplicationId) throws ApiException {
    deleteMobileApplicationByIdWithHttpInfo(mobileApplicationId);
  }

  /**
   * Deletes a mobile application
   * Deletes a mobile application based on the given &#x60;id&#x60;
   * @param mobileApplicationId The unique identifier of a mobile application (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The mobile application was deleted successfully </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unable to process request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteMobileApplicationByIdWithHttpInfo(UUID mobileApplicationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'mobileApplicationId' is set
    if (mobileApplicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'mobileApplicationId' when calling deleteMobileApplicationById");
    }
    
    // create path and map variables
    String localVarPath = "/mobile_applications/{mobile_application_id}"
      .replaceAll("\\{" + "mobile_application_id" + "\\}", apiClient.escapeString(mobileApplicationId.toString()));

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

    return apiClient.invokeAPI("MobileApplicationsApi.deleteMobileApplicationById", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Retrieves mobile applications
   * Retrieves all mobile applications for a user
   * @return List&lt;MobileApplicationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Mobile application created </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unable to process request </td><td>  -  </td></tr>
     </table>
   */
  public List<MobileApplicationResponse> getAllMobileApplications() throws ApiException {
    return getAllMobileApplicationsWithHttpInfo().getData();
  }

  /**
   * Retrieves mobile applications
   * Retrieves all mobile applications for a user
   * @return ApiResponse&lt;List&lt;MobileApplicationResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Mobile application created </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unable to process request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<MobileApplicationResponse>> getAllMobileApplicationsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/mobile_applications";

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

    GenericType<List<MobileApplicationResponse>> localVarReturnType = new GenericType<List<MobileApplicationResponse>>() {};

    return apiClient.invokeAPI("MobileApplicationsApi.getAllMobileApplications", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieves a given mobile application
   * Retrieves a mobile application based on the given &#x60;id&#x60;
   * @param mobileApplicationId The unique identifier of a mobile application (required)
   * @return MobileApplicationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful get mobile application response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unable to process request </td><td>  -  </td></tr>
     </table>
   */
  public MobileApplicationResponse getMobileApplicationById(UUID mobileApplicationId) throws ApiException {
    return getMobileApplicationByIdWithHttpInfo(mobileApplicationId).getData();
  }

  /**
   * Retrieves a given mobile application
   * Retrieves a mobile application based on the given &#x60;id&#x60;
   * @param mobileApplicationId The unique identifier of a mobile application (required)
   * @return ApiResponse&lt;MobileApplicationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful get mobile application response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unable to process request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MobileApplicationResponse> getMobileApplicationByIdWithHttpInfo(UUID mobileApplicationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'mobileApplicationId' is set
    if (mobileApplicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'mobileApplicationId' when calling getMobileApplicationById");
    }
    
    // create path and map variables
    String localVarPath = "/mobile_applications/{mobile_application_id}"
      .replaceAll("\\{" + "mobile_application_id" + "\\}", apiClient.escapeString(mobileApplicationId.toString()));

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

    GenericType<MobileApplicationResponse> localVarReturnType = new GenericType<MobileApplicationResponse>() {};

    return apiClient.invokeAPI("MobileApplicationsApi.getMobileApplicationById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Updates a mobile application
   * Updates a mobile application based on the given &#x60;id&#x60;
   * @param mobileApplicationId The unique identifier of a mobile application (required)
   * @param createMobileApplicationRequest Mobile application parameters that need to be sent in the request (required)
   * @return MobileApplicationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The modile application was updated successfully </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unable to process request </td><td>  -  </td></tr>
     </table>
   */
  public MobileApplicationResponse updateMobileApplicationById(UUID mobileApplicationId, CreateMobileApplicationRequest createMobileApplicationRequest) throws ApiException {
    return updateMobileApplicationByIdWithHttpInfo(mobileApplicationId, createMobileApplicationRequest).getData();
  }

  /**
   * Updates a mobile application
   * Updates a mobile application based on the given &#x60;id&#x60;
   * @param mobileApplicationId The unique identifier of a mobile application (required)
   * @param createMobileApplicationRequest Mobile application parameters that need to be sent in the request (required)
   * @return ApiResponse&lt;MobileApplicationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The modile application was updated successfully </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized request </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unable to process request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MobileApplicationResponse> updateMobileApplicationByIdWithHttpInfo(UUID mobileApplicationId, CreateMobileApplicationRequest createMobileApplicationRequest) throws ApiException {
    Object localVarPostBody = createMobileApplicationRequest;
    
    // verify the required parameter 'mobileApplicationId' is set
    if (mobileApplicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'mobileApplicationId' when calling updateMobileApplicationById");
    }
    
    // verify the required parameter 'createMobileApplicationRequest' is set
    if (createMobileApplicationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createMobileApplicationRequest' when calling updateMobileApplicationById");
    }
    
    // create path and map variables
    String localVarPath = "/mobile_applications/{mobile_application_id}"
      .replaceAll("\\{" + "mobile_application_id" + "\\}", apiClient.escapeString(mobileApplicationId.toString()));

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

    GenericType<MobileApplicationResponse> localVarReturnType = new GenericType<MobileApplicationResponse>() {};

    return apiClient.invokeAPI("MobileApplicationsApi.updateMobileApplicationById", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
