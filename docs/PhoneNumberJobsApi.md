# PhoneNumberJobsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPhoneNumbersJobDeletePhoneNumbers**](PhoneNumberJobsApi.md#createPhoneNumbersJobDeletePhoneNumbers) | **POST** /phone_numbers/jobs/delete_phone_numbers | Creates a new background job to delete a batch of numbers. At most one thousand numbers can be updated per API call.
[**createPhoneNumbersJobUpdateEmergencySettings**](PhoneNumberJobsApi.md#createPhoneNumbersJobUpdateEmergencySettings) | **POST** /phone_numbers/jobs/update_emergency_settings | Creates a background job to update the emergency settings of a collection of phone numbers. At most one thousand numbers can be updated per API call.
[**listPhoneNumbersJobs**](PhoneNumberJobsApi.md#listPhoneNumbersJobs) | **GET** /phone_numbers/jobs | Lists the phone numbers asynchronous jobs.
[**retrievePhoneNumbersJob**](PhoneNumberJobsApi.md#retrievePhoneNumbersJob) | **GET** /phone_numbers/jobs/{id} | Retrieves the details of a given phone numbers job.



## createPhoneNumbersJobDeletePhoneNumbers

> PhoneNumbersJobDeletePhoneNumbers createPhoneNumbersJobDeletePhoneNumbers().phoneNumbersJobDeletePhoneNumbersRequest(phoneNumbersJobDeletePhoneNumbersRequest).execute();

Creates a new background job to delete a batch of numbers. At most one thousand numbers can be updated per API call.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberJobsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberJobsApi apiInstance = new PhoneNumberJobsApi(defaultClient);
        PhoneNumbersJobDeletePhoneNumbersRequest phoneNumbersJobDeletePhoneNumbersRequest = new PhoneNumbersJobDeletePhoneNumbersRequest(); // PhoneNumbersJobDeletePhoneNumbersRequest | 
        try {
            PhoneNumbersJobDeletePhoneNumbers result = api.createPhoneNumbersJobDeletePhoneNumbers()
                .phoneNumbersJobDeletePhoneNumbersRequest(phoneNumbersJobDeletePhoneNumbersRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberJobsApi#createPhoneNumbersJobDeletePhoneNumbers");
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
 **phoneNumbersJobDeletePhoneNumbersRequest** | [**PhoneNumbersJobDeletePhoneNumbersRequest**](PhoneNumbersJobDeletePhoneNumbersRequest.md)|  |

### Return type

[**PhoneNumbersJobDeletePhoneNumbers**](PhoneNumbersJobDeletePhoneNumbers.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Phone numbers job delete phone numbers requested. |  -  |
| **0** | Unexpected error |  -  |


## createPhoneNumbersJobUpdateEmergencySettings

> PhoneNumbersEnableEmergency createPhoneNumbersJobUpdateEmergencySettings(phoneNumbersJobUpdateEmergencySettingsRequest)

Creates a background job to update the emergency settings of a collection of phone numbers. At most one thousand numbers can be updated per API call.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberJobsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberJobsApi apiInstance = new PhoneNumberJobsApi(defaultClient);
        PhoneNumbersJobUpdateEmergencySettingsRequest phoneNumbersJobUpdateEmergencySettingsRequest = new PhoneNumbersJobUpdateEmergencySettingsRequest(); // PhoneNumbersJobUpdateEmergencySettingsRequest | 
        try {
            PhoneNumbersEnableEmergency result = apiInstance.createPhoneNumbersJobUpdateEmergencySettings(phoneNumbersJobUpdateEmergencySettingsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberJobsApi#createPhoneNumbersJobUpdateEmergencySettings");
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
 **phoneNumbersJobUpdateEmergencySettingsRequest** | [**PhoneNumbersJobUpdateEmergencySettingsRequest**](PhoneNumbersJobUpdateEmergencySettingsRequest.md)|  |

### Return type

[**PhoneNumbersEnableEmergency**](PhoneNumbersEnableEmergency.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Phone numbers enable emergency requested. |  -  |
| **0** | Unexpected error |  -  |


## listPhoneNumbersJobs

> ListPhoneNumbersAsynchronousJobsResponse listPhoneNumbersJobs().filterType(filterType).pageNumber(pageNumber).pageSize(pageSize).sort(sort).execute();

Lists the phone numbers asynchronous jobs.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberJobsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberJobsApi apiInstance = new PhoneNumberJobsApi(defaultClient);
        String filterType = update_emergency_settings; // String | Filter the phone number jobs by type.
        Integer pageNumber = 1; // Integer | The page number to load.
        Integer pageSize = 20; // Integer | The size of the page.
        String sort = created_at; // String | Specifies the sort order for results. If not given, results are sorted by created_at in descending order.
        try {
            ListPhoneNumbersAsynchronousJobsResponse result = api.listPhoneNumbersJobs()
                .filterType(filterType)
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .sort(sort)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberJobsApi#listPhoneNumbersJobs");
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
 **filterType** | **String**| Filter the phone number jobs by type. | [optional] [enum: update_emergency_settings, delete_phone_numbers]
 **pageNumber** | **Integer**| The page number to load. | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page. | [optional] [default to 20]
 **sort** | **String**| Specifies the sort order for results. If not given, results are sorted by created_at in descending order. | [optional] [enum: created_at]

### Return type

[**ListPhoneNumbersAsynchronousJobsResponse**](ListPhoneNumbersAsynchronousJobsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of phone numbers asynchronous jobs. |  -  |
| **0** | Unexpected error |  -  |


## retrievePhoneNumbersJob

> PhoneNumbersJob retrievePhoneNumbersJob(id).execute();

Retrieves the details of a given phone numbers job.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberJobsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberJobsApi apiInstance = new PhoneNumberJobsApi(defaultClient);
        String id = "id_example"; // String | Identifies the Phone Numbers Job.
        try {
            PhoneNumbersJob result = api.retrievePhoneNumbersJob(id)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberJobsApi#retrievePhoneNumbersJob");
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
 **id** | **String**| Identifies the Phone Numbers Job. |

### Return type

[**PhoneNumbersJob**](PhoneNumbersJob.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Phone numbers job details. |  -  |
| **0** | Unexpected error |  -  |

