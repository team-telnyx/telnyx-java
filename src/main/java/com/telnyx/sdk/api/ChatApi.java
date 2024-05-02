package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.ChatCompletionRequest;
import com.telnyx.sdk.model.HTTPValidationError;
import com.telnyx.sdk.model.ModelsResponse;
import com.telnyx.sdk.model.SummaryRequest;
import com.telnyx.sdk.model.SummaryResponseData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class ChatApi {
  private ApiClient apiClient;

  public ChatApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ChatApi(ApiClient apiClient) {
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
   * Create a chat completion
   * Chat with a language model. This endpoint is consistent with the [OpenAI Chat Completions API](https://platform.openai.com/docs/api-reference/chat) and may be used with the OpenAI JS or Python SDK.
   * @param chatCompletionRequest  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public Object chatPublicChatCompletionsPost(ChatCompletionRequest chatCompletionRequest) throws ApiException {
    return chatPublicChatCompletionsPostWithHttpInfo(chatCompletionRequest).getData();
  }

  /**
   * Create a chat completion
   * Chat with a language model. This endpoint is consistent with the [OpenAI Chat Completions API](https://platform.openai.com/docs/api-reference/chat) and may be used with the OpenAI JS or Python SDK.
   * @param chatCompletionRequest  (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> chatPublicChatCompletionsPostWithHttpInfo(ChatCompletionRequest chatCompletionRequest) throws ApiException {
    Object localVarPostBody = chatCompletionRequest;
    
    // verify the required parameter 'chatCompletionRequest' is set
    if (chatCompletionRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'chatCompletionRequest' when calling chatPublicChatCompletionsPost");
    }
    
    // create path and map variables
    String localVarPath = "/ai/chat/completions";

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

    return apiClient.invokeAPI("ChatApi.chatPublicChatCompletionsPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get available models
   * This endpoint returns a list of Open Source and OpenAI models that are available for use. &lt;br /&gt;&lt;br /&gt; **Note**: Model &#x60;id&#x60;&#39;s will be in the form &#x60;{source}/{model_name}&#x60;. For example &#x60;openai/gpt-4&#x60; or &#x60;mistralai/Mistral-7B-Instruct-v0.1&#x60; consistent with HuggingFace naming conventions.
   * @return ModelsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ModelsResponse getModelsPublicModelsGet() throws ApiException {
    return getModelsPublicModelsGetWithHttpInfo().getData();
  }

  /**
   * Get available models
   * This endpoint returns a list of Open Source and OpenAI models that are available for use. &lt;br /&gt;&lt;br /&gt; **Note**: Model &#x60;id&#x60;&#39;s will be in the form &#x60;{source}/{model_name}&#x60;. For example &#x60;openai/gpt-4&#x60; or &#x60;mistralai/Mistral-7B-Instruct-v0.1&#x60; consistent with HuggingFace naming conventions.
   * @return ApiResponse&lt;ModelsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ModelsResponse> getModelsPublicModelsGetWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/ai/models";

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

    GenericType<ModelsResponse> localVarReturnType = new GenericType<ModelsResponse>() {};

    return apiClient.invokeAPI("ChatApi.getModelsPublicModelsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Summarize file content
   * Generate a summary of a file&#39;s contents.    Supports the following text formats:  - PDF, HTML, txt, json, csv   Supports the following media formats (billed for both the transcription and summary):  - flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm - Up to 100 MB
   * @param summaryRequest  (required)
   * @return SummaryResponseData
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public SummaryResponseData postSummary(SummaryRequest summaryRequest) throws ApiException {
    return postSummaryWithHttpInfo(summaryRequest).getData();
  }

  /**
   * Summarize file content
   * Generate a summary of a file&#39;s contents.    Supports the following text formats:  - PDF, HTML, txt, json, csv   Supports the following media formats (billed for both the transcription and summary):  - flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm - Up to 100 MB
   * @param summaryRequest  (required)
   * @return ApiResponse&lt;SummaryResponseData&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SummaryResponseData> postSummaryWithHttpInfo(SummaryRequest summaryRequest) throws ApiException {
    Object localVarPostBody = summaryRequest;
    
    // verify the required parameter 'summaryRequest' is set
    if (summaryRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'summaryRequest' when calling postSummary");
    }
    
    // create path and map variables
    String localVarPath = "/ai/summarize";

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

    GenericType<SummaryResponseData> localVarReturnType = new GenericType<SummaryResponseData>() {};

    return apiClient.invokeAPI("ChatApi.postSummary", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
