package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.TeXmlRESTCommandResponse;
import com.telnyx.sdk.model.UpdateCallRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TeXmlRestCommandsApi {
  private ApiClient apiClient;

  public TeXmlRestCommandsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TeXmlRestCommandsApi(ApiClient apiClient) {
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


private ApiResponse<TeXmlRESTCommandResponse> updateTeXMLCallWithHttpInfo(String callSid, UpdateCallRequest updateCallRequest) throws ApiException {
    Object localVarPostBody = updateCallRequest;
    
    // verify the required parameter 'callSid' is set
    if (callSid == null) {
      throw new ApiException(400, "Missing the required parameter 'callSid' when calling updateTeXMLCall");
    }
    
    // verify the required parameter 'updateCallRequest' is set
    if (updateCallRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateCallRequest' when calling updateTeXMLCall");
    }
    
    // create path and map variables
    String localVarPath = "/texml/{call_sid}/update"
      .replaceAll("\\{" + "call_sid" + "\\}", apiClient.escapeString(callSid.toString()));

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

    GenericType<TeXmlRESTCommandResponse> localVarReturnType = new GenericType<TeXmlRESTCommandResponse>() {};

    return apiClient.invokeAPI("TeXmlRestCommandsApi.updateTeXMLCall", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIupdateTeXMLCallRequest {
    private String callSid;
    private UpdateCallRequest updateCallRequest;

    private APIupdateTeXMLCallRequest(String callSid) {
      this.callSid = callSid;
    }

    /**
     * Set updateCallRequest
     * @param updateCallRequest Update Call request object (required)
     * @return APIupdateTeXMLCallRequest
     */
    public APIupdateTeXMLCallRequest updateCallRequest(UpdateCallRequest updateCallRequest) {
      this.updateCallRequest = updateCallRequest;
      return this;
    }

    /**
     * Execute updateTeXMLCall request
     * @return TeXmlRESTCommandResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response upon updating a TeXml call. </td><td>  -  </td></tr>
       </table>
     
     */
    
    public TeXmlRESTCommandResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateTeXMLCall request with HTTP info returned
     * @return ApiResponse&lt;TeXmlRESTCommandResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response upon updating a TeXml call. </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<TeXmlRESTCommandResponse> executeWithHttpInfo() throws ApiException {
      return updateTeXMLCallWithHttpInfo(callSid, updateCallRequest);
    }
  }

  /**
   * Update call
   * Update TeXml call
   * @param callSid The CallSid that identifies the call to update. (required)
   * @return updateTeXMLCallRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIupdateTeXMLCallRequest updateTeXMLCall(String callSid) throws ApiException {
    return new APIupdateTeXMLCallRequest(callSid);
  }
}
