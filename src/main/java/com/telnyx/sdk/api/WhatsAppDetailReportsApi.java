package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Error;
import java.util.UUID;
import com.telnyx.sdk.model.WhatsAppDetailReportResponse;
import com.telnyx.sdk.model.WhatsAppGetAllDetailReportResponse;
import com.telnyx.sdk.model.WhatsAppReportsReq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsAppDetailReportsApi {
  private ApiClient apiClient;

  public WhatsAppDetailReportsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WhatsAppDetailReportsApi(ApiClient apiClient) {
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
   * 
   * Delete generated WhatsApp detail report by id
   * @param id  (required)
   * @return WhatsAppDetailReportResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public WhatsAppDetailReportResponse deleteRequest(UUID id) throws ApiException {
    return deleteRequestWithHttpInfo(id).getData();
  }

  /**
   * 
   * Delete generated WhatsApp detail report by id
   * @param id  (required)
   * @return ApiResponse&lt;WhatsAppDetailReportResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WhatsAppDetailReportResponse> deleteRequestWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteRequest");
    }
    
    // create path and map variables
    String localVarPath = "/whatsapp_detail_record_reports/{id}"
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

    GenericType<WhatsAppDetailReportResponse> localVarReturnType = new GenericType<WhatsAppDetailReportResponse>() {};

    return apiClient.invokeAPI("WhatsAppDetailReportsApi.deleteRequest", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Fetch single whatsapp detail report by id.
   * @param id  (required)
   * @return WhatsAppDetailReportResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public WhatsAppDetailReportResponse getRequest(UUID id) throws ApiException {
    return getRequestWithHttpInfo(id).getData();
  }

  /**
   * 
   * Fetch single whatsapp detail report by id.
   * @param id  (required)
   * @return ApiResponse&lt;WhatsAppDetailReportResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WhatsAppDetailReportResponse> getRequestWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getRequest");
    }
    
    // create path and map variables
    String localVarPath = "/whatsapp_detail_record_reports/{id}"
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

    GenericType<WhatsAppDetailReportResponse> localVarReturnType = new GenericType<WhatsAppDetailReportResponse>() {};

    return apiClient.invokeAPI("WhatsAppDetailReportsApi.getRequest", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Fetch all previous requests for WhatsApp detail reports. WhatsApp detail reports are reports for pulling all WhatsApp records. 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Size of the page (optional, default to 20)
   * @return WhatsAppGetAllDetailReportResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public WhatsAppGetAllDetailReportResponse getRequests(Integer pageNumber, Integer pageSize) throws ApiException {
    return getRequestsWithHttpInfo(pageNumber, pageSize).getData();
  }

  /**
   * 
   * Fetch all previous requests for WhatsApp detail reports. WhatsApp detail reports are reports for pulling all WhatsApp records. 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Size of the page (optional, default to 20)
   * @return ApiResponse&lt;WhatsAppGetAllDetailReportResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WhatsAppGetAllDetailReportResponse> getRequestsWithHttpInfo(Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/whatsapp_detail_record_reports";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<WhatsAppGetAllDetailReportResponse> localVarReturnType = new GenericType<WhatsAppGetAllDetailReportResponse>() {};

    return apiClient.invokeAPI("WhatsAppDetailReportsApi.getRequests", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Submit a request for new WhatsApp detail report. WhatsApp detail report pulls all raw WhatsApp data according to defined filters.
   * @param whatsAppReportsReq WhatsApp detail request data (required)
   * @return WhatsAppDetailReportResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public WhatsAppDetailReportResponse submitRequest(WhatsAppReportsReq whatsAppReportsReq) throws ApiException {
    return submitRequestWithHttpInfo(whatsAppReportsReq).getData();
  }

  /**
   * 
   * Submit a request for new WhatsApp detail report. WhatsApp detail report pulls all raw WhatsApp data according to defined filters.
   * @param whatsAppReportsReq WhatsApp detail request data (required)
   * @return ApiResponse&lt;WhatsAppDetailReportResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WhatsAppDetailReportResponse> submitRequestWithHttpInfo(WhatsAppReportsReq whatsAppReportsReq) throws ApiException {
    Object localVarPostBody = whatsAppReportsReq;
    
    // verify the required parameter 'whatsAppReportsReq' is set
    if (whatsAppReportsReq == null) {
      throw new ApiException(400, "Missing the required parameter 'whatsAppReportsReq' when calling submitRequest");
    }
    
    // create path and map variables
    String localVarPath = "/whatsapp_detail_record_reports";

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

    GenericType<WhatsAppDetailReportResponse> localVarReturnType = new GenericType<WhatsAppDetailReportResponse>() {};

    return apiClient.invokeAPI("WhatsAppDetailReportsApi.submitRequest", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
