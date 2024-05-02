package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.GetBucketUsage200Response;
import com.telnyx.sdk.model.GetStorageAPIUsage200Response;
import java.time.OffsetDateTime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class BucketUsageApi {
  private ApiClient apiClient;

  public BucketUsageApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BucketUsageApi(ApiClient apiClient) {
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
   * Get Bucket Usage
   * Returns the amount of storage space and number of files a bucket takes up.
   * @param bucketName The name of the bucket (required)
   * @return GetBucketUsage200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Bucket Storage Usage </td><td>  -  </td></tr>
     </table>
   */
  public GetBucketUsage200Response getBucketUsage(String bucketName) throws ApiException {
    return getBucketUsageWithHttpInfo(bucketName).getData();
  }

  /**
   * Get Bucket Usage
   * Returns the amount of storage space and number of files a bucket takes up.
   * @param bucketName The name of the bucket (required)
   * @return ApiResponse&lt;GetBucketUsage200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Bucket Storage Usage </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetBucketUsage200Response> getBucketUsageWithHttpInfo(String bucketName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling getBucketUsage");
    }
    
    // create path and map variables
    String localVarPath = "/storage/buckets/{bucketName}/usage/storage"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()));

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

    GenericType<GetBucketUsage200Response> localVarReturnType = new GenericType<GetBucketUsage200Response>() {};

    return apiClient.invokeAPI("BucketUsageApi.getBucketUsage", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get API Usage
   * Returns the detail on API usage on a bucket of a particular time period, group by method category.
   * @param bucketName The name of the bucket (required)
   * @param filterStartTime The start time of the period to filter the usage (ISO microsecond format) (required)
   * @param filterEndTime The end time of the period to filter the usage (ISO microsecond format) (required)
   * @return GetStorageAPIUsage200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Bucket Usage </td><td>  -  </td></tr>
     </table>
   */
  public GetStorageAPIUsage200Response getStorageAPIUsage(String bucketName, OffsetDateTime filterStartTime, OffsetDateTime filterEndTime) throws ApiException {
    return getStorageAPIUsageWithHttpInfo(bucketName, filterStartTime, filterEndTime).getData();
  }

  /**
   * Get API Usage
   * Returns the detail on API usage on a bucket of a particular time period, group by method category.
   * @param bucketName The name of the bucket (required)
   * @param filterStartTime The start time of the period to filter the usage (ISO microsecond format) (required)
   * @param filterEndTime The end time of the period to filter the usage (ISO microsecond format) (required)
   * @return ApiResponse&lt;GetStorageAPIUsage200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Bucket Usage </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetStorageAPIUsage200Response> getStorageAPIUsageWithHttpInfo(String bucketName, OffsetDateTime filterStartTime, OffsetDateTime filterEndTime) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling getStorageAPIUsage");
    }
    
    // verify the required parameter 'filterStartTime' is set
    if (filterStartTime == null) {
      throw new ApiException(400, "Missing the required parameter 'filterStartTime' when calling getStorageAPIUsage");
    }
    
    // verify the required parameter 'filterEndTime' is set
    if (filterEndTime == null) {
      throw new ApiException(400, "Missing the required parameter 'filterEndTime' when calling getStorageAPIUsage");
    }
    
    // create path and map variables
    String localVarPath = "/storage/buckets/{bucketName}/usage/api"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[start_time]", filterStartTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[end_time]", filterEndTime));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<GetStorageAPIUsage200Response> localVarReturnType = new GenericType<GetStorageAPIUsage200Response>() {};

    return apiClient.invokeAPI("BucketUsageApi.getStorageAPIUsage", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
