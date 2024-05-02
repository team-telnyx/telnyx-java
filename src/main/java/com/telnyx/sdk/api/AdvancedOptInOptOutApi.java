package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.AutoRespConfigCreateSchema;
import com.telnyx.sdk.model.AutorespConfigResponseSchema;
import com.telnyx.sdk.model.AutorespConfigsResponseSchema;
import com.telnyx.sdk.model.Errors;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class AdvancedOptInOptOutApi {
  private ApiClient apiClient;

  public AdvancedOptInOptOutApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AdvancedOptInOptOutApi(ApiClient apiClient) {
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
   * Create Auto-Reponse Setting
   * 
   * @param profileId  (required)
   * @param autoRespConfigCreateSchema  (required)
   * @return AutorespConfigResponseSchema
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public AutorespConfigResponseSchema createAutorespConfig(String profileId, AutoRespConfigCreateSchema autoRespConfigCreateSchema) throws ApiException {
    return createAutorespConfigWithHttpInfo(profileId, autoRespConfigCreateSchema).getData();
  }

  /**
   * Create Auto-Reponse Setting
   * 
   * @param profileId  (required)
   * @param autoRespConfigCreateSchema  (required)
   * @return ApiResponse&lt;AutorespConfigResponseSchema&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AutorespConfigResponseSchema> createAutorespConfigWithHttpInfo(String profileId, AutoRespConfigCreateSchema autoRespConfigCreateSchema) throws ApiException {
    Object localVarPostBody = autoRespConfigCreateSchema;
    
    // verify the required parameter 'profileId' is set
    if (profileId == null) {
      throw new ApiException(400, "Missing the required parameter 'profileId' when calling createAutorespConfig");
    }
    
    // verify the required parameter 'autoRespConfigCreateSchema' is set
    if (autoRespConfigCreateSchema == null) {
      throw new ApiException(400, "Missing the required parameter 'autoRespConfigCreateSchema' when calling createAutorespConfig");
    }
    
    // create path and map variables
    String localVarPath = "/messaging_profiles/{profile_id}/autoresp_configs"
      .replaceAll("\\{" + "profile_id" + "\\}", apiClient.escapeString(profileId.toString()));

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

    GenericType<AutorespConfigResponseSchema> localVarReturnType = new GenericType<AutorespConfigResponseSchema>() {};

    return apiClient.invokeAPI("AdvancedOptInOptOutApi.createAutorespConfig", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete Auto-Response Setting
   * 
   * @param profileId  (required)
   * @param autorespCfgId  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public Object deleteAutorespConfig(UUID profileId, UUID autorespCfgId) throws ApiException {
    return deleteAutorespConfigWithHttpInfo(profileId, autorespCfgId).getData();
  }

  /**
   * Delete Auto-Response Setting
   * 
   * @param profileId  (required)
   * @param autorespCfgId  (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> deleteAutorespConfigWithHttpInfo(UUID profileId, UUID autorespCfgId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'profileId' is set
    if (profileId == null) {
      throw new ApiException(400, "Missing the required parameter 'profileId' when calling deleteAutorespConfig");
    }
    
    // verify the required parameter 'autorespCfgId' is set
    if (autorespCfgId == null) {
      throw new ApiException(400, "Missing the required parameter 'autorespCfgId' when calling deleteAutorespConfig");
    }
    
    // create path and map variables
    String localVarPath = "/messaging_profiles/{profile_id}/autoresp_configs/{autoresp_cfg_id}"
      .replaceAll("\\{" + "profile_id" + "\\}", apiClient.escapeString(profileId.toString()))
      .replaceAll("\\{" + "autoresp_cfg_id" + "\\}", apiClient.escapeString(autorespCfgId.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("AdvancedOptInOptOutApi.deleteAutorespConfig", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Auto-Response Setting
   * 
   * @param profileId  (required)
   * @param autorespCfgId  (required)
   * @return AutorespConfigResponseSchema
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public AutorespConfigResponseSchema getAutorespConfig(UUID profileId, UUID autorespCfgId) throws ApiException {
    return getAutorespConfigWithHttpInfo(profileId, autorespCfgId).getData();
  }

  /**
   * Get Auto-Response Setting
   * 
   * @param profileId  (required)
   * @param autorespCfgId  (required)
   * @return ApiResponse&lt;AutorespConfigResponseSchema&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AutorespConfigResponseSchema> getAutorespConfigWithHttpInfo(UUID profileId, UUID autorespCfgId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'profileId' is set
    if (profileId == null) {
      throw new ApiException(400, "Missing the required parameter 'profileId' when calling getAutorespConfig");
    }
    
    // verify the required parameter 'autorespCfgId' is set
    if (autorespCfgId == null) {
      throw new ApiException(400, "Missing the required parameter 'autorespCfgId' when calling getAutorespConfig");
    }
    
    // create path and map variables
    String localVarPath = "/messaging_profiles/{profile_id}/autoresp_configs/{autoresp_cfg_id}"
      .replaceAll("\\{" + "profile_id" + "\\}", apiClient.escapeString(profileId.toString()))
      .replaceAll("\\{" + "autoresp_cfg_id" + "\\}", apiClient.escapeString(autorespCfgId.toString()));

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

    GenericType<AutorespConfigResponseSchema> localVarReturnType = new GenericType<AutorespConfigResponseSchema>() {};

    return apiClient.invokeAPI("AdvancedOptInOptOutApi.getAutorespConfig", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List Auto-Response Settings
   * 
   * @param profileId  (required)
   * @param countryCode  (optional)
   * @param createdAtGte  (optional)
   * @param createdAtLte  (optional)
   * @param updatedAtGte  (optional)
   * @param updatedAtLte  (optional)
   * @return AutorespConfigsResponseSchema
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public AutorespConfigsResponseSchema getAutorespConfigs(UUID profileId, String countryCode, String createdAtGte, String createdAtLte, String updatedAtGte, String updatedAtLte) throws ApiException {
    return getAutorespConfigsWithHttpInfo(profileId, countryCode, createdAtGte, createdAtLte, updatedAtGte, updatedAtLte).getData();
  }

  /**
   * List Auto-Response Settings
   * 
   * @param profileId  (required)
   * @param countryCode  (optional)
   * @param createdAtGte  (optional)
   * @param createdAtLte  (optional)
   * @param updatedAtGte  (optional)
   * @param updatedAtLte  (optional)
   * @return ApiResponse&lt;AutorespConfigsResponseSchema&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AutorespConfigsResponseSchema> getAutorespConfigsWithHttpInfo(UUID profileId, String countryCode, String createdAtGte, String createdAtLte, String updatedAtGte, String updatedAtLte) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'profileId' is set
    if (profileId == null) {
      throw new ApiException(400, "Missing the required parameter 'profileId' when calling getAutorespConfigs");
    }
    
    // create path and map variables
    String localVarPath = "/messaging_profiles/{profile_id}/autoresp_configs"
      .replaceAll("\\{" + "profile_id" + "\\}", apiClient.escapeString(profileId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "country_code", countryCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "created_at[gte]", createdAtGte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "created_at[lte]", createdAtLte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updated_at[gte]", updatedAtGte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "updated_at[lte]", updatedAtLte));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<AutorespConfigsResponseSchema> localVarReturnType = new GenericType<AutorespConfigsResponseSchema>() {};

    return apiClient.invokeAPI("AdvancedOptInOptOutApi.getAutorespConfigs", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update Auto-Response Setting
   * 
   * @param profileId  (required)
   * @param autorespCfgId  (required)
   * @param autoRespConfigCreateSchema  (required)
   * @return AutorespConfigResponseSchema
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public AutorespConfigResponseSchema updateAutoRespConfig(UUID profileId, UUID autorespCfgId, AutoRespConfigCreateSchema autoRespConfigCreateSchema) throws ApiException {
    return updateAutoRespConfigWithHttpInfo(profileId, autorespCfgId, autoRespConfigCreateSchema).getData();
  }

  /**
   * Update Auto-Response Setting
   * 
   * @param profileId  (required)
   * @param autorespCfgId  (required)
   * @param autoRespConfigCreateSchema  (required)
   * @return ApiResponse&lt;AutorespConfigResponseSchema&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AutorespConfigResponseSchema> updateAutoRespConfigWithHttpInfo(UUID profileId, UUID autorespCfgId, AutoRespConfigCreateSchema autoRespConfigCreateSchema) throws ApiException {
    Object localVarPostBody = autoRespConfigCreateSchema;
    
    // verify the required parameter 'profileId' is set
    if (profileId == null) {
      throw new ApiException(400, "Missing the required parameter 'profileId' when calling updateAutoRespConfig");
    }
    
    // verify the required parameter 'autorespCfgId' is set
    if (autorespCfgId == null) {
      throw new ApiException(400, "Missing the required parameter 'autorespCfgId' when calling updateAutoRespConfig");
    }
    
    // verify the required parameter 'autoRespConfigCreateSchema' is set
    if (autoRespConfigCreateSchema == null) {
      throw new ApiException(400, "Missing the required parameter 'autoRespConfigCreateSchema' when calling updateAutoRespConfig");
    }
    
    // create path and map variables
    String localVarPath = "/messaging_profiles/{profile_id}/autoresp_configs/{autoresp_cfg_id}"
      .replaceAll("\\{" + "profile_id" + "\\}", apiClient.escapeString(profileId.toString()))
      .replaceAll("\\{" + "autoresp_cfg_id" + "\\}", apiClient.escapeString(autorespCfgId.toString()));

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

    GenericType<AutorespConfigResponseSchema> localVarReturnType = new GenericType<AutorespConfigResponseSchema>() {};

    return apiClient.invokeAPI("AdvancedOptInOptOutApi.updateAutoRespConfig", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
