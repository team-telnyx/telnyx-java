# WireGuardInterfacesApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWireguardInterface**](WireGuardInterfacesApi.md#createWireguardInterface) | **POST** /wireguard_interfaces | Create a WireGuard Interface
[**createWireguardPeer**](WireGuardInterfacesApi.md#createWireguardPeer) | **POST** /wireguard_peers | Create a WireGuard Peer
[**deleteWireguardInterface**](WireGuardInterfacesApi.md#deleteWireguardInterface) | **DELETE** /wireguard_interfaces/{id} | Delete a WireGuard Interface
[**deleteWireguardPeer**](WireGuardInterfacesApi.md#deleteWireguardPeer) | **DELETE** /wireguard_peers/{id} | Delete the WireGuard Peer
[**getWireguardInterface**](WireGuardInterfacesApi.md#getWireguardInterface) | **GET** /wireguard_interfaces/{id} | Retrieve a WireGuard Interfaces
[**getWireguardPeer**](WireGuardInterfacesApi.md#getWireguardPeer) | **GET** /wireguard_peers/{id} | Retrieve the WireGuard Peer
[**getWireguardPeerAllowedIp**](WireGuardInterfacesApi.md#getWireguardPeerAllowedIp) | **GET** /wireguard_peers/{id}/allowed_ips/{child_id} | Retrieve the Allowed IP
[**getWireguardPeerConfig**](WireGuardInterfacesApi.md#getWireguardPeerConfig) | **GET** /wireguard_peers/{id}/config | Retrieve Wireguard config template for Peer
[**listWireguardInterfaces**](WireGuardInterfacesApi.md#listWireguardInterfaces) | **GET** /wireguard_interfaces | List all WireGuard Interfaces
[**listWireguardPeerAllowedIps**](WireGuardInterfacesApi.md#listWireguardPeerAllowedIps) | **GET** /wireguard_peers/{id}/allowed_ips | List all Allowed IPs for a WireGuard Peer
[**listWireguardPeers**](WireGuardInterfacesApi.md#listWireguardPeers) | **GET** /wireguard_peers | List all WireGuard Peers
[**updateWireguardPeer**](WireGuardInterfacesApi.md#updateWireguardPeer) | **PATCH** /wireguard_peers/{id} | Update the WireGuard Peer



## createWireguardInterface

> CreateWireguardInterface202Response createWireguardInterface(wireguardInterfaceCreate)

Create a WireGuard Interface

Create a new WireGuard Interface. Current limitation of 10 interfaces per user can be created.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WireGuardInterfacesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WireGuardInterfacesApi apiInstance = new WireGuardInterfacesApi(defaultClient);
        WireguardInterfaceCreate wireguardInterfaceCreate = new WireguardInterfaceCreate(); // WireguardInterfaceCreate | 
        try {
            CreateWireguardInterface202Response result = apiInstance.createWireguardInterface(wireguardInterfaceCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WireGuardInterfacesApi#createWireguardInterface");
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
 **wireguardInterfaceCreate** | [**WireguardInterfaceCreate**](WireguardInterfaceCreate.md)|  |

### Return type

[**CreateWireguardInterface202Response**](CreateWireguardInterface202Response.md)

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


## createWireguardPeer

> CreateWireguardPeer202Response createWireguardPeer(id, wireguardPeerCreate)

Create a WireGuard Peer

Create a new WireGuard Peer. Current limitation of 5 peers per interface can be created.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WireGuardInterfacesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WireGuardInterfacesApi apiInstance = new WireGuardInterfacesApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        WireguardPeerCreate wireguardPeerCreate = new WireguardPeerCreate(); // WireguardPeerCreate | 
        try {
            CreateWireguardPeer202Response result = apiInstance.createWireguardPeer(id, wireguardPeerCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WireGuardInterfacesApi#createWireguardPeer");
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
 **wireguardPeerCreate** | [**WireguardPeerCreate**](WireguardPeerCreate.md)|  |

### Return type

[**CreateWireguardPeer202Response**](CreateWireguardPeer202Response.md)

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


## deleteWireguardInterface

> CreateWireguardInterface202Response deleteWireguardInterface(id)

Delete a WireGuard Interface

Delete a WireGuard Interface.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WireGuardInterfacesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WireGuardInterfacesApi apiInstance = new WireGuardInterfacesApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            CreateWireguardInterface202Response result = apiInstance.deleteWireguardInterface(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WireGuardInterfacesApi#deleteWireguardInterface");
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

[**CreateWireguardInterface202Response**](CreateWireguardInterface202Response.md)

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


## deleteWireguardPeer

> CreateWireguardPeer202Response deleteWireguardPeer(id)

Delete the WireGuard Peer

Delete the WireGuard peer.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WireGuardInterfacesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WireGuardInterfacesApi apiInstance = new WireGuardInterfacesApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            CreateWireguardPeer202Response result = apiInstance.deleteWireguardPeer(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WireGuardInterfacesApi#deleteWireguardPeer");
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

[**CreateWireguardPeer202Response**](CreateWireguardPeer202Response.md)

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


## getWireguardInterface

> CreateWireguardInterface202Response getWireguardInterface(id)

Retrieve a WireGuard Interfaces

Retrieve a WireGuard Interfaces.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WireGuardInterfacesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WireGuardInterfacesApi apiInstance = new WireGuardInterfacesApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            CreateWireguardInterface202Response result = apiInstance.getWireguardInterface(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WireGuardInterfacesApi#getWireguardInterface");
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

[**CreateWireguardInterface202Response**](CreateWireguardInterface202Response.md)

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


## getWireguardPeer

> CreateWireguardPeer202Response getWireguardPeer(id)

Retrieve the WireGuard Peer

Retrieve the WireGuard peer.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WireGuardInterfacesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WireGuardInterfacesApi apiInstance = new WireGuardInterfacesApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            CreateWireguardPeer202Response result = apiInstance.getWireguardPeer(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WireGuardInterfacesApi#getWireguardPeer");
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

[**CreateWireguardPeer202Response**](CreateWireguardPeer202Response.md)

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


## getWireguardPeerAllowedIp

> GetWireguardPeerAllowedIp200Response getWireguardPeerAllowedIp(id, childId)

Retrieve the Allowed IP

Retrieve the Allowed IP.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WireGuardInterfacesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WireGuardInterfacesApi apiInstance = new WireGuardInterfacesApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        UUID childId = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the child resource
        try {
            GetWireguardPeerAllowedIp200Response result = apiInstance.getWireguardPeerAllowedIp(id, childId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WireGuardInterfacesApi#getWireguardPeerAllowedIp");
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
 **childId** | **UUID**| Identifies the child resource |

### Return type

[**GetWireguardPeerAllowedIp200Response**](GetWireguardPeerAllowedIp200Response.md)

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


## getWireguardPeerConfig

> String getWireguardPeerConfig(id)

Retrieve Wireguard config template for Peer

Retrieve Wireguard config template for Peer

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WireGuardInterfacesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WireGuardInterfacesApi apiInstance = new WireGuardInterfacesApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            String result = apiInstance.getWireguardPeerConfig(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WireGuardInterfacesApi#getWireguardPeerConfig");
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

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain; charset=utf-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Unexpected error |  -  |


## listWireguardInterfaces

> ListWireguardInterfaces200Response listWireguardInterfaces(pageNumber, pageSize, filterNetworkId)

List all WireGuard Interfaces

List all WireGuard Interfaces.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WireGuardInterfacesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WireGuardInterfacesApi apiInstance = new WireGuardInterfacesApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterNetworkId = "6a09cdc3-8948-47f0-aa62-74ac943d6c58"; // String | The associated network id to filter on.
        try {
            ListWireguardInterfaces200Response result = apiInstance.listWireguardInterfaces(pageNumber, pageSize, filterNetworkId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WireGuardInterfacesApi#listWireguardInterfaces");
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

[**ListWireguardInterfaces200Response**](ListWireguardInterfaces200Response.md)

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


## listWireguardPeerAllowedIps

> ListWireguardPeerAllowedIps200Response listWireguardPeerAllowedIps(id, pageNumber, pageSize)

List all Allowed IPs for a WireGuard Peer

List all Allowed IPs for a WireGuard peer.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WireGuardInterfacesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WireGuardInterfacesApi apiInstance = new WireGuardInterfacesApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListWireguardPeerAllowedIps200Response result = apiInstance.listWireguardPeerAllowedIps(id, pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WireGuardInterfacesApi#listWireguardPeerAllowedIps");
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
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

[**ListWireguardPeerAllowedIps200Response**](ListWireguardPeerAllowedIps200Response.md)

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


## listWireguardPeers

> ListWireguardPeers200Response listWireguardPeers(id, pageNumber, pageSize, filterWireguardInterfaceId)

List all WireGuard Peers

List all WireGuard peers.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WireGuardInterfacesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WireGuardInterfacesApi apiInstance = new WireGuardInterfacesApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        UUID filterWireguardInterfaceId = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | The id of the associated WireGuard interface to filter on.
        try {
            ListWireguardPeers200Response result = apiInstance.listWireguardPeers(id, pageNumber, pageSize, filterWireguardInterfaceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WireGuardInterfacesApi#listWireguardPeers");
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
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]
 **filterWireguardInterfaceId** | **UUID**| The id of the associated WireGuard interface to filter on. | [optional]

### Return type

[**ListWireguardPeers200Response**](ListWireguardPeers200Response.md)

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


## updateWireguardPeer

> CreateWireguardPeer202Response updateWireguardPeer(id, wireguardPeerPatch)

Update the WireGuard Peer

Update the WireGuard peer.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WireGuardInterfacesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WireGuardInterfacesApi apiInstance = new WireGuardInterfacesApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        WireguardPeerPatch wireguardPeerPatch = new WireguardPeerPatch(); // WireguardPeerPatch | 
        try {
            CreateWireguardPeer202Response result = apiInstance.updateWireguardPeer(id, wireguardPeerPatch);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WireGuardInterfacesApi#updateWireguardPeer");
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
 **wireguardPeerPatch** | [**WireguardPeerPatch**](WireguardPeerPatch.md)|  |

### Return type

[**CreateWireguardPeer202Response**](CreateWireguardPeer202Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **422** | Unprocessable entity. Check the &#39;detail&#39; field in response for details. |  -  |
| **0** | Unexpected error |  -  |

