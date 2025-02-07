package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreatePortoutReport201Response;
import com.telnyx.sdk.model.CreatePortoutReportRequest;
import com.telnyx.sdk.model.FindPortoutComments200Response;
import com.telnyx.sdk.model.FindPortoutRequest200Response;
import com.telnyx.sdk.model.GetPortRequestSupportingDocuments201Response;
import com.telnyx.sdk.model.ListPortoutEvents200Response;
import com.telnyx.sdk.model.ListPortoutRejections200Response;
import com.telnyx.sdk.model.ListPortoutReports200Response;
import com.telnyx.sdk.model.ListPortoutRequest200Response;
import java.time.OffsetDateTime;
import com.telnyx.sdk.model.PostPortRequestComment201Response;
import com.telnyx.sdk.model.PostPortRequestCommentRequest;
import com.telnyx.sdk.model.PostPortRequestSupportingDocumentsRequest;
import com.telnyx.sdk.model.ShowPortoutEvent200Response;
import java.util.UUID;
import com.telnyx.sdk.model.UpdatePortoutStatusRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class NumberPortoutApi {
  private ApiClient apiClient;

  public NumberPortoutApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NumberPortoutApi(ApiClient apiClient) {
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
   * Create a port-out related report
   * Generate reports about port-out operations.
   * @param createPortoutReportRequest  (required)
   * @return CreatePortoutReport201Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public CreatePortoutReport201Response createPortoutReport(CreatePortoutReportRequest createPortoutReportRequest) throws ApiException {
    return createPortoutReportWithHttpInfo(createPortoutReportRequest).getData();
  }

  /**
   * Create a port-out related report
   * Generate reports about port-out operations.
   * @param createPortoutReportRequest  (required)
   * @return ApiResponse&lt;CreatePortoutReport201Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreatePortoutReport201Response> createPortoutReportWithHttpInfo(CreatePortoutReportRequest createPortoutReportRequest) throws ApiException {
    Object localVarPostBody = createPortoutReportRequest;
    
    // verify the required parameter 'createPortoutReportRequest' is set
    if (createPortoutReportRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createPortoutReportRequest' when calling createPortoutReport");
    }
    
    // create path and map variables
    String localVarPath = "/portouts/reports";

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

    GenericType<CreatePortoutReport201Response> localVarReturnType = new GenericType<CreatePortoutReport201Response>() {};

    return apiClient.invokeAPI("NumberPortoutApi.createPortoutReport", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all comments for a portout request
   * Returns a list of comments for a portout request.
   * @param id Portout id (required)
   * @return FindPortoutComments200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Portout Comments </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public FindPortoutComments200Response findPortoutComments(UUID id) throws ApiException {
    return findPortoutCommentsWithHttpInfo(id).getData();
  }

  /**
   * List all comments for a portout request
   * Returns a list of comments for a portout request.
   * @param id Portout id (required)
   * @return ApiResponse&lt;FindPortoutComments200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Portout Comments </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FindPortoutComments200Response> findPortoutCommentsWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling findPortoutComments");
    }
    
    // create path and map variables
    String localVarPath = "/portouts/{id}/comments"
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

    GenericType<FindPortoutComments200Response> localVarReturnType = new GenericType<FindPortoutComments200Response>() {};

    return apiClient.invokeAPI("NumberPortoutApi.findPortoutComments", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get a portout request
   * Returns the portout request based on the ID provided
   * @param id Portout id (required)
   * @return FindPortoutRequest200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Portout Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public FindPortoutRequest200Response findPortoutRequest(UUID id) throws ApiException {
    return findPortoutRequestWithHttpInfo(id).getData();
  }

  /**
   * Get a portout request
   * Returns the portout request based on the ID provided
   * @param id Portout id (required)
   * @return ApiResponse&lt;FindPortoutRequest200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Portout Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FindPortoutRequest200Response> findPortoutRequestWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling findPortoutRequest");
    }
    
    // create path and map variables
    String localVarPath = "/portouts/{id}"
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

    GenericType<FindPortoutRequest200Response> localVarReturnType = new GenericType<FindPortoutRequest200Response>() {};

    return apiClient.invokeAPI("NumberPortoutApi.findPortoutRequest", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List supporting documents on a portout request
   * List every supporting documents for a portout request.
   * @param id Portout id (required)
   * @return GetPortRequestSupportingDocuments201Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Portout Supporting Documents </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public GetPortRequestSupportingDocuments201Response getPortRequestSupportingDocuments(UUID id) throws ApiException {
    return getPortRequestSupportingDocumentsWithHttpInfo(id).getData();
  }

  /**
   * List supporting documents on a portout request
   * List every supporting documents for a portout request.
   * @param id Portout id (required)
   * @return ApiResponse&lt;GetPortRequestSupportingDocuments201Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Portout Supporting Documents </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetPortRequestSupportingDocuments201Response> getPortRequestSupportingDocumentsWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getPortRequestSupportingDocuments");
    }
    
    // create path and map variables
    String localVarPath = "/portouts/{id}/supporting_documents"
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

    GenericType<GetPortRequestSupportingDocuments201Response> localVarReturnType = new GenericType<GetPortRequestSupportingDocuments201Response>() {};

    return apiClient.invokeAPI("NumberPortoutApi.getPortRequestSupportingDocuments", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a report
   * Retrieve a specific report generated.
   * @param id Identifies a report. (required)
   * @return CreatePortoutReport201Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public CreatePortoutReport201Response getPortoutReport(UUID id) throws ApiException {
    return getPortoutReportWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a report
   * Retrieve a specific report generated.
   * @param id Identifies a report. (required)
   * @return ApiResponse&lt;CreatePortoutReport201Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreatePortoutReport201Response> getPortoutReportWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getPortoutReport");
    }
    
    // create path and map variables
    String localVarPath = "/portouts/reports/{id}"
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

    GenericType<CreatePortoutReport201Response> localVarReturnType = new GenericType<CreatePortoutReport201Response>() {};

    return apiClient.invokeAPI("NumberPortoutApi.getPortoutReport", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all port-out events
   * Returns a list of all port-out events.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterEventType Filter by event type. (optional)
   * @param filterPortoutId Filter by port-out order ID. (optional)
   * @param filterCreatedAtGte Filter by created at greater than or equal to. (optional)
   * @param filterCreatedAtLte Filter by created at less than or equal to. (optional)
   * @return ListPortoutEvents200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ListPortoutEvents200Response listPortoutEvents(Integer pageNumber, Integer pageSize, String filterEventType, UUID filterPortoutId, OffsetDateTime filterCreatedAtGte, OffsetDateTime filterCreatedAtLte) throws ApiException {
    return listPortoutEventsWithHttpInfo(pageNumber, pageSize, filterEventType, filterPortoutId, filterCreatedAtGte, filterCreatedAtLte).getData();
  }

  /**
   * List all port-out events
   * Returns a list of all port-out events.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterEventType Filter by event type. (optional)
   * @param filterPortoutId Filter by port-out order ID. (optional)
   * @param filterCreatedAtGte Filter by created at greater than or equal to. (optional)
   * @param filterCreatedAtLte Filter by created at less than or equal to. (optional)
   * @return ApiResponse&lt;ListPortoutEvents200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListPortoutEvents200Response> listPortoutEventsWithHttpInfo(Integer pageNumber, Integer pageSize, String filterEventType, UUID filterPortoutId, OffsetDateTime filterCreatedAtGte, OffsetDateTime filterCreatedAtLte) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/portouts/events";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[event_type]", filterEventType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[portout_id]", filterPortoutId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[created_at][gte]", filterCreatedAtGte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[created_at][lte]", filterCreatedAtLte));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListPortoutEvents200Response> localVarReturnType = new GenericType<ListPortoutEvents200Response>() {};

    return apiClient.invokeAPI("NumberPortoutApi.listPortoutEvents", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List eligible port-out rejection codes for a specific order
   * Given a port-out ID, list rejection codes that are eligible for that port-out
   * @param portoutId Identifies a port out order. (required)
   * @param filterCode Filter rejections of a specific code (optional)
   * @param filterCodeIn Filter rejections in a list of codes (optional)
   * @return ListPortoutRejections200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ListPortoutRejections200Response listPortoutRejections(String portoutId, Integer filterCode, List<Integer> filterCodeIn) throws ApiException {
    return listPortoutRejectionsWithHttpInfo(portoutId, filterCode, filterCodeIn).getData();
  }

  /**
   * List eligible port-out rejection codes for a specific order
   * Given a port-out ID, list rejection codes that are eligible for that port-out
   * @param portoutId Identifies a port out order. (required)
   * @param filterCode Filter rejections of a specific code (optional)
   * @param filterCodeIn Filter rejections in a list of codes (optional)
   * @return ApiResponse&lt;ListPortoutRejections200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListPortoutRejections200Response> listPortoutRejectionsWithHttpInfo(String portoutId, Integer filterCode, List<Integer> filterCodeIn) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'portoutId' is set
    if (portoutId == null) {
      throw new ApiException(400, "Missing the required parameter 'portoutId' when calling listPortoutRejections");
    }
    
    // create path and map variables
    String localVarPath = "/portouts/rejections/{portout_id}"
      .replaceAll("\\{" + "portout_id" + "\\}", apiClient.escapeString(portoutId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[code]", filterCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[code][in]", filterCodeIn));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListPortoutRejections200Response> localVarReturnType = new GenericType<ListPortoutRejections200Response>() {};

    return apiClient.invokeAPI("NumberPortoutApi.listPortoutRejections", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List port-out related reports
   * List the reports generated about port-out operations.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterReportType Filter reports of a specific type (optional)
   * @param filterStatus Filter reports of a specific status (optional)
   * @return ListPortoutReports200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ListPortoutReports200Response listPortoutReports(Integer pageNumber, Integer pageSize, String filterReportType, String filterStatus) throws ApiException {
    return listPortoutReportsWithHttpInfo(pageNumber, pageSize, filterReportType, filterStatus).getData();
  }

  /**
   * List port-out related reports
   * List the reports generated about port-out operations.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterReportType Filter reports of a specific type (optional)
   * @param filterStatus Filter reports of a specific status (optional)
   * @return ApiResponse&lt;ListPortoutReports200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListPortoutReports200Response> listPortoutReportsWithHttpInfo(Integer pageNumber, Integer pageSize, String filterReportType, String filterStatus) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/portouts/reports";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[report_type]", filterReportType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListPortoutReports200Response> localVarReturnType = new GenericType<ListPortoutReports200Response>() {};

    return apiClient.invokeAPI("NumberPortoutApi.listPortoutReports", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List portout requests
   * Returns the portout requests according to filters
   * @param filterCarrierName Filter by new carrier name. (optional)
   * @param filterSpid Filter by new carrier spid. (optional)
   * @param filterStatus Filter by portout status. (optional)
   * @param filterStatusIn Filter by a list of portout statuses (optional)
   * @param filterPortedOutAtGte Filter by ported_out_at date greater than or equal. (optional)
   * @param filterPortedOutAtLte Filter by ported_out_at date less than or equal. (optional)
   * @param filterInsertedAtGte Filter by inserted_at date greater than or equal. (optional)
   * @param filterInsertedAtLte Filter by inserted_at date less than or equal. (optional)
   * @param filterFocDate Filter by foc_date. Matches all portouts with the same date (optional)
   * @param filterPhoneNumber Filter by a phone number on the portout. Matches all portouts with the phone number (optional)
   * @param filterSupportKey Filter by the portout&#39;s support_key (optional)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ListPortoutRequest200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Portout Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ListPortoutRequest200Response listPortoutRequest(String filterCarrierName, String filterSpid, String filterStatus, List<String> filterStatusIn, OffsetDateTime filterPortedOutAtGte, OffsetDateTime filterPortedOutAtLte, OffsetDateTime filterInsertedAtGte, OffsetDateTime filterInsertedAtLte, OffsetDateTime filterFocDate, String filterPhoneNumber, String filterSupportKey, Integer pageNumber, Integer pageSize) throws ApiException {
    return listPortoutRequestWithHttpInfo(filterCarrierName, filterSpid, filterStatus, filterStatusIn, filterPortedOutAtGte, filterPortedOutAtLte, filterInsertedAtGte, filterInsertedAtLte, filterFocDate, filterPhoneNumber, filterSupportKey, pageNumber, pageSize).getData();
  }

  /**
   * List portout requests
   * Returns the portout requests according to filters
   * @param filterCarrierName Filter by new carrier name. (optional)
   * @param filterSpid Filter by new carrier spid. (optional)
   * @param filterStatus Filter by portout status. (optional)
   * @param filterStatusIn Filter by a list of portout statuses (optional)
   * @param filterPortedOutAtGte Filter by ported_out_at date greater than or equal. (optional)
   * @param filterPortedOutAtLte Filter by ported_out_at date less than or equal. (optional)
   * @param filterInsertedAtGte Filter by inserted_at date greater than or equal. (optional)
   * @param filterInsertedAtLte Filter by inserted_at date less than or equal. (optional)
   * @param filterFocDate Filter by foc_date. Matches all portouts with the same date (optional)
   * @param filterPhoneNumber Filter by a phone number on the portout. Matches all portouts with the phone number (optional)
   * @param filterSupportKey Filter by the portout&#39;s support_key (optional)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;ListPortoutRequest200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Portout Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListPortoutRequest200Response> listPortoutRequestWithHttpInfo(String filterCarrierName, String filterSpid, String filterStatus, List<String> filterStatusIn, OffsetDateTime filterPortedOutAtGte, OffsetDateTime filterPortedOutAtLte, OffsetDateTime filterInsertedAtGte, OffsetDateTime filterInsertedAtLte, OffsetDateTime filterFocDate, String filterPhoneNumber, String filterSupportKey, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/portouts";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[carrier_name]", filterCarrierName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[spid]", filterSpid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[status_in]", filterStatusIn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[ported_out_at][gte]", filterPortedOutAtGte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[ported_out_at][lte]", filterPortedOutAtLte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[inserted_at][gte]", filterInsertedAtGte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[inserted_at][lte]", filterInsertedAtLte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[foc_date]", filterFocDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_number]", filterPhoneNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[support_key]", filterSupportKey));
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

    GenericType<ListPortoutRequest200Response> localVarReturnType = new GenericType<ListPortoutRequest200Response>() {};

    return apiClient.invokeAPI("NumberPortoutApi.listPortoutRequest", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a comment on a portout request
   * Creates a comment on a portout request.
   * @param id Portout id (required)
   * @param postPortRequestCommentRequest  (required)
   * @return PostPortRequestComment201Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Portout Comment Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public PostPortRequestComment201Response postPortRequestComment(UUID id, PostPortRequestCommentRequest postPortRequestCommentRequest) throws ApiException {
    return postPortRequestCommentWithHttpInfo(id, postPortRequestCommentRequest).getData();
  }

  /**
   * Create a comment on a portout request
   * Creates a comment on a portout request.
   * @param id Portout id (required)
   * @param postPortRequestCommentRequest  (required)
   * @return ApiResponse&lt;PostPortRequestComment201Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Portout Comment Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PostPortRequestComment201Response> postPortRequestCommentWithHttpInfo(UUID id, PostPortRequestCommentRequest postPortRequestCommentRequest) throws ApiException {
    Object localVarPostBody = postPortRequestCommentRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling postPortRequestComment");
    }
    
    // verify the required parameter 'postPortRequestCommentRequest' is set
    if (postPortRequestCommentRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'postPortRequestCommentRequest' when calling postPortRequestComment");
    }
    
    // create path and map variables
    String localVarPath = "/portouts/{id}/comments"
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

    GenericType<PostPortRequestComment201Response> localVarReturnType = new GenericType<PostPortRequestComment201Response>() {};

    return apiClient.invokeAPI("NumberPortoutApi.postPortRequestComment", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a list of supporting documents on a portout request
   * Creates a list of supporting documents on a portout request.
   * @param id Portout id (required)
   * @param postPortRequestSupportingDocumentsRequest  (required)
   * @return GetPortRequestSupportingDocuments201Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Portout Supporting Documents </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public GetPortRequestSupportingDocuments201Response postPortRequestSupportingDocuments(UUID id, PostPortRequestSupportingDocumentsRequest postPortRequestSupportingDocumentsRequest) throws ApiException {
    return postPortRequestSupportingDocumentsWithHttpInfo(id, postPortRequestSupportingDocumentsRequest).getData();
  }

  /**
   * Create a list of supporting documents on a portout request
   * Creates a list of supporting documents on a portout request.
   * @param id Portout id (required)
   * @param postPortRequestSupportingDocumentsRequest  (required)
   * @return ApiResponse&lt;GetPortRequestSupportingDocuments201Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Portout Supporting Documents </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetPortRequestSupportingDocuments201Response> postPortRequestSupportingDocumentsWithHttpInfo(UUID id, PostPortRequestSupportingDocumentsRequest postPortRequestSupportingDocumentsRequest) throws ApiException {
    Object localVarPostBody = postPortRequestSupportingDocumentsRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling postPortRequestSupportingDocuments");
    }
    
    // verify the required parameter 'postPortRequestSupportingDocumentsRequest' is set
    if (postPortRequestSupportingDocumentsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'postPortRequestSupportingDocumentsRequest' when calling postPortRequestSupportingDocuments");
    }
    
    // create path and map variables
    String localVarPath = "/portouts/{id}/supporting_documents"
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

    GenericType<GetPortRequestSupportingDocuments201Response> localVarReturnType = new GenericType<GetPortRequestSupportingDocuments201Response>() {};

    return apiClient.invokeAPI("NumberPortoutApi.postPortRequestSupportingDocuments", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Republish a port-out event
   * Republish a specific port-out event.
   * @param id Identifies the port-out event. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public void republishPortoutEvent(UUID id) throws ApiException {
    republishPortoutEventWithHttpInfo(id);
  }

  /**
   * Republish a port-out event
   * Republish a specific port-out event.
   * @param id Identifies the port-out event. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> republishPortoutEventWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling republishPortoutEvent");
    }
    
    // create path and map variables
    String localVarPath = "/portouts/events/{id}/republish"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    return apiClient.invokeAPI("NumberPortoutApi.republishPortoutEvent", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Show a port-out event
   * Show a specific port-out event.
   * @param id Identifies the port-out event. (required)
   * @return ShowPortoutEvent200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ShowPortoutEvent200Response showPortoutEvent(UUID id) throws ApiException {
    return showPortoutEventWithHttpInfo(id).getData();
  }

  /**
   * Show a port-out event
   * Show a specific port-out event.
   * @param id Identifies the port-out event. (required)
   * @return ApiResponse&lt;ShowPortoutEvent200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ShowPortoutEvent200Response> showPortoutEventWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling showPortoutEvent");
    }
    
    // create path and map variables
    String localVarPath = "/portouts/events/{id}"
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

    GenericType<ShowPortoutEvent200Response> localVarReturnType = new GenericType<ShowPortoutEvent200Response>() {};

    return apiClient.invokeAPI("NumberPortoutApi.showPortoutEvent", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update Status
   * Authorize or reject portout request
   * @param id Portout id (required)
   * @param status Updated portout status (required)
   * @param updatePortoutStatusRequest  (required)
   * @return FindPortoutRequest200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Portout Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public FindPortoutRequest200Response updatePortoutStatus(UUID id, String status, UpdatePortoutStatusRequest updatePortoutStatusRequest) throws ApiException {
    return updatePortoutStatusWithHttpInfo(id, status, updatePortoutStatusRequest).getData();
  }

  /**
   * Update Status
   * Authorize or reject portout request
   * @param id Portout id (required)
   * @param status Updated portout status (required)
   * @param updatePortoutStatusRequest  (required)
   * @return ApiResponse&lt;FindPortoutRequest200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Portout Response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<FindPortoutRequest200Response> updatePortoutStatusWithHttpInfo(UUID id, String status, UpdatePortoutStatusRequest updatePortoutStatusRequest) throws ApiException {
    Object localVarPostBody = updatePortoutStatusRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updatePortoutStatus");
    }
    
    // verify the required parameter 'status' is set
    if (status == null) {
      throw new ApiException(400, "Missing the required parameter 'status' when calling updatePortoutStatus");
    }
    
    // verify the required parameter 'updatePortoutStatusRequest' is set
    if (updatePortoutStatusRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updatePortoutStatusRequest' when calling updatePortoutStatus");
    }
    
    // create path and map variables
    String localVarPath = "/portouts/{id}/{status}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "status" + "\\}", apiClient.escapeString(status.toString()));

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

    GenericType<FindPortoutRequest200Response> localVarReturnType = new GenericType<FindPortoutRequest200Response>() {};

    return apiClient.invokeAPI("NumberPortoutApi.updatePortoutStatus", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
