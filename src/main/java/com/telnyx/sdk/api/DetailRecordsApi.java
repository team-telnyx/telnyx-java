package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.DetailRecordsSearchResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DetailRecordsApi {
  private ApiClient apiClient;

  public DetailRecordsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DetailRecordsApi(ApiClient apiClient) {
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
   * 
   * Search for any detail record across the Telnyx Platform
   * @param filterRecordType Filter by the given record type (required)
   * @param filterDateRange Filter by the given user-friendly date range (optional)
   * @param filter Filter records (optional, default to new HashMap&lt;&gt;())
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 20)
   * @param sort Specifies the sort order for results (optional, default to new ArrayList&lt;&gt;())
   * @return DetailRecordsSearchResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public DetailRecordsSearchResponse detailRecordsSearch(String filterRecordType, String filterDateRange, Map<String, Object> filter, Integer pageNumber, Integer pageSize, List<String> sort) throws ApiException {
    return detailRecordsSearchWithHttpInfo(filterRecordType, filterDateRange, filter, pageNumber, pageSize, sort).getData();
  }

  /**
   * 
   * Search for any detail record across the Telnyx Platform
   * @param filterRecordType Filter by the given record type (required)
   * @param filterDateRange Filter by the given user-friendly date range (optional)
   * @param filter Filter records (optional, default to new HashMap&lt;&gt;())
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 20)
   * @param sort Specifies the sort order for results (optional, default to new ArrayList&lt;&gt;())
   * @return ApiResponse&lt;DetailRecordsSearchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DetailRecordsSearchResponse> detailRecordsSearchWithHttpInfo(String filterRecordType, String filterDateRange, Map<String, Object> filter, Integer pageNumber, Integer pageSize, List<String> sort) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'filterRecordType' is set
    if (filterRecordType == null) {
      throw new ApiException(400, "Missing the required parameter 'filterRecordType' when calling detailRecordsSearch");
    }
    
    // create path and map variables
    String localVarPath = "/detail_records";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[record_type]", filterRecordType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[date_range]", filterDateRange));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
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

    GenericType<DetailRecordsSearchResponse> localVarReturnType = new GenericType<DetailRecordsSearchResponse>() {};

    return apiClient.invokeAPI("DetailRecordsApi.detailRecordsSearch", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
