package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Assistant;
import com.telnyx.sdk.model.AssistantDeletedResponse;
import com.telnyx.sdk.model.AssistantsListData;
import com.telnyx.sdk.model.CreateAssistantRequest;
import com.telnyx.sdk.model.HTTPValidationError;
import com.telnyx.sdk.model.UpdateAssistantRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class AssistantsApi {
  private ApiClient apiClient;

  public AssistantsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AssistantsApi(ApiClient apiClient) {
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
   * Create an assistant
   * Create a new AI Assistant.
   * @param createAssistantRequest  (required)
   * @return Assistant
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public Assistant createNewAssistantPublicAssistantsPost(CreateAssistantRequest createAssistantRequest) throws ApiException {
    return createNewAssistantPublicAssistantsPostWithHttpInfo(createAssistantRequest).getData();
  }

  /**
   * Create an assistant
   * Create a new AI Assistant.
   * @param createAssistantRequest  (required)
   * @return ApiResponse&lt;Assistant&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Assistant> createNewAssistantPublicAssistantsPostWithHttpInfo(CreateAssistantRequest createAssistantRequest) throws ApiException {
    Object localVarPostBody = createAssistantRequest;
    
    // verify the required parameter 'createAssistantRequest' is set
    if (createAssistantRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createAssistantRequest' when calling createNewAssistantPublicAssistantsPost");
    }
    
    // create path and map variables
    String localVarPath = "/ai/assistants";

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

    GenericType<Assistant> localVarReturnType = new GenericType<Assistant>() {};

    return apiClient.invokeAPI("AssistantsApi.createNewAssistantPublicAssistantsPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete an assistant
   * Delete an AI Assistant by &#x60;assistant_id&#x60;.
   * @param assistantId  (required)
   * @return AssistantDeletedResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public AssistantDeletedResponse deleteAssistantPublicAssistantsAssistantIdDelete(String assistantId) throws ApiException {
    return deleteAssistantPublicAssistantsAssistantIdDeleteWithHttpInfo(assistantId).getData();
  }

  /**
   * Delete an assistant
   * Delete an AI Assistant by &#x60;assistant_id&#x60;.
   * @param assistantId  (required)
   * @return ApiResponse&lt;AssistantDeletedResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AssistantDeletedResponse> deleteAssistantPublicAssistantsAssistantIdDeleteWithHttpInfo(String assistantId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'assistantId' is set
    if (assistantId == null) {
      throw new ApiException(400, "Missing the required parameter 'assistantId' when calling deleteAssistantPublicAssistantsAssistantIdDelete");
    }
    
    // create path and map variables
    String localVarPath = "/ai/assistants/{assistant_id}"
      .replaceAll("\\{" + "assistant_id" + "\\}", apiClient.escapeString(assistantId.toString()));

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

    GenericType<AssistantDeletedResponse> localVarReturnType = new GenericType<AssistantDeletedResponse>() {};

    return apiClient.invokeAPI("AssistantsApi.deleteAssistantPublicAssistantsAssistantIdDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get an assistant
   * Retrieve an AI Assistant configuration by &#x60;assistant_id&#x60;.
   * @param assistantId  (required)
   * @return Assistant
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public Assistant getAssistantPublicAssistantsAssistantIdGet(String assistantId) throws ApiException {
    return getAssistantPublicAssistantsAssistantIdGetWithHttpInfo(assistantId).getData();
  }

  /**
   * Get an assistant
   * Retrieve an AI Assistant configuration by &#x60;assistant_id&#x60;.
   * @param assistantId  (required)
   * @return ApiResponse&lt;Assistant&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Assistant> getAssistantPublicAssistantsAssistantIdGetWithHttpInfo(String assistantId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'assistantId' is set
    if (assistantId == null) {
      throw new ApiException(400, "Missing the required parameter 'assistantId' when calling getAssistantPublicAssistantsAssistantIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/ai/assistants/{assistant_id}"
      .replaceAll("\\{" + "assistant_id" + "\\}", apiClient.escapeString(assistantId.toString()));

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

    GenericType<Assistant> localVarReturnType = new GenericType<Assistant>() {};

    return apiClient.invokeAPI("AssistantsApi.getAssistantPublicAssistantsAssistantIdGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List assistants
   * Retrieve a list of all AI Assistants configured by the user.
   * @return AssistantsListData
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public AssistantsListData getAssistantsPublicAssistantsGet() throws ApiException {
    return getAssistantsPublicAssistantsGetWithHttpInfo().getData();
  }

  /**
   * List assistants
   * Retrieve a list of all AI Assistants configured by the user.
   * @return ApiResponse&lt;AssistantsListData&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AssistantsListData> getAssistantsPublicAssistantsGetWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/ai/assistants";

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

    GenericType<AssistantsListData> localVarReturnType = new GenericType<AssistantsListData>() {};

    return apiClient.invokeAPI("AssistantsApi.getAssistantsPublicAssistantsGet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update an assistant
   * Update an AI Assistant&#39;s attributes.
   * @param assistantId  (required)
   * @param updateAssistantRequest  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public Object updateAssistantPublicAssistantsAssistantIdPost(String assistantId, UpdateAssistantRequest updateAssistantRequest) throws ApiException {
    return updateAssistantPublicAssistantsAssistantIdPostWithHttpInfo(assistantId, updateAssistantRequest).getData();
  }

  /**
   * Update an assistant
   * Update an AI Assistant&#39;s attributes.
   * @param assistantId  (required)
   * @param updateAssistantRequest  (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> updateAssistantPublicAssistantsAssistantIdPostWithHttpInfo(String assistantId, UpdateAssistantRequest updateAssistantRequest) throws ApiException {
    Object localVarPostBody = updateAssistantRequest;
    
    // verify the required parameter 'assistantId' is set
    if (assistantId == null) {
      throw new ApiException(400, "Missing the required parameter 'assistantId' when calling updateAssistantPublicAssistantsAssistantIdPost");
    }
    
    // verify the required parameter 'updateAssistantRequest' is set
    if (updateAssistantRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateAssistantRequest' when calling updateAssistantPublicAssistantsAssistantIdPost");
    }
    
    // create path and map variables
    String localVarPath = "/ai/assistants/{assistant_id}"
      .replaceAll("\\{" + "assistant_id" + "\\}", apiClient.escapeString(assistantId.toString()));

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

    return apiClient.invokeAPI("AssistantsApi.updateAssistantPublicAssistantsAssistantIdPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
