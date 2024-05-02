package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListRequirements200Response;
import com.telnyx.sdk.model.RetrieveDocumentRequirements200Response;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class RequirementsApi {
  private ApiClient apiClient;

  public RequirementsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RequirementsApi(ApiClient apiClient) {
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
   * List all requirements
   * List all requirements with filtering, sorting, and pagination
   * @param filterCountryCode Filters results to those applying to a 2-character (ISO 3166-1 alpha-2) country code (optional)
   * @param filterPhoneNumberType Filters results to those applying to a specific &#x60;phone_number_type&#x60; (optional)
   * @param filterAction Filters requirements to those applying to a specific action. (optional)
   * @param sort Specifies the sort order for results. If you want to sort by a field in ascending order, include it as a sort parameter. If you want to sort in descending order, prepend a &#x60;-&#x60; in front of the field name. (optional)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ListRequirements200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListRequirements200Response listRequirements(String filterCountryCode, String filterPhoneNumberType, String filterAction, String sort, Integer pageNumber, Integer pageSize) throws ApiException {
    return listRequirementsWithHttpInfo(filterCountryCode, filterPhoneNumberType, filterAction, sort, pageNumber, pageSize).getData();
  }

  /**
   * List all requirements
   * List all requirements with filtering, sorting, and pagination
   * @param filterCountryCode Filters results to those applying to a 2-character (ISO 3166-1 alpha-2) country code (optional)
   * @param filterPhoneNumberType Filters results to those applying to a specific &#x60;phone_number_type&#x60; (optional)
   * @param filterAction Filters requirements to those applying to a specific action. (optional)
   * @param sort Specifies the sort order for results. If you want to sort by a field in ascending order, include it as a sort parameter. If you want to sort in descending order, prepend a &#x60;-&#x60; in front of the field name. (optional)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;ListRequirements200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListRequirements200Response> listRequirementsWithHttpInfo(String filterCountryCode, String filterPhoneNumberType, String filterAction, String sort, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/requirements";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[country_code]", filterCountryCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_number_type]", filterPhoneNumberType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[action]", filterAction));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[]", sort));
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

    GenericType<ListRequirements200Response> localVarReturnType = new GenericType<ListRequirements200Response>() {};

    return apiClient.invokeAPI("RequirementsApi.listRequirements", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a document requirement
   * Retrieve a document requirement record
   * @param id Uniquely identifies the requirement_type record (required)
   * @return RetrieveDocumentRequirements200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveDocumentRequirements200Response retrieveDocumentRequirements(UUID id) throws ApiException {
    return retrieveDocumentRequirementsWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a document requirement
   * Retrieve a document requirement record
   * @param id Uniquely identifies the requirement_type record (required)
   * @return ApiResponse&lt;RetrieveDocumentRequirements200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveDocumentRequirements200Response> retrieveDocumentRequirementsWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retrieveDocumentRequirements");
    }
    
    // create path and map variables
    String localVarPath = "/requirements/{id}"
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

    GenericType<RetrieveDocumentRequirements200Response> localVarReturnType = new GenericType<RetrieveDocumentRequirements200Response>() {};

    return apiClient.invokeAPI("RequirementsApi.retrieveDocumentRequirements", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
