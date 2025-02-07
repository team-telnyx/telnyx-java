# EmbeddingsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**embeddingBucketFilesPublicEmbeddingBucketsBucketNameDelete**](EmbeddingsApi.md#embeddingBucketFilesPublicEmbeddingBucketsBucketNameDelete) | **DELETE** /ai/embeddings/buckets/{bucket_name} | Disable AI for an Embedded Bucket
[**getBucketName**](EmbeddingsApi.md#getBucketName) | **GET** /ai/embeddings/buckets/{bucket_name} | Get file-level embedding statuses for a bucket
[**getEmbeddingBuckets**](EmbeddingsApi.md#getEmbeddingBuckets) | **GET** /ai/embeddings/buckets | List embedded buckets
[**getEmbeddingTask**](EmbeddingsApi.md#getEmbeddingTask) | **GET** /ai/embeddings/{task_id} | Get an embedding task&#39;s status
[**getTasksByStatus**](EmbeddingsApi.md#getTasksByStatus) | **GET** /ai/embeddings | Get Tasks by Status
[**postEmbedding**](EmbeddingsApi.md#postEmbedding) | **POST** /ai/embeddings | Embed documents
[**postEmbeddingSimilaritySearch**](EmbeddingsApi.md#postEmbeddingSimilaritySearch) | **POST** /ai/embeddings/similarity-search | Search for documents



## embeddingBucketFilesPublicEmbeddingBucketsBucketNameDelete

> embeddingBucketFilesPublicEmbeddingBucketsBucketNameDelete(bucketName)

Disable AI for an Embedded Bucket

Deletes an entire bucket's embeddings and disables the bucket for AI-use, returning it to normal storage pricing.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.EmbeddingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        EmbeddingsApi apiInstance = new EmbeddingsApi(defaultClient);
        String bucketName = "bucketName_example"; // String | 
        try {
            apiInstance.embeddingBucketFilesPublicEmbeddingBucketsBucketNameDelete(bucketName);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmbeddingsApi#embeddingBucketFilesPublicEmbeddingBucketsBucketNameDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketName** | **String**|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Bucket Embeddings Deleted Successfully |  -  |
| **404** | Bucket Not Found |  -  |
| **422** | Validation Error |  -  |


## getBucketName

> EmbeddingsBucketFilesData getBucketName(bucketName)

Get file-level embedding statuses for a bucket

Get all embedded files for a given user bucket, including their processing status.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.EmbeddingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        EmbeddingsApi apiInstance = new EmbeddingsApi(defaultClient);
        String bucketName = "bucketName_example"; // String | 
        try {
            EmbeddingsBucketFilesData result = apiInstance.getBucketName(bucketName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmbeddingsApi#getBucketName");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketName** | **String**|  |

### Return type

[**EmbeddingsBucketFilesData**](EmbeddingsBucketFilesData.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## getEmbeddingBuckets

> UserEmbeddedBucketsData getEmbeddingBuckets()

List embedded buckets

Get all embedding buckets for a user.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.EmbeddingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        EmbeddingsApi apiInstance = new EmbeddingsApi(defaultClient);
        try {
            UserEmbeddedBucketsData result = apiInstance.getEmbeddingBuckets();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmbeddingsApi#getEmbeddingBuckets");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**UserEmbeddedBucketsData**](UserEmbeddedBucketsData.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## getEmbeddingTask

> TaskStatusResponse getEmbeddingTask(taskId)

Get an embedding task&#39;s status

Check the status of a current embedding task. Will be one of the following:
- `queued` - Task is waiting to be picked up by a worker
- `processing` - The embedding task is running
- `success` - Task completed successfully and the bucket is embedded
- `failure` - Task failed and no files were embedded successfully
- `partial_success` - Some files were embedded successfully, but at least one failed

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.EmbeddingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        EmbeddingsApi apiInstance = new EmbeddingsApi(defaultClient);
        String taskId = "taskId_example"; // String | 
        try {
            TaskStatusResponse result = apiInstance.getEmbeddingTask(taskId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmbeddingsApi#getEmbeddingTask");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**|  |

### Return type

[**TaskStatusResponse**](TaskStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## getTasksByStatus

> BackgroundTasksQueryResponseData getTasksByStatus(status)

Get Tasks by Status

Retrieve tasks for the user that are either `queued`, `processing`, `failed`, `success` or `partial_success` based on the query string. Defaults to `queued` and `processing`.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.EmbeddingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        EmbeddingsApi apiInstance = new EmbeddingsApi(defaultClient);
        List<String> status = Arrays.asList(); // List<String> | List of task statuses i.e. `status=queued&status=processing`
        try {
            BackgroundTasksQueryResponseData result = apiInstance.getTasksByStatus(status);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmbeddingsApi#getTasksByStatus");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **List&lt;String&gt;**| List of task statuses i.e. &#x60;status&#x3D;queued&amp;status&#x3D;processing&#x60; | [optional]

### Return type

[**BackgroundTasksQueryResponseData**](BackgroundTasksQueryResponseData.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## postEmbedding

> EmbeddingResponse postEmbedding(embeddingBucketRequest)

Embed documents

Perform embedding on a Telnyx Storage Bucket using the a embedding model.
The current supported file types are:
- PDF
- HTML
- txt/unstructured text files
- json
- csv
- audio / video (mp3, mp4, mpeg, mpga, m4a, wav, or webm ) - Max of 100mb file size.

Any files not matching the above types will be attempted to be embedded as unstructured text.

This process can be slow, so it runs in the background and the user can check
the status of the task using the endpoint `/ai/embeddings/{task_id}`.

 **Important Note**: When you update documents in a Telnyx Storage bucket, their associated embeddings are automatically kept up to date. If you add or update a file, it is automatically embedded. If you delete a file, the embeddings are deleted for that particular file.

You can also specify a custom `loader` param. Currently the only supported loader value is
`intercom` which loads Intercom article jsons as specified by [the Intercom article API](https://developers.intercom.com/docs/references/rest-api/api.intercom.io/Articles/article/)
This loader will split each article into paragraphs and save additional parameters relevant to Intercom docs, such as
`article_url` and `heading`. These values will be returned by the `/v2/ai/embeddings/similarity-search` endpoint in the `loader_metadata` field.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.EmbeddingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        EmbeddingsApi apiInstance = new EmbeddingsApi(defaultClient);
        EmbeddingBucketRequest embeddingBucketRequest = new EmbeddingBucketRequest(); // EmbeddingBucketRequest | 
        try {
            EmbeddingResponse result = apiInstance.postEmbedding(embeddingBucketRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmbeddingsApi#postEmbedding");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **embeddingBucketRequest** | [**EmbeddingBucketRequest**](EmbeddingBucketRequest.md)|  |

### Return type

[**EmbeddingResponse**](EmbeddingResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## postEmbeddingSimilaritySearch

> EmbeddingSimilaritySearchResponse postEmbeddingSimilaritySearch(embeddingSimilaritySearchRequest)

Search for documents

Perform a similarity search on a Telnyx Storage Bucket, returning the most similar `num_docs` document chunks to the query.

Currently the only available distance metric is cosine similarity which will return a `distance` between 0 and 1.
The lower the distance, the more similar the returned document chunks are to the query.
A `certainty` will also be returned, which is a value between 0 and 1 where the higher the certainty, the more similar the document.
You can read more about Weaviate distance metrics here: [Weaviate Docs](https://weaviate.io/developers/weaviate/config-refs/distances)

If a bucket was embedded using a custom loader, such as `intercom`, the additional metadata will be returned in the 
`loader_metadata` field.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.EmbeddingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        EmbeddingsApi apiInstance = new EmbeddingsApi(defaultClient);
        EmbeddingSimilaritySearchRequest embeddingSimilaritySearchRequest = new EmbeddingSimilaritySearchRequest(); // EmbeddingSimilaritySearchRequest | 
        try {
            EmbeddingSimilaritySearchResponse result = apiInstance.postEmbeddingSimilaritySearch(embeddingSimilaritySearchRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmbeddingsApi#postEmbeddingSimilaritySearch");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **embeddingSimilaritySearchRequest** | [**EmbeddingSimilaritySearchRequest**](EmbeddingSimilaritySearchRequest.md)|  |

### Return type

[**EmbeddingSimilaritySearchResponse**](EmbeddingSimilaritySearchResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

