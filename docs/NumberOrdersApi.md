# NumberOrdersApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNumberOrder**](NumberOrdersApi.md#createNumberOrder) | **POST** /number_orders | Create a number order
[**listNumberOrders**](NumberOrdersApi.md#listNumberOrders) | **GET** /number_orders | List number orders
[**retrieveNumberOrder**](NumberOrdersApi.md#retrieveNumberOrder) | **GET** /number_orders/{number_order_id} | Retrieve a number order
[**updateNumberOrder**](NumberOrdersApi.md#updateNumberOrder) | **PATCH** /number_orders/{number_order_id} | Update a number order

<a name="createNumberOrder"></a>
# **createNumberOrder**
> NumberOrderResponse createNumberOrder(body)

Create a number order

Creates a phone number order.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.NumberOrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberOrdersApi apiInstance = new NumberOrdersApi();
CreateNumberOrderRequest body = new CreateNumberOrderRequest(); // CreateNumberOrderRequest | 
try {
    NumberOrderResponse result = apiInstance.createNumberOrder(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberOrdersApi#createNumberOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateNumberOrderRequest**](CreateNumberOrderRequest.md)|  |

### Return type

[**NumberOrderResponse**](NumberOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listNumberOrders"></a>
# **listNumberOrders**
> ListNumberOrdersResponse listNumberOrders(filterStatus, filterCreatedAtGt, filterCreatedAtLt, filterPhoneNumbersPhoneNumber, filterCustomerReference, filterRequirementsMet)

List number orders

Get a paginated list of number orders.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.NumberOrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberOrdersApi apiInstance = new NumberOrdersApi();
String filterStatus = "filterStatus_example"; // String | Filter number orders by status.
String filterCreatedAtGt = "filterCreatedAtGt_example"; // String | Filter number orders later than this value.
String filterCreatedAtLt = "filterCreatedAtLt_example"; // String | Filter number orders earlier than this value.
String filterPhoneNumbersPhoneNumber = "filterPhoneNumbersPhoneNumber_example"; // String | Filter number orders having these phone numbers.
String filterCustomerReference = "filterCustomerReference_example"; // String | Filter number orders via the customer reference set.
Boolean filterRequirementsMet = true; // Boolean | Filter number orders by requirements met.
try {
    ListNumberOrdersResponse result = apiInstance.listNumberOrders(filterStatus, filterCreatedAtGt, filterCreatedAtLt, filterPhoneNumbersPhoneNumber, filterCustomerReference, filterRequirementsMet);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberOrdersApi#listNumberOrders");
    e.printStackTrace();
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

### Return type

[**ListNumberOrdersResponse**](ListNumberOrdersResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveNumberOrder"></a>
# **retrieveNumberOrder**
> NumberOrderResponse retrieveNumberOrder(numberOrderId)

Retrieve a number order

Get an existing phone number order.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.NumberOrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberOrdersApi apiInstance = new NumberOrdersApi();
String numberOrderId = "numberOrderId_example"; // String | The number order ID.
try {
    NumberOrderResponse result = apiInstance.retrieveNumberOrder(numberOrderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberOrdersApi#retrieveNumberOrder");
    e.printStackTrace();
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

<a name="updateNumberOrder"></a>
# **updateNumberOrder**
> NumberOrderResponse updateNumberOrder(body, numberOrderId)

Update a number order

Updates a phone number order.

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.NumberOrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberOrdersApi apiInstance = new NumberOrdersApi();
UpdateNumberOrderRequest body = new UpdateNumberOrderRequest(); // UpdateNumberOrderRequest | 
String numberOrderId = "numberOrderId_example"; // String | The number order ID.
try {
    NumberOrderResponse result = apiInstance.updateNumberOrder(body, numberOrderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberOrdersApi#updateNumberOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateNumberOrderRequest**](UpdateNumberOrderRequest.md)|  |
 **numberOrderId** | **String**| The number order ID. |

### Return type

[**NumberOrderResponse**](NumberOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

