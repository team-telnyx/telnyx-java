# PrivateWirelessGatewaysApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPrivateWirelessGateway**](PrivateWirelessGatewaysApi.md#createPrivateWirelessGateway) | **POST** /private_wireless_gateways | Create a Private Wireless Gateway
[**deleteWirelessGateway**](PrivateWirelessGatewaysApi.md#deleteWirelessGateway) | **DELETE** /private_wireless_gateways/{id} | Delete a Private Wireless Gateway
[**getPrivateWirelessGateway**](PrivateWirelessGatewaysApi.md#getPrivateWirelessGateway) | **GET** /private_wireless_gateways/{id} | Get a Private Wireless Gateway
[**getPrivateWirelessGateways**](PrivateWirelessGatewaysApi.md#getPrivateWirelessGateways) | **GET** /private_wireless_gateways | Get all Private Wireless Gateways



## createPrivateWirelessGateway

> CreatePrivateWirelessGateway202Response createPrivateWirelessGateway(createPrivateWirelessGatewayRequest)

Create a Private Wireless Gateway

Asynchronously create a Private Wireless Gateway for SIM cards for a previously created network. This operation may take several minutes so you can check the Private Wireless Gateway status at the section Get a Private Wireless Gateway.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PrivateWirelessGatewaysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PrivateWirelessGatewaysApi apiInstance = new PrivateWirelessGatewaysApi(defaultClient);
        CreatePrivateWirelessGatewayRequest createPrivateWirelessGatewayRequest = new CreatePrivateWirelessGatewayRequest(); // CreatePrivateWirelessGatewayRequest | 
        try {
            CreatePrivateWirelessGateway202Response result = apiInstance.createPrivateWirelessGateway(createPrivateWirelessGatewayRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivateWirelessGatewaysApi#createPrivateWirelessGateway");
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
 **createPrivateWirelessGatewayRequest** | [**CreatePrivateWirelessGatewayRequest**](CreatePrivateWirelessGatewayRequest.md)|  |

### Return type

[**CreatePrivateWirelessGateway202Response**](CreatePrivateWirelessGateway202Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Response |  -  |
| **422** | Unprocessable entity. Check the &#39;detail&#39; field in response for details. |  -  |
| **0** | Unexpected error |  -  |


## deleteWirelessGateway

> GetPrivateWirelessGateway200Response deleteWirelessGateway(id)

Delete a Private Wireless Gateway

Deletes the Private Wireless Gateway.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PrivateWirelessGatewaysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PrivateWirelessGatewaysApi apiInstance = new PrivateWirelessGatewaysApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the private wireless gateway.
        try {
            GetPrivateWirelessGateway200Response result = apiInstance.deleteWirelessGateway(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivateWirelessGatewaysApi#deleteWirelessGateway");
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
 **id** | **UUID**| Identifies the private wireless gateway. |

### Return type

[**GetPrivateWirelessGateway200Response**](GetPrivateWirelessGateway200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Resource not found |  -  |
| **0** | Unexpected error |  -  |


## getPrivateWirelessGateway

> GetPrivateWirelessGateway200Response getPrivateWirelessGateway(id)

Get a Private Wireless Gateway

Retrieve information about a Private Wireless Gateway.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PrivateWirelessGatewaysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PrivateWirelessGatewaysApi apiInstance = new PrivateWirelessGatewaysApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the private wireless gateway.
        try {
            GetPrivateWirelessGateway200Response result = apiInstance.getPrivateWirelessGateway(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivateWirelessGatewaysApi#getPrivateWirelessGateway");
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
 **id** | **UUID**| Identifies the private wireless gateway. |

### Return type

[**GetPrivateWirelessGateway200Response**](GetPrivateWirelessGateway200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **404** | Resource not found |  -  |
| **0** | Unexpected error |  -  |


## getPrivateWirelessGateways

> GetPrivateWirelessGateways200Response getPrivateWirelessGateways(pageNumber, pageSize, filterName, filterIpRange, filterRegionCode, filterCreatedAt, filterUpdatedAt)

Get all Private Wireless Gateways

Get all Private Wireless Gateways belonging to the user.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PrivateWirelessGatewaysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PrivateWirelessGatewaysApi apiInstance = new PrivateWirelessGatewaysApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterName = "my private gateway"; // String | The name of the Private Wireless Gateway.
        String filterIpRange = "192.168.0.0/24"; // String | The IP address range of the Private Wireless Gateway.
        String filterRegionCode = "dc2"; // String | The name of the region where the Private Wireless Gateway is deployed.
        String filterCreatedAt = "2018-02-02T22:25:27.521Z"; // String | Private Wireless Gateway resource creation date.
        String filterUpdatedAt = "2018-02-02T22:25:27.521Z"; // String | When the Private Wireless Gateway was last updated.
        try {
            GetPrivateWirelessGateways200Response result = apiInstance.getPrivateWirelessGateways(pageNumber, pageSize, filterName, filterIpRange, filterRegionCode, filterCreatedAt, filterUpdatedAt);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivateWirelessGatewaysApi#getPrivateWirelessGateways");
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
 **filterName** | **String**| The name of the Private Wireless Gateway. | [optional]
 **filterIpRange** | **String**| The IP address range of the Private Wireless Gateway. | [optional]
 **filterRegionCode** | **String**| The name of the region where the Private Wireless Gateway is deployed. | [optional]
 **filterCreatedAt** | **String**| Private Wireless Gateway resource creation date. | [optional]
 **filterUpdatedAt** | **String**| When the Private Wireless Gateway was last updated. | [optional]

### Return type

[**GetPrivateWirelessGateways200Response**](GetPrivateWirelessGateways200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |

