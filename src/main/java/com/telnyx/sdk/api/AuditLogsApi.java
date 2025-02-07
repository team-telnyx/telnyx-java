package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.AuditLogList;
import com.telnyx.sdk.model.Errors;
import java.time.OffsetDateTime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class AuditLogsApi {
  private ApiClient apiClient;

  public AuditLogsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AuditLogsApi(ApiClient apiClient) {
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
   * List Audit Logs
   * Retrieve a list of audit log entries. Audit logs are a best-effort, eventually consistent record of significant account-related changes.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterCreatedBefore Filter for audit events created before a specific date. (optional)
   * @param filterCreatedAfter Filter for audit events created after a specific date. (optional)
   * @param sort Set the order of the results by the creation date. (optional)
   * @return AuditLogList
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of audit log entries. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public AuditLogList listAuditLogs(Integer pageNumber, Integer pageSize, OffsetDateTime filterCreatedBefore, OffsetDateTime filterCreatedAfter, String sort) throws ApiException {
    return listAuditLogsWithHttpInfo(pageNumber, pageSize, filterCreatedBefore, filterCreatedAfter, sort).getData();
  }

  /**
   * List Audit Logs
   * Retrieve a list of audit log entries. Audit logs are a best-effort, eventually consistent record of significant account-related changes.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterCreatedBefore Filter for audit events created before a specific date. (optional)
   * @param filterCreatedAfter Filter for audit events created after a specific date. (optional)
   * @param sort Set the order of the results by the creation date. (optional)
   * @return ApiResponse&lt;AuditLogList&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A list of audit log entries. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AuditLogList> listAuditLogsWithHttpInfo(Integer pageNumber, Integer pageSize, OffsetDateTime filterCreatedBefore, OffsetDateTime filterCreatedAfter, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/audit_events";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[created_before]", filterCreatedBefore));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[created_after]", filterCreatedAfter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<AuditLogList> localVarReturnType = new GenericType<AuditLogList>() {};

    return apiClient.invokeAPI("AuditLogsApi.listAuditLogs", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
