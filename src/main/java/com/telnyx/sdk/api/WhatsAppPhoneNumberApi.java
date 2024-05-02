package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Errors;
import java.io.File;
import com.telnyx.sdk.model.UpdateWhatsappPhoneNumberAboutRequest;
import com.telnyx.sdk.model.UpdateWhatsappPhoneNumberRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsAppPhoneNumberApi {
  private ApiClient apiClient;

  public WhatsAppPhoneNumberApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WhatsAppPhoneNumberApi(ApiClient apiClient) {
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


private ApiResponse<String> patchWhatsappPhoneNumberWithHttpInfo(String id, UpdateWhatsappPhoneNumberRequest updateWhatsappPhoneNumberRequest) throws ApiException {
    Object localVarPostBody = updateWhatsappPhoneNumberRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling patchWhatsappPhoneNumber");
    }
    
    // verify the required parameter 'updateWhatsappPhoneNumberRequest' is set
    if (updateWhatsappPhoneNumberRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateWhatsappPhoneNumberRequest' when calling patchWhatsappPhoneNumber");
    }
    
    // create path and map variables
    String localVarPath = "/whatsapp_phone_numbers/{id}"
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

    GenericType<String> localVarReturnType = new GenericType<String>() {};

    return apiClient.invokeAPI("WhatsAppPhoneNumberApi.patchWhatsappPhoneNumber", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIpatchWhatsappPhoneNumberRequest {
    private String id;
    private UpdateWhatsappPhoneNumberRequest updateWhatsappPhoneNumberRequest;

    private APIpatchWhatsappPhoneNumberRequest(String id) {
      this.id = id;
    }

    /**
     * Set updateWhatsappPhoneNumberRequest
     * @param updateWhatsappPhoneNumberRequest  (required)
     * @return APIpatchWhatsappPhoneNumberRequest
     */
    public APIpatchWhatsappPhoneNumberRequest updateWhatsappPhoneNumberRequest(UpdateWhatsappPhoneNumberRequest updateWhatsappPhoneNumberRequest) {
      this.updateWhatsappPhoneNumberRequest = updateWhatsappPhoneNumberRequest;
      return this;
    }

    /**
     * Execute patchWhatsappPhoneNumber request
     * @return WhatsAppPhoneNumber
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Updated WhatsApp Phone Number details </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public String execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute patchWhatsappPhoneNumber request with HTTP info returned
     * @return ApiResponse&lt;WhatsAppPhoneNumber&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Updated WhatsApp Phone Number details </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<String> executeWithHttpInfo() throws ApiException {
      return patchWhatsappPhoneNumberWithHttpInfo(id, updateWhatsappPhoneNumberRequest);
    }
  }

  /**
   * Update a WhatsApp Phone Number webhook
   * 
   * @param id Identifies the WhatsApp Phone Number (required)
   * @return patchWhatsappPhoneNumberRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIpatchWhatsappPhoneNumberRequest patchWhatsappPhoneNumber(String id) throws ApiException {
    return new APIpatchWhatsappPhoneNumberRequest(id);
  }

private ApiResponse<Void> patchWhatsappPhoneNumberAboutWithHttpInfo(String id, UpdateWhatsappPhoneNumberAboutRequest updateWhatsappPhoneNumberAboutRequest) throws ApiException {
    Object localVarPostBody = updateWhatsappPhoneNumberAboutRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling patchWhatsappPhoneNumberAbout");
    }
    
    // verify the required parameter 'updateWhatsappPhoneNumberAboutRequest' is set
    if (updateWhatsappPhoneNumberAboutRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateWhatsappPhoneNumberAboutRequest' when calling patchWhatsappPhoneNumberAbout");
    }
    
    // create path and map variables
    String localVarPath = "/whatsapp_phone_numbers/{id}/about"
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

    return apiClient.invokeAPI("WhatsAppPhoneNumberApi.patchWhatsappPhoneNumberAbout", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }

  public class APIpatchWhatsappPhoneNumberAboutRequest {
    private String id;
    private UpdateWhatsappPhoneNumberAboutRequest updateWhatsappPhoneNumberAboutRequest;

    private APIpatchWhatsappPhoneNumberAboutRequest(String id) {
      this.id = id;
    }

    /**
     * Set updateWhatsappPhoneNumberAboutRequest
     * @param updateWhatsappPhoneNumberAboutRequest  (required)
     * @return APIpatchWhatsappPhoneNumberAboutRequest
     */
    public APIpatchWhatsappPhoneNumberAboutRequest updateWhatsappPhoneNumberAboutRequest(UpdateWhatsappPhoneNumberAboutRequest updateWhatsappPhoneNumberAboutRequest) {
      this.updateWhatsappPhoneNumberAboutRequest = updateWhatsappPhoneNumberAboutRequest;
      return this;
    }

    /**
     * Execute patchWhatsappPhoneNumberAbout request
     
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Updated WhatsApp Phone Number about text </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public void execute() throws ApiException {
      this.executeWithHttpInfo().getData();
    }

    /**
     * Execute patchWhatsappPhoneNumberAbout request with HTTP info returned
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Updated WhatsApp Phone Number about text </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
      return patchWhatsappPhoneNumberAboutWithHttpInfo(id, updateWhatsappPhoneNumberAboutRequest);
    }
  }

  /**
   * Update a WhatsApp Phone Number about text
   * 
   * @param id Identifies the WhatsApp Phone Number (required)
   * @return patchWhatsappPhoneNumberAboutRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIpatchWhatsappPhoneNumberAboutRequest patchWhatsappPhoneNumberAbout(String id) throws ApiException {
    return new APIpatchWhatsappPhoneNumberAboutRequest(id);
  }

private ApiResponse<String> patchWhatsappProfilePhotoWithHttpInfo(String id, File photo) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling patchWhatsappProfilePhoto");
    }
    
    // verify the required parameter 'photo' is set
    if (photo == null) {
      throw new ApiException(400, "Missing the required parameter 'photo' when calling patchWhatsappProfilePhoto");
    }
    
    // create path and map variables
    String localVarPath = "/whatsapp_phone_numbers/{id}/photo"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    if (photo != null)
      localVarFormParams.put("photo", photo);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<String> localVarReturnType = new GenericType<String>() {};

    return apiClient.invokeAPI("WhatsAppPhoneNumberApi.patchWhatsappProfilePhoto", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIpatchWhatsappProfilePhotoRequest {
    private String id;
    private File photo;

    private APIpatchWhatsappProfilePhotoRequest(String id) {
      this.id = id;
    }

    /**
     * Set photo
     * @param photo Must be an image with exactly 640x640px dimensions. (required)
     * @return APIpatchWhatsappProfilePhotoRequest
     */
    public APIpatchWhatsappProfilePhotoRequest photo(File photo) {
      this.photo = photo;
      return this;
    }

    /**
     * Execute patchWhatsappProfilePhoto request
     * @return WhatsAppProfilePhoto
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> WhatsApp Profile Photo </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public String execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute patchWhatsappProfilePhoto request with HTTP info returned
     * @return ApiResponse&lt;WhatsAppProfilePhoto&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> WhatsApp Profile Photo </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<String> executeWithHttpInfo() throws ApiException {
      return patchWhatsappProfilePhotoWithHttpInfo(id, photo);
    }
  }

  /**
   * Update the Whatsapp Profile Photo for a given Whatsapp Phone Number
   * 
   * @param id Identifies the WhatsApp Phone Number (required)
   * @return patchWhatsappProfilePhotoRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIpatchWhatsappProfilePhotoRequest patchWhatsappProfilePhoto(String id) throws ApiException {
    return new APIpatchWhatsappProfilePhotoRequest(id);
  }

private ApiResponse<String> retrieveWhatsappPhoneNumberWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retrieveWhatsappPhoneNumber");
    }
    
    // create path and map variables
    String localVarPath = "/whatsapp_phone_numbers/{id}"
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

    GenericType<String> localVarReturnType = new GenericType<String>() {};

    return apiClient.invokeAPI("WhatsAppPhoneNumberApi.retrieveWhatsappPhoneNumber", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIretrieveWhatsappPhoneNumberRequest {
    private String id;

    private APIretrieveWhatsappPhoneNumberRequest(String id) {
      this.id = id;
    }

    /**
     * Execute retrieveWhatsappPhoneNumber request
     * @return WhatsAppPhoneNumber
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> WhatsApp Phone Number details </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public String execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute retrieveWhatsappPhoneNumber request with HTTP info returned
     * @return ApiResponse&lt;WhatsAppPhoneNumber&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> WhatsApp Phone Number details </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<String> executeWithHttpInfo() throws ApiException {
      return retrieveWhatsappPhoneNumberWithHttpInfo(id);
    }
  }

  /**
   * Retrieves a WhatsApp Phone Number
   * 
   * @param id Identifies the WhatsApp Phone Number (required)
   * @return retrieveWhatsappPhoneNumberRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIretrieveWhatsappPhoneNumberRequest retrieveWhatsappPhoneNumber(String id) throws ApiException {
    return new APIretrieveWhatsappPhoneNumberRequest(id);
  }

private ApiResponse<String> retrieveWhatsappProfilePhotoWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retrieveWhatsappProfilePhoto");
    }
    
    // create path and map variables
    String localVarPath = "/whatsapp_phone_numbers/{id}/photo"
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

    GenericType<String> localVarReturnType = new GenericType<String>() {};

    return apiClient.invokeAPI("WhatsAppPhoneNumberApi.retrieveWhatsappProfilePhoto", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIretrieveWhatsappProfilePhotoRequest {
    private String id;

    private APIretrieveWhatsappProfilePhotoRequest(String id) {
      this.id = id;
    }

    /**
     * Execute retrieveWhatsappProfilePhoto request
     * @return WhatsAppProfilePhoto
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> WhatsApp Profile Photo </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public String execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute retrieveWhatsappProfilePhoto request with HTTP info returned
     * @return ApiResponse&lt;WhatsAppProfilePhoto&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> WhatsApp Profile Photo </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<String> executeWithHttpInfo() throws ApiException {
      return retrieveWhatsappProfilePhotoWithHttpInfo(id);
    }
  }

  /**
   * Retrieves a Whatsapp Profile Photo for a WhatsApp Phone Number
   * 
   * @param id Identifies the WhatsApp Phone Number (required)
   * @return retrieveWhatsappProfilePhotoRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIretrieveWhatsappProfilePhotoRequest retrieveWhatsappProfilePhoto(String id) throws ApiException {
    return new APIretrieveWhatsappProfilePhotoRequest(id);
  }
}
