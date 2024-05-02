package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateExternalConnectionRequest;
import com.telnyx.sdk.model.CreateExternalConnectionUploadRequest;
import com.telnyx.sdk.model.CreateUploadRequestResponse;
import com.telnyx.sdk.model.CreateUploadRequestResponse1;
import com.telnyx.sdk.model.DismissRequestWasSuccessful;
import com.telnyx.sdk.model.ErrorResponse;
import com.telnyx.sdk.model.ExternalConnectionResponse;
import com.telnyx.sdk.model.GetAllCivicAddressesResponse;
import com.telnyx.sdk.model.GetAllExternalConnectionsResponse;
import com.telnyx.sdk.model.GetCivicAddressResponse;
import com.telnyx.sdk.model.GetExternalConnectionPhoneNumberResponse;
import com.telnyx.sdk.model.GetLogMessageResponse;
import com.telnyx.sdk.model.GetReleaseResponse;
import com.telnyx.sdk.model.GetUploadResponse;
import com.telnyx.sdk.model.GetUploadsStatusResponse;
import com.telnyx.sdk.model.ListExternalConnectionPhoneNumbersResponse;
import com.telnyx.sdk.model.ListLogMessagesResponse;
import com.telnyx.sdk.model.ListReleasesResponse;
import com.telnyx.sdk.model.ListUploadsResponse;
import com.telnyx.sdk.model.LocationResponse;
import java.util.UUID;
import com.telnyx.sdk.model.UpdateExternalConnectionPhoneNumberRequest;
import com.telnyx.sdk.model.UpdateExternalConnectionRequest;
import com.telnyx.sdk.model.UpdateLocationRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class ExternalConnectionsApi {
  private ApiClient apiClient;

  public ExternalConnectionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ExternalConnectionsApi(ApiClient apiClient) {
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
   * Creates an External Connection
   * Creates a new External Connection based on the parameters sent in the request. The external_sip_connection and outbound voice profile id are required. Once created, you can assign phone numbers to your application using the &#x60;/phone_numbers&#x60; endpoint.
   * @param createExternalConnectionRequest Parameters that can be set when creating a External Connection (required)
   * @return ExternalConnectionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ExternalConnectionResponse createExternalConnection(CreateExternalConnectionRequest createExternalConnectionRequest) throws ApiException {
    return createExternalConnectionWithHttpInfo(createExternalConnectionRequest).getData();
  }

  /**
   * Creates an External Connection
   * Creates a new External Connection based on the parameters sent in the request. The external_sip_connection and outbound voice profile id are required. Once created, you can assign phone numbers to your application using the &#x60;/phone_numbers&#x60; endpoint.
   * @param createExternalConnectionRequest Parameters that can be set when creating a External Connection (required)
   * @return ApiResponse&lt;ExternalConnectionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ExternalConnectionResponse> createExternalConnectionWithHttpInfo(CreateExternalConnectionRequest createExternalConnectionRequest) throws ApiException {
    Object localVarPostBody = createExternalConnectionRequest;
    
    // verify the required parameter 'createExternalConnectionRequest' is set
    if (createExternalConnectionRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createExternalConnectionRequest' when calling createExternalConnection");
    }
    
    // create path and map variables
    String localVarPath = "/external_connections";

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

    GenericType<ExternalConnectionResponse> localVarReturnType = new GenericType<ExternalConnectionResponse>() {};

    return apiClient.invokeAPI("ExternalConnectionsApi.createExternalConnection", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Creates an Upload request
   * Creates a new Upload request to Microsoft teams with the included phone numbers. Only one of civic_address_id or location_id must be provided, not both. The maximum allowed phone numbers for the numbers_ids array is 1000.
   * @param id Identifies the resource. (required)
   * @param createExternalConnectionUploadRequest Parameters that can be set when creating an Upload request. (required)
   * @return CreateUploadRequestResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       <tr><td> 413 </td><td> Payload too large. The maximum allowed phone numbers for the numbers_ids array is 1000. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
       <tr><td> 504 </td><td> Gateway Timeout </td><td>  -  </td></tr>
     </table>
   */
  public CreateUploadRequestResponse createExternalConnectionUpload(String id, CreateExternalConnectionUploadRequest createExternalConnectionUploadRequest) throws ApiException {
    return createExternalConnectionUploadWithHttpInfo(id, createExternalConnectionUploadRequest).getData();
  }

  /**
   * Creates an Upload request
   * Creates a new Upload request to Microsoft teams with the included phone numbers. Only one of civic_address_id or location_id must be provided, not both. The maximum allowed phone numbers for the numbers_ids array is 1000.
   * @param id Identifies the resource. (required)
   * @param createExternalConnectionUploadRequest Parameters that can be set when creating an Upload request. (required)
   * @return ApiResponse&lt;CreateUploadRequestResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       <tr><td> 413 </td><td> Payload too large. The maximum allowed phone numbers for the numbers_ids array is 1000. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
       <tr><td> 504 </td><td> Gateway Timeout </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateUploadRequestResponse> createExternalConnectionUploadWithHttpInfo(String id, CreateExternalConnectionUploadRequest createExternalConnectionUploadRequest) throws ApiException {
    Object localVarPostBody = createExternalConnectionUploadRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling createExternalConnectionUpload");
    }
    
    // verify the required parameter 'createExternalConnectionUploadRequest' is set
    if (createExternalConnectionUploadRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createExternalConnectionUploadRequest' when calling createExternalConnectionUpload");
    }
    
    // create path and map variables
    String localVarPath = "/external_connections/{id}/uploads"
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

    GenericType<CreateUploadRequestResponse> localVarReturnType = new GenericType<CreateUploadRequestResponse>() {};

    return apiClient.invokeAPI("ExternalConnectionsApi.createExternalConnectionUpload", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Deletes an External Connection
   * Permanently deletes an External Connection. Deletion may be prevented if the application is in use by phone numbers, is active, or if it is an Operator Connect connection. To remove an Operator Connect integration please contact Telnyx support.
   * @param id Identifies the resource. (required)
   * @return ExternalConnectionResponse
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
  public ExternalConnectionResponse deleteExternalConnection(String id) throws ApiException {
    return deleteExternalConnectionWithHttpInfo(id).getData();
  }

  /**
   * Deletes an External Connection
   * Permanently deletes an External Connection. Deletion may be prevented if the application is in use by phone numbers, is active, or if it is an Operator Connect connection. To remove an Operator Connect integration please contact Telnyx support.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;ExternalConnectionResponse&gt;
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
  public ApiResponse<ExternalConnectionResponse> deleteExternalConnectionWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteExternalConnection");
    }
    
    // create path and map variables
    String localVarPath = "/external_connections/{id}"
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

    GenericType<ExternalConnectionResponse> localVarReturnType = new GenericType<ExternalConnectionResponse>() {};

    return apiClient.invokeAPI("ExternalConnectionsApi.deleteExternalConnection", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Dismiss a log message
   * Dismiss a log message for an external connection associated with your account.
   * @param id Identifies the resource. (required)
   * @return DismissRequestWasSuccessful
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public DismissRequestWasSuccessful deleteExternalConnectionLogMessage(String id) throws ApiException {
    return deleteExternalConnectionLogMessageWithHttpInfo(id).getData();
  }

  /**
   * Dismiss a log message
   * Dismiss a log message for an external connection associated with your account.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;DismissRequestWasSuccessful&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DismissRequestWasSuccessful> deleteExternalConnectionLogMessageWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteExternalConnectionLogMessage");
    }
    
    // create path and map variables
    String localVarPath = "/external_connections/log_messages/{id}"
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

    GenericType<DismissRequestWasSuccessful> localVarReturnType = new GenericType<DismissRequestWasSuccessful>() {};

    return apiClient.invokeAPI("ExternalConnectionsApi.deleteExternalConnectionLogMessage", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve an External Connection
   * Return the details of an existing External Connection inside the &#39;data&#39; attribute of the response.
   * @param id Identifies the resource. (required)
   * @return ExternalConnectionResponse
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
  public ExternalConnectionResponse getExternalConnection(String id) throws ApiException {
    return getExternalConnectionWithHttpInfo(id).getData();
  }

  /**
   * Retrieve an External Connection
   * Return the details of an existing External Connection inside the &#39;data&#39; attribute of the response.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;ExternalConnectionResponse&gt;
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
  public ApiResponse<ExternalConnectionResponse> getExternalConnectionWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getExternalConnection");
    }
    
    // create path and map variables
    String localVarPath = "/external_connections/{id}"
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

    GenericType<ExternalConnectionResponse> localVarReturnType = new GenericType<ExternalConnectionResponse>() {};

    return apiClient.invokeAPI("ExternalConnectionsApi.getExternalConnection", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a Civic Address
   * Return the details of an existing Civic Address with its Locations inside the &#39;data&#39; attribute of the response.
   * @param id Identifies the resource. (required)
   * @param addressId Identifies a civic address or a location. (required)
   * @return GetCivicAddressResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
       <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
     </table>
   */
  public GetCivicAddressResponse getExternalConnectionCivicAddress(String id, UUID addressId) throws ApiException {
    return getExternalConnectionCivicAddressWithHttpInfo(id, addressId).getData();
  }

  /**
   * Retrieve a Civic Address
   * Return the details of an existing Civic Address with its Locations inside the &#39;data&#39; attribute of the response.
   * @param id Identifies the resource. (required)
   * @param addressId Identifies a civic address or a location. (required)
   * @return ApiResponse&lt;GetCivicAddressResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
       <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetCivicAddressResponse> getExternalConnectionCivicAddressWithHttpInfo(String id, UUID addressId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getExternalConnectionCivicAddress");
    }
    
    // verify the required parameter 'addressId' is set
    if (addressId == null) {
      throw new ApiException(400, "Missing the required parameter 'addressId' when calling getExternalConnectionCivicAddress");
    }
    
    // create path and map variables
    String localVarPath = "/external_connections/{id}/civic_addresses/{address_id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "address_id" + "\\}", apiClient.escapeString(addressId.toString()));

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

    GenericType<GetCivicAddressResponse> localVarReturnType = new GenericType<GetCivicAddressResponse>() {};

    return apiClient.invokeAPI("ExternalConnectionsApi.getExternalConnectionCivicAddress", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a log message
   * Retrieve a log message for an external connection associated with your account.
   * @param id Identifies the resource. (required)
   * @return GetLogMessageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public GetLogMessageResponse getExternalConnectionLogMessage(String id) throws ApiException {
    return getExternalConnectionLogMessageWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a log message
   * Retrieve a log message for an external connection associated with your account.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;GetLogMessageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetLogMessageResponse> getExternalConnectionLogMessageWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getExternalConnectionLogMessage");
    }
    
    // create path and map variables
    String localVarPath = "/external_connections/log_messages/{id}"
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

    GenericType<GetLogMessageResponse> localVarReturnType = new GenericType<GetLogMessageResponse>() {};

    return apiClient.invokeAPI("ExternalConnectionsApi.getExternalConnectionLogMessage", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a phone number
   * Return the details of a phone number associated with the given external connection.
   * @param id Identifies the resource. (required)
   * @param phoneNumberId A phone number&#39;s ID via the Telnyx API (required)
   * @return GetExternalConnectionPhoneNumberResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
     </table>
   */
  public GetExternalConnectionPhoneNumberResponse getExternalConnectionPhoneNumber(String id, String phoneNumberId) throws ApiException {
    return getExternalConnectionPhoneNumberWithHttpInfo(id, phoneNumberId).getData();
  }

  /**
   * Retrieve a phone number
   * Return the details of a phone number associated with the given external connection.
   * @param id Identifies the resource. (required)
   * @param phoneNumberId A phone number&#39;s ID via the Telnyx API (required)
   * @return ApiResponse&lt;GetExternalConnectionPhoneNumberResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetExternalConnectionPhoneNumberResponse> getExternalConnectionPhoneNumberWithHttpInfo(String id, String phoneNumberId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getExternalConnectionPhoneNumber");
    }
    
    // verify the required parameter 'phoneNumberId' is set
    if (phoneNumberId == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneNumberId' when calling getExternalConnectionPhoneNumber");
    }
    
    // create path and map variables
    String localVarPath = "/external_connections/{id}/phone_numbers/{phone_number_id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "phone_number_id" + "\\}", apiClient.escapeString(phoneNumberId.toString()));

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

    GenericType<GetExternalConnectionPhoneNumberResponse> localVarReturnType = new GenericType<GetExternalConnectionPhoneNumberResponse>() {};

    return apiClient.invokeAPI("ExternalConnectionsApi.getExternalConnectionPhoneNumber", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a Release request
   * Return the details of a Release request and its phone numbers.
   * @param id Identifies the resource. (required)
   * @param releaseId Identifies a Release request (required)
   * @return GetReleaseResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
     </table>
   */
  public GetReleaseResponse getExternalConnectionRelease(String id, UUID releaseId) throws ApiException {
    return getExternalConnectionReleaseWithHttpInfo(id, releaseId).getData();
  }

  /**
   * Retrieve a Release request
   * Return the details of a Release request and its phone numbers.
   * @param id Identifies the resource. (required)
   * @param releaseId Identifies a Release request (required)
   * @return ApiResponse&lt;GetReleaseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetReleaseResponse> getExternalConnectionReleaseWithHttpInfo(String id, UUID releaseId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getExternalConnectionRelease");
    }
    
    // verify the required parameter 'releaseId' is set
    if (releaseId == null) {
      throw new ApiException(400, "Missing the required parameter 'releaseId' when calling getExternalConnectionRelease");
    }
    
    // create path and map variables
    String localVarPath = "/external_connections/{id}/releases/{release_id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "release_id" + "\\}", apiClient.escapeString(releaseId.toString()));

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

    GenericType<GetReleaseResponse> localVarReturnType = new GenericType<GetReleaseResponse>() {};

    return apiClient.invokeAPI("ExternalConnectionsApi.getExternalConnectionRelease", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve an Upload request
   * Return the details of an Upload request and its phone numbers.
   * @param id Identifies the resource. (required)
   * @param ticketId Identifies an Upload request (required)
   * @return GetUploadResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
     </table>
   */
  public GetUploadResponse getExternalConnectionUpload(String id, UUID ticketId) throws ApiException {
    return getExternalConnectionUploadWithHttpInfo(id, ticketId).getData();
  }

  /**
   * Retrieve an Upload request
   * Return the details of an Upload request and its phone numbers.
   * @param id Identifies the resource. (required)
   * @param ticketId Identifies an Upload request (required)
   * @return ApiResponse&lt;GetUploadResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetUploadResponse> getExternalConnectionUploadWithHttpInfo(String id, UUID ticketId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getExternalConnectionUpload");
    }
    
    // verify the required parameter 'ticketId' is set
    if (ticketId == null) {
      throw new ApiException(400, "Missing the required parameter 'ticketId' when calling getExternalConnectionUpload");
    }
    
    // create path and map variables
    String localVarPath = "/external_connections/{id}/uploads/{ticket_id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "ticket_id" + "\\}", apiClient.escapeString(ticketId.toString()));

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

    GenericType<GetUploadResponse> localVarReturnType = new GenericType<GetUploadResponse>() {};

    return apiClient.invokeAPI("ExternalConnectionsApi.getExternalConnectionUpload", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get the count of pending upload requests
   * Returns the count of all pending upload requests for the given external connection.
   * @param id Identifies the resource. (required)
   * @return GetUploadsStatusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
     </table>
   */
  public GetUploadsStatusResponse getExternalConnectionUploadsStatus(String id) throws ApiException {
    return getExternalConnectionUploadsStatusWithHttpInfo(id).getData();
  }

  /**
   * Get the count of pending upload requests
   * Returns the count of all pending upload requests for the given external connection.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;GetUploadsStatusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetUploadsStatusResponse> getExternalConnectionUploadsStatusWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getExternalConnectionUploadsStatus");
    }
    
    // create path and map variables
    String localVarPath = "/external_connections/{id}/uploads/status"
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

    GenericType<GetUploadsStatusResponse> localVarReturnType = new GenericType<GetUploadsStatusResponse>() {};

    return apiClient.invokeAPI("ExternalConnectionsApi.getExternalConnectionUploadsStatus", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all civic addresses and locations
   * Returns the civic addresses and locations from Microsoft Teams.
   * @param id Identifies the resource. (required)
   * @return GetAllCivicAddressesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
       <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
     </table>
   */
  public GetAllCivicAddressesResponse listCivicAddresses(String id) throws ApiException {
    return listCivicAddressesWithHttpInfo(id).getData();
  }

  /**
   * List all civic addresses and locations
   * Returns the civic addresses and locations from Microsoft Teams.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;GetAllCivicAddressesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Unexpected Error </td><td>  -  </td></tr>
       <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetAllCivicAddressesResponse> listCivicAddressesWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling listCivicAddresses");
    }
    
    // create path and map variables
    String localVarPath = "/external_connections/{id}/civic_addresses"
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

    GenericType<GetAllCivicAddressesResponse> localVarReturnType = new GenericType<GetAllCivicAddressesResponse>() {};

    return apiClient.invokeAPI("ExternalConnectionsApi.listCivicAddresses", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all log messages
   * Retrieve a list of log messages for all external connections associated with your account.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterExternalConnectionId The external connection ID to filter by or \&quot;null\&quot; to filter for logs without an external connection ID (optional)
   * @param filterTelephoneNumberContains The partial phone number to filter log messages for. Requires 3-15 digits. (optional)
   * @param filterTelephoneNumberEq The phone number to filter log messages for or \&quot;null\&quot; to filter for logs without a phone number (optional)
   * @return ListLogMessagesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ListLogMessagesResponse listExternalConnectionLogMessages(Integer pageNumber, Integer pageSize, String filterExternalConnectionId, String filterTelephoneNumberContains, String filterTelephoneNumberEq) throws ApiException {
    return listExternalConnectionLogMessagesWithHttpInfo(pageNumber, pageSize, filterExternalConnectionId, filterTelephoneNumberContains, filterTelephoneNumberEq).getData();
  }

  /**
   * List all log messages
   * Retrieve a list of log messages for all external connections associated with your account.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterExternalConnectionId The external connection ID to filter by or \&quot;null\&quot; to filter for logs without an external connection ID (optional)
   * @param filterTelephoneNumberContains The partial phone number to filter log messages for. Requires 3-15 digits. (optional)
   * @param filterTelephoneNumberEq The phone number to filter log messages for or \&quot;null\&quot; to filter for logs without a phone number (optional)
   * @return ApiResponse&lt;ListLogMessagesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListLogMessagesResponse> listExternalConnectionLogMessagesWithHttpInfo(Integer pageNumber, Integer pageSize, String filterExternalConnectionId, String filterTelephoneNumberContains, String filterTelephoneNumberEq) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/external_connections/log_messages";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[external_connection_id]", filterExternalConnectionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[telephone_number][contains]", filterTelephoneNumberContains));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[telephone_number][eq]", filterTelephoneNumberEq));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListLogMessagesResponse> localVarReturnType = new GenericType<ListLogMessagesResponse>() {};

    return apiClient.invokeAPI("ExternalConnectionsApi.listExternalConnectionLogMessages", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all phone numbers
   * Returns a list of all active phone numbers associated with the given external connection.
   * @param id Identifies the resource. (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterPhoneNumberEq The phone number to filter by (optional)
   * @param filterPhoneNumberContains If present, connections associated with the given phone_number will be returned. A full match is necessary with a e164 format. (optional)
   * @param filterCivicAddressIdEq The civic address ID to filter by (optional)
   * @param filterLocationIdEq The location ID to filter by (optional)
   * @return ListExternalConnectionPhoneNumbersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ListExternalConnectionPhoneNumbersResponse listExternalConnectionPhoneNumbers(String id, Integer pageNumber, Integer pageSize, String filterPhoneNumberEq, String filterPhoneNumberContains, UUID filterCivicAddressIdEq, UUID filterLocationIdEq) throws ApiException {
    return listExternalConnectionPhoneNumbersWithHttpInfo(id, pageNumber, pageSize, filterPhoneNumberEq, filterPhoneNumberContains, filterCivicAddressIdEq, filterLocationIdEq).getData();
  }

  /**
   * List all phone numbers
   * Returns a list of all active phone numbers associated with the given external connection.
   * @param id Identifies the resource. (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterPhoneNumberEq The phone number to filter by (optional)
   * @param filterPhoneNumberContains If present, connections associated with the given phone_number will be returned. A full match is necessary with a e164 format. (optional)
   * @param filterCivicAddressIdEq The civic address ID to filter by (optional)
   * @param filterLocationIdEq The location ID to filter by (optional)
   * @return ApiResponse&lt;ListExternalConnectionPhoneNumbersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListExternalConnectionPhoneNumbersResponse> listExternalConnectionPhoneNumbersWithHttpInfo(String id, Integer pageNumber, Integer pageSize, String filterPhoneNumberEq, String filterPhoneNumberContains, UUID filterCivicAddressIdEq, UUID filterLocationIdEq) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling listExternalConnectionPhoneNumbers");
    }
    
    // create path and map variables
    String localVarPath = "/external_connections/{id}/phone_numbers"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_number][eq]", filterPhoneNumberEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_number][contains]", filterPhoneNumberContains));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[civic_address_id][eq]", filterCivicAddressIdEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[location_id][eq]", filterLocationIdEq));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListExternalConnectionPhoneNumbersResponse> localVarReturnType = new GenericType<ListExternalConnectionPhoneNumbersResponse>() {};

    return apiClient.invokeAPI("ExternalConnectionsApi.listExternalConnectionPhoneNumbers", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all Releases
   * Returns a list of your Releases for the given external connection. These are automatically created when you change the &#x60;connection_id&#x60; of a phone number that is currently on Microsoft Teams.
   * @param id Identifies the resource. (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterStatusEq The status of the release to filter by (optional)
   * @param filterCivicAddressIdEq The civic address ID to filter by (optional)
   * @param filterLocationIdEq The location ID to filter by (optional)
   * @param filterPhoneNumberEq The phone number to filter by (optional)
   * @param filterPhoneNumberContains The partial phone number to filter by. Requires 3-15 digits. (optional)
   * @return ListReleasesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ListReleasesResponse listExternalConnectionReleases(String id, Integer pageNumber, Integer pageSize, List<String> filterStatusEq, UUID filterCivicAddressIdEq, UUID filterLocationIdEq, String filterPhoneNumberEq, String filterPhoneNumberContains) throws ApiException {
    return listExternalConnectionReleasesWithHttpInfo(id, pageNumber, pageSize, filterStatusEq, filterCivicAddressIdEq, filterLocationIdEq, filterPhoneNumberEq, filterPhoneNumberContains).getData();
  }

  /**
   * List all Releases
   * Returns a list of your Releases for the given external connection. These are automatically created when you change the &#x60;connection_id&#x60; of a phone number that is currently on Microsoft Teams.
   * @param id Identifies the resource. (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterStatusEq The status of the release to filter by (optional)
   * @param filterCivicAddressIdEq The civic address ID to filter by (optional)
   * @param filterLocationIdEq The location ID to filter by (optional)
   * @param filterPhoneNumberEq The phone number to filter by (optional)
   * @param filterPhoneNumberContains The partial phone number to filter by. Requires 3-15 digits. (optional)
   * @return ApiResponse&lt;ListReleasesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListReleasesResponse> listExternalConnectionReleasesWithHttpInfo(String id, Integer pageNumber, Integer pageSize, List<String> filterStatusEq, UUID filterCivicAddressIdEq, UUID filterLocationIdEq, String filterPhoneNumberEq, String filterPhoneNumberContains) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling listExternalConnectionReleases");
    }
    
    // create path and map variables
    String localVarPath = "/external_connections/{id}/releases"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[status][eq]", filterStatusEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[civic_address_id][eq]", filterCivicAddressIdEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[location_id][eq]", filterLocationIdEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_number][eq]", filterPhoneNumberEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_number][contains]", filterPhoneNumberContains));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListReleasesResponse> localVarReturnType = new GenericType<ListReleasesResponse>() {};

    return apiClient.invokeAPI("ExternalConnectionsApi.listExternalConnectionReleases", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all Upload requests
   * Returns a list of your Upload requests for the given external connection.
   * @param id Identifies the resource. (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterStatusEq The status of the upload to filter by (optional)
   * @param filterCivicAddressIdEq The civic address ID to filter by (optional)
   * @param filterLocationIdEq The location ID to filter by (optional)
   * @param filterPhoneNumberEq The phone number to filter by (optional)
   * @param filterPhoneNumberContains The partial phone number to filter by. Requires 3-15 digits. (optional)
   * @return ListUploadsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ListUploadsResponse listExternalConnectionUploads(String id, Integer pageNumber, Integer pageSize, List<String> filterStatusEq, UUID filterCivicAddressIdEq, UUID filterLocationIdEq, String filterPhoneNumberEq, String filterPhoneNumberContains) throws ApiException {
    return listExternalConnectionUploadsWithHttpInfo(id, pageNumber, pageSize, filterStatusEq, filterCivicAddressIdEq, filterLocationIdEq, filterPhoneNumberEq, filterPhoneNumberContains).getData();
  }

  /**
   * List all Upload requests
   * Returns a list of your Upload requests for the given external connection.
   * @param id Identifies the resource. (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterStatusEq The status of the upload to filter by (optional)
   * @param filterCivicAddressIdEq The civic address ID to filter by (optional)
   * @param filterLocationIdEq The location ID to filter by (optional)
   * @param filterPhoneNumberEq The phone number to filter by (optional)
   * @param filterPhoneNumberContains The partial phone number to filter by. Requires 3-15 digits. (optional)
   * @return ApiResponse&lt;ListUploadsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListUploadsResponse> listExternalConnectionUploadsWithHttpInfo(String id, Integer pageNumber, Integer pageSize, List<String> filterStatusEq, UUID filterCivicAddressIdEq, UUID filterLocationIdEq, String filterPhoneNumberEq, String filterPhoneNumberContains) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling listExternalConnectionUploads");
    }
    
    // create path and map variables
    String localVarPath = "/external_connections/{id}/uploads"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[status][eq]", filterStatusEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[civic_address_id][eq]", filterCivicAddressIdEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[location_id][eq]", filterLocationIdEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_number][eq]", filterPhoneNumberEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_number][contains]", filterPhoneNumberContains));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListUploadsResponse> localVarReturnType = new GenericType<ListUploadsResponse>() {};

    return apiClient.invokeAPI("ExternalConnectionsApi.listExternalConnectionUploads", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all External Connections
   * This endpoint returns a list of your External Connections inside the &#39;data&#39; attribute of the response. External Connections are used by Telnyx customers to seamless configure SIP trunking integrations with Telnyx Partners, through External Voice Integrations in Mission Control Portal.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterConnectionNameContains If present, connections with &lt;code&gt;connection_name&lt;/code&gt; containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters. (optional)
   * @param filterExternalSipConnection If present, connections with &lt;code&gt;external_sip_connection&lt;/code&gt; matching the given value will be returned. (optional)
   * @param filterId If present, connections with &lt;code&gt;id&lt;/code&gt; matching the given value will be returned. (optional)
   * @param filterCreatedAt Filter by ISO 8601 formatted date-time string matching resource creation date-time. (optional)
   * @param filterPhoneNumberContains If present, connections associated with the given phone_number will be returned. A full match is necessary with a e164 format. (optional)
   * @return GetAllExternalConnectionsResponse
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
  public GetAllExternalConnectionsResponse listExternalConnections(Integer pageNumber, Integer pageSize, String filterConnectionNameContains, String filterExternalSipConnection, String filterId, String filterCreatedAt, String filterPhoneNumberContains) throws ApiException {
    return listExternalConnectionsWithHttpInfo(pageNumber, pageSize, filterConnectionNameContains, filterExternalSipConnection, filterId, filterCreatedAt, filterPhoneNumberContains).getData();
  }

  /**
   * List all External Connections
   * This endpoint returns a list of your External Connections inside the &#39;data&#39; attribute of the response. External Connections are used by Telnyx customers to seamless configure SIP trunking integrations with Telnyx Partners, through External Voice Integrations in Mission Control Portal.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterConnectionNameContains If present, connections with &lt;code&gt;connection_name&lt;/code&gt; containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters. (optional)
   * @param filterExternalSipConnection If present, connections with &lt;code&gt;external_sip_connection&lt;/code&gt; matching the given value will be returned. (optional)
   * @param filterId If present, connections with &lt;code&gt;id&lt;/code&gt; matching the given value will be returned. (optional)
   * @param filterCreatedAt Filter by ISO 8601 formatted date-time string matching resource creation date-time. (optional)
   * @param filterPhoneNumberContains If present, connections associated with the given phone_number will be returned. A full match is necessary with a e164 format. (optional)
   * @return ApiResponse&lt;GetAllExternalConnectionsResponse&gt;
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
  public ApiResponse<GetAllExternalConnectionsResponse> listExternalConnectionsWithHttpInfo(Integer pageNumber, Integer pageSize, String filterConnectionNameContains, String filterExternalSipConnection, String filterId, String filterCreatedAt, String filterPhoneNumberContains) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/external_connections";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[connection_name][contains]", filterConnectionNameContains));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[external_sip_connection]", filterExternalSipConnection));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[id]", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[created_at]", filterCreatedAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_number][contains]", filterPhoneNumberContains));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<GetAllExternalConnectionsResponse> localVarReturnType = new GenericType<GetAllExternalConnectionsResponse>() {};

    return apiClient.invokeAPI("ExternalConnectionsApi.listExternalConnections", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Refresh the status of all Upload requests
   * Forces a recheck of the status of all pending Upload requests for the given external connection in the background.
   * @param id Identifies the resource. (required)
   * @return CreateUploadRequestResponse1
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Status refresh is still in progress, please wait before calling again </td><td>  -  </td></tr>
     </table>
   */
  public CreateUploadRequestResponse1 refreshExternalConnectionUploads(String id) throws ApiException {
    return refreshExternalConnectionUploadsWithHttpInfo(id).getData();
  }

  /**
   * Refresh the status of all Upload requests
   * Forces a recheck of the status of all pending Upload requests for the given external connection in the background.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;CreateUploadRequestResponse1&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Status refresh is still in progress, please wait before calling again </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateUploadRequestResponse1> refreshExternalConnectionUploadsWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling refreshExternalConnectionUploads");
    }
    
    // create path and map variables
    String localVarPath = "/external_connections/{id}/uploads/refresh"
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

    GenericType<CreateUploadRequestResponse1> localVarReturnType = new GenericType<CreateUploadRequestResponse1>() {};

    return apiClient.invokeAPI("ExternalConnectionsApi.refreshExternalConnectionUploads", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retry an Upload request
   * If there were any errors during the upload process, this endpoint will retry the upload request. In some cases this will reattempt the existing upload request, in other cases it may create a new upload request. Please check the ticket_id in the response to determine if a new upload request was created.
   * @param id Identifies the resource. (required)
   * @param ticketId Identifies an Upload request (required)
   * @return GetUploadResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Order is still in progress, please wait before retrying </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public GetUploadResponse retryUpload(String id, UUID ticketId) throws ApiException {
    return retryUploadWithHttpInfo(id, ticketId).getData();
  }

  /**
   * Retry an Upload request
   * If there were any errors during the upload process, this endpoint will retry the upload request. In some cases this will reattempt the existing upload request, in other cases it may create a new upload request. Please check the ticket_id in the response to determine if a new upload request was created.
   * @param id Identifies the resource. (required)
   * @param ticketId Identifies an Upload request (required)
   * @return ApiResponse&lt;GetUploadResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Order is still in progress, please wait before retrying </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetUploadResponse> retryUploadWithHttpInfo(String id, UUID ticketId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retryUpload");
    }
    
    // verify the required parameter 'ticketId' is set
    if (ticketId == null) {
      throw new ApiException(400, "Missing the required parameter 'ticketId' when calling retryUpload");
    }
    
    // create path and map variables
    String localVarPath = "/external_connections/{id}/uploads/{ticket_id}/retry"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "ticket_id" + "\\}", apiClient.escapeString(ticketId.toString()));

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

    GenericType<GetUploadResponse> localVarReturnType = new GenericType<GetUploadResponse>() {};

    return apiClient.invokeAPI("ExternalConnectionsApi.retryUpload", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update an External Connection
   * Updates settings of an existing External Connection based on the parameters of the request.
   * @param id Identifies the resource. (required)
   * @param updateExternalConnectionRequest Parameters to be updated for the External Connection (required)
   * @return ExternalConnectionResponse
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
  public ExternalConnectionResponse updateExternalConnection(String id, UpdateExternalConnectionRequest updateExternalConnectionRequest) throws ApiException {
    return updateExternalConnectionWithHttpInfo(id, updateExternalConnectionRequest).getData();
  }

  /**
   * Update an External Connection
   * Updates settings of an existing External Connection based on the parameters of the request.
   * @param id Identifies the resource. (required)
   * @param updateExternalConnectionRequest Parameters to be updated for the External Connection (required)
   * @return ApiResponse&lt;ExternalConnectionResponse&gt;
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
  public ApiResponse<ExternalConnectionResponse> updateExternalConnectionWithHttpInfo(String id, UpdateExternalConnectionRequest updateExternalConnectionRequest) throws ApiException {
    Object localVarPostBody = updateExternalConnectionRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateExternalConnection");
    }
    
    // verify the required parameter 'updateExternalConnectionRequest' is set
    if (updateExternalConnectionRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateExternalConnectionRequest' when calling updateExternalConnection");
    }
    
    // create path and map variables
    String localVarPath = "/external_connections/{id}"
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

    GenericType<ExternalConnectionResponse> localVarReturnType = new GenericType<ExternalConnectionResponse>() {};

    return apiClient.invokeAPI("ExternalConnectionsApi.updateExternalConnection", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a phone number
   * Asynchronously update settings of the phone number associated with the given external connection.
   * @param id Identifies the resource. (required)
   * @param phoneNumberId A phone number&#39;s ID via the Telnyx API (required)
   * @param updateExternalConnectionPhoneNumberRequest Values that can be set when updating a phone number (required)
   * @return GetExternalConnectionPhoneNumberResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public GetExternalConnectionPhoneNumberResponse updateExternalConnectionPhoneNumber(String id, String phoneNumberId, UpdateExternalConnectionPhoneNumberRequest updateExternalConnectionPhoneNumberRequest) throws ApiException {
    return updateExternalConnectionPhoneNumberWithHttpInfo(id, phoneNumberId, updateExternalConnectionPhoneNumberRequest).getData();
  }

  /**
   * Update a phone number
   * Asynchronously update settings of the phone number associated with the given external connection.
   * @param id Identifies the resource. (required)
   * @param phoneNumberId A phone number&#39;s ID via the Telnyx API (required)
   * @param updateExternalConnectionPhoneNumberRequest Values that can be set when updating a phone number (required)
   * @return ApiResponse&lt;GetExternalConnectionPhoneNumberResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetExternalConnectionPhoneNumberResponse> updateExternalConnectionPhoneNumberWithHttpInfo(String id, String phoneNumberId, UpdateExternalConnectionPhoneNumberRequest updateExternalConnectionPhoneNumberRequest) throws ApiException {
    Object localVarPostBody = updateExternalConnectionPhoneNumberRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateExternalConnectionPhoneNumber");
    }
    
    // verify the required parameter 'phoneNumberId' is set
    if (phoneNumberId == null) {
      throw new ApiException(400, "Missing the required parameter 'phoneNumberId' when calling updateExternalConnectionPhoneNumber");
    }
    
    // verify the required parameter 'updateExternalConnectionPhoneNumberRequest' is set
    if (updateExternalConnectionPhoneNumberRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateExternalConnectionPhoneNumberRequest' when calling updateExternalConnectionPhoneNumber");
    }
    
    // create path and map variables
    String localVarPath = "/external_connections/{id}/phone_numbers/{phone_number_id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "phone_number_id" + "\\}", apiClient.escapeString(phoneNumberId.toString()));

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

    GenericType<GetExternalConnectionPhoneNumberResponse> localVarReturnType = new GenericType<GetExternalConnectionPhoneNumberResponse>() {};

    return apiClient.invokeAPI("ExternalConnectionsApi.updateExternalConnectionPhoneNumber", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a location&#39;s static emergency address
   * 
   * @param id The ID of the external connection (required)
   * @param locationId The ID of the location to update (required)
   * @param updateLocationRequest  (required)
   * @return LocationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Location successfully updated with no associated orders to process </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Location update accepted; associated orders being processed </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Location or external connection not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity - Location already has an accepted emergency address </td><td>  -  </td></tr>
     </table>
   */
  public LocationResponse updateLocation(UUID id, UUID locationId, UpdateLocationRequest updateLocationRequest) throws ApiException {
    return updateLocationWithHttpInfo(id, locationId, updateLocationRequest).getData();
  }

  /**
   * Update a location&#39;s static emergency address
   * 
   * @param id The ID of the external connection (required)
   * @param locationId The ID of the location to update (required)
   * @param updateLocationRequest  (required)
   * @return ApiResponse&lt;LocationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Location successfully updated with no associated orders to process </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Location update accepted; associated orders being processed </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Location or external connection not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity - Location already has an accepted emergency address </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<LocationResponse> updateLocationWithHttpInfo(UUID id, UUID locationId, UpdateLocationRequest updateLocationRequest) throws ApiException {
    Object localVarPostBody = updateLocationRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateLocation");
    }
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling updateLocation");
    }
    
    // verify the required parameter 'updateLocationRequest' is set
    if (updateLocationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateLocationRequest' when calling updateLocation");
    }
    
    // create path and map variables
    String localVarPath = "/v2/external_connections/{id}/locations/{location_id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()));

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

    GenericType<LocationResponse> localVarReturnType = new GenericType<LocationResponse>() {};

    return apiClient.invokeAPI("ExternalConnectionsApi.updateLocation", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
