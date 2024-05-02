package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CredentialsResponse;
import com.telnyx.sdk.model.CustomStorageConfiguration;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.GetRecordingTranscription200Response;
import com.telnyx.sdk.model.GetRecordingTranscriptions200Response;
import com.telnyx.sdk.model.GetRecordings200Response;
import com.telnyx.sdk.model.RecordingResponse;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class CallRecordingsApi {
  private ApiClient apiClient;

  public CallRecordingsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CallRecordingsApi(ApiClient apiClient) {
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
   * Create a custom storage credential
   * Creates a custom storage credentials configuration.
   * @param connectionId Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource. (required)
   * @param customStorageConfiguration Creates new credentials resource for given connection_id. (required)
   * @return CredentialsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A response with credentials resource. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CredentialsResponse createCustomStorageCredentials(String connectionId, CustomStorageConfiguration customStorageConfiguration) throws ApiException {
    return createCustomStorageCredentialsWithHttpInfo(connectionId, customStorageConfiguration).getData();
  }

  /**
   * Create a custom storage credential
   * Creates a custom storage credentials configuration.
   * @param connectionId Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource. (required)
   * @param customStorageConfiguration Creates new credentials resource for given connection_id. (required)
   * @return ApiResponse&lt;CredentialsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A response with credentials resource. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CredentialsResponse> createCustomStorageCredentialsWithHttpInfo(String connectionId, CustomStorageConfiguration customStorageConfiguration) throws ApiException {
    Object localVarPostBody = customStorageConfiguration;
    
    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectionId' when calling createCustomStorageCredentials");
    }
    
    // verify the required parameter 'customStorageConfiguration' is set
    if (customStorageConfiguration == null) {
      throw new ApiException(400, "Missing the required parameter 'customStorageConfiguration' when calling createCustomStorageCredentials");
    }
    
    // create path and map variables
    String localVarPath = "/custom_storage_credentials/{connection_id}"
      .replaceAll("\\{" + "connection_id" + "\\}", apiClient.escapeString(connectionId.toString()));

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

    GenericType<CredentialsResponse> localVarReturnType = new GenericType<CredentialsResponse>() {};

    return apiClient.invokeAPI("CallRecordingsApi.createCustomStorageCredentials", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a stored credential
   * Deletes a stored custom credentials configuration.
   * @param connectionId Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The credentials configuration for connection_id was deleted successfully. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public void deleteCustomStorageCredentials(String connectionId) throws ApiException {
    deleteCustomStorageCredentialsWithHttpInfo(connectionId);
  }

  /**
   * Delete a stored credential
   * Deletes a stored custom credentials configuration.
   * @param connectionId Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The credentials configuration for connection_id was deleted successfully. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteCustomStorageCredentialsWithHttpInfo(String connectionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectionId' when calling deleteCustomStorageCredentials");
    }
    
    // create path and map variables
    String localVarPath = "/custom_storage_credentials/{connection_id}"
      .replaceAll("\\{" + "connection_id" + "\\}", apiClient.escapeString(connectionId.toString()));

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

    return apiClient.invokeAPI("CallRecordingsApi.deleteCustomStorageCredentials", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Delete a call recording
   * Permanently deletes a call recording.
   * @param recordingId Uniquely identifies the recording by id. (required)
   * @return RecordingResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A response with recording resource. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public RecordingResponse deleteRecording(String recordingId) throws ApiException {
    return deleteRecordingWithHttpInfo(recordingId).getData();
  }

  /**
   * Delete a call recording
   * Permanently deletes a call recording.
   * @param recordingId Uniquely identifies the recording by id. (required)
   * @return ApiResponse&lt;RecordingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A response with recording resource. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RecordingResponse> deleteRecordingWithHttpInfo(String recordingId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'recordingId' is set
    if (recordingId == null) {
      throw new ApiException(400, "Missing the required parameter 'recordingId' when calling deleteRecording");
    }
    
    // create path and map variables
    String localVarPath = "/recordings/{recording_id}"
      .replaceAll("\\{" + "recording_id" + "\\}", apiClient.escapeString(recordingId.toString()));

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

    GenericType<RecordingResponse> localVarReturnType = new GenericType<RecordingResponse>() {};

    return apiClient.invokeAPI("CallRecordingsApi.deleteRecording", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a recording transcription
   * Permanently deletes a recording transcription.
   * @param recordingTranscriptionId  (required)
   * @return GetRecordingTranscription200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A response with a recording transcription resource. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetRecordingTranscription200Response deleteRecordingTranscription(UUID recordingTranscriptionId) throws ApiException {
    return deleteRecordingTranscriptionWithHttpInfo(recordingTranscriptionId).getData();
  }

  /**
   * Delete a recording transcription
   * Permanently deletes a recording transcription.
   * @param recordingTranscriptionId  (required)
   * @return ApiResponse&lt;GetRecordingTranscription200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A response with a recording transcription resource. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetRecordingTranscription200Response> deleteRecordingTranscriptionWithHttpInfo(UUID recordingTranscriptionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'recordingTranscriptionId' is set
    if (recordingTranscriptionId == null) {
      throw new ApiException(400, "Missing the required parameter 'recordingTranscriptionId' when calling deleteRecordingTranscription");
    }
    
    // create path and map variables
    String localVarPath = "/recording_transcriptions/{recording_transcription_id}"
      .replaceAll("\\{" + "recording_transcription_id" + "\\}", apiClient.escapeString(recordingTranscriptionId.toString()));

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

    GenericType<GetRecordingTranscription200Response> localVarReturnType = new GenericType<GetRecordingTranscription200Response>() {};

    return apiClient.invokeAPI("CallRecordingsApi.deleteRecordingTranscription", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a list of call recordings
   * Permanently deletes a list of call recordings.
   * @param requestBody Deletes recordings for given ids. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The recordings have been successfully deleted. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public void deleteRecordings(List<String> requestBody) throws ApiException {
    deleteRecordingsWithHttpInfo(requestBody);
  }

  /**
   * Delete a list of call recordings
   * Permanently deletes a list of call recordings.
   * @param requestBody Deletes recordings for given ids. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The recordings have been successfully deleted. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteRecordingsWithHttpInfo(List<String> requestBody) throws ApiException {
    Object localVarPostBody = requestBody;
    
    // verify the required parameter 'requestBody' is set
    if (requestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'requestBody' when calling deleteRecordings");
    }
    
    // create path and map variables
    String localVarPath = "/recordings/actions/delete";

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

    return apiClient.invokeAPI("CallRecordingsApi.deleteRecordings", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Retrieve a stored credential
   * Returns the information about custom storage credentials.
   * @param connectionId Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource. (required)
   * @return CredentialsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A response with credentials resource. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CredentialsResponse getCustomStorageCredentials(String connectionId) throws ApiException {
    return getCustomStorageCredentialsWithHttpInfo(connectionId).getData();
  }

  /**
   * Retrieve a stored credential
   * Returns the information about custom storage credentials.
   * @param connectionId Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource. (required)
   * @return ApiResponse&lt;CredentialsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A response with credentials resource. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CredentialsResponse> getCustomStorageCredentialsWithHttpInfo(String connectionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectionId' when calling getCustomStorageCredentials");
    }
    
    // create path and map variables
    String localVarPath = "/custom_storage_credentials/{connection_id}"
      .replaceAll("\\{" + "connection_id" + "\\}", apiClient.escapeString(connectionId.toString()));

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

    GenericType<CredentialsResponse> localVarReturnType = new GenericType<CredentialsResponse>() {};

    return apiClient.invokeAPI("CallRecordingsApi.getCustomStorageCredentials", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a call recording
   * Retrieves the details of an existing call recording.
   * @param recordingId Uniquely identifies the recording by id. (required)
   * @return RecordingResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A response with recording resource. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public RecordingResponse getRecording(String recordingId) throws ApiException {
    return getRecordingWithHttpInfo(recordingId).getData();
  }

  /**
   * Retrieve a call recording
   * Retrieves the details of an existing call recording.
   * @param recordingId Uniquely identifies the recording by id. (required)
   * @return ApiResponse&lt;RecordingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A response with recording resource. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RecordingResponse> getRecordingWithHttpInfo(String recordingId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'recordingId' is set
    if (recordingId == null) {
      throw new ApiException(400, "Missing the required parameter 'recordingId' when calling getRecording");
    }
    
    // create path and map variables
    String localVarPath = "/recordings/{recording_id}"
      .replaceAll("\\{" + "recording_id" + "\\}", apiClient.escapeString(recordingId.toString()));

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

    GenericType<RecordingResponse> localVarReturnType = new GenericType<RecordingResponse>() {};

    return apiClient.invokeAPI("CallRecordingsApi.getRecording", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a recording transcription
   * Retrieves the details of an existing recording transcription
   * @param recordingTranscriptionId  (required)
   * @return GetRecordingTranscription200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A response with a recording transcription resource. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetRecordingTranscription200Response getRecordingTranscription(UUID recordingTranscriptionId) throws ApiException {
    return getRecordingTranscriptionWithHttpInfo(recordingTranscriptionId).getData();
  }

  /**
   * Retrieve a recording transcription
   * Retrieves the details of an existing recording transcription
   * @param recordingTranscriptionId  (required)
   * @return ApiResponse&lt;GetRecordingTranscription200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A response with a recording transcription resource. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetRecordingTranscription200Response> getRecordingTranscriptionWithHttpInfo(UUID recordingTranscriptionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'recordingTranscriptionId' is set
    if (recordingTranscriptionId == null) {
      throw new ApiException(400, "Missing the required parameter 'recordingTranscriptionId' when calling getRecordingTranscription");
    }
    
    // create path and map variables
    String localVarPath = "/recording_transcriptions/{recording_transcription_id}"
      .replaceAll("\\{" + "recording_transcription_id" + "\\}", apiClient.escapeString(recordingTranscriptionId.toString()));

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

    GenericType<GetRecordingTranscription200Response> localVarReturnType = new GenericType<GetRecordingTranscription200Response>() {};

    return apiClient.invokeAPI("CallRecordingsApi.getRecordingTranscription", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all recording transcriptions
   * Returns a list of your recording transcriptions.
   * @return GetRecordingTranscriptions200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A response listing recording transcriptions </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetRecordingTranscriptions200Response getRecordingTranscriptions() throws ApiException {
    return getRecordingTranscriptionsWithHttpInfo().getData();
  }

  /**
   * List all recording transcriptions
   * Returns a list of your recording transcriptions.
   * @return ApiResponse&lt;GetRecordingTranscriptions200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A response listing recording transcriptions </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetRecordingTranscriptions200Response> getRecordingTranscriptionsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/recording_transcriptions";

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

    GenericType<GetRecordingTranscriptions200Response> localVarReturnType = new GenericType<GetRecordingTranscriptions200Response>() {};

    return apiClient.invokeAPI("CallRecordingsApi.getRecordingTranscriptions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all call recordings
   * Returns a list of your call recordings.
   * @param filterConferenceId Returns only recordings associated with a given conference (optional)
   * @param filterCreatedAtGte Returns only recordings created later than or at given ISO 8601 datetime (optional)
   * @param filterCreatedAtLte Returns only recordings created earlier than or at given ISO 8601 datetime (optional)
   * @param filterCallLegId If present, recordings will be filtered to those with a matching call_leg_id. (optional)
   * @param filterCallSessionId If present, recordings will be filtered to those with a matching call_session_id. (optional)
   * @param filterFrom If present, recordings will be filtered to those with a matching &#x60;from&#x60; attribute. Matching is case-sensitive (optional)
   * @param filterTo If present, recordings will be filtered to those with a matching &#x60;to&#x60; attribute. Matching is case-sensitive (optional)
   * @param filterConnectionId If present, recordings will be filtered to those with a matching &#x60;connection_id&#x60; attribute. Matching is case-sensitive (optional)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return GetRecordings200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A response with recordings. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public GetRecordings200Response getRecordings(String filterConferenceId, String filterCreatedAtGte, String filterCreatedAtLte, UUID filterCallLegId, UUID filterCallSessionId, String filterFrom, String filterTo, String filterConnectionId, Integer pageNumber, Integer pageSize) throws ApiException {
    return getRecordingsWithHttpInfo(filterConferenceId, filterCreatedAtGte, filterCreatedAtLte, filterCallLegId, filterCallSessionId, filterFrom, filterTo, filterConnectionId, pageNumber, pageSize).getData();
  }

  /**
   * List all call recordings
   * Returns a list of your call recordings.
   * @param filterConferenceId Returns only recordings associated with a given conference (optional)
   * @param filterCreatedAtGte Returns only recordings created later than or at given ISO 8601 datetime (optional)
   * @param filterCreatedAtLte Returns only recordings created earlier than or at given ISO 8601 datetime (optional)
   * @param filterCallLegId If present, recordings will be filtered to those with a matching call_leg_id. (optional)
   * @param filterCallSessionId If present, recordings will be filtered to those with a matching call_session_id. (optional)
   * @param filterFrom If present, recordings will be filtered to those with a matching &#x60;from&#x60; attribute. Matching is case-sensitive (optional)
   * @param filterTo If present, recordings will be filtered to those with a matching &#x60;to&#x60; attribute. Matching is case-sensitive (optional)
   * @param filterConnectionId If present, recordings will be filtered to those with a matching &#x60;connection_id&#x60; attribute. Matching is case-sensitive (optional)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;GetRecordings200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A response with recordings. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetRecordings200Response> getRecordingsWithHttpInfo(String filterConferenceId, String filterCreatedAtGte, String filterCreatedAtLte, UUID filterCallLegId, UUID filterCallSessionId, String filterFrom, String filterTo, String filterConnectionId, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/recordings";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[conference_id]", filterConferenceId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[created_at][gte]", filterCreatedAtGte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[created_at][lte]", filterCreatedAtLte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[call_leg_id]", filterCallLegId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[call_session_id]", filterCallSessionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[from]", filterFrom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[to]", filterTo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[connection_id]", filterConnectionId));
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

    GenericType<GetRecordings200Response> localVarReturnType = new GenericType<GetRecordings200Response>() {};

    return apiClient.invokeAPI("CallRecordingsApi.getRecordings", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a stored credential
   * Updates a stored custom credentials configuration.
   * @param connectionId Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource. (required)
   * @param customStorageConfiguration Creates new credentials resource for given connection_id. (required)
   * @return CredentialsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A response with credentials resource. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CredentialsResponse updateCustomStorageCredentials(String connectionId, CustomStorageConfiguration customStorageConfiguration) throws ApiException {
    return updateCustomStorageCredentialsWithHttpInfo(connectionId, customStorageConfiguration).getData();
  }

  /**
   * Update a stored credential
   * Updates a stored custom credentials configuration.
   * @param connectionId Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource. (required)
   * @param customStorageConfiguration Creates new credentials resource for given connection_id. (required)
   * @return ApiResponse&lt;CredentialsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A response with credentials resource. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CredentialsResponse> updateCustomStorageCredentialsWithHttpInfo(String connectionId, CustomStorageConfiguration customStorageConfiguration) throws ApiException {
    Object localVarPostBody = customStorageConfiguration;
    
    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectionId' when calling updateCustomStorageCredentials");
    }
    
    // verify the required parameter 'customStorageConfiguration' is set
    if (customStorageConfiguration == null) {
      throw new ApiException(400, "Missing the required parameter 'customStorageConfiguration' when calling updateCustomStorageCredentials");
    }
    
    // create path and map variables
    String localVarPath = "/custom_storage_credentials/{connection_id}"
      .replaceAll("\\{" + "connection_id" + "\\}", apiClient.escapeString(connectionId.toString()));

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

    GenericType<CredentialsResponse> localVarReturnType = new GenericType<CredentialsResponse>() {};

    return apiClient.invokeAPI("CallRecordingsApi.updateCustomStorageCredentials", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
