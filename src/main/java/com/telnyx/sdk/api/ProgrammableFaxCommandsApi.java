package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.InlineResponse2001;
import com.telnyx.sdk.model.InlineResponse202;
import java.time.OffsetDateTime;
import com.telnyx.sdk.model.SendFaxRequest;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProgrammableFaxCommandsApi {
  private ApiClient apiClient;

  public ProgrammableFaxCommandsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProgrammableFaxCommandsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API cilent
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API cilent
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Delete a fax
   * 
   * @param id The unique identifier of a fax. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The resource was deleted successfully. </td><td>  -  </td></tr>
     </table>
   */
  public void deleteFax(UUID id) throws ApiException {
    deleteFaxWithHttpInfo(id);
  }

  /**
   * Delete a fax
   * 
   * @param id The unique identifier of a fax. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The resource was deleted successfully. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteFaxWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteFax");
    }
    
    // create path and map variables
    String localVarPath = "/faxes/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    return apiClient.invokeAPI("ProgrammableFaxCommandsApi.deleteFax", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * View a list of faxes
   * 
   * @param filterCreatedAtGte ISO 8601 date time for filtering faxes created after or on that date (optional)
   * @param filterCreatedAtGt ISO 8601 date time for filtering faxes created after that date (optional)
   * @param filterCreatedAtLte ISO 8601 formatted date time for filtering faxes created on or before that date (optional)
   * @param filterCreatedAtLt ISO 8601 formatted date time for filtering faxes created before that date (optional)
   * @param filterDirectionEq The direction, inbound or outbound, for filtering faxes sent from this account (optional)
   * @param filterFromEq The phone number, in E.164 format for filtering faxes sent from this number (optional)
   * @param pageSize Number of fax resourcxes for the single page returned (optional)
   * @param pageNumber Number of the page to be retrieved (optional)
   * @return InlineResponse2001
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List faxes response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse2001 listFaxes(OffsetDateTime filterCreatedAtGte, OffsetDateTime filterCreatedAtGt, OffsetDateTime filterCreatedAtLte, OffsetDateTime filterCreatedAtLt, String filterDirectionEq, String filterFromEq, Integer pageSize, Integer pageNumber) throws ApiException {
    return listFaxesWithHttpInfo(filterCreatedAtGte, filterCreatedAtGt, filterCreatedAtLte, filterCreatedAtLt, filterDirectionEq, filterFromEq, pageSize, pageNumber).getData();
  }

  /**
   * View a list of faxes
   * 
   * @param filterCreatedAtGte ISO 8601 date time for filtering faxes created after or on that date (optional)
   * @param filterCreatedAtGt ISO 8601 date time for filtering faxes created after that date (optional)
   * @param filterCreatedAtLte ISO 8601 formatted date time for filtering faxes created on or before that date (optional)
   * @param filterCreatedAtLt ISO 8601 formatted date time for filtering faxes created before that date (optional)
   * @param filterDirectionEq The direction, inbound or outbound, for filtering faxes sent from this account (optional)
   * @param filterFromEq The phone number, in E.164 format for filtering faxes sent from this number (optional)
   * @param pageSize Number of fax resourcxes for the single page returned (optional)
   * @param pageNumber Number of the page to be retrieved (optional)
   * @return ApiResponse&lt;InlineResponse2001&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List faxes response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse2001> listFaxesWithHttpInfo(OffsetDateTime filterCreatedAtGte, OffsetDateTime filterCreatedAtGt, OffsetDateTime filterCreatedAtLte, OffsetDateTime filterCreatedAtLt, String filterDirectionEq, String filterFromEq, Integer pageSize, Integer pageNumber) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/faxes";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[created_at][gte]", filterCreatedAtGte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[created_at][gt]", filterCreatedAtGt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[created_at][lte]", filterCreatedAtLte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[created_at][lt]", filterCreatedAtLt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[direction][eq]", filterDirectionEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[from][eq]", filterFromEq));
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

    GenericType<InlineResponse2001> localVarReturnType = new GenericType<InlineResponse2001>() {};

    return apiClient.invokeAPI("ProgrammableFaxCommandsApi.listFaxes", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Send a fax
   * 
   * @param sendFaxRequest Send fax request (required)
   * @return InlineResponse202
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Send fax response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse202 sendFax(SendFaxRequest sendFaxRequest) throws ApiException {
    return sendFaxWithHttpInfo(sendFaxRequest).getData();
  }

  /**
   * Send a fax
   * 
   * @param sendFaxRequest Send fax request (required)
   * @return ApiResponse&lt;InlineResponse202&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Send fax response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse202> sendFaxWithHttpInfo(SendFaxRequest sendFaxRequest) throws ApiException {
    Object localVarPostBody = sendFaxRequest;
    
    // verify the required parameter 'sendFaxRequest' is set
    if (sendFaxRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'sendFaxRequest' when calling sendFax");
    }
    
    // create path and map variables
    String localVarPath = "/faxes";

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

    GenericType<InlineResponse202> localVarReturnType = new GenericType<InlineResponse202>() {};

    return apiClient.invokeAPI("ProgrammableFaxCommandsApi.sendFax", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * View a fax
   * 
   * @param id The unique identifier of a fax. (required)
   * @return InlineResponse202
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Get fax response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public InlineResponse202 viewFax(UUID id) throws ApiException {
    return viewFaxWithHttpInfo(id).getData();
  }

  /**
   * View a fax
   * 
   * @param id The unique identifier of a fax. (required)
   * @return ApiResponse&lt;InlineResponse202&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Get fax response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InlineResponse202> viewFaxWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling viewFax");
    }
    
    // create path and map variables
    String localVarPath = "/faxes/{id}"
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

    GenericType<InlineResponse202> localVarReturnType = new GenericType<InlineResponse202>() {};

    return apiClient.invokeAPI("ProgrammableFaxCommandsApi.viewFax", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
