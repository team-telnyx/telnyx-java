package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.AssignProfileToCampaignRequest;
import com.telnyx.sdk.model.AssignmentTaskStatusResponse;
import com.telnyx.sdk.model.HTTPValidationError;
import com.telnyx.sdk.model.PhoneNumberStatusResponsePaginated;
import com.telnyx.sdk.model.ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class BulkPhoneNumberCampaignsApi {
  private ApiClient apiClient;

  public BulkPhoneNumberCampaignsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BulkPhoneNumberCampaignsApi(ApiClient apiClient) {
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
   * Get Assignment Task Status
   * Check the status of the task associated with assigning all phone numbers on a messaging profile to a campaign by &#x60;taskId&#x60;.
   * @param taskId  (required)
   * @return AssignmentTaskStatusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public AssignmentTaskStatusResponse getAssignmentTaskStatus(String taskId) throws ApiException {
    return getAssignmentTaskStatusWithHttpInfo(taskId).getData();
  }

  /**
   * Get Assignment Task Status
   * Check the status of the task associated with assigning all phone numbers on a messaging profile to a campaign by &#x60;taskId&#x60;.
   * @param taskId  (required)
   * @return ApiResponse&lt;AssignmentTaskStatusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AssignmentTaskStatusResponse> getAssignmentTaskStatusWithHttpInfo(String taskId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'taskId' is set
    if (taskId == null) {
      throw new ApiException(400, "Missing the required parameter 'taskId' when calling getAssignmentTaskStatus");
    }
    
    // create path and map variables
    String localVarPath = "/phoneNumberAssignmentByProfile/{taskId}"
      .replaceAll("\\{" + "taskId" + "\\}", apiClient.escapeString(taskId.toString()));

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

    GenericType<AssignmentTaskStatusResponse> localVarReturnType = new GenericType<AssignmentTaskStatusResponse>() {};

    return apiClient.invokeAPI("BulkPhoneNumberCampaignsApi.getAssignmentTaskStatus", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Phone Number Status
   * Check the status of the individual phone number/campaign assignments associated with the supplied &#x60;taskId&#x60;.
   * @param taskId  (required)
   * @param recordsPerPage  (optional, default to 20)
   * @param page  (optional, default to 1)
   * @return PhoneNumberStatusResponsePaginated
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public PhoneNumberStatusResponsePaginated getPhoneNumberStatus(String taskId, Object recordsPerPage, Object page) throws ApiException {
    return getPhoneNumberStatusWithHttpInfo(taskId, recordsPerPage, page).getData();
  }

  /**
   * Get Phone Number Status
   * Check the status of the individual phone number/campaign assignments associated with the supplied &#x60;taskId&#x60;.
   * @param taskId  (required)
   * @param recordsPerPage  (optional, default to 20)
   * @param page  (optional, default to 1)
   * @return ApiResponse&lt;PhoneNumberStatusResponsePaginated&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PhoneNumberStatusResponsePaginated> getPhoneNumberStatusWithHttpInfo(String taskId, Object recordsPerPage, Object page) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'taskId' is set
    if (taskId == null) {
      throw new ApiException(400, "Missing the required parameter 'taskId' when calling getPhoneNumberStatus");
    }
    
    // create path and map variables
    String localVarPath = "/phoneNumberAssignmentByProfile/{taskId}/phoneNumbers"
      .replaceAll("\\{" + "taskId" + "\\}", apiClient.escapeString(taskId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recordsPerPage", recordsPerPage));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<PhoneNumberStatusResponsePaginated> localVarReturnType = new GenericType<PhoneNumberStatusResponsePaginated>() {};

    return apiClient.invokeAPI("BulkPhoneNumberCampaignsApi.getPhoneNumberStatus", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Assign Messaging Profile To Campaign
   * This endpoint allows you to link all phone numbers associated with a Messaging Profile to a campaign. **Please note:** if you want to assign phone numbers to a campaign that you did not create with Telnyx 10DLC services, this endpoint allows that provided that you&#39;ve shared the campaign with Telnyx. In this case, only provide the parameter, &#x60;tcrCampaignId&#x60;, and not &#x60;campaignId&#x60;. In all other cases (where the campaign you&#39;re assigning was created with Telnyx 10DLC services), only provide &#x60;campaignId&#x60;, not &#x60;tcrCampaignId&#x60;.
   * @param assignProfileToCampaignRequest  (required)
   * @return ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost postAssignMessagingProfileToCampaign(AssignProfileToCampaignRequest assignProfileToCampaignRequest) throws ApiException {
    return postAssignMessagingProfileToCampaignWithHttpInfo(assignProfileToCampaignRequest).getData();
  }

  /**
   * Assign Messaging Profile To Campaign
   * This endpoint allows you to link all phone numbers associated with a Messaging Profile to a campaign. **Please note:** if you want to assign phone numbers to a campaign that you did not create with Telnyx 10DLC services, this endpoint allows that provided that you&#39;ve shared the campaign with Telnyx. In this case, only provide the parameter, &#x60;tcrCampaignId&#x60;, and not &#x60;campaignId&#x60;. In all other cases (where the campaign you&#39;re assigning was created with Telnyx 10DLC services), only provide &#x60;campaignId&#x60;, not &#x60;tcrCampaignId&#x60;.
   * @param assignProfileToCampaignRequest  (required)
   * @return ApiResponse&lt;ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost> postAssignMessagingProfileToCampaignWithHttpInfo(AssignProfileToCampaignRequest assignProfileToCampaignRequest) throws ApiException {
    Object localVarPostBody = assignProfileToCampaignRequest;
    
    // verify the required parameter 'assignProfileToCampaignRequest' is set
    if (assignProfileToCampaignRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'assignProfileToCampaignRequest' when calling postAssignMessagingProfileToCampaign");
    }
    
    // create path and map variables
    String localVarPath = "/phoneNumberAssignmentByProfile";

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

    GenericType<ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost> localVarReturnType = new GenericType<ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost>() {};

    return apiClient.invokeAPI("BulkPhoneNumberCampaignsApi.postAssignMessagingProfileToCampaign", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
