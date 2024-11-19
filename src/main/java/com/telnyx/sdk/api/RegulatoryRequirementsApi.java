package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListRegulatoryRequirements200Response;
import com.telnyx.sdk.model.ListRegulatoryRequirementsPhoneNumbers200Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class RegulatoryRequirementsApi {
  private ApiClient apiClient;

  public RegulatoryRequirementsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RegulatoryRequirementsApi(ApiClient apiClient) {
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
   * Retrieve regulatory requirements
   * 
   * @param filterPhoneNumber Phone number to check requirements for (optional)
   * @param filterRequirementGroupId ID of requirement group to check requirements for (optional)
   * @param filterCountryCode Country code(iso2) to check requirements for (optional)
   * @param filterPhoneNumberType Phone number type to check requirements for (optional)
   * @param filterAction Action to check requirements for (optional)
   * @return ListRegulatoryRequirements200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An array of Regulatory Requirements Responses </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListRegulatoryRequirements200Response listRegulatoryRequirements(String filterPhoneNumber, String filterRequirementGroupId, String filterCountryCode, String filterPhoneNumberType, String filterAction) throws ApiException {
    return listRegulatoryRequirementsWithHttpInfo(filterPhoneNumber, filterRequirementGroupId, filterCountryCode, filterPhoneNumberType, filterAction).getData();
  }

  /**
   * Retrieve regulatory requirements
   * 
   * @param filterPhoneNumber Phone number to check requirements for (optional)
   * @param filterRequirementGroupId ID of requirement group to check requirements for (optional)
   * @param filterCountryCode Country code(iso2) to check requirements for (optional)
   * @param filterPhoneNumberType Phone number type to check requirements for (optional)
   * @param filterAction Action to check requirements for (optional)
   * @return ApiResponse&lt;ListRegulatoryRequirements200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An array of Regulatory Requirements Responses </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListRegulatoryRequirements200Response> listRegulatoryRequirementsWithHttpInfo(String filterPhoneNumber, String filterRequirementGroupId, String filterCountryCode, String filterPhoneNumberType, String filterAction) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/regulatory_requirements";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_number]", filterPhoneNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[requirement_group_id]", filterRequirementGroupId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[country_code]", filterCountryCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_number_type]", filterPhoneNumberType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[action]", filterAction));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListRegulatoryRequirements200Response> localVarReturnType = new GenericType<ListRegulatoryRequirements200Response>() {};

    return apiClient.invokeAPI("RegulatoryRequirementsApi.listRegulatoryRequirements", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve regulatory requirements for a list of phone numbers
   * 
   * @param filterPhoneNumber Record type phone number/ phone numbers (required)
   * @return ListRegulatoryRequirementsPhoneNumbers200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An array of Regulatory Requirements Responses </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListRegulatoryRequirementsPhoneNumbers200Response listRegulatoryRequirementsPhoneNumbers(String filterPhoneNumber) throws ApiException {
    return listRegulatoryRequirementsPhoneNumbersWithHttpInfo(filterPhoneNumber).getData();
  }

  /**
   * Retrieve regulatory requirements for a list of phone numbers
   * 
   * @param filterPhoneNumber Record type phone number/ phone numbers (required)
   * @return ApiResponse&lt;ListRegulatoryRequirementsPhoneNumbers200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> An array of Regulatory Requirements Responses </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListRegulatoryRequirementsPhoneNumbers200Response> listRegulatoryRequirementsPhoneNumbersWithHttpInfo(String filterPhoneNumber) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'filterPhoneNumber' is set
    if (filterPhoneNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'filterPhoneNumber' when calling listRegulatoryRequirementsPhoneNumbers");
    }
    
    // create path and map variables
    String localVarPath = "/phone_numbers_regulatory_requirements";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_number]", filterPhoneNumber));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListRegulatoryRequirementsPhoneNumbers200Response> localVarReturnType = new GenericType<ListRegulatoryRequirementsPhoneNumbers200Response>() {};

    return apiClient.invokeAPI("RegulatoryRequirementsApi.listRegulatoryRequirementsPhoneNumbers", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
