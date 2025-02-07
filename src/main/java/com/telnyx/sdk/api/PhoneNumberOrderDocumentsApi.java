package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateNumberOrderDocumentRequest;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListNumberOrderDocumentsResponse;
import com.telnyx.sdk.model.NumberOrderDocumentResponse;
import com.telnyx.sdk.model.UpdateNumberOrderDocumentRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class PhoneNumberOrderDocumentsApi {
  private ApiClient apiClient;

  public PhoneNumberOrderDocumentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PhoneNumberOrderDocumentsApi(ApiClient apiClient) {
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
   * Create a number order document
   * Upload a phone number order document.
   * @param createNumberOrderDocumentRequest  (required)
   * @return NumberOrderDocumentResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a number order document. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public NumberOrderDocumentResponse createNumberOrderDocument(CreateNumberOrderDocumentRequest createNumberOrderDocumentRequest) throws ApiException {
    return createNumberOrderDocumentWithHttpInfo(createNumberOrderDocumentRequest).getData();
  }

  /**
   * Create a number order document
   * Upload a phone number order document.
   * @param createNumberOrderDocumentRequest  (required)
   * @return ApiResponse&lt;NumberOrderDocumentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a number order document. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NumberOrderDocumentResponse> createNumberOrderDocumentWithHttpInfo(CreateNumberOrderDocumentRequest createNumberOrderDocumentRequest) throws ApiException {
    Object localVarPostBody = createNumberOrderDocumentRequest;
    
    // verify the required parameter 'createNumberOrderDocumentRequest' is set
    if (createNumberOrderDocumentRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createNumberOrderDocumentRequest' when calling createNumberOrderDocument");
    }
    
    // create path and map variables
    String localVarPath = "/number_order_documents";

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

    GenericType<NumberOrderDocumentResponse> localVarReturnType = new GenericType<NumberOrderDocumentResponse>() {};

    return apiClient.invokeAPI("PhoneNumberOrderDocumentsApi.createNumberOrderDocument", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

private ApiResponse<ListNumberOrderDocumentsResponse> listNumberOrderDocumentsWithHttpInfo(String filterRequirementId, String filterCreatedAtGt, String filterCreatedAtLt, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/number_order_documents";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[requirement_id]", filterRequirementId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[created_at][gt]", filterCreatedAtGt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[created_at][lt]", filterCreatedAtLt));
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

    GenericType<ListNumberOrderDocumentsResponse> localVarReturnType = new GenericType<ListNumberOrderDocumentsResponse>() {};

    return apiClient.invokeAPI("PhoneNumberOrderDocumentsApi.listNumberOrderDocuments", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistNumberOrderDocumentsRequest {
    private String filterRequirementId;
    private String filterCreatedAtGt;
    private String filterCreatedAtLt;
    private Integer pageNumber;
    private Integer pageSize;

    private APIlistNumberOrderDocumentsRequest() {
    }

    /**
     * Set filterRequirementId
     * @param filterRequirementId Filter number order documents by &#x60;requirement_id&#x60;. (optional)
     * @return APIlistNumberOrderDocumentsRequest
     */
    public APIlistNumberOrderDocumentsRequest filterRequirementId(String filterRequirementId) {
      this.filterRequirementId = filterRequirementId;
      return this;
    }

    /**
     * Set filterCreatedAtGt
     * @param filterCreatedAtGt Filter number order documents after this datetime. (optional)
     * @return APIlistNumberOrderDocumentsRequest
     */
    public APIlistNumberOrderDocumentsRequest filterCreatedAtGt(String filterCreatedAtGt) {
      this.filterCreatedAtGt = filterCreatedAtGt;
      return this;
    }

    /**
     * Set filterCreatedAtLt
     * @param filterCreatedAtLt Filter number order documents from before this datetime. (optional)
     * @return APIlistNumberOrderDocumentsRequest
     */
    public APIlistNumberOrderDocumentsRequest filterCreatedAtLt(String filterCreatedAtLt) {
      this.filterCreatedAtLt = filterCreatedAtLt;
      return this;
    }

    /**
     * Set pageNumber
     * @param pageNumber The page number to load (optional, default to 1)
     * @return APIlistNumberOrderDocumentsRequest
     */
    public APIlistNumberOrderDocumentsRequest pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set pageSize
     * @param pageSize The size of the page (optional, default to 20)
     * @return APIlistNumberOrderDocumentsRequest
     */
    public APIlistNumberOrderDocumentsRequest pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Execute listNumberOrderDocuments request
     * @return ListNumberOrderDocumentsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of number order documents. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListNumberOrderDocumentsResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listNumberOrderDocuments request with HTTP info returned
     * @return ApiResponse&lt;ListNumberOrderDocumentsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of number order documents. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListNumberOrderDocumentsResponse> executeWithHttpInfo() throws ApiException {
      return listNumberOrderDocumentsWithHttpInfo(filterRequirementId, filterCreatedAtGt, filterCreatedAtLt, pageNumber, pageSize);
    }
  }

  /**
   * List number order documents
   * Gets a paginated list of number order documents.
   * @return listNumberOrderDocumentsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistNumberOrderDocumentsRequest listNumberOrderDocuments() throws ApiException {
    return new APIlistNumberOrderDocumentsRequest();
  }
  /**
   * Retrieve a number order document
   * Gets a single number order document.
   * @param numberOrderDocumentId The number order document ID. (required)
   * @return NumberOrderDocumentResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a number order document. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public NumberOrderDocumentResponse retrieveNumberOrderDocument(String numberOrderDocumentId) throws ApiException {
    return retrieveNumberOrderDocumentWithHttpInfo(numberOrderDocumentId).getData();
  }

  /**
   * Retrieve a number order document
   * Gets a single number order document.
   * @param numberOrderDocumentId The number order document ID. (required)
   * @return ApiResponse&lt;NumberOrderDocumentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a number order document. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NumberOrderDocumentResponse> retrieveNumberOrderDocumentWithHttpInfo(String numberOrderDocumentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'numberOrderDocumentId' is set
    if (numberOrderDocumentId == null) {
      throw new ApiException(400, "Missing the required parameter 'numberOrderDocumentId' when calling retrieveNumberOrderDocument");
    }
    
    // create path and map variables
    String localVarPath = "/number_order_documents/{number_order_document_id}"
      .replaceAll("\\{" + "number_order_document_id" + "\\}", apiClient.escapeString(numberOrderDocumentId.toString()));

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

    GenericType<NumberOrderDocumentResponse> localVarReturnType = new GenericType<NumberOrderDocumentResponse>() {};

    return apiClient.invokeAPI("PhoneNumberOrderDocumentsApi.retrieveNumberOrderDocument", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a number order document
   * Updates a number order document.
   * @param numberOrderDocumentId The number order document ID. (required)
   * @param updateNumberOrderDocumentRequest  (required)
   * @return NumberOrderDocumentResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a number order document. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public NumberOrderDocumentResponse updateNumberOrderDocument(String numberOrderDocumentId, UpdateNumberOrderDocumentRequest updateNumberOrderDocumentRequest) throws ApiException {
    return updateNumberOrderDocumentWithHttpInfo(numberOrderDocumentId, updateNumberOrderDocumentRequest).getData();
  }

  /**
   * Update a number order document
   * Updates a number order document.
   * @param numberOrderDocumentId The number order document ID. (required)
   * @param updateNumberOrderDocumentRequest  (required)
   * @return ApiResponse&lt;NumberOrderDocumentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about a number order document. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<NumberOrderDocumentResponse> updateNumberOrderDocumentWithHttpInfo(String numberOrderDocumentId, UpdateNumberOrderDocumentRequest updateNumberOrderDocumentRequest) throws ApiException {
    Object localVarPostBody = updateNumberOrderDocumentRequest;
    
    // verify the required parameter 'numberOrderDocumentId' is set
    if (numberOrderDocumentId == null) {
      throw new ApiException(400, "Missing the required parameter 'numberOrderDocumentId' when calling updateNumberOrderDocument");
    }
    
    // verify the required parameter 'updateNumberOrderDocumentRequest' is set
    if (updateNumberOrderDocumentRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateNumberOrderDocumentRequest' when calling updateNumberOrderDocument");
    }
    
    // create path and map variables
    String localVarPath = "/number_order_documents/{number_order_document_id}"
      .replaceAll("\\{" + "number_order_document_id" + "\\}", apiClient.escapeString(numberOrderDocumentId.toString()));

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

    GenericType<NumberOrderDocumentResponse> localVarReturnType = new GenericType<NumberOrderDocumentResponse>() {};

    return apiClient.invokeAPI("PhoneNumberOrderDocumentsApi.updateNumberOrderDocument", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
