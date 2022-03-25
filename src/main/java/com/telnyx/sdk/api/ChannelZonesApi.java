package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.GcbChannelZone;
import com.telnyx.sdk.model.GcbPhoneNumber;
import com.telnyx.sdk.model.GetGcbChannelZonesRequestResponse;
import com.telnyx.sdk.model.GetGcbPhoneNumbersRequestResponse;
import com.telnyx.sdk.model.ListChannelZonesByPhoneNumber;
import com.telnyx.sdk.model.UpdateChannelZone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ChannelZonesApi {
  private ApiClient apiClient;

  public ChannelZonesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ChannelZonesApi(ApiClient apiClient) {
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
   * Assign a phone number to a channel zone
   * You should own the phone number being assigned to the channel zone. Remember that you should reserve channels in this channel zone, otherwise you won&#39;t be able to receive incoming calls.
   * @param channelZoneId Channel zone identifier (required)
   * @param body  (required)
   * @return GcbPhoneNumber
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A new inserted phone number </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GcbPhoneNumber assignPhoneNumber(String channelZoneId, ListChannelZonesByPhoneNumber body) throws ApiException {
    return assignPhoneNumberWithHttpInfo(channelZoneId, body).getData();
  }

  /**
   * Assign a phone number to a channel zone
   * You should own the phone number being assigned to the channel zone. Remember that you should reserve channels in this channel zone, otherwise you won&#39;t be able to receive incoming calls.
   * @param channelZoneId Channel zone identifier (required)
   * @param body  (required)
   * @return ApiResponse&lt;GcbPhoneNumber&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A new inserted phone number </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GcbPhoneNumber> assignPhoneNumberWithHttpInfo(String channelZoneId, ListChannelZonesByPhoneNumber body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'channelZoneId' is set
    if (channelZoneId == null) {
      throw new ApiException(400, "Missing the required parameter 'channelZoneId' when calling assignPhoneNumber");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling assignPhoneNumber");
    }
    
    // create path and map variables
    String localVarPath = "/channel_zones/{channel_zone_id}/channel_zone_phone_numbers"
      .replaceAll("\\{" + "channel_zone_id" + "\\}", apiClient.escapeString(channelZoneId.toString()));

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

    GenericType<GcbPhoneNumber> localVarReturnType = new GenericType<GcbPhoneNumber>() {};

    return apiClient.invokeAPI("ChannelZonesApi.assignPhoneNumber", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get a specific channel zone
   * Get a specific channel zone
   * @param channelZoneId Channel zone identifier (required)
   * @return GcbChannelZone
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Requested channel zone </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GcbChannelZone getChannelZone(String channelZoneId) throws ApiException {
    return getChannelZoneWithHttpInfo(channelZoneId).getData();
  }

  /**
   * Get a specific channel zone
   * Get a specific channel zone
   * @param channelZoneId Channel zone identifier (required)
   * @return ApiResponse&lt;GcbChannelZone&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Requested channel zone </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GcbChannelZone> getChannelZoneWithHttpInfo(String channelZoneId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelZoneId' is set
    if (channelZoneId == null) {
      throw new ApiException(400, "Missing the required parameter 'channelZoneId' when calling getChannelZone");
    }
    
    // create path and map variables
    String localVarPath = "/channel_zones/{channel_zone_id}"
      .replaceAll("\\{" + "channel_zone_id" + "\\}", apiClient.escapeString(channelZoneId.toString()));

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

    GenericType<GcbChannelZone> localVarReturnType = new GenericType<GcbChannelZone>() {};

    return apiClient.invokeAPI("ChannelZonesApi.getChannelZone", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get list of channel zones
   * List of channel zones with their countries
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return GetGcbChannelZonesRequestResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of channel zones </td><td>  -  </td></tr>
     </table>
   */
  public GetGcbChannelZonesRequestResponse getChannelZones(Integer pageNumber, Integer pageSize) throws ApiException {
    return getChannelZonesWithHttpInfo(pageNumber, pageSize).getData();
  }

  /**
   * Get list of channel zones
   * List of channel zones with their countries
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;GetGcbChannelZonesRequestResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of channel zones </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetGcbChannelZonesRequestResponse> getChannelZonesWithHttpInfo(Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/channel_zones";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<GetGcbChannelZonesRequestResponse> localVarReturnType = new GenericType<GetGcbChannelZonesRequestResponse>() {};

    return apiClient.invokeAPI("ChannelZonesApi.getChannelZones", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get the list of phone numbers assigned to a channel zone
   * Retrieve the assigned phone numbers in a channel zone. Phone numbers assigned to a channel zone can receive concurrent calls up to the quantity reserved in that channel zone. Additional concurrent calls are rejected with a busy signal.
   * @param channelZoneId Channel zone identifier (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return GetGcbPhoneNumbersRequestResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of phone numbers </td><td>  -  </td></tr>
     </table>
   */
  public GetGcbPhoneNumbersRequestResponse getPhoneNumbers(String channelZoneId, Integer pageNumber, Integer pageSize) throws ApiException {
    return getPhoneNumbersWithHttpInfo(channelZoneId, pageNumber, pageSize).getData();
  }

  /**
   * Get the list of phone numbers assigned to a channel zone
   * Retrieve the assigned phone numbers in a channel zone. Phone numbers assigned to a channel zone can receive concurrent calls up to the quantity reserved in that channel zone. Additional concurrent calls are rejected with a busy signal.
   * @param channelZoneId Channel zone identifier (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;GetGcbPhoneNumbersRequestResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of phone numbers </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetGcbPhoneNumbersRequestResponse> getPhoneNumbersWithHttpInfo(String channelZoneId, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelZoneId' is set
    if (channelZoneId == null) {
      throw new ApiException(400, "Missing the required parameter 'channelZoneId' when calling getPhoneNumbers");
    }
    
    // create path and map variables
    String localVarPath = "/channel_zones/{channel_zone_id}/channel_zone_phone_numbers"
      .replaceAll("\\{" + "channel_zone_id" + "\\}", apiClient.escapeString(channelZoneId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<GetGcbPhoneNumbersRequestResponse> localVarReturnType = new GenericType<GetGcbPhoneNumbersRequestResponse>() {};

    return apiClient.invokeAPI("ChannelZonesApi.getPhoneNumbers", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Patch a channel zone
   * Change the amount of reserved channels at a given channel zone
   * @param channelZoneId Channel zone identifier (required)
   * @param body  (required)
   * @return GcbChannelZone
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successfuly patched channel zone </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GcbChannelZone patchGroup(String channelZoneId, UpdateChannelZone body) throws ApiException {
    return patchGroupWithHttpInfo(channelZoneId, body).getData();
  }

  /**
   * Patch a channel zone
   * Change the amount of reserved channels at a given channel zone
   * @param channelZoneId Channel zone identifier (required)
   * @param body  (required)
   * @return ApiResponse&lt;GcbChannelZone&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successfuly patched channel zone </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GcbChannelZone> patchGroupWithHttpInfo(String channelZoneId, UpdateChannelZone body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'channelZoneId' is set
    if (channelZoneId == null) {
      throw new ApiException(400, "Missing the required parameter 'channelZoneId' when calling patchGroup");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling patchGroup");
    }
    
    // create path and map variables
    String localVarPath = "/channel_zones/{channel_zone_id}"
      .replaceAll("\\{" + "channel_zone_id" + "\\}", apiClient.escapeString(channelZoneId.toString()));

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

    GenericType<GcbChannelZone> localVarReturnType = new GenericType<GcbChannelZone>() {};

    return apiClient.invokeAPI("ChannelZonesApi.patchGroup", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Unassign a phone number from a channel zone
   * 
   * @param channelZoneId Channel zone identifier (required)
   * @param phoneNumber The phone number to be looked up (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The phone number is successfully deleted </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public void unassignPhoneNumber(String channelZoneId, String phoneNumber) throws ApiException {
    unassignPhoneNumberWithHttpInfo(channelZoneId, phoneNumber);
  }

  /**
   * Unassign a phone number from a channel zone
   * 
   * @param channelZoneId Channel zone identifier (required)
   * @param phoneNumber The phone number to be looked up (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The phone number is successfully deleted </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> unassignPhoneNumberWithHttpInfo(String channelZoneId, String phoneNumber) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelZoneId' is set
    if (channelZoneId == null) {
      throw new ApiException(400, "Missing the required parameter 'channelZoneId' when calling unassignPhoneNumber");
    }
    
    // verify the required parameter 'phoneNumber' is set
    if (phoneNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneNumber' when calling unassignPhoneNumber");
    }
    
    // create path and map variables
    String localVarPath = "/channel_zones/{channel_zone_id}/channel_zone_phone_numbers/{phone_number}"
      .replaceAll("\\{" + "channel_zone_id" + "\\}", apiClient.escapeString(channelZoneId.toString()))
      .replaceAll("\\{" + "phone_number" + "\\}", apiClient.escapeString(phoneNumber.toString()));

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

    return apiClient.invokeAPI("ChannelZonesApi.unassignPhoneNumber", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
}
