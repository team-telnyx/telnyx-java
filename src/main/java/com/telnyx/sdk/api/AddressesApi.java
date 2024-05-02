package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.AcceptSuggestionsRequest;
import com.telnyx.sdk.model.AddressCreate;
import com.telnyx.sdk.model.AddressSuggestionResponse;
import com.telnyx.sdk.model.CreateAddress200Response;
import com.telnyx.sdk.model.FindAddresses200Response;
import com.telnyx.sdk.model.ResourceNotFoundError;
import java.util.UUID;
import com.telnyx.sdk.model.ValidateAddressActionResponse;
import com.telnyx.sdk.model.ValidateAddressRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class AddressesApi {
  private ApiClient apiClient;

  public AddressesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AddressesApi(ApiClient apiClient) {
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
   * Accepts this address suggestion as a new emergency address for Operator Connect and finishes the uploads of the numbers associated with it to Microsoft.
   * 
   * @param id The UUID of the address that should be accepted. (required)
   * @param acceptSuggestionsRequest  (optional)
   * @return AddressSuggestionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> This address suggestion has already been accepted. </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> This address suggestion was accepted. The numbers associated to it will resume processing in the background. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Address not found or not accessible by the user. </td><td>  -  </td></tr>
     </table>
   */
  public AddressSuggestionResponse acceptAddressSuggestions(UUID id, AcceptSuggestionsRequest acceptSuggestionsRequest) throws ApiException {
    return acceptAddressSuggestionsWithHttpInfo(id, acceptSuggestionsRequest).getData();
  }

  /**
   * Accepts this address suggestion as a new emergency address for Operator Connect and finishes the uploads of the numbers associated with it to Microsoft.
   * 
   * @param id The UUID of the address that should be accepted. (required)
   * @param acceptSuggestionsRequest  (optional)
   * @return ApiResponse&lt;AddressSuggestionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> This address suggestion has already been accepted. </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> This address suggestion was accepted. The numbers associated to it will resume processing in the background. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Address not found or not accessible by the user. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AddressSuggestionResponse> acceptAddressSuggestionsWithHttpInfo(UUID id, AcceptSuggestionsRequest acceptSuggestionsRequest) throws ApiException {
    Object localVarPostBody = acceptSuggestionsRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling acceptAddressSuggestions");
    }
    
    // create path and map variables
    String localVarPath = "/addresses/{id}/actions/accept_suggestions"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<AddressSuggestionResponse> localVarReturnType = new GenericType<AddressSuggestionResponse>() {};

    return apiClient.invokeAPI("AddressesApi.acceptAddressSuggestions", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Creates an address
   * Creates an address.
   * @param addressCreate Parameters that can be defined during address creation (required)
   * @return CreateAddress200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public CreateAddress200Response createAddress(AddressCreate addressCreate) throws ApiException {
    return createAddressWithHttpInfo(addressCreate).getData();
  }

  /**
   * Creates an address
   * Creates an address.
   * @param addressCreate Parameters that can be defined during address creation (required)
   * @return ApiResponse&lt;CreateAddress200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateAddress200Response> createAddressWithHttpInfo(AddressCreate addressCreate) throws ApiException {
    Object localVarPostBody = addressCreate;
    
    // verify the required parameter 'addressCreate' is set
    if (addressCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'addressCreate' when calling createAddress");
    }
    
    // create path and map variables
    String localVarPath = "/addresses";

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

    GenericType<CreateAddress200Response> localVarReturnType = new GenericType<CreateAddress200Response>() {};

    return apiClient.invokeAPI("AddressesApi.createAddress", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Deletes an address
   * Deletes an existing address.
   * @param id address ID (required)
   * @return CreateAddress200Response
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
  public CreateAddress200Response deleteAddress(String id) throws ApiException {
    return deleteAddressWithHttpInfo(id).getData();
  }

  /**
   * Deletes an address
   * Deletes an existing address.
   * @param id address ID (required)
   * @return ApiResponse&lt;CreateAddress200Response&gt;
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
  public ApiResponse<CreateAddress200Response> deleteAddressWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteAddress");
    }
    
    // create path and map variables
    String localVarPath = "/addresses/{id}"
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

    GenericType<CreateAddress200Response> localVarReturnType = new GenericType<CreateAddress200Response>() {};

    return apiClient.invokeAPI("AddressesApi.deleteAddress", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all addresses
   * Returns a list of your addresses.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterCustomerReferenceEq Filter addresses via the customer reference set. Matching is not case-sensitive. (optional)
   * @param filterCustomerReferenceContains If present, addresses with &lt;code&gt;customer_reference&lt;/code&gt; containing the given value will be returned. Matching is not case-sensitive. (optional)
   * @param filterUsedAsEmergency If set as &#39;true&#39;, only addresses used as the emergency address for at least one active phone-number will be returned. When set to &#39;false&#39;, the opposite happens: only addresses not used as the emergency address from phone-numbers will be returned. (optional, default to null)
   * @param filterStreetAddressContains If present, addresses with &lt;code&gt;street_address&lt;/code&gt; containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters. (optional, default to null)
   * @param filterAddressBookEq If present, only returns results with the &lt;code&gt;address_book&lt;/code&gt; flag set to the given value. (optional, default to null)
   * @param sort Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the &lt;code&gt; -&lt;/code&gt; prefix.&lt;br/&gt;&lt;br/&gt; That is: &lt;ul&gt;   &lt;li&gt;     &lt;code&gt;street_address&lt;/code&gt;: sorts the result by the     &lt;code&gt;street_address&lt;/code&gt; field in ascending order.   &lt;/li&gt;    &lt;li&gt;     &lt;code&gt;-street_address&lt;/code&gt;: sorts the result by the     &lt;code&gt;street_address&lt;/code&gt; field in descending order.   &lt;/li&gt; &lt;/ul&gt; &lt;br/&gt; If not given, results are sorted by &lt;code&gt;created_at&lt;/code&gt; in descending order. (optional, default to created_at)
   * @return FindAddresses200Response
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
  public FindAddresses200Response findAddresses(Integer pageNumber, Integer pageSize, String filterCustomerReferenceEq, String filterCustomerReferenceContains, String filterUsedAsEmergency, String filterStreetAddressContains, String filterAddressBookEq, String sort) throws ApiException {
    return findAddressesWithHttpInfo(pageNumber, pageSize, filterCustomerReferenceEq, filterCustomerReferenceContains, filterUsedAsEmergency, filterStreetAddressContains, filterAddressBookEq, sort).getData();
  }

  /**
   * List all addresses
   * Returns a list of your addresses.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterCustomerReferenceEq Filter addresses via the customer reference set. Matching is not case-sensitive. (optional)
   * @param filterCustomerReferenceContains If present, addresses with &lt;code&gt;customer_reference&lt;/code&gt; containing the given value will be returned. Matching is not case-sensitive. (optional)
   * @param filterUsedAsEmergency If set as &#39;true&#39;, only addresses used as the emergency address for at least one active phone-number will be returned. When set to &#39;false&#39;, the opposite happens: only addresses not used as the emergency address from phone-numbers will be returned. (optional, default to null)
   * @param filterStreetAddressContains If present, addresses with &lt;code&gt;street_address&lt;/code&gt; containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters. (optional, default to null)
   * @param filterAddressBookEq If present, only returns results with the &lt;code&gt;address_book&lt;/code&gt; flag set to the given value. (optional, default to null)
   * @param sort Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the &lt;code&gt; -&lt;/code&gt; prefix.&lt;br/&gt;&lt;br/&gt; That is: &lt;ul&gt;   &lt;li&gt;     &lt;code&gt;street_address&lt;/code&gt;: sorts the result by the     &lt;code&gt;street_address&lt;/code&gt; field in ascending order.   &lt;/li&gt;    &lt;li&gt;     &lt;code&gt;-street_address&lt;/code&gt;: sorts the result by the     &lt;code&gt;street_address&lt;/code&gt; field in descending order.   &lt;/li&gt; &lt;/ul&gt; &lt;br/&gt; If not given, results are sorted by &lt;code&gt;created_at&lt;/code&gt; in descending order. (optional, default to created_at)
   * @return ApiResponse&lt;FindAddresses200Response&gt;
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
  public ApiResponse<FindAddresses200Response> findAddressesWithHttpInfo(Integer pageNumber, Integer pageSize, String filterCustomerReferenceEq, String filterCustomerReferenceContains, String filterUsedAsEmergency, String filterStreetAddressContains, String filterAddressBookEq, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/addresses";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[customer_reference][eq]", filterCustomerReferenceEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[customer_reference][contains]", filterCustomerReferenceContains));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[used_as_emergency]", filterUsedAsEmergency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[street_address][contains]", filterStreetAddressContains));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[address_book][eq]", filterAddressBookEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<FindAddresses200Response> localVarReturnType = new GenericType<FindAddresses200Response>() {};

    return apiClient.invokeAPI("AddressesApi.findAddresses", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve an address
   * Retrieves the details of an existing address.
   * @param id address ID (required)
   * @return CreateAddress200Response
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
  public CreateAddress200Response getAddress(String id) throws ApiException {
    return getAddressWithHttpInfo(id).getData();
  }

  /**
   * Retrieve an address
   * Retrieves the details of an existing address.
   * @param id address ID (required)
   * @return ApiResponse&lt;CreateAddress200Response&gt;
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
  public ApiResponse<CreateAddress200Response> getAddressWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getAddress");
    }
    
    // create path and map variables
    String localVarPath = "/addresses/{id}"
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

    GenericType<CreateAddress200Response> localVarReturnType = new GenericType<CreateAddress200Response>() {};

    return apiClient.invokeAPI("AddressesApi.getAddress", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Validate an address
   * Validates an address for emergency services.
   * @param validateAddressRequest Parameters that can be defined during address validation (required)
   * @return ValidateAddressActionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Action response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ValidateAddressActionResponse validateAddress(ValidateAddressRequest validateAddressRequest) throws ApiException {
    return validateAddressWithHttpInfo(validateAddressRequest).getData();
  }

  /**
   * Validate an address
   * Validates an address for emergency services.
   * @param validateAddressRequest Parameters that can be defined during address validation (required)
   * @return ApiResponse&lt;ValidateAddressActionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Action response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ValidateAddressActionResponse> validateAddressWithHttpInfo(ValidateAddressRequest validateAddressRequest) throws ApiException {
    Object localVarPostBody = validateAddressRequest;
    
    // verify the required parameter 'validateAddressRequest' is set
    if (validateAddressRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'validateAddressRequest' when calling validateAddress");
    }
    
    // create path and map variables
    String localVarPath = "/addresses/actions/validate";

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

    GenericType<ValidateAddressActionResponse> localVarReturnType = new GenericType<ValidateAddressActionResponse>() {};

    return apiClient.invokeAPI("AddressesApi.validateAddress", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
