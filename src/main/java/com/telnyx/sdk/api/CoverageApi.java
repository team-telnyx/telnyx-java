package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.AvailableService;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListNetworkCoverage200Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class CoverageApi {
  private ApiClient apiClient;

  public CoverageApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CoverageApi(ApiClient apiClient) {
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
   * List network coverage locations
   * List all locations and the interfaces that region supports
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filtersAvailableServicesContains The region of associated location to filter on. (optional)
   * @param filterLocationRegion The region of associated location to filter on. (optional)
   * @param filterLocationSite The site of associated location to filter on. (optional)
   * @param filterLocationPop The POP of associated location to filter on. (optional)
   * @param filterLocationCode The code of associated location to filter on. (optional)
   * @return ListNetworkCoverage200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListNetworkCoverage200Response listNetworkCoverage(Integer pageNumber, Integer pageSize, AvailableService filtersAvailableServicesContains, String filterLocationRegion, String filterLocationSite, String filterLocationPop, String filterLocationCode) throws ApiException {
    return listNetworkCoverageWithHttpInfo(pageNumber, pageSize, filtersAvailableServicesContains, filterLocationRegion, filterLocationSite, filterLocationPop, filterLocationCode).getData();
  }

  /**
   * List network coverage locations
   * List all locations and the interfaces that region supports
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filtersAvailableServicesContains The region of associated location to filter on. (optional)
   * @param filterLocationRegion The region of associated location to filter on. (optional)
   * @param filterLocationSite The site of associated location to filter on. (optional)
   * @param filterLocationPop The POP of associated location to filter on. (optional)
   * @param filterLocationCode The code of associated location to filter on. (optional)
   * @return ApiResponse&lt;ListNetworkCoverage200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListNetworkCoverage200Response> listNetworkCoverageWithHttpInfo(Integer pageNumber, Integer pageSize, AvailableService filtersAvailableServicesContains, String filterLocationRegion, String filterLocationSite, String filterLocationPop, String filterLocationCode) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/network_coverage";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filters[available_services][contains]", filtersAvailableServicesContains));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[location.region]", filterLocationRegion));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[location.site]", filterLocationSite));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[location.pop]", filterLocationPop));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[location.code]", filterLocationCode));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListNetworkCoverage200Response> localVarReturnType = new GenericType<ListNetworkCoverage200Response>() {};

    return apiClient.invokeAPI("CoverageApi.listNetworkCoverage", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
