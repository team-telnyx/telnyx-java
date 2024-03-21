# CustomerServiceRecordApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomerServiceRecord**](CustomerServiceRecordApi.md#createCustomerServiceRecord) | **POST** /customer_service_records | Create a customer service record
[**getCustomerServiceRecord**](CustomerServiceRecordApi.md#getCustomerServiceRecord) | **GET** /customer_service_records/{customer_service_record_id} | Get a customer service record
[**listCustomerServiceRecords**](CustomerServiceRecordApi.md#listCustomerServiceRecords) | **GET** /customer_service_records | List customer service records
[**verifyPhoneNumberCoverage**](CustomerServiceRecordApi.md#verifyPhoneNumberCoverage) | **POST** /customer_service_records/phone_number_coverages | Verify CSR phone number coverage



## createCustomerServiceRecord

> CreateCustomerServiceRecord201Response createCustomerServiceRecord(createCustomerServiceRecordRequest)

Create a customer service record

Create a new customer service record for the provided phone number.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CustomerServiceRecordApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CustomerServiceRecordApi apiInstance = new CustomerServiceRecordApi(defaultClient);
        CreateCustomerServiceRecordRequest createCustomerServiceRecordRequest = new CreateCustomerServiceRecordRequest(); // CreateCustomerServiceRecordRequest | 
        try {
            CreateCustomerServiceRecord201Response result = apiInstance.createCustomerServiceRecord(createCustomerServiceRecordRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerServiceRecordApi#createCustomerServiceRecord");
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
 **createCustomerServiceRecordRequest** | [**CreateCustomerServiceRecordRequest**](CreateCustomerServiceRecordRequest.md)|  |

### Return type

[**CreateCustomerServiceRecord201Response**](CreateCustomerServiceRecord201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |
| **401** | The required authentication headers were either invalid or not included in the request. |  -  |
| **403** | You do not have permission to perform the requested action on the specified resource or resources. |  -  |
| **422** | Unprocessable entity. Check the &#39;detail&#39; field in response for details. |  -  |
| **500** | An unexpected error occurred. |  -  |


## getCustomerServiceRecord

> GetCustomerServiceRecord201Response getCustomerServiceRecord(customerServiceRecordId)

Get a customer service record

Get a specific customer service record.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CustomerServiceRecordApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CustomerServiceRecordApi apiInstance = new CustomerServiceRecordApi(defaultClient);
        String customerServiceRecordId = "customerServiceRecordId_example"; // String | The ID of the customer service record
        try {
            GetCustomerServiceRecord201Response result = apiInstance.getCustomerServiceRecord(customerServiceRecordId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerServiceRecordApi#getCustomerServiceRecord");
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
 **customerServiceRecordId** | **String**| The ID of the customer service record |

### Return type

[**GetCustomerServiceRecord201Response**](GetCustomerServiceRecord201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |
| **401** | The required authentication headers were either invalid or not included in the request. |  -  |
| **403** | You do not have permission to perform the requested action on the specified resource or resources. |  -  |
| **404** | Resource not found |  -  |
| **500** | An unexpected error occurred. |  -  |


## listCustomerServiceRecords

> ListCustomerServiceRecords200Response listCustomerServiceRecords(pageNumber, pageSize, sort, filterPhoneNumberEq, filterPhoneNumberIn, filterStatusEq, filterStatusIn, filterCreatedAtLt)

List customer service records

List customer service records.

### Example

```java
import java.time.OffsetDateTime;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CustomerServiceRecordApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CustomerServiceRecordApi apiInstance = new CustomerServiceRecordApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String sort = "created_at"; // String | Specifies the sort order for results. If not given, results are sorted by created_at in descending order.
        String filterPhoneNumberEq = "+12441239999"; // String | Filters records to those with a specified number.
        List<String> filterPhoneNumberIn = Arrays.asList(); // List<String> | Filters records to those with at least one number in the list.
        String filterStatusEq = "pending"; // String | Filters records to those with a specific status.
        List<String> filterStatusIn = Arrays.asList(); // List<String> | Filters records to those with a least one status in the list.
        OffsetDateTime filterCreatedAtLt = OffsetDateTime.parse("2020-01-01T00:00Z"); // OffsetDateTime | Filters records to those created after a specific date.
        try {
            ListCustomerServiceRecords200Response result = apiInstance.listCustomerServiceRecords(pageNumber, pageSize, sort, filterPhoneNumberEq, filterPhoneNumberIn, filterStatusEq, filterStatusIn, filterCreatedAtLt);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerServiceRecordApi#listCustomerServiceRecords");
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
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]
 **sort** | **String**| Specifies the sort order for results. If not given, results are sorted by created_at in descending order. | [optional] [enum: created_at, -created_at]
 **filterPhoneNumberEq** | **String**| Filters records to those with a specified number. | [optional]
 **filterPhoneNumberIn** | **List&lt;String&gt;**| Filters records to those with at least one number in the list. | [optional]
 **filterStatusEq** | **String**| Filters records to those with a specific status. | [optional] [enum: pending, completed, failed]
 **filterStatusIn** | **List&lt;String&gt;**| Filters records to those with a least one status in the list. | [optional] [enum: pending, completed, failed]
 **filterCreatedAtLt** | **OffsetDateTime**| Filters records to those created after a specific date. | [optional]

### Return type

[**ListCustomerServiceRecords200Response**](ListCustomerServiceRecords200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **401** | The required authentication headers were either invalid or not included in the request. |  -  |
| **403** | You do not have permission to perform the requested action on the specified resource or resources. |  -  |
| **422** | Unprocessable entity. Check the &#39;detail&#39; field in response for details. |  -  |
| **500** | An unexpected error occurred. |  -  |


## verifyPhoneNumberCoverage

> VerifyPhoneNumberCoverage201Response verifyPhoneNumberCoverage(verifyPhoneNumberCoverageRequest)

Verify CSR phone number coverage

Verify the coverage for a list of phone numbers.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CustomerServiceRecordApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CustomerServiceRecordApi apiInstance = new CustomerServiceRecordApi(defaultClient);
        VerifyPhoneNumberCoverageRequest verifyPhoneNumberCoverageRequest = new VerifyPhoneNumberCoverageRequest(); // VerifyPhoneNumberCoverageRequest | 
        try {
            VerifyPhoneNumberCoverage201Response result = apiInstance.verifyPhoneNumberCoverage(verifyPhoneNumberCoverageRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerServiceRecordApi#verifyPhoneNumberCoverage");
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
 **verifyPhoneNumberCoverageRequest** | [**VerifyPhoneNumberCoverageRequest**](VerifyPhoneNumberCoverageRequest.md)|  |

### Return type

[**VerifyPhoneNumberCoverage201Response**](VerifyPhoneNumberCoverage201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |
| **401** | The required authentication headers were either invalid or not included in the request. |  -  |
| **403** | You do not have permission to perform the requested action on the specified resource or resources. |  -  |
| **422** | Unprocessable entity. Check the &#39;detail&#39; field in response for details. |  -  |
| **500** | An unexpected error occurred. |  -  |

