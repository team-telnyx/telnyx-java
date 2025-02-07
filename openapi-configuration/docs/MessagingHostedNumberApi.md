# MessagingHostedNumberApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMessagingHostedNumberOrder**](MessagingHostedNumberApi.md#createMessagingHostedNumberOrder) | **POST** /messaging_hosted_number_orders | Create a messaging hosted number order
[**deleteMessagingHostedNumber**](MessagingHostedNumberApi.md#deleteMessagingHostedNumber) | **DELETE** /messaging_hosted_numbers/{id} | Delete a messaging hosted number
[**getMessagingHostedNumberOrder**](MessagingHostedNumberApi.md#getMessagingHostedNumberOrder) | **GET** /messaging_hosted_number_orders/{id} | Retrieve a messaging hosted number order
[**listMessagingHostedNumberOrders**](MessagingHostedNumberApi.md#listMessagingHostedNumberOrders) | **GET** /messaging_hosted_number_orders | List messaging hosted number orders
[**uploadMessagingHostedNumberOrderFile**](MessagingHostedNumberApi.md#uploadMessagingHostedNumberOrderFile) | **POST** /messaging_hosted_number_orders/{id}/actions/file_upload | Upload file required for a messaging hosted number order



## createMessagingHostedNumberOrder

> RetrieveMessagingHostedNumberOrderResponse createMessagingHostedNumberOrder(createMessagingHostedNumberOrderRequest)

Create a messaging hosted number order

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MessagingHostedNumberApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingHostedNumberApi apiInstance = new MessagingHostedNumberApi(defaultClient);
        CreateMessagingHostedNumberOrderRequest createMessagingHostedNumberOrderRequest = new CreateMessagingHostedNumberOrderRequest(); // CreateMessagingHostedNumberOrderRequest | Message payload
        try {
            RetrieveMessagingHostedNumberOrderResponse result = apiInstance.createMessagingHostedNumberOrder(createMessagingHostedNumberOrderRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingHostedNumberApi#createMessagingHostedNumberOrder");
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
 **createMessagingHostedNumberOrderRequest** | [**CreateMessagingHostedNumberOrderRequest**](CreateMessagingHostedNumberOrderRequest.md)| Message payload | [optional]

### Return type

[**RetrieveMessagingHostedNumberOrderResponse**](RetrieveMessagingHostedNumberOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a messaging hosted number order. |  -  |
| **0** | Unexpected error |  -  |


## deleteMessagingHostedNumber

> RetrieveMessagingHostedNumberResponse deleteMessagingHostedNumber(id)

Delete a messaging hosted number

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MessagingHostedNumberApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingHostedNumberApi apiInstance = new MessagingHostedNumberApi(defaultClient);
        String id = "id_example"; // String | Identifies the type of resource.
        try {
            RetrieveMessagingHostedNumberResponse result = apiInstance.deleteMessagingHostedNumber(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingHostedNumberApi#deleteMessagingHostedNumber");
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
 **id** | **String**| Identifies the type of resource. |

### Return type

[**RetrieveMessagingHostedNumberResponse**](RetrieveMessagingHostedNumberResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a messaging hosted number. |  -  |
| **0** | Unexpected error |  -  |


## getMessagingHostedNumberOrder

> RetrieveMessagingHostedNumberOrderResponse getMessagingHostedNumberOrder(id)

Retrieve a messaging hosted number order

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MessagingHostedNumberApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingHostedNumberApi apiInstance = new MessagingHostedNumberApi(defaultClient);
        String id = "id_example"; // String | Identifies the type of resource.
        try {
            RetrieveMessagingHostedNumberOrderResponse result = apiInstance.getMessagingHostedNumberOrder(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingHostedNumberApi#getMessagingHostedNumberOrder");
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
 **id** | **String**| Identifies the type of resource. |

### Return type

[**RetrieveMessagingHostedNumberOrderResponse**](RetrieveMessagingHostedNumberOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a messaging hosted number order. |  -  |
| **0** | Unexpected error |  -  |


## listMessagingHostedNumberOrders

> ListMessagingHostedNumberOrderResponse listMessagingHostedNumberOrders().pageNumber(pageNumber).pageSize(pageSize).execute();

List messaging hosted number orders

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MessagingHostedNumberApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingHostedNumberApi apiInstance = new MessagingHostedNumberApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListMessagingHostedNumberOrderResponse result = api.listMessagingHostedNumberOrders()
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingHostedNumberApi#listMessagingHostedNumberOrders");
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

### Return type

[**ListMessagingHostedNumberOrderResponse**](ListMessagingHostedNumberOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of messaging hosted number orders. |  -  |
| **0** | Unexpected error |  -  |


## uploadMessagingHostedNumberOrderFile

> RetrieveMessagingHostedNumberOrderResponse uploadMessagingHostedNumberOrderFile(id, loa, bill)

Upload file required for a messaging hosted number order

### Example

```java
import java.io.File;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MessagingHostedNumberApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingHostedNumberApi apiInstance = new MessagingHostedNumberApi(defaultClient);
        String id = "id_example"; // String | Identifies the type of resource.
        File loa = new File("/path/to/file"); // File | Must be a signed LOA for the numbers in the order in PDF format.
        File bill = new File("/path/to/file"); // File | Must be the last month's bill with proof of ownership of all of the numbers in the order in PDF format.
        try {
            RetrieveMessagingHostedNumberOrderResponse result = apiInstance.uploadMessagingHostedNumberOrderFile(id, loa, bill);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingHostedNumberApi#uploadMessagingHostedNumberOrderFile");
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
 **id** | **String**| Identifies the type of resource. |
 **loa** | **File**| Must be a signed LOA for the numbers in the order in PDF format. | [optional]
 **bill** | **File**| Must be the last month&#39;s bill with proof of ownership of all of the numbers in the order in PDF format. | [optional]

### Return type

[**RetrieveMessagingHostedNumberOrderResponse**](RetrieveMessagingHostedNumberOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a messaging hosted number order. |  -  |
| **0** | Unexpected error |  -  |

