# AdvancedNumberOrdersApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAdvancedOrderV2**](AdvancedNumberOrdersApi.md#createAdvancedOrderV2) | **POST** /advanced_orders | Create Advanced Order
[**getAdvancedOrderV2**](AdvancedNumberOrdersApi.md#getAdvancedOrderV2) | **GET** /advanced_orders/{order_id} | Get Advanced Order
[**listAdvancedOrdersV2**](AdvancedNumberOrdersApi.md#listAdvancedOrdersV2) | **GET** /advanced_orders | List Advanced Orders



## createAdvancedOrderV2

> AdvancedOrderResponse createAdvancedOrderV2(advancedOrderRequest)

Create Advanced Order

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.AdvancedNumberOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AdvancedNumberOrdersApi apiInstance = new AdvancedNumberOrdersApi(defaultClient);
        AdvancedOrderRequest advancedOrderRequest = new AdvancedOrderRequest(); // AdvancedOrderRequest | 
        try {
            AdvancedOrderResponse result = apiInstance.createAdvancedOrderV2(advancedOrderRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdvancedNumberOrdersApi#createAdvancedOrderV2");
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
 **advancedOrderRequest** | [**AdvancedOrderRequest**](AdvancedOrderRequest.md)|  |

### Return type

[**AdvancedOrderResponse**](AdvancedOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getAdvancedOrderV2

> AdvancedOrderResponse getAdvancedOrderV2(orderId)

Get Advanced Order

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.AdvancedNumberOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AdvancedNumberOrdersApi apiInstance = new AdvancedNumberOrdersApi(defaultClient);
        UUID orderId = UUID.randomUUID(); // UUID | 
        try {
            AdvancedOrderResponse result = apiInstance.getAdvancedOrderV2(orderId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdvancedNumberOrdersApi#getAdvancedOrderV2");
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
 **orderId** | **UUID**|  |

### Return type

[**AdvancedOrderResponse**](AdvancedOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## listAdvancedOrdersV2

> ListAdvancedOrderResponse listAdvancedOrdersV2()

List Advanced Orders

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.AdvancedNumberOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AdvancedNumberOrdersApi apiInstance = new AdvancedNumberOrdersApi(defaultClient);
        try {
            ListAdvancedOrderResponse result = apiInstance.listAdvancedOrdersV2();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdvancedNumberOrdersApi#listAdvancedOrdersV2");
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

[**ListAdvancedOrderResponse**](ListAdvancedOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

