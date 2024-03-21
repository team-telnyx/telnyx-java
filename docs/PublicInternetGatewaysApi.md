# PublicInternetGatewaysApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPublicInternetGateway**](PublicInternetGatewaysApi.md#createPublicInternetGateway) | **POST** /public_internet_gateways | Create a Public Internet Gateway
[**deletePublicInternetGateway**](PublicInternetGatewaysApi.md#deletePublicInternetGateway) | **DELETE** /public_internet_gateways/{id} | Delete a Public Internet Gateway
[**getPublicInternetGateway**](PublicInternetGatewaysApi.md#getPublicInternetGateway) | **GET** /public_internet_gateways/{id} | Retrieve a Public Internet Gateway
[**listPublicInternetGateways**](PublicInternetGatewaysApi.md#listPublicInternetGateways) | **GET** /public_internet_gateways | List all Public Internet Gateways



## createPublicInternetGateway

> CreatePublicInternetGateway202Response createPublicInternetGateway(publicInternetGatewayCreate)

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
            CreatePublicInternetGateway202Response result = apiInstance.createPublicInternetGateway(publicInternetGatewayCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PublicInternetGatewaysApi#createPublicInternetGateway");
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

[**CreatePublicInternetGateway202Response**](CreatePublicInternetGateway202Response.md)

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


## deletePublicInternetGateway

> CreatePublicInternetGateway202Response deletePublicInternetGateway(id)

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
            CreatePublicInternetGateway202Response result = apiInstance.deletePublicInternetGateway(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PublicInternetGatewaysApi#deletePublicInternetGateway");
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

[**CreatePublicInternetGateway202Response**](CreatePublicInternetGateway202Response.md)

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


## getPublicInternetGateway

> CreatePublicInternetGateway202Response getPublicInternetGateway(id)

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
            CreatePublicInternetGateway202Response result = apiInstance.getPublicInternetGateway(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PublicInternetGatewaysApi#getPublicInternetGateway");
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

[**CreatePublicInternetGateway202Response**](CreatePublicInternetGateway202Response.md)

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


## listPublicInternetGateways

> ListPublicInternetGateways200Response listPublicInternetGateways(pageNumber, pageSize, filterNetworkId)

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
            ListPublicInternetGateways200Response result = apiInstance.listPublicInternetGateways(pageNumber, pageSize, filterNetworkId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PublicInternetGatewaysApi#listPublicInternetGateways");
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

[**ListPublicInternetGateways200Response**](ListPublicInternetGateways200Response.md)

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

