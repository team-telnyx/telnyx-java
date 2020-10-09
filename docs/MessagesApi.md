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
> MessageResponse createLongCodeMessage().createLongCodeMessageRequest(createLongCodeMessageRequest).execute();

Send a long code message

### Example
```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.telnyx.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    CreateLongCodeMessageRequest createLongCodeMessageRequest = new CreateLongCodeMessageRequest(); // CreateLongCodeMessageRequest | Message payload
    try {
      MessageResponse result = apiInstance.createLongCodeMessage()
            .createLongCodeMessageRequest(createLongCodeMessageRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#createLongCodeMessage");
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
 **createLongCodeMessageRequest** | [**CreateLongCodeMessageRequest**](CreateLongCodeMessageRequest.md)| Message payload | [optional]

### Return type

[**MessageResponse**](MessageResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response with details about a message. |  -  |
**0** | Unexpected error |  -  |

<a name="createMessage"></a>
# **createMessage**
> MessageResponse createMessage().createMessageRequest(createMessageRequest).execute();

Send a message

Send a message with a Phone Number, Alphanumeric Sender ID, Short Code or Number Pool.  This endpoint allows you to send a message with any messaging resource. Current messaging resources include: long-code, short-code, number-pool, and alphanumeric-sender-id. 

### Example
```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.telnyx.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    CreateMessageRequest createMessageRequest = new CreateMessageRequest(); // CreateMessageRequest | Message payload
    try {
      MessageResponse result = apiInstance.createMessage()
            .createMessageRequest(createMessageRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#createMessage");
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
 **createMessageRequest** | [**CreateMessageRequest**](CreateMessageRequest.md)| Message payload | [optional]

### Return type

[**MessageResponse**](MessageResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response with details about a message. |  -  |
**0** | Unexpected error |  -  |

<a name="createNumberPoolMessage"></a>
# **createNumberPoolMessage**
> MessageResponse createNumberPoolMessage().createNumberPoolMessageRequest(createNumberPoolMessageRequest).execute();

Send a message using number pool

### Example
```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.telnyx.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    CreateNumberPoolMessageRequest createNumberPoolMessageRequest = new CreateNumberPoolMessageRequest(); // CreateNumberPoolMessageRequest | Message payload
    try {
      MessageResponse result = apiInstance.createNumberPoolMessage()
            .createNumberPoolMessageRequest(createNumberPoolMessageRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#createNumberPoolMessage");
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
 **createNumberPoolMessageRequest** | [**CreateNumberPoolMessageRequest**](CreateNumberPoolMessageRequest.md)| Message payload | [optional]

### Return type

[**MessageResponse**](MessageResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response with details about a message. |  -  |
**0** | Unexpected error |  -  |

<a name="createShortCodeMessage"></a>
# **createShortCodeMessage**
> MessageResponse createShortCodeMessage().createShortCodeMessageRequest(createShortCodeMessageRequest).execute();

Send a short code message

### Example
```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.telnyx.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    CreateShortCodeMessageRequest createShortCodeMessageRequest = new CreateShortCodeMessageRequest(); // CreateShortCodeMessageRequest | Message payload
    try {
      MessageResponse result = apiInstance.createShortCodeMessage()
            .createShortCodeMessageRequest(createShortCodeMessageRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#createShortCodeMessage");
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
 **createShortCodeMessageRequest** | [**CreateShortCodeMessageRequest**](CreateShortCodeMessageRequest.md)| Message payload | [optional]

### Return type

[**MessageResponse**](MessageResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response with details about a message. |  -  |
**0** | Unexpected error |  -  |

<a name="retrieveMessage"></a>
# **retrieveMessage**
> MessageResponse retrieveMessage(id).execute();

Retrieve a message

Note: This API endpoint can only retrieve messages that are no older than 10 days since their creation. If you require messages older than this, please generate an [MDR report.](https://developers.telnyx.com/docs/api/v1/reports/MDR-Reports)

### Example
```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.telnyx.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    UUID id = new UUID(); // UUID | The id of the message
    try {
      MessageResponse result = apiInstance.retrieveMessage(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#retrieveMessage");
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
 **id** | [**UUID**](.md)| The id of the message |

### Return type

[**MessageResponse**](MessageResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response with details about a message. |  -  |
**0** | Unexpected error |  -  |

