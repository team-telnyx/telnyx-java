package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.BucketNotFoundError;
import com.telnyx.sdk.model.EmbeddingBucketRequest;
import com.telnyx.sdk.model.EmbeddingResponse;
import com.telnyx.sdk.model.EmbeddingSimilaritySearchRequest;
import com.telnyx.sdk.model.EmbeddingSimilaritySearchResponse;
import com.telnyx.sdk.model.EmbeddingsBucketFilesData;
import com.telnyx.sdk.model.HTTPValidationError;
import com.telnyx.sdk.model.TaskStatusResponse;
import com.telnyx.sdk.model.UserEmbeddedBucketsData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class EmbeddingsApi {
  private ApiClient apiClient;

  public EmbeddingsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EmbeddingsApi(ApiClient apiClient) {
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
   * Disable AI for an Embedded Bucket
   * Deletes an entire bucket&#39;s embeddings and disables the bucket for AI-use, returning it to normal storage pricing.
   * @param bucketName  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Bucket Embeddings Deleted Successfully </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Bucket Not Found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public void embeddingBucketFilesPublicEmbeddingBucketsBucketNameDelete(String bucketName) throws ApiException {
    embeddingBucketFilesPublicEmbeddingBucketsBucketNameDeleteWithHttpInfo(bucketName);
  }

  /**
   * Disable AI for an Embedded Bucket
   * Deletes an entire bucket&#39;s embeddings and disables the bucket for AI-use, returning it to normal storage pricing.
   * @param bucketName  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Bucket Embeddings Deleted Successfully </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Bucket Not Found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> embeddingBucketFilesPublicEmbeddingBucketsBucketNameDeleteWithHttpInfo(String bucketName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling embeddingBucketFilesPublicEmbeddingBucketsBucketNameDelete");
    }
    
    // create path and map variables
    String localVarPath = "/ai/embeddings/buckets/{bucket_name}"
      .replaceAll("\\{" + "bucket_name" + "\\}", apiClient.escapeString(bucketName.toString()));

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

    return apiClient.invokeAPI("EmbeddingsApi.embeddingBucketFilesPublicEmbeddingBucketsBucketNameDelete", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Get file-level embedding statuses for a bucket
   * Get all embedded files for a given user bucket, including their processing status.
   * @param bucketName  (required)
   * @return EmbeddingsBucketFilesData
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public EmbeddingsBucketFilesData getBucketName(String bucketName) throws ApiException {
    return getBucketNameWithHttpInfo(bucketName).getData();
  }

  /**
   * Get file-level embedding statuses for a bucket
   * Get all embedded files for a given user bucket, including their processing status.
   * @param bucketName  (required)
   * @return ApiResponse&lt;EmbeddingsBucketFilesData&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EmbeddingsBucketFilesData> getBucketNameWithHttpInfo(String bucketName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bucketName' is set
    if (bucketName == null) {
      throw new ApiException(400, "Missing the required parameter 'bucketName' when calling getBucketName");
    }
    
    // create path and map variables
    String localVarPath = "/ai/embeddings/buckets/{bucket_name}"
      .replaceAll("\\{" + "bucket_name" + "\\}", apiClient.escapeString(bucketName.toString()));

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

    GenericType<EmbeddingsBucketFilesData> localVarReturnType = new GenericType<EmbeddingsBucketFilesData>() {};

    return apiClient.invokeAPI("EmbeddingsApi.getBucketName", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List embedded buckets
   * Get all embedding buckets for a user.
   * @return UserEmbeddedBucketsData
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public UserEmbeddedBucketsData getEmbeddingBuckets() throws ApiException {
    return getEmbeddingBucketsWithHttpInfo().getData();
  }

  /**
   * List embedded buckets
   * Get all embedding buckets for a user.
   * @return ApiResponse&lt;UserEmbeddedBucketsData&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UserEmbeddedBucketsData> getEmbeddingBucketsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/ai/embeddings/buckets";

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

    GenericType<UserEmbeddedBucketsData> localVarReturnType = new GenericType<UserEmbeddedBucketsData>() {};

    return apiClient.invokeAPI("EmbeddingsApi.getEmbeddingBuckets", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get an embedding task&#39;s status
   * Check the status of a current embedding task. Will be one of the following: - &#x60;queued&#x60; - Task is waiting to be picked up by a worker - &#x60;processing&#x60; - The embedding task is running - &#x60;success&#x60; - Task completed successfully and the bucket is embedded - &#x60;failure&#x60; - Task failed and no files were embedded successfully - &#x60;partial_success&#x60; - Some files were embedded successfully, but at least one failed
   * @param taskId  (required)
   * @return TaskStatusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public TaskStatusResponse getEmbeddingTask(String taskId) throws ApiException {
    return getEmbeddingTaskWithHttpInfo(taskId).getData();
  }

  /**
   * Get an embedding task&#39;s status
   * Check the status of a current embedding task. Will be one of the following: - &#x60;queued&#x60; - Task is waiting to be picked up by a worker - &#x60;processing&#x60; - The embedding task is running - &#x60;success&#x60; - Task completed successfully and the bucket is embedded - &#x60;failure&#x60; - Task failed and no files were embedded successfully - &#x60;partial_success&#x60; - Some files were embedded successfully, but at least one failed
   * @param taskId  (required)
   * @return ApiResponse&lt;TaskStatusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TaskStatusResponse> getEmbeddingTaskWithHttpInfo(String taskId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'taskId' is set
    if (taskId == null) {
      throw new ApiException(400, "Missing the required parameter 'taskId' when calling getEmbeddingTask");
    }
    
    // create path and map variables
    String localVarPath = "/ai/embeddings/{task_id}"
      .replaceAll("\\{" + "task_id" + "\\}", apiClient.escapeString(taskId.toString()));

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

    GenericType<TaskStatusResponse> localVarReturnType = new GenericType<TaskStatusResponse>() {};

    return apiClient.invokeAPI("EmbeddingsApi.getEmbeddingTask", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Embed documents
   * Perform embedding on a Telnyx Storage Bucket using the a embedding model. The current supported file types are: - PDF - HTML - txt/unstructured text files - json - csv - audio / video (mp3, mp4, mpeg, mpga, m4a, wav, or webm ) - Max of 100mb file size.  Any files not matching the above types will be attempted to be embedded as unstructured text.  This process can be slow, so it runs in the background and the user can check the status of the task using the endpoint &#x60;/ai/embeddings/{task_id}&#x60;.   **Important Note**: When you update documents in a Telnyx Storage bucket, their associated embeddings are automatically kept up to date. If you add or update a file, it is automatically embedded. If you delete a file, the embeddings are deleted for that particular file.  You can also specify a custom &#x60;loader&#x60; param. Currently the only supported loader value is &#x60;intercom&#x60; which loads Intercom article jsons as specified by [the Intercom article API](https://developers.intercom.com/docs/references/rest-api/api.intercom.io/Articles/article/) This loader will split each article into paragraphs and save additional parameters relevant to Intercom docs, such as &#x60;article_url&#x60; and &#x60;heading&#x60;. These values will be returned by the &#x60;/v2/ai/embeddings/similarity-search&#x60; endpoint in the &#x60;loader_metadata&#x60; field.
   * @param embeddingBucketRequest  (required)
   * @return EmbeddingResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public EmbeddingResponse postEmbedding(EmbeddingBucketRequest embeddingBucketRequest) throws ApiException {
    return postEmbeddingWithHttpInfo(embeddingBucketRequest).getData();
  }

  /**
   * Embed documents
   * Perform embedding on a Telnyx Storage Bucket using the a embedding model. The current supported file types are: - PDF - HTML - txt/unstructured text files - json - csv - audio / video (mp3, mp4, mpeg, mpga, m4a, wav, or webm ) - Max of 100mb file size.  Any files not matching the above types will be attempted to be embedded as unstructured text.  This process can be slow, so it runs in the background and the user can check the status of the task using the endpoint &#x60;/ai/embeddings/{task_id}&#x60;.   **Important Note**: When you update documents in a Telnyx Storage bucket, their associated embeddings are automatically kept up to date. If you add or update a file, it is automatically embedded. If you delete a file, the embeddings are deleted for that particular file.  You can also specify a custom &#x60;loader&#x60; param. Currently the only supported loader value is &#x60;intercom&#x60; which loads Intercom article jsons as specified by [the Intercom article API](https://developers.intercom.com/docs/references/rest-api/api.intercom.io/Articles/article/) This loader will split each article into paragraphs and save additional parameters relevant to Intercom docs, such as &#x60;article_url&#x60; and &#x60;heading&#x60;. These values will be returned by the &#x60;/v2/ai/embeddings/similarity-search&#x60; endpoint in the &#x60;loader_metadata&#x60; field.
   * @param embeddingBucketRequest  (required)
   * @return ApiResponse&lt;EmbeddingResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EmbeddingResponse> postEmbeddingWithHttpInfo(EmbeddingBucketRequest embeddingBucketRequest) throws ApiException {
    Object localVarPostBody = embeddingBucketRequest;
    
    // verify the required parameter 'embeddingBucketRequest' is set
    if (embeddingBucketRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'embeddingBucketRequest' when calling postEmbedding");
    }
    
    // create path and map variables
    String localVarPath = "/ai/embeddings";

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

    GenericType<EmbeddingResponse> localVarReturnType = new GenericType<EmbeddingResponse>() {};

    return apiClient.invokeAPI("EmbeddingsApi.postEmbedding", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Search for documents
   * Perform a similarity search on a Telnyx Storage Bucket, returning the most similar &#x60;num_docs&#x60; document chunks to the query.  Currently the only available distance metric is cosine similarity which will return a &#x60;distance&#x60; between 0 and 1. The lower the distance, the more similar the returned document chunks are to the query. A &#x60;certainty&#x60; will also be returned, which is a value between 0 and 1 where the higher the certainty, the more similar the document. You can read more about Weaviate distance metrics here: [Weaviate Docs](https://weaviate.io/developers/weaviate/config-refs/distances)  If a bucket was embedded using a custom loader, such as &#x60;intercom&#x60;, the additional metadata will be returned in the  &#x60;loader_metadata&#x60; field.
   * @param embeddingSimilaritySearchRequest  (required)
   * @return EmbeddingSimilaritySearchResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public EmbeddingSimilaritySearchResponse postEmbeddingSimilaritySearch(EmbeddingSimilaritySearchRequest embeddingSimilaritySearchRequest) throws ApiException {
    return postEmbeddingSimilaritySearchWithHttpInfo(embeddingSimilaritySearchRequest).getData();
  }

  /**
   * Search for documents
   * Perform a similarity search on a Telnyx Storage Bucket, returning the most similar &#x60;num_docs&#x60; document chunks to the query.  Currently the only available distance metric is cosine similarity which will return a &#x60;distance&#x60; between 0 and 1. The lower the distance, the more similar the returned document chunks are to the query. A &#x60;certainty&#x60; will also be returned, which is a value between 0 and 1 where the higher the certainty, the more similar the document. You can read more about Weaviate distance metrics here: [Weaviate Docs](https://weaviate.io/developers/weaviate/config-refs/distances)  If a bucket was embedded using a custom loader, such as &#x60;intercom&#x60;, the additional metadata will be returned in the  &#x60;loader_metadata&#x60; field.
   * @param embeddingSimilaritySearchRequest  (required)
   * @return ApiResponse&lt;EmbeddingSimilaritySearchResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EmbeddingSimilaritySearchResponse> postEmbeddingSimilaritySearchWithHttpInfo(EmbeddingSimilaritySearchRequest embeddingSimilaritySearchRequest) throws ApiException {
    Object localVarPostBody = embeddingSimilaritySearchRequest;
    
    // verify the required parameter 'embeddingSimilaritySearchRequest' is set
    if (embeddingSimilaritySearchRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'embeddingSimilaritySearchRequest' when calling postEmbeddingSimilaritySearch");
    }
    
    // create path and map variables
    String localVarPath = "/ai/embeddings/similarity-search";

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

    GenericType<EmbeddingSimilaritySearchResponse> localVarReturnType = new GenericType<EmbeddingSimilaritySearchResponse>() {};

    return apiClient.invokeAPI("EmbeddingsApi.postEmbeddingSimilaritySearch", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
