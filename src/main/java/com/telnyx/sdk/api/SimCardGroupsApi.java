package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateSimCardGroup200Response;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.GetAllSimCardGroups200Response;
import com.telnyx.sdk.model.GetSimCardGroupAction200Response;
import com.telnyx.sdk.model.SIMCardGroupCreate;
import com.telnyx.sdk.model.SIMCardGroupPatch;
import com.telnyx.sdk.model.SetPrivateWirelessGatewayForSimCardGroupRequest;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
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
   * Create a SIM card group
   * Creates a new SIM card group object
   * @param siMCardGroupCreate  (required)
   * @return CreateSimCardGroup200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateSimCardGroup200Response createSimCardGroup(SIMCardGroupCreate siMCardGroupCreate) throws ApiException {
    return createSimCardGroupWithHttpInfo(siMCardGroupCreate).getData();
  }

  /**
   * Create a SIM card group
   * Creates a new SIM card group object
   * @param siMCardGroupCreate  (required)
   * @return ApiResponse&lt;CreateSimCardGroup200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateSimCardGroup200Response> createSimCardGroupWithHttpInfo(SIMCardGroupCreate siMCardGroupCreate) throws ApiException {
    Object localVarPostBody = siMCardGroupCreate;
    
    // verify the required parameter 'siMCardGroupCreate' is set
    if (siMCardGroupCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'siMCardGroupCreate' when calling createSimCardGroup");
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

    GenericType<CreateSimCardGroup200Response> localVarReturnType = new GenericType<CreateSimCardGroup200Response>() {};

    return apiClient.invokeAPI("SimCardGroupsApi.createSimCardGroup", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a SIM card group
   * Permanently deletes a SIM card group
   * @param id Identifies the resource. (required)
   * @return CreateSimCardGroup200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateSimCardGroup200Response deleteSimCardGroup(UUID id) throws ApiException {
    return deleteSimCardGroupWithHttpInfo(id).getData();
  }

  /**
   * Delete a SIM card group
   * Permanently deletes a SIM card group
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;CreateSimCardGroup200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateSimCardGroup200Response> deleteSimCardGroupWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteSimCardGroup");
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

    GenericType<CreateSimCardGroup200Response> localVarReturnType = new GenericType<CreateSimCardGroup200Response>() {};

    return apiClient.invokeAPI("SimCardGroupsApi.deleteSimCardGroup", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get all SIM card groups
   * Get all SIM card groups belonging to the user that match the given filters.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterName A valid SIM card group name. (optional)
   * @param filterPrivateWirelessGatewayId A Private Wireless Gateway ID associated with the group. (optional)
   * @return GetAllSimCardGroups200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetAllSimCardGroups200Response getAllSimCardGroups(Integer pageNumber, Integer pageSize, UUID filterName, UUID filterPrivateWirelessGatewayId) throws ApiException {
    return getAllSimCardGroupsWithHttpInfo(pageNumber, pageSize, filterName, filterPrivateWirelessGatewayId).getData();
  }

  /**
   * Get all SIM card groups
   * Get all SIM card groups belonging to the user that match the given filters.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterName A valid SIM card group name. (optional)
   * @param filterPrivateWirelessGatewayId A Private Wireless Gateway ID associated with the group. (optional)
   * @return ApiResponse&lt;GetAllSimCardGroups200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetAllSimCardGroups200Response> getAllSimCardGroupsWithHttpInfo(Integer pageNumber, Integer pageSize, UUID filterName, UUID filterPrivateWirelessGatewayId) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[private_wireless_gateway_id]", filterPrivateWirelessGatewayId));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<GetAllSimCardGroups200Response> localVarReturnType = new GenericType<GetAllSimCardGroups200Response>() {};

    return apiClient.invokeAPI("SimCardGroupsApi.getAllSimCardGroups", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get SIM card group
   * Returns the details regarding a specific SIM card group
   * @param id Identifies the resource. (required)
   * @return CreateSimCardGroup200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateSimCardGroup200Response getSimCardGroup(UUID id) throws ApiException {
    return getSimCardGroupWithHttpInfo(id).getData();
  }

  /**
   * Get SIM card group
   * Returns the details regarding a specific SIM card group
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;CreateSimCardGroup200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateSimCardGroup200Response> getSimCardGroupWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getSimCardGroup");
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

    GenericType<CreateSimCardGroup200Response> localVarReturnType = new GenericType<CreateSimCardGroup200Response>() {};

    return apiClient.invokeAPI("SimCardGroupsApi.getSimCardGroup", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Request Private Wireless Gateway removal from SIM card group
   * This action will asynchronously remove an existing Private Wireless Gateway definition from a SIM card group. Completing this operation defines that all SIM cards in the SIM card group will get their traffic handled by Telnyx&#39;s default mobile network configuration.
   * @param id Identifies the resource. (required)
   * @return GetSimCardGroupAction200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetSimCardGroupAction200Response removeSimCardGroupPrivateWirelessGateway(UUID id) throws ApiException {
    return removeSimCardGroupPrivateWirelessGatewayWithHttpInfo(id).getData();
  }

  /**
   * Request Private Wireless Gateway removal from SIM card group
   * This action will asynchronously remove an existing Private Wireless Gateway definition from a SIM card group. Completing this operation defines that all SIM cards in the SIM card group will get their traffic handled by Telnyx&#39;s default mobile network configuration.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;GetSimCardGroupAction200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetSimCardGroupAction200Response> removeSimCardGroupPrivateWirelessGatewayWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling removeSimCardGroupPrivateWirelessGateway");
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

    GenericType<GetSimCardGroupAction200Response> localVarReturnType = new GenericType<GetSimCardGroupAction200Response>() {};

    return apiClient.invokeAPI("SimCardGroupsApi.removeSimCardGroupPrivateWirelessGateway", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Request Private Wireless Gateway assignment for SIM card group
   * This action will asynchronously assign a provisioned Private Wireless Gateway to the SIM card group. Completing this operation defines that all SIM cards in the SIM card group will get their traffic controlled by the associated Private Wireless Gateway. This operation will also imply that new SIM cards assigned to a group will inherit its network definitions. If it&#39;s moved to a different group that doesn&#39;t have a Private Wireless Gateway, it&#39;ll use Telnyx&#39;s default mobile network configuration.
   * @param id Identifies the resource. (required)
   * @param setPrivateWirelessGatewayForSimCardGroupRequest  (required)
   * @return GetSimCardGroupAction200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetSimCardGroupAction200Response setPrivateWirelessGatewayForSimCardGroup(UUID id, SetPrivateWirelessGatewayForSimCardGroupRequest setPrivateWirelessGatewayForSimCardGroupRequest) throws ApiException {
    return setPrivateWirelessGatewayForSimCardGroupWithHttpInfo(id, setPrivateWirelessGatewayForSimCardGroupRequest).getData();
  }

  /**
   * Request Private Wireless Gateway assignment for SIM card group
   * This action will asynchronously assign a provisioned Private Wireless Gateway to the SIM card group. Completing this operation defines that all SIM cards in the SIM card group will get their traffic controlled by the associated Private Wireless Gateway. This operation will also imply that new SIM cards assigned to a group will inherit its network definitions. If it&#39;s moved to a different group that doesn&#39;t have a Private Wireless Gateway, it&#39;ll use Telnyx&#39;s default mobile network configuration.
   * @param id Identifies the resource. (required)
   * @param setPrivateWirelessGatewayForSimCardGroupRequest  (required)
   * @return ApiResponse&lt;GetSimCardGroupAction200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetSimCardGroupAction200Response> setPrivateWirelessGatewayForSimCardGroupWithHttpInfo(UUID id, SetPrivateWirelessGatewayForSimCardGroupRequest setPrivateWirelessGatewayForSimCardGroupRequest) throws ApiException {
    Object localVarPostBody = setPrivateWirelessGatewayForSimCardGroupRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setPrivateWirelessGatewayForSimCardGroup");
    }
    
    // verify the required parameter 'setPrivateWirelessGatewayForSimCardGroupRequest' is set
    if (setPrivateWirelessGatewayForSimCardGroupRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'setPrivateWirelessGatewayForSimCardGroupRequest' when calling setPrivateWirelessGatewayForSimCardGroup");
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

    GenericType<GetSimCardGroupAction200Response> localVarReturnType = new GenericType<GetSimCardGroupAction200Response>() {};

    return apiClient.invokeAPI("SimCardGroupsApi.setPrivateWirelessGatewayForSimCardGroup", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a SIM card group
   * Updates a SIM card group
   * @param id Identifies the resource. (required)
   * @param siMCardGroupPatch  (required)
   * @return CreateSimCardGroup200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateSimCardGroup200Response updateSimCardGroup(UUID id, SIMCardGroupPatch siMCardGroupPatch) throws ApiException {
    return updateSimCardGroupWithHttpInfo(id, siMCardGroupPatch).getData();
  }

  /**
   * Update a SIM card group
   * Updates a SIM card group
   * @param id Identifies the resource. (required)
   * @param siMCardGroupPatch  (required)
   * @return ApiResponse&lt;CreateSimCardGroup200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateSimCardGroup200Response> updateSimCardGroupWithHttpInfo(UUID id, SIMCardGroupPatch siMCardGroupPatch) throws ApiException {
    Object localVarPostBody = siMCardGroupPatch;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateSimCardGroup");
    }
    
    // verify the required parameter 'siMCardGroupPatch' is set
    if (siMCardGroupPatch == null) {
      throw new ApiException(400, "Missing the required parameter 'siMCardGroupPatch' when calling updateSimCardGroup");
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

    GenericType<CreateSimCardGroup200Response> localVarReturnType = new GenericType<CreateSimCardGroup200Response>() {};

    return apiClient.invokeAPI("SimCardGroupsApi.updateSimCardGroup", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
