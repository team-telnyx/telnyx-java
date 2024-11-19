# QueueCommandsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listQueueCalls**](QueueCommandsApi.md#listQueueCalls) | **GET** /queues/{queue_name}/calls | Retrieve calls from a queue
[**retrieveCallFromQueue**](QueueCommandsApi.md#retrieveCallFromQueue) | **GET** /queues/{queue_name}/calls/{call_control_id} | Retrieve a call from a queue
[**retrieveCallQueue**](QueueCommandsApi.md#retrieveCallQueue) | **GET** /queues/{queue_name} | Retrieve a call queue



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
| **404** | The requested resource doesn&#39;t exist. |  -  |


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
| **404** | The requested resource doesn&#39;t exist. |  -  |


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
| **404** | The requested resource doesn&#39;t exist. |  -  |

