package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateLedgerBillingGroupReportResponse;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.NewLedgerBillingGroupReport;
import com.telnyx.sdk.model.RetrieveLedgerBillingGroupReportResponse;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReportsApi {
  private ApiClient apiClient;

  public ReportsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReportsApi(ApiClient apiClient) {
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
   * Create a ledger billing group report
   * 
   * @param newLedgerBillingGroupReport New ledger billing group report parameters (required)
   * @return CreateLedgerBillingGroupReportResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected ledger billing group report response to a valid request </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public CreateLedgerBillingGroupReportResponse createLedgerBillingGroupReport(NewLedgerBillingGroupReport newLedgerBillingGroupReport) throws ApiException {
    return createLedgerBillingGroupReportWithHttpInfo(newLedgerBillingGroupReport).getData();
  }

  /**
   * Create a ledger billing group report
   * 
   * @param newLedgerBillingGroupReport New ledger billing group report parameters (required)
   * @return ApiResponse&lt;CreateLedgerBillingGroupReportResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected ledger billing group report response to a valid request </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateLedgerBillingGroupReportResponse> createLedgerBillingGroupReportWithHttpInfo(NewLedgerBillingGroupReport newLedgerBillingGroupReport) throws ApiException {
    Object localVarPostBody = newLedgerBillingGroupReport;
    
    // verify the required parameter 'newLedgerBillingGroupReport' is set
    if (newLedgerBillingGroupReport == null) {
      throw new ApiException(400, "Missing the required parameter 'newLedgerBillingGroupReport' when calling createLedgerBillingGroupReport");
    }
    
    // create path and map variables
    String localVarPath = "/ledger_billing_group_reports";

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

    GenericType<CreateLedgerBillingGroupReportResponse> localVarReturnType = new GenericType<CreateLedgerBillingGroupReportResponse>() {};

    return apiClient.invokeAPI("ReportsApi.createLedgerBillingGroupReport", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Retrieve a ledger billing group report
   * 
   * @param id The id of the ledger billing group report (required)
   * @return RetrieveLedgerBillingGroupReportResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected ledger billing group report response to a valid request </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveLedgerBillingGroupReportResponse retrieveLedgerBillingGroupReport(UUID id) throws ApiException {
    return retrieveLedgerBillingGroupReportWithHttpInfo(id).getData();
  }

  /**
   * Retrieve a ledger billing group report
   * 
   * @param id The id of the ledger billing group report (required)
   * @return ApiResponse&lt;RetrieveLedgerBillingGroupReportResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Expected ledger billing group report response to a valid request </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveLedgerBillingGroupReportResponse> retrieveLedgerBillingGroupReportWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retrieveLedgerBillingGroupReport");
    }
    
    // create path and map variables
    String localVarPath = "/ledger_billing_group_reports/{id}"
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

    GenericType<RetrieveLedgerBillingGroupReportResponse> localVarReturnType = new GenericType<RetrieveLedgerBillingGroupReportResponse>() {};

    return apiClient.invokeAPI("ReportsApi.retrieveLedgerBillingGroupReport", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
