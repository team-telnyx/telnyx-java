# BulkSoleProprietorCreationApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllTasks**](BulkSoleProprietorCreationApi.md#getAllTasks) | **GET** /bulkCreation | Get All Tasks
[**getBulkCreationTaskStatus**](BulkSoleProprietorCreationApi.md#getBulkCreationTaskStatus) | **GET** /bulkCreation/{taskId} | Get Task Status
[**getTaskDetailedStatus**](BulkSoleProprietorCreationApi.md#getTaskDetailedStatus) | **GET** /bulkCreation/{taskId}/detailedStatus | Get Detailed Task Status
[**postBulkCreation**](BulkSoleProprietorCreationApi.md#postBulkCreation) | **POST** /bulkCreation | Bulk Creation



## getAllTasks

> BulkCreationTasksResponse getAllTasks(recordsPerPage, page)

Get All Tasks

Get a list of all tasks ever submitted by your organization.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BulkSoleProprietorCreationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BulkSoleProprietorCreationApi apiInstance = new BulkSoleProprietorCreationApi(defaultClient);
        Object recordsPerPage = 20; // Object | 
        Object page = 1; // Object | 
        try {
            BulkCreationTasksResponse result = apiInstance.getAllTasks(recordsPerPage, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BulkSoleProprietorCreationApi#getAllTasks");
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
 **recordsPerPage** | **Object**|  | [optional] [default to 20]
 **page** | **Object**|  | [optional] [default to 1]

### Return type

[**BulkCreationTasksResponse**](BulkCreationTasksResponse.md)

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


## getBulkCreationTaskStatus

> BulkCreationStatusResponse getBulkCreationTaskStatus(taskId)

Get Task Status

Get a simple overview of the status of a bulk creation task.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BulkSoleProprietorCreationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BulkSoleProprietorCreationApi apiInstance = new BulkSoleProprietorCreationApi(defaultClient);
        String taskId = "taskId_example"; // String | 
        try {
            BulkCreationStatusResponse result = apiInstance.getBulkCreationTaskStatus(taskId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BulkSoleProprietorCreationApi#getBulkCreationTaskStatus");
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

[**BulkCreationStatusResponse**](BulkCreationStatusResponse.md)

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


## getTaskDetailedStatus

> BulkCreationDetailedStatusResponse getTaskDetailedStatus(taskId, recordsPerPage, page)

Get Detailed Task Status

Get detailed information about the status of a bulk creation task.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BulkSoleProprietorCreationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BulkSoleProprietorCreationApi apiInstance = new BulkSoleProprietorCreationApi(defaultClient);
        String taskId = "taskId_example"; // String | 
        Object recordsPerPage = 20; // Object | 
        Object page = 1; // Object | 
        try {
            BulkCreationDetailedStatusResponse result = apiInstance.getTaskDetailedStatus(taskId, recordsPerPage, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BulkSoleProprietorCreationApi#getTaskDetailedStatus");
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
 **recordsPerPage** | **Object**|  | [optional] [default to 20]
 **page** | **Object**|  | [optional] [default to 1]

### Return type

[**BulkCreationDetailedStatusResponse**](BulkCreationDetailedStatusResponse.md)

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


## postBulkCreation

> BulkCreationResponse postBulkCreation(bulkCreationRequest)

Bulk Creation

Submit sets of data about brands, campaigns, and phone numbers to create and assign. Please note that sub-usecases, phone numbers, and sample messages are each limited to 5 per campaign.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BulkSoleProprietorCreationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BulkSoleProprietorCreationApi apiInstance = new BulkSoleProprietorCreationApi(defaultClient);
        BulkCreationRequest bulkCreationRequest = new BulkCreationRequest(); // BulkCreationRequest | 
        try {
            BulkCreationResponse result = apiInstance.postBulkCreation(bulkCreationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BulkSoleProprietorCreationApi#postBulkCreation");
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
 **bulkCreationRequest** | [**BulkCreationRequest**](BulkCreationRequest.md)|  |

### Return type

[**BulkCreationResponse**](BulkCreationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Response |  -  |
| **422** | Validation Error |  -  |

