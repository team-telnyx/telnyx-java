package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.PresignedObjectUrl;
import com.telnyx.sdk.model.PresignedObjectUrlParams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class PresignedObjectUrlsApi {
  private ApiClient apiClient;

  public PresignedObjectUrlsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PresignedObjectUrlsApi(ApiClient apiClient) {
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
   * Create Presigned Object URL
   * Returns a timed and authenticated URL to get an object. This is the equivalent to AWS S3’s “presigned” URL. Please note that Telnyx performs authentication differently from AWS S3 and you MUST NOT use the presign method of AWS s3api CLI or sdk to generate the presigned URL.   Refer to: https://developers.telnyx.com/docs/cloud-storage/presigned-urls 
   * @param bucketName The name of the bucket (required)
   * @param objectName The name of the object (required)
   * @param presignedObjectUrlParams  (optional)
   * @return PresignedObjectUrl
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Presigned URL Object Response </td><td>  -  </td></tr>
     </table>
   */
  public PresignedObjectUrl createPresignedObjectUrl(String bucketName, String objectName, PresignedObjectUrlParams presignedObjectUrlParams) throws ApiException {
    return createPresignedObjectUrlWithHttpInfo(bucketName, objectName, presignedObjectUrlParams).getData();
  }

  /**
   * Create Presigned Object URL
   * Returns a timed and authenticated URL to get an object. This is the equivalent to AWS S3’s “presigned” URL. Please note that Telnyx performs authentication differently from AWS S3 and you MUST NOT use the presign method of AWS s3api CLI or sdk to generate the presigned URL.   Refer to: https://developers.telnyx.com/docs/cloud-storage/presigned-urls 
   * @param bucketName The name of the bucket (required)
   * @param objectName The name of the object (required)
   * @param presignedObjectUrlParams  (optional)
   * @return ApiResponse&lt;PresignedObjectUrl&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Presigned URL Object Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PresignedObjectUrl> createPresignedObjectUrlWithHttpInfo(String bucketName, String objectName, PresignedObjectUrlParams presignedObjectUrlParams) throws ApiException {
    Object localVarPostBody = presignedObjectUrlParams;
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling createPresignedObjectUrl");
    }
    
    // verify the required parameter 'objectName' is set
    if (objectName == null) {
      throw new ApiException(400, "Missing the required parameter 'objectName' when calling createPresignedObjectUrl");
    }
    
    // create path and map variables
    String localVarPath = "/storage/buckets/{bucketName}/{objectName}/presigned_url"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()))
      .replaceAll("\\{" + "objectName" + "\\}", apiClient.escapeString(objectName.toString()));

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

    GenericType<PresignedObjectUrl> localVarReturnType = new GenericType<PresignedObjectUrl>() {};

    return apiClient.invokeAPI("PresignedObjectUrlsApi.createPresignedObjectUrl", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
