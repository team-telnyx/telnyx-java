# QueueCommandsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createQueue**](QueueCommandsApi.md#createQueue) | **POST** /queues | Create a queue
[**deleteQueue**](QueueCommandsApi.md#deleteQueue) | **DELETE** /queues/{queue_name} | Delete a queue
[**listQueueCalls**](QueueCommandsApi.md#listQueueCalls) | **GET** /queues/{queue_name}/calls | Retrieve calls from a queue
[**retrieveCallFromQueue**](QueueCommandsApi.md#retrieveCallFromQueue) | **GET** /queues/{queue_name}/calls/{call_control_id} | Retrieve a call from a queue
[**retrieveCallQueue**](QueueCommandsApi.md#retrieveCallQueue) | **GET** /queues/{queue_name} | Retrieve a call queue
[**updateQueueMaxSize**](QueueCommandsApi.md#updateQueueMaxSize) | **POST** /queues/{queue_name} | Update queue max size



## createQueue

> QueueResponse createQueue(createQueueRequest)

Create a queue

Create a new call queue with the specified name and maximum size.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.QueueCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        QueueCommandsApi apiInstance = new QueueCommandsApi(defaultClient);
        CreateQueueRequest createQueueRequest = new CreateQueueRequest(); // CreateQueueRequest | Queue creation request
        try {
            QueueResponse result = apiInstance.createQueue(createQueueRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QueueCommandsApi#createQueue");
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
 **createQueueRequest** | [**CreateQueueRequest**](CreateQueueRequest.md)| Queue creation request |

### Return type

[**QueueResponse**](QueueResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a queue. |  -  |
| **0** | Unexpected error |  -  |


## deleteQueue

> deleteQueue(queueName)

Delete a queue

Delete an existing queue. The queue must be empty (no calls in it) to be deleted.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.QueueCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        QueueCommandsApi apiInstance = new QueueCommandsApi(defaultClient);
        String queueName = "queueName_example"; // String | Uniquely identifies the queue by name
        try {
            apiInstance.deleteQueue(queueName);
        } catch (ApiException e) {
            System.err.println("Exception when calling QueueCommandsApi#deleteQueue");
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
 **queueName** | **String**| Uniquely identifies the queue by name |

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
| **204** | Queue successfully deleted |  -  |
| **404** | Fax does not exist |  -  |
| **0** | Unexpected error |  -  |


## listQueueCalls

> ListQueueCallsResponse listQueueCalls(queueName, pageNumber, pageSize)

Retrieve calls from a queue

Retrieve the list of calls in an existing queue

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.QueueCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        QueueCommandsApi apiInstance = new QueueCommandsApi(defaultClient);
        String queueName = "queueName_example"; // String | Uniquely identifies the queue by name
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListQueueCallsResponse result = apiInstance.listQueueCalls(queueName, pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QueueCommandsApi#listQueueCalls");
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
 **queueName** | **String**| Uniquely identifies the queue by name |
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

[**ListQueueCallsResponse**](ListQueueCallsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of calls in a queue. |  -  |
| **404** | Fax does not exist |  -  |


## retrieveCallFromQueue

> QueueCallResponse retrieveCallFromQueue(queueName, callControlId)

Retrieve a call from a queue

Retrieve an existing call from an existing queue

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.QueueCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        QueueCommandsApi apiInstance = new QueueCommandsApi(defaultClient);
        String queueName = "queueName_example"; // String | Uniquely identifies the queue by name
        String callControlId = "callControlId_example"; // String | Unique identifier and token for controlling the call
        try {
            QueueCallResponse result = apiInstance.retrieveCallFromQueue(queueName, callControlId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QueueCommandsApi#retrieveCallFromQueue");
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
 **queueName** | **String**| Uniquely identifies the queue by name |
 **callControlId** | **String**| Unique identifier and token for controlling the call |

### Return type

[**QueueCallResponse**](QueueCallResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a call in a queue. |  -  |
| **404** | Fax does not exist |  -  |


## retrieveCallQueue

> QueueResponse retrieveCallQueue(queueName)

Retrieve a call queue

Retrieve an existing call queue

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.QueueCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        QueueCommandsApi apiInstance = new QueueCommandsApi(defaultClient);
        String queueName = "queueName_example"; // String | Uniquely identifies the queue by name
        try {
            QueueResponse result = apiInstance.retrieveCallQueue(queueName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QueueCommandsApi#retrieveCallQueue");
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
 **queueName** | **String**| Uniquely identifies the queue by name |

### Return type

[**QueueResponse**](QueueResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a queue. |  -  |
| **404** | Fax does not exist |  -  |


## updateQueueMaxSize

> QueueResponse updateQueueMaxSize(queueName, updateQueueMaxSizeRequest)

Update queue max size

Update the maximum size of an existing queue

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.QueueCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        QueueCommandsApi apiInstance = new QueueCommandsApi(defaultClient);
        String queueName = "queueName_example"; // String | Uniquely identifies the queue by name
        UpdateQueueMaxSizeRequest updateQueueMaxSizeRequest = new UpdateQueueMaxSizeRequest(); // UpdateQueueMaxSizeRequest | Queue max size update request
        try {
            QueueResponse result = apiInstance.updateQueueMaxSize(queueName, updateQueueMaxSizeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QueueCommandsApi#updateQueueMaxSize");
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
 **queueName** | **String**| Uniquely identifies the queue by name |
 **updateQueueMaxSizeRequest** | [**UpdateQueueMaxSizeRequest**](UpdateQueueMaxSizeRequest.md)| Queue max size update request |

### Return type

[**QueueResponse**](QueueResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a queue. |  -  |
| **404** | Fax does not exist |  -  |
| **0** | Unexpected error |  -  |

