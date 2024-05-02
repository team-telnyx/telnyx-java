package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.MobileOperatorNetworksGet200Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MobileOperatorNetworksApi {
  private ApiClient apiClient;

  public MobileOperatorNetworksApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MobileOperatorNetworksApi(ApiClient apiClient) {
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
   * List mobile operator networks
   * Telnyx has a set of GSM mobile operators partners that are available through our mobile network roaming. This resource is entirely managed by Telnyx and may change over time. That means that this resource won&#39;t allow any write operations for it. Still, it&#39;s available so it can be used as a support resource that can be related to other resources or become a configuration option.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterNameStartsWith Filter by name starting with. (optional)
   * @param filterNameContains Filter by name containing match. (optional)
   * @param filterNameEndsWith Filter by name ending with. (optional)
   * @param filterCountryCode Filter by exact country_code. (optional)
   * @param filterMcc Filter by exact MCC. (optional)
   * @param filterMnc Filter by exact MNC. (optional)
   * @param filterTadig Filter by exact TADIG. (optional)
   * @return MobileOperatorNetworksGet200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public MobileOperatorNetworksGet200Response mobileOperatorNetworksGet(Integer pageNumber, Integer pageSize, String filterNameStartsWith, String filterNameContains, String filterNameEndsWith, String filterCountryCode, String filterMcc, String filterMnc, String filterTadig) throws ApiException {
    return mobileOperatorNetworksGetWithHttpInfo(pageNumber, pageSize, filterNameStartsWith, filterNameContains, filterNameEndsWith, filterCountryCode, filterMcc, filterMnc, filterTadig).getData();
  }

  /**
   * List mobile operator networks
   * Telnyx has a set of GSM mobile operators partners that are available through our mobile network roaming. This resource is entirely managed by Telnyx and may change over time. That means that this resource won&#39;t allow any write operations for it. Still, it&#39;s available so it can be used as a support resource that can be related to other resources or become a configuration option.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterNameStartsWith Filter by name starting with. (optional)
   * @param filterNameContains Filter by name containing match. (optional)
   * @param filterNameEndsWith Filter by name ending with. (optional)
   * @param filterCountryCode Filter by exact country_code. (optional)
   * @param filterMcc Filter by exact MCC. (optional)
   * @param filterMnc Filter by exact MNC. (optional)
   * @param filterTadig Filter by exact TADIG. (optional)
   * @return ApiResponse&lt;MobileOperatorNetworksGet200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MobileOperatorNetworksGet200Response> mobileOperatorNetworksGetWithHttpInfo(Integer pageNumber, Integer pageSize, String filterNameStartsWith, String filterNameContains, String filterNameEndsWith, String filterCountryCode, String filterMcc, String filterMnc, String filterTadig) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/mobile_operator_networks";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[name][starts_with]", filterNameStartsWith));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[name][contains]", filterNameContains));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[name][ends_with]", filterNameEndsWith));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[country_code]", filterCountryCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[mcc]", filterMcc));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[mnc]", filterMnc));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[tadig]", filterTadig));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<MobileOperatorNetworksGet200Response> localVarReturnType = new GenericType<MobileOperatorNetworksGet200Response>() {};

    return apiClient.invokeAPI("MobileOperatorNetworksApi.mobileOperatorNetworksGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
