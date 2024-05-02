package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.MdrDeleteUsageReportsResponse;
import com.telnyx.sdk.model.MdrGetSyncUsageReportResponse;
import com.telnyx.sdk.model.MdrGetUsageReportsByIdResponse;
import com.telnyx.sdk.model.MdrGetUsageReportsResponse;
import com.telnyx.sdk.model.MdrPostUsageReportRequest;
import com.telnyx.sdk.model.MdrPostUsageReportsResponse;
import java.time.OffsetDateTime;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class MdrUsageReportsApi {
  private ApiClient apiClient;

  public MdrUsageReportsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MdrUsageReportsApi(ApiClient apiClient) {
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
   * Delete messaging usage report by id
   * @param id  (required)
   * @return MdrDeleteUsageReportsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public MdrDeleteUsageReportsResponse deleteUsageReport(UUID id) throws ApiException {
    return deleteUsageReportWithHttpInfo(id).getData();
  }

  /**
   * 
   * Delete messaging usage report by id
   * @param id  (required)
   * @return ApiResponse&lt;MdrDeleteUsageReportsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MdrDeleteUsageReportsResponse> deleteUsageReportWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteUsageReport");
    }
    
    // create path and map variables
    String localVarPath = "/reports/mdr_usage_reports/{id}"
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

    GenericType<MdrDeleteUsageReportsResponse> localVarReturnType = new GenericType<MdrDeleteUsageReportsResponse>() {};

    return apiClient.invokeAPI("MdrUsageReportsApi.deleteUsageReport", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Fetch a single messaging usage report by id
   * @param id  (required)
   * @return MdrGetUsageReportsByIdResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public MdrGetUsageReportsByIdResponse getUsageReport(UUID id) throws ApiException {
    return getUsageReportWithHttpInfo(id).getData();
  }

  /**
   * 
   * Fetch a single messaging usage report by id
   * @param id  (required)
   * @return ApiResponse&lt;MdrGetUsageReportsByIdResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MdrGetUsageReportsByIdResponse> getUsageReportWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getUsageReport");
    }
    
    // create path and map variables
    String localVarPath = "/reports/mdr_usage_reports/{id}"
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

    GenericType<MdrGetUsageReportsByIdResponse> localVarReturnType = new GenericType<MdrGetUsageReportsByIdResponse>() {};

    return apiClient.invokeAPI("MdrUsageReportsApi.getUsageReport", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Generate and fetch messaging usage report synchronously. This endpoint will both generate and fetch the messaging report over a specified time period. No polling is necessary but the response may take up to a couple of minutes. 
   * @param aggregationType  (required)
   * @param startDate  (optional)
   * @param endDate  (optional)
   * @param profiles  (optional)
   * @return MdrGetSyncUsageReportResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public MdrGetSyncUsageReportResponse getUsageReportSync(String aggregationType, OffsetDateTime startDate, OffsetDateTime endDate, List<String> profiles) throws ApiException {
    return getUsageReportSyncWithHttpInfo(aggregationType, startDate, endDate, profiles).getData();
  }

  /**
   * 
   * Generate and fetch messaging usage report synchronously. This endpoint will both generate and fetch the messaging report over a specified time period. No polling is necessary but the response may take up to a couple of minutes. 
   * @param aggregationType  (required)
   * @param startDate  (optional)
   * @param endDate  (optional)
   * @param profiles  (optional)
   * @return ApiResponse&lt;MdrGetSyncUsageReportResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MdrGetSyncUsageReportResponse> getUsageReportSyncWithHttpInfo(String aggregationType, OffsetDateTime startDate, OffsetDateTime endDate, List<String> profiles) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'aggregationType' is set
    if (aggregationType == null) {
      throw new ApiException(400, "Missing the required parameter 'aggregationType' when calling getUsageReportSync");
    }
    
    // create path and map variables
    String localVarPath = "/reports/mdr_usage_reports/sync";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "aggregation_type", aggregationType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "profiles", profiles));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<MdrGetSyncUsageReportResponse> localVarReturnType = new GenericType<MdrGetSyncUsageReportResponse>() {};

    return apiClient.invokeAPI("MdrUsageReportsApi.getUsageReportSync", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Fetch all messaging usage reports. Usage reports are aggregated messaging data for specified time period and breakdown
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Size of the page (optional, default to 20)
   * @return MdrGetUsageReportsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public MdrGetUsageReportsResponse getUsageReports(Integer pageNumber, Integer pageSize) throws ApiException {
    return getUsageReportsWithHttpInfo(pageNumber, pageSize).getData();
  }

  /**
   * 
   * Fetch all messaging usage reports. Usage reports are aggregated messaging data for specified time period and breakdown
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Size of the page (optional, default to 20)
   * @return ApiResponse&lt;MdrGetUsageReportsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MdrGetUsageReportsResponse> getUsageReportsWithHttpInfo(Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/reports/mdr_usage_reports";

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

    GenericType<MdrGetUsageReportsResponse> localVarReturnType = new GenericType<MdrGetUsageReportsResponse>() {};

    return apiClient.invokeAPI("MdrUsageReportsApi.getUsageReports", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Submit request for new new messaging usage report. This endpoint will pull and aggregate messaging data in specified time period. 
   * @param mdrPostUsageReportRequest Mdr usage report data (required)
   * @return MdrPostUsageReportsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public MdrPostUsageReportsResponse submitUsageReport(MdrPostUsageReportRequest mdrPostUsageReportRequest) throws ApiException {
    return submitUsageReportWithHttpInfo(mdrPostUsageReportRequest).getData();
  }

  /**
   * 
   * Submit request for new new messaging usage report. This endpoint will pull and aggregate messaging data in specified time period. 
   * @param mdrPostUsageReportRequest Mdr usage report data (required)
   * @return ApiResponse&lt;MdrPostUsageReportsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MdrPostUsageReportsResponse> submitUsageReportWithHttpInfo(MdrPostUsageReportRequest mdrPostUsageReportRequest) throws ApiException {
    Object localVarPostBody = mdrPostUsageReportRequest;
    
    // verify the required parameter 'mdrPostUsageReportRequest' is set
    if (mdrPostUsageReportRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'mdrPostUsageReportRequest' when calling submitUsageReport");
    }
    
    // create path and map variables
    String localVarPath = "/reports/mdr_usage_reports";

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

    GenericType<MdrPostUsageReportsResponse> localVarReturnType = new GenericType<MdrPostUsageReportsResponse>() {};

    return apiClient.invokeAPI("MdrUsageReportsApi.submitUsageReport", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
