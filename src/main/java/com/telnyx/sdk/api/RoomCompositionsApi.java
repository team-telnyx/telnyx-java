package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateRoomComposition202Response;
import com.telnyx.sdk.model.CreateRoomCompositionRequest;
import com.telnyx.sdk.model.Error;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListRoomCompositions200Response;
import java.time.LocalDate;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class RoomCompositionsApi {
  private ApiClient apiClient;

  public RoomCompositionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RoomCompositionsApi(ApiClient apiClient) {
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
   * Create a room composition.
   * Asynchronously create a room composition.
   * @param createRoomCompositionRequest Parameters that can be defined during room composition creation. (required)
   * @return CreateRoomComposition202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Create room composition response. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public CreateRoomComposition202Response createRoomComposition(CreateRoomCompositionRequest createRoomCompositionRequest) throws ApiException {
    return createRoomCompositionWithHttpInfo(createRoomCompositionRequest).getData();
  }

  /**
   * Create a room composition.
   * Asynchronously create a room composition.
   * @param createRoomCompositionRequest Parameters that can be defined during room composition creation. (required)
   * @return ApiResponse&lt;CreateRoomComposition202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Create room composition response. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateRoomComposition202Response> createRoomCompositionWithHttpInfo(CreateRoomCompositionRequest createRoomCompositionRequest) throws ApiException {
    Object localVarPostBody = createRoomCompositionRequest;
    
    // verify the required parameter 'createRoomCompositionRequest' is set
    if (createRoomCompositionRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createRoomCompositionRequest' when calling createRoomComposition");
    }
    
    // create path and map variables
    String localVarPath = "/room_compositions";

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

    GenericType<CreateRoomComposition202Response> localVarReturnType = new GenericType<CreateRoomComposition202Response>() {};

    return apiClient.invokeAPI("RoomCompositionsApi.createRoomComposition", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a room composition.
   * Synchronously delete a room composition.
   * @param roomCompositionId The unique identifier of a room composition. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The resource was deleted successfully. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public void deleteRoomComposition(UUID roomCompositionId) throws ApiException {
    deleteRoomCompositionWithHttpInfo(roomCompositionId);
  }

  /**
   * Delete a room composition.
   * Synchronously delete a room composition.
   * @param roomCompositionId The unique identifier of a room composition. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The resource was deleted successfully. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteRoomCompositionWithHttpInfo(UUID roomCompositionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'roomCompositionId' is set
    if (roomCompositionId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomCompositionId' when calling deleteRoomComposition");
    }
    
    // create path and map variables
    String localVarPath = "/room_compositions/{room_composition_id}"
      .replaceAll("\\{" + "room_composition_id" + "\\}", apiClient.escapeString(roomCompositionId.toString()));

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

    return apiClient.invokeAPI("RoomCompositionsApi.deleteRoomComposition", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * View a list of room compositions.
   * 
   * @param filterDateCreatedAtEq ISO 8601 date for filtering room compositions created on that date. (optional)
   * @param filterDateCreatedAtGte ISO 8601 date for filtering room compositions created after that date. (optional)
   * @param filterDateCreatedAtLte ISO 8601 date for filtering room compositions created before that date. (optional)
   * @param filterSessionId The session_id for filtering room compositions. (optional)
   * @param filterStatus The status for filtering room compositions. (optional)
   * @param pageSize The size of the page (optional, default to 20)
   * @param pageNumber The page number to load (optional, default to 1)
   * @return ListRoomCompositions200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List room compositions response. </td><td>  -  </td></tr>
     </table>
   */
  public ListRoomCompositions200Response listRoomCompositions(LocalDate filterDateCreatedAtEq, LocalDate filterDateCreatedAtGte, LocalDate filterDateCreatedAtLte, UUID filterSessionId, String filterStatus, Integer pageSize, Integer pageNumber) throws ApiException {
    return listRoomCompositionsWithHttpInfo(filterDateCreatedAtEq, filterDateCreatedAtGte, filterDateCreatedAtLte, filterSessionId, filterStatus, pageSize, pageNumber).getData();
  }

  /**
   * View a list of room compositions.
   * 
   * @param filterDateCreatedAtEq ISO 8601 date for filtering room compositions created on that date. (optional)
   * @param filterDateCreatedAtGte ISO 8601 date for filtering room compositions created after that date. (optional)
   * @param filterDateCreatedAtLte ISO 8601 date for filtering room compositions created before that date. (optional)
   * @param filterSessionId The session_id for filtering room compositions. (optional)
   * @param filterStatus The status for filtering room compositions. (optional)
   * @param pageSize The size of the page (optional, default to 20)
   * @param pageNumber The page number to load (optional, default to 1)
   * @return ApiResponse&lt;ListRoomCompositions200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List room compositions response. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListRoomCompositions200Response> listRoomCompositionsWithHttpInfo(LocalDate filterDateCreatedAtEq, LocalDate filterDateCreatedAtGte, LocalDate filterDateCreatedAtLte, UUID filterSessionId, String filterStatus, Integer pageSize, Integer pageNumber) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/room_compositions";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[date_created_at][eq]", filterDateCreatedAtEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[date_created_at][gte]", filterDateCreatedAtGte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[date_created_at][lte]", filterDateCreatedAtLte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[session_id]", filterSessionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));
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

    GenericType<ListRoomCompositions200Response> localVarReturnType = new GenericType<ListRoomCompositions200Response>() {};

    return apiClient.invokeAPI("RoomCompositionsApi.listRoomCompositions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * View a room composition.
   * 
   * @param roomCompositionId The unique identifier of a room composition. (required)
   * @return CreateRoomComposition202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Get room composition response. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public CreateRoomComposition202Response viewRoomComposition(UUID roomCompositionId) throws ApiException {
    return viewRoomCompositionWithHttpInfo(roomCompositionId).getData();
  }

  /**
   * View a room composition.
   * 
   * @param roomCompositionId The unique identifier of a room composition. (required)
   * @return ApiResponse&lt;CreateRoomComposition202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Get room composition response. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateRoomComposition202Response> viewRoomCompositionWithHttpInfo(UUID roomCompositionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'roomCompositionId' is set
    if (roomCompositionId == null) {
      throw new ApiException(400, "Missing the required parameter 'roomCompositionId' when calling viewRoomComposition");
    }
    
    // create path and map variables
    String localVarPath = "/room_compositions/{room_composition_id}"
      .replaceAll("\\{" + "room_composition_id" + "\\}", apiClient.escapeString(roomCompositionId.toString()));

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

    GenericType<CreateRoomComposition202Response> localVarReturnType = new GenericType<CreateRoomComposition202Response>() {};

    return apiClient.invokeAPI("RoomCompositionsApi.viewRoomComposition", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
