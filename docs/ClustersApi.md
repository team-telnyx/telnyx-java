# ClustersApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**computeNewClusterPublicTextClustersPost**](ClustersApi.md#computeNewClusterPublicTextClustersPost) | **POST** /ai/clusters | Compute new clusters
[**deleteClusterByTaskIdPublicTextClustersTaskIdDelete**](ClustersApi.md#deleteClusterByTaskIdPublicTextClustersTaskIdDelete) | **DELETE** /ai/clusters/{task_id} | Delete a cluster
[**fetchClusterByTaskIdPublicTextClustersTaskIdGet**](ClustersApi.md#fetchClusterByTaskIdPublicTextClustersTaskIdGet) | **GET** /ai/clusters/{task_id} | Fetch a cluster
[**fetchClusterImageByTaskIdPublicTextClustersTaskIdImageGet**](ClustersApi.md#fetchClusterImageByTaskIdPublicTextClustersTaskIdImageGet) | **GET** /ai/clusters/{task_id}/graph | Fetch a cluster visualization
[**listAllRequestedClustersPublicTextClustersGet**](ClustersApi.md#listAllRequestedClustersPublicTextClustersGet) | **GET** /ai/clusters | List all clusters



## computeNewClusterPublicTextClustersPost

> TextClusteringResponseData computeNewClusterPublicTextClustersPost(publicTextClusteringRequest)

Compute new clusters

Starts a background task to compute how the data in an [embedded storage bucket](https://developers.telnyx.com/api/inference/inference-embedding/post-embedding) is clustered. This helps identify common themes and patterns in the data.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ClustersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ClustersApi apiInstance = new ClustersApi(defaultClient);
        PublicTextClusteringRequest publicTextClusteringRequest = new PublicTextClusteringRequest(); // PublicTextClusteringRequest | 
        try {
            TextClusteringResponseData result = apiInstance.computeNewClusterPublicTextClustersPost(publicTextClusteringRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClustersApi#computeNewClusterPublicTextClustersPost");
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
 **publicTextClusteringRequest** | [**PublicTextClusteringRequest**](PublicTextClusteringRequest.md)|  |

### Return type

[**TextClusteringResponseData**](TextClusteringResponseData.md)

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


## deleteClusterByTaskIdPublicTextClustersTaskIdDelete

> deleteClusterByTaskIdPublicTextClustersTaskIdDelete(taskId)

Delete a cluster

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ClustersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ClustersApi apiInstance = new ClustersApi(defaultClient);
        String taskId = "taskId_example"; // String | 
        try {
            apiInstance.deleteClusterByTaskIdPublicTextClustersTaskIdDelete(taskId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClustersApi#deleteClusterByTaskIdPublicTextClustersTaskIdDelete");
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

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## fetchClusterByTaskIdPublicTextClustersTaskIdGet

> ClusteringStatusResponseData fetchClusterByTaskIdPublicTextClustersTaskIdGet(taskId, topNNodes, showSubclusters)

Fetch a cluster

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ClustersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ClustersApi apiInstance = new ClustersApi(defaultClient);
        String taskId = "taskId_example"; // String | 
        Integer topNNodes = 0; // Integer | The number of nodes in the cluster to return in the response. Nodes will be sorted by their centrality within the cluster.
        Boolean showSubclusters = false; // Boolean | Whether or not to include subclusters and their nodes in the response.
        try {
            ClusteringStatusResponseData result = apiInstance.fetchClusterByTaskIdPublicTextClustersTaskIdGet(taskId, topNNodes, showSubclusters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClustersApi#fetchClusterByTaskIdPublicTextClustersTaskIdGet");
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
 **topNNodes** | **Integer**| The number of nodes in the cluster to return in the response. Nodes will be sorted by their centrality within the cluster. | [optional] [default to 0]
 **showSubclusters** | **Boolean**| Whether or not to include subclusters and their nodes in the response. | [optional] [default to false]

### Return type

[**ClusteringStatusResponseData**](ClusteringStatusResponseData.md)

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


## fetchClusterImageByTaskIdPublicTextClustersTaskIdImageGet

> Object fetchClusterImageByTaskIdPublicTextClustersTaskIdImageGet(taskId, clusterId)

Fetch a cluster visualization

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ClustersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ClustersApi apiInstance = new ClustersApi(defaultClient);
        String taskId = "taskId_example"; // String | 
        Integer clusterId = 56; // Integer | 
        try {
            Object result = apiInstance.fetchClusterImageByTaskIdPublicTextClustersTaskIdImageGet(taskId, clusterId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClustersApi#fetchClusterImageByTaskIdPublicTextClustersTaskIdImageGet");
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
 **clusterId** | **Integer**|  | [optional]

### Return type

**Object**

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


## listAllRequestedClustersPublicTextClustersGet

> ClusteringRequestInfoData listAllRequestedClustersPublicTextClustersGet(pageNumber, pageSize)

List all clusters

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ClustersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ClustersApi apiInstance = new ClustersApi(defaultClient);
        Integer pageNumber = 0; // Integer | 
        Integer pageSize = 20; // Integer | 
        try {
            ClusteringRequestInfoData result = apiInstance.listAllRequestedClustersPublicTextClustersGet(pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClustersApi#listAllRequestedClustersPublicTextClustersGet");
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
 **pageNumber** | **Integer**|  | [optional] [default to 0]
 **pageSize** | **Integer**|  | [optional] [default to 20]

### Return type

[**ClusteringRequestInfoData**](ClusteringRequestInfoData.md)

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

