# NumberBackgroundJobsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPhoneNumbersJobDeletePhoneNumbers**](NumberBackgroundJobsApi.md#createPhoneNumbersJobDeletePhoneNumbers) | **POST** /phone_numbers/jobs/delete_phone_numbers | Delete a batch of numbers
[**createPhoneNumbersJobUpdateEmergencySettings**](NumberBackgroundJobsApi.md#createPhoneNumbersJobUpdateEmergencySettings) | **POST** /phone_numbers/jobs/update_emergency_settings | Update the emergency settings from a batch of numbers
[**createPhoneNumbersJobUpdatePhoneNumber**](NumberBackgroundJobsApi.md#createPhoneNumbersJobUpdatePhoneNumber) | **POST** /phone_numbers/jobs/update_phone_numbers | Update a batch of numbers
[**listPhoneNumbersJobs**](NumberBackgroundJobsApi.md#listPhoneNumbersJobs) | **GET** /phone_numbers/jobs | Lists the phone numbers jobs
[**retrievePhoneNumbersJob**](NumberBackgroundJobsApi.md#retrievePhoneNumbersJob) | **GET** /phone_numbers/jobs/{id} | Retrieve a phone numbers job



## createPhoneNumbersJobDeletePhoneNumbers

> PhoneNumbersJobDeletePhoneNumbers createPhoneNumbersJobDeletePhoneNumbers().phoneNumbersJobDeletePhoneNumbersRequest(phoneNumbersJobDeletePhoneNumbersRequest).execute();

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
import com.telnyx.sdk.api.NumberBackgroundJobsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberBackgroundJobsApi apiInstance = new NumberBackgroundJobsApi(defaultClient);
        PhoneNumbersJobDeletePhoneNumbersRequest phoneNumbersJobDeletePhoneNumbersRequest = new PhoneNumbersJobDeletePhoneNumbersRequest(); // PhoneNumbersJobDeletePhoneNumbersRequest | 
        try {
            PhoneNumbersJobDeletePhoneNumbers result = api.createPhoneNumbersJobDeletePhoneNumbers()
                .phoneNumbersJobDeletePhoneNumbersRequest(phoneNumbersJobDeletePhoneNumbersRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberBackgroundJobsApi#createPhoneNumbersJobDeletePhoneNumbers");
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
| **0** | Bad Request |  -  |


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
import com.telnyx.sdk.api.NumberBackgroundJobsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberBackgroundJobsApi apiInstance = new NumberBackgroundJobsApi(defaultClient);
        PhoneNumbersJobUpdateEmergencySettingsRequest phoneNumbersJobUpdateEmergencySettingsRequest = new PhoneNumbersJobUpdateEmergencySettingsRequest(); // PhoneNumbersJobUpdateEmergencySettingsRequest | 
        try {
            PhoneNumbersEnableEmergency result = apiInstance.createPhoneNumbersJobUpdateEmergencySettings(phoneNumbersJobUpdateEmergencySettingsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberBackgroundJobsApi#createPhoneNumbersJobUpdateEmergencySettings");
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
| **0** | Bad Request |  -  |


## createPhoneNumbersJobUpdatePhoneNumber

> PhoneNumbersJobUpdatePhoneNumbers createPhoneNumbersJobUpdatePhoneNumber().phoneNumbersJobUpdatePhoneNumbersRequest(phoneNumbersJobUpdatePhoneNumbersRequest).execute();

Update a batch of numbers

Creates a new background job to update a batch of numbers. At most one thousand numbers can be updated per API call. At least one of the updateable fields must be submitted

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberBackgroundJobsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberBackgroundJobsApi apiInstance = new NumberBackgroundJobsApi(defaultClient);
        PhoneNumbersJobUpdatePhoneNumbersRequest phoneNumbersJobUpdatePhoneNumbersRequest = new PhoneNumbersJobUpdatePhoneNumbersRequest(); // PhoneNumbersJobUpdatePhoneNumbersRequest | 
        try {
            PhoneNumbersJobUpdatePhoneNumbers result = api.createPhoneNumbersJobUpdatePhoneNumber()
                .phoneNumbersJobUpdatePhoneNumbersRequest(phoneNumbersJobUpdatePhoneNumbersRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberBackgroundJobsApi#createPhoneNumbersJobUpdatePhoneNumber");
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
| **0** | Bad Request |  -  |


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
import com.telnyx.sdk.api.NumberBackgroundJobsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberBackgroundJobsApi apiInstance = new NumberBackgroundJobsApi(defaultClient);
        String filterType = update_emergency_settings; // String | Filter the phone number jobs by type.
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String sort = created_at; // String | Specifies the sort order for results. If not given, results are sorted by created_at in descending order.
        try {
            ListPhoneNumbersBackgroundJobsResponse result = api.listPhoneNumbersJobs()
                .filterType(filterType)
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .sort(sort)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberBackgroundJobsApi#listPhoneNumbersJobs");
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
| **0** | Bad Request |  -  |


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
import com.telnyx.sdk.api.NumberBackgroundJobsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberBackgroundJobsApi apiInstance = new NumberBackgroundJobsApi(defaultClient);
        String id = "id_example"; // String | Identifies the Phone Numbers Job.
        try {
            PhoneNumbersJob result = api.retrievePhoneNumbersJob(id)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberBackgroundJobsApi#retrievePhoneNumbersJob");
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
| **0** | Bad Request |  -  |

