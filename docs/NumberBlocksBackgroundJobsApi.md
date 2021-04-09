# NumberBlocksBackgroundJobsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPhoneNumberBlocksJobDeletePhoneNumberBlock**](NumberBlocksBackgroundJobsApi.md#createPhoneNumberBlocksJobDeletePhoneNumberBlock) | **POST** /phone_number_blocks/jobs/delete_phone_number_block | Deletes all numbers associated with a phone number block
[**listPhoneNumberBlocksJobs**](NumberBlocksBackgroundJobsApi.md#listPhoneNumberBlocksJobs) | **GET** /phone_number_blocks/jobs | Lists the phone number blocks jobs
[**retrievePhoneNumberBlocksJob**](NumberBlocksBackgroundJobsApi.md#retrievePhoneNumberBlocksJob) | **GET** /phone_number_blocks/jobs/{id} | Retrieves a phone number blocks job



## createPhoneNumberBlocksJobDeletePhoneNumberBlock

> PhoneNumberBlocksJobDeletePhoneNumberBlock createPhoneNumberBlocksJobDeletePhoneNumberBlock().phoneNumberBlocksJobDeletePhoneNumberBlockRequest(phoneNumberBlocksJobDeletePhoneNumberBlockRequest).execute();

Deletes all numbers associated with a phone number block

Creates a new background job to delete all the phone numbers associated with the given block. We will only consider the phone number block as deleted after all phone numbers associated with it are removed, so multiple executions of this job may be necessary in case some of the phone numbers present errors during the deletion process.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberBlocksBackgroundJobsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberBlocksBackgroundJobsApi apiInstance = new NumberBlocksBackgroundJobsApi(defaultClient);
        PhoneNumberBlocksJobDeletePhoneNumberBlockRequest phoneNumberBlocksJobDeletePhoneNumberBlockRequest = new PhoneNumberBlocksJobDeletePhoneNumberBlockRequest(); // PhoneNumberBlocksJobDeletePhoneNumberBlockRequest | 
        try {
            PhoneNumberBlocksJobDeletePhoneNumberBlock result = api.createPhoneNumberBlocksJobDeletePhoneNumberBlock()
                .phoneNumberBlocksJobDeletePhoneNumberBlockRequest(phoneNumberBlocksJobDeletePhoneNumberBlockRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberBlocksBackgroundJobsApi#createPhoneNumberBlocksJobDeletePhoneNumberBlock");
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
 **phoneNumberBlocksJobDeletePhoneNumberBlockRequest** | [**PhoneNumberBlocksJobDeletePhoneNumberBlockRequest**](PhoneNumberBlocksJobDeletePhoneNumberBlockRequest.md)|  |

### Return type

[**PhoneNumberBlocksJobDeletePhoneNumberBlock**](PhoneNumberBlocksJobDeletePhoneNumberBlock.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Phone number blocks job delete phone numbers requested. |  -  |
| **0** | Unexpected error |  -  |


## listPhoneNumberBlocksJobs

> ListPhoneNumberBlocksBackgroundJobsResponse listPhoneNumberBlocksJobs().filterType(filterType).filterStatus(filterStatus).pageNumber(pageNumber).pageSize(pageSize).sort(sort).execute();

Lists the phone number blocks jobs

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberBlocksBackgroundJobsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberBlocksBackgroundJobsApi apiInstance = new NumberBlocksBackgroundJobsApi(defaultClient);
        String filterType = delete_phone_number_block; // String | Filter the phone number blocks jobs by type.
        String filterStatus = in_progress; // String | Filter the phone number blocks jobs by status.
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 250; // Integer | The size of the page
        String sort = created_at; // String | Specifies the sort order for results. If not given, results are sorted by created_at in descending order.
        try {
            ListPhoneNumberBlocksBackgroundJobsResponse result = api.listPhoneNumberBlocksJobs()
                .filterType(filterType)
                .filterStatus(filterStatus)
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .sort(sort)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberBlocksBackgroundJobsApi#listPhoneNumberBlocksJobs");
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
 **filterType** | **String**| Filter the phone number blocks jobs by type. | [optional] [enum: delete_phone_number_block]
 **filterStatus** | **String**| Filter the phone number blocks jobs by status. | [optional] [enum: pending, in_progress, completed, failed]
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 250]
 **sort** | **String**| Specifies the sort order for results. If not given, results are sorted by created_at in descending order. | [optional] [enum: created_at]

### Return type

[**ListPhoneNumberBlocksBackgroundJobsResponse**](ListPhoneNumberBlocksBackgroundJobsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of phone number blocks background jobs. |  -  |
| **0** | Unexpected error |  -  |


## retrievePhoneNumberBlocksJob

> PhoneNumberBlocksJob retrievePhoneNumberBlocksJob(id).execute();

Retrieves a phone number blocks job

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberBlocksBackgroundJobsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberBlocksBackgroundJobsApi apiInstance = new NumberBlocksBackgroundJobsApi(defaultClient);
        String id = "id_example"; // String | Identifies the Phone Number Blocks Job.
        try {
            PhoneNumberBlocksJob result = api.retrievePhoneNumberBlocksJob(id)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberBlocksBackgroundJobsApi#retrievePhoneNumberBlocksJob");
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
 **id** | **String**| Identifies the Phone Number Blocks Job. |

### Return type

[**PhoneNumberBlocksJob**](PhoneNumberBlocksJob.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Phone number blocks job details. |  -  |
| **0** | Unexpected error |  -  |

