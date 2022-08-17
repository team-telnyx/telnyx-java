package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateManagedAccount200Response;
import com.telnyx.sdk.model.CreateManagedAccount422Response;
import com.telnyx.sdk.model.CreateManagedAccountRequest;
import com.telnyx.sdk.model.ListManagedAccounts200Response;
import com.telnyx.sdk.model.UpdateManagedAccountRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ManagedAccountsApi {
  private ApiClient apiClient;

  public ManagedAccountsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ManagedAccountsApi(ApiClient apiClient) {
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
   * Create a new managed account.
   * Create a new managed account owned by the authenticated user. You need to be explictly approved by Telnyx in order to become a manager account.
   * @param createManagedAccountRequest Parameters that define the managed account to be created (required)
   * @return CreateManagedAccount200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with information about a single managed account. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized response. Happens when the current user is not a manager account. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public CreateManagedAccount200Response createManagedAccount(CreateManagedAccountRequest createManagedAccountRequest) throws ApiException {
    return createManagedAccountWithHttpInfo(createManagedAccountRequest).getData();
  }

  /**
   * Create a new managed account.
   * Create a new managed account owned by the authenticated user. You need to be explictly approved by Telnyx in order to become a manager account.
   * @param createManagedAccountRequest Parameters that define the managed account to be created (required)
   * @return ApiResponse&lt;CreateManagedAccount200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with information about a single managed account. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized response. Happens when the current user is not a manager account. </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateManagedAccount200Response> createManagedAccountWithHttpInfo(CreateManagedAccountRequest createManagedAccountRequest) throws ApiException {
    Object localVarPostBody = createManagedAccountRequest;
    
    // verify the required parameter 'createManagedAccountRequest' is set
    if (createManagedAccountRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createManagedAccountRequest' when calling createManagedAccount");
    }
    
    // create path and map variables
    String localVarPath = "/managed_accounts";

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

    GenericType<CreateManagedAccount200Response> localVarReturnType = new GenericType<CreateManagedAccount200Response>() {};

    return apiClient.invokeAPI("ManagedAccountsApi.createManagedAccount", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Disables a managed account
   * Disables a managed account, forbidding it to use Telnyx services, including sending or receiving phone calls and SMS messages. Ongoing phone calls will not be affected. The managed account and its sub-users will still be able to log in via the mission control portal.
   * @param id Managed Account User ID (required)
   * @return CreateManagedAccount200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with information about a single managed account. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized response. Happens when the current user is not a manager account. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public CreateManagedAccount200Response disableManagedAccount(String id) throws ApiException {
    return disableManagedAccountWithHttpInfo(id).getData();
  }

  /**
   * Disables a managed account
   * Disables a managed account, forbidding it to use Telnyx services, including sending or receiving phone calls and SMS messages. Ongoing phone calls will not be affected. The managed account and its sub-users will still be able to log in via the mission control portal.
   * @param id Managed Account User ID (required)
   * @return ApiResponse&lt;CreateManagedAccount200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with information about a single managed account. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized response. Happens when the current user is not a manager account. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateManagedAccount200Response> disableManagedAccountWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling disableManagedAccount");
    }
    
    // create path and map variables
    String localVarPath = "/managed_accounts/{id}/actions/disable"
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

    GenericType<CreateManagedAccount200Response> localVarReturnType = new GenericType<CreateManagedAccount200Response>() {};

    return apiClient.invokeAPI("ManagedAccountsApi.disableManagedAccount", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Enables a managed account
   * Enables a managed account and its sub-users to use Telnyx services.
   * @param id Managed Account User ID (required)
   * @return CreateManagedAccount200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with information about a single managed account. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized response. Happens when the current user is not a manager account. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public CreateManagedAccount200Response enableManagedAccount(String id) throws ApiException {
    return enableManagedAccountWithHttpInfo(id).getData();
  }

  /**
   * Enables a managed account
   * Enables a managed account and its sub-users to use Telnyx services.
   * @param id Managed Account User ID (required)
   * @return ApiResponse&lt;CreateManagedAccount200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with information about a single managed account. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized response. Happens when the current user is not a manager account. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateManagedAccount200Response> enableManagedAccountWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling enableManagedAccount");
    }
    
    // create path and map variables
    String localVarPath = "/managed_accounts/{id}/actions/enable"
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

    GenericType<CreateManagedAccount200Response> localVarReturnType = new GenericType<CreateManagedAccount200Response>() {};

    return apiClient.invokeAPI("ManagedAccountsApi.enableManagedAccount", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Lists accounts managed by the current user.
   * Lists the accounts managed by the current user. Users need to be explictly approved by Telnyx in order to become manager accounts.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterEmailContains If present, email containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters. (optional, default to null)
   * @param filterEmailEq If present, only returns results with the &lt;code&gt;email&lt;/code&gt; matching exactly the value given. (optional, default to null)
   * @param sort Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the &lt;code&gt; -&lt;/code&gt; prefix.&lt;br/&gt;&lt;br/&gt; That is: &lt;ul&gt;   &lt;li&gt;     &lt;code&gt;email&lt;/code&gt;: sorts the result by the     &lt;code&gt;email&lt;/code&gt; field in ascending order.   &lt;/li&gt;    &lt;li&gt;     &lt;code&gt;-email&lt;/code&gt;: sorts the result by the     &lt;code&gt;email&lt;/code&gt; field in descending order.   &lt;/li&gt; &lt;/ul&gt; &lt;br/&gt; If not given, results are sorted by &lt;code&gt;created_at&lt;/code&gt; in descending order. (optional, default to created_at)
   * @param includeCancelledAccounts Specifies if cancelled accounts should be included in the results. (optional, default to false)
   * @return ListManagedAccounts200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with a list of managed accounts. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized response. Happens when the current user is not a manager account. </td><td>  -  </td></tr>
     </table>
   */
  public ListManagedAccounts200Response listManagedAccounts(Integer pageNumber, Integer pageSize, String filterEmailContains, String filterEmailEq, String sort, Boolean includeCancelledAccounts) throws ApiException {
    return listManagedAccountsWithHttpInfo(pageNumber, pageSize, filterEmailContains, filterEmailEq, sort, includeCancelledAccounts).getData();
  }

  /**
   * Lists accounts managed by the current user.
   * Lists the accounts managed by the current user. Users need to be explictly approved by Telnyx in order to become manager accounts.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterEmailContains If present, email containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters. (optional, default to null)
   * @param filterEmailEq If present, only returns results with the &lt;code&gt;email&lt;/code&gt; matching exactly the value given. (optional, default to null)
   * @param sort Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the &lt;code&gt; -&lt;/code&gt; prefix.&lt;br/&gt;&lt;br/&gt; That is: &lt;ul&gt;   &lt;li&gt;     &lt;code&gt;email&lt;/code&gt;: sorts the result by the     &lt;code&gt;email&lt;/code&gt; field in ascending order.   &lt;/li&gt;    &lt;li&gt;     &lt;code&gt;-email&lt;/code&gt;: sorts the result by the     &lt;code&gt;email&lt;/code&gt; field in descending order.   &lt;/li&gt; &lt;/ul&gt; &lt;br/&gt; If not given, results are sorted by &lt;code&gt;created_at&lt;/code&gt; in descending order. (optional, default to created_at)
   * @param includeCancelledAccounts Specifies if cancelled accounts should be included in the results. (optional, default to false)
   * @return ApiResponse&lt;ListManagedAccounts200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with a list of managed accounts. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized response. Happens when the current user is not a manager account. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListManagedAccounts200Response> listManagedAccountsWithHttpInfo(Integer pageNumber, Integer pageSize, String filterEmailContains, String filterEmailEq, String sort, Boolean includeCancelledAccounts) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/managed_accounts";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[email][contains]", filterEmailContains));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[email][eq]", filterEmailEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_cancelled_accounts", includeCancelledAccounts));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListManagedAccounts200Response> localVarReturnType = new GenericType<ListManagedAccounts200Response>() {};

    return apiClient.invokeAPI("ManagedAccountsApi.listManagedAccounts", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a managed account
   * Retrieves the details of a single managed account.
   * @param id Managed Account User ID (required)
   * @return CreateManagedAccount200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with information about a single managed account. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized response. Happens when the current user is not a manager account. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public CreateManagedAccount200Response retrieveManagedAccount(String id) throws ApiException {
    return retrieveManagedAccountWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a managed account
   * Retrieves the details of a single managed account.
   * @param id Managed Account User ID (required)
   * @return ApiResponse&lt;CreateManagedAccount200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with information about a single managed account. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized response. Happens when the current user is not a manager account. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateManagedAccount200Response> retrieveManagedAccountWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retrieveManagedAccount");
    }
    
    // create path and map variables
    String localVarPath = "/managed_accounts/{id}"
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

    GenericType<CreateManagedAccount200Response> localVarReturnType = new GenericType<CreateManagedAccount200Response>() {};

    return apiClient.invokeAPI("ManagedAccountsApi.retrieveManagedAccount", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update a managed account
   * Update a single managed account.
   * @param id Managed Account User ID (required)
   * @param updateManagedAccountRequest Parameters that define the updates to the managed account (required)
   * @return CreateManagedAccount200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with information about a single managed account. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized response. Happens when the current user is not a manager account. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public CreateManagedAccount200Response updateManagedAccount(String id, UpdateManagedAccountRequest updateManagedAccountRequest) throws ApiException {
    return updateManagedAccountWithHttpInfo(id, updateManagedAccountRequest).getData();
  }

  /**
   * Update a managed account
   * Update a single managed account.
   * @param id Managed Account User ID (required)
   * @param updateManagedAccountRequest Parameters that define the updates to the managed account (required)
   * @return ApiResponse&lt;CreateManagedAccount200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with information about a single managed account. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized response. Happens when the current user is not a manager account. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateManagedAccount200Response> updateManagedAccountWithHttpInfo(String id, UpdateManagedAccountRequest updateManagedAccountRequest) throws ApiException {
    Object localVarPostBody = updateManagedAccountRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateManagedAccount");
    }
    
    // verify the required parameter 'updateManagedAccountRequest' is set
    if (updateManagedAccountRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'updateManagedAccountRequest' when calling updateManagedAccount");
    }
    
    // create path and map variables
    String localVarPath = "/managed_accounts/{id}"
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

    GenericType<CreateManagedAccount200Response> localVarReturnType = new GenericType<CreateManagedAccount200Response>() {};

    return apiClient.invokeAPI("ManagedAccountsApi.updateManagedAccount", localVarPath, "PATCH", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
