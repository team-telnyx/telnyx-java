package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateDocServiceDocumentRequest;
import com.telnyx.sdk.model.CreateDocument200Response;
import com.telnyx.sdk.model.DocServiceDocument;
import com.telnyx.sdk.model.Errors;
import java.io.File;
import com.telnyx.sdk.model.ListDocumentLinks200Response;
import com.telnyx.sdk.model.ListDocuments200Response;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class DocumentsApi {
  private ApiClient apiClient;

  public DocumentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DocumentsApi(ApiClient apiClient) {
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
   * Upload a document
   * Upload a document.&lt;br /&gt;&lt;br /&gt;Uploaded files must be linked to a service within 30 minutes or they will be automatically deleted.
   * @param createDocServiceDocumentRequest  (required)
   * @return CreateDocument200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateDocument200Response createDocument(CreateDocServiceDocumentRequest createDocServiceDocumentRequest) throws ApiException {
    return createDocumentWithHttpInfo(createDocServiceDocumentRequest).getData();
  }

  /**
   * Upload a document
   * Upload a document.&lt;br /&gt;&lt;br /&gt;Uploaded files must be linked to a service within 30 minutes or they will be automatically deleted.
   * @param createDocServiceDocumentRequest  (required)
   * @return ApiResponse&lt;CreateDocument200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateDocument200Response> createDocumentWithHttpInfo(CreateDocServiceDocumentRequest createDocServiceDocumentRequest) throws ApiException {
    Object localVarPostBody = createDocServiceDocumentRequest;
    
    // verify the required parameter 'createDocServiceDocumentRequest' is set
    if (createDocServiceDocumentRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createDocServiceDocumentRequest' when calling createDocument");
    }
    
    // create path and map variables
    String localVarPath = "/documents";

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

    GenericType<CreateDocument200Response> localVarReturnType = new GenericType<CreateDocument200Response>() {};

    return apiClient.invokeAPI("DocumentsApi.createDocument", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a document
   * Delete a document.&lt;br /&gt;&lt;br /&gt;A document can only be deleted if it&#39;s not linked to a service. If it is linked to a service, it must be unlinked prior to deleting.
   * @param id Identifies the resource. (required)
   * @return CreateDocument200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateDocument200Response deleteDocument(UUID id) throws ApiException {
    return deleteDocumentWithHttpInfo(id).getData();
  }

  /**
   * Delete a document
   * Delete a document.&lt;br /&gt;&lt;br /&gt;A document can only be deleted if it&#39;s not linked to a service. If it is linked to a service, it must be unlinked prior to deleting.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;CreateDocument200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateDocument200Response> deleteDocumentWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteDocument");
    }
    
    // create path and map variables
    String localVarPath = "/documents/{id}"
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

    GenericType<CreateDocument200Response> localVarReturnType = new GenericType<CreateDocument200Response>() {};

    return apiClient.invokeAPI("DocumentsApi.deleteDocument", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Download a document
   * Download a document.
   * @param id Identifies the resource. (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public File downloadDocument(UUID id) throws ApiException {
    return downloadDocumentWithHttpInfo(id).getData();
  }

  /**
   * Download a document
   * Download a document.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> downloadDocumentWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling downloadDocument");
    }
    
    // create path and map variables
    String localVarPath = "/documents/{id}/download"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<File> localVarReturnType = new GenericType<File>() {};

    return apiClient.invokeAPI("DocumentsApi.downloadDocument", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all document links
   * List all documents links ordered by created_at descending.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterDocumentId Identifies the associated document to filter on. (optional)
   * @param filterLinkedRecordType The &#x60;linked_record_type&#x60; of the document to filter on. (optional)
   * @param filterLinkedResourceId The &#x60;linked_resource_id&#x60; of the document to filter on. (optional)
   * @return ListDocumentLinks200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListDocumentLinks200Response listDocumentLinks(Integer pageNumber, Integer pageSize, UUID filterDocumentId, String filterLinkedRecordType, UUID filterLinkedResourceId) throws ApiException {
    return listDocumentLinksWithHttpInfo(pageNumber, pageSize, filterDocumentId, filterLinkedRecordType, filterLinkedResourceId).getData();
  }

  /**
   * List all document links
   * List all documents links ordered by created_at descending.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterDocumentId Identifies the associated document to filter on. (optional)
   * @param filterLinkedRecordType The &#x60;linked_record_type&#x60; of the document to filter on. (optional)
   * @param filterLinkedResourceId The &#x60;linked_resource_id&#x60; of the document to filter on. (optional)
   * @return ApiResponse&lt;ListDocumentLinks200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListDocumentLinks200Response> listDocumentLinksWithHttpInfo(Integer pageNumber, Integer pageSize, UUID filterDocumentId, String filterLinkedRecordType, UUID filterLinkedResourceId) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/document_links";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[document_id]", filterDocumentId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[linked_record_type]", filterLinkedRecordType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[linked_resource_id]", filterLinkedResourceId));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListDocumentLinks200Response> localVarReturnType = new GenericType<ListDocumentLinks200Response>() {};

    return apiClient.invokeAPI("DocumentsApi.listDocumentLinks", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all documents
   * List all documents ordered by created_at descending.
   * @param filterFilenameContains Filter by string matching part of filename. (optional)
   * @param filterCustomerReferenceEq Filter documents by a customer references. (optional)
   * @param filterCustomerReferenceIn Filter documents by a list of customer references. (optional)
   * @param filterCreatedAtGt Filter by created at greater than provided value. (optional)
   * @param filterCreatedAtLt Filter by created at less than provided value. (optional)
   * @param sort Specifies the sort order for results. If you want to sort by a field in ascending order, include it as a sort parameter. If you want to sort in descending order, prepend a &#x60;-&#x60; in front of the field name. (optional)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ListDocuments200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListDocuments200Response listDocuments(String filterFilenameContains, String filterCustomerReferenceEq, String filterCustomerReferenceIn, String filterCreatedAtGt, String filterCreatedAtLt, String sort, Integer pageNumber, Integer pageSize) throws ApiException {
    return listDocumentsWithHttpInfo(filterFilenameContains, filterCustomerReferenceEq, filterCustomerReferenceIn, filterCreatedAtGt, filterCreatedAtLt, sort, pageNumber, pageSize).getData();
  }

  /**
   * List all documents
   * List all documents ordered by created_at descending.
   * @param filterFilenameContains Filter by string matching part of filename. (optional)
   * @param filterCustomerReferenceEq Filter documents by a customer references. (optional)
   * @param filterCustomerReferenceIn Filter documents by a list of customer references. (optional)
   * @param filterCreatedAtGt Filter by created at greater than provided value. (optional)
   * @param filterCreatedAtLt Filter by created at less than provided value. (optional)
   * @param sort Specifies the sort order for results. If you want to sort by a field in ascending order, include it as a sort parameter. If you want to sort in descending order, prepend a &#x60;-&#x60; in front of the field name. (optional)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;ListDocuments200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListDocuments200Response> listDocumentsWithHttpInfo(String filterFilenameContains, String filterCustomerReferenceEq, String filterCustomerReferenceIn, String filterCreatedAtGt, String filterCreatedAtLt, String sort, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/documents";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[filename][contains]", filterFilenameContains));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[customer_reference][eq]", filterCustomerReferenceEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[customer_reference][in][]", filterCustomerReferenceIn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[created_at][gt]", filterCreatedAtGt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[created_at][lt]", filterCreatedAtLt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[]", sort));
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

    GenericType<ListDocuments200Response> localVarReturnType = new GenericType<ListDocuments200Response>() {};

    return apiClient.invokeAPI("DocumentsApi.listDocuments", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a document
   * Retrieve a document.
   * @param id Identifies the resource. (required)
   * @return CreateDocument200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateDocument200Response retrieveDocument(UUID id) throws ApiException {
    return retrieveDocumentWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a document
   * Retrieve a document.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;CreateDocument200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateDocument200Response> retrieveDocumentWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retrieveDocument");
    }
    
    // create path and map variables
    String localVarPath = "/documents/{id}"
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

    GenericType<CreateDocument200Response> localVarReturnType = new GenericType<CreateDocument200Response>() {};

    return apiClient.invokeAPI("DocumentsApi.retrieveDocument", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a document
   * Update a document.
   * @param id Identifies the resource. (required)
   * @param docServiceDocument  (required)
   * @return CreateDocument200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateDocument200Response updateDocument(UUID id, DocServiceDocument docServiceDocument) throws ApiException {
    return updateDocumentWithHttpInfo(id, docServiceDocument).getData();
  }

  /**
   * Update a document
   * Update a document.
   * @param id Identifies the resource. (required)
   * @param docServiceDocument  (required)
   * @return ApiResponse&lt;CreateDocument200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateDocument200Response> updateDocumentWithHttpInfo(UUID id, DocServiceDocument docServiceDocument) throws ApiException {
    Object localVarPostBody = docServiceDocument;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateDocument");
    }
    
    // verify the required parameter 'docServiceDocument' is set
    if (docServiceDocument == null) {
      throw new ApiException(400, "Missing the required parameter 'docServiceDocument' when calling updateDocument");
    }
    
    // create path and map variables
    String localVarPath = "/documents/{id}"
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

    GenericType<CreateDocument200Response> localVarReturnType = new GenericType<CreateDocument200Response>() {};

    return apiClient.invokeAPI("DocumentsApi.updateDocument", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
