package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.ListRecordingTranscriptionsResponse;
import com.telnyx.sdk.model.ResourceNotFound;
import com.telnyx.sdk.model.TexmlRecordingTranscription;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class TeXmlTwilioCompatibleRestCommandsApi {
  private ApiClient apiClient;

  public TeXmlTwilioCompatibleRestCommandsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TeXmlTwilioCompatibleRestCommandsApi(ApiClient apiClient) {
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


private ApiResponse<Void> deleteTeXMLRecordingTranscriptionWithHttpInfo(String accountSid, UUID recordingTranscriptionSid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(400, "Missing the required parameter 'accountSid' when calling deleteTeXMLRecordingTranscription");
    }
    
    // verify the required parameter 'recordingTranscriptionSid' is set
    if (recordingTranscriptionSid == null) {
      throw new ApiException(400, "Missing the required parameter 'recordingTranscriptionSid' when calling deleteTeXMLRecordingTranscription");
    }
    
    // create path and map variables
    String localVarPath = "/texml/Accounts/{account_sid}/Transcriptions/{recording_transcription_sid}.json"
      .replaceAll("\\{" + "account_sid" + "\\}", apiClient.escapeString(accountSid.toString()))
      .replaceAll("\\{" + "recording_transcription_sid" + "\\}", apiClient.escapeString(recordingTranscriptionSid.toString()));

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

    return apiClient.invokeAPI("TeXmlTwilioCompatibleRestCommandsApi.deleteTeXMLRecordingTranscription", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }

  public class APIdeleteTeXMLRecordingTranscriptionRequest {
    private String accountSid;
    private UUID recordingTranscriptionSid;

    private APIdeleteTeXMLRecordingTranscriptionRequest(String accountSid, UUID recordingTranscriptionSid) {
      this.accountSid = accountSid;
      this.recordingTranscriptionSid = recordingTranscriptionSid;
    }

    /**
     * Execute deleteTeXMLRecordingTranscription request
     
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 204 </td><td> The resource was deleted successfully. </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public void execute() throws ApiException {
      this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deleteTeXMLRecordingTranscription request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 204 </td><td> The resource was deleted successfully. </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return deleteTeXMLRecordingTranscriptionWithHttpInfo(accountSid, recordingTranscriptionSid);
    }
  }

  /**
   * Delete a recording transcription
   * Permanently deletes a recording transcription.
   * @param accountSid The id of the account the resource belongs to. (required)
   * @param recordingTranscriptionSid Uniquely identifies the recording transcription by id. (required)
   * @return deleteTeXMLRecordingTranscriptionRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIdeleteTeXMLRecordingTranscriptionRequest deleteTeXMLRecordingTranscription(String accountSid, UUID recordingTranscriptionSid) throws ApiException {
    return new APIdeleteTeXMLRecordingTranscriptionRequest(accountSid, recordingTranscriptionSid);
  }

private ApiResponse<TexmlRecordingTranscription> getTeXMLRecordingTranscriptionWithHttpInfo(String accountSid, UUID recordingTranscriptionSid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(400, "Missing the required parameter 'accountSid' when calling getTeXMLRecordingTranscription");
    }
    
    // verify the required parameter 'recordingTranscriptionSid' is set
    if (recordingTranscriptionSid == null) {
      throw new ApiException(400, "Missing the required parameter 'recordingTranscriptionSid' when calling getTeXMLRecordingTranscription");
    }
    
    // create path and map variables
    String localVarPath = "/texml/Accounts/{account_sid}/Transcriptions/{recording_transcription_sid}.json"
      .replaceAll("\\{" + "account_sid" + "\\}", apiClient.escapeString(accountSid.toString()))
      .replaceAll("\\{" + "recording_transcription_sid" + "\\}", apiClient.escapeString(recordingTranscriptionSid.toString()));

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

    GenericType<TexmlRecordingTranscription> localVarReturnType = new GenericType<TexmlRecordingTranscription>() {};

    return apiClient.invokeAPI("TeXmlTwilioCompatibleRestCommandsApi.getTeXMLRecordingTranscription", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetTeXMLRecordingTranscriptionRequest {
    private String accountSid;
    private UUID recordingTranscriptionSid;

    private APIgetTeXMLRecordingTranscriptionRequest(String accountSid, UUID recordingTranscriptionSid) {
      this.accountSid = accountSid;
      this.recordingTranscriptionSid = recordingTranscriptionSid;
    }

    /**
     * Execute getTeXMLRecordingTranscription request
     * @return TexmlRecordingTranscription
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful get Recording Transcription Response </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public TexmlRecordingTranscription execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getTeXMLRecordingTranscription request with HTTP info returned
     * @return ApiResponse&lt;TexmlRecordingTranscription&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful get Recording Transcription Response </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<TexmlRecordingTranscription> executeWithHttpInfo() throws ApiException {
      return getTeXMLRecordingTranscriptionWithHttpInfo(accountSid, recordingTranscriptionSid);
    }
  }

  /**
   * Fetch a recording transcription resource
   * Returns the recording transcription resource identified by its ID.
   * @param accountSid The id of the account the resource belongs to. (required)
   * @param recordingTranscriptionSid Uniquely identifies the recording transcription by id. (required)
   * @return getTeXMLRecordingTranscriptionRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetTeXMLRecordingTranscriptionRequest getTeXMLRecordingTranscription(String accountSid, UUID recordingTranscriptionSid) throws ApiException {
    return new APIgetTeXMLRecordingTranscriptionRequest(accountSid, recordingTranscriptionSid);
  }

private ApiResponse<ListRecordingTranscriptionsResponse> getTeXMLRecordingTranscriptionsWithHttpInfo(String accountSid, String pageToken, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(400, "Missing the required parameter 'accountSid' when calling getTeXMLRecordingTranscriptions");
    }
    
    // create path and map variables
    String localVarPath = "/texml/Accounts/{account_sid}/Transcriptions.json"
      .replaceAll("\\{" + "account_sid" + "\\}", apiClient.escapeString(accountSid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "PageToken", pageToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListRecordingTranscriptionsResponse> localVarReturnType = new GenericType<ListRecordingTranscriptionsResponse>() {};

    return apiClient.invokeAPI("TeXmlTwilioCompatibleRestCommandsApi.getTeXMLRecordingTranscriptions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIgetTeXMLRecordingTranscriptionsRequest {
    private String accountSid;
    private String pageToken;
    private Integer pageSize;

    private APIgetTeXMLRecordingTranscriptionsRequest(String accountSid) {
      this.accountSid = accountSid;
    }

    /**
     * Set pageToken
     * @param pageToken Used to request the next page of results. (optional)
     * @return APIgetTeXMLRecordingTranscriptionsRequest
     */
    public APIgetTeXMLRecordingTranscriptionsRequest pageToken(String pageToken) {
      this.pageToken = pageToken;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page (optional, default to 20)
     * @return APIgetTeXMLRecordingTranscriptionsRequest
     */
    public APIgetTeXMLRecordingTranscriptionsRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Execute getTeXMLRecordingTranscriptions request
     * @return ListRecordingTranscriptionsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful list Recording Transcriptions Response </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListRecordingTranscriptionsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getTeXMLRecordingTranscriptions request with HTTP info returned
     * @return ApiResponse&lt;ListRecordingTranscriptionsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful list Recording Transcriptions Response </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListRecordingTranscriptionsResponse> executeWithHttpInfo() throws ApiException {
      return getTeXMLRecordingTranscriptionsWithHttpInfo(accountSid, pageToken, pageSize);
    }
  }

  /**
   * List recording transcriptions
   * Returns multiple recording transcriptions resources for an account.
   * @param accountSid The id of the account the resource belongs to. (required)
   * @return getTeXMLRecordingTranscriptionsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIgetTeXMLRecordingTranscriptionsRequest getTeXMLRecordingTranscriptions(String accountSid) throws ApiException {
    return new APIgetTeXMLRecordingTranscriptionsRequest(accountSid);
  }
}
