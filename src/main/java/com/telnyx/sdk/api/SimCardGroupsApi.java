package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.SIMCardGroupCreate;
import com.telnyx.sdk.model.SIMCardGroupPatch;
import com.telnyx.sdk.model.SetSIMCardGroupPrivateWirelessGatewayRequest;
import com.telnyx.sdk.model.SimCardGroupActionGet200Response;
import com.telnyx.sdk.model.SimCardGroupsGetAll200Response;
import com.telnyx.sdk.model.SimCardGroupsPost200Response;
import java.util.UUID;

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
   * @return SimCardGroupActionGet200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SimCardGroupActionGet200Response removeSIMCardGroupPrivateWirelessGateway(UUID id) throws ApiException {
    return removeSIMCardGroupPrivateWirelessGatewayWithHttpInfo(id).getData();
  }

  /**
   * Request Private Wireless Gateway removal from SIM card group
   * This action will asynchronously remove an existing Private Wireless Gateway definition from a SIM card group. Completing this operation defines that all SIM cards in the SIM card group will get their traffic handled by Telnyx&#39;s default mobile network configuration.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;SimCardGroupActionGet200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SimCardGroupActionGet200Response> removeSIMCardGroupPrivateWirelessGatewayWithHttpInfo(UUID id) throws ApiException {
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

    GenericType<SimCardGroupActionGet200Response> localVarReturnType = new GenericType<SimCardGroupActionGet200Response>() {};

    return apiClient.invokeAPI("SimCardGroupsApi.removeSIMCardGroupPrivateWirelessGateway", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Request Private Wireless Gateway assignment for SIM card group
   * This action will asynchronously assign a provisioned Private Wireless Gateway to the SIM card group. Completing this operation defines that all SIM cards in the SIM card group will get their traffic controlled by the associated Private Wireless Gateway. This operation will also imply that new SIM cards assigned to a group will inherit its network definitions. If it&#39;s moved to a different group that doesn&#39;t have a Private Wireless Gateway, it&#39;ll use Telnyx&#39;s default mobile network configuration.
   * @param id Identifies the resource. (required)
   * @param setSIMCardGroupPrivateWirelessGatewayRequest  (required)
   * @return SimCardGroupActionGet200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SimCardGroupActionGet200Response setSIMCardGroupPrivateWirelessGateway(UUID id, SetSIMCardGroupPrivateWirelessGatewayRequest setSIMCardGroupPrivateWirelessGatewayRequest) throws ApiException {
    return setSIMCardGroupPrivateWirelessGatewayWithHttpInfo(id, setSIMCardGroupPrivateWirelessGatewayRequest).getData();
  }

  /**
   * Request Private Wireless Gateway assignment for SIM card group
   * This action will asynchronously assign a provisioned Private Wireless Gateway to the SIM card group. Completing this operation defines that all SIM cards in the SIM card group will get their traffic controlled by the associated Private Wireless Gateway. This operation will also imply that new SIM cards assigned to a group will inherit its network definitions. If it&#39;s moved to a different group that doesn&#39;t have a Private Wireless Gateway, it&#39;ll use Telnyx&#39;s default mobile network configuration.
   * @param id Identifies the resource. (required)
   * @param setSIMCardGroupPrivateWirelessGatewayRequest  (required)
   * @return ApiResponse&lt;SimCardGroupActionGet200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SimCardGroupActionGet200Response> setSIMCardGroupPrivateWirelessGatewayWithHttpInfo(UUID id, SetSIMCardGroupPrivateWirelessGatewayRequest setSIMCardGroupPrivateWirelessGatewayRequest) throws ApiException {
    Object localVarPostBody = setSIMCardGroupPrivateWirelessGatewayRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling setSIMCardGroupPrivateWirelessGateway");
    }
    
    // verify the required parameter 'setSIMCardGroupPrivateWirelessGatewayRequest' is set
    if (setSIMCardGroupPrivateWirelessGatewayRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'setSIMCardGroupPrivateWirelessGatewayRequest' when calling setSIMCardGroupPrivateWirelessGateway");
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

    GenericType<SimCardGroupActionGet200Response> localVarReturnType = new GenericType<SimCardGroupActionGet200Response>() {};

    return apiClient.invokeAPI("SimCardGroupsApi.setSIMCardGroupPrivateWirelessGateway", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a SIM card group
   * Permanently deletes a SIM card group
   * @param id Identifies the resource. (required)
   * @return SimCardGroupsPost200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SimCardGroupsPost200Response simCardGroupDelete(UUID id) throws ApiException {
    return simCardGroupDeleteWithHttpInfo(id).getData();
  }

  /**
   * Delete a SIM card group
   * Permanently deletes a SIM card group
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;SimCardGroupsPost200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SimCardGroupsPost200Response> simCardGroupDeleteWithHttpInfo(UUID id) throws ApiException {
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

    GenericType<SimCardGroupsPost200Response> localVarReturnType = new GenericType<SimCardGroupsPost200Response>() {};

    return apiClient.invokeAPI("SimCardGroupsApi.simCardGroupDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a SIM card group
   * Updates a SIM card group
   * @param id Identifies the resource. (required)
   * @param siMCardGroupPatch  (required)
   * @return SimCardGroupsPost200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SimCardGroupsPost200Response simCardGroupUpdate(UUID id, SIMCardGroupPatch siMCardGroupPatch) throws ApiException {
    return simCardGroupUpdateWithHttpInfo(id, siMCardGroupPatch).getData();
  }

  /**
   * Update a SIM card group
   * Updates a SIM card group
   * @param id Identifies the resource. (required)
   * @param siMCardGroupPatch  (required)
   * @return ApiResponse&lt;SimCardGroupsPost200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SimCardGroupsPost200Response> simCardGroupUpdateWithHttpInfo(UUID id, SIMCardGroupPatch siMCardGroupPatch) throws ApiException {
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

    GenericType<SimCardGroupsPost200Response> localVarReturnType = new GenericType<SimCardGroupsPost200Response>() {};

    return apiClient.invokeAPI("SimCardGroupsApi.simCardGroupUpdate", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get SIM card group
   * Returns the details regarding a specific SIM card group
   * @param id Identifies the resource. (required)
   * @return SimCardGroupsPost200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SimCardGroupsPost200Response simCardGroupsGet(UUID id) throws ApiException {
    return simCardGroupsGetWithHttpInfo(id).getData();
  }

  /**
   * Get SIM card group
   * Returns the details regarding a specific SIM card group
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;SimCardGroupsPost200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SimCardGroupsPost200Response> simCardGroupsGetWithHttpInfo(UUID id) throws ApiException {
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

    GenericType<SimCardGroupsPost200Response> localVarReturnType = new GenericType<SimCardGroupsPost200Response>() {};

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
   * @param filterPrivateWirelessGatewayId A Private Wireless Gateway ID associated with the group. (optional)
   * @return SimCardGroupsGetAll200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SimCardGroupsGetAll200Response simCardGroupsGetAll(Integer pageNumber, Integer pageSize, UUID filterName, UUID filterPrivateWirelessGatewayId) throws ApiException {
    return simCardGroupsGetAllWithHttpInfo(pageNumber, pageSize, filterName, filterPrivateWirelessGatewayId).getData();
  }

  /**
   * Get all SIM card groups
   * Get all SIM card groups belonging to the user that match the given filters.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterName A valid SIM card group name. (optional)
   * @param filterPrivateWirelessGatewayId A Private Wireless Gateway ID associated with the group. (optional)
   * @return ApiResponse&lt;SimCardGroupsGetAll200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SimCardGroupsGetAll200Response> simCardGroupsGetAllWithHttpInfo(Integer pageNumber, Integer pageSize, UUID filterName, UUID filterPrivateWirelessGatewayId) throws ApiException {
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

    GenericType<SimCardGroupsGetAll200Response> localVarReturnType = new GenericType<SimCardGroupsGetAll200Response>() {};

    return apiClient.invokeAPI("SimCardGroupsApi.simCardGroupsGetAll", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a SIM card group
   * Creates a new SIM card group object
   * @param siMCardGroupCreate  (required)
   * @return SimCardGroupsPost200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SimCardGroupsPost200Response simCardGroupsPost(SIMCardGroupCreate siMCardGroupCreate) throws ApiException {
    return simCardGroupsPostWithHttpInfo(siMCardGroupCreate).getData();
  }

  /**
   * Create a SIM card group
   * Creates a new SIM card group object
   * @param siMCardGroupCreate  (required)
   * @return ApiResponse&lt;SimCardGroupsPost200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SimCardGroupsPost200Response> simCardGroupsPostWithHttpInfo(SIMCardGroupCreate siMCardGroupCreate) throws ApiException {
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

    GenericType<SimCardGroupsPost200Response> localVarReturnType = new GenericType<SimCardGroupsPost200Response>() {};

    return apiClient.invokeAPI("SimCardGroupsApi.simCardGroupsPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
