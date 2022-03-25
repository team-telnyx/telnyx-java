# MessagesApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLongCodeMessage**](MessagesApi.md#createLongCodeMessage) | **POST** /messages/long_code | Send a long code message
[**createMessage**](MessagesApi.md#createMessage) | **POST** /messages | Send a message
[**createNumberPoolMessage**](MessagesApi.md#createNumberPoolMessage) | **POST** /messages/number_pool | Send a message using number pool
[**createShortCodeMessage**](MessagesApi.md#createShortCodeMessage) | **POST** /messages/short_code | Send a short code message
[**retrieveMessage**](MessagesApi.md#retrieveMessage) | **GET** /messages/{id} | Retrieve a message



## createLongCodeMessage

> MessageResponse createLongCodeMessage(createLongCodeMessageRequest)

Send a long code message

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MessagesApi;

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
            MessageResponse result = apiInstance.createLongCodeMessage(createLongCodeMessageRequest);
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
| **200** | Successful response with details about a message. |  -  |
| **0** | Unexpected error |  -  |


## createMessage

> MessageResponse createMessage(createMessageRequest)

Send a message

Send a message with a Phone Number, Alphanumeric Sender ID, Short Code or Number Pool.

This endpoint allows you to send a message with any messaging resource.
Current messaging resources include: long-code, short-code, number-pool, and
alphanumeric-sender-id.


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MessagesApi;

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
            MessageResponse result = apiInstance.createMessage(createMessageRequest);
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
| **200** | Successful response with details about a message. |  -  |
| **0** | Unexpected error |  -  |


## createNumberPoolMessage

> MessageResponse createNumberPoolMessage(createNumberPoolMessageRequest)

Send a message using number pool

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MessagesApi;

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
            MessageResponse result = apiInstance.createNumberPoolMessage(createNumberPoolMessageRequest);
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
| **200** | Successful response with details about a message. |  -  |
| **0** | Unexpected error |  -  |


## createShortCodeMessage

> MessageResponse createShortCodeMessage(createShortCodeMessageRequest)

Send a short code message

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MessagesApi;

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
            MessageResponse result = apiInstance.createShortCodeMessage(createShortCodeMessageRequest);
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
| **200** | Successful response with details about a message. |  -  |
| **0** | Unexpected error |  -  |


## retrieveMessage

> MessageResponse retrieveMessage(id)

Retrieve a message

Note: This API endpoint can only retrieve messages that are no older than 10 days since their creation. If you require messages older than this, please generate an [MDR report.](https://developers.telnyx.com/docs/api/v1/reports/MDR-Reports)

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MessagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagesApi apiInstance = new MessagesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The id of the message
        try {
            MessageResponse result = apiInstance.retrieveMessage(id);
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
 **id** | **UUID**| The id of the message |

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
| **200** | Successful response with details about a message. |  -  |
| **0** | Unexpected error |  -  |

