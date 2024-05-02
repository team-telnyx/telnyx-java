package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.MdrDeleteDetailReportResponse;
import com.telnyx.sdk.model.MdrGetDetailReportByIdResponse;
import com.telnyx.sdk.model.MdrGetDetailReportResponse;
import com.telnyx.sdk.model.MdrGetDetailResponse;
import com.telnyx.sdk.model.MdrPostDetailReportRequest;
import com.telnyx.sdk.model.MdrPostDetailReportResponse;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class MdrDetailReportsApi {
  private ApiClient apiClient;

  public MdrDetailReportsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MdrDetailReportsApi(ApiClient apiClient) {
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
   * 
   * Delete generated messaging detail report by id
   * @param id  (required)
   * @return MdrDeleteDetailReportResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public MdrDeleteDetailReportResponse deleteMdrRequest(UUID id) throws ApiException {
    return deleteMdrRequestWithHttpInfo(id).getData();
  }

  /**
   * 
   * Delete generated messaging detail report by id
   * @param id  (required)
   * @return ApiResponse&lt;MdrDeleteDetailReportResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MdrDeleteDetailReportResponse> deleteMdrRequestWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteMdrRequest");
    }
    
    // create path and map variables
    String localVarPath = "/reports/batch_mdr_reports/{id}"
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

    GenericType<MdrDeleteDetailReportResponse> localVarReturnType = new GenericType<MdrDeleteDetailReportResponse>() {};

    return apiClient.invokeAPI("MdrDetailReportsApi.deleteMdrRequest", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Fetch all previous requests for messaging detail reports. Messaging detail reports are reports for pulling all messaging records. 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Size of the page (optional, default to 20)
   * @return MdrGetDetailReportResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public MdrGetDetailReportResponse getCdrRequests(Integer pageNumber, Integer pageSize) throws ApiException {
    return getCdrRequestsWithHttpInfo(pageNumber, pageSize).getData();
  }

  /**
   * 
   * Fetch all previous requests for messaging detail reports. Messaging detail reports are reports for pulling all messaging records. 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Size of the page (optional, default to 20)
   * @return ApiResponse&lt;MdrGetDetailReportResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MdrGetDetailReportResponse> getCdrRequestsWithHttpInfo(Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/reports/batch_mdr_reports";

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

    GenericType<MdrGetDetailReportResponse> localVarReturnType = new GenericType<MdrGetDetailReportResponse>() {};

    return apiClient.invokeAPI("MdrDetailReportsApi.getCdrRequests", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Fetch single messaging detail report by id.
   * @param id  (required)
   * @return MdrGetDetailReportByIdResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public MdrGetDetailReportByIdResponse getMdrRequest(UUID id) throws ApiException {
    return getMdrRequestWithHttpInfo(id).getData();
  }

  /**
   * 
   * Fetch single messaging detail report by id.
   * @param id  (required)
   * @return ApiResponse&lt;MdrGetDetailReportByIdResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MdrGetDetailReportByIdResponse> getMdrRequestWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getMdrRequest");
    }
    
    // create path and map variables
    String localVarPath = "/reports/batch_mdr_reports/{id}"
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

    GenericType<MdrGetDetailReportByIdResponse> localVarReturnType = new GenericType<MdrGetDetailReportByIdResponse>() {};

    return apiClient.invokeAPI("MdrDetailReportsApi.getMdrRequest", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Fetch all Mdr records 
   * @param startDate Pagination start date (optional)
   * @param endDate Pagination end date (optional)
   * @param id  (optional)
   * @param direction  (optional)
   * @param profile  (optional)
   * @param cld  (optional)
   * @param cli  (optional)
   * @param status  (optional)
   * @param messageType  (optional)
   * @return MdrGetDetailResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public MdrGetDetailResponse getPaginatedMdrs(String startDate, String endDate, String id, String direction, String profile, String cld, String cli, String status, String messageType) throws ApiException {
    return getPaginatedMdrsWithHttpInfo(startDate, endDate, id, direction, profile, cld, cli, status, messageType).getData();
  }

  /**
   * 
   * Fetch all Mdr records 
   * @param startDate Pagination start date (optional)
   * @param endDate Pagination end date (optional)
   * @param id  (optional)
   * @param direction  (optional)
   * @param profile  (optional)
   * @param cld  (optional)
   * @param cli  (optional)
   * @param status  (optional)
   * @param messageType  (optional)
   * @return ApiResponse&lt;MdrGetDetailResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MdrGetDetailResponse> getPaginatedMdrsWithHttpInfo(String startDate, String endDate, String id, String direction, String profile, String cld, String cli, String status, String messageType) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/reports/mdrs";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "direction", direction));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "profile", profile));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cld", cld));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cli", cli));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "message_type", messageType));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<MdrGetDetailResponse> localVarReturnType = new GenericType<MdrGetDetailResponse>() {};

    return apiClient.invokeAPI("MdrDetailReportsApi.getPaginatedMdrs", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * Submit a request for new messaging detail report. Messaging detail report pulls all raw messaging data according to defined filters.
   * @param mdrPostDetailReportRequest Mdr detail request data (required)
   * @return MdrPostDetailReportResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public MdrPostDetailReportResponse submitMdrRequest(MdrPostDetailReportRequest mdrPostDetailReportRequest) throws ApiException {
    return submitMdrRequestWithHttpInfo(mdrPostDetailReportRequest).getData();
  }

  /**
   * 
   * Submit a request for new messaging detail report. Messaging detail report pulls all raw messaging data according to defined filters.
   * @param mdrPostDetailReportRequest Mdr detail request data (required)
   * @return ApiResponse&lt;MdrPostDetailReportResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MdrPostDetailReportResponse> submitMdrRequestWithHttpInfo(MdrPostDetailReportRequest mdrPostDetailReportRequest) throws ApiException {
    Object localVarPostBody = mdrPostDetailReportRequest;
    
    // verify the required parameter 'mdrPostDetailReportRequest' is set
    if (mdrPostDetailReportRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'mdrPostDetailReportRequest' when calling submitMdrRequest");
    }
    
    // create path and map variables
    String localVarPath = "/reports/batch_mdr_reports";

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

    GenericType<MdrPostDetailReportResponse> localVarReturnType = new GenericType<MdrPostDetailReportResponse>() {};

    return apiClient.invokeAPI("MdrDetailReportsApi.submitMdrRequest", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
