# NumberOrdersApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNumberOrder**](NumberOrdersApi.md#createNumberOrder) | **POST** /number_orders | Create Phone Number Order
[**listNumberOrders**](NumberOrdersApi.md#listNumberOrders) | **GET** /number_orders | Get multiple Number Orders
[**retrieveNumberOrder**](NumberOrdersApi.md#retrieveNumberOrder) | **GET** /number_orders/{number_order_id} | Get a single phone number order
[**updateNumberOrder**](NumberOrdersApi.md#updateNumberOrder) | **PATCH** /number_orders/{number_order_id} | Update phone number order

<a name="createNumberOrder"></a>
# **createNumberOrder**
> CreateNumberOrderResponse createNumberOrder(body)

Create Phone Number Order

Creates a Phone Number Order

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NumberOrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberOrdersApi apiInstance = new NumberOrdersApi();
NumberOrder body = new NumberOrder(); // NumberOrder | 
try {
    CreateNumberOrderResponse result = apiInstance.createNumberOrder(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberOrdersApi#createNumberOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NumberOrder**](NumberOrder.md)|  |

### Return type

[**CreateNumberOrderResponse**](CreateNumberOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listNumberOrders"></a>
# **listNumberOrders**
> ListNumberOrdersResponse listNumberOrders(filterStatus, filterCreatedAtGt, filterCreatedAtLt, filterPhoneNumbersPhoneNumber, filterCustomerReference, filterRequirementsMet)

Get multiple Number Orders

Get a paginated list of Number Orders

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NumberOrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberOrdersApi apiInstance = new NumberOrdersApi();
String filterStatus = "filterStatus_example"; // String | Filter number orders by status
String filterCreatedAtGt = "filterCreatedAtGt_example"; // String | Filter number orders later than this value
String filterCreatedAtLt = "filterCreatedAtLt_example"; // String | Filter number orders earlier than this value
String filterPhoneNumbersPhoneNumber = "filterPhoneNumbersPhoneNumber_example"; // String | Filter number orders having these phone numbers
String filterCustomerReference = "filterCustomerReference_example"; // String | Filter number orders via the customer reference set
Boolean filterRequirementsMet = true; // Boolean | Filter number orders by requirements met
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
 **filterStatus** | **String**| Filter number orders by status | [optional]
 **filterCreatedAtGt** | **String**| Filter number orders later than this value | [optional]
 **filterCreatedAtLt** | **String**| Filter number orders earlier than this value | [optional]
 **filterPhoneNumbersPhoneNumber** | **String**| Filter number orders having these phone numbers | [optional]
 **filterCustomerReference** | **String**| Filter number orders via the customer reference set | [optional]
 **filterRequirementsMet** | **Boolean**| Filter number orders by requirements met | [optional]

### Return type

[**ListNumberOrdersResponse**](ListNumberOrdersResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveNumberOrder"></a>
# **retrieveNumberOrder**
> RetrieveNumberOrderResponse retrieveNumberOrder(numberOrderId)

Get a single phone number order

Get an existing single phone number order

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NumberOrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberOrdersApi apiInstance = new NumberOrdersApi();
String numberOrderId = "numberOrderId_example"; // String | The number order id
try {
    RetrieveNumberOrderResponse result = apiInstance.retrieveNumberOrder(numberOrderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberOrdersApi#retrieveNumberOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **numberOrderId** | **String**| The number order id |

### Return type

[**RetrieveNumberOrderResponse**](RetrieveNumberOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateNumberOrder"></a>
# **updateNumberOrder**
> UpdateNumberOrderResponse updateNumberOrder(body, numberOrderId)

Update phone number order

Updates a Phone Number Order

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NumberOrdersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberOrdersApi apiInstance = new NumberOrdersApi();
NumberOrder body = new NumberOrder(); // NumberOrder | 
String numberOrderId = "numberOrderId_example"; // String | The number order id
try {
    UpdateNumberOrderResponse result = apiInstance.updateNumberOrder(body, numberOrderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberOrdersApi#updateNumberOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NumberOrder**](NumberOrder.md)|  |
 **numberOrderId** | **String**| The number order id |

### Return type

[**UpdateNumberOrderResponse**](UpdateNumberOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

