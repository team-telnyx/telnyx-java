package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import java.math.BigDecimal;
import com.telnyx.sdk.model.CdrGetSyncUsageReportResponse;
import java.time.OffsetDateTime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class CdrUsageReportsApi {
  private ApiClient apiClient;

  public CdrUsageReportsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CdrUsageReportsApi(ApiClient apiClient) {
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
   * Generates and fetches CDR Usage Reports
   * Generate and fetch voice usage report synchronously. This endpoint will both generate and fetch the voice report over a specified time period. No polling is necessary but the response may take up to a couple of minutes. 
   * @param aggregationType  (required)
   * @param productBreakdown  (required)
   * @param startDate  (optional)
   * @param endDate  (optional)
   * @param connections  (optional)
   * @return CdrGetSyncUsageReportResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public CdrGetSyncUsageReportResponse getCDRUsageReportSync(String aggregationType, String productBreakdown, OffsetDateTime startDate, OffsetDateTime endDate, List<BigDecimal> connections) throws ApiException {
    return getCDRUsageReportSyncWithHttpInfo(aggregationType, productBreakdown, startDate, endDate, connections).getData();
  }

  /**
   * Generates and fetches CDR Usage Reports
   * Generate and fetch voice usage report synchronously. This endpoint will both generate and fetch the voice report over a specified time period. No polling is necessary but the response may take up to a couple of minutes. 
   * @param aggregationType  (required)
   * @param productBreakdown  (required)
   * @param startDate  (optional)
   * @param endDate  (optional)
   * @param connections  (optional)
   * @return ApiResponse&lt;CdrGetSyncUsageReportResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CdrGetSyncUsageReportResponse> getCDRUsageReportSyncWithHttpInfo(String aggregationType, String productBreakdown, OffsetDateTime startDate, OffsetDateTime endDate, List<BigDecimal> connections) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'aggregationType' is set
    if (aggregationType == null) {
      throw new ApiException(400, "Missing the required parameter 'aggregationType' when calling getCDRUsageReportSync");
    }
    
    // verify the required parameter 'productBreakdown' is set
    if (productBreakdown == null) {
      throw new ApiException(400, "Missing the required parameter 'productBreakdown' when calling getCDRUsageReportSync");
    }
    
    // create path and map variables
    String localVarPath = "/reports/cdr_usage_reports/sync";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "aggregation_type", aggregationType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "product_breakdown", productBreakdown));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "connections", connections));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CdrGetSyncUsageReportResponse> localVarReturnType = new GenericType<CdrGetSyncUsageReportResponse>() {};

    return apiClient.invokeAPI("CdrUsageReportsApi.getCDRUsageReportSync", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
