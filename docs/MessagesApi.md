# MessagesApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLongCodeMessage**](MessagesApi.md#createLongCodeMessage) | **POST** /messages/long_code | Send a long code message
[**createMessage**](MessagesApi.md#createMessage) | **POST** /messages | Send a message
[**createNumberPoolMessage**](MessagesApi.md#createNumberPoolMessage) | **POST** /messages/number_pool | Send a message using number pool
[**createShortCodeMessage**](MessagesApi.md#createShortCodeMessage) | **POST** /messages/short_code | Send a short code message
[**retrieveMessage**](MessagesApi.md#retrieveMessage) | **GET** /messages/{id} | Retrieve a message

<a name="createLongCodeMessage"></a>
# **createLongCodeMessage**
> MessageResponse createLongCodeMessage(body)

Send a long code message

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagesApi apiInstance = new MessagesApi();
CreateLongCodeMessageRequest body = new CreateLongCodeMessageRequest(); // CreateLongCodeMessageRequest | Message payload
try {
    MessageResponse result = apiInstance.createLongCodeMessage(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#createLongCodeMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateLongCodeMessageRequest**](CreateLongCodeMessageRequest.md)| Message payload | [optional]

### Return type

[**MessageResponse**](MessageResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createMessage"></a>
# **createMessage**
> MessageResponse createMessage(body)

Send a message

Send a message with a Phone Number, Alphanumeric Sender ID, Short Code or Number Pool.  This endpoint allows you to send a message with any messaging resource. Current messaging resources include: long-code, short-code, number-pool, and alphanumeric-sender-id. 

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagesApi apiInstance = new MessagesApi();
CreateMessageRequest body = new CreateMessageRequest(); // CreateMessageRequest | Message payload
try {
    MessageResponse result = apiInstance.createMessage(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#createMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateMessageRequest**](CreateMessageRequest.md)| Message payload | [optional]

### Return type

[**MessageResponse**](MessageResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createNumberPoolMessage"></a>
# **createNumberPoolMessage**
> MessageResponse createNumberPoolMessage(body)

Send a message using number pool

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagesApi apiInstance = new MessagesApi();
CreateNumberPoolMessageRequest body = new CreateNumberPoolMessageRequest(); // CreateNumberPoolMessageRequest | Message payload
try {
    MessageResponse result = apiInstance.createNumberPoolMessage(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#createNumberPoolMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateNumberPoolMessageRequest**](CreateNumberPoolMessageRequest.md)| Message payload | [optional]

### Return type

[**MessageResponse**](MessageResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createShortCodeMessage"></a>
# **createShortCodeMessage**
> MessageResponse createShortCodeMessage(body)

Send a short code message

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagesApi apiInstance = new MessagesApi();
CreateShortCodeMessageRequest body = new CreateShortCodeMessageRequest(); // CreateShortCodeMessageRequest | Message payload
try {
    MessageResponse result = apiInstance.createShortCodeMessage(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#createShortCodeMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateShortCodeMessageRequest**](CreateShortCodeMessageRequest.md)| Message payload | [optional]

### Return type

[**MessageResponse**](MessageResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveMessage"></a>
# **retrieveMessage**
> MessageResponse retrieveMessage(id)

Retrieve a message

Note: This API endpoint can only retrieve messages that are no older than 10 days since their creation. If you require messages older than this, please generate an [MDR report.](https://developers.telnyx.com/docs/api/v1/reports/MDR-Reports)

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MessagesApi apiInstance = new MessagesApi();
UUID id = new UUID(); // UUID | The id of the message
try {
    MessageResponse result = apiInstance.retrieveMessage(id);
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

[**MessageResponse**](MessageResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

