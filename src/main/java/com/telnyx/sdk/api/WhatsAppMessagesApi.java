package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateWhatsAppMessageRequest;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.MarkMessageAsReadRequestBody;
import com.telnyx.sdk.model.SuccessfulResponseWithDetailsAboutTheWhatsAppMessageSent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsAppMessagesApi {
  private ApiClient apiClient;

  public WhatsAppMessagesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WhatsAppMessagesApi(ApiClient apiClient) {
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
   * Mark Message As Read
   * Mark a message as read.
   * @param messageId Message ID from Webhook (required)
   * @param markMessageAsReadRequestBody  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Request successful, empty response body. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public void markMessageAsRead(String messageId, MarkMessageAsReadRequestBody markMessageAsReadRequestBody) throws ApiException {
    markMessageAsReadWithHttpInfo(messageId, markMessageAsReadRequestBody);
  }

  /**
   * Mark Message As Read
   * Mark a message as read.
   * @param messageId Message ID from Webhook (required)
   * @param markMessageAsReadRequestBody  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Request successful, empty response body. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> markMessageAsReadWithHttpInfo(String messageId, MarkMessageAsReadRequestBody markMessageAsReadRequestBody) throws ApiException {
    Object localVarPostBody = markMessageAsReadRequestBody;
    
    // verify the required parameter 'messageId' is set
    if (messageId == null) {
      throw new ApiException(400, "Missing the required parameter 'messageId' when calling markMessageAsRead");
    }
    
    // verify the required parameter 'markMessageAsReadRequestBody' is set
    if (markMessageAsReadRequestBody == null) {
      throw new ApiException(400, "Missing the required parameter 'markMessageAsReadRequestBody' when calling markMessageAsRead");
    }
    
    // create path and map variables
    String localVarPath = "/whatsapp_messages/{message_id}"
      .replaceAll("\\{" + "message_id" + "\\}", apiClient.escapeString(messageId.toString()));

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

    return apiClient.invokeAPI("WhatsAppMessagesApi.markMessageAsRead", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Send Message
   * Send text messages, media/documents, and message templates to your customers.
   * @param createWhatsAppMessageRequest  (required)
   * @return SuccessfulResponseWithDetailsAboutTheWhatsAppMessageSent
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public SuccessfulResponseWithDetailsAboutTheWhatsAppMessageSent sendMessage(CreateWhatsAppMessageRequest createWhatsAppMessageRequest) throws ApiException {
    return sendMessageWithHttpInfo(createWhatsAppMessageRequest).getData();
  }

  /**
   * Send Message
   * Send text messages, media/documents, and message templates to your customers.
   * @param createWhatsAppMessageRequest  (required)
   * @return ApiResponse&lt;SuccessfulResponseWithDetailsAboutTheWhatsAppMessageSent&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SuccessfulResponseWithDetailsAboutTheWhatsAppMessageSent> sendMessageWithHttpInfo(CreateWhatsAppMessageRequest createWhatsAppMessageRequest) throws ApiException {
    Object localVarPostBody = createWhatsAppMessageRequest;
    
    // verify the required parameter 'createWhatsAppMessageRequest' is set
    if (createWhatsAppMessageRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createWhatsAppMessageRequest' when calling sendMessage");
    }
    
    // create path and map variables
    String localVarPath = "/whatsapp_messages";

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

    GenericType<SuccessfulResponseWithDetailsAboutTheWhatsAppMessageSent> localVarReturnType = new GenericType<SuccessfulResponseWithDetailsAboutTheWhatsAppMessageSent>() {};

    return apiClient.invokeAPI("WhatsAppMessagesApi.sendMessage", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
