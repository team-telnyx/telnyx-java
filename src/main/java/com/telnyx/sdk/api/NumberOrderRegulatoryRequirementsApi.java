package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListNumberOrderRegulatoryRequirementsResponse;
import com.telnyx.sdk.model.ListPhoneNumberRegulatoryRequirementsResponse;
import com.telnyx.sdk.model.NumberOrderRegulatoryRequirementResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NumberOrderRegulatoryRequirementsApi {
  private ApiClient apiClient;

  public NumberOrderRegulatoryRequirementsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NumberOrderRegulatoryRequirementsApi(ApiClient apiClient) {
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


private ApiResponse<ListNumberOrderRegulatoryRequirementsResponse> listNumberOrderRegulatoryRequirementsWithHttpInfo(String filterRequirementId, String filterFieldType, String filterRequirementType, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/regulatory_requirements";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[requirement_id]", filterRequirementId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[field_type]", filterFieldType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[requirement_type]", filterRequirementType));
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

    GenericType<ListNumberOrderRegulatoryRequirementsResponse> localVarReturnType = new GenericType<ListNumberOrderRegulatoryRequirementsResponse>() {};

    return apiClient.invokeAPI("NumberOrderRegulatoryRequirementsApi.listNumberOrderRegulatoryRequirements", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistNumberOrderRegulatoryRequirementsRequest {
    private String filterRequirementId;
    private String filterFieldType;
    private String filterRequirementType;
    private Integer pageNumber;
    private Integer pageSize;

    private APIlistNumberOrderRegulatoryRequirementsRequest() {
    }

    /**
     * Set filterRequirementId
     * @param filterRequirementId Filter number order regulatory requirements by &#x60;requirement_id&#x60;. (optional)
     * @return APIlistNumberOrderRegulatoryRequirementsRequest
     */
    public APIlistNumberOrderRegulatoryRequirementsRequest filterRequirementId(String filterRequirementId) {
      this.filterRequirementId = filterRequirementId;
      return this;
    }

    /**
     * Set filterFieldType
     * @param filterFieldType Filter number order regulatory requirements by &#x60;field_type&#x60;. (optional)
     * @return APIlistNumberOrderRegulatoryRequirementsRequest
     */
    public APIlistNumberOrderRegulatoryRequirementsRequest filterFieldType(String filterFieldType) {
      this.filterFieldType = filterFieldType;
      return this;
    }

    /**
     * Set filterRequirementType
     * @param filterRequirementType Filter number order regulatory requirements by &#x60;requirement_type&#x60;. (optional)
     * @return APIlistNumberOrderRegulatoryRequirementsRequest
     */
    public APIlistNumberOrderRegulatoryRequirementsRequest filterRequirementType(String filterRequirementType) {
      this.filterRequirementType = filterRequirementType;
      return this;
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load (optional, default to 1)
     * @return APIlistNumberOrderRegulatoryRequirementsRequest
     */
    public APIlistNumberOrderRegulatoryRequirementsRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page (optional, default to 50)
     * @return APIlistNumberOrderRegulatoryRequirementsRequest
     */
    public APIlistNumberOrderRegulatoryRequirementsRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Execute listNumberOrderRegulatoryRequirements request
     * @return ListNumberOrderRegulatoryRequirementsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of number order regulatory requirements. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Bad Request </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListNumberOrderRegulatoryRequirementsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listNumberOrderRegulatoryRequirements request with HTTP info returned
     * @return ApiResponse&lt;ListNumberOrderRegulatoryRequirementsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of number order regulatory requirements. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Bad Request </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListNumberOrderRegulatoryRequirementsResponse> executeWithHttpInfo() throws ApiException {
      return listNumberOrderRegulatoryRequirementsWithHttpInfo(filterRequirementId, filterFieldType, filterRequirementType, pageNumber, pageSize);
    }
  }

  /**
   * List number order regulatory requirements
   * Gets a paginated list of number order regulatory requirements.
   * @return listNumberOrderRegulatoryRequirementsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistNumberOrderRegulatoryRequirementsRequest listNumberOrderRegulatoryRequirements() throws ApiException {
    return new APIlistNumberOrderRegulatoryRequirementsRequest();
  }

private ApiResponse<ListPhoneNumberRegulatoryRequirementsResponse> listPhoneNumberRegulatoryRequirementsWithHttpInfo(List<String> filterPhoneNumber, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/phone_numbers_regulatory_requirements";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[phone_number]", filterPhoneNumber));
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

    GenericType<ListPhoneNumberRegulatoryRequirementsResponse> localVarReturnType = new GenericType<ListPhoneNumberRegulatoryRequirementsResponse>() {};

    return apiClient.invokeAPI("NumberOrderRegulatoryRequirementsApi.listPhoneNumberRegulatoryRequirements", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistPhoneNumberRegulatoryRequirementsRequest {
    private List<String> filterPhoneNumber;
    private Integer pageNumber;
    private Integer pageSize;

    private APIlistPhoneNumberRegulatoryRequirementsRequest() {
    }

    /**
     * Set filterPhoneNumber
     * @param filterPhoneNumber The list of phone numbers to retrieve regulatory requirements for. (optional)
     * @return APIlistPhoneNumberRegulatoryRequirementsRequest
     */
    public APIlistPhoneNumberRegulatoryRequirementsRequest filterPhoneNumber(List<String> filterPhoneNumber) {
      this.filterPhoneNumber = filterPhoneNumber;
      return this;
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load (optional, default to 1)
     * @return APIlistPhoneNumberRegulatoryRequirementsRequest
     */
    public APIlistPhoneNumberRegulatoryRequirementsRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page (optional, default to 50)
     * @return APIlistPhoneNumberRegulatoryRequirementsRequest
     */
    public APIlistPhoneNumberRegulatoryRequirementsRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Execute listPhoneNumberRegulatoryRequirements request
     * @return ListPhoneNumberRegulatoryRequirementsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of phone number regulatory requirements. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Bad Request </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListPhoneNumberRegulatoryRequirementsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listPhoneNumberRegulatoryRequirements request with HTTP info returned
     * @return ApiResponse&lt;ListPhoneNumberRegulatoryRequirementsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of phone number regulatory requirements. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Bad Request </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListPhoneNumberRegulatoryRequirementsResponse> executeWithHttpInfo() throws ApiException {
      return listPhoneNumberRegulatoryRequirementsWithHttpInfo(filterPhoneNumber, pageNumber, pageSize);
    }
  }

  /**
   * List regulatory requirements per number
   * Gets a paginated list of phone number regulatory requirements.
   * @return listPhoneNumberRegulatoryRequirementsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistPhoneNumberRegulatoryRequirementsRequest listPhoneNumberRegulatoryRequirements() throws ApiException {
    return new APIlistPhoneNumberRegulatoryRequirementsRequest();
  }
  /**
   * Retrieve a number order regulatory requirement
   * Gets a single number order regulatory requirement.
   * @param requirementId The number order regulatory requirement ID. (required)
   * @return NumberOrderRegulatoryRequirementResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a number order regulatory requirement. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public NumberOrderRegulatoryRequirementResponse retrieveNumberOrderRegulatoryRequirement(String requirementId) throws ApiException {
    return retrieveNumberOrderRegulatoryRequirementWithHttpInfo(requirementId).getData();
  }

  /**
   * Retrieve a number order regulatory requirement
   * Gets a single number order regulatory requirement.
   * @param requirementId The number order regulatory requirement ID. (required)
   * @return ApiResponse&lt;NumberOrderRegulatoryRequirementResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a number order regulatory requirement. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NumberOrderRegulatoryRequirementResponse> retrieveNumberOrderRegulatoryRequirementWithHttpInfo(String requirementId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'requirementId' is set
    if (requirementId == null) {
      throw new ApiException(400, "Missing the required parameter 'requirementId' when calling retrieveNumberOrderRegulatoryRequirement");
    }
    
    // create path and map variables
    String localVarPath = "/regulatory_requirements/{requirement_id}"
      .replaceAll("\\{" + "requirement_id" + "\\}", apiClient.escapeString(requirementId.toString()));

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

    GenericType<NumberOrderRegulatoryRequirementResponse> localVarReturnType = new GenericType<NumberOrderRegulatoryRequirementResponse>() {};

    return apiClient.invokeAPI("NumberOrderRegulatoryRequirementsApi.retrieveNumberOrderRegulatoryRequirement", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
