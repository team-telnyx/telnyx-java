package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateBillingGroupResponse;
import com.telnyx.sdk.model.DeleteBillingGroupResponse;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListBillingGroupsResponse;
import com.telnyx.sdk.model.NewBillingGroup;
import com.telnyx.sdk.model.RetrieveBillingGroupResponse;
import java.util.UUID;
import com.telnyx.sdk.model.UpdateBillingGroup;
import com.telnyx.sdk.model.UpdateBillingGroupResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BillingGroupsApi {
  private ApiClient apiClient;

  public BillingGroupsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BillingGroupsApi(ApiClient apiClient) {
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
   * Create a billing group
   * 
   * @param newBillingGroup New billing group object (required)
   * @return CreateBillingGroupResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected billing group response to a valid request </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateBillingGroupResponse createBillingGroup(NewBillingGroup newBillingGroup) throws ApiException {
    return createBillingGroupWithHttpInfo(newBillingGroup).getData();
  }

  /**
   * Create a billing group
   * 
   * @param newBillingGroup New billing group object (required)
   * @return ApiResponse&lt;CreateBillingGroupResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected billing group response to a valid request </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateBillingGroupResponse> createBillingGroupWithHttpInfo(NewBillingGroup newBillingGroup) throws ApiException {
    Object localVarPostBody = newBillingGroup;
    
    // verify the required parameter 'newBillingGroup' is set
    if (newBillingGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'newBillingGroup' when calling createBillingGroup");
    }
    
    // create path and map variables
    String localVarPath = "/billing_groups";

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

    GenericType<CreateBillingGroupResponse> localVarReturnType = new GenericType<CreateBillingGroupResponse>() {};

    return apiClient.invokeAPI("BillingGroupsApi.createBillingGroup", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a billing group
   * 
   * @param id The id of the billing group (required)
   * @return DeleteBillingGroupResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected billing group response to a valid request </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public DeleteBillingGroupResponse deleteBillingGroup(UUID id) throws ApiException {
    return deleteBillingGroupWithHttpInfo(id).getData();
  }

  /**
   * Delete a billing group
   * 
   * @param id The id of the billing group (required)
   * @return ApiResponse&lt;DeleteBillingGroupResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected billing group response to a valid request </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DeleteBillingGroupResponse> deleteBillingGroupWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteBillingGroup");
    }
    
    // create path and map variables
    String localVarPath = "/billing_groups/{id}"
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

    GenericType<DeleteBillingGroupResponse> localVarReturnType = new GenericType<DeleteBillingGroupResponse>() {};

    return apiClient.invokeAPI("BillingGroupsApi.deleteBillingGroup", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all billing groups
   * 
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ListBillingGroupsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A paginated array of billing groups </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListBillingGroupsResponse listBillingGroups(Integer pageNumber, Integer pageSize) throws ApiException {
    return listBillingGroupsWithHttpInfo(pageNumber, pageSize).getData();
  }

  /**
   * List all billing groups
   * 
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;ListBillingGroupsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A paginated array of billing groups </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListBillingGroupsResponse> listBillingGroupsWithHttpInfo(Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/billing_groups";

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

    GenericType<ListBillingGroupsResponse> localVarReturnType = new GenericType<ListBillingGroupsResponse>() {};

    return apiClient.invokeAPI("BillingGroupsApi.listBillingGroups", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a billing group
   * 
   * @param id The id of the billing group (required)
   * @return RetrieveBillingGroupResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected billing group response to a valid request </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveBillingGroupResponse retrieveBillingGroup(UUID id) throws ApiException {
    return retrieveBillingGroupWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a billing group
   * 
   * @param id The id of the billing group (required)
   * @return ApiResponse&lt;RetrieveBillingGroupResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected billing group response to a valid request </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveBillingGroupResponse> retrieveBillingGroupWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retrieveBillingGroup");
    }
    
    // create path and map variables
    String localVarPath = "/billing_groups/{id}"
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

    GenericType<RetrieveBillingGroupResponse> localVarReturnType = new GenericType<RetrieveBillingGroupResponse>() {};

    return apiClient.invokeAPI("BillingGroupsApi.retrieveBillingGroup", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a billing group
   * 
   * @param id The id of the billing group (required)
   * @param updateBillingGroup Update billing group object (required)
   * @return UpdateBillingGroupResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected billing group response to a valid request </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public UpdateBillingGroupResponse updateBillingGroup(UUID id, UpdateBillingGroup updateBillingGroup) throws ApiException {
    return updateBillingGroupWithHttpInfo(id, updateBillingGroup).getData();
  }

  /**
   * Update a billing group
   * 
   * @param id The id of the billing group (required)
   * @param updateBillingGroup Update billing group object (required)
   * @return ApiResponse&lt;UpdateBillingGroupResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected billing group response to a valid request </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UpdateBillingGroupResponse> updateBillingGroupWithHttpInfo(UUID id, UpdateBillingGroup updateBillingGroup) throws ApiException {
    Object localVarPostBody = updateBillingGroup;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateBillingGroup");
    }
    
    // verify the required parameter 'updateBillingGroup' is set
    if (updateBillingGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'updateBillingGroup' when calling updateBillingGroup");
    }
    
    // create path and map variables
    String localVarPath = "/billing_groups/{id}"
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

    GenericType<UpdateBillingGroupResponse> localVarReturnType = new GenericType<UpdateBillingGroupResponse>() {};

    return apiClient.invokeAPI("BillingGroupsApi.updateBillingGroup", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
