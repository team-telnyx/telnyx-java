# MessagesApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLongCodeMessage**](MessagesApi.md#createLongCodeMessage) | **POST** /messages/long_code | Send a Long Code message
[**createMessage**](MessagesApi.md#createMessage) | **POST** /messages | Send a message
[**createNumberPoolMessage**](MessagesApi.md#createNumberPoolMessage) | **POST** /messages/number_pool | Send a message using Number Pool
[**createShortCodeMessage**](MessagesApi.md#createShortCodeMessage) | **POST** /messages/short_code | Send a Short Code message
[**retrieveMessage**](MessagesApi.md#retrieveMessage) | **GET** /messages/{id} | Retrieve a message

<a name="createLongCodeMessage"></a>
# **createLongCodeMessage**
> CreateMessageResponse createLongCodeMessage(body)

Send a Long Code message

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagesApi apiInstance = new MessagesApi();
NewLongCodeMessage body = new NewLongCodeMessage(); // NewLongCodeMessage | Message payload
try {
    CreateMessageResponse result = apiInstance.createLongCodeMessage(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#createLongCodeMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewLongCodeMessage**](NewLongCodeMessage.md)| Message payload | [optional]

### Return type

[**CreateMessageResponse**](CreateMessageResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createMessage"></a>
# **createMessage**
> CreateMessageResponse createMessage(body)

Send a message

Send a message with a Phone Number, Alphanumeric Sender ID, Short Code or Number Pool.  This endpoint allows you to send a message with any messaging resource. Current messaging resources include: long-code, short-code, number-pool, and alphanumeric-sender-id. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagesApi apiInstance = new MessagesApi();
NewMessage body = new NewMessage(); // NewMessage | Message payload
try {
    CreateMessageResponse result = apiInstance.createMessage(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#createMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewMessage**](NewMessage.md)| Message payload | [optional]

### Return type

[**CreateMessageResponse**](CreateMessageResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createNumberPoolMessage"></a>
# **createNumberPoolMessage**
> CreateMessageResponse createNumberPoolMessage(body)

Send a message using Number Pool

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagesApi apiInstance = new MessagesApi();
NewNumberPoolMessage body = new NewNumberPoolMessage(); // NewNumberPoolMessage | Message payload
try {
    CreateMessageResponse result = apiInstance.createNumberPoolMessage(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#createNumberPoolMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewNumberPoolMessage**](NewNumberPoolMessage.md)| Message payload | [optional]

### Return type

[**CreateMessageResponse**](CreateMessageResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createShortCodeMessage"></a>
# **createShortCodeMessage**
> CreateMessageResponse createShortCodeMessage(body)

Send a Short Code message

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagesApi apiInstance = new MessagesApi();
NewShortCodeMessage body = new NewShortCodeMessage(); // NewShortCodeMessage | Message payload
try {
    CreateMessageResponse result = apiInstance.createShortCodeMessage(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#createShortCodeMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewShortCodeMessage**](NewShortCodeMessage.md)| Message payload | [optional]

### Return type

[**CreateMessageResponse**](CreateMessageResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveMessage"></a>
# **retrieveMessage**
> RetrieveMessageResponse retrieveMessage(id)

Retrieve a message

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagesApi apiInstance = new MessagesApi();
UUID id = new UUID(); // UUID | The id of the message
try {
    RetrieveMessageResponse result = apiInstance.retrieveMessage(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#retrieveMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| The id of the message |

### Return type

[**RetrieveMessageResponse**](RetrieveMessageResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

