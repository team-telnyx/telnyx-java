# BulkPhoneNumberOperationsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDeletePhoneNumbersJob**](BulkPhoneNumberOperationsApi.md#createDeletePhoneNumbersJob) | **POST** /phone_numbers/jobs/delete_phone_numbers | Delete a batch of numbers
[**createPhoneNumbersJobUpdateEmergencySettings**](BulkPhoneNumberOperationsApi.md#createPhoneNumbersJobUpdateEmergencySettings) | **POST** /phone_numbers/jobs/update_emergency_settings | Update the emergency settings from a batch of numbers
[**createUpdatePhoneNumbersJob**](BulkPhoneNumberOperationsApi.md#createUpdatePhoneNumbersJob) | **POST** /phone_numbers/jobs/update_phone_numbers | Update a batch of numbers
[**listPhoneNumbersJobs**](BulkPhoneNumberOperationsApi.md#listPhoneNumbersJobs) | **GET** /phone_numbers/jobs | Lists the phone numbers jobs
[**retrievePhoneNumbersJob**](BulkPhoneNumberOperationsApi.md#retrievePhoneNumbersJob) | **GET** /phone_numbers/jobs/{id} | Retrieve a phone numbers job



## createDeletePhoneNumbersJob

> PhoneNumbersJobDeletePhoneNumbers createDeletePhoneNumbersJob().phoneNumbersJobDeletePhoneNumbersRequest(phoneNumbersJobDeletePhoneNumbersRequest).execute();

Delete a batch of numbers

Creates a new background job to delete a batch of numbers. At most one thousand numbers can be updated per API call.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BulkPhoneNumberOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BulkPhoneNumberOperationsApi apiInstance = new BulkPhoneNumberOperationsApi(defaultClient);
        PhoneNumbersJobDeletePhoneNumbersRequest phoneNumbersJobDeletePhoneNumbersRequest = new PhoneNumbersJobDeletePhoneNumbersRequest(); // PhoneNumbersJobDeletePhoneNumbersRequest | 
        try {
            PhoneNumbersJobDeletePhoneNumbers result = api.createDeletePhoneNumbersJob()
                .phoneNumbersJobDeletePhoneNumbersRequest(phoneNumbersJobDeletePhoneNumbersRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BulkPhoneNumberOperationsApi#createDeletePhoneNumbersJob");
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
| **401** | Unauthenticated response. Happens when the current user cannot be authenticated. |  -  |
| **403** | Unauthorized response. Happens when the current user is not authorized to access the endpoint. |  -  |
| **422** | Unprocessable Entity |  -  |
| **0** | Unexpected error |  -  |


## createPhoneNumbersJobUpdateEmergencySettings

> PhoneNumbersEnableEmergency createPhoneNumbersJobUpdateEmergencySettings(phoneNumbersJobUpdateEmergencySettingsRequest)

Update the emergency settings from a batch of numbers

Creates a background job to update the emergency settings of a collection of phone numbers. At most one thousand numbers can be updated per API call.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BulkPhoneNumberOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BulkPhoneNumberOperationsApi apiInstance = new BulkPhoneNumberOperationsApi(defaultClient);
        PhoneNumbersJobUpdateEmergencySettingsRequest phoneNumbersJobUpdateEmergencySettingsRequest = new PhoneNumbersJobUpdateEmergencySettingsRequest(); // PhoneNumbersJobUpdateEmergencySettingsRequest | 
        try {
            PhoneNumbersEnableEmergency result = apiInstance.createPhoneNumbersJobUpdateEmergencySettings(phoneNumbersJobUpdateEmergencySettingsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BulkPhoneNumberOperationsApi#createPhoneNumbersJobUpdateEmergencySettings");
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
| **401** | Unauthenticated response. Happens when the current user cannot be authenticated. |  -  |
| **403** | Unauthorized response. Happens when the current user is not authorized to access the endpoint. |  -  |
| **422** | Unprocessable Entity |  -  |
| **0** | Unexpected error |  -  |


## createUpdatePhoneNumbersJob

> PhoneNumbersJobUpdatePhoneNumbers createUpdatePhoneNumbersJob().phoneNumbersJobUpdatePhoneNumbersRequest(phoneNumbersJobUpdatePhoneNumbersRequest).execute();

Update a batch of numbers

Creates a new background job to update a batch of numbers. At most one thousand numbers can be updated per API call. At least one of the updateable fields must be submitted.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BulkPhoneNumberOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BulkPhoneNumberOperationsApi apiInstance = new BulkPhoneNumberOperationsApi(defaultClient);
        PhoneNumbersJobUpdatePhoneNumbersRequest phoneNumbersJobUpdatePhoneNumbersRequest = new PhoneNumbersJobUpdatePhoneNumbersRequest(); // PhoneNumbersJobUpdatePhoneNumbersRequest | 
        try {
            PhoneNumbersJobUpdatePhoneNumbers result = api.createUpdatePhoneNumbersJob()
                .phoneNumbersJobUpdatePhoneNumbersRequest(phoneNumbersJobUpdatePhoneNumbersRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BulkPhoneNumberOperationsApi#createUpdatePhoneNumbersJob");
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
 **phoneNumbersJobUpdatePhoneNumbersRequest** | [**PhoneNumbersJobUpdatePhoneNumbersRequest**](PhoneNumbersJobUpdatePhoneNumbersRequest.md)|  |

### Return type

[**PhoneNumbersJobUpdatePhoneNumbers**](PhoneNumbersJobUpdatePhoneNumbers.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Phone numbers job update phone numbers requested. |  -  |
| **401** | Unauthenticated response. Happens when the current user cannot be authenticated. |  -  |
| **403** | Forbidden |  -  |
| **422** | Unprocessable Entity |  -  |
| **0** | Unexpected error |  -  |


## listPhoneNumbersJobs

> ListPhoneNumbersBackgroundJobsResponse listPhoneNumbersJobs().filterType(filterType).pageNumber(pageNumber).pageSize(pageSize).sort(sort).execute();

Lists the phone numbers jobs

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BulkPhoneNumberOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BulkPhoneNumberOperationsApi apiInstance = new BulkPhoneNumberOperationsApi(defaultClient);
        String filterType = "update_emergency_settings"; // String | Filter the phone number jobs by type.
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String sort = "created_at"; // String | Specifies the sort order for results. If not given, results are sorted by created_at in descending order.
        try {
            ListPhoneNumbersBackgroundJobsResponse result = api.listPhoneNumbersJobs()
                .filterType(filterType)
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .sort(sort)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BulkPhoneNumberOperationsApi#listPhoneNumbersJobs");
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
 **filterType** | **String**| Filter the phone number jobs by type. | [optional] [enum: update_emergency_settings, delete_phone_numbers, update_phone_numbers]
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]
 **sort** | **String**| Specifies the sort order for results. If not given, results are sorted by created_at in descending order. | [optional] [enum: created_at]

### Return type

[**ListPhoneNumbersBackgroundJobsResponse**](ListPhoneNumbersBackgroundJobsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of phone numbers background jobs. |  -  |
| **401** | Unauthenticated response. Happens when the current user cannot be authenticated. |  -  |
| **422** | Unprocessable Entity |  -  |
| **0** | Unexpected error |  -  |


## retrievePhoneNumbersJob

> PhoneNumbersJob retrievePhoneNumbersJob(id).execute();

Retrieve a phone numbers job

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BulkPhoneNumberOperationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BulkPhoneNumberOperationsApi apiInstance = new BulkPhoneNumberOperationsApi(defaultClient);
        String id = "id_example"; // String | Identifies the Phone Numbers Job.
        try {
            PhoneNumbersJob result = api.retrievePhoneNumbersJob(id)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BulkPhoneNumberOperationsApi#retrievePhoneNumbersJob");
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
| **401** | Unauthenticated response. Happens when the current user cannot be authenticated. |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |

