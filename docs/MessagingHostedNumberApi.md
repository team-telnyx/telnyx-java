# MessagingHostedNumberApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMessagingHostedNumberOrder**](MessagingHostedNumberApi.md#createMessagingHostedNumberOrder) | **POST** /messaging_hosted_number_orders | Create a messaging hosted number order
[**deleteMessagingHostedNumber**](MessagingHostedNumberApi.md#deleteMessagingHostedNumber) | **DELETE** /messaging_hosted_numbers/{id} | Delete a messaging hosted number
[**listMessagingHostedNumberOrder**](MessagingHostedNumberApi.md#listMessagingHostedNumberOrder) | **GET** /messaging_hosted_number_orders | List messaging hosted number orders
[**retrieveMessagingHostedNumberOrder**](MessagingHostedNumberApi.md#retrieveMessagingHostedNumberOrder) | **GET** /messaging_hosted_number_orders/{id} | Retrieve a messaging hosted number order
[**uploadFileMessagingHostedNumberOrder**](MessagingHostedNumberApi.md#uploadFileMessagingHostedNumberOrder) | **POST** /messaging_hosted_number_orders/{id}/actions/file_upload | Upload file required for a messaging hosted number order

<a name="createMessagingHostedNumberOrder"></a>
# **createMessagingHostedNumberOrder**
> RetrieveMessagingHostedNumberOrderResponse createMessagingHostedNumberOrder(body)

Create a messaging hosted number order

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.MessagingHostedNumberApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagingHostedNumberApi apiInstance = new MessagingHostedNumberApi();
CreateMessagingHostedNumberOrderRequest body = new CreateMessagingHostedNumberOrderRequest(); // CreateMessagingHostedNumberOrderRequest | Message payload
try {
    RetrieveMessagingHostedNumberOrderResponse result = apiInstance.createMessagingHostedNumberOrder(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingHostedNumberApi#createMessagingHostedNumberOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateMessagingHostedNumberOrderRequest**](CreateMessagingHostedNumberOrderRequest.md)| Message payload | [optional]

### Return type

[**RetrieveMessagingHostedNumberOrderResponse**](RetrieveMessagingHostedNumberOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMessagingHostedNumber"></a>
# **deleteMessagingHostedNumber**
> RetrieveMessagingHostedNumberResponse deleteMessagingHostedNumber(id)

Delete a messaging hosted number

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.MessagingHostedNumberApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagingHostedNumberApi apiInstance = new MessagingHostedNumberApi();
String id = "id_example"; // String | Identifies the type of resource.
try {
    RetrieveMessagingHostedNumberResponse result = apiInstance.deleteMessagingHostedNumber(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingHostedNumberApi#deleteMessagingHostedNumber");
    e.printStackTrace();
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

<a name="listMessagingHostedNumberOrder"></a>
# **listMessagingHostedNumberOrder**
> ListMessagingHostedNumberOrderResponse listMessagingHostedNumberOrder()

List messaging hosted number orders

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.MessagingHostedNumberApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagingHostedNumberApi apiInstance = new MessagingHostedNumberApi();
try {
    ListMessagingHostedNumberOrderResponse result = apiInstance.listMessagingHostedNumberOrder();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingHostedNumberApi#listMessagingHostedNumberOrder");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListMessagingHostedNumberOrderResponse**](ListMessagingHostedNumberOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveMessagingHostedNumberOrder"></a>
# **retrieveMessagingHostedNumberOrder**
> RetrieveMessagingHostedNumberOrderResponse retrieveMessagingHostedNumberOrder(id)

Retrieve a messaging hosted number order

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.MessagingHostedNumberApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagingHostedNumberApi apiInstance = new MessagingHostedNumberApi();
String id = "id_example"; // String | Identifies the type of resource.
try {
    RetrieveMessagingHostedNumberOrderResponse result = apiInstance.retrieveMessagingHostedNumberOrder(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingHostedNumberApi#retrieveMessagingHostedNumberOrder");
    e.printStackTrace();
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

<a name="uploadFileMessagingHostedNumberOrder"></a>
# **uploadFileMessagingHostedNumberOrder**
> RetrieveMessagingHostedNumberOrderResponse uploadFileMessagingHostedNumberOrder(id, loa, bill)

Upload file required for a messaging hosted number order

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.MessagingHostedNumberApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagingHostedNumberApi apiInstance = new MessagingHostedNumberApi();
String id = "id_example"; // String | Identifies the type of resource.
File loa = new File("loa_example"); // File | 
File bill = new File("bill_example"); // File | 
try {
    RetrieveMessagingHostedNumberOrderResponse result = apiInstance.uploadFileMessagingHostedNumberOrder(id, loa, bill);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingHostedNumberApi#uploadFileMessagingHostedNumberOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifies the type of resource. |
 **loa** | **File**|  | [optional]
 **bill** | **File**|  | [optional]

### Return type

[**RetrieveMessagingHostedNumberOrderResponse**](RetrieveMessagingHostedNumberOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

