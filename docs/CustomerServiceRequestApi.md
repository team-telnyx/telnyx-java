# CustomerServiceRequestApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCustomerServiceRequest**](CustomerServiceRequestApi.md#getCustomerServiceRequest) | **GET** /customer_service_requests/{customer_service_request_id} | Get a customer service request
[**verifyPhoneNumberCoverage**](CustomerServiceRequestApi.md#verifyPhoneNumberCoverage) | **POST** /customer_service_requests/phone_number_coverages | Verify CSR phone number coverage



## getCustomerServiceRequest

> ShowCustomerServiceRequest getCustomerServiceRequest(customerServiceRequestId)

Get a customer service request

Get a specific customer service request.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CustomerServiceRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CustomerServiceRequestApi apiInstance = new CustomerServiceRequestApi(defaultClient);
        String customerServiceRequestId = "customerServiceRequestId_example"; // String | The ID of the customer service request
        try {
            ShowCustomerServiceRequest result = apiInstance.getCustomerServiceRequest(customerServiceRequestId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerServiceRequestApi#getCustomerServiceRequest");
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
 **customerServiceRequestId** | **String**| The ID of the customer service request |

### Return type

[**ShowCustomerServiceRequest**](ShowCustomerServiceRequest.md)

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


## verifyPhoneNumberCoverage

> ListCustomerServiceRequestPhoneNumberCoverage verifyPhoneNumberCoverage(UNKNOWN_BASE_TYPE)

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
import com.telnyx.sdk.api.CustomerServiceRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CustomerServiceRequestApi apiInstance = new CustomerServiceRequestApi(defaultClient);
        UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE = new HashMap(); // UNKNOWN_BASE_TYPE | 
        try {
            ListCustomerServiceRequestPhoneNumberCoverage result = apiInstance.verifyPhoneNumberCoverage(UNKNOWN_BASE_TYPE);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerServiceRequestApi#verifyPhoneNumberCoverage");
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
 **UNKNOWN_BASE_TYPE** | **UNKNOWN_BASE_TYPE**|  |

### Return type

[**ListCustomerServiceRequestPhoneNumberCoverage**](ListCustomerServiceRequestPhoneNumberCoverage.md)

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

