package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateUserAddress200Response;
import com.telnyx.sdk.model.FindUserAddress200Response;
import com.telnyx.sdk.model.UserAddressCreate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class UserAddressesApi {
  private ApiClient apiClient;

  public UserAddressesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UserAddressesApi(ApiClient apiClient) {
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
   * Creates a user address
   * Creates a user address.
   * @param userAddressCreate Parameters that can be defined during user address creation (required)
   * @return CreateUserAddress200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public CreateUserAddress200Response createUserAddress(UserAddressCreate userAddressCreate) throws ApiException {
    return createUserAddressWithHttpInfo(userAddressCreate).getData();
  }

  /**
   * Creates a user address
   * Creates a user address.
   * @param userAddressCreate Parameters that can be defined during user address creation (required)
   * @return ApiResponse&lt;CreateUserAddress200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateUserAddress200Response> createUserAddressWithHttpInfo(UserAddressCreate userAddressCreate) throws ApiException {
    Object localVarPostBody = userAddressCreate;
    
    // verify the required parameter 'userAddressCreate' is set
    if (userAddressCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'userAddressCreate' when calling createUserAddress");
    }
    
    // create path and map variables
    String localVarPath = "/user_addresses";

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

    GenericType<CreateUserAddress200Response> localVarReturnType = new GenericType<CreateUserAddress200Response>() {};

    return apiClient.invokeAPI("UserAddressesApi.createUserAddress", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all user addresses
   * Returns a list of your user addresses.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterCustomerReferenceEq Filter addresses via the customer reference set. Matching is not case-sensitive. (optional)
   * @param filterCustomerReferenceContains If present, addresses with &lt;code&gt;customer_reference&lt;/code&gt; containing the given value will be returned. Matching is not case-sensitive. (optional)
   * @param filterStreetAddressContains If present, addresses with &lt;code&gt;street_address&lt;/code&gt; containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters. (optional, default to null)
   * @param sort Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the &lt;code&gt; -&lt;/code&gt; prefix.&lt;br/&gt;&lt;br/&gt; That is: &lt;ul&gt;   &lt;li&gt;     &lt;code&gt;street_address&lt;/code&gt;: sorts the result by the     &lt;code&gt;street_address&lt;/code&gt; field in ascending order.   &lt;/li&gt;    &lt;li&gt;     &lt;code&gt;-street_address&lt;/code&gt;: sorts the result by the     &lt;code&gt;street_address&lt;/code&gt; field in descending order.   &lt;/li&gt; &lt;/ul&gt; &lt;br/&gt; If not given, results are sorted by &lt;code&gt;created_at&lt;/code&gt; in descending order. (optional, default to created_at)
   * @return FindUserAddress200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public FindUserAddress200Response findUserAddress(Integer pageNumber, Integer pageSize, String filterCustomerReferenceEq, String filterCustomerReferenceContains, String filterStreetAddressContains, String sort) throws ApiException {
    return findUserAddressWithHttpInfo(pageNumber, pageSize, filterCustomerReferenceEq, filterCustomerReferenceContains, filterStreetAddressContains, sort).getData();
  }

  /**
   * List all user addresses
   * Returns a list of your user addresses.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterCustomerReferenceEq Filter addresses via the customer reference set. Matching is not case-sensitive. (optional)
   * @param filterCustomerReferenceContains If present, addresses with &lt;code&gt;customer_reference&lt;/code&gt; containing the given value will be returned. Matching is not case-sensitive. (optional)
   * @param filterStreetAddressContains If present, addresses with &lt;code&gt;street_address&lt;/code&gt; containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters. (optional, default to null)
   * @param sort Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the &lt;code&gt; -&lt;/code&gt; prefix.&lt;br/&gt;&lt;br/&gt; That is: &lt;ul&gt;   &lt;li&gt;     &lt;code&gt;street_address&lt;/code&gt;: sorts the result by the     &lt;code&gt;street_address&lt;/code&gt; field in ascending order.   &lt;/li&gt;    &lt;li&gt;     &lt;code&gt;-street_address&lt;/code&gt;: sorts the result by the     &lt;code&gt;street_address&lt;/code&gt; field in descending order.   &lt;/li&gt; &lt;/ul&gt; &lt;br/&gt; If not given, results are sorted by &lt;code&gt;created_at&lt;/code&gt; in descending order. (optional, default to created_at)
   * @return ApiResponse&lt;FindUserAddress200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FindUserAddress200Response> findUserAddressWithHttpInfo(Integer pageNumber, Integer pageSize, String filterCustomerReferenceEq, String filterCustomerReferenceContains, String filterStreetAddressContains, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/user_addresses";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[customer_reference][eq]", filterCustomerReferenceEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[customer_reference][contains]", filterCustomerReferenceContains));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[street_address][contains]", filterStreetAddressContains));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<FindUserAddress200Response> localVarReturnType = new GenericType<FindUserAddress200Response>() {};

    return apiClient.invokeAPI("UserAddressesApi.findUserAddress", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a user address
   * Retrieves the details of an existing user address.
   * @param id user address ID (required)
   * @return CreateUserAddress200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public CreateUserAddress200Response getUserAddress(String id) throws ApiException {
    return getUserAddressWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a user address
   * Retrieves the details of an existing user address.
   * @param id user address ID (required)
   * @return ApiResponse&lt;CreateUserAddress200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateUserAddress200Response> getUserAddressWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getUserAddress");
    }
    
    // create path and map variables
    String localVarPath = "/user_addresses/{id}"
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

    GenericType<CreateUserAddress200Response> localVarReturnType = new GenericType<CreateUserAddress200Response>() {};

    return apiClient.invokeAPI("UserAddressesApi.getUserAddress", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
