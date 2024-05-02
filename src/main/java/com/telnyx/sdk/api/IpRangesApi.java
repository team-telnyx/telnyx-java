package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.AccessIPRangeListResponseSchema;
import com.telnyx.sdk.model.AccessIPRangePOST;
import com.telnyx.sdk.model.AccessIPRangeResponseSchema;
import com.telnyx.sdk.model.Errors;
import java.time.OffsetDateTime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class IpRangesApi {
  private ApiClient apiClient;

  public IpRangesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IpRangesApi(ApiClient apiClient) {
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
   * Delete access IP ranges
   * 
   * @param accessIpRangeId  (required)
   * @return AccessIPRangeResponseSchema
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public AccessIPRangeResponseSchema accessIpRangesAccessIpRangeIdDelete(String accessIpRangeId) throws ApiException {
    return accessIpRangesAccessIpRangeIdDeleteWithHttpInfo(accessIpRangeId).getData();
  }

  /**
   * Delete access IP ranges
   * 
   * @param accessIpRangeId  (required)
   * @return ApiResponse&lt;AccessIPRangeResponseSchema&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AccessIPRangeResponseSchema> accessIpRangesAccessIpRangeIdDeleteWithHttpInfo(String accessIpRangeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessIpRangeId' is set
    if (accessIpRangeId == null) {
      throw new ApiException(400, "Missing the required parameter 'accessIpRangeId' when calling accessIpRangesAccessIpRangeIdDelete");
    }
    
    // create path and map variables
    String localVarPath = "/access_ip_ranges/{access_ip_range_id}"
      .replaceAll("\\{" + "access_ip_range_id" + "\\}", apiClient.escapeString(accessIpRangeId.toString()));

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

    GenericType<AccessIPRangeResponseSchema> localVarReturnType = new GenericType<AccessIPRangeResponseSchema>() {};

    return apiClient.invokeAPI("IpRangesApi.accessIpRangesAccessIpRangeIdDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create new Access IP Range
   * 
   * @param accessIPRangePOST  (required)
   * @return AccessIPRangeResponseSchema
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public AccessIPRangeResponseSchema createAccessIPRange(AccessIPRangePOST accessIPRangePOST) throws ApiException {
    return createAccessIPRangeWithHttpInfo(accessIPRangePOST).getData();
  }

  /**
   * Create new Access IP Range
   * 
   * @param accessIPRangePOST  (required)
   * @return ApiResponse&lt;AccessIPRangeResponseSchema&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AccessIPRangeResponseSchema> createAccessIPRangeWithHttpInfo(AccessIPRangePOST accessIPRangePOST) throws ApiException {
    Object localVarPostBody = accessIPRangePOST;
    
    // verify the required parameter 'accessIPRangePOST' is set
    if (accessIPRangePOST == null) {
      throw new ApiException(400, "Missing the required parameter 'accessIPRangePOST' when calling createAccessIPRange");
    }
    
    // create path and map variables
    String localVarPath = "/access_ip_ranges";

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

    GenericType<AccessIPRangeResponseSchema> localVarReturnType = new GenericType<AccessIPRangeResponseSchema>() {};

    return apiClient.invokeAPI("IpRangesApi.createAccessIPRange", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all Access IP Ranges
   * 
   * @param filterCidrBlock  (optional)
   * @param filterCidrBlockStartswith  (optional)
   * @param filterCidrBlockEndswith  (optional)
   * @param filterCidrBlockContains  (optional)
   * @param filterCreatedAtGt  (optional)
   * @param filterCreatedAtLt  (optional)
   * @param pageNumber  (optional, default to 1)
   * @param pageSize  (optional, default to 20)
   * @return AccessIPRangeListResponseSchema
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public AccessIPRangeListResponseSchema listAccessIpRanges(String filterCidrBlock, String filterCidrBlockStartswith, String filterCidrBlockEndswith, String filterCidrBlockContains, OffsetDateTime filterCreatedAtGt, OffsetDateTime filterCreatedAtLt, Integer pageNumber, Integer pageSize) throws ApiException {
    return listAccessIpRangesWithHttpInfo(filterCidrBlock, filterCidrBlockStartswith, filterCidrBlockEndswith, filterCidrBlockContains, filterCreatedAtGt, filterCreatedAtLt, pageNumber, pageSize).getData();
  }

  /**
   * List all Access IP Ranges
   * 
   * @param filterCidrBlock  (optional)
   * @param filterCidrBlockStartswith  (optional)
   * @param filterCidrBlockEndswith  (optional)
   * @param filterCidrBlockContains  (optional)
   * @param filterCreatedAtGt  (optional)
   * @param filterCreatedAtLt  (optional)
   * @param pageNumber  (optional, default to 1)
   * @param pageSize  (optional, default to 20)
   * @return ApiResponse&lt;AccessIPRangeListResponseSchema&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AccessIPRangeListResponseSchema> listAccessIpRangesWithHttpInfo(String filterCidrBlock, String filterCidrBlockStartswith, String filterCidrBlockEndswith, String filterCidrBlockContains, OffsetDateTime filterCreatedAtGt, OffsetDateTime filterCreatedAtLt, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/access_ip_ranges";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[cidr_block]", filterCidrBlock));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[cidr_block][startswith]", filterCidrBlockStartswith));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[cidr_block][endswith]", filterCidrBlockEndswith));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[cidr_block][contains]", filterCidrBlockContains));
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

    GenericType<AccessIPRangeListResponseSchema> localVarReturnType = new GenericType<AccessIPRangeListResponseSchema>() {};

    return apiClient.invokeAPI("IpRangesApi.listAccessIpRanges", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
