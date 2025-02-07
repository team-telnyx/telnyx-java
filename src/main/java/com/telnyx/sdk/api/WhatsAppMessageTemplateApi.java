package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateWhatsappMessageTemplateRequestBody;
import com.telnyx.sdk.model.Errors;
import java.util.UUID;
import com.telnyx.sdk.model.WhatsAppMessageTemplate1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsAppMessageTemplateApi {
  private ApiClient apiClient;

  public WhatsAppMessageTemplateApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WhatsAppMessageTemplateApi(ApiClient apiClient) {
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
   * Create WhatsApp Message Templates
   * 
   * @param id Identifies the WhatsApp Business Account (required)
   * @param createWhatsappMessageTemplateRequestBody  (optional)
   * @return WhatsAppMessageTemplate1
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> WhatsApp Message Template </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public WhatsAppMessageTemplate1 createWhatsappMessageTemplates(UUID id, CreateWhatsappMessageTemplateRequestBody createWhatsappMessageTemplateRequestBody) throws ApiException {
    return createWhatsappMessageTemplatesWithHttpInfo(id, createWhatsappMessageTemplateRequestBody).getData();
  }

  /**
   * Create WhatsApp Message Templates
   * 
   * @param id Identifies the WhatsApp Business Account (required)
   * @param createWhatsappMessageTemplateRequestBody  (optional)
   * @return ApiResponse&lt;WhatsAppMessageTemplate1&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> WhatsApp Message Template </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<WhatsAppMessageTemplate1> createWhatsappMessageTemplatesWithHttpInfo(UUID id, CreateWhatsappMessageTemplateRequestBody createWhatsappMessageTemplateRequestBody) throws ApiException {
    Object localVarPostBody = createWhatsappMessageTemplateRequestBody;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling createWhatsappMessageTemplates");
    }
    
    // create path and map variables
    String localVarPath = "/whatsapp_business_accounts/{id}/whatsapp_message_templates"
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
      "application/json", "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<WhatsAppMessageTemplate1> localVarReturnType = new GenericType<WhatsAppMessageTemplate1>() {};

    return apiClient.invokeAPI("WhatsAppMessageTemplateApi.createWhatsappMessageTemplates", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete WhatsApp Message Templates
   * Deletes all of the message templates with the given name and business account
   * @param id Identifies the WhatsApp Business Account (required)
   * @param name The name of the Whatsapp Message Template (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> All message templates with the given name have been deleted </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public void deleteWhatsappMessageTemplates(UUID id, String name) throws ApiException {
    deleteWhatsappMessageTemplatesWithHttpInfo(id, name);
  }

  /**
   * Delete WhatsApp Message Templates
   * Deletes all of the message templates with the given name and business account
   * @param id Identifies the WhatsApp Business Account (required)
   * @param name The name of the Whatsapp Message Template (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> All message templates with the given name have been deleted </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteWhatsappMessageTemplatesWithHttpInfo(UUID id, String name) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteWhatsappMessageTemplates");
    }
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling deleteWhatsappMessageTemplates");
    }
    
    // create path and map variables
    String localVarPath = "/whatsapp_business_accounts/{id}/whatsapp_message_templates/{name}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

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

    return apiClient.invokeAPI("WhatsAppMessageTemplateApi.deleteWhatsappMessageTemplates", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }

private ApiResponse<String> listWhatsappMessageTemplatesWithHttpInfo(UUID id, String category, String language, String name, String qualityScore, String rejectedReason, String limit, String before, String after, String status) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling listWhatsappMessageTemplates");
    }
    
    // create path and map variables
    String localVarPath = "/whatsapp_business_accounts/{id}/whatsapp_message_templates"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "category", category));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "language", language));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quality_score", qualityScore));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "rejected_reason", rejectedReason));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "before", before));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "after", after));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<String> localVarReturnType = new GenericType<String>() {};

    return apiClient.invokeAPI("WhatsAppMessageTemplateApi.listWhatsappMessageTemplates", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistWhatsappMessageTemplatesRequest {
    private UUID id;
    private String category;
    private String language;
    private String name;
    private String qualityScore;
    private String rejectedReason;
    private String limit;
    private String before;
    private String after;
    private String status;

    private APIlistWhatsappMessageTemplatesRequest(UUID id) {
      this.id = id;
    }

    /**
     * Set category
     * @param category The template category (optional)
     * @return APIlistWhatsappMessageTemplatesRequest
     */
    public APIlistWhatsappMessageTemplatesRequest category(String category) {
      this.category = category;
      return this;
    }

    /**
     * Set language
     * @param language The language of the whatsapp message template (optional)
     * @return APIlistWhatsappMessageTemplatesRequest
     */
    public APIlistWhatsappMessageTemplatesRequest language(String language) {
      this.language = language;
      return this;
    }

    /**
     * Set name
     * @param name A name identifying this whatsapp message template (optional)
     * @return APIlistWhatsappMessageTemplatesRequest
     */
    public APIlistWhatsappMessageTemplatesRequest name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set qualityScore
     * @param qualityScore The score of the whatsapp message template (optional)
     * @return APIlistWhatsappMessageTemplatesRequest
     */
    public APIlistWhatsappMessageTemplatesRequest qualityScore(String qualityScore) {
      this.qualityScore = qualityScore;
      return this;
    }

    /**
     * Set rejectedReason
     * @param rejectedReason The reason why a message template was rejected by Whatsapp (optional)
     * @return APIlistWhatsappMessageTemplatesRequest
     */
    public APIlistWhatsappMessageTemplatesRequest rejectedReason(String rejectedReason) {
      this.rejectedReason = rejectedReason;
      return this;
    }

    /**
     * Set limit
     * @param limit The maximum number of message_templates to be returned on a query, we may return less than the limit number even if more pages are available. (optional)
     * @return APIlistWhatsappMessageTemplatesRequest
     */
    public APIlistWhatsappMessageTemplatesRequest limit(String limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set before
     * @param before Indicates that this is a query for entries before the given cursor (optional)
     * @return APIlistWhatsappMessageTemplatesRequest
     */
    public APIlistWhatsappMessageTemplatesRequest before(String before) {
      this.before = before;
      return this;
    }

    /**
     * Set after
     * @param after Indicates that this is a query for entries after the given cursor (optional)
     * @return APIlistWhatsappMessageTemplatesRequest
     */
    public APIlistWhatsappMessageTemplatesRequest after(String after) {
      this.after = after;
      return this;
    }

    /**
     * Set status
     * @param status Identifies the whatsApp Message Template status (optional)
     * @return APIlistWhatsappMessageTemplatesRequest
     */
    public APIlistWhatsappMessageTemplatesRequest status(String status) {
      this.status = status;
      return this;
    }

    /**
     * Execute listWhatsappMessageTemplates request
     * @return WhatsAppMessageTemplate
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> WhatsApp Message Template </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public String execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listWhatsappMessageTemplates request with HTTP info returned
     * @return ApiResponse&lt;WhatsAppMessageTemplate&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> WhatsApp Message Template </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<String> executeWithHttpInfo() throws ApiException {
      return listWhatsappMessageTemplatesWithHttpInfo(id, category, language, name, qualityScore, rejectedReason, limit, before, after, status);
    }
  }

  /**
   * List WhatsApp Message Templates
   * 
   * @param id Identifies the WhatsApp Business Account (required)
   * @return listWhatsappMessageTemplatesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistWhatsappMessageTemplatesRequest listWhatsappMessageTemplates(UUID id) throws ApiException {
    return new APIlistWhatsappMessageTemplatesRequest(id);
  }
}
