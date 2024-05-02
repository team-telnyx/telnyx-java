package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateInventoryCoverage200Response;
import com.telnyx.sdk.model.Errors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class InventoryLevelApi {
  private ApiClient apiClient;

  public InventoryLevelApi() {
    this(Configuration.getDefaultApiClient());
  }

  public InventoryLevelApi(ApiClient apiClient) {
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
   * Create an inventory coverage request
   * Creates an inventory coverage request. If locality, npa or national_destination_code is used in groupBy, and no region or locality filters are used, the whole paginated set is returned.
   * @param filterGroupBy  (required)
   * @param filterNpa  (optional)
   * @param filterNxx  (optional)
   * @param filterAdministrativeArea  (optional)
   * @param filterPhoneNumberType  (optional)
   * @param filterCountryCode  (optional)
   * @param filterCount  (optional)
   * @param filterFeatures Filter if the phone number should be used for voice, fax, mms, sms, emergency. Returns features in the response when used. (optional)
   * @return CreateInventoryCoverage200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with a list of inventory coverage levels </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateInventoryCoverage200Response createInventoryCoverage(String filterGroupBy, Integer filterNpa, Integer filterNxx, String filterAdministrativeArea, String filterPhoneNumberType, String filterCountryCode, Boolean filterCount, List<String> filterFeatures) throws ApiException {
    return createInventoryCoverageWithHttpInfo(filterGroupBy, filterNpa, filterNxx, filterAdministrativeArea, filterPhoneNumberType, filterCountryCode, filterCount, filterFeatures).getData();
  }

  /**
   * Create an inventory coverage request
   * Creates an inventory coverage request. If locality, npa or national_destination_code is used in groupBy, and no region or locality filters are used, the whole paginated set is returned.
   * @param filterGroupBy  (required)
   * @param filterNpa  (optional)
   * @param filterNxx  (optional)
   * @param filterAdministrativeArea  (optional)
   * @param filterPhoneNumberType  (optional)
   * @param filterCountryCode  (optional)
   * @param filterCount  (optional)
   * @param filterFeatures Filter if the phone number should be used for voice, fax, mms, sms, emergency. Returns features in the response when used. (optional)
   * @return ApiResponse&lt;CreateInventoryCoverage200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with a list of inventory coverage levels </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateInventoryCoverage200Response> createInventoryCoverageWithHttpInfo(String filterGroupBy, Integer filterNpa, Integer filterNxx, String filterAdministrativeArea, String filterPhoneNumberType, String filterCountryCode, Boolean filterCount, List<String> filterFeatures) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'filterGroupBy' is set
    if (filterGroupBy == null) {
      throw new ApiException(400, "Missing the required parameter 'filterGroupBy' when calling createInventoryCoverage");
    }
    
    // create path and map variables
    String localVarPath = "/inventory_coverage";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[npa]", filterNpa));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[nxx]", filterNxx));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[administrative_area]", filterAdministrativeArea));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_number_type]", filterPhoneNumberType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[country_code]", filterCountryCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[count]", filterCount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[features]", filterFeatures));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[groupBy]", filterGroupBy));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CreateInventoryCoverage200Response> localVarReturnType = new GenericType<CreateInventoryCoverage200Response>() {};

    return apiClient.invokeAPI("InventoryLevelApi.createInventoryCoverage", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
