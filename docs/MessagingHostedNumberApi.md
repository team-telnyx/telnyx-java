# MessagingHostedNumberApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteMessagingHostedNumber**](MessagingHostedNumberApi.md#deleteMessagingHostedNumber) | **DELETE** /messaging_hosted_numbers/{id} | Delete Messaging Hosted Number
[**getMessagingHostedNumberOrder**](MessagingHostedNumberApi.md#getMessagingHostedNumberOrder) | **GET** /messaging_hosted_number_orders/{id} | Get Messaging Hosted Numbers Order Information
[**listMessagingHostedNumberOrder**](MessagingHostedNumberApi.md#listMessagingHostedNumberOrder) | **GET** /messaging_hosted_number_orders | List All Messaging Hosted Number Orders
[**newMessagingHostedNumberOrder**](MessagingHostedNumberApi.md#newMessagingHostedNumberOrder) | **POST** /messaging_hosted_number_orders | New Messaging Hosted Numbers Order
[**uploadFilesMessagingHostedNumberOrder**](MessagingHostedNumberApi.md#uploadFilesMessagingHostedNumberOrder) | **POST** /messaging_hosted_number_orders/{id}/actions/file_upload | Upload LOA and Bill required for a Messaging Hosted Number Order

<a name="deleteMessagingHostedNumber"></a>
# **deleteMessagingHostedNumber**
> RetrieveMessagingHostedNumberResponse deleteMessagingHostedNumber(id)

Delete Messaging Hosted Number

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MessagingHostedNumberApi;

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

<a name="getMessagingHostedNumberOrder"></a>
# **getMessagingHostedNumberOrder**
> RetrieveMessagingHostedNumberOrderResponse getMessagingHostedNumberOrder(id)

Get Messaging Hosted Numbers Order Information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MessagingHostedNumberApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagingHostedNumberApi apiInstance = new MessagingHostedNumberApi();
String id = "id_example"; // String | Identifies the type of resource.
try {
    RetrieveMessagingHostedNumberOrderResponse result = apiInstance.getMessagingHostedNumberOrder(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingHostedNumberApi#getMessagingHostedNumberOrder");
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

<a name="listMessagingHostedNumberOrder"></a>
# **listMessagingHostedNumberOrder**
> ListMessagingHostedNumberOrderResponse listMessagingHostedNumberOrder()

List All Messaging Hosted Number Orders

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MessagingHostedNumberApi;

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

<a name="newMessagingHostedNumberOrder"></a>
# **newMessagingHostedNumberOrder**
> RetrieveMessagingHostedNumberOrderResponse newMessagingHostedNumberOrder(body)

New Messaging Hosted Numbers Order

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MessagingHostedNumberApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagingHostedNumberApi apiInstance = new MessagingHostedNumberApi();
NewMessagingHostedNumberOrder body = new NewMessagingHostedNumberOrder(); // NewMessagingHostedNumberOrder | Message payload
try {
    RetrieveMessagingHostedNumberOrderResponse result = apiInstance.newMessagingHostedNumberOrder(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingHostedNumberApi#newMessagingHostedNumberOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewMessagingHostedNumberOrder**](NewMessagingHostedNumberOrder.md)| Message payload | [optional]

### Return type

[**RetrieveMessagingHostedNumberOrderResponse**](RetrieveMessagingHostedNumberOrderResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadFilesMessagingHostedNumberOrder"></a>
# **uploadFilesMessagingHostedNumberOrder**
> RetrieveMessagingHostedNumberOrderResponse uploadFilesMessagingHostedNumberOrder(id, loa, bill)

Upload LOA and Bill required for a Messaging Hosted Number Order

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MessagingHostedNumberApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagingHostedNumberApi apiInstance = new MessagingHostedNumberApi();
String id = "id_example"; // String | Identifies the type of resource.
File loa = new File("loa_example"); // File | 
File bill = new File("bill_example"); // File | 
try {
    RetrieveMessagingHostedNumberOrderResponse result = apiInstance.uploadFilesMessagingHostedNumberOrder(id, loa, bill);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagingHostedNumberApi#uploadFilesMessagingHostedNumberOrder");
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

