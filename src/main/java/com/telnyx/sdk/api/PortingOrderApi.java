package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.ActivatePortingOrder202Response;
import com.telnyx.sdk.model.CancelPortingOrder200Response;
import com.telnyx.sdk.model.ConfirmPortingOrder200Response;
import com.telnyx.sdk.model.CreateAdditionalDocuments201Response;
import com.telnyx.sdk.model.CreateAdditionalDocumentsRequest;
import com.telnyx.sdk.model.CreateComment201Response;
import com.telnyx.sdk.model.CreateLoaConfiguration201Response;
import com.telnyx.sdk.model.CreatePhoneNumberConfigurations201Response;
import com.telnyx.sdk.model.CreatePhoneNumberConfigurationsRequest;
import com.telnyx.sdk.model.CreatePortingOrder;
import com.telnyx.sdk.model.CreatePortingOrder201Response;
import com.telnyx.sdk.model.CreatePortingOrderComment;
import com.telnyx.sdk.model.CreatePortingReport201Response;
import com.telnyx.sdk.model.CreatePortingReportRequest;
import java.io.File;
import com.telnyx.sdk.model.GetPortingOrder200Response;
import com.telnyx.sdk.model.GetPortingOrderSubRequest200Response;
import com.telnyx.sdk.model.ListAdditionalDocuments200Response;
import com.telnyx.sdk.model.ListAllowedFocWindows200Response;
import com.telnyx.sdk.model.ListExceptionTypes200Response;
import com.telnyx.sdk.model.ListLoaConfigurations200Response;
import com.telnyx.sdk.model.ListPhoneNumberConfigurations200Response;
import com.telnyx.sdk.model.ListPortingOrderActivationJobs200Response;
import com.telnyx.sdk.model.ListPortingOrderComments200Response;
import com.telnyx.sdk.model.ListPortingOrderRequirements200Response;
import com.telnyx.sdk.model.ListPortingOrders200Response;
import com.telnyx.sdk.model.ListPortingPhoneNumbers200Response;
import com.telnyx.sdk.model.ListPortingReports200Response;
import com.telnyx.sdk.model.ListVerificationCodes200Response;
import com.telnyx.sdk.model.PortabilityStatus;
import com.telnyx.sdk.model.PortingOrderActivationStatus;
import com.telnyx.sdk.model.PortingOrderType;
import com.telnyx.sdk.model.PreviewLoaConfigurationParamsRequest;
import com.telnyx.sdk.model.SendPortingVerificationCodesRequest;
import com.telnyx.sdk.model.SharePortingOrder201Response;
import com.telnyx.sdk.model.SharePortingOrderRequest;
import java.util.UUID;
import com.telnyx.sdk.model.UpdatePortingOrder;
import com.telnyx.sdk.model.UpdatePortingOrder200Response;
import com.telnyx.sdk.model.UpdatePortingOrdersActivationJobRequest;
import com.telnyx.sdk.model.VerifyPortingVerificationCodes200Response;
import com.telnyx.sdk.model.VerifyPortingVerificationCodesRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class PortingOrderApi {
  private ApiClient apiClient;

  public PortingOrderApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PortingOrderApi(ApiClient apiClient) {
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
   * Activate every number in a porting order asynchronously.
   * Activate each number in a porting order asynchronously. This operation is limited to US FastPort orders only.
   * @param id Porting Order id (required)
   * @return ActivatePortingOrder202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ActivatePortingOrder202Response activatePortingOrder(UUID id) throws ApiException {
    return activatePortingOrderWithHttpInfo(id).getData();
  }

  /**
   * Activate every number in a porting order asynchronously.
   * Activate each number in a porting order asynchronously. This operation is limited to US FastPort orders only.
   * @param id Porting Order id (required)
   * @return ApiResponse&lt;ActivatePortingOrder202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ActivatePortingOrder202Response> activatePortingOrderWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling activatePortingOrder");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}/actions/activate"
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

    GenericType<ActivatePortingOrder202Response> localVarReturnType = new GenericType<ActivatePortingOrder202Response>() {};

    return apiClient.invokeAPI("PortingOrderApi.activatePortingOrder", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Cancel a porting order
   * Cancel a porting order
   * @param id Porting Order id (required)
   * @return CancelPortingOrder200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public CancelPortingOrder200Response cancelPortingOrder(UUID id) throws ApiException {
    return cancelPortingOrderWithHttpInfo(id).getData();
  }

  /**
   * Cancel a porting order
   * Cancel a porting order
   * @param id Porting Order id (required)
   * @return ApiResponse&lt;CancelPortingOrder200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CancelPortingOrder200Response> cancelPortingOrderWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling cancelPortingOrder");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}/actions/cancel"
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

    GenericType<CancelPortingOrder200Response> localVarReturnType = new GenericType<CancelPortingOrder200Response>() {};

    return apiClient.invokeAPI("PortingOrderApi.cancelPortingOrder", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Submit a porting order.
   * Confirm and submit your porting order.
   * @param id Porting Order id (required)
   * @return ConfirmPortingOrder200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ConfirmPortingOrder200Response confirmPortingOrder(UUID id) throws ApiException {
    return confirmPortingOrderWithHttpInfo(id).getData();
  }

  /**
   * Submit a porting order.
   * Confirm and submit your porting order.
   * @param id Porting Order id (required)
   * @return ApiResponse&lt;ConfirmPortingOrder200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConfirmPortingOrder200Response> confirmPortingOrderWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling confirmPortingOrder");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}/actions/confirm"
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

    GenericType<ConfirmPortingOrder200Response> localVarReturnType = new GenericType<ConfirmPortingOrder200Response>() {};

    return apiClient.invokeAPI("PortingOrderApi.confirmPortingOrder", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a list of additional documents
   * Creates a list of additional documents for a porting order.
   * @param id Porting Order id (required)
   * @param createAdditionalDocumentsRequest A list of additional document parameters (required)
   * @return CreateAdditionalDocuments201Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public CreateAdditionalDocuments201Response createAdditionalDocuments(UUID id, CreateAdditionalDocumentsRequest createAdditionalDocumentsRequest) throws ApiException {
    return createAdditionalDocumentsWithHttpInfo(id, createAdditionalDocumentsRequest).getData();
  }

  /**
   * Create a list of additional documents
   * Creates a list of additional documents for a porting order.
   * @param id Porting Order id (required)
   * @param createAdditionalDocumentsRequest A list of additional document parameters (required)
   * @return ApiResponse&lt;CreateAdditionalDocuments201Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateAdditionalDocuments201Response> createAdditionalDocumentsWithHttpInfo(UUID id, CreateAdditionalDocumentsRequest createAdditionalDocumentsRequest) throws ApiException {
    Object localVarPostBody = createAdditionalDocumentsRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling createAdditionalDocuments");
    }
    
    // verify the required parameter 'createAdditionalDocumentsRequest' is set
    if (createAdditionalDocumentsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createAdditionalDocumentsRequest' when calling createAdditionalDocuments");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}/additional_documents"
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

    GenericType<CreateAdditionalDocuments201Response> localVarReturnType = new GenericType<CreateAdditionalDocuments201Response>() {};

    return apiClient.invokeAPI("PortingOrderApi.createAdditionalDocuments", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a comment for a porting order
   * Creates a new comment for a porting order.
   * @param id Porting Order id (required)
   * @param createPortingOrderComment  (required)
   * @return CreateComment201Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public CreateComment201Response createComment(UUID id, CreatePortingOrderComment createPortingOrderComment) throws ApiException {
    return createCommentWithHttpInfo(id, createPortingOrderComment).getData();
  }

  /**
   * Create a comment for a porting order
   * Creates a new comment for a porting order.
   * @param id Porting Order id (required)
   * @param createPortingOrderComment  (required)
   * @return ApiResponse&lt;CreateComment201Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateComment201Response> createCommentWithHttpInfo(UUID id, CreatePortingOrderComment createPortingOrderComment) throws ApiException {
    Object localVarPostBody = createPortingOrderComment;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling createComment");
    }
    
    // verify the required parameter 'createPortingOrderComment' is set
    if (createPortingOrderComment == null) {
      throw new ApiException(400, "Missing the required parameter 'createPortingOrderComment' when calling createComment");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}/comments"
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

    GenericType<CreateComment201Response> localVarReturnType = new GenericType<CreateComment201Response>() {};

    return apiClient.invokeAPI("PortingOrderApi.createComment", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a LOA configuration
   * Create a LOA configuration.
   * @param previewLoaConfigurationParamsRequest  (required)
   * @return CreateLoaConfiguration201Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public CreateLoaConfiguration201Response createLoaConfiguration(PreviewLoaConfigurationParamsRequest previewLoaConfigurationParamsRequest) throws ApiException {
    return createLoaConfigurationWithHttpInfo(previewLoaConfigurationParamsRequest).getData();
  }

  /**
   * Create a LOA configuration
   * Create a LOA configuration.
   * @param previewLoaConfigurationParamsRequest  (required)
   * @return ApiResponse&lt;CreateLoaConfiguration201Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateLoaConfiguration201Response> createLoaConfigurationWithHttpInfo(PreviewLoaConfigurationParamsRequest previewLoaConfigurationParamsRequest) throws ApiException {
    Object localVarPostBody = previewLoaConfigurationParamsRequest;
    
    // verify the required parameter 'previewLoaConfigurationParamsRequest' is set
    if (previewLoaConfigurationParamsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'previewLoaConfigurationParamsRequest' when calling createLoaConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/porting/loa_configurations";

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

    GenericType<CreateLoaConfiguration201Response> localVarReturnType = new GenericType<CreateLoaConfiguration201Response>() {};

    return apiClient.invokeAPI("PortingOrderApi.createLoaConfiguration", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a list of phone number configurations
   * Creates a list of phone number configurations.
   * @param createPhoneNumberConfigurationsRequest A list of phone number configuration parameters (required)
   * @return CreatePhoneNumberConfigurations201Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public CreatePhoneNumberConfigurations201Response createPhoneNumberConfigurations(CreatePhoneNumberConfigurationsRequest createPhoneNumberConfigurationsRequest) throws ApiException {
    return createPhoneNumberConfigurationsWithHttpInfo(createPhoneNumberConfigurationsRequest).getData();
  }

  /**
   * Create a list of phone number configurations
   * Creates a list of phone number configurations.
   * @param createPhoneNumberConfigurationsRequest A list of phone number configuration parameters (required)
   * @return ApiResponse&lt;CreatePhoneNumberConfigurations201Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreatePhoneNumberConfigurations201Response> createPhoneNumberConfigurationsWithHttpInfo(CreatePhoneNumberConfigurationsRequest createPhoneNumberConfigurationsRequest) throws ApiException {
    Object localVarPostBody = createPhoneNumberConfigurationsRequest;
    
    // verify the required parameter 'createPhoneNumberConfigurationsRequest' is set
    if (createPhoneNumberConfigurationsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createPhoneNumberConfigurationsRequest' when calling createPhoneNumberConfigurations");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/phone_number_configurations";

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

    GenericType<CreatePhoneNumberConfigurations201Response> localVarReturnType = new GenericType<CreatePhoneNumberConfigurations201Response>() {};

    return apiClient.invokeAPI("PortingOrderApi.createPhoneNumberConfigurations", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a porting order
   * Creates a new porting order object.
   * @param createPortingOrder  (required)
   * @return CreatePortingOrder201Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public CreatePortingOrder201Response createPortingOrder(CreatePortingOrder createPortingOrder) throws ApiException {
    return createPortingOrderWithHttpInfo(createPortingOrder).getData();
  }

  /**
   * Create a porting order
   * Creates a new porting order object.
   * @param createPortingOrder  (required)
   * @return ApiResponse&lt;CreatePortingOrder201Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreatePortingOrder201Response> createPortingOrderWithHttpInfo(CreatePortingOrder createPortingOrder) throws ApiException {
    Object localVarPostBody = createPortingOrder;
    
    // verify the required parameter 'createPortingOrder' is set
    if (createPortingOrder == null) {
      throw new ApiException(400, "Missing the required parameter 'createPortingOrder' when calling createPortingOrder");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders";

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

    GenericType<CreatePortingOrder201Response> localVarReturnType = new GenericType<CreatePortingOrder201Response>() {};

    return apiClient.invokeAPI("PortingOrderApi.createPortingOrder", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a porting related report
   * Generate reports about porting operations.
   * @param createPortingReportRequest  (required)
   * @return CreatePortingReport201Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public CreatePortingReport201Response createPortingReport(CreatePortingReportRequest createPortingReportRequest) throws ApiException {
    return createPortingReportWithHttpInfo(createPortingReportRequest).getData();
  }

  /**
   * Create a porting related report
   * Generate reports about porting operations.
   * @param createPortingReportRequest  (required)
   * @return ApiResponse&lt;CreatePortingReport201Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreatePortingReport201Response> createPortingReportWithHttpInfo(CreatePortingReportRequest createPortingReportRequest) throws ApiException {
    Object localVarPostBody = createPortingReportRequest;
    
    // verify the required parameter 'createPortingReportRequest' is set
    if (createPortingReportRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createPortingReportRequest' when calling createPortingReport");
    }
    
    // create path and map variables
    String localVarPath = "/porting/reports";

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

    GenericType<CreatePortingReport201Response> localVarReturnType = new GenericType<CreatePortingReport201Response>() {};

    return apiClient.invokeAPI("PortingOrderApi.createPortingReport", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete an additional document
   * Deletes an additional document for a porting order.
   * @param id Porting Order id (required)
   * @param additionalDocumentId Additional document identification. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public void deleteAdditionalDocument(UUID id, UUID additionalDocumentId) throws ApiException {
    deleteAdditionalDocumentWithHttpInfo(id, additionalDocumentId);
  }

  /**
   * Delete an additional document
   * Deletes an additional document for a porting order.
   * @param id Porting Order id (required)
   * @param additionalDocumentId Additional document identification. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteAdditionalDocumentWithHttpInfo(UUID id, UUID additionalDocumentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteAdditionalDocument");
    }
    
    // verify the required parameter 'additionalDocumentId' is set
    if (additionalDocumentId == null) {
      throw new ApiException(400, "Missing the required parameter 'additionalDocumentId' when calling deleteAdditionalDocument");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}/additional_documents/{additional_document_id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "additional_document_id" + "\\}", apiClient.escapeString(additionalDocumentId.toString()));

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

    return apiClient.invokeAPI("PortingOrderApi.deleteAdditionalDocument", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Delete a LOA configuration
   * Delete a specific LOA configuration.
   * @param id Identifies a LOA configuration. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public void deleteLoaConfiguration(UUID id) throws ApiException {
    deleteLoaConfigurationWithHttpInfo(id);
  }

  /**
   * Delete a LOA configuration
   * Delete a specific LOA configuration.
   * @param id Identifies a LOA configuration. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteLoaConfigurationWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteLoaConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/porting/loa_configurations/{id}"
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

    return apiClient.invokeAPI("PortingOrderApi.deleteLoaConfiguration", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Delete a porting order
   * Deletes an existing porting order. This operation is restrict to porting orders in draft state.
   * @param id Porting Order id (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public void deletePortingOrder(UUID id) throws ApiException {
    deletePortingOrderWithHttpInfo(id);
  }

  /**
   * Delete a porting order
   * Deletes an existing porting order. This operation is restrict to porting orders in draft state.
   * @param id Porting Order id (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deletePortingOrderWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deletePortingOrder");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}"
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

    return apiClient.invokeAPI("PortingOrderApi.deletePortingOrder", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Retrieve a LOA configuration
   * Retrieve a specific LOA configuration.
   * @param id Identifies a LOA configuration. (required)
   * @return CreateLoaConfiguration201Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public CreateLoaConfiguration201Response getLoaConfiguration(UUID id) throws ApiException {
    return getLoaConfigurationWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a LOA configuration
   * Retrieve a specific LOA configuration.
   * @param id Identifies a LOA configuration. (required)
   * @return ApiResponse&lt;CreateLoaConfiguration201Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateLoaConfiguration201Response> getLoaConfigurationWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getLoaConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/porting/loa_configurations/{id}"
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

    GenericType<CreateLoaConfiguration201Response> localVarReturnType = new GenericType<CreateLoaConfiguration201Response>() {};

    return apiClient.invokeAPI("PortingOrderApi.getLoaConfiguration", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a porting order
   * Retrieves the details of an existing porting order.
   * @param id Porting Order id (required)
   * @param includePhoneNumbers Include the first 50 phone number objects in the results (optional, default to true)
   * @return GetPortingOrder200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public GetPortingOrder200Response getPortingOrder(UUID id, Boolean includePhoneNumbers) throws ApiException {
    return getPortingOrderWithHttpInfo(id, includePhoneNumbers).getData();
  }

  /**
   * Retrieve a porting order
   * Retrieves the details of an existing porting order.
   * @param id Porting Order id (required)
   * @param includePhoneNumbers Include the first 50 phone number objects in the results (optional, default to true)
   * @return ApiResponse&lt;GetPortingOrder200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetPortingOrder200Response> getPortingOrderWithHttpInfo(UUID id, Boolean includePhoneNumbers) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getPortingOrder");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_phone_numbers", includePhoneNumbers));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<GetPortingOrder200Response> localVarReturnType = new GenericType<GetPortingOrder200Response>() {};

    return apiClient.invokeAPI("PortingOrderApi.getPortingOrder", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Download a porting order loa template
   * Download a porting order loa template
   * @param id Porting Order id (required)
   * @param loaConfigurationId The identifier of the LOA configuration to use for the template. If not provided, the default LOA configuration will be used. (optional)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public File getPortingOrderLoaTemplate(UUID id, UUID loaConfigurationId) throws ApiException {
    return getPortingOrderLoaTemplateWithHttpInfo(id, loaConfigurationId).getData();
  }

  /**
   * Download a porting order loa template
   * Download a porting order loa template
   * @param id Porting Order id (required)
   * @param loaConfigurationId The identifier of the LOA configuration to use for the template. If not provided, the default LOA configuration will be used. (optional)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> getPortingOrderLoaTemplateWithHttpInfo(UUID id, UUID loaConfigurationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getPortingOrderLoaTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}/loa_template"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "loa_configuration_id", loaConfigurationId));

    
    
    
    final String[] localVarAccepts = {
      "application/pdf"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<File> localVarReturnType = new GenericType<File>() {};

    return apiClient.invokeAPI("PortingOrderApi.getPortingOrderLoaTemplate", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve the associated V1 sub_request_id and port_request_id
   * Retrieve the associated V1 sub_request_id and port_request_id
   * @param id Porting Order id (required)
   * @return GetPortingOrderSubRequest200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Porting Order not found </td><td>  -  </td></tr>
     </table>
   */
  public GetPortingOrderSubRequest200Response getPortingOrderSubRequest(UUID id) throws ApiException {
    return getPortingOrderSubRequestWithHttpInfo(id).getData();
  }

  /**
   * Retrieve the associated V1 sub_request_id and port_request_id
   * Retrieve the associated V1 sub_request_id and port_request_id
   * @param id Porting Order id (required)
   * @return ApiResponse&lt;GetPortingOrderSubRequest200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Porting Order not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetPortingOrderSubRequest200Response> getPortingOrderSubRequestWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getPortingOrderSubRequest");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}/sub_request"
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

    GenericType<GetPortingOrderSubRequest200Response> localVarReturnType = new GenericType<GetPortingOrderSubRequest200Response>() {};

    return apiClient.invokeAPI("PortingOrderApi.getPortingOrderSubRequest", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a porting activation job
   * Returns a porting activation job.
   * @param id Porting Order id (required)
   * @param activationJobId Activation Job Identifier (required)
   * @return ActivatePortingOrder202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ActivatePortingOrder202Response getPortingOrdersActivationJob(UUID id, UUID activationJobId) throws ApiException {
    return getPortingOrdersActivationJobWithHttpInfo(id, activationJobId).getData();
  }

  /**
   * Retrieve a porting activation job
   * Returns a porting activation job.
   * @param id Porting Order id (required)
   * @param activationJobId Activation Job Identifier (required)
   * @return ApiResponse&lt;ActivatePortingOrder202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ActivatePortingOrder202Response> getPortingOrdersActivationJobWithHttpInfo(UUID id, UUID activationJobId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getPortingOrdersActivationJob");
    }
    
    // verify the required parameter 'activationJobId' is set
    if (activationJobId == null) {
      throw new ApiException(400, "Missing the required parameter 'activationJobId' when calling getPortingOrdersActivationJob");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}/activation_jobs/{activationJobId}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "activationJobId" + "\\}", apiClient.escapeString(activationJobId.toString()));

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

    GenericType<ActivatePortingOrder202Response> localVarReturnType = new GenericType<ActivatePortingOrder202Response>() {};

    return apiClient.invokeAPI("PortingOrderApi.getPortingOrdersActivationJob", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a report
   * Retrieve a specific report generated.
   * @param id Identifies a report. (required)
   * @return CreatePortingReport201Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public CreatePortingReport201Response getPortingReport(UUID id) throws ApiException {
    return getPortingReportWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a report
   * Retrieve a specific report generated.
   * @param id Identifies a report. (required)
   * @return ApiResponse&lt;CreatePortingReport201Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreatePortingReport201Response> getPortingReportWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getPortingReport");
    }
    
    // create path and map variables
    String localVarPath = "/porting/reports/{id}"
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

    GenericType<CreatePortingReport201Response> localVarReturnType = new GenericType<CreatePortingReport201Response>() {};

    return apiClient.invokeAPI("PortingOrderApi.getPortingReport", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List additional documents
   * Returns a list of additional documents for a porting order.
   * @param id Porting Order id (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterDocumentType Filter additional documents of a specific document type (optional)
   * @param filterDocumentTypeIn Filter additional documents by a list of document types (optional)
   * @param sort Specifies the sort order for results. If not given, results are sorted by created_at in descending order. (optional)
   * @return ListAdditionalDocuments200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ListAdditionalDocuments200Response listAdditionalDocuments(UUID id, Integer pageNumber, Integer pageSize, String filterDocumentType, List<String> filterDocumentTypeIn, String sort) throws ApiException {
    return listAdditionalDocumentsWithHttpInfo(id, pageNumber, pageSize, filterDocumentType, filterDocumentTypeIn, sort).getData();
  }

  /**
   * List additional documents
   * Returns a list of additional documents for a porting order.
   * @param id Porting Order id (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterDocumentType Filter additional documents of a specific document type (optional)
   * @param filterDocumentTypeIn Filter additional documents by a list of document types (optional)
   * @param sort Specifies the sort order for results. If not given, results are sorted by created_at in descending order. (optional)
   * @return ApiResponse&lt;ListAdditionalDocuments200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListAdditionalDocuments200Response> listAdditionalDocumentsWithHttpInfo(UUID id, Integer pageNumber, Integer pageSize, String filterDocumentType, List<String> filterDocumentTypeIn, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling listAdditionalDocuments");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}/additional_documents"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[document_type]", filterDocumentType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[document_type][in][]", filterDocumentTypeIn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[]", sort));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListAdditionalDocuments200Response> localVarReturnType = new GenericType<ListAdditionalDocuments200Response>() {};

    return apiClient.invokeAPI("PortingOrderApi.listAdditionalDocuments", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List allowed FOC dates
   * Returns a list of allowed FOC dates for a porting order.
   * @param id Porting Order id (required)
   * @return ListAllowedFocWindows200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ListAllowedFocWindows200Response listAllowedFocWindows(UUID id) throws ApiException {
    return listAllowedFocWindowsWithHttpInfo(id).getData();
  }

  /**
   * List allowed FOC dates
   * Returns a list of allowed FOC dates for a porting order.
   * @param id Porting Order id (required)
   * @return ApiResponse&lt;ListAllowedFocWindows200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListAllowedFocWindows200Response> listAllowedFocWindowsWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling listAllowedFocWindows");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}/allowed_foc_windows"
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

    GenericType<ListAllowedFocWindows200Response> localVarReturnType = new GenericType<ListAllowedFocWindows200Response>() {};

    return apiClient.invokeAPI("PortingOrderApi.listAllowedFocWindows", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all exception types
   * Returns a list of all possible exception types for a porting order.
   * @return ListExceptionTypes200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ListExceptionTypes200Response listExceptionTypes() throws ApiException {
    return listExceptionTypesWithHttpInfo().getData();
  }

  /**
   * List all exception types
   * Returns a list of all possible exception types for a porting order.
   * @return ApiResponse&lt;ListExceptionTypes200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListExceptionTypes200Response> listExceptionTypesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/porting_orders/exception_types";

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

    GenericType<ListExceptionTypes200Response> localVarReturnType = new GenericType<ListExceptionTypes200Response>() {};

    return apiClient.invokeAPI("PortingOrderApi.listExceptionTypes", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List LOA configurations
   * List the LOA configurations.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ListLoaConfigurations200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ListLoaConfigurations200Response listLoaConfigurations(Integer pageNumber, Integer pageSize) throws ApiException {
    return listLoaConfigurationsWithHttpInfo(pageNumber, pageSize).getData();
  }

  /**
   * List LOA configurations
   * List the LOA configurations.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;ListLoaConfigurations200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListLoaConfigurations200Response> listLoaConfigurationsWithHttpInfo(Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/porting/loa_configurations";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<ListLoaConfigurations200Response> localVarReturnType = new GenericType<ListLoaConfigurations200Response>() {};

    return apiClient.invokeAPI("PortingOrderApi.listLoaConfigurations", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all phone number configurations
   * Returns a list of phone number configurations paginated.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterPortingOrderId Filter results by porting order id (optional)
   * @param filterPortingOrderIdIn Filter results by a list of porting order ids (optional)
   * @param filterUserBundleId Filter results by a specific user bundle ID (optional)
   * @param filterUserBundleIdIn Filter results by a list of user bundle IDs (optional)
   * @param filterPortingPhoneNumber Filter results by a specific porting phone number ID (optional)
   * @param filterPortingPhoneNumberIn Filter results by a list of porting phone number IDs (optional)
   * @param sort Specifies the sort order for results. If not given, results are sorted by created_at in descending order. (optional)
   * @return ListPhoneNumberConfigurations200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ListPhoneNumberConfigurations200Response listPhoneNumberConfigurations(Integer pageNumber, Integer pageSize, UUID filterPortingOrderId, List<UUID> filterPortingOrderIdIn, UUID filterUserBundleId, List<UUID> filterUserBundleIdIn, UUID filterPortingPhoneNumber, List<UUID> filterPortingPhoneNumberIn, String sort) throws ApiException {
    return listPhoneNumberConfigurationsWithHttpInfo(pageNumber, pageSize, filterPortingOrderId, filterPortingOrderIdIn, filterUserBundleId, filterUserBundleIdIn, filterPortingPhoneNumber, filterPortingPhoneNumberIn, sort).getData();
  }

  /**
   * List all phone number configurations
   * Returns a list of phone number configurations paginated.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterPortingOrderId Filter results by porting order id (optional)
   * @param filterPortingOrderIdIn Filter results by a list of porting order ids (optional)
   * @param filterUserBundleId Filter results by a specific user bundle ID (optional)
   * @param filterUserBundleIdIn Filter results by a list of user bundle IDs (optional)
   * @param filterPortingPhoneNumber Filter results by a specific porting phone number ID (optional)
   * @param filterPortingPhoneNumberIn Filter results by a list of porting phone number IDs (optional)
   * @param sort Specifies the sort order for results. If not given, results are sorted by created_at in descending order. (optional)
   * @return ApiResponse&lt;ListPhoneNumberConfigurations200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListPhoneNumberConfigurations200Response> listPhoneNumberConfigurationsWithHttpInfo(Integer pageNumber, Integer pageSize, UUID filterPortingOrderId, List<UUID> filterPortingOrderIdIn, UUID filterUserBundleId, List<UUID> filterUserBundleIdIn, UUID filterPortingPhoneNumber, List<UUID> filterPortingPhoneNumberIn, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/porting_orders/phone_number_configurations";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[porting_order_id]", filterPortingOrderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[porting_order_id][in][]", filterPortingOrderIdIn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[user_bundle_id]", filterUserBundleId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[user_bundle_id][in][]", filterUserBundleIdIn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[porting_phone_number]", filterPortingPhoneNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[porting_phone_number][in][]", filterPortingPhoneNumberIn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[]", sort));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListPhoneNumberConfigurations200Response> localVarReturnType = new GenericType<ListPhoneNumberConfigurations200Response>() {};

    return apiClient.invokeAPI("PortingOrderApi.listPhoneNumberConfigurations", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all porting activation jobs
   * Returns a list of your porting activation jobs.
   * @param id Porting Order id (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ListPortingOrderActivationJobs200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ListPortingOrderActivationJobs200Response listPortingOrderActivationJobs(UUID id, Integer pageNumber, Integer pageSize) throws ApiException {
    return listPortingOrderActivationJobsWithHttpInfo(id, pageNumber, pageSize).getData();
  }

  /**
   * List all porting activation jobs
   * Returns a list of your porting activation jobs.
   * @param id Porting Order id (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;ListPortingOrderActivationJobs200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListPortingOrderActivationJobs200Response> listPortingOrderActivationJobsWithHttpInfo(UUID id, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling listPortingOrderActivationJobs");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}/activation_jobs"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<ListPortingOrderActivationJobs200Response> localVarReturnType = new GenericType<ListPortingOrderActivationJobs200Response>() {};

    return apiClient.invokeAPI("PortingOrderApi.listPortingOrderActivationJobs", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all comments of a porting order
   * Returns a list of all comments of a porting order.
   * @param id Porting Order id (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ListPortingOrderComments200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ListPortingOrderComments200Response listPortingOrderComments(UUID id, Integer pageNumber, Integer pageSize) throws ApiException {
    return listPortingOrderCommentsWithHttpInfo(id, pageNumber, pageSize).getData();
  }

  /**
   * List all comments of a porting order
   * Returns a list of all comments of a porting order.
   * @param id Porting Order id (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;ListPortingOrderComments200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListPortingOrderComments200Response> listPortingOrderCommentsWithHttpInfo(UUID id, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling listPortingOrderComments");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}/comments"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<ListPortingOrderComments200Response> localVarReturnType = new GenericType<ListPortingOrderComments200Response>() {};

    return apiClient.invokeAPI("PortingOrderApi.listPortingOrderComments", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List porting order requirements
   * Returns a list of all requirements based on country/number type for this porting order.
   * @param id Porting Order id (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ListPortingOrderRequirements200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ListPortingOrderRequirements200Response listPortingOrderRequirements(UUID id, Integer pageNumber, Integer pageSize) throws ApiException {
    return listPortingOrderRequirementsWithHttpInfo(id, pageNumber, pageSize).getData();
  }

  /**
   * List porting order requirements
   * Returns a list of all requirements based on country/number type for this porting order.
   * @param id Porting Order id (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;ListPortingOrderRequirements200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListPortingOrderRequirements200Response> listPortingOrderRequirementsWithHttpInfo(UUID id, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling listPortingOrderRequirements");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}/requirements"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<ListPortingOrderRequirements200Response> localVarReturnType = new GenericType<ListPortingOrderRequirements200Response>() {};

    return apiClient.invokeAPI("PortingOrderApi.listPortingOrderRequirements", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all porting orders
   * Returns a list of your porting order.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param includePhoneNumbers Include the first 50 phone number objects in the results (optional, default to true)
   * @param filterStatus Filter results by status (optional)
   * @param filterStatusIn Filter porting orders by multiple statuses (optional)
   * @param filterCustomerReference Filter results by customer_reference (optional)
   * @param filterParentSupportKey Filter results by parent_support_key (optional)
   * @param filterPhoneNumbersCountryCode Filter results by country ISO 3166-1 alpha-2 code (optional)
   * @param filterPhoneNumbersCarrierName Filter results by old service provider (optional)
   * @param filterMiscType Filter results by porting order type (optional)
   * @param filterEndUserAdminEntityName Filter results by person or company name (optional)
   * @param filterEndUserAdminAuthPersonName Filter results by authorized person (optional)
   * @param filterActivationSettingsFastPortEligible Filter results by fast port eligible (optional)
   * @param filterActivationSettingsFocDatetimeRequestedGt Filter results by foc date later than this value (optional)
   * @param filterActivationSettingsFocDatetimeRequestedLt Filter results by foc date earlier than this value (optional)
   * @param filterPhoneNumbersPhoneNumberContains Filter results by full or partial phone_number (optional)
   * @param sort Specifies the sort order for results. If not given, results are sorted by created_at in descending order. (optional)
   * @return ListPortingOrders200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ListPortingOrders200Response listPortingOrders(Integer pageNumber, Integer pageSize, Boolean includePhoneNumbers, String filterStatus, String filterStatusIn, String filterCustomerReference, String filterParentSupportKey, String filterPhoneNumbersCountryCode, String filterPhoneNumbersCarrierName, PortingOrderType filterMiscType, String filterEndUserAdminEntityName, String filterEndUserAdminAuthPersonName, Boolean filterActivationSettingsFastPortEligible, String filterActivationSettingsFocDatetimeRequestedGt, String filterActivationSettingsFocDatetimeRequestedLt, String filterPhoneNumbersPhoneNumberContains, String sort) throws ApiException {
    return listPortingOrdersWithHttpInfo(pageNumber, pageSize, includePhoneNumbers, filterStatus, filterStatusIn, filterCustomerReference, filterParentSupportKey, filterPhoneNumbersCountryCode, filterPhoneNumbersCarrierName, filterMiscType, filterEndUserAdminEntityName, filterEndUserAdminAuthPersonName, filterActivationSettingsFastPortEligible, filterActivationSettingsFocDatetimeRequestedGt, filterActivationSettingsFocDatetimeRequestedLt, filterPhoneNumbersPhoneNumberContains, sort).getData();
  }

  /**
   * List all porting orders
   * Returns a list of your porting order.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param includePhoneNumbers Include the first 50 phone number objects in the results (optional, default to true)
   * @param filterStatus Filter results by status (optional)
   * @param filterStatusIn Filter porting orders by multiple statuses (optional)
   * @param filterCustomerReference Filter results by customer_reference (optional)
   * @param filterParentSupportKey Filter results by parent_support_key (optional)
   * @param filterPhoneNumbersCountryCode Filter results by country ISO 3166-1 alpha-2 code (optional)
   * @param filterPhoneNumbersCarrierName Filter results by old service provider (optional)
   * @param filterMiscType Filter results by porting order type (optional)
   * @param filterEndUserAdminEntityName Filter results by person or company name (optional)
   * @param filterEndUserAdminAuthPersonName Filter results by authorized person (optional)
   * @param filterActivationSettingsFastPortEligible Filter results by fast port eligible (optional)
   * @param filterActivationSettingsFocDatetimeRequestedGt Filter results by foc date later than this value (optional)
   * @param filterActivationSettingsFocDatetimeRequestedLt Filter results by foc date earlier than this value (optional)
   * @param filterPhoneNumbersPhoneNumberContains Filter results by full or partial phone_number (optional)
   * @param sort Specifies the sort order for results. If not given, results are sorted by created_at in descending order. (optional)
   * @return ApiResponse&lt;ListPortingOrders200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListPortingOrders200Response> listPortingOrdersWithHttpInfo(Integer pageNumber, Integer pageSize, Boolean includePhoneNumbers, String filterStatus, String filterStatusIn, String filterCustomerReference, String filterParentSupportKey, String filterPhoneNumbersCountryCode, String filterPhoneNumbersCarrierName, PortingOrderType filterMiscType, String filterEndUserAdminEntityName, String filterEndUserAdminAuthPersonName, Boolean filterActivationSettingsFastPortEligible, String filterActivationSettingsFocDatetimeRequestedGt, String filterActivationSettingsFocDatetimeRequestedLt, String filterPhoneNumbersPhoneNumberContains, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/porting_orders";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_phone_numbers", includePhoneNumbers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status]", filterStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status][in][]", filterStatusIn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[customer_reference]", filterCustomerReference));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[parent_support_key]", filterParentSupportKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_numbers.country_code]", filterPhoneNumbersCountryCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_numbers.carrier_name]", filterPhoneNumbersCarrierName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[misc.type]", filterMiscType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[end_user.admin.entity_name]", filterEndUserAdminEntityName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[end_user.admin.auth_person_name]", filterEndUserAdminAuthPersonName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[activation_settings.fast_port_eligible]", filterActivationSettingsFastPortEligible));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[activation_settings.foc_datetime_requested][gt]", filterActivationSettingsFocDatetimeRequestedGt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[activation_settings.foc_datetime_requested][lt]", filterActivationSettingsFocDatetimeRequestedLt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_numbers.phone_number][contains]", filterPhoneNumbersPhoneNumberContains));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[]", sort));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListPortingOrders200Response> localVarReturnType = new GenericType<ListPortingOrders200Response>() {};

    return apiClient.invokeAPI("PortingOrderApi.listPortingOrders", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all porting phone numbers
   * Returns a list of your porting phone numbers.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterPortingOrderId Filter results by porting order id (optional)
   * @param filterPortingOrderIdIn Filter results by a list of porting order ids (optional)
   * @param filterSupportKeyEq Filter results by support key (optional)
   * @param filterSupportKeyIn Filter results by a list of support keys (optional)
   * @param filterPhoneNumber Filter results by phone number (optional)
   * @param filterPhoneNumberIn Filter results by a list of phone numbers (optional)
   * @param filterPortingOrderStatus Filter results by porting order status (optional)
   * @param filterActivationStatus Filter results by activation status (optional)
   * @param filterPortabilityStatus Filter results by portability status (optional)
   * @return ListPortingPhoneNumbers200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ListPortingPhoneNumbers200Response listPortingPhoneNumbers(Integer pageNumber, Integer pageSize, UUID filterPortingOrderId, List<UUID> filterPortingOrderIdIn, String filterSupportKeyEq, List<String> filterSupportKeyIn, String filterPhoneNumber, List<String> filterPhoneNumberIn, String filterPortingOrderStatus, PortingOrderActivationStatus filterActivationStatus, PortabilityStatus filterPortabilityStatus) throws ApiException {
    return listPortingPhoneNumbersWithHttpInfo(pageNumber, pageSize, filterPortingOrderId, filterPortingOrderIdIn, filterSupportKeyEq, filterSupportKeyIn, filterPhoneNumber, filterPhoneNumberIn, filterPortingOrderStatus, filterActivationStatus, filterPortabilityStatus).getData();
  }

  /**
   * List all porting phone numbers
   * Returns a list of your porting phone numbers.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterPortingOrderId Filter results by porting order id (optional)
   * @param filterPortingOrderIdIn Filter results by a list of porting order ids (optional)
   * @param filterSupportKeyEq Filter results by support key (optional)
   * @param filterSupportKeyIn Filter results by a list of support keys (optional)
   * @param filterPhoneNumber Filter results by phone number (optional)
   * @param filterPhoneNumberIn Filter results by a list of phone numbers (optional)
   * @param filterPortingOrderStatus Filter results by porting order status (optional)
   * @param filterActivationStatus Filter results by activation status (optional)
   * @param filterPortabilityStatus Filter results by portability status (optional)
   * @return ApiResponse&lt;ListPortingPhoneNumbers200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListPortingPhoneNumbers200Response> listPortingPhoneNumbersWithHttpInfo(Integer pageNumber, Integer pageSize, UUID filterPortingOrderId, List<UUID> filterPortingOrderIdIn, String filterSupportKeyEq, List<String> filterSupportKeyIn, String filterPhoneNumber, List<String> filterPhoneNumberIn, String filterPortingOrderStatus, PortingOrderActivationStatus filterActivationStatus, PortabilityStatus filterPortabilityStatus) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/porting_phone_numbers";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[porting_order_id]", filterPortingOrderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[porting_order_id][in][]", filterPortingOrderIdIn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[support_key][eq]", filterSupportKeyEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[support_key][in][]", filterSupportKeyIn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_number]", filterPhoneNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[phone_number][in][]", filterPhoneNumberIn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[porting_order_status]", filterPortingOrderStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[activation_status]", filterActivationStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[portability_status]", filterPortabilityStatus));

    
    
    
    final String[] localVarAccepts = {
      "application/json", "text/csv"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListPortingPhoneNumbers200Response> localVarReturnType = new GenericType<ListPortingPhoneNumbers200Response>() {};

    return apiClient.invokeAPI("PortingOrderApi.listPortingPhoneNumbers", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List porting related reports
   * List the reports generated about porting operations.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterReportType Filter reports of a specific type (optional)
   * @param filterStatus Filter reports of a specific status (optional)
   * @return ListPortingReports200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ListPortingReports200Response listPortingReports(Integer pageNumber, Integer pageSize, String filterReportType, String filterStatus) throws ApiException {
    return listPortingReportsWithHttpInfo(pageNumber, pageSize, filterReportType, filterStatus).getData();
  }

  /**
   * List porting related reports
   * List the reports generated about porting operations.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterReportType Filter reports of a specific type (optional)
   * @param filterStatus Filter reports of a specific status (optional)
   * @return ApiResponse&lt;ListPortingReports200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListPortingReports200Response> listPortingReportsWithHttpInfo(Integer pageNumber, Integer pageSize, String filterReportType, String filterStatus) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/porting/reports";

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

    GenericType<ListPortingReports200Response> localVarReturnType = new GenericType<ListPortingReports200Response>() {};

    return apiClient.invokeAPI("PortingOrderApi.listPortingReports", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List verification codes
   * Returns a list of verification codes for a porting order.
   * @param id Porting Order id (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterPhoneNumber Filter results by phone number (optional)
   * @param filterPhoneNumberIn Filter results by a list of phone numbers (optional)
   * @param filterVerified Filter verification codes that have been verified or not (optional)
   * @param sort Specifies the sort order for results. If not given, results are sorted by created_at in descending order. (optional)
   * @return ListVerificationCodes200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ListVerificationCodes200Response listVerificationCodes(UUID id, Integer pageNumber, Integer pageSize, String filterPhoneNumber, List<String> filterPhoneNumberIn, Boolean filterVerified, String sort) throws ApiException {
    return listVerificationCodesWithHttpInfo(id, pageNumber, pageSize, filterPhoneNumber, filterPhoneNumberIn, filterVerified, sort).getData();
  }

  /**
   * List verification codes
   * Returns a list of verification codes for a porting order.
   * @param id Porting Order id (required)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterPhoneNumber Filter results by phone number (optional)
   * @param filterPhoneNumberIn Filter results by a list of phone numbers (optional)
   * @param filterVerified Filter verification codes that have been verified or not (optional)
   * @param sort Specifies the sort order for results. If not given, results are sorted by created_at in descending order. (optional)
   * @return ApiResponse&lt;ListVerificationCodes200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListVerificationCodes200Response> listVerificationCodesWithHttpInfo(UUID id, Integer pageNumber, Integer pageSize, String filterPhoneNumber, List<String> filterPhoneNumberIn, Boolean filterVerified, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling listVerificationCodes");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}/verification_codes"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_number]", filterPhoneNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[phone_number][in][]", filterPhoneNumberIn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[verified]", filterVerified));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[]", sort));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListVerificationCodes200Response> localVarReturnType = new GenericType<ListVerificationCodes200Response>() {};

    return apiClient.invokeAPI("PortingOrderApi.listVerificationCodes", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Preview a LOA configuration
   * Preview a specific LOA configuration.
   * @param id Identifies a LOA configuration. (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public File previewLoaConfiguration(UUID id) throws ApiException {
    return previewLoaConfigurationWithHttpInfo(id).getData();
  }

  /**
   * Preview a LOA configuration
   * Preview a specific LOA configuration.
   * @param id Identifies a LOA configuration. (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> previewLoaConfigurationWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling previewLoaConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/porting/loa_configurations/{id}/preview"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/pdf"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<File> localVarReturnType = new GenericType<File>() {};

    return apiClient.invokeAPI("PortingOrderApi.previewLoaConfiguration", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Preview the LOA configuration parameters
   * Preview the LOA template that would be generated without need to create LOA configuration.
   * @param previewLoaConfigurationParamsRequest  (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public File previewLoaConfigurationParams(PreviewLoaConfigurationParamsRequest previewLoaConfigurationParamsRequest) throws ApiException {
    return previewLoaConfigurationParamsWithHttpInfo(previewLoaConfigurationParamsRequest).getData();
  }

  /**
   * Preview the LOA configuration parameters
   * Preview the LOA template that would be generated without need to create LOA configuration.
   * @param previewLoaConfigurationParamsRequest  (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> previewLoaConfigurationParamsWithHttpInfo(PreviewLoaConfigurationParamsRequest previewLoaConfigurationParamsRequest) throws ApiException {
    Object localVarPostBody = previewLoaConfigurationParamsRequest;
    
    // verify the required parameter 'previewLoaConfigurationParamsRequest' is set
    if (previewLoaConfigurationParamsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'previewLoaConfigurationParamsRequest' when calling previewLoaConfigurationParams");
    }
    
    // create path and map variables
    String localVarPath = "/porting/loa_configuration/preview";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/pdf"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<File> localVarReturnType = new GenericType<File>() {};

    return apiClient.invokeAPI("PortingOrderApi.previewLoaConfigurationParams", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Send the verification codes
   * Send the verification code for all porting phone numbers.
   * @param id Porting Order id (required)
   * @param sendPortingVerificationCodesRequest A list of phone numbers to send the verification codes to and the method to send them by (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public void sendPortingVerificationCodes(UUID id, SendPortingVerificationCodesRequest sendPortingVerificationCodesRequest) throws ApiException {
    sendPortingVerificationCodesWithHttpInfo(id, sendPortingVerificationCodesRequest);
  }

  /**
   * Send the verification codes
   * Send the verification code for all porting phone numbers.
   * @param id Porting Order id (required)
   * @param sendPortingVerificationCodesRequest A list of phone numbers to send the verification codes to and the method to send them by (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> No content </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> sendPortingVerificationCodesWithHttpInfo(UUID id, SendPortingVerificationCodesRequest sendPortingVerificationCodesRequest) throws ApiException {
    Object localVarPostBody = sendPortingVerificationCodesRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling sendPortingVerificationCodes");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}/verification_codes/send"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    return apiClient.invokeAPI("PortingOrderApi.sendPortingVerificationCodes", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Share a porting order
   * Creates a sharing token for a porting order. The token can be used to share the porting order with non-Telnyx users.
   * @param id Porting Order id (required)
   * @param sharePortingOrderRequest  (required)
   * @return SharePortingOrder201Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Porting Order not found </td><td>  -  </td></tr>
     </table>
   */
  public SharePortingOrder201Response sharePortingOrder(UUID id, SharePortingOrderRequest sharePortingOrderRequest) throws ApiException {
    return sharePortingOrderWithHttpInfo(id, sharePortingOrderRequest).getData();
  }

  /**
   * Share a porting order
   * Creates a sharing token for a porting order. The token can be used to share the porting order with non-Telnyx users.
   * @param id Porting Order id (required)
   * @param sharePortingOrderRequest  (required)
   * @return ApiResponse&lt;SharePortingOrder201Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Porting Order not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SharePortingOrder201Response> sharePortingOrderWithHttpInfo(UUID id, SharePortingOrderRequest sharePortingOrderRequest) throws ApiException {
    Object localVarPostBody = sharePortingOrderRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling sharePortingOrder");
    }
    
    // verify the required parameter 'sharePortingOrderRequest' is set
    if (sharePortingOrderRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'sharePortingOrderRequest' when calling sharePortingOrder");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}/actions/share"
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

    GenericType<SharePortingOrder201Response> localVarReturnType = new GenericType<SharePortingOrder201Response>() {};

    return apiClient.invokeAPI("PortingOrderApi.sharePortingOrder", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a LOA configuration
   * Update a specific LOA configuration.
   * @param id Identifies a LOA configuration. (required)
   * @param previewLoaConfigurationParamsRequest  (required)
   * @return CreateLoaConfiguration201Response
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
  public CreateLoaConfiguration201Response updateLoaConfiguration(UUID id, PreviewLoaConfigurationParamsRequest previewLoaConfigurationParamsRequest) throws ApiException {
    return updateLoaConfigurationWithHttpInfo(id, previewLoaConfigurationParamsRequest).getData();
  }

  /**
   * Update a LOA configuration
   * Update a specific LOA configuration.
   * @param id Identifies a LOA configuration. (required)
   * @param previewLoaConfigurationParamsRequest  (required)
   * @return ApiResponse&lt;CreateLoaConfiguration201Response&gt;
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
  public ApiResponse<CreateLoaConfiguration201Response> updateLoaConfigurationWithHttpInfo(UUID id, PreviewLoaConfigurationParamsRequest previewLoaConfigurationParamsRequest) throws ApiException {
    Object localVarPostBody = previewLoaConfigurationParamsRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateLoaConfiguration");
    }
    
    // verify the required parameter 'previewLoaConfigurationParamsRequest' is set
    if (previewLoaConfigurationParamsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'previewLoaConfigurationParamsRequest' when calling updateLoaConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/porting/loa_configurations/{id}"
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

    GenericType<CreateLoaConfiguration201Response> localVarReturnType = new GenericType<CreateLoaConfiguration201Response>() {};

    return apiClient.invokeAPI("PortingOrderApi.updateLoaConfiguration", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Edit a porting order
   * Edits the details of an existing porting order.  Any or all of a porting orders attributes may be included in the resource object included in a PATCH request.  If a request does not include all of the attributes for a resource, the system will interpret the missing attributes as if they were included with their current values. To explicitly set something to null, it must be included in the request with a null value.
   * @param id Porting Order id (required)
   * @param updatePortingOrder  (required)
   * @return UpdatePortingOrder200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public UpdatePortingOrder200Response updatePortingOrder(UUID id, UpdatePortingOrder updatePortingOrder) throws ApiException {
    return updatePortingOrderWithHttpInfo(id, updatePortingOrder).getData();
  }

  /**
   * Edit a porting order
   * Edits the details of an existing porting order.  Any or all of a porting orders attributes may be included in the resource object included in a PATCH request.  If a request does not include all of the attributes for a resource, the system will interpret the missing attributes as if they were included with their current values. To explicitly set something to null, it must be included in the request with a null value.
   * @param id Porting Order id (required)
   * @param updatePortingOrder  (required)
   * @return ApiResponse&lt;UpdatePortingOrder200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UpdatePortingOrder200Response> updatePortingOrderWithHttpInfo(UUID id, UpdatePortingOrder updatePortingOrder) throws ApiException {
    Object localVarPostBody = updatePortingOrder;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updatePortingOrder");
    }
    
    // verify the required parameter 'updatePortingOrder' is set
    if (updatePortingOrder == null) {
      throw new ApiException(400, "Missing the required parameter 'updatePortingOrder' when calling updatePortingOrder");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}"
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

    GenericType<UpdatePortingOrder200Response> localVarReturnType = new GenericType<UpdatePortingOrder200Response>() {};

    return apiClient.invokeAPI("PortingOrderApi.updatePortingOrder", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a porting activation job
   * Updates the activation time of a porting activation job.
   * @param id Porting Order id (required)
   * @param activationJobId Activation Job Identifier (required)
   * @param updatePortingOrdersActivationJobRequest  (required)
   * @return ActivatePortingOrder202Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
     </table>
   */
  public ActivatePortingOrder202Response updatePortingOrdersActivationJob(UUID id, UUID activationJobId, UpdatePortingOrdersActivationJobRequest updatePortingOrdersActivationJobRequest) throws ApiException {
    return updatePortingOrdersActivationJobWithHttpInfo(id, activationJobId, updatePortingOrdersActivationJobRequest).getData();
  }

  /**
   * Update a porting activation job
   * Updates the activation time of a porting activation job.
   * @param id Porting Order id (required)
   * @param activationJobId Activation Job Identifier (required)
   * @param updatePortingOrdersActivationJobRequest  (required)
   * @return ApiResponse&lt;ActivatePortingOrder202Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ActivatePortingOrder202Response> updatePortingOrdersActivationJobWithHttpInfo(UUID id, UUID activationJobId, UpdatePortingOrdersActivationJobRequest updatePortingOrdersActivationJobRequest) throws ApiException {
    Object localVarPostBody = updatePortingOrdersActivationJobRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updatePortingOrdersActivationJob");
    }
    
    // verify the required parameter 'activationJobId' is set
    if (activationJobId == null) {
      throw new ApiException(400, "Missing the required parameter 'activationJobId' when calling updatePortingOrdersActivationJob");
    }
    
    // verify the required parameter 'updatePortingOrdersActivationJobRequest' is set
    if (updatePortingOrdersActivationJobRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updatePortingOrdersActivationJobRequest' when calling updatePortingOrdersActivationJob");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}/activation_jobs/{activationJobId}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "activationJobId" + "\\}", apiClient.escapeString(activationJobId.toString()));

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

    GenericType<ActivatePortingOrder202Response> localVarReturnType = new GenericType<ActivatePortingOrder202Response>() {};

    return apiClient.invokeAPI("PortingOrderApi.updatePortingOrdersActivationJob", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Verify the verification code for a list of phone numbers
   * Verifies the verification code for a list of phone numbers.
   * @param id Porting Order id (required)
   * @param verifyPortingVerificationCodesRequest A list of phone numbers and their verification codes (required)
   * @return VerifyPortingVerificationCodes200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public VerifyPortingVerificationCodes200Response verifyPortingVerificationCodes(UUID id, VerifyPortingVerificationCodesRequest verifyPortingVerificationCodesRequest) throws ApiException {
    return verifyPortingVerificationCodesWithHttpInfo(id, verifyPortingVerificationCodesRequest).getData();
  }

  /**
   * Verify the verification code for a list of phone numbers
   * Verifies the verification code for a list of phone numbers.
   * @param id Porting Order id (required)
   * @param verifyPortingVerificationCodesRequest A list of phone numbers and their verification codes (required)
   * @return ApiResponse&lt;VerifyPortingVerificationCodes200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check message field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<VerifyPortingVerificationCodes200Response> verifyPortingVerificationCodesWithHttpInfo(UUID id, VerifyPortingVerificationCodesRequest verifyPortingVerificationCodesRequest) throws ApiException {
    Object localVarPostBody = verifyPortingVerificationCodesRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling verifyPortingVerificationCodes");
    }
    
    // verify the required parameter 'verifyPortingVerificationCodesRequest' is set
    if (verifyPortingVerificationCodesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'verifyPortingVerificationCodesRequest' when calling verifyPortingVerificationCodes");
    }
    
    // create path and map variables
    String localVarPath = "/porting_orders/{id}/verification_codes/verify"
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

    GenericType<VerifyPortingVerificationCodes200Response> localVarReturnType = new GenericType<VerifyPortingVerificationCodes200Response>() {};

    return apiClient.invokeAPI("PortingOrderApi.verifyPortingVerificationCodes", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
