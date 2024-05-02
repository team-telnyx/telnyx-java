package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.DeleteObjectsRequestInner;
import java.io.File;
import com.telnyx.sdk.model.ListObjectsResponse;
import java.time.OffsetDateTime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class ObjectApi {
  private ApiClient apiClient;

  public ObjectApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ObjectApi(ApiClient apiClient) {
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
   * DeleteObject
   * Delete an object from a given bucket.
   * @param bucketName The bucket name. (required)
   * @param objectName The object name. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
     </table>
   * 
   * @see <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObject.html">DeleteObject Documentation</a>
   */
  public void deleteObject(String bucketName, String objectName) throws ApiException {
    deleteObjectWithHttpInfo(bucketName, objectName);
  }

  /**
   * DeleteObject
   * Delete an object from a given bucket.
   * @param bucketName The bucket name. (required)
   * @param objectName The object name. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Success </td><td>  -  </td></tr>
     </table>
   * 
   * @see <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObject.html">DeleteObject Documentation</a>
   */
  public ApiResponse<Void> deleteObjectWithHttpInfo(String bucketName, String objectName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling deleteObject");
    }
    
    // verify the required parameter 'objectName' is set
    if (objectName == null) {
      throw new ApiException(400, "Missing the required parameter 'objectName' when calling deleteObject");
    }
    
    // create path and map variables
    String localVarPath = "/{bucketName}/{objectName}"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()))
      .replaceAll("\\{" + "objectName" + "\\}", apiClient.escapeString(objectName.toString()));

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

    return apiClient.invokeAPI("ObjectApi.deleteObject", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * DeleteObjects
   * Deletes one or multiple objects from a given bucket.
   * @param bucketName The bucket name. (required)
   * @param delete  (required)
   * @param deleteObjectsRequestInner  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   * 
   * @see <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObjects.html">DeleteObjects Documentation</a>
   */
  public Object deleteObjects(String bucketName, Boolean delete, List<DeleteObjectsRequestInner> deleteObjectsRequestInner) throws ApiException {
    return deleteObjectsWithHttpInfo(bucketName, delete, deleteObjectsRequestInner).getData();
  }

  /**
   * DeleteObjects
   * Deletes one or multiple objects from a given bucket.
   * @param bucketName The bucket name. (required)
   * @param delete  (required)
   * @param deleteObjectsRequestInner  (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   * 
   * @see <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObjects.html">DeleteObjects Documentation</a>
   */
  public ApiResponse<Object> deleteObjectsWithHttpInfo(String bucketName, Boolean delete, List<DeleteObjectsRequestInner> deleteObjectsRequestInner) throws ApiException {
    Object localVarPostBody = deleteObjectsRequestInner;
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling deleteObjects");
    }
    
    // verify the required parameter 'delete' is set
    if (delete == null) {
      throw new ApiException(400, "Missing the required parameter 'delete' when calling deleteObjects");
    }
    
    // verify the required parameter 'deleteObjectsRequestInner' is set
    if (deleteObjectsRequestInner == null) {
      throw new ApiException(400, "Missing the required parameter 'deleteObjectsRequestInner' when calling deleteObjects");
    }
    
    // create path and map variables
    String localVarPath = "/{bucketName}"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "delete", delete));

    
    
    
    final String[] localVarAccepts = {
      "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "text/xml"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("ObjectApi.deleteObjects", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * GetObject
   * Retrieves an object from a given bucket.
   * @param bucketName The bucket name. (required)
   * @param objectName The object name. (required)
   * @param uploadId  (optional)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> ObjectNotFound </td><td>  -  </td></tr>
     </table>
   * 
   * @see <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject Documentation</a>
   */
  public File getObject(String bucketName, String objectName, String uploadId) throws ApiException {
    return getObjectWithHttpInfo(bucketName, objectName, uploadId).getData();
  }

  /**
   * GetObject
   * Retrieves an object from a given bucket.
   * @param bucketName The bucket name. (required)
   * @param objectName The object name. (required)
   * @param uploadId  (optional)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> ObjectNotFound </td><td>  -  </td></tr>
     </table>
   * 
   * @see <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject Documentation</a>
   */
  public ApiResponse<File> getObjectWithHttpInfo(String bucketName, String objectName, String uploadId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling getObject");
    }
    
    // verify the required parameter 'objectName' is set
    if (objectName == null) {
      throw new ApiException(400, "Missing the required parameter 'objectName' when calling getObject");
    }
    
    // create path and map variables
    String localVarPath = "/{bucketName}/{objectName}"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()))
      .replaceAll("\\{" + "objectName" + "\\}", apiClient.escapeString(objectName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "uploadId", uploadId));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<File> localVarReturnType = new GenericType<File>() {};

    return apiClient.invokeAPI("ObjectApi.getObject", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * HeadObject
   * Retrieves metadata from an object without returning the object itself.
   * @param bucketName The bucket name. (required)
   * @param objectName The object name. (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Date -  <br>  * Last-Modified -  <br>  * Content-Length -  <br>  </td></tr>
       <tr><td> 404 </td><td> ObjectNotFound </td><td>  -  </td></tr>
     </table>
   * 
   * @see <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_HeadObject.html">HeadObject Documentation</a>
   */
  public void headObject(String bucketName, String objectName) throws ApiException {
    headObjectWithHttpInfo(bucketName, objectName);
  }

  /**
   * HeadObject
   * Retrieves metadata from an object without returning the object itself.
   * @param bucketName The bucket name. (required)
   * @param objectName The object name. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  * Date -  <br>  * Last-Modified -  <br>  * Content-Length -  <br>  </td></tr>
       <tr><td> 404 </td><td> ObjectNotFound </td><td>  -  </td></tr>
     </table>
   * 
   * @see <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_HeadObject.html">HeadObject Documentation</a>
   */
  public ApiResponse<Void> headObjectWithHttpInfo(String bucketName, String objectName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling headObject");
    }
    
    // verify the required parameter 'objectName' is set
    if (objectName == null) {
      throw new ApiException(400, "Missing the required parameter 'objectName' when calling headObject");
    }
    
    // create path and map variables
    String localVarPath = "/{bucketName}/{objectName}"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()))
      .replaceAll("\\{" + "objectName" + "\\}", apiClient.escapeString(objectName.toString()));

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

    return apiClient.invokeAPI("ObjectApi.headObject", localVarPath, "HEAD", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * ListObjectsV2
   * List all objects contained in a given bucket.
   * @param bucketName The name of the bucket. (required)
   * @param listType  (optional)
   * @return ListObjectsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Bucket does not exist. </td><td>  -  </td></tr>
     </table>
   * 
   * @see <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjectsV2.html">ListObjectsV2 Documentation</a>
   */
  public ListObjectsResponse listObjects(String bucketName, Integer listType) throws ApiException {
    return listObjectsWithHttpInfo(bucketName, listType).getData();
  }

  /**
   * ListObjectsV2
   * List all objects contained in a given bucket.
   * @param bucketName The name of the bucket. (required)
   * @param listType  (optional)
   * @return ApiResponse&lt;ListObjectsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Bucket does not exist. </td><td>  -  </td></tr>
     </table>
   * 
   * @see <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_ListObjectsV2.html">ListObjectsV2 Documentation</a>
   */
  public ApiResponse<ListObjectsResponse> listObjectsWithHttpInfo(String bucketName, Integer listType) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling listObjects");
    }
    
    // create path and map variables
    String localVarPath = "/{bucketName}"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "list-type", listType));

    
    
    
    final String[] localVarAccepts = {
      "text/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListObjectsResponse> localVarReturnType = new GenericType<ListObjectsResponse>() {};

    return apiClient.invokeAPI("ObjectApi.listObjects", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * PutObject
   * Add an object to a bucket.
   * @param bucketName The bucket name. (required)
   * @param objectName The object name. (required)
   * @param body  (required)
   * @param contentType  (optional)
   * @param partNumber  (optional)
   * @param uploadId  (optional)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   * 
   * @see <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject Documentation</a>
   */
  public void putObject(String bucketName, String objectName, File body, String contentType, String partNumber, String uploadId) throws ApiException {
    putObjectWithHttpInfo(bucketName, objectName, body, contentType, partNumber, uploadId);
  }

  /**
   * PutObject
   * Add an object to a bucket.
   * @param bucketName The bucket name. (required)
   * @param objectName The object name. (required)
   * @param body  (required)
   * @param contentType  (optional)
   * @param partNumber  (optional)
   * @param uploadId  (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   * 
   * @see <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject Documentation</a>
   */
  public ApiResponse<Void> putObjectWithHttpInfo(String bucketName, String objectName, File body, String contentType, String partNumber, String uploadId) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling putObject");
    }
    
    // verify the required parameter 'objectName' is set
    if (objectName == null) {
      throw new ApiException(400, "Missing the required parameter 'objectName' when calling putObject");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling putObject");
    }
    
    // create path and map variables
    String localVarPath = "/{bucketName}/{objectName}"
      .replaceAll("\\{" + "bucketName" + "\\}", apiClient.escapeString(bucketName.toString()))
      .replaceAll("\\{" + "objectName" + "\\}", apiClient.escapeString(objectName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "partNumber", partNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "uploadId", uploadId));

    if (contentType != null)
      localVarHeaderParams.put("Content-type", apiClient.parameterToString(contentType));

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    return apiClient.invokeAPI("ObjectApi.putObject", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
}
