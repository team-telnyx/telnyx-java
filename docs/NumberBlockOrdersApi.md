# NumberBlockOrdersApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNumberBlockOrder**](NumberBlockOrdersApi.md#createNumberBlockOrder) | **POST** /number_block_orders | Create a number block order
[**listNumberBlockOrders**](NumberBlockOrdersApi.md#listNumberBlockOrders) | **GET** /number_block_orders | List number block orders
[**retrieveNumberBlockOrder**](NumberBlockOrdersApi.md#retrieveNumberBlockOrder) | **GET** /number_block_orders/{number_block_order_id} | Retrieve a number block order



## createNumberBlockOrder

> NumberBlockOrderResponse createNumberBlockOrder(createNumberBlockOrderRequest)

Create a number block order

Creates a phone number block order.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberBlockOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberBlockOrdersApi apiInstance = new NumberBlockOrdersApi(defaultClient);
        CreateNumberBlockOrderRequest createNumberBlockOrderRequest = new CreateNumberBlockOrderRequest(); // CreateNumberBlockOrderRequest | 
        try {
            NumberBlockOrderResponse result = apiInstance.createNumberBlockOrder(createNumberBlockOrderRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberBlockOrdersApi#createNumberBlockOrder");
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
 **createNumberBlockOrderRequest** | [**CreateNumberBlockOrderRequest**](CreateNumberBlockOrderRequest.md)|  |

### Return type

[**NumberBlockOrderResponse**](NumberBlockOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number block order. |  -  |
| **0** | Unexpected error |  -  |


## listNumberBlockOrders

> ListNumberBlockOrdersResponse listNumberBlockOrders(filterStatus, filterCreatedAtGt, filterCreatedAtLt, filterPhoneNumbersStartingNumber, pageNumber, pageSize)

List number block orders

Get a paginated list of number block orders.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberBlockOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberBlockOrdersApi apiInstance = new NumberBlockOrdersApi(defaultClient);
        String filterStatus = pending; // String | Filter number block orders by status.
        String filterCreatedAtGt = 2018-01-01T00:00:00.000000Z; // String | Filter number block orders later than this value.
        String filterCreatedAtLt = 2018-01-01T00:00:00.000000Z; // String | Filter number block orders earlier than this value.
        String filterPhoneNumbersStartingNumber = +19705555000; // String | Filter number block  orders having these phone numbers.
        Integer pageNumber = 1; // Integer | The page number to load.
        Integer pageSize = 20; // Integer | The size of the page.
        try {
            ListNumberBlockOrdersResponse result = apiInstance.listNumberBlockOrders(filterStatus, filterCreatedAtGt, filterCreatedAtLt, filterPhoneNumbersStartingNumber, pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberBlockOrdersApi#listNumberBlockOrders");
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
 **filterStatus** | **String**| Filter number block orders by status. | [optional]
 **filterCreatedAtGt** | **String**| Filter number block orders later than this value. | [optional]
 **filterCreatedAtLt** | **String**| Filter number block orders earlier than this value. | [optional]
 **filterPhoneNumbersStartingNumber** | **String**| Filter number block  orders having these phone numbers. | [optional]
 **pageNumber** | **Integer**| The page number to load. | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page. | [optional] [default to 20]

### Return type

[**ListNumberBlockOrdersResponse**](ListNumberBlockOrdersResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of number block orders. |  -  |
| **0** | Unexpected error |  -  |


## retrieveNumberBlockOrder

> NumberBlockOrderResponse retrieveNumberBlockOrder(numberBlockOrderId)

Retrieve a number block order

Get an existing phone number block order.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberBlockOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberBlockOrdersApi apiInstance = new NumberBlockOrdersApi(defaultClient);
        String numberBlockOrderId = "numberBlockOrderId_example"; // String | The number block order ID.
        try {
            NumberBlockOrderResponse result = apiInstance.retrieveNumberBlockOrder(numberBlockOrderId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberBlockOrdersApi#retrieveNumberBlockOrder");
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
 **numberBlockOrderId** | **String**| The number block order ID. |

### Return type

[**NumberBlockOrderResponse**](NumberBlockOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number block order. |  -  |
| **0** | Unexpected error |  -  |

