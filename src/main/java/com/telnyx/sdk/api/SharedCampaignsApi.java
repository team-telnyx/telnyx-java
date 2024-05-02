package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CampaignSharingStatus;
import com.telnyx.sdk.model.HTTPValidationError;
import com.telnyx.sdk.model.SharedCampaignRecordSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class SharedCampaignsApi {
  private ApiClient apiClient;

  public SharedCampaignsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SharedCampaignsApi(ApiClient apiClient) {
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
   * Get Sharing Status
   * 
   * @param campaignId ID of the campaign in question (required)
   * @return Map&lt;String, CampaignSharingStatus&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public Map<String, CampaignSharingStatus> getCampaignSharingStatus(String campaignId) throws ApiException {
    return getCampaignSharingStatusWithHttpInfo(campaignId).getData();
  }

  /**
   * Get Sharing Status
   * 
   * @param campaignId ID of the campaign in question (required)
   * @return ApiResponse&lt;Map&lt;String, CampaignSharingStatus&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Map<String, CampaignSharingStatus>> getCampaignSharingStatusWithHttpInfo(String campaignId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'campaignId' is set
    if (campaignId == null) {
      throw new ApiException(400, "Missing the required parameter 'campaignId' when calling getCampaignSharingStatus");
    }
    
    // create path and map variables
    String localVarPath = "/partnerCampaign/{campaignId}/sharing"
      .replaceAll("\\{" + "campaignId" + "\\}", apiClient.escapeString(campaignId.toString()));

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

    GenericType<Map<String, CampaignSharingStatus>> localVarReturnType = new GenericType<Map<String, CampaignSharingStatus>>() {};

    return apiClient.invokeAPI("SharedCampaignsApi.getCampaignSharingStatus", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Partner Campaigns Shared By User
   * Get all partner campaigns you have shared to Telnyx in a paginated fashion  This endpoint is currently limited to only returning shared campaigns that Telnyx has accepted. In other words, shared but pending campaigns are currently omitted from the response from this endpoint.
   * @param page The 1-indexed page number to get. The default value is &#x60;1&#x60;. (optional, default to 1)
   * @param recordsPerPage The amount of records per page, limited to between 1 and 500 inclusive. The default value is &#x60;10&#x60;. (optional, default to 10)
   * @return SharedCampaignRecordSet
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public SharedCampaignRecordSet getPartnerCampaignsSharedByUser(Integer page, Integer recordsPerPage) throws ApiException {
    return getPartnerCampaignsSharedByUserWithHttpInfo(page, recordsPerPage).getData();
  }

  /**
   * Get Partner Campaigns Shared By User
   * Get all partner campaigns you have shared to Telnyx in a paginated fashion  This endpoint is currently limited to only returning shared campaigns that Telnyx has accepted. In other words, shared but pending campaigns are currently omitted from the response from this endpoint.
   * @param page The 1-indexed page number to get. The default value is &#x60;1&#x60;. (optional, default to 1)
   * @param recordsPerPage The amount of records per page, limited to between 1 and 500 inclusive. The default value is &#x60;10&#x60;. (optional, default to 10)
   * @return ApiResponse&lt;SharedCampaignRecordSet&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SharedCampaignRecordSet> getPartnerCampaignsSharedByUserWithHttpInfo(Integer page, Integer recordsPerPage) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/partnerCampaign/sharedByMe";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recordsPerPage", recordsPerPage));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<SharedCampaignRecordSet> localVarReturnType = new GenericType<SharedCampaignRecordSet>() {};

    return apiClient.invokeAPI("SharedCampaignsApi.getPartnerCampaignsSharedByUser", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
