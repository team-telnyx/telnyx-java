package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Error;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.SimCardOrderCreate;
import com.telnyx.sdk.model.SimCardOrdersGet200Response;
import com.telnyx.sdk.model.SimCardOrdersPost200Response;
import com.telnyx.sdk.model.SimCardOrdersPreview202Response;
import com.telnyx.sdk.model.SimCardOrdersPreviewRequest;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SimCardOrdersApi {
  private ApiClient apiClient;

  public SimCardOrdersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SimCardOrdersApi(ApiClient apiClient) {
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
   * Get a single SIM card order
   * Get a single SIM card order by its ID.
   * @param id Identifies the resource. (required)
   * @return SimCardOrdersPost200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SimCardOrdersPost200Response simCardOrderGet(UUID id) throws ApiException {
    return simCardOrderGetWithHttpInfo(id).getData();
  }

  /**
   * Get a single SIM card order
   * Get a single SIM card order by its ID.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;SimCardOrdersPost200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SimCardOrdersPost200Response> simCardOrderGetWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling simCardOrderGet");
    }
    
    // create path and map variables
    String localVarPath = "/sim_card_orders/{id}"
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

    GenericType<SimCardOrdersPost200Response> localVarReturnType = new GenericType<SimCardOrdersPost200Response>() {};

    return apiClient.invokeAPI("SimCardOrdersApi.simCardOrderGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get all SIM card orders
   * Get all SIM card orders according to filters.
   * @param filterCreatedAt Filter by ISO 8601 formatted date-time string matching resource creation date-time. (optional)
   * @param filterUpdatedAt Filter by ISO 8601 formatted date-time string matching resource last update date-time. (optional)
   * @param filterQuantity Filter orders by how many SIM cards were ordered. (optional)
   * @param filterCostAmount The total monetary amount of the order. (optional)
   * @param filterCostCurrency Filter by ISO 4217 currency string. (optional)
   * @param filterAddressId Uniquely identifies the address for the order. (optional)
   * @param filterAddressStreetAddress Returns entries with matching name of the street where the address is located. (optional)
   * @param filterAddressExtendedAddress Returns entries with matching name of the supplemental field for address information. (optional)
   * @param filterAddressLocality Filter by the name of the city where the address is located. (optional)
   * @param filterAddressAdministrativeArea Filter by state or province where the address is located. (optional)
   * @param filterAddressCountryCode Filter by the mobile operator two-character (ISO 3166-1 alpha-2) origin country code. (optional)
   * @param filterAddressPostalCode Filter by postal code for the address. (optional)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return SimCardOrdersGet200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SimCardOrdersGet200Response simCardOrdersGet(String filterCreatedAt, String filterUpdatedAt, Integer filterQuantity, String filterCostAmount, String filterCostCurrency, String filterAddressId, String filterAddressStreetAddress, String filterAddressExtendedAddress, String filterAddressLocality, String filterAddressAdministrativeArea, String filterAddressCountryCode, String filterAddressPostalCode, Integer pageNumber, Integer pageSize) throws ApiException {
    return simCardOrdersGetWithHttpInfo(filterCreatedAt, filterUpdatedAt, filterQuantity, filterCostAmount, filterCostCurrency, filterAddressId, filterAddressStreetAddress, filterAddressExtendedAddress, filterAddressLocality, filterAddressAdministrativeArea, filterAddressCountryCode, filterAddressPostalCode, pageNumber, pageSize).getData();
  }

  /**
   * Get all SIM card orders
   * Get all SIM card orders according to filters.
   * @param filterCreatedAt Filter by ISO 8601 formatted date-time string matching resource creation date-time. (optional)
   * @param filterUpdatedAt Filter by ISO 8601 formatted date-time string matching resource last update date-time. (optional)
   * @param filterQuantity Filter orders by how many SIM cards were ordered. (optional)
   * @param filterCostAmount The total monetary amount of the order. (optional)
   * @param filterCostCurrency Filter by ISO 4217 currency string. (optional)
   * @param filterAddressId Uniquely identifies the address for the order. (optional)
   * @param filterAddressStreetAddress Returns entries with matching name of the street where the address is located. (optional)
   * @param filterAddressExtendedAddress Returns entries with matching name of the supplemental field for address information. (optional)
   * @param filterAddressLocality Filter by the name of the city where the address is located. (optional)
   * @param filterAddressAdministrativeArea Filter by state or province where the address is located. (optional)
   * @param filterAddressCountryCode Filter by the mobile operator two-character (ISO 3166-1 alpha-2) origin country code. (optional)
   * @param filterAddressPostalCode Filter by postal code for the address. (optional)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;SimCardOrdersGet200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SimCardOrdersGet200Response> simCardOrdersGetWithHttpInfo(String filterCreatedAt, String filterUpdatedAt, Integer filterQuantity, String filterCostAmount, String filterCostCurrency, String filterAddressId, String filterAddressStreetAddress, String filterAddressExtendedAddress, String filterAddressLocality, String filterAddressAdministrativeArea, String filterAddressCountryCode, String filterAddressPostalCode, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/sim_card_orders";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[created_at]", filterCreatedAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[updated_at]", filterUpdatedAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[quantity]", filterQuantity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[cost.amount]", filterCostAmount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[cost.currency]", filterCostCurrency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[address.id]", filterAddressId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[address.street_address]", filterAddressStreetAddress));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[address.extended_address]", filterAddressExtendedAddress));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[address.locality]", filterAddressLocality));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[address.administrative_area]", filterAddressAdministrativeArea));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[address.country_code]", filterAddressCountryCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[address.postal_code]", filterAddressPostalCode));
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

    GenericType<SimCardOrdersGet200Response> localVarReturnType = new GenericType<SimCardOrdersGet200Response>() {};

    return apiClient.invokeAPI("SimCardOrdersApi.simCardOrdersGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a SIM card order
   * Creates a new order for SIM cards.
   * @param simCardOrderCreate  (required)
   * @return SimCardOrdersPost200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SimCardOrdersPost200Response simCardOrdersPost(SimCardOrderCreate simCardOrderCreate) throws ApiException {
    return simCardOrdersPostWithHttpInfo(simCardOrderCreate).getData();
  }

  /**
   * Create a SIM card order
   * Creates a new order for SIM cards.
   * @param simCardOrderCreate  (required)
   * @return ApiResponse&lt;SimCardOrdersPost200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SimCardOrdersPost200Response> simCardOrdersPostWithHttpInfo(SimCardOrderCreate simCardOrderCreate) throws ApiException {
    Object localVarPostBody = simCardOrderCreate;
    
    // verify the required parameter 'simCardOrderCreate' is set
    if (simCardOrderCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'simCardOrderCreate' when calling simCardOrdersPost");
    }
    
    // create path and map variables
    String localVarPath = "/sim_card_orders";

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<SimCardOrdersPost200Response> localVarReturnType = new GenericType<SimCardOrdersPost200Response>() {};

    return apiClient.invokeAPI("SimCardOrdersApi.simCardOrdersPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Preview SIM card orders
   * Preview SIM card order purchases.
   * @param simCardOrdersPreviewRequest  (optional)
   * @return SimCardOrdersPreview202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public SimCardOrdersPreview202Response simCardOrdersPreview(SimCardOrdersPreviewRequest simCardOrdersPreviewRequest) throws ApiException {
    return simCardOrdersPreviewWithHttpInfo(simCardOrdersPreviewRequest).getData();
  }

  /**
   * Preview SIM card orders
   * Preview SIM card order purchases.
   * @param simCardOrdersPreviewRequest  (optional)
   * @return ApiResponse&lt;SimCardOrdersPreview202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SimCardOrdersPreview202Response> simCardOrdersPreviewWithHttpInfo(SimCardOrdersPreviewRequest simCardOrdersPreviewRequest) throws ApiException {
    Object localVarPostBody = simCardOrdersPreviewRequest;
    
    // create path and map variables
    String localVarPath = "/sim_card_order_preview";

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<SimCardOrdersPreview202Response> localVarReturnType = new GenericType<SimCardOrdersPreview202Response>() {};

    return apiClient.invokeAPI("SimCardOrdersApi.simCardOrdersPreview", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
