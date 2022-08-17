# PublicInternetGatewaysApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**publicInternetGatewayCreate**](PublicInternetGatewaysApi.md#publicInternetGatewayCreate) | **POST** /public_internet_gateways | Create a Public Internet Gateway
[**publicInternetGatewayDelete**](PublicInternetGatewaysApi.md#publicInternetGatewayDelete) | **DELETE** /public_internet_gateways/{id} | Delete a Public Internet Gateway
[**publicInternetGatewayGet**](PublicInternetGatewaysApi.md#publicInternetGatewayGet) | **GET** /public_internet_gateways/{id} | Retrieve a Public Internet Gateway
[**publicInternetGatewayList**](PublicInternetGatewaysApi.md#publicInternetGatewayList) | **GET** /public_internet_gateways | List all Public Internet Gateways



## publicInternetGatewayCreate

> PublicInternetGatewayCreate202Response publicInternetGatewayCreate(publicInternetGatewayCreate)

Create a Public Internet Gateway

Create a new Public Internet Gateway.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PublicInternetGatewaysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PublicInternetGatewaysApi apiInstance = new PublicInternetGatewaysApi(defaultClient);
        PublicInternetGatewayCreate publicInternetGatewayCreate = new PublicInternetGatewayCreate(); // PublicInternetGatewayCreate | 
        try {
            PublicInternetGatewayCreate202Response result = apiInstance.publicInternetGatewayCreate(publicInternetGatewayCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PublicInternetGatewaysApi#publicInternetGatewayCreate");
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
 **publicInternetGatewayCreate** | [**PublicInternetGatewayCreate**](PublicInternetGatewayCreate.md)|  |

### Return type

[**PublicInternetGatewayCreate202Response**](PublicInternetGatewayCreate202Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful response |  -  |
| **422** | Unprocessable entity. Check the &#39;detail&#39; field in response for details. |  -  |
| **0** | Unexpected error |  -  |


## publicInternetGatewayDelete

> PublicInternetGatewayCreate202Response publicInternetGatewayDelete(id)

Delete a Public Internet Gateway

Delete a Public Internet Gateway.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PublicInternetGatewaysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PublicInternetGatewaysApi apiInstance = new PublicInternetGatewaysApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            PublicInternetGatewayCreate202Response result = apiInstance.publicInternetGatewayDelete(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PublicInternetGatewaysApi#publicInternetGatewayDelete");
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
 **id** | **UUID**| Identifies the resource. |

### Return type

[**PublicInternetGatewayCreate202Response**](PublicInternetGatewayCreate202Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Unexpected error |  -  |


## publicInternetGatewayGet

> PublicInternetGatewayCreate202Response publicInternetGatewayGet(id)

Retrieve a Public Internet Gateway

Retrieve a Public Internet Gateway.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PublicInternetGatewaysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PublicInternetGatewaysApi apiInstance = new PublicInternetGatewaysApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            PublicInternetGatewayCreate202Response result = apiInstance.publicInternetGatewayGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PublicInternetGatewaysApi#publicInternetGatewayGet");
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
 **id** | **UUID**| Identifies the resource. |

### Return type

[**PublicInternetGatewayCreate202Response**](PublicInternetGatewayCreate202Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Unexpected error |  -  |


## publicInternetGatewayList

> PublicInternetGatewayList200Response publicInternetGatewayList(pageNumber, pageSize, filterNetworkId)

List all Public Internet Gateways

List all Public Internet Gateways.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PublicInternetGatewaysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PublicInternetGatewaysApi apiInstance = new PublicInternetGatewaysApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterNetworkId = "6a09cdc3-8948-47f0-aa62-74ac943d6c58"; // String | The associated network id to filter on.
        try {
            PublicInternetGatewayList200Response result = apiInstance.publicInternetGatewayList(pageNumber, pageSize, filterNetworkId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PublicInternetGatewaysApi#publicInternetGatewayList");
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
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]
 **filterNetworkId** | **String**| The associated network id to filter on. | [optional]

### Return type

[**PublicInternetGatewayList200Response**](PublicInternetGatewayList200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Unexpected error |  -  |

