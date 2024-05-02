package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.HTTPValidationError;
import com.telnyx.sdk.model.PhoneNumberCampaign;
import com.telnyx.sdk.model.PhoneNumberCampaignCreate;
import com.telnyx.sdk.model.PhoneNumberCampaignPaginated;
import com.telnyx.sdk.model.ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut;
import com.telnyx.sdk.model.ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPost;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class PhoneNumberCampaignsApi {
  private ApiClient apiClient;

  public PhoneNumberCampaignsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PhoneNumberCampaignsApi(ApiClient apiClient) {
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
   * Create New Phone Number Campaign
   * Assign an individual phone number to campaign.
   * @param phoneNumberCampaignCreate  (required)
   * @return ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPost
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPost createPhoneNumberCampaign(PhoneNumberCampaignCreate phoneNumberCampaignCreate) throws ApiException {
    return createPhoneNumberCampaignWithHttpInfo(phoneNumberCampaignCreate).getData();
  }

  /**
   * Create New Phone Number Campaign
   * Assign an individual phone number to campaign.
   * @param phoneNumberCampaignCreate  (required)
   * @return ApiResponse&lt;ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPost&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPost> createPhoneNumberCampaignWithHttpInfo(PhoneNumberCampaignCreate phoneNumberCampaignCreate) throws ApiException {
    Object localVarPostBody = phoneNumberCampaignCreate;
    
    // verify the required parameter 'phoneNumberCampaignCreate' is set
    if (phoneNumberCampaignCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneNumberCampaignCreate' when calling createPhoneNumberCampaign");
    }
    
    // create path and map variables
    String localVarPath = "/phoneNumberCampaign";

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

    GenericType<ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPost> localVarReturnType = new GenericType<ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPost>() {};

    return apiClient.invokeAPI("PhoneNumberCampaignsApi.createPhoneNumberCampaign", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create New Phone Number Campaign
   * This endpoint allows you to assign a different campaign to a supplied &#x60;phoneNumber&#x60;.
   * @param phoneNumber  (required)
   * @param phoneNumberCampaignCreate  (required)
   * @return ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut createPhoneNumberCampaign_0(String phoneNumber, PhoneNumberCampaignCreate phoneNumberCampaignCreate) throws ApiException {
    return createPhoneNumberCampaign_0WithHttpInfo(phoneNumber, phoneNumberCampaignCreate).getData();
  }

  /**
   * Create New Phone Number Campaign
   * This endpoint allows you to assign a different campaign to a supplied &#x60;phoneNumber&#x60;.
   * @param phoneNumber  (required)
   * @param phoneNumberCampaignCreate  (required)
   * @return ApiResponse&lt;ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut> createPhoneNumberCampaign_0WithHttpInfo(String phoneNumber, PhoneNumberCampaignCreate phoneNumberCampaignCreate) throws ApiException {
    Object localVarPostBody = phoneNumberCampaignCreate;
    
    // verify the required parameter 'phoneNumber' is set
    if (phoneNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneNumber' when calling createPhoneNumberCampaign_0");
    }
    
    // verify the required parameter 'phoneNumberCampaignCreate' is set
    if (phoneNumberCampaignCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneNumberCampaignCreate' when calling createPhoneNumberCampaign_0");
    }
    
    // create path and map variables
    String localVarPath = "/phoneNumberCampaign/{phoneNumber}"
      .replaceAll("\\{" + "phoneNumber" + "\\}", apiClient.escapeString(phoneNumber.toString()));

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

    GenericType<ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut> localVarReturnType = new GenericType<ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut>() {};

    return apiClient.invokeAPI("PhoneNumberCampaignsApi.createPhoneNumberCampaign_0", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create New Phone Number Campaign
   * 
   * @param phoneNumberCampaignCreate  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public Object createPhoneNumberCampaign_1(PhoneNumberCampaignCreate phoneNumberCampaignCreate) throws ApiException {
    return createPhoneNumberCampaign_1WithHttpInfo(phoneNumberCampaignCreate).getData();
  }

  /**
   * Create New Phone Number Campaign
   * 
   * @param phoneNumberCampaignCreate  (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> createPhoneNumberCampaign_1WithHttpInfo(PhoneNumberCampaignCreate phoneNumberCampaignCreate) throws ApiException {
    Object localVarPostBody = phoneNumberCampaignCreate;
    
    // verify the required parameter 'phoneNumberCampaignCreate' is set
    if (phoneNumberCampaignCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneNumberCampaignCreate' when calling createPhoneNumberCampaign_1");
    }
    
    // create path and map variables
    String localVarPath = "/phone_number_campaigns";

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("PhoneNumberCampaignsApi.createPhoneNumberCampaign_1", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete Phone Number Campaign
   * This endpoint allows you to remove a campaign assignment from the supplied &#x60;phoneNumber&#x60;.
   * @param phoneNumber  (required)
   * @return PhoneNumberCampaign
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public PhoneNumberCampaign deletePhoneNumberCampaign(String phoneNumber) throws ApiException {
    return deletePhoneNumberCampaignWithHttpInfo(phoneNumber).getData();
  }

  /**
   * Delete Phone Number Campaign
   * This endpoint allows you to remove a campaign assignment from the supplied &#x60;phoneNumber&#x60;.
   * @param phoneNumber  (required)
   * @return ApiResponse&lt;PhoneNumberCampaign&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PhoneNumberCampaign> deletePhoneNumberCampaignWithHttpInfo(String phoneNumber) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'phoneNumber' is set
    if (phoneNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneNumber' when calling deletePhoneNumberCampaign");
    }
    
    // create path and map variables
    String localVarPath = "/phoneNumberCampaign/{phoneNumber}"
      .replaceAll("\\{" + "phoneNumber" + "\\}", apiClient.escapeString(phoneNumber.toString()));

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

    GenericType<PhoneNumberCampaign> localVarReturnType = new GenericType<PhoneNumberCampaign>() {};

    return apiClient.invokeAPI("PhoneNumberCampaignsApi.deletePhoneNumberCampaign", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete Phone Number Campaign
   * 
   * @param phoneNumber  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public Object deletePhoneNumberCampaign_0(String phoneNumber) throws ApiException {
    return deletePhoneNumberCampaign_0WithHttpInfo(phoneNumber).getData();
  }

  /**
   * Delete Phone Number Campaign
   * 
   * @param phoneNumber  (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> deletePhoneNumberCampaign_0WithHttpInfo(String phoneNumber) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'phoneNumber' is set
    if (phoneNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneNumber' when calling deletePhoneNumberCampaign_0");
    }
    
    // create path and map variables
    String localVarPath = "/phone_number_campaigns/{phoneNumber}"
      .replaceAll("\\{" + "phoneNumber" + "\\}", apiClient.escapeString(phoneNumber.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("PhoneNumberCampaignsApi.deletePhoneNumberCampaign_0", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve All Phone Number Campaigns
   * Retrieve all of your organization&#39;s phone number/campaign assignments.
   * @param recordsPerPage  (optional, default to 20)
   * @param page  (optional, default to 1)
   * @return PhoneNumberCampaignPaginated
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public PhoneNumberCampaignPaginated getAllPhoneNumberCampaigns(Object recordsPerPage, Object page) throws ApiException {
    return getAllPhoneNumberCampaignsWithHttpInfo(recordsPerPage, page).getData();
  }

  /**
   * Retrieve All Phone Number Campaigns
   * Retrieve all of your organization&#39;s phone number/campaign assignments.
   * @param recordsPerPage  (optional, default to 20)
   * @param page  (optional, default to 1)
   * @return ApiResponse&lt;PhoneNumberCampaignPaginated&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PhoneNumberCampaignPaginated> getAllPhoneNumberCampaignsWithHttpInfo(Object recordsPerPage, Object page) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/phoneNumberCampaign";

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

    GenericType<PhoneNumberCampaignPaginated> localVarReturnType = new GenericType<PhoneNumberCampaignPaginated>() {};

    return apiClient.invokeAPI("PhoneNumberCampaignsApi.getAllPhoneNumberCampaigns", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve All Phone Number Campaigns
   * 
   * @param recordsPerPage  (optional, default to 20)
   * @param page  (optional, default to 1)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public Object getAllPhoneNumberCampaigns_0(Object recordsPerPage, Object page) throws ApiException {
    return getAllPhoneNumberCampaigns_0WithHttpInfo(recordsPerPage, page).getData();
  }

  /**
   * Retrieve All Phone Number Campaigns
   * 
   * @param recordsPerPage  (optional, default to 20)
   * @param page  (optional, default to 1)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> getAllPhoneNumberCampaigns_0WithHttpInfo(Object recordsPerPage, Object page) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/phone_number_campaigns";

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("PhoneNumberCampaignsApi.getAllPhoneNumberCampaigns_0", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Single Phone Number Campaign
   * Retrieve an individual phone number/campaign assignment by &#x60;phoneNumber&#x60;.
   * @param phoneNumber  (required)
   * @return PhoneNumberCampaign
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public PhoneNumberCampaign getPhoneNumberCampaign(String phoneNumber) throws ApiException {
    return getPhoneNumberCampaignWithHttpInfo(phoneNumber).getData();
  }

  /**
   * Get Single Phone Number Campaign
   * Retrieve an individual phone number/campaign assignment by &#x60;phoneNumber&#x60;.
   * @param phoneNumber  (required)
   * @return ApiResponse&lt;PhoneNumberCampaign&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PhoneNumberCampaign> getPhoneNumberCampaignWithHttpInfo(String phoneNumber) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'phoneNumber' is set
    if (phoneNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneNumber' when calling getPhoneNumberCampaign");
    }
    
    // create path and map variables
    String localVarPath = "/phoneNumberCampaign/{phoneNumber}"
      .replaceAll("\\{" + "phoneNumber" + "\\}", apiClient.escapeString(phoneNumber.toString()));

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

    GenericType<PhoneNumberCampaign> localVarReturnType = new GenericType<PhoneNumberCampaign>() {};

    return apiClient.invokeAPI("PhoneNumberCampaignsApi.getPhoneNumberCampaign", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Single Phone Number Campaign
   * 
   * @param phoneNumber  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public Object getSinglePhoneNumberCampaign(String phoneNumber) throws ApiException {
    return getSinglePhoneNumberCampaignWithHttpInfo(phoneNumber).getData();
  }

  /**
   * Get Single Phone Number Campaign
   * 
   * @param phoneNumber  (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> getSinglePhoneNumberCampaignWithHttpInfo(String phoneNumber) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'phoneNumber' is set
    if (phoneNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneNumber' when calling getSinglePhoneNumberCampaign");
    }
    
    // create path and map variables
    String localVarPath = "/phone_number_campaigns/{phoneNumber}"
      .replaceAll("\\{" + "phoneNumber" + "\\}", apiClient.escapeString(phoneNumber.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("PhoneNumberCampaignsApi.getSinglePhoneNumberCampaign", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create New Phone Number Campaign
   * 
   * @param phoneNumber  (required)
   * @param phoneNumberCampaignCreate  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public Object putPhoneNumberCampaign(String phoneNumber, PhoneNumberCampaignCreate phoneNumberCampaignCreate) throws ApiException {
    return putPhoneNumberCampaignWithHttpInfo(phoneNumber, phoneNumberCampaignCreate).getData();
  }

  /**
   * Create New Phone Number Campaign
   * 
   * @param phoneNumber  (required)
   * @param phoneNumberCampaignCreate  (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> putPhoneNumberCampaignWithHttpInfo(String phoneNumber, PhoneNumberCampaignCreate phoneNumberCampaignCreate) throws ApiException {
    Object localVarPostBody = phoneNumberCampaignCreate;
    
    // verify the required parameter 'phoneNumber' is set
    if (phoneNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneNumber' when calling putPhoneNumberCampaign");
    }
    
    // verify the required parameter 'phoneNumberCampaignCreate' is set
    if (phoneNumberCampaignCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneNumberCampaignCreate' when calling putPhoneNumberCampaign");
    }
    
    // create path and map variables
    String localVarPath = "/phone_number_campaigns/{phoneNumber}"
      .replaceAll("\\{" + "phoneNumber" + "\\}", apiClient.escapeString(phoneNumber.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("PhoneNumberCampaignsApi.putPhoneNumberCampaign", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
