# FineTuningApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelNewFinetuningjobPublicFinetuningPost**](FineTuningApi.md#cancelNewFinetuningjobPublicFinetuningPost) | **POST** /ai/fine_tuning/jobs/{job_id}/cancel | Cancel a fine tuning job
[**createNewFinetuningjobPublicFinetuningPost**](FineTuningApi.md#createNewFinetuningjobPublicFinetuningPost) | **POST** /ai/fine_tuning/jobs | Create a fine tuning job
[**getFinetuningjobPublicFinetuningGet**](FineTuningApi.md#getFinetuningjobPublicFinetuningGet) | **GET** /ai/fine_tuning/jobs | List fine tuning jobs
[**getFinetuningjobPublicFinetuningJobIdGet**](FineTuningApi.md#getFinetuningjobPublicFinetuningJobIdGet) | **GET** /ai/fine_tuning/jobs/{job_id} | Get a fine tuning job



## cancelNewFinetuningjobPublicFinetuningPost

> FineTuningJob cancelNewFinetuningjobPublicFinetuningPost(jobId)

Cancel a fine tuning job

Cancel a fine tuning job.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.FineTuningApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        FineTuningApi apiInstance = new FineTuningApi(defaultClient);
        String jobId = "jobId_example"; // String | 
        try {
            FineTuningJob result = apiInstance.cancelNewFinetuningjobPublicFinetuningPost(jobId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FineTuningApi#cancelNewFinetuningjobPublicFinetuningPost");
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
 **jobId** | **String**|  |

### Return type

[**FineTuningJob**](FineTuningJob.md)

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


## createNewFinetuningjobPublicFinetuningPost

> FineTuningJob createNewFinetuningjobPublicFinetuningPost(createFineTuningJobRequest)

Create a fine tuning job

Create a new fine tuning job.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.FineTuningApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        FineTuningApi apiInstance = new FineTuningApi(defaultClient);
        CreateFineTuningJobRequest createFineTuningJobRequest = new CreateFineTuningJobRequest(); // CreateFineTuningJobRequest | 
        try {
            FineTuningJob result = apiInstance.createNewFinetuningjobPublicFinetuningPost(createFineTuningJobRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FineTuningApi#createNewFinetuningjobPublicFinetuningPost");
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
 **createFineTuningJobRequest** | [**CreateFineTuningJobRequest**](CreateFineTuningJobRequest.md)|  |

### Return type

[**FineTuningJob**](FineTuningJob.md)

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


## getFinetuningjobPublicFinetuningGet

> FineTuningJobsListData getFinetuningjobPublicFinetuningGet()

List fine tuning jobs

Retrieve a list of all fine tuning jobs created by the user.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.FineTuningApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        FineTuningApi apiInstance = new FineTuningApi(defaultClient);
        try {
            FineTuningJobsListData result = apiInstance.getFinetuningjobPublicFinetuningGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FineTuningApi#getFinetuningjobPublicFinetuningGet");
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

[**FineTuningJobsListData**](FineTuningJobsListData.md)

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


## getFinetuningjobPublicFinetuningJobIdGet

> FineTuningJob getFinetuningjobPublicFinetuningJobIdGet(jobId)

Get a fine tuning job

Retrieve a fine tuning job by `job_id`.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.FineTuningApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        FineTuningApi apiInstance = new FineTuningApi(defaultClient);
        String jobId = "jobId_example"; // String | 
        try {
            FineTuningJob result = apiInstance.getFinetuningjobPublicFinetuningJobIdGet(jobId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FineTuningApi#getFinetuningjobPublicFinetuningJobIdGet");
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
 **jobId** | **String**|  |

### Return type

[**FineTuningJob**](FineTuningJob.md)

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

