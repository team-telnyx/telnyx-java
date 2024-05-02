package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import java.time.OffsetDateTime;
import com.telnyx.sdk.model.WhatsAppUsageAggregationsResponseContainer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsAppUsageAggregationsApi {
  private ApiClient apiClient;

  public WhatsAppUsageAggregationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WhatsAppUsageAggregationsApi(ApiClient apiClient) {
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
   * Generate and fetch WhatsApp usage aggregations synchronously. This endpoint will both generate and fetch the WhatsApp aggregations over a specified time period. 
   * @param startDate  (optional)
   * @param endDate  (optional)
   * @return WhatsAppUsageAggregationsResponseContainer
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public WhatsAppUsageAggregationsResponseContainer getUsageAggregationsSync(OffsetDateTime startDate, OffsetDateTime endDate) throws ApiException {
    return getUsageAggregationsSyncWithHttpInfo(startDate, endDate).getData();
  }

  /**
   * 
   * Generate and fetch WhatsApp usage aggregations synchronously. This endpoint will both generate and fetch the WhatsApp aggregations over a specified time period. 
   * @param startDate  (optional)
   * @param endDate  (optional)
   * @return ApiResponse&lt;WhatsAppUsageAggregationsResponseContainer&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WhatsAppUsageAggregationsResponseContainer> getUsageAggregationsSyncWithHttpInfo(OffsetDateTime startDate, OffsetDateTime endDate) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/whatsapp_usage_aggregations";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date", endDate));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<WhatsAppUsageAggregationsResponseContainer> localVarReturnType = new GenericType<WhatsAppUsageAggregationsResponseContainer>() {};

    return apiClient.invokeAPI("WhatsAppUsageAggregationsApi.getUsageAggregationsSync", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
