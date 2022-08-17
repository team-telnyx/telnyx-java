package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.DocReqsListRequirementTypes200Response;
import com.telnyx.sdk.model.DocReqsRetrieveRequirementType200Response;
import com.telnyx.sdk.model.Errors;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RequirementTypesApi {
  private ApiClient apiClient;

  public RequirementTypesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RequirementTypesApi(ApiClient apiClient) {
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
   * List all requirement types
   * List all requirement types ordered by created_at descending
   * @param filterNameContains Filters requirement types to those whose name contains a certain string. (optional)
   * @param sort Specifies the sort order for results. If you want to sort by a field in ascending order, include it as a sort parameter. If you want to sort in descending order, prepend a &#x60;-&#x60; in front of the field name. (optional)
   * @return DocReqsListRequirementTypes200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public DocReqsListRequirementTypes200Response docReqsListRequirementTypes(String filterNameContains, String sort) throws ApiException {
    return docReqsListRequirementTypesWithHttpInfo(filterNameContains, sort).getData();
  }

  /**
   * List all requirement types
   * List all requirement types ordered by created_at descending
   * @param filterNameContains Filters requirement types to those whose name contains a certain string. (optional)
   * @param sort Specifies the sort order for results. If you want to sort by a field in ascending order, include it as a sort parameter. If you want to sort in descending order, prepend a &#x60;-&#x60; in front of the field name. (optional)
   * @return ApiResponse&lt;DocReqsListRequirementTypes200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DocReqsListRequirementTypes200Response> docReqsListRequirementTypesWithHttpInfo(String filterNameContains, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/requirement_types";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[name][contains]", filterNameContains));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[]", sort));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<DocReqsListRequirementTypes200Response> localVarReturnType = new GenericType<DocReqsListRequirementTypes200Response>() {};

    return apiClient.invokeAPI("RequirementTypesApi.docReqsListRequirementTypes", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a requirement types
   * Retrieve a requirement type by id
   * @param id Uniquely identifies the requirement_type record (required)
   * @return DocReqsRetrieveRequirementType200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public DocReqsRetrieveRequirementType200Response docReqsRetrieveRequirementType(UUID id) throws ApiException {
    return docReqsRetrieveRequirementTypeWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a requirement types
   * Retrieve a requirement type by id
   * @param id Uniquely identifies the requirement_type record (required)
   * @return ApiResponse&lt;DocReqsRetrieveRequirementType200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DocReqsRetrieveRequirementType200Response> docReqsRetrieveRequirementTypeWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling docReqsRetrieveRequirementType");
    }
    
    // create path and map variables
    String localVarPath = "/requirement_types/{id}"
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

    GenericType<DocReqsRetrieveRequirementType200Response> localVarReturnType = new GenericType<DocReqsRetrieveRequirementType200Response>() {};

    return apiClient.invokeAPI("RequirementTypesApi.docReqsRetrieveRequirementType", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
