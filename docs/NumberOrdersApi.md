# NumberOrdersApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNumberOrder**](NumberOrdersApi.md#createNumberOrder) | **POST** /number_orders | Create a number order
[**listNumberOrders**](NumberOrdersApi.md#listNumberOrders) | **GET** /number_orders | List number orders
[**retrieveNumberOrder**](NumberOrdersApi.md#retrieveNumberOrder) | **GET** /number_orders/{number_order_id} | Retrieve a number order
[**updateNumberOrder**](NumberOrdersApi.md#updateNumberOrder) | **PATCH** /number_orders/{number_order_id} | Update a number order



## createNumberOrder

> NumberOrderResponse createNumberOrder(createNumberOrderRequest)

Create a number order

Creates a phone number order.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberOrdersApi apiInstance = new NumberOrdersApi(defaultClient);
        CreateNumberOrderRequest createNumberOrderRequest = new CreateNumberOrderRequest(); // CreateNumberOrderRequest | 
        try {
            NumberOrderResponse result = apiInstance.createNumberOrder(createNumberOrderRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberOrdersApi#createNumberOrder");
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
 **createNumberOrderRequest** | [**CreateNumberOrderRequest**](CreateNumberOrderRequest.md)|  |

### Return type

[**NumberOrderResponse**](NumberOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number order. |  -  |
| **0** | Bad Request |  -  |


## listNumberOrders

> ListNumberOrdersResponse listNumberOrders().filterStatus(filterStatus).filterCreatedAtGt(filterCreatedAtGt).filterCreatedAtLt(filterCreatedAtLt).filterPhoneNumbersPhoneNumber(filterPhoneNumbersPhoneNumber).filterCustomerReference(filterCustomerReference).filterRequirementsMet(filterRequirementsMet).pageNumber(pageNumber).pageSize(pageSize).execute();

List number orders

Get a paginated list of number orders.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberOrdersApi apiInstance = new NumberOrdersApi(defaultClient);
        String filterStatus = "filterStatus_example"; // String | Filter number orders by status.
        String filterCreatedAtGt = "filterCreatedAtGt_example"; // String | Filter number orders later than this value.
        String filterCreatedAtLt = "filterCreatedAtLt_example"; // String | Filter number orders earlier than this value.
        String filterPhoneNumbersPhoneNumber = "filterPhoneNumbersPhoneNumber_example"; // String | Filter number orders having these phone numbers.
        String filterCustomerReference = "filterCustomerReference_example"; // String | Filter number orders via the customer reference set.
        Boolean filterRequirementsMet = true; // Boolean | Filter number orders by requirements met.
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListNumberOrdersResponse result = api.listNumberOrders()
                .filterStatus(filterStatus)
                .filterCreatedAtGt(filterCreatedAtGt)
                .filterCreatedAtLt(filterCreatedAtLt)
                .filterPhoneNumbersPhoneNumber(filterPhoneNumbersPhoneNumber)
                .filterCustomerReference(filterCustomerReference)
                .filterRequirementsMet(filterRequirementsMet)
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberOrdersApi#listNumberOrders");
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
 **filterStatus** | **String**| Filter number orders by status. | [optional]
 **filterCreatedAtGt** | **String**| Filter number orders later than this value. | [optional]
 **filterCreatedAtLt** | **String**| Filter number orders earlier than this value. | [optional]
 **filterPhoneNumbersPhoneNumber** | **String**| Filter number orders having these phone numbers. | [optional]
 **filterCustomerReference** | **String**| Filter number orders via the customer reference set. | [optional]
 **filterRequirementsMet** | **Boolean**| Filter number orders by requirements met. | [optional]
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

[**ListNumberOrdersResponse**](ListNumberOrdersResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of number orders. |  -  |
| **0** | Bad Request |  -  |


## retrieveNumberOrder

> NumberOrderResponse retrieveNumberOrder(numberOrderId)

Retrieve a number order

Get an existing phone number order.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberOrdersApi apiInstance = new NumberOrdersApi(defaultClient);
        String numberOrderId = "numberOrderId_example"; // String | The number order ID.
        try {
            NumberOrderResponse result = apiInstance.retrieveNumberOrder(numberOrderId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberOrdersApi#retrieveNumberOrder");
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
 **numberOrderId** | **String**| The number order ID. |

### Return type

[**NumberOrderResponse**](NumberOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number order. |  -  |
| **0** | Bad Request |  -  |


## updateNumberOrder

> NumberOrderResponse updateNumberOrder(numberOrderId, updateNumberOrderRequest)

Update a number order

Updates a phone number order.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberOrdersApi apiInstance = new NumberOrdersApi(defaultClient);
        String numberOrderId = "numberOrderId_example"; // String | The number order ID.
        UpdateNumberOrderRequest updateNumberOrderRequest = new UpdateNumberOrderRequest(); // UpdateNumberOrderRequest | 
        try {
            NumberOrderResponse result = apiInstance.updateNumberOrder(numberOrderId, updateNumberOrderRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberOrdersApi#updateNumberOrder");
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
 **numberOrderId** | **String**| The number order ID. |
 **updateNumberOrderRequest** | [**UpdateNumberOrderRequest**](UpdateNumberOrderRequest.md)|  |

### Return type

[**NumberOrderResponse**](NumberOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a number order. |  -  |
| **0** | Bad Request |  -  |

