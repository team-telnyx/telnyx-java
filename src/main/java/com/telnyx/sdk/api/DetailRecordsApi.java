package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.DetailRecordsSearchResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class DetailRecordsApi {
  private ApiClient apiClient;

  public DetailRecordsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DetailRecordsApi(ApiClient apiClient) {
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
   * Search detail records
   * Search for any detail record across the Telnyx Platform
   * @param filterRecordType Filter by the given record type. (required)
   * @param filterDateRange Filter by the given user-friendly date range. You can specify one of the following enum values, or a dynamic one using this format: last_N_days. (optional)
   * @param filter Filter records on a given record attribute and value. &lt;br/&gt;Example: filter[status]&#x3D;delivered (optional)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 20)
   * @param sort Specifies the sort order for results. &lt;br/&gt;Example: sort&#x3D;-created_at (optional)
   * @return DetailRecordsSearchResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public DetailRecordsSearchResponse searchDetailRecords(String filterRecordType, String filterDateRange, Map<String, Object> filter, Integer pageNumber, Integer pageSize, List<String> sort) throws ApiException {
    return searchDetailRecordsWithHttpInfo(filterRecordType, filterDateRange, filter, pageNumber, pageSize, sort).getData();
  }

  /**
   * Search detail records
   * Search for any detail record across the Telnyx Platform
   * @param filterRecordType Filter by the given record type. (required)
   * @param filterDateRange Filter by the given user-friendly date range. You can specify one of the following enum values, or a dynamic one using this format: last_N_days. (optional)
   * @param filter Filter records on a given record attribute and value. &lt;br/&gt;Example: filter[status]&#x3D;delivered (optional)
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 20)
   * @param sort Specifies the sort order for results. &lt;br/&gt;Example: sort&#x3D;-created_at (optional)
   * @return ApiResponse&lt;DetailRecordsSearchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DetailRecordsSearchResponse> searchDetailRecordsWithHttpInfo(String filterRecordType, String filterDateRange, Map<String, Object> filter, Integer pageNumber, Integer pageSize, List<String> sort) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'filterRecordType' is set
    if (filterRecordType == null) {
      throw new ApiException(400, "Missing the required parameter 'filterRecordType' when calling searchDetailRecords");
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

    return apiClient.invokeAPI("DetailRecordsApi.searchDetailRecords", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
