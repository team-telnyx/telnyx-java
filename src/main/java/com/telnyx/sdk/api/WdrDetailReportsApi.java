package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.ExternalWdrGetDetailResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class WdrDetailReportsApi {
  private ApiClient apiClient;

  public WdrDetailReportsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WdrDetailReportsApi(ApiClient apiClient) {
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
   * Fetch all Wdr records 
   * @param startDate Start date (optional)
   * @param endDate End date (optional)
   * @param id  (optional)
   * @param mcc  (optional)
   * @param mnc  (optional)
   * @param imsi  (optional)
   * @param simGroupName  (optional)
   * @param simGroupId  (optional)
   * @param simCardId  (optional)
   * @param phoneNumber  (optional)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Size of the page (optional, default to 20)
   * @param sort  (optional)
   * @return ExternalWdrGetDetailResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public ExternalWdrGetDetailResponse getPaginatedWdrs(String startDate, String endDate, String id, String mcc, String mnc, String imsi, String simGroupName, String simGroupId, String simCardId, String phoneNumber, Integer pageNumber, Integer pageSize, List<String> sort) throws ApiException {
    return getPaginatedWdrsWithHttpInfo(startDate, endDate, id, mcc, mnc, imsi, simGroupName, simGroupId, simCardId, phoneNumber, pageNumber, pageSize, sort).getData();
  }

  /**
   * 
   * Fetch all Wdr records 
   * @param startDate Start date (optional)
   * @param endDate End date (optional)
   * @param id  (optional)
   * @param mcc  (optional)
   * @param mnc  (optional)
   * @param imsi  (optional)
   * @param simGroupName  (optional)
   * @param simGroupId  (optional)
   * @param simCardId  (optional)
   * @param phoneNumber  (optional)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Size of the page (optional, default to 20)
   * @param sort  (optional)
   * @return ApiResponse&lt;ExternalWdrGetDetailResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ExternalWdrGetDetailResponse> getPaginatedWdrsWithHttpInfo(String startDate, String endDate, String id, String mcc, String mnc, String imsi, String simGroupName, String simGroupId, String simCardId, String phoneNumber, Integer pageNumber, Integer pageSize, List<String> sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/reports/wdrs";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mcc", mcc));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mnc", mnc));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "imsi", imsi));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sim_group_name", simGroupName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sim_group_id", simGroupId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sim_card_id", simCardId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "phone_number", phoneNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ExternalWdrGetDetailResponse> localVarReturnType = new GenericType<ExternalWdrGetDetailResponse>() {};

    return apiClient.invokeAPI("WdrDetailReportsApi.getPaginatedWdrs", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
