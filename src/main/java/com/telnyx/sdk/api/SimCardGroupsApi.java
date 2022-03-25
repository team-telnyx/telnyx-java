package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreatePrivateWirelessGatwewayRequest1;
import com.telnyx.sdk.model.CreateSimCardGroupResponse;
import com.telnyx.sdk.model.DeleteSimCardGroupResponse;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.GetAllSimCardGroupsResponse;
import com.telnyx.sdk.model.GetSimCardGroupResponse;
import com.telnyx.sdk.model.SIMCardGroupActionResponse;
import com.telnyx.sdk.model.SIMCardGroupCreate;
import com.telnyx.sdk.model.SIMCardGroupPatch;
import java.util.UUID;
import com.telnyx.sdk.model.UpdateSimCardGroupResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SimCardGroupsApi {
  private ApiClient apiClient;

  public SimCardGroupsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SimCardGroupsApi(ApiClient apiClient) {
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
   * Request Private Wireless Gateway removal from SIM card group
   * This action will asynchronously remove an existing Private Wireless Gateway definition from a SIM card group. Completing this operation defines that all SIM cards in the SIM card group will get their traffic handled by Telnyx&#39;s default mobile network configuration.
   * @param id Identifies the resource. (required)
   * @return SIMCardGroupActionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SIMCardGroupActionResponse removeSIMCardGroupPrivateWirelessGateway(UUID id) throws ApiException {
    return removeSIMCardGroupPrivateWirelessGatewayWithHttpInfo(id).getData();
  }

  /**
   * Request Private Wireless Gateway removal from SIM card group
   * This action will asynchronously remove an existing Private Wireless Gateway definition from a SIM card group. Completing this operation defines that all SIM cards in the SIM card group will get their traffic handled by Telnyx&#39;s default mobile network configuration.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;SIMCardGroupActionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SIMCardGroupActionResponse> removeSIMCardGroupPrivateWirelessGatewayWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling removeSIMCardGroupPrivateWirelessGateway");
    }
    
    // create path and map variables
    String localVarPath = "/sim_card_groups/{id}/actions/remove_private_wireless_gateway"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<SIMCardGroupActionResponse> localVarReturnType = new GenericType<SIMCardGroupActionResponse>() {};

    return apiClient.invokeAPI("SimCardGroupsApi.removeSIMCardGroupPrivateWirelessGateway", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Request Private Wireless Gateway assignment for SIM card group
   * This action will asynchronously assign a provisioned Private Wireless Gateway to the SIM card group. Completing this operation defines that all SIM cards in the SIM card group will get their traffic controlled by the associated Private Wireless Gateway. This operation will also imply that new SIM cards assigned to a group will inherit its network definitions. If it&#39;s moved to a different group that doesn&#39;t have a Private Wireless Gateway, it&#39;ll use Telnyx&#39;s default mobile network configuration.
   * @param id Identifies the resource. (required)
   * @param createPrivateWirelessGatwewayRequest1  (required)
   * @return SIMCardGroupActionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SIMCardGroupActionResponse setSIMCardGroupPrivateWirelessGateway(UUID id, CreatePrivateWirelessGatwewayRequest1 createPrivateWirelessGatwewayRequest1) throws ApiException {
    return setSIMCardGroupPrivateWirelessGatewayWithHttpInfo(id, createPrivateWirelessGatwewayRequest1).getData();
  }

  /**
   * Request Private Wireless Gateway assignment for SIM card group
   * This action will asynchronously assign a provisioned Private Wireless Gateway to the SIM card group. Completing this operation defines that all SIM cards in the SIM card group will get their traffic controlled by the associated Private Wireless Gateway. This operation will also imply that new SIM cards assigned to a group will inherit its network definitions. If it&#39;s moved to a different group that doesn&#39;t have a Private Wireless Gateway, it&#39;ll use Telnyx&#39;s default mobile network configuration.
   * @param id Identifies the resource. (required)
   * @param createPrivateWirelessGatwewayRequest1  (required)
   * @return ApiResponse&lt;SIMCardGroupActionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SIMCardGroupActionResponse> setSIMCardGroupPrivateWirelessGatewayWithHttpInfo(UUID id, CreatePrivateWirelessGatwewayRequest1 createPrivateWirelessGatwewayRequest1) throws ApiException {
    Object localVarPostBody = createPrivateWirelessGatwewayRequest1;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setSIMCardGroupPrivateWirelessGateway");
    }
    
    // verify the required parameter 'createPrivateWirelessGatwewayRequest1' is set
    if (createPrivateWirelessGatwewayRequest1 == null) {
      throw new ApiException(400, "Missing the required parameter 'createPrivateWirelessGatwewayRequest1' when calling setSIMCardGroupPrivateWirelessGateway");
    }
    
    // create path and map variables
    String localVarPath = "/sim_card_groups/{id}/actions/set_private_wireless_gateway"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<SIMCardGroupActionResponse> localVarReturnType = new GenericType<SIMCardGroupActionResponse>() {};

    return apiClient.invokeAPI("SimCardGroupsApi.setSIMCardGroupPrivateWirelessGateway", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a SIM card group
   * Permanently deletes a SIM card group
   * @param id Identifies the resource. (required)
   * @return DeleteSimCardGroupResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public DeleteSimCardGroupResponse simCardGroupDelete(UUID id) throws ApiException {
    return simCardGroupDeleteWithHttpInfo(id).getData();
  }

  /**
   * Delete a SIM card group
   * Permanently deletes a SIM card group
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;DeleteSimCardGroupResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DeleteSimCardGroupResponse> simCardGroupDeleteWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling simCardGroupDelete");
    }
    
    // create path and map variables
    String localVarPath = "/sim_card_groups/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<DeleteSimCardGroupResponse> localVarReturnType = new GenericType<DeleteSimCardGroupResponse>() {};

    return apiClient.invokeAPI("SimCardGroupsApi.simCardGroupDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a SIM card group
   * Updates a SIM card group
   * @param id Identifies the resource. (required)
   * @param siMCardGroupPatch  (required)
   * @return UpdateSimCardGroupResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public UpdateSimCardGroupResponse simCardGroupUpdate(UUID id, SIMCardGroupPatch siMCardGroupPatch) throws ApiException {
    return simCardGroupUpdateWithHttpInfo(id, siMCardGroupPatch).getData();
  }

  /**
   * Update a SIM card group
   * Updates a SIM card group
   * @param id Identifies the resource. (required)
   * @param siMCardGroupPatch  (required)
   * @return ApiResponse&lt;UpdateSimCardGroupResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UpdateSimCardGroupResponse> simCardGroupUpdateWithHttpInfo(UUID id, SIMCardGroupPatch siMCardGroupPatch) throws ApiException {
    Object localVarPostBody = siMCardGroupPatch;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling simCardGroupUpdate");
    }
    
    // verify the required parameter 'siMCardGroupPatch' is set
    if (siMCardGroupPatch == null) {
      throw new ApiException(400, "Missing the required parameter 'siMCardGroupPatch' when calling simCardGroupUpdate");
    }
    
    // create path and map variables
    String localVarPath = "/sim_card_groups/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<UpdateSimCardGroupResponse> localVarReturnType = new GenericType<UpdateSimCardGroupResponse>() {};

    return apiClient.invokeAPI("SimCardGroupsApi.simCardGroupUpdate", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get SIM card group
   * Returns the details regarding a specific SIM card group
   * @param id Identifies the resource. (required)
   * @return GetSimCardGroupResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetSimCardGroupResponse simCardGroupsGet(UUID id) throws ApiException {
    return simCardGroupsGetWithHttpInfo(id).getData();
  }

  /**
   * Get SIM card group
   * Returns the details regarding a specific SIM card group
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;GetSimCardGroupResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetSimCardGroupResponse> simCardGroupsGetWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling simCardGroupsGet");
    }
    
    // create path and map variables
    String localVarPath = "/sim_card_groups/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<GetSimCardGroupResponse> localVarReturnType = new GenericType<GetSimCardGroupResponse>() {};

    return apiClient.invokeAPI("SimCardGroupsApi.simCardGroupsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get all SIM card groups
   * Get all SIM card groups belonging to the user that match the given filters.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterName A valid SIM card group name. (optional)
   * @return GetAllSimCardGroupsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetAllSimCardGroupsResponse simCardGroupsGetAll(Integer pageNumber, Integer pageSize, UUID filterName) throws ApiException {
    return simCardGroupsGetAllWithHttpInfo(pageNumber, pageSize, filterName).getData();
  }

  /**
   * Get all SIM card groups
   * Get all SIM card groups belonging to the user that match the given filters.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterName A valid SIM card group name. (optional)
   * @return ApiResponse&lt;GetAllSimCardGroupsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetAllSimCardGroupsResponse> simCardGroupsGetAllWithHttpInfo(Integer pageNumber, Integer pageSize, UUID filterName) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/sim_card_groups";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[name]", filterName));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<GetAllSimCardGroupsResponse> localVarReturnType = new GenericType<GetAllSimCardGroupsResponse>() {};

    return apiClient.invokeAPI("SimCardGroupsApi.simCardGroupsGetAll", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a SIM card group
   * Creates a new SIM card group object
   * @param siMCardGroupCreate  (required)
   * @return CreateSimCardGroupResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateSimCardGroupResponse simCardGroupsPost(SIMCardGroupCreate siMCardGroupCreate) throws ApiException {
    return simCardGroupsPostWithHttpInfo(siMCardGroupCreate).getData();
  }

  /**
   * Create a SIM card group
   * Creates a new SIM card group object
   * @param siMCardGroupCreate  (required)
   * @return ApiResponse&lt;CreateSimCardGroupResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateSimCardGroupResponse> simCardGroupsPostWithHttpInfo(SIMCardGroupCreate siMCardGroupCreate) throws ApiException {
    Object localVarPostBody = siMCardGroupCreate;
    
    // verify the required parameter 'siMCardGroupCreate' is set
    if (siMCardGroupCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'siMCardGroupCreate' when calling simCardGroupsPost");
    }
    
    // create path and map variables
    String localVarPath = "/sim_card_groups";

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

    GenericType<CreateSimCardGroupResponse> localVarReturnType = new GenericType<CreateSimCardGroupResponse>() {};

    return apiClient.invokeAPI("SimCardGroupsApi.simCardGroupsPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
