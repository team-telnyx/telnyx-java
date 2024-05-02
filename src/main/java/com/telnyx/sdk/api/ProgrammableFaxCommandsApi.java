package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.GetFaxResponse;
import com.telnyx.sdk.model.ListFaxesResponse;
import java.time.OffsetDateTime;
import com.telnyx.sdk.model.RefreshFaxResponse;
import com.telnyx.sdk.model.ResourceNotFound;
import com.telnyx.sdk.model.SendFaxRequest;
import com.telnyx.sdk.model.SendFaxResponse;
import com.telnyx.sdk.model.SuccessfulResponseUponAcceptingCancelFaxCommand;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class ProgrammableFaxCommandsApi {
  private ApiClient apiClient;

  public ProgrammableFaxCommandsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProgrammableFaxCommandsApi(ApiClient apiClient) {
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
   * Cancel a fax
   * Cancel the outbound fax that is in one of the following states: &#x60;queued&#x60;, &#x60;media.processed&#x60;, &#x60;originated&#x60; or &#x60;sending&#x60; 
   * @param id The unique identifier of a fax. (required)
   * @return SuccessfulResponseUponAcceptingCancelFaxCommand
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response upon accepting cancel fax command </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SuccessfulResponseUponAcceptingCancelFaxCommand cancelFax(UUID id) throws ApiException {
    return cancelFaxWithHttpInfo(id).getData();
  }

  /**
   * Cancel a fax
   * Cancel the outbound fax that is in one of the following states: &#x60;queued&#x60;, &#x60;media.processed&#x60;, &#x60;originated&#x60; or &#x60;sending&#x60; 
   * @param id The unique identifier of a fax. (required)
   * @return ApiResponse&lt;SuccessfulResponseUponAcceptingCancelFaxCommand&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response upon accepting cancel fax command </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SuccessfulResponseUponAcceptingCancelFaxCommand> cancelFaxWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling cancelFax");
    }
    
    // create path and map variables
    String localVarPath = "/faxes/{id}/actions/cancel"
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

    GenericType<SuccessfulResponseUponAcceptingCancelFaxCommand> localVarReturnType = new GenericType<SuccessfulResponseUponAcceptingCancelFaxCommand>() {};

    return apiClient.invokeAPI("ProgrammableFaxCommandsApi.cancelFax", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a fax
   * 
   * @param id The unique identifier of a fax. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The resource was deleted successfully. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
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
       <tr><td> 204 </td><td> The resource was deleted successfully. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
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
      "application/json"
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
   * @param filterToEq The phone number, in E.164 format for filtering faxes sent to this number (optional)
   * @param pageSize Number of fax resourcxes for the single page returned (optional)
   * @param pageNumber Number of the page to be retrieved (optional)
   * @return ListFaxesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List faxes response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListFaxesResponse listFaxes(OffsetDateTime filterCreatedAtGte, OffsetDateTime filterCreatedAtGt, OffsetDateTime filterCreatedAtLte, OffsetDateTime filterCreatedAtLt, String filterDirectionEq, String filterFromEq, String filterToEq, Integer pageSize, Integer pageNumber) throws ApiException {
    return listFaxesWithHttpInfo(filterCreatedAtGte, filterCreatedAtGt, filterCreatedAtLte, filterCreatedAtLt, filterDirectionEq, filterFromEq, filterToEq, pageSize, pageNumber).getData();
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
   * @param filterToEq The phone number, in E.164 format for filtering faxes sent to this number (optional)
   * @param pageSize Number of fax resourcxes for the single page returned (optional)
   * @param pageNumber Number of the page to be retrieved (optional)
   * @return ApiResponse&lt;ListFaxesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List faxes response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListFaxesResponse> listFaxesWithHttpInfo(OffsetDateTime filterCreatedAtGte, OffsetDateTime filterCreatedAtGt, OffsetDateTime filterCreatedAtLte, OffsetDateTime filterCreatedAtLt, String filterDirectionEq, String filterFromEq, String filterToEq, Integer pageSize, Integer pageNumber) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[to][eq]", filterToEq));
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

    GenericType<ListFaxesResponse> localVarReturnType = new GenericType<ListFaxesResponse>() {};

    return apiClient.invokeAPI("ProgrammableFaxCommandsApi.listFaxes", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Refresh a fax
   * Refreshes the inbound fax&#39;s media_url when it has expired
   * @param id The unique identifier of a fax. (required)
   * @return RefreshFaxResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Refresh fax response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public RefreshFaxResponse refreshFax(UUID id) throws ApiException {
    return refreshFaxWithHttpInfo(id).getData();
  }

  /**
   * Refresh a fax
   * Refreshes the inbound fax&#39;s media_url when it has expired
   * @param id The unique identifier of a fax. (required)
   * @return ApiResponse&lt;RefreshFaxResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Refresh fax response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RefreshFaxResponse> refreshFaxWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling refreshFax");
    }
    
    // create path and map variables
    String localVarPath = "/faxes/{id}/actions/refresh"
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

    GenericType<RefreshFaxResponse> localVarReturnType = new GenericType<RefreshFaxResponse>() {};

    return apiClient.invokeAPI("ProgrammableFaxCommandsApi.refreshFax", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Send a fax
   * Send a fax. Files have size limits and page count limit validations. If a file is bigger than 50MB or has more than 350 pages it will fail with &#x60;file_size_limit_exceeded&#x60; and &#x60;page_count_limit_exceeded&#x60; respectively.   **Expected Webhooks:**  - &#x60;fax.queued&#x60; - &#x60;fax.media.processed&#x60; - &#x60;fax.sending.started&#x60; - &#x60;fax.delivered&#x60; - &#x60;fax.failed&#x60; 
   * @param sendFaxRequest Send fax request (required)
   * @return SendFaxResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Send fax response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SendFaxResponse sendFax(SendFaxRequest sendFaxRequest) throws ApiException {
    return sendFaxWithHttpInfo(sendFaxRequest).getData();
  }

  /**
   * Send a fax
   * Send a fax. Files have size limits and page count limit validations. If a file is bigger than 50MB or has more than 350 pages it will fail with &#x60;file_size_limit_exceeded&#x60; and &#x60;page_count_limit_exceeded&#x60; respectively.   **Expected Webhooks:**  - &#x60;fax.queued&#x60; - &#x60;fax.media.processed&#x60; - &#x60;fax.sending.started&#x60; - &#x60;fax.delivered&#x60; - &#x60;fax.failed&#x60; 
   * @param sendFaxRequest Send fax request (required)
   * @return ApiResponse&lt;SendFaxResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Send fax response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SendFaxResponse> sendFaxWithHttpInfo(SendFaxRequest sendFaxRequest) throws ApiException {
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
      "application/json", "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<SendFaxResponse> localVarReturnType = new GenericType<SendFaxResponse>() {};

    return apiClient.invokeAPI("ProgrammableFaxCommandsApi.sendFax", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * View a fax
   * 
   * @param id The unique identifier of a fax. (required)
   * @return GetFaxResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Get fax response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetFaxResponse viewFax(UUID id) throws ApiException {
    return viewFaxWithHttpInfo(id).getData();
  }

  /**
   * View a fax
   * 
   * @param id The unique identifier of a fax. (required)
   * @return ApiResponse&lt;GetFaxResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Get fax response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetFaxResponse> viewFaxWithHttpInfo(UUID id) throws ApiException {
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

    GenericType<GetFaxResponse> localVarReturnType = new GenericType<GetFaxResponse>() {};

    return apiClient.invokeAPI("ProgrammableFaxCommandsApi.viewFax", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
