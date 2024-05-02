package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.GetMobileNetworkOperators200Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class MobileNetworkOperatorsApi {
  private ApiClient apiClient;

  public MobileNetworkOperatorsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MobileNetworkOperatorsApi(ApiClient apiClient) {
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
   * List mobile network operators
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
   * @param filterNetworkPreferencesEnabled Filter by network_preferences_enabled. (optional)
   * @return GetMobileNetworkOperators200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetMobileNetworkOperators200Response getMobileNetworkOperators(Integer pageNumber, Integer pageSize, String filterNameStartsWith, String filterNameContains, String filterNameEndsWith, String filterCountryCode, String filterMcc, String filterMnc, String filterTadig, Boolean filterNetworkPreferencesEnabled) throws ApiException {
    return getMobileNetworkOperatorsWithHttpInfo(pageNumber, pageSize, filterNameStartsWith, filterNameContains, filterNameEndsWith, filterCountryCode, filterMcc, filterMnc, filterTadig, filterNetworkPreferencesEnabled).getData();
  }

  /**
   * List mobile network operators
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
   * @param filterNetworkPreferencesEnabled Filter by network_preferences_enabled. (optional)
   * @return ApiResponse&lt;GetMobileNetworkOperators200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetMobileNetworkOperators200Response> getMobileNetworkOperatorsWithHttpInfo(Integer pageNumber, Integer pageSize, String filterNameStartsWith, String filterNameContains, String filterNameEndsWith, String filterCountryCode, String filterMcc, String filterMnc, String filterTadig, Boolean filterNetworkPreferencesEnabled) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/mobile_network_operators";

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[network_preferences_enabled]", filterNetworkPreferencesEnabled));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<GetMobileNetworkOperators200Response> localVarReturnType = new GenericType<GetMobileNetworkOperators200Response>() {};

    return apiClient.invokeAPI("MobileNetworkOperatorsApi.getMobileNetworkOperators", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
